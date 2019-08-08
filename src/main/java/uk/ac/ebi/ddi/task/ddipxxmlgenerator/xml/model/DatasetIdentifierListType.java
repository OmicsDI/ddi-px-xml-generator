
package uk.ac.ebi.ddi.task.ddipxxmlgenerator.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * The list of identifiers associated with this dataset, not just the PXD identifier,
 * but possibly DOIs and other identifiers.
 *
 * <p>Java class for DatasetIdentifierListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DatasetIdentifierListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatasetIdentifier" type="{}DatasetIdentifierType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatasetIdentifierListType", propOrder = {
        "datasetIdentifier"
})
public class DatasetIdentifierListType
        implements Serializable, PXObject {

    private static final long serialVersionUID = 100L;
    @XmlElement(name = "DatasetIdentifier", required = true)
    private List<DatasetIdentifierType> datasetIdentifier;

    /**
     * Gets the value of the datasetIdentifier property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetIdentifier property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetIdentifier().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatasetIdentifierType }
     */
    public List<DatasetIdentifierType> getDatasetIdentifier() {
        if (datasetIdentifier == null) {
            datasetIdentifier = new ArrayList<>();
        }
        return this.datasetIdentifier;
    }

}
