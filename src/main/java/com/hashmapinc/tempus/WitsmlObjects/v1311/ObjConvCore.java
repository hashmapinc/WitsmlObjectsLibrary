package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for obj_convCore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_convCore">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_convCore" minOccurs="0"/>
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
@XmlType(name = "obj_convCore", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "mdCoreTop",
    "mdCoreBottom",
    "dTimCoreStart",
    "dTimCoreEnd",
    "coreReference",
    "coringContractor",
    "analysisContractor",
    "coreBarrel",
    "innerBarrelUsed",
    "innerBarrelType",
    "lenBarrel",
    "coreBitType",
    "diaBit",
    "diaCore",
    "lenCored",
    "lenRecovered",
    "recoverPc",
    "inclHole",
    "coreOrientation",
    "coreMethod",
    "coreTreatmentMethod",
    "coreFluidUsed",
    "nameFormation",
    "geologyInterval",
    "coreDescription",
    "commonData",
    "customData"
})
public class ObjConvCore {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    protected MeasuredDepthCoord mdCoreTop;
    protected MeasuredDepthCoord mdCoreBottom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimCoreStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimCoreEnd;
    protected String coreReference;
    protected String coringContractor;
    protected String analysisContractor;
    protected String coreBarrel;
    protected Boolean innerBarrelUsed;
    protected String innerBarrelType;
    protected LengthMeasure lenBarrel;
    protected String coreBitType;
    protected LengthMeasure diaBit;
    protected LengthMeasure diaCore;
    protected LengthMeasure lenCored;
    protected LengthMeasure lenRecovered;
    protected VolumePerVolumeMeasure recoverPc;
    protected PlaneAngleMeasure inclHole;
    protected Boolean coreOrientation;
    protected String coreMethod;
    protected String coreTreatmentMethod;
    protected String coreFluidUsed;
    protected String nameFormation;
    protected CsGeologyInterval geologyInterval;
    protected String coreDescription;
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
     * Gets the value of the mdCoreTop property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdCoreTop() {
        return mdCoreTop;
    }

    /**
     * Sets the value of the mdCoreTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdCoreTop(MeasuredDepthCoord value) {
        this.mdCoreTop = value;
    }

    /**
     * Gets the value of the mdCoreBottom property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdCoreBottom() {
        return mdCoreBottom;
    }

    /**
     * Sets the value of the mdCoreBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdCoreBottom(MeasuredDepthCoord value) {
        this.mdCoreBottom = value;
    }

    /**
     * Gets the value of the dTimCoreStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimCoreStart() {
        return dTimCoreStart;
    }

    /**
     * Sets the value of the dTimCoreStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimCoreStart(XMLGregorianCalendar value) {
        this.dTimCoreStart = value;
    }

    /**
     * Gets the value of the dTimCoreEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimCoreEnd() {
        return dTimCoreEnd;
    }

    /**
     * Sets the value of the dTimCoreEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimCoreEnd(XMLGregorianCalendar value) {
        this.dTimCoreEnd = value;
    }

    /**
     * Gets the value of the coreReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreReference() {
        return coreReference;
    }

    /**
     * Sets the value of the coreReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreReference(String value) {
        this.coreReference = value;
    }

    /**
     * Gets the value of the coringContractor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoringContractor() {
        return coringContractor;
    }

    /**
     * Sets the value of the coringContractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoringContractor(String value) {
        this.coringContractor = value;
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
     * Gets the value of the coreBarrel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreBarrel() {
        return coreBarrel;
    }

    /**
     * Sets the value of the coreBarrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreBarrel(String value) {
        this.coreBarrel = value;
    }

    /**
     * Gets the value of the innerBarrelUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInnerBarrelUsed() {
        return innerBarrelUsed;
    }

    /**
     * Sets the value of the innerBarrelUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInnerBarrelUsed(Boolean value) {
        this.innerBarrelUsed = value;
    }

    /**
     * Gets the value of the innerBarrelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInnerBarrelType() {
        return innerBarrelType;
    }

    /**
     * Sets the value of the innerBarrelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInnerBarrelType(String value) {
        this.innerBarrelType = value;
    }

    /**
     * Gets the value of the lenBarrel property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenBarrel() {
        return lenBarrel;
    }

    /**
     * Sets the value of the lenBarrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenBarrel(LengthMeasure value) {
        this.lenBarrel = value;
    }

    /**
     * Gets the value of the coreBitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreBitType() {
        return coreBitType;
    }

    /**
     * Sets the value of the coreBitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreBitType(String value) {
        this.coreBitType = value;
    }

    /**
     * Gets the value of the diaBit property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaBit() {
        return diaBit;
    }

    /**
     * Sets the value of the diaBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaBit(LengthMeasure value) {
        this.diaBit = value;
    }

    /**
     * Gets the value of the diaCore property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaCore() {
        return diaCore;
    }

    /**
     * Sets the value of the diaCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaCore(LengthMeasure value) {
        this.diaCore = value;
    }

    /**
     * Gets the value of the lenCored property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenCored() {
        return lenCored;
    }

    /**
     * Sets the value of the lenCored property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenCored(LengthMeasure value) {
        this.lenCored = value;
    }

    /**
     * Gets the value of the lenRecovered property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenRecovered() {
        return lenRecovered;
    }

    /**
     * Sets the value of the lenRecovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenRecovered(LengthMeasure value) {
        this.lenRecovered = value;
    }

    /**
     * Gets the value of the recoverPc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getRecoverPc() {
        return recoverPc;
    }

    /**
     * Sets the value of the recoverPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setRecoverPc(VolumePerVolumeMeasure value) {
        this.recoverPc = value;
    }

    /**
     * Gets the value of the inclHole property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getInclHole() {
        return inclHole;
    }

    /**
     * Sets the value of the inclHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setInclHole(PlaneAngleMeasure value) {
        this.inclHole = value;
    }

    /**
     * Gets the value of the coreOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoreOrientation() {
        return coreOrientation;
    }

    /**
     * Sets the value of the coreOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoreOrientation(Boolean value) {
        this.coreOrientation = value;
    }

    /**
     * Gets the value of the coreMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreMethod() {
        return coreMethod;
    }

    /**
     * Sets the value of the coreMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreMethod(String value) {
        this.coreMethod = value;
    }

    /**
     * Gets the value of the coreTreatmentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreTreatmentMethod() {
        return coreTreatmentMethod;
    }

    /**
     * Sets the value of the coreTreatmentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreTreatmentMethod(String value) {
        this.coreTreatmentMethod = value;
    }

    /**
     * Gets the value of the coreFluidUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreFluidUsed() {
        return coreFluidUsed;
    }

    /**
     * Sets the value of the coreFluidUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreFluidUsed(String value) {
        this.coreFluidUsed = value;
    }

    /**
     * Gets the value of the nameFormation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFormation() {
        return nameFormation;
    }

    /**
     * Sets the value of the nameFormation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFormation(String value) {
        this.nameFormation = value;
    }

    /**
     * Gets the value of the geologyInterval property.
     * 
     * @return
     *     possible object is
     *     {@link CsGeologyInterval }
     *     
     */
    public CsGeologyInterval getGeologyInterval() {
        return geologyInterval;
    }

    /**
     * Sets the value of the geologyInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsGeologyInterval }
     *     
     */
    public void setGeologyInterval(CsGeologyInterval value) {
        this.geologyInterval = value;
    }

    /**
     * Gets the value of the coreDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreDescription() {
        return coreDescription;
    }

    /**
     * Sets the value of the coreDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreDescription(String value) {
        this.coreDescription = value;
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
