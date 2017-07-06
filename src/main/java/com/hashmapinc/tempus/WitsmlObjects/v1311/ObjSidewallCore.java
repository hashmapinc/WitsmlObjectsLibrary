package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for obj_sidewallCore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_sidewallCore">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_sidewallCore" minOccurs="0"/>
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
@XmlType(name = "obj_sidewallCore", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "dTimToolRun",
    "dTimToolPull",
    "mdToolReference",
    "coreReferenceLog",
    "mdCore",
    "serviceCompany",
    "analysisContractor",
    "analysisBy",
    "sidewallCoringTool",
    "diaHole",
    "diaPlug",
    "numPlugsShot",
    "numRecPlugs",
    "numMisfiredPlugs",
    "numEmptyPlugs",
    "numLostPlugs",
    "numPaidPlugs",
    "swcSample",
    "commonData",
    "customData"
})
public class ObjSidewallCore {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimToolRun;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimToolPull;
    protected MeasuredDepthCoord mdToolReference;
    protected String coreReferenceLog;
    protected MeasuredDepthCoord mdCore;
    protected String serviceCompany;
    protected String analysisContractor;
    protected String analysisBy;
    protected String sidewallCoringTool;
    protected LengthMeasure diaHole;
    protected LengthMeasure diaPlug;
    protected Short numPlugsShot;
    protected Short numRecPlugs;
    protected Short numMisfiredPlugs;
    protected Short numEmptyPlugs;
    protected Short numLostPlugs;
    protected Short numPaidPlugs;
    protected List<CsSwcSample> swcSample;
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
     * Gets the value of the dTimToolRun property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimToolRun() {
        return dTimToolRun;
    }

    /**
     * Sets the value of the dTimToolRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimToolRun(XMLGregorianCalendar value) {
        this.dTimToolRun = value;
    }

    /**
     * Gets the value of the dTimToolPull property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimToolPull() {
        return dTimToolPull;
    }

    /**
     * Sets the value of the dTimToolPull property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimToolPull(XMLGregorianCalendar value) {
        this.dTimToolPull = value;
    }

    /**
     * Gets the value of the mdToolReference property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdToolReference() {
        return mdToolReference;
    }

    /**
     * Sets the value of the mdToolReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdToolReference(MeasuredDepthCoord value) {
        this.mdToolReference = value;
    }

    /**
     * Gets the value of the coreReferenceLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreReferenceLog() {
        return coreReferenceLog;
    }

    /**
     * Sets the value of the coreReferenceLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreReferenceLog(String value) {
        this.coreReferenceLog = value;
    }

    /**
     * Gets the value of the mdCore property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdCore() {
        return mdCore;
    }

    /**
     * Sets the value of the mdCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdCore(MeasuredDepthCoord value) {
        this.mdCore = value;
    }

    /**
     * Gets the value of the serviceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCompany() {
        return serviceCompany;
    }

    /**
     * Sets the value of the serviceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCompany(String value) {
        this.serviceCompany = value;
    }

    /**
     * Gets the value of the analysisContractor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisContractor() {
        return analysisContractor;
    }

    /**
     * Sets the value of the analysisContractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisContractor(String value) {
        this.analysisContractor = value;
    }

    /**
     * Gets the value of the analysisBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisBy() {
        return analysisBy;
    }

    /**
     * Sets the value of the analysisBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisBy(String value) {
        this.analysisBy = value;
    }

    /**
     * Gets the value of the sidewallCoringTool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSidewallCoringTool() {
        return sidewallCoringTool;
    }

    /**
     * Sets the value of the sidewallCoringTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSidewallCoringTool(String value) {
        this.sidewallCoringTool = value;
    }

    /**
     * Gets the value of the diaHole property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaHole() {
        return diaHole;
    }

    /**
     * Sets the value of the diaHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaHole(LengthMeasure value) {
        this.diaHole = value;
    }

    /**
     * Gets the value of the diaPlug property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaPlug() {
        return diaPlug;
    }

    /**
     * Sets the value of the diaPlug property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaPlug(LengthMeasure value) {
        this.diaPlug = value;
    }

    /**
     * Gets the value of the numPlugsShot property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumPlugsShot() {
        return numPlugsShot;
    }

    /**
     * Sets the value of the numPlugsShot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumPlugsShot(Short value) {
        this.numPlugsShot = value;
    }

    /**
     * Gets the value of the numRecPlugs property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumRecPlugs() {
        return numRecPlugs;
    }

    /**
     * Sets the value of the numRecPlugs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumRecPlugs(Short value) {
        this.numRecPlugs = value;
    }

    /**
     * Gets the value of the numMisfiredPlugs property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumMisfiredPlugs() {
        return numMisfiredPlugs;
    }

    /**
     * Sets the value of the numMisfiredPlugs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumMisfiredPlugs(Short value) {
        this.numMisfiredPlugs = value;
    }

    /**
     * Gets the value of the numEmptyPlugs property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumEmptyPlugs() {
        return numEmptyPlugs;
    }

    /**
     * Sets the value of the numEmptyPlugs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumEmptyPlugs(Short value) {
        this.numEmptyPlugs = value;
    }

    /**
     * Gets the value of the numLostPlugs property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumLostPlugs() {
        return numLostPlugs;
    }

    /**
     * Sets the value of the numLostPlugs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumLostPlugs(Short value) {
        this.numLostPlugs = value;
    }

    /**
     * Gets the value of the numPaidPlugs property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumPaidPlugs() {
        return numPaidPlugs;
    }

    /**
     * Sets the value of the numPaidPlugs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumPaidPlugs(Short value) {
        this.numPaidPlugs = value;
    }

    /**
     * Gets the value of the swcSample property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swcSample property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getSwcSample().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsSwcSample }
     * 
     * 
     */
    public List<CsSwcSample> getSwcSample() {
        if (swcSample == null) {
            swcSample = new ArrayList<CsSwcSample>();
        }
        return this.swcSample;
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
