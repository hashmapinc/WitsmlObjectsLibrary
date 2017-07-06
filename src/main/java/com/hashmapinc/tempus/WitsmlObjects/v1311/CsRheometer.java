package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Rheometer Component Schema 
 * 
 * <p>Java class for cs_rheometer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_rheometer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tempRheom" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="presRheom" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="vis3Rpm" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="vis6Rpm" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="vis100Rpm" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="vis200Rpm" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="vis300Rpm" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="vis600Rpm" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
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
@XmlType(name = "cs_rheometer", propOrder = {
    "tempRheom",
    "presRheom",
    "vis3Rpm",
    "vis6Rpm",
    "vis100Rpm",
    "vis200Rpm",
    "vis300Rpm",
    "vis600Rpm"
})
public class CsRheometer {

    protected ThermodynamicTemperatureMeasure tempRheom;
    protected PressureMeasure presRheom;
    protected Double vis3Rpm;
    protected Double vis6Rpm;
    protected Double vis100Rpm;
    protected Double vis200Rpm;
    protected Double vis300Rpm;
    protected Double vis600Rpm;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the tempRheom property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempRheom() {
        return tempRheom;
    }

    /**
     * Sets the value of the tempRheom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempRheom(ThermodynamicTemperatureMeasure value) {
        this.tempRheom = value;
    }

    /**
     * Gets the value of the presRheom property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresRheom() {
        return presRheom;
    }

    /**
     * Sets the value of the presRheom property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresRheom(PressureMeasure value) {
        this.presRheom = value;
    }

    /**
     * Gets the value of the vis3Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVis3Rpm() {
        return vis3Rpm;
    }

    /**
     * Sets the value of the vis3Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVis3Rpm(Double value) {
        this.vis3Rpm = value;
    }

    /**
     * Gets the value of the vis6Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVis6Rpm() {
        return vis6Rpm;
    }

    /**
     * Sets the value of the vis6Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVis6Rpm(Double value) {
        this.vis6Rpm = value;
    }

    /**
     * Gets the value of the vis100Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVis100Rpm() {
        return vis100Rpm;
    }

    /**
     * Sets the value of the vis100Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVis100Rpm(Double value) {
        this.vis100Rpm = value;
    }

    /**
     * Gets the value of the vis200Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVis200Rpm() {
        return vis200Rpm;
    }

    /**
     * Sets the value of the vis200Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVis200Rpm(Double value) {
        this.vis200Rpm = value;
    }

    /**
     * Gets the value of the vis300Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVis300Rpm() {
        return vis300Rpm;
    }

    /**
     * Sets the value of the vis300Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVis300Rpm(Double value) {
        this.vis300Rpm = value;
    }

    /**
     * Gets the value of the vis600Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVis600Rpm() {
        return vis600Rpm;
    }

    /**
     * Sets the value of the vis600Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVis600Rpm(Double value) {
        this.vis600Rpm = value;
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
