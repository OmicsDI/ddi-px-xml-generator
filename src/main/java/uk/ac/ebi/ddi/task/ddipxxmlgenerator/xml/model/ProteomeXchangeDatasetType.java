
package uk.ac.ebi.ddi.task.ddipxxmlgenerator.xml.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * Top-level element for a ProteomeXchange XML document describing a dataset.
 *
 * <p>Java class for ProteomeXchangeDatasetType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ProteomeXchangeDatasetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CvList" type="{}CvListType"/>
 *         &lt;element name="ChangeLog" type="{}ChangeLogType" minOccurs="0"/>
 *         &lt;element name="DatasetSummary" type="{}DatasetSummaryType"/>
 *         &lt;element name="DatasetIdentifierList" type="{}DatasetIdentifierListType"/>
 *         &lt;element name="DatasetOriginList" type="{}DatasetOriginListType"/>
 *         &lt;element name="SpeciesList" type="{}SpeciesListType"/>
 *         &lt;element name="InstrumentList" type="{}InstrumentListType"/>
 *         &lt;element name="ModificationList" type="{}ModificationListType"/>
 *         &lt;element name="ContactList" type="{}ContactListType"/>
 *         &lt;element name="PublicationList" type="{}PublicationListType"/>
 *         &lt;element name="KeywordList" type="{}KeywordListType"/>
 *         &lt;element name="FullDatasetLinkList" type="{}FullDatasetLinkListType"/>
 *         &lt;element name="DatasetFileList" type="{}DatasetFileListType" minOccurs="0"/>
 *         &lt;element name="RepositoryRecordList" type="{}RepositoryRecordListType" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation" type="{}AdditionalInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="formatVersion" use="required" type="{}versionRegex" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProteomeXchangeDatasetType", propOrder = {
        "cvList",
        "changeLog",
        "datasetSummary",
        "datasetIdentifierList",
        "datasetOriginList",
        "speciesList",
        "instrumentList",
        "modificationList",
        "contactList",
        "publicationList",
        "keywordList",
        "fullDatasetLinkList",
        "datasetFileList",
        "repositoryRecordList",
        "additionalInformation"
})
public class ProteomeXchangeDatasetType
        implements Serializable, PXObject {

    private static final long serialVersionUID = 100L;
    @XmlElement(name = "CvList", required = true)
    private CvListType cvList;
    @XmlElement(name = "ChangeLog")
    private ChangeLogType changeLog;
    @XmlElement(name = "DatasetSummary", required = true)
    private DatasetSummaryType datasetSummary;
    @XmlElement(name = "DatasetIdentifierList", required = true)
    private DatasetIdentifierListType datasetIdentifierList;
    @XmlElement(name = "DatasetOriginList", required = true)
    private DatasetOriginListType datasetOriginList;
    @XmlElement(name = "SpeciesList", required = true)
    private SpeciesListType speciesList;
    @XmlElement(name = "InstrumentList", required = true)
    private InstrumentListType instrumentList;
    @XmlElement(name = "ModificationList", required = true)
    private ModificationListType modificationList;
    @XmlElement(name = "ContactList", required = true)
    private ContactListType contactList;
    @XmlElement(name = "PublicationList", required = true)
    private PublicationListType publicationList;
    @XmlElement(name = "KeywordList", required = true)
    private KeywordListType keywordList;
    @XmlElement(name = "FullDatasetLinkList", required = true)
    private FullDatasetLinkListType fullDatasetLinkList;
    @XmlElement(name = "DatasetFileList")
    private DatasetFileListType datasetFileList;
    @XmlElement(name = "RepositoryRecordList")
    private RepositoryRecordListType repositoryRecordList;
    @XmlElement(name = "AdditionalInformation")
    private AdditionalInformationType additionalInformation;
    @XmlAttribute(required = true)
    private String id;
    @XmlAttribute(required = true)
    private String formatVersion;

    /**
     * Gets the value of the cvList property.
     *
     * @return possible object is
     * {@link CvListType }
     */
    public CvListType getCvList() {
        return cvList;
    }

    /**
     * Sets the value of the cvList property.
     *
     * @param value allowed object is
     *              {@link CvListType }
     */
    public void setCvList(CvListType value) {
        this.cvList = value;
    }

    /**
     * Gets the value of the changeLog property.
     *
     * @return possible object is
     * {@link ChangeLogType }
     */
    public ChangeLogType getChangeLog() {
        return changeLog;
    }

    /**
     * Sets the value of the changeLog property.
     *
     * @param value allowed object is
     *              {@link ChangeLogType }
     */
    public void setChangeLog(ChangeLogType value) {
        this.changeLog = value;
    }

    /**
     * Gets the value of the datasetSummary property.
     *
     * @return possible object is
     * {@link DatasetSummaryType }
     */
    public DatasetSummaryType getDatasetSummary() {
        return datasetSummary;
    }

    /**
     * Sets the value of the datasetSummary property.
     *
     * @param value allowed object is
     *              {@link DatasetSummaryType }
     */
    public void setDatasetSummary(DatasetSummaryType value) {
        this.datasetSummary = value;
    }

    /**
     * Gets the value of the datasetIdentifierList property.
     *
     * @return possible object is
     * {@link DatasetIdentifierListType }
     */
    public DatasetIdentifierListType getDatasetIdentifierList() {
        return datasetIdentifierList;
    }

    /**
     * Sets the value of the datasetIdentifierList property.
     *
     * @param value allowed object is
     *              {@link DatasetIdentifierListType }
     */
    public void setDatasetIdentifierList(DatasetIdentifierListType value) {
        this.datasetIdentifierList = value;
    }

    /**
     * Gets the value of the datasetOriginList property.
     *
     * @return possible object is
     * {@link DatasetOriginListType }
     */
    public DatasetOriginListType getDatasetOriginList() {
        return datasetOriginList;
    }

    /**
     * Sets the value of the datasetOriginList property.
     *
     * @param value allowed object is
     *              {@link DatasetOriginListType }
     */
    public void setDatasetOriginList(DatasetOriginListType value) {
        this.datasetOriginList = value;
    }

    /**
     * Gets the value of the speciesList property.
     *
     * @return possible object is
     * {@link SpeciesListType }
     */
    public SpeciesListType getSpeciesList() {
        return speciesList;
    }

    /**
     * Sets the value of the speciesList property.
     *
     * @param value allowed object is
     *              {@link SpeciesListType }
     */
    public void setSpeciesList(SpeciesListType value) {
        this.speciesList = value;
    }

    /**
     * Gets the value of the instrumentList property.
     *
     * @return possible object is
     * {@link InstrumentListType }
     */
    public InstrumentListType getInstrumentList() {
        return instrumentList;
    }

    /**
     * Sets the value of the instrumentList property.
     *
     * @param value allowed object is
     *              {@link InstrumentListType }
     */
    public void setInstrumentList(InstrumentListType value) {
        this.instrumentList = value;
    }

    /**
     * Gets the value of the modificationList property.
     *
     * @return possible object is
     * {@link ModificationListType }
     */
    public ModificationListType getModificationList() {
        return modificationList;
    }

    /**
     * Sets the value of the modificationList property.
     *
     * @param value allowed object is
     *              {@link ModificationListType }
     */
    public void setModificationList(ModificationListType value) {
        this.modificationList = value;
    }

    /**
     * Gets the value of the contactList property.
     *
     * @return possible object is
     * {@link ContactListType }
     */
    public ContactListType getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     *
     * @param value allowed object is
     *              {@link ContactListType }
     */
    public void setContactList(ContactListType value) {
        this.contactList = value;
    }

    /**
     * Gets the value of the publicationList property.
     *
     * @return possible object is
     * {@link PublicationListType }
     */
    public PublicationListType getPublicationList() {
        return publicationList;
    }

    /**
     * Sets the value of the publicationList property.
     *
     * @param value allowed object is
     *              {@link PublicationListType }
     */
    public void setPublicationList(PublicationListType value) {
        this.publicationList = value;
    }

    /**
     * Gets the value of the keywordList property.
     *
     * @return possible object is
     * {@link KeywordListType }
     */
    public KeywordListType getKeywordList() {
        return keywordList;
    }

    /**
     * Sets the value of the keywordList property.
     *
     * @param value allowed object is
     *              {@link KeywordListType }
     */
    public void setKeywordList(KeywordListType value) {
        this.keywordList = value;
    }

    /**
     * Gets the value of the fullDatasetLinkList property.
     *
     * @return possible object is
     * {@link FullDatasetLinkListType }
     */
    public FullDatasetLinkListType getFullDatasetLinkList() {
        return fullDatasetLinkList;
    }

    /**
     * Sets the value of the fullDatasetLinkList property.
     *
     * @param value allowed object is
     *              {@link FullDatasetLinkListType }
     */
    public void setFullDatasetLinkList(FullDatasetLinkListType value) {
        this.fullDatasetLinkList = value;
    }

    /**
     * Gets the value of the datasetFileList property.
     *
     * @return possible object is
     * {@link DatasetFileListType }
     */
    public DatasetFileListType getDatasetFileList() {
        return datasetFileList;
    }

    /**
     * Sets the value of the datasetFileList property.
     *
     * @param value allowed object is
     *              {@link DatasetFileListType }
     */
    public void setDatasetFileList(DatasetFileListType value) {
        this.datasetFileList = value;
    }

    /**
     * Gets the value of the repositoryRecordList property.
     *
     * @return possible object is
     * {@link RepositoryRecordListType }
     */
    public RepositoryRecordListType getRepositoryRecordList() {
        return repositoryRecordList;
    }

    /**
     * Sets the value of the repositoryRecordList property.
     *
     * @param value allowed object is
     *              {@link RepositoryRecordListType }
     */
    public void setRepositoryRecordList(RepositoryRecordListType value) {
        this.repositoryRecordList = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     *
     * @return possible object is
     * {@link AdditionalInformationType }
     */
    public AdditionalInformationType getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     *
     * @param value allowed object is
     *              {@link AdditionalInformationType }
     */
    public void setAdditionalInformation(AdditionalInformationType value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the formatVersion property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFormatVersion() {
        return formatVersion;
    }

    /**
     * Sets the value of the formatVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFormatVersion(String value) {
        this.formatVersion = value;
    }

}
