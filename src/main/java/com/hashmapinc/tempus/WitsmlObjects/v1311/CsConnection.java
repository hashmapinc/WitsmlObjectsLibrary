package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Tubular Connection Component Schema 
 * 
 * <p>Java class for cs_connection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_connection">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="od" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="len" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="typeThread" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="sizeThread" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="tensYield" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="tqYield" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="position" type="{http://www.witsml.org/schemas/131}ConnectionPosition" minOccurs="0"/>
 *         <element name="criticalCrossSection" type="{http://www.witsml.org/schemas/131}areaMeasure" minOccurs="0"/>
 *         <element name="presLeak" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="tqMakeup" type="{http://www.witsml.org/schemas/131}momentOfForceMeasure" minOccurs="0"/>
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
@XmlType(name = "cs_connection", propOrder = {
    "id",
    "od",
    "len",
    "typeThread",
    "sizeThread",
    "tensYield",
    "tqYield",
    "position",
    "criticalCrossSection",
    "presLeak",
    "tqMakeup",
    "customData"
})
public class CsConnection {

    protected LengthMeasure id;
    protected LengthMeasure od;
    protected LengthMeasure len;
    protected String typeThread;
    protected LengthMeasure sizeThread;
    protected PressureMeasure tensYield;
    protected PressureMeasure tqYield;
    @XmlSchemaType(name = "string")
    protected ConnectionPosition position;
    protected AreaMeasure criticalCrossSection;
    protected PressureMeasure presLeak;
    protected MomentOfForceMeasure tqMakeup;
    protected CsCustomData customData;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setId(LengthMeasure value) {
        this.id = value;
    }

    /**
     * Gets the value of the od property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOd() {
        return od;
    }

    /**
     * Sets the value of the od property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOd(LengthMeasure value) {
        this.od = value;
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
     * Gets the value of the typeThread property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeThread() {
        return typeThread;
    }

    /**
     * Sets the value of the typeThread property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeThread(String value) {
        this.typeThread = value;
    }

    /**
     * Gets the value of the sizeThread property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getSizeThread() {
        return sizeThread;
    }

    /**
     * Sets the value of the sizeThread property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setSizeThread(LengthMeasure value) {
        this.sizeThread = value;
    }

    /**
     * Gets the value of the tensYield property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getTensYield() {
        return tensYield;
    }

    /**
     * Sets the value of the tensYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setTensYield(PressureMeasure value) {
        this.tensYield = value;
    }

    /**
     * Gets the value of the tqYield property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getTqYield() {
        return tqYield;
    }

    /**
     * Sets the value of the tqYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setTqYield(PressureMeasure value) {
        this.tqYield = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionPosition }
     *     
     */
    public ConnectionPosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionPosition }
     *     
     */
    public void setPosition(ConnectionPosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the criticalCrossSection property.
     * 
     * @return
     *     possible object is
     *     {@link AreaMeasure }
     *     
     */
    public AreaMeasure getCriticalCrossSection() {
        return criticalCrossSection;
    }

    /**
     * Sets the value of the criticalCrossSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaMeasure }
     *     
     */
    public void setCriticalCrossSection(AreaMeasure value) {
        this.criticalCrossSection = value;
    }

    /**
     * Gets the value of the presLeak property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresLeak() {
        return presLeak;
    }

    /**
     * Sets the value of the presLeak property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresLeak(PressureMeasure value) {
        this.presLeak = value;
    }

    /**
     * Gets the value of the tqMakeup property.
     * 
     * @return
     *     possible object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public MomentOfForceMeasure getTqMakeup() {
        return tqMakeup;
    }

    /**
     * Sets the value of the tqMakeup property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public void setTqMakeup(MomentOfForceMeasure value) {
        this.tqMakeup = value;
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
