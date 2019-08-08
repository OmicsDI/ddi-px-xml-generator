
package uk.ac.ebi.ddi.task.ddipxxmlgenerator.xml.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * A record in the repository the data was submitted to corresponding to this dataset
 * (for an example PRIDE experiment record).
 *
 * <p>Java class for RepositoryRecordType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RepositoryRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceFileRef" type="{}RefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PublicationRef" type="{}RefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InstrumentRef" type="{}RefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SampleList" type="{}SampleListType" minOccurs="0"/>
 *         &lt;element name="ModificationList" type="{}ModificationListType" minOccurs="0"/>
 *         &lt;element name="AnnotationList" type="{}AdditionalInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recordID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repositoryID" use="required" type="{}HostingRepositoryType" />
 *       &lt;attribute name="uri" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositoryRecordType", propOrder = {
        "sourceFileRef",
        "publicationRef",
        "instrumentRef",
        "sampleList",
        "modificationList",
        "annotationList"
})
public class RepositoryRecordType
        implements Serializable, PXObject {

    private static final long serialVersionUID = 100L;
    @XmlElement(name = "SourceFileRef")
    private List<RefType> sourceFileRef;
    @XmlElement(name = "PublicationRef")
    private List<RefType> publicationRef;
    @XmlElement(name = "InstrumentRef")
    private List<RefType> instrumentRef;
    @XmlElement(name = "SampleList")
    private SampleListType sampleList;
    @XmlElement(name = "ModificationList")
    private ModificationListType modificationList;
    @XmlElement(name = "AnnotationList")
    private AdditionalInformationType annotationList;
    @XmlAttribute(required = true)
    private String name;
    @XmlAttribute
    private String label;
    @XmlAttribute(required = true)
    private String recordID;
    @XmlAttribute(required = true)
    private HostingRepositoryType repositoryID;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anyURI")
    private String uri;

    /**
     * Gets the value of the sourceFileRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceFileRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceFileRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefType }
     */
    public List<RefType> getSourceFileRef() {
        if (sourceFileRef == null) {
            sourceFileRef = new ArrayList<>();
        }
        return this.sourceFileRef;
    }

    /**
     * Gets the value of the publicationRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefType }
     */
    public List<RefType> getPublicationRef() {
        if (publicationRef == null) {
            publicationRef = new ArrayList<>();
        }
        return this.publicationRef;
    }

    /**
     * Gets the value of the instrumentRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrumentRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrumentRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefType }
     */
    public List<RefType> getInstrumentRef() {
        if (instrumentRef == null) {
            instrumentRef = new ArrayList<>();
        }
        return this.instrumentRef;
    }

    /**
     * Gets the value of the sampleList property.
     *
     * @return possible object is
     * {@link SampleListType }
     */
    public SampleListType getSampleList() {
        return sampleList;
    }

    /**
     * Sets the value of the sampleList property.
     *
     * @param value allowed object is
     *              {@link SampleListType }
     */
    public void setSampleList(SampleListType value) {
        this.sampleList = value;
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
     * Gets the value of the annotationList property.
     *
     * @return possible object is
     * {@link AdditionalInformationType }
     */
    public AdditionalInformationType getAnnotationList() {
        return annotationList;
    }

    /**
     * Sets the value of the annotationList property.
     *
     * @param value allowed object is
     *              {@link AdditionalInformationType }
     */
    public void setAnnotationList(AdditionalInformationType value) {
        this.annotationList = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the recordID property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRecordID() {
        return recordID;
    }

    /**
     * Sets the value of the recordID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRecordID(String value) {
        this.recordID = value;
    }

    /**
     * Gets the value of the repositoryID property.
     *
     * @return possible object is
     * {@link HostingRepositoryType }
     */
    public HostingRepositoryType getRepositoryID() {
        return repositoryID;
    }

    /**
     * Sets the value of the repositoryID property.
     *
     * @param value allowed object is
     *              {@link HostingRepositoryType }
     */
    public void setRepositoryID(HostingRepositoryType value) {
        this.repositoryID = value;
    }

    /**
     * Gets the value of the uri property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUri(String value) {
        this.uri = value;
    }

}
