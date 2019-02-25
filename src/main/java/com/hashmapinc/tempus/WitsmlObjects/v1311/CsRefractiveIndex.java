package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The refractive index of a material depends on the frequency or 
 * 			wavelength of the light. Hence it is necessary to include both the value (a unitless 
 * 			number) and the frequency or wavelength. The frequency will be a quantity type with a 
 * 			frequency unit, such as Hz, kHz, or MHz.  The wavelength will be a quantity type with 
 * 			a length unit, such as m, cm, um, in, or ft.
 * 
 * <p>Java class for cs_refractiveIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_refractiveIndex">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="value" type="{http://www.witsml.org/schemas/131}unitlessQuantity"/>
 *         <element name="frequency" type="{http://www.witsml.org/schemas/131}frequencyMeasure" minOccurs="0"/>
 *         <element name="wavelength" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_refractiveIndex", propOrder = {
    "value",
    "frequency",
    "wavelength"
})
public class CsRefractiveIndex {

    protected Double value;
    protected FrequencyMeasure frequency;
    protected LengthMeasure wavelength;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the value property.
     * 
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyMeasure }
     *     
     */
    public FrequencyMeasure getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyMeasure }
     *     
     */
    public void setFrequency(FrequencyMeasure value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the wavelength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getWavelength() {
        return wavelength;
    }

    /**
     * Sets the value of the wavelength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setWavelength(LengthMeasure value) {
        this.wavelength = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
