package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obj_dtsInstalledSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_dtsInstalledSystem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_dtsInstalledSystem"/>
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
@XmlType(name = "obj_dtsInstalledSystem", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "isPlanned",
    "fiberInformation",
    "instrumentBoxInformation",
    "fiberConfiguration",
    "fiberEndPoint",
    "fiberLength",
    "wellboreFiberSchematic",
    "opticalBudget",
    "pumpActivity",
    "otdrInstallationTest",
    "installationCalibration",
    "basedOnInstalledFiber",
    "commonData",
    "customData"
})
public class ObjDtsInstalledSystem {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    protected Boolean isPlanned;
    protected CsFiberInformation fiberInformation;
    protected CsBoxInformation instrumentBoxInformation;
    protected String fiberConfiguration;
    protected List<CsFiberEndPoint> fiberEndPoint;
    protected LengthMeasure fiberLength;
    protected CsFiberInstalledPoints wellboreFiberSchematic;
    protected GeneralMeasureType opticalBudget;
    protected CsPumpActivity pumpActivity;
    protected List<CsOtdr> otdrInstallationTest;
    protected List<CsCalibration> installationCalibration;
    protected RefNameString basedOnInstalledFiber;
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
     * Gets the value of the isPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPlanned() {
        return isPlanned;
    }

    /**
     * Sets the value of the isPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPlanned(Boolean value) {
        this.isPlanned = value;
    }

    /**
     * Gets the value of the fiberInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CsFiberInformation }
     *     
     */
    public CsFiberInformation getFiberInformation() {
        return fiberInformation;
    }

    /**
     * Sets the value of the fiberInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsFiberInformation }
     *     
     */
    public void setFiberInformation(CsFiberInformation value) {
        this.fiberInformation = value;
    }

    /**
     * Gets the value of the instrumentBoxInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CsBoxInformation }
     *     
     */
    public CsBoxInformation getInstrumentBoxInformation() {
        return instrumentBoxInformation;
    }

    /**
     * Sets the value of the instrumentBoxInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsBoxInformation }
     *     
     */
    public void setInstrumentBoxInformation(CsBoxInformation value) {
        this.instrumentBoxInformation = value;
    }

    /**
     * Gets the value of the fiberConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiberConfiguration() {
        return fiberConfiguration;
    }

    /**
     * Sets the value of the fiberConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiberConfiguration(String value) {
        this.fiberConfiguration = value;
    }

    /**
     * Gets the value of the fiberEndPoint property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiberEndPoint property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getFiberEndPoint().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsFiberEndPoint }
     * 
     * 
     */
    public List<CsFiberEndPoint> getFiberEndPoint() {
        if (fiberEndPoint == null) {
            fiberEndPoint = new ArrayList<CsFiberEndPoint>();
        }
        return this.fiberEndPoint;
    }

    /**
     * Gets the value of the fiberLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getFiberLength() {
        return fiberLength;
    }

    /**
     * Sets the value of the fiberLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setFiberLength(LengthMeasure value) {
        this.fiberLength = value;
    }

    /**
     * Gets the value of the wellboreFiberSchematic property.
     * 
     * @return
     *     possible object is
     *     {@link CsFiberInstalledPoints }
     *     
     */
    public CsFiberInstalledPoints getWellboreFiberSchematic() {
        return wellboreFiberSchematic;
    }

    /**
     * Sets the value of the wellboreFiberSchematic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsFiberInstalledPoints }
     *     
     */
    public void setWellboreFiberSchematic(CsFiberInstalledPoints value) {
        this.wellboreFiberSchematic = value;
    }

    /**
     * Gets the value of the opticalBudget property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMeasureType }
     *     
     */
    public GeneralMeasureType getOpticalBudget() {
        return opticalBudget;
    }

    /**
     * Sets the value of the opticalBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMeasureType }
     *     
     */
    public void setOpticalBudget(GeneralMeasureType value) {
        this.opticalBudget = value;
    }

    /**
     * Gets the value of the pumpActivity property.
     * 
     * @return
     *     possible object is
     *     {@link CsPumpActivity }
     *     
     */
    public CsPumpActivity getPumpActivity() {
        return pumpActivity;
    }

    /**
     * Sets the value of the pumpActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsPumpActivity }
     *     
     */
    public void setPumpActivity(CsPumpActivity value) {
        this.pumpActivity = value;
    }

    /**
     * Gets the value of the otdrInstallationTest property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otdrInstallationTest property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getOtdrInstallationTest().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsOtdr }
     * 
     * 
     */
    public List<CsOtdr> getOtdrInstallationTest() {
        if (otdrInstallationTest == null) {
            otdrInstallationTest = new ArrayList<CsOtdr>();
        }
        return this.otdrInstallationTest;
    }

    /**
     * Gets the value of the installationCalibration property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installationCalibration property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getInstallationCalibration().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsCalibration }
     * 
     * 
     */
    public List<CsCalibration> getInstallationCalibration() {
        if (installationCalibration == null) {
            installationCalibration = new ArrayList<CsCalibration>();
        }
        return this.installationCalibration;
    }

    /**
     * Gets the value of the basedOnInstalledFiber property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getBasedOnInstalledFiber() {
        return basedOnInstalledFiber;
    }

    /**
     * Sets the value of the basedOnInstalledFiber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setBasedOnInstalledFiber(RefNameString value) {
        this.basedOnInstalledFiber = value;
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
