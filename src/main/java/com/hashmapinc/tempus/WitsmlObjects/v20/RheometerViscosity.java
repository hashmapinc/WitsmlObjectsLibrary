//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.14 at 09:24:00 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v20;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Viscosity reading of the rheometer
 * 
 * <p>Java class for RheometerViscosity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RheometerViscosity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Speed" type="{http://www.energistics.org/energyml/data/commonv2}GenericMeasure"/>
 *         &lt;element name="Viscosity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uid" use="required" type="{http://www.energistics.org/energyml/data/commonv2}String64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RheometerViscosity", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "speed",
    "viscosity"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RheometerViscosity {

    @XmlElement(name = "Speed", required = true)
    protected GenericMeasure speed;
    @XmlElement(name = "Viscosity")
    protected double viscosity;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setSpeed(GenericMeasure value) {
        this.speed = value;
    }

    /**
     * Gets the value of the viscosity property.
     * 
     */
    public double getViscosity() {
        return viscosity;
    }

    /**
     * Sets the value of the viscosity property.
     * 
     */
    public void setViscosity(double value) {
        this.viscosity = value;
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
