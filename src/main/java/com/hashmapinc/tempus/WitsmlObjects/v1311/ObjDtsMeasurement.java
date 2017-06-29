package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The measurements of a DTS run are carried primarily in the wellLog object. The elements in this object are additional, defined parameters that are needed to capture the context of the DTS measurement.
 * 
 * <p>Java class for obj_dtsMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_dtsMeasurement">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_dtsMeasurement"/>
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
@XmlType(name = "obj_dtsMeasurement", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "runDuration",
    "installedSystemUsed",
    "dataInWellLog",
    "connectedToFiber",
    "fiberEndConnected",
    "fiberDefinedPoint",
    "errorReport",
    "commonData",
    "customData"
})
public class ObjDtsMeasurement {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    protected TimeMeasure runDuration;
    @XmlElement(required = true)
    protected RefNameString installedSystemUsed;
    @XmlElement(required = true)
    protected RefNameString dataInWellLog;
    protected RefNameString connectedToFiber;
    protected RefNameString fiberEndConnected;
    protected CsSingleInstalledPoint fiberDefinedPoint;
    protected List<CsErrorReport> errorReport;
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
     * Gets the value of the runDuration property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getRunDuration() {
        return runDuration;
    }

    /**
     * Sets the value of the runDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setRunDuration(TimeMeasure value) {
        this.runDuration = value;
    }

    /**
     * Gets the value of the installedSystemUsed property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getInstalledSystemUsed() {
        return installedSystemUsed;
    }

    /**
     * Sets the value of the installedSystemUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setInstalledSystemUsed(RefNameString value) {
        this.installedSystemUsed = value;
    }

    /**
     * Gets the value of the dataInWellLog property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getDataInWellLog() {
        return dataInWellLog;
    }

    /**
     * Sets the value of the dataInWellLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setDataInWellLog(RefNameString value) {
        this.dataInWellLog = value;
    }

    /**
     * Gets the value of the connectedToFiber property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getConnectedToFiber() {
        return connectedToFiber;
    }

    /**
     * Sets the value of the connectedToFiber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setConnectedToFiber(RefNameString value) {
        this.connectedToFiber = value;
    }

    /**
     * Gets the value of the fiberEndConnected property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getFiberEndConnected() {
        return fiberEndConnected;
    }

    /**
     * Sets the value of the fiberEndConnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setFiberEndConnected(RefNameString value) {
        this.fiberEndConnected = value;
    }

    /**
     * Gets the value of the fiberDefinedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link CsSingleInstalledPoint }
     *     
     */
    public CsSingleInstalledPoint getFiberDefinedPoint() {
        return fiberDefinedPoint;
    }

    /**
     * Sets the value of the fiberDefinedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsSingleInstalledPoint }
     *     
     */
    public void setFiberDefinedPoint(CsSingleInstalledPoint value) {
        this.fiberDefinedPoint = value;
    }

    /**
     * Gets the value of the errorReport property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorReport property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getErrorReport().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsErrorReport }
     * 
     * 
     */
    public List<CsErrorReport> getErrorReport() {
        if (errorReport == null) {
            errorReport = new ArrayList<CsErrorReport>();
        }
        return this.errorReport;
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
