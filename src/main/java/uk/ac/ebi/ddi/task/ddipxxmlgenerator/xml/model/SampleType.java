
package uk.ac.ebi.ddi.task.ddipxxmlgenerator.xml.model;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * A summary of the sample describtion. This should be a (sub) selection
 * of cvParams used to describe the sample. Minimally this should contain information like
 * species, tissue, etc..., but could also contain sample preparation information.
 *
 * <p>Java class for SampleType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SampleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cvParam" type="{}CvParamType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleType", propOrder = {
        "cvParam"
})
public class SampleType
        implements Serializable, PXObject {

    private static final long serialVersionUID = 100L;
    @XmlElement(required = true)
    private List<CvParamType> cvParam;
    @XmlAttribute(required = true)
    private String name;

    /**
     * Gets the value of the cvParam property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvParam property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvParam().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvParamType }
     */
    public List<CvParamType> getCvParam() {
        if (cvParam == null) {
            cvParam = new ArrayList<>();
        }
        return this.cvParam;
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

}
