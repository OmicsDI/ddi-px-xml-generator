
package uk.ac.ebi.ddi.task.ddipxxmlgenerator.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Java class for RepositorySupportType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RepositorySupportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cvParam" type="{}CvParamType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositorySupportType", propOrder = {
        "cvParam"
})
public class RepositorySupportType
        implements Serializable, PXObject {

    private static final long serialVersionUID = 100L;
    @XmlElement(required = true)
    private CvParamType cvParam;

    /**
     * Gets the value of the cvParam property.
     *
     * @return possible object is
     * {@link CvParamType }
     */
    public CvParamType getCvParam() {
        return cvParam;
    }

    /**
     * Sets the value of the cvParam property.
     *
     * @param value allowed object is
     *              {@link CvParamType }
     */
    public void setCvParam(CvParamType value) {
        this.cvParam = value;
    }

}
