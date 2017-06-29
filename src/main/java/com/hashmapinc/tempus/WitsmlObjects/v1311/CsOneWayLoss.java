package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The The power loss for one way travel of a beam of light, usually measured 
 * 			in decibels per unit length. It is necessary to include both the value (and its unit) and the 
 * 			wavelength. The wavelength varies with the refractive index, while the frequency remains constant. 
 * 			The wavelength given to specify this type is the wavelength in a vacuum (refractive index = 1).
 * 
 * <p>Java class for cs_oneWayLoss complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_oneWayLoss">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="value" type="{http://www.witsml.org/schemas/131}generalMeasureType"/>
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
@XmlType(name = "cs_oneWayLoss", propOrder = {
    "value",
    "frequency",
    "wavelength"
})
public class CsOneWayLoss {

    @XmlElement(required = true)
    protected GeneralMeasureType value;
    protected FrequencyMeasure frequency;
    protected LengthMeasure wavelength;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMeasureType }
     *     
     */
    public GeneralMeasureType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMeasureType }
     *     
     */
    public void setValue(GeneralMeasureType value) {
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
