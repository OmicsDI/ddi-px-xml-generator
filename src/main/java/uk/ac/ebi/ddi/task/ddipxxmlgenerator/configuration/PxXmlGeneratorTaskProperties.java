package uk.ac.ebi.ddi.task.ddipxxmlgenerator.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("px-generator")
public class PxXmlGeneratorTaskProperties {
    private int entriesPerFile = 100;
    private String prefix = "PX-";
    private String outputDir;
    private String database;

    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getEntriesPerFile() {
        return entriesPerFile;
    }

    public void setEntriesPerFile(int entriesPerFile) {
        this.entriesPerFile = entriesPerFile;
    }
}
