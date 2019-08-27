package uk.ac.ebi.ddi.task.ddipxxmlgenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.ac.ebi.ddi.ddifileservice.services.IFileSystem;
import uk.ac.ebi.ddi.ddifileservice.type.ConvertibleOutputStream;
import uk.ac.ebi.ddi.task.ddipxxmlgenerator.configuration.PxXmlGeneratorTaskProperties;
import uk.ac.ebi.ddi.task.ddipxxmlgenerator.services.ProteomeXchangeService;
import uk.ac.ebi.ddi.task.ddipxxmlgenerator.utils.Constants;
import uk.ac.ebi.ddi.xml.validator.parser.marshaller.OmicsDataMarshaller;
import uk.ac.ebi.ddi.xml.validator.parser.model.Database;
import uk.ac.ebi.ddi.xml.validator.parser.model.Entry;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class DdiPxXmlGeneratorApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(DdiPxXmlGeneratorApplication.class);

    @Autowired
    private ProteomeXchangeService pxService;

    @Autowired
    private PxXmlGeneratorTaskProperties taskProperties;

    @Autowired
    private IFileSystem fileSystem;

    public static void main(String[] args) {
        SpringApplication.run(DdiPxXmlGeneratorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        fileSystem.cleanDirectory(taskProperties.getOutputDir());
        AtomicInteger fileCount = new AtomicInteger(0);
        List<Entry> entries = new ArrayList<>();
        List<String> accessions = pxService.getAllDatasetAccessions(taskProperties.getDatabase());
        LOGGER.info("Total records to process: {}", accessions.size());
        for (String accession : accessions) {
            try {
                String dsContent = pxService.getDatasetContent(accession);
                if (dsContent == null) {
                    continue;
                }
                Entry dataset = pxService.transformDataset(dsContent, accession, taskProperties.getDatabase());
                if (dataset != null) {
                    entries.add(dataset);
                }
                if (entries.size() % taskProperties.getEntriesPerFile() == 0) {
                    writeDatasetsToFile(entries, accessions.size(), fileCount.getAndIncrement());
                }
            } catch (Exception e) {
                LOGGER.error("Exception occurred when processing dataset {}, ", accession, e);
            }
        }
        writeDatasetsToFile(entries, accessions.size(), fileCount.getAndIncrement());
    }

    private void writeDatasetsToFile(List<Entry> entries, int total, int fileCount) throws IOException {
        if (entries.size() < 1) {
            return;
        }

        String releaseDate = new SimpleDateFormat("yyyyMMdd").format(new Date());

        ConvertibleOutputStream outputStream = new ConvertibleOutputStream();
        try (Writer w = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8)) {
            OmicsDataMarshaller mm = new OmicsDataMarshaller();

            Database database = new Database();
            database.setDescription(Constants.PX_DESCRIPTION);
            database.setName(Constants.PX_DATABASE);
            database.setRelease(releaseDate);
            database.setEntries(entries);
            database.setEntryCount(total);
            mm.marshall(database, w);
        }

        String filePath = taskProperties.getOutputDir() + "/" + taskProperties.getPrefix() + fileCount + ".xml";
        LOGGER.info("Attempting to write data to {}", filePath);
        fileSystem.saveFile(outputStream, filePath);
        entries.clear();
    }
}
