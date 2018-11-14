


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MdInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="MdInterval">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MdTop" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure"/>
 *         <element name="MdBase" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure"/>
 *       </sequence>
 *       <attribute name="datum" use="required" type="{http://www.energistics.org/energyml/data/commonv2}String64" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MdInterval", propOrder = {
    "mdTop",
    "mdBase"
})
public class MdInterval {

    @XmlElement(name = "MdTop", required = true)
    protected LengthMeasure mdTop;
    @XmlElement(name = "MdBase", required = true)
    protected LengthMeasure mdBase;
    @XmlAttribute(name = "datum", required = true)
    protected String datum;

    /**
     * Gets the value of the mdTop property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getMdTop() {
        return mdTop;
    }

    /**
     * Sets the value of the mdTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setMdTop(LengthMeasure value) {
        this.mdTop = value;
    }

    /**
     * Gets the value of the mdBase property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getMdBase() {
        return mdBase;
    }

    /**
     * Sets the value of the mdBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setMdBase(LengthMeasure value) {
        this.mdBase = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

}
