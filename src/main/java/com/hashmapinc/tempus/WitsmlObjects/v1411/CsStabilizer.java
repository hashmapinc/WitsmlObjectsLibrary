//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="lenBlade" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="lenBladeGauge" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="odBladeMx" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="odBladeMn" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="distBladeBot" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="shapeBlade" type="{http://www.witsml.org/schemas/1series}BladeShapeType" minOccurs="0"/>
 *         <element name="factFric" type="{http://www.witsml.org/schemas/1series}unitlessQuantity" minOccurs="0"/>
 *         <element name="typeBlade" type="{http://www.witsml.org/schemas/1series}BladeType" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/1series}cs_customData" minOccurs="0"/>
 *         <element name="extensionAny" type="{http://www.witsml.org/schemas/1series}cs_extensionAny" minOccurs="0"/>
 *         <element name="extensionNameValue" type="{http://www.witsml.org/schemas/1series}cs_extensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/1series}attgrp_uid"/>
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
    "customData",
    "extensionAny",
    "extensionNameValue"
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
    protected CsExtensionAny extensionAny;
    protected List<CsExtensionNameValue> extensionNameValue;
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
     * Gets the value of the extensionAny property.
     * 
     * @return
     *     possible object is
     *     {@link CsExtensionAny }
     *     
     */
    public CsExtensionAny getExtensionAny() {
        return extensionAny;
    }

    /**
     * Sets the value of the extensionAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsExtensionAny }
     *     
     */
    public void setExtensionAny(CsExtensionAny value) {
        this.extensionAny = value;
    }

    /**
     * Gets the value of the extensionNameValue property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionNameValue property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getExtensionNameValue().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsExtensionNameValue }
     * 
     * 
     */
    public List<CsExtensionNameValue> getExtensionNameValue() {
        if (extensionNameValue == null) {
            extensionNameValue = new ArrayList<CsExtensionNameValue>();
        }
        return this.extensionNameValue;
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
