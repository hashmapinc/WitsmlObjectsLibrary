package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.hashmapinc.tempus.WitsmlObjects.AbstractWitsmlObject;

/**
 * <p>Java class for obj_wellbore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_wellbore">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_wellbore" minOccurs="0"/>
 *         <element name="commonData" type="{http://www.witsml.org/schemas/131}cs_commonData" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *       <attribute name="uidWell" type="{http://www.witsml.org/schemas/131}uidString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_wellbore", propOrder = {
    "nameWell",
    "name",
    "parentWellbore",
    "number",
    "suffixAPI",
    "numGovt",
    "statusWellbore",
    "purposeWellbore",
    "typeWellbore",
    "shape",
    "dTimKickoff",
    "achievedTD",
    "mdCurrent",
    "tvdCurrent",
    "mdKickoff",
    "tvdKickoff",
    "mdPlanned",
    "tvdPlanned",
    "mdSubSeaPlanned",
    "tvdSubSeaPlanned",
    "dayTarget",
    "commonData",
    "customData"
})
public class ObjWellbore extends AbstractWitsmlObject {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String name;
    protected RefNameString parentWellbore;
    protected String number;
    protected String suffixAPI;
    protected String numGovt;
    @XmlSchemaType(name = "string")
    protected WellStatus statusWellbore;
    @XmlSchemaType(name = "string")
    protected WellPurpose purposeWellbore;
    @XmlSchemaType(name = "string")
    protected WellboreType typeWellbore;
    @XmlSchemaType(name = "string")
    protected WellboreShape shape;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimKickoff;
    protected Boolean achievedTD;
    protected MeasuredDepthCoord mdCurrent;
    protected WellVerticalDepthCoord tvdCurrent;
    protected MeasuredDepthCoord mdKickoff;
    protected WellVerticalDepthCoord tvdKickoff;
    protected MeasuredDepthCoord mdPlanned;
    protected WellVerticalDepthCoord tvdPlanned;
    protected MeasuredDepthCoord mdSubSeaPlanned;
    protected WellVerticalDepthCoord tvdSubSeaPlanned;
    protected TimeMeasure dayTarget;
    protected CsCommonData commonData;
    protected CsCustomData customData;
    @XmlAttribute(name = "uidWell")
    protected String uidWell;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * get the parent uid as a string
     */
    @Override
    public String getParentUid() {
        return this.uidWell;
    }

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
     * Gets the value of the parentWellbore property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getParentWellbore() {
        return parentWellbore;
    }

    /**
     * Sets the value of the parentWellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setParentWellbore(RefNameString value) {
        this.parentWellbore = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the suffixAPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixAPI() {
        return suffixAPI;
    }

    /**
     * Sets the value of the suffixAPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixAPI(String value) {
        this.suffixAPI = value;
    }

    /**
     * Gets the value of the numGovt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumGovt() {
        return numGovt;
    }

    /**
     * Sets the value of the numGovt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumGovt(String value) {
        this.numGovt = value;
    }

    /**
     * Gets the value of the statusWellbore property.
     * 
     * @return
     *     possible object is
     *     {@link WellStatus }
     *     
     */
    public WellStatus getStatusWellbore() {
        return statusWellbore;
    }

    /**
     * Sets the value of the statusWellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellStatus }
     *     
     */
    public void setStatusWellbore(WellStatus value) {
        this.statusWellbore = value;
    }

    /**
     * Gets the value of the purposeWellbore property.
     * 
     * @return
     *     possible object is
     *     {@link WellPurpose }
     *     
     */
    public WellPurpose getPurposeWellbore() {
        return purposeWellbore;
    }

    /**
     * Sets the value of the purposeWellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellPurpose }
     *     
     */
    public void setPurposeWellbore(WellPurpose value) {
        this.purposeWellbore = value;
    }

    /**
     * Gets the value of the typeWellbore property.
     * 
     * @return
     *     possible object is
     *     {@link WellboreType }
     *     
     */
    public WellboreType getTypeWellbore() {
        return typeWellbore;
    }

    /**
     * Sets the value of the typeWellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellboreType }
     *     
     */
    public void setTypeWellbore(WellboreType value) {
        this.typeWellbore = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link WellboreShape }
     *     
     */
    public WellboreShape getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellboreShape }
     *     
     */
    public void setShape(WellboreShape value) {
        this.shape = value;
    }

    /**
     * Gets the value of the dTimKickoff property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimKickoff() {
        return dTimKickoff;
    }

    /**
     * Sets the value of the dTimKickoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimKickoff(XMLGregorianCalendar value) {
        this.dTimKickoff = value;
    }

    /**
     * Gets the value of the achievedTD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAchievedTD() {
        return achievedTD;
    }

    /**
     * Sets the value of the achievedTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAchievedTD(Boolean value) {
        this.achievedTD = value;
    }

    /**
     * Gets the value of the mdCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdCurrent() {
        return mdCurrent;
    }

    /**
     * Sets the value of the mdCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdCurrent(MeasuredDepthCoord value) {
        this.mdCurrent = value;
    }

    /**
     * Gets the value of the tvdCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdCurrent() {
        return tvdCurrent;
    }

    /**
     * Sets the value of the tvdCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdCurrent(WellVerticalDepthCoord value) {
        this.tvdCurrent = value;
    }

    /**
     * Gets the value of the mdKickoff property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdKickoff() {
        return mdKickoff;
    }

    /**
     * Sets the value of the mdKickoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdKickoff(MeasuredDepthCoord value) {
        this.mdKickoff = value;
    }

    /**
     * Gets the value of the tvdKickoff property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdKickoff() {
        return tvdKickoff;
    }

    /**
     * Sets the value of the tvdKickoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdKickoff(WellVerticalDepthCoord value) {
        this.tvdKickoff = value;
    }

    /**
     * Gets the value of the mdPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdPlanned() {
        return mdPlanned;
    }

    /**
     * Sets the value of the mdPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdPlanned(MeasuredDepthCoord value) {
        this.mdPlanned = value;
    }

    /**
     * Gets the value of the tvdPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdPlanned() {
        return tvdPlanned;
    }

    /**
     * Sets the value of the tvdPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdPlanned(WellVerticalDepthCoord value) {
        this.tvdPlanned = value;
    }

    /**
     * Gets the value of the mdSubSeaPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdSubSeaPlanned() {
        return mdSubSeaPlanned;
    }

    /**
     * Sets the value of the mdSubSeaPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdSubSeaPlanned(MeasuredDepthCoord value) {
        this.mdSubSeaPlanned = value;
    }

    /**
     * Gets the value of the tvdSubSeaPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdSubSeaPlanned() {
        return tvdSubSeaPlanned;
    }

    /**
     * Sets the value of the tvdSubSeaPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdSubSeaPlanned(WellVerticalDepthCoord value) {
        this.tvdSubSeaPlanned = value;
    }

    /**
     * Gets the value of the dayTarget property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getDayTarget() {
        return dayTarget;
    }

    /**
     * Sets the value of the dayTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setDayTarget(TimeMeasure value) {
        this.dayTarget = value;
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
