package uk.ac.ebi.ddi.task.ddipxxmlgenerator.utils;

/**
 * @author ypriverol
 */
public class Constants {

    private Constants() {
    }

    /**
     * Ontology Terms Constants to be handle inside the system
     */
    public static final String TAXONOMY_ACCESSION = "MS:1001467";
    public static final String SPECIES_ACCESSION = "MS:1001469";
    public static final String SUBMITTER_ACCESSION = "MS:1002037";
    public static final String LABHEAD_ACCESSION = "MS:1002332";
    public static final String SUBMITTERKEY_ACCESSION = "MS:1001925";

    public static final String PRIDE_LINK = "MS:1001930";
    public static final String CURATORKEY_ACCESSION = "MS:1001926";
    public static final String MASSIVEURL_ACCESSION = "MS:1002488";
    public static final String PASSELURL_ACCESSION = "MS:1002420";
    public static final String JPOSTURL_ACCESSION = "MS:1002633";
    public static final String PUBMED_ACCESSION = "MS:1000879";
    public static final String FILE_TYPE_ACCESSION = "PRIDE:0000404";
    public static final String CONTACT_NAME = "MS:1000586";
    public static final String CONTACT_EMAIL = "MS:1000589";
    public static final String CONTACT_ORG = "MS:1000590";
    public static final String NO_MODIFICATIONS = "PRIDE:0000398";

    /**
     * Some keywords to be parse
     */
    public static final String SRM_KEYWORD = "SRM";

    public static final String PX_DESCRIPTION = "The ProteomeXchange Consortium has been set up to provide a " +
            "globally coordinated submission of mass spectrometry proteomics" +
            " data to the main existing proteomics repositories, and to encourage optimal data dissemination.";
    public static final String PX_DATABASE = "ProteomeXChange";

}
