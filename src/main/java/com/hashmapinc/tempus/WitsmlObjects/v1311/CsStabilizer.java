package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Stablizer Component Schema
 * 
 * <p>Java class for cs_stabilizer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_stabilizer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="lenBlade" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenBladeGauge" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="odBladeMx" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="odBladeMn" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="distBladeBot" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="shapeBlade" type="{http://www.witsml.org/schemas/131}BladeShapeType" minOccurs="0"/>
 *         <element name="factFric" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="typeBlade" type="{http://www.witsml.org/schemas/131}BladeType" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
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
@XmlType(name = "cs_stabilizer", propOrder = {
    "lenBlade",
    "lenBladeGauge",
    "odBladeMx",
    "odBladeMn",
    "distBladeBot",
    "shapeBlade",
    "factFric",
    "typeBlade",
    "customData"
})
public class CsStabilizer {

    protected LengthMeasure lenBlade;
    protected LengthMeasure lenBladeGauge;
    protected LengthMeasure odBladeMx;
    protected LengthMeasure odBladeMn;
    protected LengthMeasure distBladeBot;
    @XmlSchemaType(name = "string")
    protected String shapeBlade;
    protected Double factFric;
    @XmlSchemaType(name = "string")
    protected String typeBlade;
    protected CsCustomData customData;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the lenBlade property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenBlade() {
        return lenBlade;
    }

    /**
     * Sets the value of the lenBlade property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenBlade(LengthMeasure value) {
        this.lenBlade = value;
    }

    /**
     * Gets the value of the lenBladeGauge property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenBladeGauge() {
        return lenBladeGauge;
    }

    /**
     * Sets the value of the lenBladeGauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenBladeGauge(LengthMeasure value) {
        this.lenBladeGauge = value;
    }

    /**
     * Gets the value of the odBladeMx property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdBladeMx() {
        return odBladeMx;
    }

    /**
     * Sets the value of the odBladeMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdBladeMx(LengthMeasure value) {
        this.odBladeMx = value;
    }

    /**
     * Gets the value of the odBladeMn property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdBladeMn() {
        return odBladeMn;
    }

    /**
     * Sets the value of the odBladeMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdBladeMn(LengthMeasure value) {
        this.odBladeMn = value;
    }

    /**
     * Gets the value of the distBladeBot property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistBladeBot() {
        return distBladeBot;
    }

    /**
     * Sets the value of the distBladeBot property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistBladeBot(LengthMeasure value) {
        this.distBladeBot = value;
    }

    /**
     * Gets the value of the shapeBlade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShapeBlade() {
        return shapeBlade;
    }

    /**
     * Sets the value of the shapeBlade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShapeBlade(String value) {
        this.shapeBlade = value;
    }

    /**
     * Gets the value of the factFric property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFactFric() {
        return factFric;
    }

    /**
     * Sets the value of the factFric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFactFric(Double value) {
        this.factFric = value;
    }

    /**
     * Gets the value of the typeBlade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeBlade() {
        return typeBlade;
    }

    /**
     * Sets the value of the typeBlade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeBlade(String value) {
        this.typeBlade = value;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCustomData }
     *     
     */
    public CsCustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCustomData }
     *     
     */
    public void setCustomData(CsCustomData value) {
        this.customData = value;
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
