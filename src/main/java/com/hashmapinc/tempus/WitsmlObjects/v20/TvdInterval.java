


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TvdInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="TvdInterval">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TvdTop" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure"/>
 *         <element name="TvdBase" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure"/>
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
@XmlType(name = "TvdInterval", propOrder = {
    "tvdTop",
    "tvdBase"
})
public class TvdInterval {

    @XmlElement(name = "TvdTop", required = true)
    protected LengthMeasure tvdTop;
    @XmlElement(name = "TvdBase", required = true)
    protected LengthMeasure tvdBase;
    @XmlAttribute(name = "datum", required = true)
    protected String datum;

    /**
     * Gets the value of the tvdTop property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getTvdTop() {
        return tvdTop;
    }

    /**
     * Sets the value of the tvdTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setTvdTop(LengthMeasure value) {
        this.tvdTop = value;
    }

    /**
     * Gets the value of the tvdBase property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getTvdBase() {
        return tvdBase;
    }

    /**
     * Sets the value of the tvdBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setTvdBase(LengthMeasure value) {
        this.tvdBase = value;
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
