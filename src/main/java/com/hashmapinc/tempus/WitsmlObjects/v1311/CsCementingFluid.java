package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Cementing Fluid Component Schema 
 * 
 * <p>Java class for cs_cementingFluid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_cementingFluid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="typeFluid" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="fluidIndex" type="{http://www.witsml.org/schemas/131}positiveCount" minOccurs="0"/>
 *         <element name="descFluid" type="{http://www.witsml.org/schemas/131}shortDescriptionString" minOccurs="0"/>
 *         <element name="purpose" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="classSlurryDryBlend" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="mdFluidTop" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="mdFluidBottom" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="sourceWater" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="volWater" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volCement" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="ratioMixWater" type="{http://www.witsml.org/schemas/131}specificVolumeMeasure" minOccurs="0"/>
 *         <element name="volFluid" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="cementPumpSchedule" type="{http://www.witsml.org/schemas/131}cs_cementPumpSchedule" minOccurs="0"/>
 *         <element name="excessPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="volYield" type="{http://www.witsml.org/schemas/131}specificVolumeMeasure" minOccurs="0"/>
 *         <element name="density" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="solidVolumeFraction" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="volPumped" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volOther" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="fluidRheologicalModel" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="vis" type="{http://www.witsml.org/schemas/131}dynamicViscosityMeasure" minOccurs="0"/>
 *         <element name="yp" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="n" type="{http://www.witsml.org/schemas/131}dimensionlessMeasure" minOccurs="0"/>
 *         <element name="k" type="{http://www.witsml.org/schemas/131}dimensionlessMeasure" minOccurs="0"/>
 *         <element name="gel10SecReading" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="gel10SecStrength" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="gel1MinReading" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="gel1MinStrength" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="gel10MinReading" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="gel10MinStrength" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="typeBaseFluid" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="densBaseFluid" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="dryBlendName" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="dryBlendDescription" type="{http://www.witsml.org/schemas/131}shortDescriptionString" minOccurs="0"/>
 *         <element name="massDryBlend" type="{http://www.witsml.org/schemas/131}massMeasure" minOccurs="0"/>
 *         <element name="densDryBlend" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="massSackDryBlend" type="{http://www.witsml.org/schemas/131}massMeasure" minOccurs="0"/>
 *         <element name="cementAdditive" type="{http://www.witsml.org/schemas/131}cs_cementAdditive" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="foamUsed" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="typeGasFoam" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="volGasFoam" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="ratioConstGasMethodAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="densConstGasMethod" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="ratioConstGasMethodStart" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ratioConstGasMethodEnd" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="densConstGasFoam" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="eTimThickening" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="tempThickening" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="presTestThickening" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="consTestThickening" type="{http://www.witsml.org/schemas/131}dimensionlessMeasure" minOccurs="0"/>
 *         <element name="pcFreeWater" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="tempFreeWater" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="volTestFluidLoss" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="tempFluidLoss" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="presTestFluidLoss" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="timeFluidLoss" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="volAPIFluidLoss" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="eTimComprStren1" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="eTimComprStren2" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="presComprStren1" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presComprStren2" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="tempComprStren1" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="tempComprStren2" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="densAtPres" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="volReserved" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volTotSlurry" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_cementingFluid", propOrder = {
    "typeFluid",
    "fluidIndex",
    "descFluid",
    "purpose",
    "classSlurryDryBlend",
    "mdFluidTop",
    "mdFluidBottom",
    "sourceWater",
    "volWater",
    "volCement",
    "ratioMixWater",
    "volFluid",
    "cementPumpSchedule",
    "excessPc",
    "volYield",
    "density",
    "solidVolumeFraction",
    "volPumped",
    "volOther",
    "fluidRheologicalModel",
    "vis",
    "yp",
    "n",
    "k",
    "gel10SecReading",
    "gel10SecStrength",
    "gel1MinReading",
    "gel1MinStrength",
    "gel10MinReading",
    "gel10MinStrength",
    "typeBaseFluid",
    "densBaseFluid",
    "dryBlendName",
    "dryBlendDescription",
    "massDryBlend",
    "densDryBlend",
    "massSackDryBlend",
    "cementAdditive",
    "foamUsed",
    "typeGasFoam",
    "volGasFoam",
    "ratioConstGasMethodAv",
    "densConstGasMethod",
    "ratioConstGasMethodStart",
    "ratioConstGasMethodEnd",
    "densConstGasFoam",
    "eTimThickening",
    "tempThickening",
    "presTestThickening",
    "consTestThickening",
    "pcFreeWater",
    "tempFreeWater",
    "volTestFluidLoss",
    "tempFluidLoss",
    "presTestFluidLoss",
    "timeFluidLoss",
    "volAPIFluidLoss",
    "eTimComprStren1",
    "eTimComprStren2",
    "presComprStren1",
    "presComprStren2",
    "tempComprStren1",
    "tempComprStren2",
    "densAtPres",
    "volReserved",
    "volTotSlurry"
})
public class CsCementingFluid {

    protected String typeFluid;
    protected Short fluidIndex;
    protected String descFluid;
    protected String purpose;
    protected String classSlurryDryBlend;
    protected MeasuredDepthCoord mdFluidTop;
    protected MeasuredDepthCoord mdFluidBottom;
    protected String sourceWater;
    protected VolumeMeasure volWater;
    protected VolumeMeasure volCement;
    protected SpecificVolumeMeasure ratioMixWater;
    protected VolumeMeasure volFluid;
    protected CsCementPumpSchedule cementPumpSchedule;
    protected VolumePerVolumeMeasure excessPc;
    protected SpecificVolumeMeasure volYield;
    protected DensityMeasure density;
    protected VolumePerVolumeMeasure solidVolumeFraction;
    protected VolumeMeasure volPumped;
    protected VolumeMeasure volOther;
    protected String fluidRheologicalModel;
    protected DynamicViscosityMeasure vis;
    protected PressureMeasure yp;
    protected DimensionlessMeasure n;
    protected DimensionlessMeasure k;
    protected PlaneAngleMeasure gel10SecReading;
    protected PressureMeasure gel10SecStrength;
    protected PlaneAngleMeasure gel1MinReading;
    protected PressureMeasure gel1MinStrength;
    protected PlaneAngleMeasure gel10MinReading;
    protected PressureMeasure gel10MinStrength;
    protected String typeBaseFluid;
    protected DensityMeasure densBaseFluid;
    protected String dryBlendName;
    protected String dryBlendDescription;
    protected MassMeasure massDryBlend;
    protected DensityMeasure densDryBlend;
    protected MassMeasure massSackDryBlend;
    protected List<CsCementAdditive> cementAdditive;
    protected Boolean foamUsed;
    protected String typeGasFoam;
    protected VolumeMeasure volGasFoam;
    protected VolumePerVolumeMeasure ratioConstGasMethodAv;
    protected DensityMeasure densConstGasMethod;
    protected VolumePerVolumeMeasure ratioConstGasMethodStart;
    protected VolumePerVolumeMeasure ratioConstGasMethodEnd;
    protected DensityMeasure densConstGasFoam;
    protected TimeMeasure eTimThickening;
    protected ThermodynamicTemperatureMeasure tempThickening;
    protected PressureMeasure presTestThickening;
    protected DimensionlessMeasure consTestThickening;
    protected VolumePerVolumeMeasure pcFreeWater;
    protected ThermodynamicTemperatureMeasure tempFreeWater;
    protected VolumeMeasure volTestFluidLoss;
    protected ThermodynamicTemperatureMeasure tempFluidLoss;
    protected PressureMeasure presTestFluidLoss;
    protected TimeMeasure timeFluidLoss;
    protected VolumeMeasure volAPIFluidLoss;
    protected TimeMeasure eTimComprStren1;
    protected TimeMeasure eTimComprStren2;
    protected PressureMeasure presComprStren1;
    protected PressureMeasure presComprStren2;
    protected ThermodynamicTemperatureMeasure tempComprStren1;
    protected ThermodynamicTemperatureMeasure tempComprStren2;
    protected DensityMeasure densAtPres;
    protected VolumeMeasure volReserved;
    protected VolumeMeasure volTotSlurry;

    /**
     * Gets the value of the typeFluid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeFluid() {
        return typeFluid;
    }

    /**
     * Sets the value of the typeFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeFluid(String value) {
        this.typeFluid = value;
    }

    /**
     * Gets the value of the fluidIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFluidIndex() {
        return fluidIndex;
    }

    /**
     * Sets the value of the fluidIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFluidIndex(Short value) {
        this.fluidIndex = value;
    }

    /**
     * Gets the value of the descFluid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescFluid() {
        return descFluid;
    }

    /**
     * Sets the value of the descFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescFluid(String value) {
        this.descFluid = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the classSlurryDryBlend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassSlurryDryBlend() {
        return classSlurryDryBlend;
    }

    /**
     * Sets the value of the classSlurryDryBlend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassSlurryDryBlend(String value) {
        this.classSlurryDryBlend = value;
    }

    /**
     * Gets the value of the mdFluidTop property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdFluidTop() {
        return mdFluidTop;
    }

    /**
     * Sets the value of the mdFluidTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdFluidTop(MeasuredDepthCoord value) {
        this.mdFluidTop = value;
    }

    /**
     * Gets the value of the mdFluidBottom property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdFluidBottom() {
        return mdFluidBottom;
    }

    /**
     * Sets the value of the mdFluidBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdFluidBottom(MeasuredDepthCoord value) {
        this.mdFluidBottom = value;
    }

    /**
     * Gets the value of the sourceWater property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceWater() {
        return sourceWater;
    }

    /**
     * Sets the value of the sourceWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceWater(String value) {
        this.sourceWater = value;
    }

    /**
     * Gets the value of the volWater property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolWater() {
        return volWater;
    }

    /**
     * Sets the value of the volWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolWater(VolumeMeasure value) {
        this.volWater = value;
    }

    /**
     * Gets the value of the volCement property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolCement() {
        return volCement;
    }

    /**
     * Sets the value of the volCement property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolCement(VolumeMeasure value) {
        this.volCement = value;
    }

    /**
     * Gets the value of the ratioMixWater property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificVolumeMeasure }
     *     
     */
    public SpecificVolumeMeasure getRatioMixWater() {
        return ratioMixWater;
    }

    /**
     * Sets the value of the ratioMixWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificVolumeMeasure }
     *     
     */
    public void setRatioMixWater(SpecificVolumeMeasure value) {
        this.ratioMixWater = value;
    }

    /**
     * Gets the value of the volFluid property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolFluid() {
        return volFluid;
    }

    /**
     * Sets the value of the volFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolFluid(VolumeMeasure value) {
        this.volFluid = value;
    }

    /**
     * Gets the value of the cementPumpSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CsCementPumpSchedule }
     *     
     */
    public CsCementPumpSchedule getCementPumpSchedule() {
        return cementPumpSchedule;
    }

    /**
     * Sets the value of the cementPumpSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCementPumpSchedule }
     *     
     */
    public void setCementPumpSchedule(CsCementPumpSchedule value) {
        this.cementPumpSchedule = value;
    }

    /**
     * Gets the value of the excessPc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getExcessPc() {
        return excessPc;
    }

    /**
     * Sets the value of the excessPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setExcessPc(VolumePerVolumeMeasure value) {
        this.excessPc = value;
    }

    /**
     * Gets the value of the volYield property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificVolumeMeasure }
     *     
     */
    public SpecificVolumeMeasure getVolYield() {
        return volYield;
    }

    /**
     * Sets the value of the volYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificVolumeMeasure }
     *     
     */
    public void setVolYield(SpecificVolumeMeasure value) {
        this.volYield = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensity(DensityMeasure value) {
        this.density = value;
    }

    /**
     * Gets the value of the solidVolumeFraction property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getSolidVolumeFraction() {
        return solidVolumeFraction;
    }

    /**
     * Sets the value of the solidVolumeFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setSolidVolumeFraction(VolumePerVolumeMeasure value) {
        this.solidVolumeFraction = value;
    }

    /**
     * Gets the value of the volPumped property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolPumped() {
        return volPumped;
    }

    /**
     * Sets the value of the volPumped property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolPumped(VolumeMeasure value) {
        this.volPumped = value;
    }

    /**
     * Gets the value of the volOther property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolOther() {
        return volOther;
    }

    /**
     * Sets the value of the volOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolOther(VolumeMeasure value) {
        this.volOther = value;
    }

    /**
     * Gets the value of the fluidRheologicalModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluidRheologicalModel() {
        return fluidRheologicalModel;
    }

    /**
     * Sets the value of the fluidRheologicalModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluidRheologicalModel(String value) {
        this.fluidRheologicalModel = value;
    }

    /**
     * Gets the value of the vis property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicViscosityMeasure }
     *     
     */
    public DynamicViscosityMeasure getVis() {
        return vis;
    }

    /**
     * Sets the value of the vis property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicViscosityMeasure }
     *     
     */
    public void setVis(DynamicViscosityMeasure value) {
        this.vis = value;
    }

    /**
     * Gets the value of the yp property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getYp() {
        return yp;
    }

    /**
     * Sets the value of the yp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setYp(PressureMeasure value) {
        this.yp = value;
    }

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionlessMeasure }
     *     
     */
    public DimensionlessMeasure getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionlessMeasure }
     *     
     */
    public void setN(DimensionlessMeasure value) {
        this.n = value;
    }

    /**
     * Gets the value of the k property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionlessMeasure }
     *     
     */
    public DimensionlessMeasure getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionlessMeasure }
     *     
     */
    public void setK(DimensionlessMeasure value) {
        this.k = value;
    }

    /**
     * Gets the value of the gel10SecReading property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getGel10SecReading() {
        return gel10SecReading;
    }

    /**
     * Sets the value of the gel10SecReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setGel10SecReading(PlaneAngleMeasure value) {
        this.gel10SecReading = value;
    }

    /**
     * Gets the value of the gel10SecStrength property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getGel10SecStrength() {
        return gel10SecStrength;
    }

    /**
     * Sets the value of the gel10SecStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setGel10SecStrength(PressureMeasure value) {
        this.gel10SecStrength = value;
    }

    /**
     * Gets the value of the gel1MinReading property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getGel1MinReading() {
        return gel1MinReading;
    }

    /**
     * Sets the value of the gel1MinReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setGel1MinReading(PlaneAngleMeasure value) {
        this.gel1MinReading = value;
    }

    /**
     * Gets the value of the gel1MinStrength property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getGel1MinStrength() {
        return gel1MinStrength;
    }

    /**
     * Sets the value of the gel1MinStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setGel1MinStrength(PressureMeasure value) {
        this.gel1MinStrength = value;
    }

    /**
     * Gets the value of the gel10MinReading property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getGel10MinReading() {
        return gel10MinReading;
    }

    /**
     * Sets the value of the gel10MinReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setGel10MinReading(PlaneAngleMeasure value) {
        this.gel10MinReading = value;
    }

    /**
     * Gets the value of the gel10MinStrength property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getGel10MinStrength() {
        return gel10MinStrength;
    }

    /**
     * Sets the value of the gel10MinStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setGel10MinStrength(PressureMeasure value) {
        this.gel10MinStrength = value;
    }

    /**
     * Gets the value of the typeBaseFluid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeBaseFluid() {
        return typeBaseFluid;
    }

    /**
     * Sets the value of the typeBaseFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeBaseFluid(String value) {
        this.typeBaseFluid = value;
    }

    /**
     * Gets the value of the densBaseFluid property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensBaseFluid() {
        return densBaseFluid;
    }

    /**
     * Sets the value of the densBaseFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensBaseFluid(DensityMeasure value) {
        this.densBaseFluid = value;
    }

    /**
     * Gets the value of the dryBlendName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDryBlendName() {
        return dryBlendName;
    }

    /**
     * Sets the value of the dryBlendName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDryBlendName(String value) {
        this.dryBlendName = value;
    }

    /**
     * Gets the value of the dryBlendDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDryBlendDescription() {
        return dryBlendDescription;
    }

    /**
     * Sets the value of the dryBlendDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDryBlendDescription(String value) {
        this.dryBlendDescription = value;
    }

    /**
     * Gets the value of the massDryBlend property.
     * 
     * @return
     *     possible object is
     *     {@link MassMeasure }
     *     
     */
    public MassMeasure getMassDryBlend() {
        return massDryBlend;
    }

    /**
     * Sets the value of the massDryBlend property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassMeasure }
     *     
     */
    public void setMassDryBlend(MassMeasure value) {
        this.massDryBlend = value;
    }

    /**
     * Gets the value of the densDryBlend property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensDryBlend() {
        return densDryBlend;
    }

    /**
     * Sets the value of the densDryBlend property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensDryBlend(DensityMeasure value) {
        this.densDryBlend = value;
    }

    /**
     * Gets the value of the massSackDryBlend property.
     * 
     * @return
     *     possible object is
     *     {@link MassMeasure }
     *     
     */
    public MassMeasure getMassSackDryBlend() {
        return massSackDryBlend;
    }

    /**
     * Sets the value of the massSackDryBlend property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassMeasure }
     *     
     */
    public void setMassSackDryBlend(MassMeasure value) {
        this.massSackDryBlend = value;
    }

    /**
     * Gets the value of the cementAdditive property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cementAdditive property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getCementAdditive().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsCementAdditive }
     * 
     * 
     */
    public List<CsCementAdditive> getCementAdditive() {
        if (cementAdditive == null) {
            cementAdditive = new ArrayList<CsCementAdditive>();
        }
        return this.cementAdditive;
    }

    /**
     * Gets the value of the foamUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFoamUsed() {
        return foamUsed;
    }

    /**
     * Sets the value of the foamUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFoamUsed(Boolean value) {
        this.foamUsed = value;
    }

    /**
     * Gets the value of the typeGasFoam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeGasFoam() {
        return typeGasFoam;
    }

    /**
     * Sets the value of the typeGasFoam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeGasFoam(String value) {
        this.typeGasFoam = value;
    }

    /**
     * Gets the value of the volGasFoam property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolGasFoam() {
        return volGasFoam;
    }

    /**
     * Sets the value of the volGasFoam property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolGasFoam(VolumeMeasure value) {
        this.volGasFoam = value;
    }

    /**
     * Gets the value of the ratioConstGasMethodAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getRatioConstGasMethodAv() {
        return ratioConstGasMethodAv;
    }

    /**
     * Sets the value of the ratioConstGasMethodAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setRatioConstGasMethodAv(VolumePerVolumeMeasure value) {
        this.ratioConstGasMethodAv = value;
    }

    /**
     * Gets the value of the densConstGasMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensConstGasMethod() {
        return densConstGasMethod;
    }

    /**
     * Sets the value of the densConstGasMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensConstGasMethod(DensityMeasure value) {
        this.densConstGasMethod = value;
    }

    /**
     * Gets the value of the ratioConstGasMethodStart property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getRatioConstGasMethodStart() {
        return ratioConstGasMethodStart;
    }

    /**
     * Sets the value of the ratioConstGasMethodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setRatioConstGasMethodStart(VolumePerVolumeMeasure value) {
        this.ratioConstGasMethodStart = value;
    }

    /**
     * Gets the value of the ratioConstGasMethodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getRatioConstGasMethodEnd() {
        return ratioConstGasMethodEnd;
    }

    /**
     * Sets the value of the ratioConstGasMethodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setRatioConstGasMethodEnd(VolumePerVolumeMeasure value) {
        this.ratioConstGasMethodEnd = value;
    }

    /**
     * Gets the value of the densConstGasFoam property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensConstGasFoam() {
        return densConstGasFoam;
    }

    /**
     * Sets the value of the densConstGasFoam property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensConstGasFoam(DensityMeasure value) {
        this.densConstGasFoam = value;
    }

    /**
     * Gets the value of the eTimThickening property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimThickening() {
        return eTimThickening;
    }

    /**
     * Sets the value of the eTimThickening property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimThickening(TimeMeasure value) {
        this.eTimThickening = value;
    }

    /**
     * Gets the value of the tempThickening property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempThickening() {
        return tempThickening;
    }

    /**
     * Sets the value of the tempThickening property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempThickening(ThermodynamicTemperatureMeasure value) {
        this.tempThickening = value;
    }

    /**
     * Gets the value of the presTestThickening property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresTestThickening() {
        return presTestThickening;
    }

    /**
     * Sets the value of the presTestThickening property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresTestThickening(PressureMeasure value) {
        this.presTestThickening = value;
    }

    /**
     * Gets the value of the consTestThickening property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionlessMeasure }
     *     
     */
    public DimensionlessMeasure getConsTestThickening() {
        return consTestThickening;
    }

    /**
     * Sets the value of the consTestThickening property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionlessMeasure }
     *     
     */
    public void setConsTestThickening(DimensionlessMeasure value) {
        this.consTestThickening = value;
    }

    /**
     * Gets the value of the pcFreeWater property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getPcFreeWater() {
        return pcFreeWater;
    }

    /**
     * Sets the value of the pcFreeWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setPcFreeWater(VolumePerVolumeMeasure value) {
        this.pcFreeWater = value;
    }

    /**
     * Gets the value of the tempFreeWater property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempFreeWater() {
        return tempFreeWater;
    }

    /**
     * Sets the value of the tempFreeWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempFreeWater(ThermodynamicTemperatureMeasure value) {
        this.tempFreeWater = value;
    }

    /**
     * Gets the value of the volTestFluidLoss property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolTestFluidLoss() {
        return volTestFluidLoss;
    }

    /**
     * Sets the value of the volTestFluidLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolTestFluidLoss(VolumeMeasure value) {
        this.volTestFluidLoss = value;
    }

    /**
     * Gets the value of the tempFluidLoss property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempFluidLoss() {
        return tempFluidLoss;
    }

    /**
     * Sets the value of the tempFluidLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempFluidLoss(ThermodynamicTemperatureMeasure value) {
        this.tempFluidLoss = value;
    }

    /**
     * Gets the value of the presTestFluidLoss property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresTestFluidLoss() {
        return presTestFluidLoss;
    }

    /**
     * Sets the value of the presTestFluidLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresTestFluidLoss(PressureMeasure value) {
        this.presTestFluidLoss = value;
    }

    /**
     * Gets the value of the timeFluidLoss property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getTimeFluidLoss() {
        return timeFluidLoss;
    }

    /**
     * Sets the value of the timeFluidLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setTimeFluidLoss(TimeMeasure value) {
        this.timeFluidLoss = value;
    }

    /**
     * Gets the value of the volAPIFluidLoss property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolAPIFluidLoss() {
        return volAPIFluidLoss;
    }

    /**
     * Sets the value of the volAPIFluidLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolAPIFluidLoss(VolumeMeasure value) {
        this.volAPIFluidLoss = value;
    }

    /**
     * Gets the value of the eTimComprStren1 property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimComprStren1() {
        return eTimComprStren1;
    }

    /**
     * Sets the value of the eTimComprStren1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimComprStren1(TimeMeasure value) {
        this.eTimComprStren1 = value;
    }

    /**
     * Gets the value of the eTimComprStren2 property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimComprStren2() {
        return eTimComprStren2;
    }

    /**
     * Sets the value of the eTimComprStren2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimComprStren2(TimeMeasure value) {
        this.eTimComprStren2 = value;
    }

    /**
     * Gets the value of the presComprStren1 property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresComprStren1() {
        return presComprStren1;
    }

    /**
     * Sets the value of the presComprStren1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresComprStren1(PressureMeasure value) {
        this.presComprStren1 = value;
    }

    /**
     * Gets the value of the presComprStren2 property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresComprStren2() {
        return presComprStren2;
    }

    /**
     * Sets the value of the presComprStren2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresComprStren2(PressureMeasure value) {
        this.presComprStren2 = value;
    }

    /**
     * Gets the value of the tempComprStren1 property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempComprStren1() {
        return tempComprStren1;
    }

    /**
     * Sets the value of the tempComprStren1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempComprStren1(ThermodynamicTemperatureMeasure value) {
        this.tempComprStren1 = value;
    }

    /**
     * Gets the value of the tempComprStren2 property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempComprStren2() {
        return tempComprStren2;
    }

    /**
     * Sets the value of the tempComprStren2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempComprStren2(ThermodynamicTemperatureMeasure value) {
        this.tempComprStren2 = value;
    }

    /**
     * Gets the value of the densAtPres property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensAtPres() {
        return densAtPres;
    }

    /**
     * Sets the value of the densAtPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensAtPres(DensityMeasure value) {
        this.densAtPres = value;
    }

    /**
     * Gets the value of the volReserved property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolReserved() {
        return volReserved;
    }

    /**
     * Sets the value of the volReserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolReserved(VolumeMeasure value) {
        this.volReserved = value;
    }

    /**
     * Gets the value of the volTotSlurry property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolTotSlurry() {
        return volTotSlurry;
    }

    /**
     * Sets the value of the volTotSlurry property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolTotSlurry(VolumeMeasure value) {
        this.volTotSlurry = value;
    }

}
