package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for obj_bhaRun complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_bhaRun">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_bhaRun" minOccurs="0"/>
 *         <element name="commonData" type="{http://www.witsml.org/schemas/131}cs_commonData" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *       <attribute name="uidWell" type="{http://www.witsml.org/schemas/131}uidString" />
 *       <attribute name="uidWellbore" type="{http://www.witsml.org/schemas/131}uidString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_bhaRun", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "tubular",
    "dTimStart",
    "dTimStop",
    "dTimStartDrilling",
    "dTimStopDrilling",
    "planDogleg",
    "actDogleg",
    "actDoglegMx",
    "statusBha",
    "numBitRun",
    "numStringRun",
    "reasonTrip",
    "objectiveBha",
    "drillingParams",
    "commonData",
    "customData"
})
public class ObjBhaRun {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    protected RefNameString tubular;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimStop;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimStartDrilling;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimStopDrilling;
    protected AnglePerLengthMeasure planDogleg;
    protected AnglePerLengthMeasure actDogleg;
    protected AnglePerLengthMeasure actDoglegMx;
    @XmlSchemaType(name = "string")
    protected String statusBha;
    protected String numBitRun;
    protected Short numStringRun;
    protected String reasonTrip;
    protected String objectiveBha;
    protected CsDrillingParams drillingParams;
    protected CsCommonData commonData;
    protected CsCustomData customData;
    @XmlAttribute(name = "uidWell")
    protected String uidWell;
    @XmlAttribute(name = "uidWellbore")
    protected String uidWellbore;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the nameWell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWell() {
        return nameWell;
    }

    /**
     * Sets the value of the nameWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWell(String value) {
        this.nameWell = value;
    }

    /**
     * Gets the value of the nameWellbore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWellbore() {
        return nameWellbore;
    }

    /**
     * Sets the value of the nameWellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWellbore(String value) {
        this.nameWellbore = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the tubular property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getTubular() {
        return tubular;
    }

    /**
     * Sets the value of the tubular property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setTubular(RefNameString value) {
        this.tubular = value;
    }

    /**
     * Gets the value of the dTimStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimStart() {
        return dTimStart;
    }

    /**
     * Sets the value of the dTimStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimStart(XMLGregorianCalendar value) {
        this.dTimStart = value;
    }

    /**
     * Gets the value of the dTimStop property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimStop() {
        return dTimStop;
    }

    /**
     * Sets the value of the dTimStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimStop(XMLGregorianCalendar value) {
        this.dTimStop = value;
    }

    /**
     * Gets the value of the dTimStartDrilling property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimStartDrilling() {
        return dTimStartDrilling;
    }

    /**
     * Sets the value of the dTimStartDrilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimStartDrilling(XMLGregorianCalendar value) {
        this.dTimStartDrilling = value;
    }

    /**
     * Gets the value of the dTimStopDrilling property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimStopDrilling() {
        return dTimStopDrilling;
    }

    /**
     * Sets the value of the dTimStopDrilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimStopDrilling(XMLGregorianCalendar value) {
        this.dTimStopDrilling = value;
    }

    /**
     * Gets the value of the planDogleg property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public AnglePerLengthMeasure getPlanDogleg() {
        return planDogleg;
    }

    /**
     * Sets the value of the planDogleg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public void setPlanDogleg(AnglePerLengthMeasure value) {
        this.planDogleg = value;
    }

    /**
     * Gets the value of the actDogleg property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public AnglePerLengthMeasure getActDogleg() {
        return actDogleg;
    }

    /**
     * Sets the value of the actDogleg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public void setActDogleg(AnglePerLengthMeasure value) {
        this.actDogleg = value;
    }

    /**
     * Gets the value of the actDoglegMx property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public AnglePerLengthMeasure getActDoglegMx() {
        return actDoglegMx;
    }

    /**
     * Sets the value of the actDoglegMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public void setActDoglegMx(AnglePerLengthMeasure value) {
        this.actDoglegMx = value;
    }

    /**
     * Gets the value of the statusBha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusBha() {
        return statusBha;
    }

    /**
     * Sets the value of the statusBha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusBha(String value) {
        this.statusBha = value;
    }

    /**
     * Gets the value of the numBitRun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumBitRun() {
        return numBitRun;
    }

    /**
     * Sets the value of the numBitRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumBitRun(String value) {
        this.numBitRun = value;
    }

    /**
     * Gets the value of the numStringRun property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumStringRun() {
        return numStringRun;
    }

    /**
     * Sets the value of the numStringRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumStringRun(Short value) {
        this.numStringRun = value;
    }

    /**
     * Gets the value of the reasonTrip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonTrip() {
        return reasonTrip;
    }

    /**
     * Sets the value of the reasonTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonTrip(String value) {
        this.reasonTrip = value;
    }

    /**
     * Gets the value of the objectiveBha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectiveBha() {
        return objectiveBha;
    }

    /**
     * Sets the value of the objectiveBha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectiveBha(String value) {
        this.objectiveBha = value;
    }

    /**
     * Gets the value of the drillingParams property.
     * 
     * @return
     *     possible object is
     *     {@link CsDrillingParams }
     *     
     */
    public CsDrillingParams getDrillingParams() {
        return drillingParams;
    }

    /**
     * Sets the value of the drillingParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsDrillingParams }
     *     
     */
    public void setDrillingParams(CsDrillingParams value) {
        this.drillingParams = value;
    }

    /**
     * Gets the value of the commonData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCommonData }
     *     
     */
    public CsCommonData getCommonData() {
        return commonData;
    }

    /**
     * Sets the value of the commonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCommonData }
     *     
     */
    public void setCommonData(CsCommonData value) {
        this.commonData = value;
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
     * Gets the value of the uidWell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidWell() {
        return uidWell;
    }

    /**
     * Sets the value of the uidWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidWell(String value) {
        this.uidWell = value;
    }

    /**
     * Gets the value of the uidWellbore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidWellbore() {
        return uidWellbore;
    }

    /**
     * Sets the value of the uidWellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidWellbore(String value) {
        this.uidWellbore = value;
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
