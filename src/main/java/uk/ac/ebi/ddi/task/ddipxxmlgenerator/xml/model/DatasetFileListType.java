
package uk.ac.ebi.ddi.task.ddipxxmlgenerator.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * The list of ALL files comprising this ProteomeXchange submission.
 *
 * <p>Java class for DatasetFileListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DatasetFileListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatasetFile" type="{}DatasetFileType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatasetFileListType", propOrder = {
        "datasetFile"
})
public class DatasetFileListType
        implements Serializable, PXObject {

    private static final long serialVersionUID = 100L;
    @XmlElement(name = "DatasetFile", required = true)
    private List<DatasetFileType> datasetFile;

    /**
     * Gets the value of the datasetFile property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetFile property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetFile().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatasetFileType }
     */
    public List<DatasetFileType> getDatasetFile() {
        if (datasetFile == null) {
            datasetFile = new ArrayList<>();
        }
        return this.datasetFile;
    }

}
