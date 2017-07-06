package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  WITSML - Cement Stage Component Schema 
 * 
 * <p>Java class for cs_cementStage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_cementStage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="numStage" type="{http://www.witsml.org/schemas/131}positiveCount"/>
 *         <element name="typeStage" type="{http://www.witsml.org/schemas/131}str32"/>
 *         <element name="dTimMixStart" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dTimPumpStart" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dTimPumpEnd" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dTimDisplaceStart" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="mdTop" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="mdBottom" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="volExcess" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="flowrateDisplaceAv" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="flowrateDisplaceMx" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="presDisplace" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="volReturns" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="eTimMudCirculation" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="flowrateMudCirc" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="presMudCirc" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="flowrateEnd" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="cementingFluid" type="{http://www.witsml.org/schemas/131}cs_cementingFluid" minOccurs="0"/>
 *         <element name="afterFlowAnn" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="squeezeObj" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="squeezeObtained" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="mdString" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="mdTool" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="mdCoilTbg" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="volCsgIn" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volCsgOut" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="tailPipeUsed" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="diaTailPipe" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="tailPipePerf" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="presTbgStart" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presTbgEnd" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presCsgStart" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presCsgEnd" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presBackPressure" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presCoilTbgStart" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presCoilTbgEnd" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presBreakDown" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="flowrateBreakDown" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="presSqueezeAv" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presSqueezeEnd" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presSqueezeHeld" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="presSqueeze" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="eTimPresHeld" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="flowrateSqueezeAv" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="flowrateSqueezeMx" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="flowratePumpStart" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="flowratePumpEnd" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="pillBelowPlug" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="plugCatcher" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="mdCircOut" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="volCircPrior" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="typeOriginalMud" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="wtMud" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="visFunnelMud" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="pvMud" type="{http://www.witsml.org/schemas/131}dynamicViscosityMeasure" minOccurs="0"/>
 *         <element name="ypMud" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="gel10Sec" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="gel10Min" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="tempBHCT" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="tempBHST" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="volExcessMethod" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="mixMethod" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="densMeasBy" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="annFlowAfter" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="topPlug" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="botPlug" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="botPlugNumber" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="plugBumped" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="presPriorBump" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presBump" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presHeld" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="floatHeld" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="volMudLost" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="fluidDisplace" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="densDisplaceFluid" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="volDisplaceFluid" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
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
@XmlType(name = "cs_cementStage", propOrder = {
    "numStage",
    "typeStage",
    "dTimMixStart",
    "dTimPumpStart",
    "dTimPumpEnd",
    "dTimDisplaceStart",
    "mdTop",
    "mdBottom",
    "volExcess",
    "flowrateDisplaceAv",
    "flowrateDisplaceMx",
    "presDisplace",
    "volReturns",
    "eTimMudCirculation",
    "flowrateMudCirc",
    "presMudCirc",
    "flowrateEnd",
    "cementingFluid",
    "afterFlowAnn",
    "squeezeObj",
    "squeezeObtained",
    "mdString",
    "mdTool",
    "mdCoilTbg",
    "volCsgIn",
    "volCsgOut",
    "tailPipeUsed",
    "diaTailPipe",
    "tailPipePerf",
    "presTbgStart",
    "presTbgEnd",
    "presCsgStart",
    "presCsgEnd",
    "presBackPressure",
    "presCoilTbgStart",
    "presCoilTbgEnd",
    "presBreakDown",
    "flowrateBreakDown",
    "presSqueezeAv",
    "presSqueezeEnd",
    "presSqueezeHeld",
    "presSqueeze",
    "eTimPresHeld",
    "flowrateSqueezeAv",
    "flowrateSqueezeMx",
    "flowratePumpStart",
    "flowratePumpEnd",
    "pillBelowPlug",
    "plugCatcher",
    "mdCircOut",
    "volCircPrior",
    "typeOriginalMud",
    "wtMud",
    "visFunnelMud",
    "pvMud",
    "ypMud",
    "gel10Sec",
    "gel10Min",
    "tempBHCT",
    "tempBHST",
    "volExcessMethod",
    "mixMethod",
    "densMeasBy",
    "annFlowAfter",
    "topPlug",
    "botPlug",
    "botPlugNumber",
    "plugBumped",
    "presPriorBump",
    "presBump",
    "presHeld",
    "floatHeld",
    "volMudLost",
    "fluidDisplace",
    "densDisplaceFluid",
    "volDisplaceFluid"
})
public class CsCementStage {

    protected short numStage;
    @XmlElement(required = true)
    protected String typeStage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimMixStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimPumpStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimPumpEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimDisplaceStart;
    protected MeasuredDepthCoord mdTop;
    protected MeasuredDepthCoord mdBottom;
    protected VolumeMeasure volExcess;
    protected VolumeFlowRateMeasure flowrateDisplaceAv;
    protected VolumeFlowRateMeasure flowrateDisplaceMx;
    protected PressureMeasure presDisplace;
    protected VolumeMeasure volReturns;
    protected TimeMeasure eTimMudCirculation;
    protected VolumeFlowRateMeasure flowrateMudCirc;
    protected PressureMeasure presMudCirc;
    protected VolumeFlowRateMeasure flowrateEnd;
    protected CsCementingFluid cementingFluid;
    protected Boolean afterFlowAnn;
    protected String squeezeObj;
    protected Boolean squeezeObtained;
    protected MeasuredDepthCoord mdString;
    protected MeasuredDepthCoord mdTool;
    protected MeasuredDepthCoord mdCoilTbg;
    protected VolumeMeasure volCsgIn;
    protected VolumeMeasure volCsgOut;
    protected Boolean tailPipeUsed;
    protected LengthMeasure diaTailPipe;
    protected Boolean tailPipePerf;
    protected PressureMeasure presTbgStart;
    protected PressureMeasure presTbgEnd;
    protected PressureMeasure presCsgStart;
    protected PressureMeasure presCsgEnd;
    protected PressureMeasure presBackPressure;
    protected PressureMeasure presCoilTbgStart;
    protected PressureMeasure presCoilTbgEnd;
    protected PressureMeasure presBreakDown;
    protected VolumeFlowRateMeasure flowrateBreakDown;
    protected PressureMeasure presSqueezeAv;
    protected PressureMeasure presSqueezeEnd;
    protected Boolean presSqueezeHeld;
    protected PressureMeasure presSqueeze;
    protected TimeMeasure eTimPresHeld;
    protected VolumeFlowRateMeasure flowrateSqueezeAv;
    protected VolumeFlowRateMeasure flowrateSqueezeMx;
    protected VolumeFlowRateMeasure flowratePumpStart;
    protected VolumeFlowRateMeasure flowratePumpEnd;
    protected Boolean pillBelowPlug;
    protected Boolean plugCatcher;
    protected MeasuredDepthCoord mdCircOut;
    protected VolumeMeasure volCircPrior;
    protected String typeOriginalMud;
    protected DensityMeasure wtMud;
    protected TimeMeasure visFunnelMud;
    protected DynamicViscosityMeasure pvMud;
    protected PressureMeasure ypMud;
    protected PressureMeasure gel10Sec;
    protected PressureMeasure gel10Min;
    protected ThermodynamicTemperatureMeasure tempBHCT;
    protected ThermodynamicTemperatureMeasure tempBHST;
    protected String volExcessMethod;
    protected String mixMethod;
    protected String densMeasBy;
    protected Boolean annFlowAfter;
    protected Boolean topPlug;
    protected Boolean botPlug;
    protected Short botPlugNumber;
    protected Boolean plugBumped;
    protected PressureMeasure presPriorBump;
    protected PressureMeasure presBump;
    protected PressureMeasure presHeld;
    protected Boolean floatHeld;
    protected VolumeMeasure volMudLost;
    protected String fluidDisplace;
    protected DensityMeasure densDisplaceFluid;
    protected VolumeMeasure volDisplaceFluid;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the numStage property.
     * 
     */
    public short getNumStage() {
        return numStage;
    }

    /**
     * Sets the value of the numStage property.
     * 
     */
    public void setNumStage(short value) {
        this.numStage = value;
    }

    /**
     * Gets the value of the typeStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeStage() {
        return typeStage;
    }

    /**
     * Sets the value of the typeStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeStage(String value) {
        this.typeStage = value;
    }

    /**
     * Gets the value of the dTimMixStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimMixStart() {
        return dTimMixStart;
    }

    /**
     * Sets the value of the dTimMixStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimMixStart(XMLGregorianCalendar value) {
        this.dTimMixStart = value;
    }

    /**
     * Gets the value of the dTimPumpStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimPumpStart() {
        return dTimPumpStart;
    }

    /**
     * Sets the value of the dTimPumpStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimPumpStart(XMLGregorianCalendar value) {
        this.dTimPumpStart = value;
    }

    /**
     * Gets the value of the dTimPumpEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimPumpEnd() {
        return dTimPumpEnd;
    }

    /**
     * Sets the value of the dTimPumpEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimPumpEnd(XMLGregorianCalendar value) {
        this.dTimPumpEnd = value;
    }

    /**
     * Gets the value of the dTimDisplaceStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimDisplaceStart() {
        return dTimDisplaceStart;
    }

    /**
     * Sets the value of the dTimDisplaceStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimDisplaceStart(XMLGregorianCalendar value) {
        this.dTimDisplaceStart = value;
    }

    /**
     * Gets the value of the mdTop property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdTop() {
        return mdTop;
    }

    /**
     * Sets the value of the mdTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdTop(MeasuredDepthCoord value) {
        this.mdTop = value;
    }

    /**
     * Gets the value of the mdBottom property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBottom() {
        return mdBottom;
    }

    /**
     * Sets the value of the mdBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBottom(MeasuredDepthCoord value) {
        this.mdBottom = value;
    }

    /**
     * Gets the value of the volExcess property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolExcess() {
        return volExcess;
    }

    /**
     * Sets the value of the volExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolExcess(VolumeMeasure value) {
        this.volExcess = value;
    }

    /**
     * Gets the value of the flowrateDisplaceAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowrateDisplaceAv() {
        return flowrateDisplaceAv;
    }

    /**
     * Sets the value of the flowrateDisplaceAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowrateDisplaceAv(VolumeFlowRateMeasure value) {
        this.flowrateDisplaceAv = value;
    }

    /**
     * Gets the value of the flowrateDisplaceMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowrateDisplaceMx() {
        return flowrateDisplaceMx;
    }

    /**
     * Sets the value of the flowrateDisplaceMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowrateDisplaceMx(VolumeFlowRateMeasure value) {
        this.flowrateDisplaceMx = value;
    }

    /**
     * Gets the value of the presDisplace property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresDisplace() {
        return presDisplace;
    }

    /**
     * Sets the value of the presDisplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresDisplace(PressureMeasure value) {
        this.presDisplace = value;
    }

    /**
     * Gets the value of the volReturns property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolReturns() {
        return volReturns;
    }

    /**
     * Sets the value of the volReturns property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolReturns(VolumeMeasure value) {
        this.volReturns = value;
    }

    /**
     * Gets the value of the eTimMudCirculation property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimMudCirculation() {
        return eTimMudCirculation;
    }

    /**
     * Sets the value of the eTimMudCirculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimMudCirculation(TimeMeasure value) {
        this.eTimMudCirculation = value;
    }

    /**
     * Gets the value of the flowrateMudCirc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowrateMudCirc() {
        return flowrateMudCirc;
    }

    /**
     * Sets the value of the flowrateMudCirc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowrateMudCirc(VolumeFlowRateMeasure value) {
        this.flowrateMudCirc = value;
    }

    /**
     * Gets the value of the presMudCirc property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresMudCirc() {
        return presMudCirc;
    }

    /**
     * Sets the value of the presMudCirc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresMudCirc(PressureMeasure value) {
        this.presMudCirc = value;
    }

    /**
     * Gets the value of the flowrateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowrateEnd() {
        return flowrateEnd;
    }

    /**
     * Sets the value of the flowrateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowrateEnd(VolumeFlowRateMeasure value) {
        this.flowrateEnd = value;
    }

    /**
     * Gets the value of the cementingFluid property.
     * 
     * @return
     *     possible object is
     *     {@link CsCementingFluid }
     *     
     */
    public CsCementingFluid getCementingFluid() {
        return cementingFluid;
    }

    /**
     * Sets the value of the cementingFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCementingFluid }
     *     
     */
    public void setCementingFluid(CsCementingFluid value) {
        this.cementingFluid = value;
    }

    /**
     * Gets the value of the afterFlowAnn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAfterFlowAnn() {
        return afterFlowAnn;
    }

    /**
     * Sets the value of the afterFlowAnn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAfterFlowAnn(Boolean value) {
        this.afterFlowAnn = value;
    }

    /**
     * Gets the value of the squeezeObj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqueezeObj() {
        return squeezeObj;
    }

    /**
     * Sets the value of the squeezeObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqueezeObj(String value) {
        this.squeezeObj = value;
    }

    /**
     * Gets the value of the squeezeObtained property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSqueezeObtained() {
        return squeezeObtained;
    }

    /**
     * Sets the value of the squeezeObtained property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSqueezeObtained(Boolean value) {
        this.squeezeObtained = value;
    }

    /**
     * Gets the value of the mdString property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdString() {
        return mdString;
    }

    /**
     * Sets the value of the mdString property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdString(MeasuredDepthCoord value) {
        this.mdString = value;
    }

    /**
     * Gets the value of the mdTool property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdTool() {
        return mdTool;
    }

    /**
     * Sets the value of the mdTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdTool(MeasuredDepthCoord value) {
        this.mdTool = value;
    }

    /**
     * Gets the value of the mdCoilTbg property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdCoilTbg() {
        return mdCoilTbg;
    }

    /**
     * Sets the value of the mdCoilTbg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdCoilTbg(MeasuredDepthCoord value) {
        this.mdCoilTbg = value;
    }

    /**
     * Gets the value of the volCsgIn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolCsgIn() {
        return volCsgIn;
    }

    /**
     * Sets the value of the volCsgIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolCsgIn(VolumeMeasure value) {
        this.volCsgIn = value;
    }

    /**
     * Gets the value of the volCsgOut property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolCsgOut() {
        return volCsgOut;
    }

    /**
     * Sets the value of the volCsgOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolCsgOut(VolumeMeasure value) {
        this.volCsgOut = value;
    }

    /**
     * Gets the value of the tailPipeUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTailPipeUsed() {
        return tailPipeUsed;
    }

    /**
     * Sets the value of the tailPipeUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTailPipeUsed(Boolean value) {
        this.tailPipeUsed = value;
    }

    /**
     * Gets the value of the diaTailPipe property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaTailPipe() {
        return diaTailPipe;
    }

    /**
     * Sets the value of the diaTailPipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaTailPipe(LengthMeasure value) {
        this.diaTailPipe = value;
    }

    /**
     * Gets the value of the tailPipePerf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTailPipePerf() {
        return tailPipePerf;
    }

    /**
     * Sets the value of the tailPipePerf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTailPipePerf(Boolean value) {
        this.tailPipePerf = value;
    }

    /**
     * Gets the value of the presTbgStart property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresTbgStart() {
        return presTbgStart;
    }

    /**
     * Sets the value of the presTbgStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresTbgStart(PressureMeasure value) {
        this.presTbgStart = value;
    }

    /**
     * Gets the value of the presTbgEnd property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresTbgEnd() {
        return presTbgEnd;
    }

    /**
     * Sets the value of the presTbgEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresTbgEnd(PressureMeasure value) {
        this.presTbgEnd = value;
    }

    /**
     * Gets the value of the presCsgStart property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresCsgStart() {
        return presCsgStart;
    }

    /**
     * Sets the value of the presCsgStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresCsgStart(PressureMeasure value) {
        this.presCsgStart = value;
    }

    /**
     * Gets the value of the presCsgEnd property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresCsgEnd() {
        return presCsgEnd;
    }

    /**
     * Sets the value of the presCsgEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresCsgEnd(PressureMeasure value) {
        this.presCsgEnd = value;
    }

    /**
     * Gets the value of the presBackPressure property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresBackPressure() {
        return presBackPressure;
    }

    /**
     * Sets the value of the presBackPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresBackPressure(PressureMeasure value) {
        this.presBackPressure = value;
    }

    /**
     * Gets the value of the presCoilTbgStart property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresCoilTbgStart() {
        return presCoilTbgStart;
    }

    /**
     * Sets the value of the presCoilTbgStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresCoilTbgStart(PressureMeasure value) {
        this.presCoilTbgStart = value;
    }

    /**
     * Gets the value of the presCoilTbgEnd property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresCoilTbgEnd() {
        return presCoilTbgEnd;
    }

    /**
     * Sets the value of the presCoilTbgEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresCoilTbgEnd(PressureMeasure value) {
        this.presCoilTbgEnd = value;
    }

    /**
     * Gets the value of the presBreakDown property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresBreakDown() {
        return presBreakDown;
    }

    /**
     * Sets the value of the presBreakDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresBreakDown(PressureMeasure value) {
        this.presBreakDown = value;
    }

    /**
     * Gets the value of the flowrateBreakDown property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowrateBreakDown() {
        return flowrateBreakDown;
    }

    /**
     * Sets the value of the flowrateBreakDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowrateBreakDown(VolumeFlowRateMeasure value) {
        this.flowrateBreakDown = value;
    }

    /**
     * Gets the value of the presSqueezeAv property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresSqueezeAv() {
        return presSqueezeAv;
    }

    /**
     * Sets the value of the presSqueezeAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresSqueezeAv(PressureMeasure value) {
        this.presSqueezeAv = value;
    }

    /**
     * Gets the value of the presSqueezeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresSqueezeEnd() {
        return presSqueezeEnd;
    }

    /**
     * Sets the value of the presSqueezeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresSqueezeEnd(PressureMeasure value) {
        this.presSqueezeEnd = value;
    }

    /**
     * Gets the value of the presSqueezeHeld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPresSqueezeHeld() {
        return presSqueezeHeld;
    }

    /**
     * Sets the value of the presSqueezeHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPresSqueezeHeld(Boolean value) {
        this.presSqueezeHeld = value;
    }

    /**
     * Gets the value of the presSqueeze property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresSqueeze() {
        return presSqueeze;
    }

    /**
     * Sets the value of the presSqueeze property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresSqueeze(PressureMeasure value) {
        this.presSqueeze = value;
    }

    /**
     * Gets the value of the eTimPresHeld property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimPresHeld() {
        return eTimPresHeld;
    }

    /**
     * Sets the value of the eTimPresHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimPresHeld(TimeMeasure value) {
        this.eTimPresHeld = value;
    }

    /**
     * Gets the value of the flowrateSqueezeAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowrateSqueezeAv() {
        return flowrateSqueezeAv;
    }

    /**
     * Sets the value of the flowrateSqueezeAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowrateSqueezeAv(VolumeFlowRateMeasure value) {
        this.flowrateSqueezeAv = value;
    }

    /**
     * Gets the value of the flowrateSqueezeMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowrateSqueezeMx() {
        return flowrateSqueezeMx;
    }

    /**
     * Sets the value of the flowrateSqueezeMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowrateSqueezeMx(VolumeFlowRateMeasure value) {
        this.flowrateSqueezeMx = value;
    }

    /**
     * Gets the value of the flowratePumpStart property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowratePumpStart() {
        return flowratePumpStart;
    }

    /**
     * Sets the value of the flowratePumpStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowratePumpStart(VolumeFlowRateMeasure value) {
        this.flowratePumpStart = value;
    }

    /**
     * Gets the value of the flowratePumpEnd property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowratePumpEnd() {
        return flowratePumpEnd;
    }

    /**
     * Sets the value of the flowratePumpEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowratePumpEnd(VolumeFlowRateMeasure value) {
        this.flowratePumpEnd = value;
    }

    /**
     * Gets the value of the pillBelowPlug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPillBelowPlug() {
        return pillBelowPlug;
    }

    /**
     * Sets the value of the pillBelowPlug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPillBelowPlug(Boolean value) {
        this.pillBelowPlug = value;
    }

    /**
     * Gets the value of the plugCatcher property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlugCatcher() {
        return plugCatcher;
    }

    /**
     * Sets the value of the plugCatcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlugCatcher(Boolean value) {
        this.plugCatcher = value;
    }

    /**
     * Gets the value of the mdCircOut property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdCircOut() {
        return mdCircOut;
    }

    /**
     * Sets the value of the mdCircOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdCircOut(MeasuredDepthCoord value) {
        this.mdCircOut = value;
    }

    /**
     * Gets the value of the volCircPrior property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolCircPrior() {
        return volCircPrior;
    }

    /**
     * Sets the value of the volCircPrior property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolCircPrior(VolumeMeasure value) {
        this.volCircPrior = value;
    }

    /**
     * Gets the value of the typeOriginalMud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOriginalMud() {
        return typeOriginalMud;
    }

    /**
     * Sets the value of the typeOriginalMud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOriginalMud(String value) {
        this.typeOriginalMud = value;
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
     * Gets the value of the visFunnelMud property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getVisFunnelMud() {
        return visFunnelMud;
    }

    /**
     * Sets the value of the visFunnelMud property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setVisFunnelMud(TimeMeasure value) {
        this.visFunnelMud = value;
    }

    /**
     * Gets the value of the pvMud property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicViscosityMeasure }
     *     
     */
    public DynamicViscosityMeasure getPvMud() {
        return pvMud;
    }

    /**
     * Sets the value of the pvMud property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicViscosityMeasure }
     *     
     */
    public void setPvMud(DynamicViscosityMeasure value) {
        this.pvMud = value;
    }

    /**
     * Gets the value of the ypMud property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getYpMud() {
        return ypMud;
    }

    /**
     * Sets the value of the ypMud property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setYpMud(PressureMeasure value) {
        this.ypMud = value;
    }

    /**
     * Gets the value of the gel10Sec property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getGel10Sec() {
        return gel10Sec;
    }

    /**
     * Sets the value of the gel10Sec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setGel10Sec(PressureMeasure value) {
        this.gel10Sec = value;
    }

    /**
     * Gets the value of the gel10Min property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getGel10Min() {
        return gel10Min;
    }

    /**
     * Sets the value of the gel10Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setGel10Min(PressureMeasure value) {
        this.gel10Min = value;
    }

    /**
     * Gets the value of the tempBHCT property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempBHCT() {
        return tempBHCT;
    }

    /**
     * Sets the value of the tempBHCT property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempBHCT(ThermodynamicTemperatureMeasure value) {
        this.tempBHCT = value;
    }

    /**
     * Gets the value of the tempBHST property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempBHST() {
        return tempBHST;
    }

    /**
     * Sets the value of the tempBHST property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempBHST(ThermodynamicTemperatureMeasure value) {
        this.tempBHST = value;
    }

    /**
     * Gets the value of the volExcessMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolExcessMethod() {
        return volExcessMethod;
    }

    /**
     * Sets the value of the volExcessMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolExcessMethod(String value) {
        this.volExcessMethod = value;
    }

    /**
     * Gets the value of the mixMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMixMethod() {
        return mixMethod;
    }

    /**
     * Sets the value of the mixMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMixMethod(String value) {
        this.mixMethod = value;
    }

    /**
     * Gets the value of the densMeasBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDensMeasBy() {
        return densMeasBy;
    }

    /**
     * Sets the value of the densMeasBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDensMeasBy(String value) {
        this.densMeasBy = value;
    }

    /**
     * Gets the value of the annFlowAfter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnFlowAfter() {
        return annFlowAfter;
    }

    /**
     * Sets the value of the annFlowAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnnFlowAfter(Boolean value) {
        this.annFlowAfter = value;
    }

    /**
     * Gets the value of the topPlug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopPlug() {
        return topPlug;
    }

    /**
     * Sets the value of the topPlug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopPlug(Boolean value) {
        this.topPlug = value;
    }

    /**
     * Gets the value of the botPlug property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBotPlug() {
        return botPlug;
    }

    /**
     * Sets the value of the botPlug property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBotPlug(Boolean value) {
        this.botPlug = value;
    }

    /**
     * Gets the value of the botPlugNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBotPlugNumber() {
        return botPlugNumber;
    }

    /**
     * Sets the value of the botPlugNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBotPlugNumber(Short value) {
        this.botPlugNumber = value;
    }

    /**
     * Gets the value of the plugBumped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlugBumped() {
        return plugBumped;
    }

    /**
     * Sets the value of the plugBumped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlugBumped(Boolean value) {
        this.plugBumped = value;
    }

    /**
     * Gets the value of the presPriorBump property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresPriorBump() {
        return presPriorBump;
    }

    /**
     * Sets the value of the presPriorBump property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresPriorBump(PressureMeasure value) {
        this.presPriorBump = value;
    }

    /**
     * Gets the value of the presBump property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresBump() {
        return presBump;
    }

    /**
     * Sets the value of the presBump property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresBump(PressureMeasure value) {
        this.presBump = value;
    }

    /**
     * Gets the value of the presHeld property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresHeld() {
        return presHeld;
    }

    /**
     * Sets the value of the presHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresHeld(PressureMeasure value) {
        this.presHeld = value;
    }

    /**
     * Gets the value of the floatHeld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFloatHeld() {
        return floatHeld;
    }

    /**
     * Sets the value of the floatHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFloatHeld(Boolean value) {
        this.floatHeld = value;
    }

    /**
     * Gets the value of the volMudLost property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolMudLost() {
        return volMudLost;
    }

    /**
     * Sets the value of the volMudLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolMudLost(VolumeMeasure value) {
        this.volMudLost = value;
    }

    /**
     * Gets the value of the fluidDisplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluidDisplace() {
        return fluidDisplace;
    }

    /**
     * Sets the value of the fluidDisplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluidDisplace(String value) {
        this.fluidDisplace = value;
    }

    /**
     * Gets the value of the densDisplaceFluid property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensDisplaceFluid() {
        return densDisplaceFluid;
    }

    /**
     * Sets the value of the densDisplaceFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensDisplaceFluid(DensityMeasure value) {
        this.densDisplaceFluid = value;
    }

    /**
     * Gets the value of the volDisplaceFluid property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolDisplaceFluid() {
        return volDisplaceFluid;
    }

    /**
     * Sets the value of the volDisplaceFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolDisplaceFluid(VolumeMeasure value) {
        this.volDisplaceFluid = value;
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
