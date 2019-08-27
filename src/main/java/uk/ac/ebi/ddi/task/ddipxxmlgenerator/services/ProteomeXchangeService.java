package uk.ac.ebi.ddi.task.ddipxxmlgenerator.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import uk.ac.ebi.ddi.api.readers.utils.Transformers;
import uk.ac.ebi.ddi.task.ddipxxmlgenerator.utils.ReaderPxXML;
import uk.ac.ebi.ddi.task.ddipxxmlgenerator.utils.RetryClient;
import uk.ac.ebi.ddi.task.ddipxxmlgenerator.xml.io.PxReader;
import uk.ac.ebi.ddi.xml.validator.parser.model.Entry;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ProteomeXchangeService extends RetryClient {

    private static final String PX_ENDPOINT = "http://proteomecentral.proteomexchange.org/cgi";

    private RestTemplate restTemplate = new RestTemplate();

    public List<String> getAllDatasetAccessions(String database) throws Exception {
        Pattern pattern = Pattern.compile("<Dataset_Identifier\\s+id=\"[^>]*GetDataset\\?ID=(PXD\\d+)");
        UriComponentsBuilder build = UriComponentsBuilder.fromHttpUrl(PX_ENDPOINT)
                .path("/GetDataset")
                .queryParam("filterstr", String.format("[Repos|contain|%s]", database))
                .queryParam("action", "advsearch")
                .queryParam("outputMode", "XML");
        ResponseEntity<String> res = execute(x -> restTemplate.getForEntity(build.build(false).toUri(), String.class));
        List<String> result = new ArrayList<>();
        if (res.getBody() != null) {
            Matcher matcher = pattern.matcher(res.getBody());
            while (matcher.find()) {
                result.add(matcher.group(1));
            }
        }
        return result;
    }

    public String getDatasetContent(String accession) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(PX_ENDPOINT)
                .path("/GetDataset")
                .queryParam("ID", accession)
                .queryParam("outputMode", "XML");
        try {
            ResponseEntity<String> res = restTemplate.getForEntity(builder.build().toUri(), String.class);
            if (res.getBody() == null || !ReaderPxXML.isDataset(res.getBody())) {
                return null;
            }
            return res.getBody();

        } catch (HttpClientErrorException e) {
            if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
                return null;
            }
            throw e;
        }
    }

    public Entry transformDataset(String datasetContent, String accession, String database) throws Exception {
        PxReader dataset = ReaderPxXML.parseDocument(datasetContent);
        if (dataset != null && dataset.getRepository().equalsIgnoreCase(database)) {
            dataset.setAccession(accession);
            return Transformers.transformAPIDatasetToEntry(dataset);
        }
        return null;
    }
}
