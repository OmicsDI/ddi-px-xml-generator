
package uk.ac.ebi.ddi.task.ddipxxmlgenerator.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * The change log message to record what changes and updates were made to this dataset for a revised announcement.
 *
 * <p>Java class for ChangeLogType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ChangeLogType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeLogEntry" type="{}ChangeLogEntryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeLogType", propOrder = {
        "changeLogEntry"
})
public class ChangeLogType
        implements Serializable, PXObject {

    private static final long serialVersionUID = 100L;
    @XmlElement(name = "ChangeLogEntry", required = true)
    private List<ChangeLogEntryType> changeLogEntry;

    /**
     * Gets the value of the changeLogEntry property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeLogEntry property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeLogEntry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeLogEntryType }
     */
    public List<ChangeLogEntryType> getChangeLogEntry() {
        if (changeLogEntry == null) {
            changeLogEntry = new ArrayList<>();
        }
        return this.changeLogEntry;
    }

}
