package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obj_formationMarker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_formationMarker">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_formationMarker" minOccurs="0"/>
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
@XmlType(name = "obj_formationMarker", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "mdPrognosed",
    "tvdPrognosed",
    "mdTopSample",
    "tvdTopSample",
    "thicknessBed",
    "thicknessApparent",
    "thicknessPerpen",
    "mdLogSample",
    "tvdLogSample",
    "dip",
    "dipDirection",
    "chronostratigraphic",
    "nameFormation",
    "description",
    "commonData",
    "customData"
})
public class ObjFormationMarker {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    protected MeasuredDepthCoord mdPrognosed;
    protected WellVerticalDepthCoord tvdPrognosed;
    protected MeasuredDepthCoord mdTopSample;
    protected WellVerticalDepthCoord tvdTopSample;
    protected LengthMeasure thicknessBed;
    protected LengthMeasure thicknessApparent;
    protected LengthMeasure thicknessPerpen;
    protected MeasuredDepthCoord mdLogSample;
    protected WellVerticalDepthCoord tvdLogSample;
    protected PlaneAngleMeasure dip;
    protected PlaneAngleMeasure dipDirection;
    protected String chronostratigraphic;
    protected String nameFormation;
    protected String description;
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
     * Gets the value of the mdPrognosed property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdPrognosed() {
        return mdPrognosed;
    }

    /**
     * Sets the value of the mdPrognosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdPrognosed(MeasuredDepthCoord value) {
        this.mdPrognosed = value;
    }

    /**
     * Gets the value of the tvdPrognosed property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdPrognosed() {
        return tvdPrognosed;
    }

    /**
     * Sets the value of the tvdPrognosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdPrognosed(WellVerticalDepthCoord value) {
        this.tvdPrognosed = value;
    }

    /**
     * Gets the value of the mdTopSample property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdTopSample() {
        return mdTopSample;
    }

    /**
     * Sets the value of the mdTopSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdTopSample(MeasuredDepthCoord value) {
        this.mdTopSample = value;
    }

    /**
     * Gets the value of the tvdTopSample property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdTopSample() {
        return tvdTopSample;
    }

    /**
     * Sets the value of the tvdTopSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdTopSample(WellVerticalDepthCoord value) {
        this.tvdTopSample = value;
    }

    /**
     * Gets the value of the thicknessBed property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getThicknessBed() {
        return thicknessBed;
    }

    /**
     * Sets the value of the thicknessBed property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setThicknessBed(LengthMeasure value) {
        this.thicknessBed = value;
    }

    /**
     * Gets the value of the thicknessApparent property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getThicknessApparent() {
        return thicknessApparent;
    }

    /**
     * Sets the value of the thicknessApparent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setThicknessApparent(LengthMeasure value) {
        this.thicknessApparent = value;
    }

    /**
     * Gets the value of the thicknessPerpen property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getThicknessPerpen() {
        return thicknessPerpen;
    }

    /**
     * Sets the value of the thicknessPerpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setThicknessPerpen(LengthMeasure value) {
        this.thicknessPerpen = value;
    }

    /**
     * Gets the value of the mdLogSample property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdLogSample() {
        return mdLogSample;
    }

    /**
     * Sets the value of the mdLogSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdLogSample(MeasuredDepthCoord value) {
        this.mdLogSample = value;
    }

    /**
     * Gets the value of the tvdLogSample property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdLogSample() {
        return tvdLogSample;
    }

    /**
     * Sets the value of the tvdLogSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdLogSample(WellVerticalDepthCoord value) {
        this.tvdLogSample = value;
    }

    /**
     * Gets the value of the dip property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getDip() {
        return dip;
    }

    /**
     * Sets the value of the dip property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setDip(PlaneAngleMeasure value) {
        this.dip = value;
    }

    /**
     * Gets the value of the dipDirection property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getDipDirection() {
        return dipDirection;
    }

    /**
     * Sets the value of the dipDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setDipDirection(PlaneAngleMeasure value) {
        this.dipDirection = value;
    }

    /**
     * Gets the value of the chronostratigraphic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChronostratigraphic() {
        return chronostratigraphic;
    }

    /**
     * Sets the value of the chronostratigraphic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChronostratigraphic(String value) {
        this.chronostratigraphic = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
