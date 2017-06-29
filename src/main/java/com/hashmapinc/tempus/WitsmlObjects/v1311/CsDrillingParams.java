package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Bottom hole assembly drilling parameters component schema 
 * 
 * <p>Java class for cs_drillingParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_drillingParams">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="eTimOpBit" type="{http://www.witsml.org/schemas/131}timeMeasure"/>
 *         <element name="mdHoleStart" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="mdHoleStop" type="{http://www.witsml.org/schemas/131}measuredDepthCoord"/>
 *         <element name="tubular" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
 *         <element name="hkldRot" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="overPull" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="slackOff" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="hkldUp" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="hkldDn" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="tqOnBotAv" type="{http://www.witsml.org/schemas/131}momentOfForceMeasure" minOccurs="0"/>
 *         <element name="tqOnBotMx" type="{http://www.witsml.org/schemas/131}momentOfForceMeasure" minOccurs="0"/>
 *         <element name="tqOnBotMn" type="{http://www.witsml.org/schemas/131}momentOfForceMeasure" minOccurs="0"/>
 *         <element name="tqOffBotAv" type="{http://www.witsml.org/schemas/131}momentOfForceMeasure" minOccurs="0"/>
 *         <element name="tqDhAv" type="{http://www.witsml.org/schemas/131}momentOfForceMeasure" minOccurs="0"/>
 *         <element name="wtAboveJar" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="wtBelowJar" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="wtMud" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="flowratePump" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="powBit" type="{http://www.witsml.org/schemas/131}powerMeasure" minOccurs="0"/>
 *         <element name="velNozzleAv" type="{http://www.witsml.org/schemas/131}velocityMeasure" minOccurs="0"/>
 *         <element name="presDropBit" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="cTimHold" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="cTimSteering" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="cTimDrillRot" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="cTimDrillSlid" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="cTimCirc" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="cTimReam" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="distDrillRot" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="distDrillSlid" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="distReam" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="distHold" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="distSteering" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="rpmAv" type="{http://www.witsml.org/schemas/131}anglePerTimeMeasure" minOccurs="0"/>
 *         <element name="rpmMx" type="{http://www.witsml.org/schemas/131}anglePerTimeMeasure" minOccurs="0"/>
 *         <element name="rpmMn" type="{http://www.witsml.org/schemas/131}anglePerTimeMeasure" minOccurs="0"/>
 *         <element name="rpmAvDh" type="{http://www.witsml.org/schemas/131}anglePerTimeMeasure" minOccurs="0"/>
 *         <element name="ropAv" type="{http://www.witsml.org/schemas/131}velocityMeasure" minOccurs="0"/>
 *         <element name="ropMx" type="{http://www.witsml.org/schemas/131}velocityMeasure" minOccurs="0"/>
 *         <element name="ropMn" type="{http://www.witsml.org/schemas/131}velocityMeasure" minOccurs="0"/>
 *         <element name="wobAv" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="wobMx" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="wobMn" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="wobAvDh" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="reasonTrip" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="objectiveBha" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="aziTop" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="aziBottom" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="inclStart" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="inclMx" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="inclMn" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="inclStop" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="tempMudDhMx" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="presPumpAv" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="flowrateBit" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="comments" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
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
@XmlType(name = "cs_drillingParams", propOrder = {
    "eTimOpBit",
    "mdHoleStart",
    "mdHoleStop",
    "tubular",
    "hkldRot",
    "overPull",
    "slackOff",
    "hkldUp",
    "hkldDn",
    "tqOnBotAv",
    "tqOnBotMx",
    "tqOnBotMn",
    "tqOffBotAv",
    "tqDhAv",
    "wtAboveJar",
    "wtBelowJar",
    "wtMud",
    "flowratePump",
    "powBit",
    "velNozzleAv",
    "presDropBit",
    "cTimHold",
    "cTimSteering",
    "cTimDrillRot",
    "cTimDrillSlid",
    "cTimCirc",
    "cTimReam",
    "distDrillRot",
    "distDrillSlid",
    "distReam",
    "distHold",
    "distSteering",
    "rpmAv",
    "rpmMx",
    "rpmMn",
    "rpmAvDh",
    "ropAv",
    "ropMx",
    "ropMn",
    "wobAv",
    "wobMx",
    "wobMn",
    "wobAvDh",
    "reasonTrip",
    "objectiveBha",
    "aziTop",
    "aziBottom",
    "inclStart",
    "inclMx",
    "inclMn",
    "inclStop",
    "tempMudDhMx",
    "presPumpAv",
    "flowrateBit",
    "comments"
})
public class CsDrillingParams {

    @XmlElement(required = true)
    protected TimeMeasure eTimOpBit;
    protected MeasuredDepthCoord mdHoleStart;
    @XmlElement(required = true)
    protected MeasuredDepthCoord mdHoleStop;
    protected RefNameString tubular;
    protected ForceMeasure hkldRot;
    protected ForceMeasure overPull;
    protected ForceMeasure slackOff;
    protected ForceMeasure hkldUp;
    protected ForceMeasure hkldDn;
    protected MomentOfForceMeasure tqOnBotAv;
    protected MomentOfForceMeasure tqOnBotMx;
    protected MomentOfForceMeasure tqOnBotMn;
    protected MomentOfForceMeasure tqOffBotAv;
    protected MomentOfForceMeasure tqDhAv;
    protected ForceMeasure wtAboveJar;
    protected ForceMeasure wtBelowJar;
    protected DensityMeasure wtMud;
    protected VolumeFlowRateMeasure flowratePump;
    protected PowerMeasure powBit;
    protected VelocityMeasure velNozzleAv;
    protected PressureMeasure presDropBit;
    protected TimeMeasure cTimHold;
    protected TimeMeasure cTimSteering;
    protected TimeMeasure cTimDrillRot;
    protected TimeMeasure cTimDrillSlid;
    protected TimeMeasure cTimCirc;
    protected TimeMeasure cTimReam;
    protected LengthMeasure distDrillRot;
    protected LengthMeasure distDrillSlid;
    protected LengthMeasure distReam;
    protected LengthMeasure distHold;
    protected LengthMeasure distSteering;
    protected AnglePerTimeMeasure rpmAv;
    protected AnglePerTimeMeasure rpmMx;
    protected AnglePerTimeMeasure rpmMn;
    protected AnglePerTimeMeasure rpmAvDh;
    protected VelocityMeasure ropAv;
    protected VelocityMeasure ropMx;
    protected VelocityMeasure ropMn;
    protected ForceMeasure wobAv;
    protected ForceMeasure wobMx;
    protected ForceMeasure wobMn;
    protected ForceMeasure wobAvDh;
    protected String reasonTrip;
    protected String objectiveBha;
    protected PlaneAngleMeasure aziTop;
    protected PlaneAngleMeasure aziBottom;
    protected PlaneAngleMeasure inclStart;
    protected PlaneAngleMeasure inclMx;
    protected PlaneAngleMeasure inclMn;
    protected PlaneAngleMeasure inclStop;
    protected ThermodynamicTemperatureMeasure tempMudDhMx;
    protected PressureMeasure presPumpAv;
    protected VolumeFlowRateMeasure flowrateBit;
    protected String comments;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the eTimOpBit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimOpBit() {
        return eTimOpBit;
    }

    /**
     * Sets the value of the eTimOpBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimOpBit(TimeMeasure value) {
        this.eTimOpBit = value;
    }

    /**
     * Gets the value of the mdHoleStart property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdHoleStart() {
        return mdHoleStart;
    }

    /**
     * Sets the value of the mdHoleStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdHoleStart(MeasuredDepthCoord value) {
        this.mdHoleStart = value;
    }

    /**
     * Gets the value of the mdHoleStop property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdHoleStop() {
        return mdHoleStop;
    }

    /**
     * Sets the value of the mdHoleStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdHoleStop(MeasuredDepthCoord value) {
        this.mdHoleStop = value;
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
     * Gets the value of the hkldRot property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getHkldRot() {
        return hkldRot;
    }

    /**
     * Sets the value of the hkldRot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setHkldRot(ForceMeasure value) {
        this.hkldRot = value;
    }

    /**
     * Gets the value of the overPull property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getOverPull() {
        return overPull;
    }

    /**
     * Sets the value of the overPull property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setOverPull(ForceMeasure value) {
        this.overPull = value;
    }

    /**
     * Gets the value of the slackOff property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getSlackOff() {
        return slackOff;
    }

    /**
     * Sets the value of the slackOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setSlackOff(ForceMeasure value) {
        this.slackOff = value;
    }

    /**
     * Gets the value of the hkldUp property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getHkldUp() {
        return hkldUp;
    }

    /**
     * Sets the value of the hkldUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setHkldUp(ForceMeasure value) {
        this.hkldUp = value;
    }

    /**
     * Gets the value of the hkldDn property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getHkldDn() {
        return hkldDn;
    }

    /**
     * Sets the value of the hkldDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setHkldDn(ForceMeasure value) {
        this.hkldDn = value;
    }

    /**
     * Gets the value of the tqOnBotAv property.
     * 
     * @return
     *     possible object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public MomentOfForceMeasure getTqOnBotAv() {
        return tqOnBotAv;
    }

    /**
     * Sets the value of the tqOnBotAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public void setTqOnBotAv(MomentOfForceMeasure value) {
        this.tqOnBotAv = value;
    }

    /**
     * Gets the value of the tqOnBotMx property.
     * 
     * @return
     *     possible object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public MomentOfForceMeasure getTqOnBotMx() {
        return tqOnBotMx;
    }

    /**
     * Sets the value of the tqOnBotMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public void setTqOnBotMx(MomentOfForceMeasure value) {
        this.tqOnBotMx = value;
    }

    /**
     * Gets the value of the tqOnBotMn property.
     * 
     * @return
     *     possible object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public MomentOfForceMeasure getTqOnBotMn() {
        return tqOnBotMn;
    }

    /**
     * Sets the value of the tqOnBotMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public void setTqOnBotMn(MomentOfForceMeasure value) {
        this.tqOnBotMn = value;
    }

    /**
     * Gets the value of the tqOffBotAv property.
     * 
     * @return
     *     possible object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public MomentOfForceMeasure getTqOffBotAv() {
        return tqOffBotAv;
    }

    /**
     * Sets the value of the tqOffBotAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public void setTqOffBotAv(MomentOfForceMeasure value) {
        this.tqOffBotAv = value;
    }

    /**
     * Gets the value of the tqDhAv property.
     * 
     * @return
     *     possible object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public MomentOfForceMeasure getTqDhAv() {
        return tqDhAv;
    }

    /**
     * Sets the value of the tqDhAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public void setTqDhAv(MomentOfForceMeasure value) {
        this.tqDhAv = value;
    }

    /**
     * Gets the value of the wtAboveJar property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getWtAboveJar() {
        return wtAboveJar;
    }

    /**
     * Sets the value of the wtAboveJar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setWtAboveJar(ForceMeasure value) {
        this.wtAboveJar = value;
    }

    /**
     * Gets the value of the wtBelowJar property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getWtBelowJar() {
        return wtBelowJar;
    }

    /**
     * Sets the value of the wtBelowJar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setWtBelowJar(ForceMeasure value) {
        this.wtBelowJar = value;
    }

    /**
     * Gets the value of the wtMud property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getWtMud() {
        return wtMud;
    }

    /**
     * Sets the value of the wtMud property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setWtMud(DensityMeasure value) {
        this.wtMud = value;
    }

    /**
     * Gets the value of the flowratePump property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowratePump() {
        return flowratePump;
    }

    /**
     * Sets the value of the flowratePump property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowratePump(VolumeFlowRateMeasure value) {
        this.flowratePump = value;
    }

    /**
     * Gets the value of the powBit property.
     * 
     * @return
     *     possible object is
     *     {@link PowerMeasure }
     *     
     */
    public PowerMeasure getPowBit() {
        return powBit;
    }

    /**
     * Sets the value of the powBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerMeasure }
     *     
     */
    public void setPowBit(PowerMeasure value) {
        this.powBit = value;
    }

    /**
     * Gets the value of the velNozzleAv property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getVelNozzleAv() {
        return velNozzleAv;
    }

    /**
     * Sets the value of the velNozzleAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setVelNozzleAv(VelocityMeasure value) {
        this.velNozzleAv = value;
    }

    /**
     * Gets the value of the presDropBit property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresDropBit() {
        return presDropBit;
    }

    /**
     * Sets the value of the presDropBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresDropBit(PressureMeasure value) {
        this.presDropBit = value;
    }

    /**
     * Gets the value of the cTimHold property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getCTimHold() {
        return cTimHold;
    }

    /**
     * Sets the value of the cTimHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setCTimHold(TimeMeasure value) {
        this.cTimHold = value;
    }

    /**
     * Gets the value of the cTimSteering property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getCTimSteering() {
        return cTimSteering;
    }

    /**
     * Sets the value of the cTimSteering property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setCTimSteering(TimeMeasure value) {
        this.cTimSteering = value;
    }

    /**
     * Gets the value of the cTimDrillRot property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getCTimDrillRot() {
        return cTimDrillRot;
    }

    /**
     * Sets the value of the cTimDrillRot property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setCTimDrillRot(TimeMeasure value) {
        this.cTimDrillRot = value;
    }

    /**
     * Gets the value of the cTimDrillSlid property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getCTimDrillSlid() {
        return cTimDrillSlid;
    }

    /**
     * Sets the value of the cTimDrillSlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setCTimDrillSlid(TimeMeasure value) {
        this.cTimDrillSlid = value;
    }

    /**
     * Gets the value of the cTimCirc property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getCTimCirc() {
        return cTimCirc;
    }

    /**
     * Sets the value of the cTimCirc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setCTimCirc(TimeMeasure value) {
        this.cTimCirc = value;
    }

    /**
     * Gets the value of the cTimReam property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getCTimReam() {
        return cTimReam;
    }

    /**
     * Sets the value of the cTimReam property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setCTimReam(TimeMeasure value) {
        this.cTimReam = value;
    }

    /**
     * Gets the value of the distDrillRot property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistDrillRot() {
        return distDrillRot;
    }

    /**
     * Sets the value of the distDrillRot property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistDrillRot(LengthMeasure value) {
        this.distDrillRot = value;
    }

    /**
     * Gets the value of the distDrillSlid property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistDrillSlid() {
        return distDrillSlid;
    }

    /**
     * Sets the value of the distDrillSlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistDrillSlid(LengthMeasure value) {
        this.distDrillSlid = value;
    }

    /**
     * Gets the value of the distReam property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistReam() {
        return distReam;
    }

    /**
     * Sets the value of the distReam property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistReam(LengthMeasure value) {
        this.distReam = value;
    }

    /**
     * Gets the value of the distHold property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistHold() {
        return distHold;
    }

    /**
     * Sets the value of the distHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistHold(LengthMeasure value) {
        this.distHold = value;
    }

    /**
     * Gets the value of the distSteering property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistSteering() {
        return distSteering;
    }

    /**
     * Sets the value of the distSteering property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistSteering(LengthMeasure value) {
        this.distSteering = value;
    }

    /**
     * Gets the value of the rpmAv property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public AnglePerTimeMeasure getRpmAv() {
        return rpmAv;
    }

    /**
     * Sets the value of the rpmAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public void setRpmAv(AnglePerTimeMeasure value) {
        this.rpmAv = value;
    }

    /**
     * Gets the value of the rpmMx property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public AnglePerTimeMeasure getRpmMx() {
        return rpmMx;
    }

    /**
     * Sets the value of the rpmMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public void setRpmMx(AnglePerTimeMeasure value) {
        this.rpmMx = value;
    }

    /**
     * Gets the value of the rpmMn property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public AnglePerTimeMeasure getRpmMn() {
        return rpmMn;
    }

    /**
     * Sets the value of the rpmMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public void setRpmMn(AnglePerTimeMeasure value) {
        this.rpmMn = value;
    }

    /**
     * Gets the value of the rpmAvDh property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public AnglePerTimeMeasure getRpmAvDh() {
        return rpmAvDh;
    }

    /**
     * Sets the value of the rpmAvDh property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public void setRpmAvDh(AnglePerTimeMeasure value) {
        this.rpmAvDh = value;
    }

    /**
     * Gets the value of the ropAv property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getRopAv() {
        return ropAv;
    }

    /**
     * Sets the value of the ropAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setRopAv(VelocityMeasure value) {
        this.ropAv = value;
    }

    /**
     * Gets the value of the ropMx property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getRopMx() {
        return ropMx;
    }

    /**
     * Sets the value of the ropMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setRopMx(VelocityMeasure value) {
        this.ropMx = value;
    }

    /**
     * Gets the value of the ropMn property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getRopMn() {
        return ropMn;
    }

    /**
     * Sets the value of the ropMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setRopMn(VelocityMeasure value) {
        this.ropMn = value;
    }

    /**
     * Gets the value of the wobAv property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getWobAv() {
        return wobAv;
    }

    /**
     * Sets the value of the wobAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setWobAv(ForceMeasure value) {
        this.wobAv = value;
    }

    /**
     * Gets the value of the wobMx property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getWobMx() {
        return wobMx;
    }

    /**
     * Sets the value of the wobMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setWobMx(ForceMeasure value) {
        this.wobMx = value;
    }

    /**
     * Gets the value of the wobMn property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getWobMn() {
        return wobMn;
    }

    /**
     * Sets the value of the wobMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setWobMn(ForceMeasure value) {
        this.wobMn = value;
    }

    /**
     * Gets the value of the wobAvDh property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getWobAvDh() {
        return wobAvDh;
    }

    /**
     * Sets the value of the wobAvDh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setWobAvDh(ForceMeasure value) {
        this.wobAvDh = value;
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
     * Gets the value of the aziTop property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getAziTop() {
        return aziTop;
    }

    /**
     * Sets the value of the aziTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setAziTop(PlaneAngleMeasure value) {
        this.aziTop = value;
    }

    /**
     * Gets the value of the aziBottom property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getAziBottom() {
        return aziBottom;
    }

    /**
     * Sets the value of the aziBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setAziBottom(PlaneAngleMeasure value) {
        this.aziBottom = value;
    }

    /**
     * Gets the value of the inclStart property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getInclStart() {
        return inclStart;
    }

    /**
     * Sets the value of the inclStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setInclStart(PlaneAngleMeasure value) {
        this.inclStart = value;
    }

    /**
     * Gets the value of the inclMx property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getInclMx() {
        return inclMx;
    }

    /**
     * Sets the value of the inclMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setInclMx(PlaneAngleMeasure value) {
        this.inclMx = value;
    }

    /**
     * Gets the value of the inclMn property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getInclMn() {
        return inclMn;
    }

    /**
     * Sets the value of the inclMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setInclMn(PlaneAngleMeasure value) {
        this.inclMn = value;
    }

    /**
     * Gets the value of the inclStop property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getInclStop() {
        return inclStop;
    }

    /**
     * Sets the value of the inclStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setInclStop(PlaneAngleMeasure value) {
        this.inclStop = value;
    }

    /**
     * Gets the value of the tempMudDhMx property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempMudDhMx() {
        return tempMudDhMx;
    }

    /**
     * Sets the value of the tempMudDhMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempMudDhMx(ThermodynamicTemperatureMeasure value) {
        this.tempMudDhMx = value;
    }

    /**
     * Gets the value of the presPumpAv property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresPumpAv() {
        return presPumpAv;
    }

    /**
     * Sets the value of the presPumpAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresPumpAv(PressureMeasure value) {
        this.presPumpAv = value;
    }

    /**
     * Gets the value of the flowrateBit property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowrateBit() {
        return flowrateBit;
    }

    /**
     * Sets the value of the flowrateBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowrateBit(VolumeFlowRateMeasure value) {
        this.flowrateBit = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
