package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Nozzle Component Schema
 * 
 * <p>Java class for cs_nozzle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_nozzle">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="index" type="{http://www.witsml.org/schemas/131}positiveCount" minOccurs="0"/>
 *         <element name="diaNozzle" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="typeNozzle" type="{http://www.witsml.org/schemas/131}NozzleType" minOccurs="0"/>
 *         <element name="len" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="orientation" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
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
@XmlType(name = "cs_nozzle", propOrder = {
    "index",
    "diaNozzle",
    "typeNozzle",
    "len",
    "orientation",
    "customData"
})
public class CsNozzle {

    protected Short index;
    protected LengthMeasure diaNozzle;
    @XmlSchemaType(name = "string")
    protected String typeNozzle;
    protected LengthMeasure len;
    protected String orientation;
    protected CsCustomData customData;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIndex(Short value) {
        this.index = value;
    }

    /**
     * Gets the value of the diaNozzle property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaNozzle() {
        return diaNozzle;
    }

    /**
     * Sets the value of the diaNozzle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaNozzle(LengthMeasure value) {
        this.diaNozzle = value;
    }

    /**
     * Gets the value of the typeNozzle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeNozzle() {
        return typeNozzle;
    }

    /**
     * Sets the value of the typeNozzle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeNozzle(String value) {
        this.typeNozzle = value;
    }

    /**
     * Gets the value of the len property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLen() {
        return len;
    }

    /**
     * Sets the value of the len property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLen(LengthMeasure value) {
        this.len = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
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
