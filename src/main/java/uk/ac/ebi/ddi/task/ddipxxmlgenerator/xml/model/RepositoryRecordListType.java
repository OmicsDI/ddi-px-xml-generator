
package uk.ac.ebi.ddi.task.ddipxxmlgenerator.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * The list of records as found in the repository the data was submitted to (for example PRIDE experiment records).
 *
 * <p>Java class for RepositoryRecordListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RepositoryRecordListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RepositoryRecord" type="{}RepositoryRecordType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositoryRecordListType", propOrder = {
        "repositoryRecord"
})
public class RepositoryRecordListType
        implements Serializable, PXObject {

    private static final long serialVersionUID = 100L;
    @XmlElement(name = "RepositoryRecord", required = true)
    private List<RepositoryRecordType> repositoryRecord;

    /**
     * Gets the value of the repositoryRecord property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repositoryRecord property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepositoryRecord().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepositoryRecordType }
     */
    public List<RepositoryRecordType> getRepositoryRecord() {
        if (repositoryRecord == null) {
            repositoryRecord = new ArrayList<>();
        }
        return this.repositoryRecord;
    }

}
