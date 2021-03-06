//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

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
 * <p>Java class for cs_drillReportControlIncidentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_drillReportControlIncidentInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="mdInflow" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="tvdInflow" type="{http://www.witsml.org/schemas/1series}wellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="phase" type="{http://www.witsml.org/schemas/1series}str16" minOccurs="0"/>
 *         <element name="activityCode" type="{http://www.witsml.org/schemas/1series}ActivityCode" minOccurs="0"/>
 *         <element name="proprietaryCode" type="{http://www.witsml.org/schemas/1series}nameStruct" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="detailActivity" type="{http://www.witsml.org/schemas/1series}str32" minOccurs="0"/>
 *         <element name="eTimLost" type="{http://www.witsml.org/schemas/1series}timeMeasure" minOccurs="0"/>
 *         <element name="dTimRegained" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="diaBit" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="mdBit" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="wtMud" type="{http://www.witsml.org/schemas/1series}densityMeasure" minOccurs="0"/>
 *         <element name="porePressure" type="{http://www.witsml.org/schemas/1series}densityMeasure"/>
 *         <element name="diaCsgLast" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="mdCsgLast" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="volMudGained" type="{http://www.witsml.org/schemas/1series}volumeMeasure" minOccurs="0"/>
 *         <element name="presShutInCasing" type="{http://www.witsml.org/schemas/1series}pressureMeasure" minOccurs="0"/>
 *         <element name="presShutInDrill" type="{http://www.witsml.org/schemas/1series}pressureMeasure" minOccurs="0"/>
 *         <element name="incidentType" type="{http://www.witsml.org/schemas/1series}String" minOccurs="0"/>
 *         <element name="killingType" type="{http://www.witsml.org/schemas/1series}String" minOccurs="0"/>
 *         <element name="formation" type="{http://www.witsml.org/schemas/1series}descriptionString" minOccurs="0"/>
 *         <element name="tempBottom" type="{http://www.witsml.org/schemas/1series}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="presMaxChoke" type="{http://www.witsml.org/schemas/1series}pressureMeasure" minOccurs="0"/>
 *         <element name="description" type="{http://www.witsml.org/schemas/1series}descriptionString" minOccurs="0"/>
 *         <element name="extensionNameValue" type="{http://www.witsml.org/schemas/1series}cs_extensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/1series}attgrp_uid"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_drillReportControlIncidentInfo", propOrder = {
    "dTim",
    "mdInflow",
    "tvdInflow",
    "phase",
    "activityCode",
    "proprietaryCode",
    "detailActivity",
    "eTimLost",
    "dTimRegained",
    "diaBit",
    "mdBit",
    "wtMud",
    "porePressure",
    "diaCsgLast",
    "mdCsgLast",
    "volMudGained",
    "presShutInCasing",
    "presShutInDrill",
    "incidentType",
    "killingType",
    "formation",
    "tempBottom",
    "presMaxChoke",
    "description",
    "extensionNameValue"
})
public class CsDrillReportControlIncidentInfo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected MeasuredDepthCoord mdInflow;
    protected WellVerticalDepthCoord tvdInflow;
    protected String phase;
    protected String activityCode;
    protected List<NameStruct> proprietaryCode;
    protected String detailActivity;
    protected TimeMeasure eTimLost;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimRegained;
    protected LengthMeasure diaBit;
    protected MeasuredDepthCoord mdBit;
    protected DensityMeasure wtMud;
    @XmlElement(required = true)
    protected DensityMeasure porePressure;
    protected LengthMeasure diaCsgLast;
    protected MeasuredDepthCoord mdCsgLast;
    protected VolumeMeasure volMudGained;
    protected PressureMeasure presShutInCasing;
    protected PressureMeasure presShutInDrill;
    @XmlSchemaType(name = "string")
    protected String incidentType;
    @XmlSchemaType(name = "string")
    protected String killingType;
    protected String formation;
    protected ThermodynamicTemperatureMeasure tempBottom;
    protected PressureMeasure presMaxChoke;
    protected String description;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the dTim property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDTim() {
        return dTim;
    }

    /**
     * Sets the value of the dTim property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDTim(XMLGregorianCalendar value) {
        this.dTim = value;
    }

    /**
     * Gets the value of the mdInflow property.
     *
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *
     */
    public MeasuredDepthCoord getMdInflow() {
        return mdInflow;
    }

    /**
     * Sets the value of the mdInflow property.
     *
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *
     */
    public void setMdInflow(MeasuredDepthCoord value) {
        this.mdInflow = value;
    }

    /**
     * Gets the value of the tvdInflow property.
     *
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *
     */
    public WellVerticalDepthCoord getTvdInflow() {
        return tvdInflow;
    }

    /**
     * Sets the value of the tvdInflow property.
     *
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *
     */
    public void setTvdInflow(WellVerticalDepthCoord value) {
        this.tvdInflow = value;
    }

    /**
     * Gets the value of the phase property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    /**
     * Gets the value of the activityCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * Sets the value of the activityCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActivityCode(String value) {
        this.activityCode = value;
    }

    /**
     * Gets the value of the proprietaryCode property.
     *
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proprietaryCode property.
     *
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getProprietaryCode().add(newItem);
     * } </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list
     * {@link NameStruct }
     *
     *
     */
    public List<NameStruct> getProprietaryCode() {
        if (proprietaryCode == null) {
            proprietaryCode = new ArrayList<NameStruct>();
        }
        return this.proprietaryCode;
    }

    /**
     * Gets the value of the detailActivity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDetailActivity() {
        return detailActivity;
    }

    /**
     * Sets the value of the detailActivity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDetailActivity(String value) {
        this.detailActivity = value;
    }

    /**
     * Gets the value of the eTimLost property.
     *
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *
     */
    public TimeMeasure getETimLost() {
        return eTimLost;
    }

    /**
     * Sets the value of the eTimLost property.
     *
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *
     */
    public void setETimLost(TimeMeasure value) {
        this.eTimLost = value;
    }

    /**
     * Gets the value of the dTimRegained property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDTimRegained() {
        return dTimRegained;
    }

    /**
     * Sets the value of the dTimRegained property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDTimRegained(XMLGregorianCalendar value) {
        this.dTimRegained = value;
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
     * Gets the value of the mdBit property.
     *
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *
     */
    public MeasuredDepthCoord getMdBit() {
        return mdBit;
    }

    /**
     * Sets the value of the mdBit property.
     *
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *
     */
    public void setMdBit(MeasuredDepthCoord value) {
        this.mdBit = value;
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
     * Gets the value of the porePressure property.
     *
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *
     */
    public DensityMeasure getPorePressure() {
        return porePressure;
    }

    /**
     * Sets the value of the porePressure property.
     *
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *
     */
    public void setPorePressure(DensityMeasure value) {
        this.porePressure = value;
    }

    /**
     * Gets the value of the diaCsgLast property.
     *
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *
     */
    public LengthMeasure getDiaCsgLast() {
        return diaCsgLast;
    }

    /**
     * Sets the value of the diaCsgLast property.
     *
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *
     */
    public void setDiaCsgLast(LengthMeasure value) {
        this.diaCsgLast = value;
    }

    /**
     * Gets the value of the mdCsgLast property.
     *
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *
     */
    public MeasuredDepthCoord getMdCsgLast() {
        return mdCsgLast;
    }

    /**
     * Sets the value of the mdCsgLast property.
     *
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *
     */
    public void setMdCsgLast(MeasuredDepthCoord value) {
        this.mdCsgLast = value;
    }

    /**
     * Gets the value of the volMudGained property.
     *
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *
     */
    public VolumeMeasure getVolMudGained() {
        return volMudGained;
    }

    /**
     * Sets the value of the volMudGained property.
     *
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *
     */
    public void setVolMudGained(VolumeMeasure value) {
        this.volMudGained = value;
    }

    /**
     * Gets the value of the presShutInCasing property.
     *
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *
     */
    public PressureMeasure getPresShutInCasing() {
        return presShutInCasing;
    }

    /**
     * Sets the value of the presShutInCasing property.
     *
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *
     */
    public void setPresShutInCasing(PressureMeasure value) {
        this.presShutInCasing = value;
    }

    /**
     * Gets the value of the presShutInDrill property.
     *
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *
     */
    public PressureMeasure getPresShutInDrill() {
        return presShutInDrill;
    }

    /**
     * Sets the value of the presShutInDrill property.
     *
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *
     */
    public void setPresShutInDrill(PressureMeasure value) {
        this.presShutInDrill = value;
    }

    /**
     * Gets the value of the incidentType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIncidentType() {
        return incidentType;
    }

    /**
     * Sets the value of the incidentType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIncidentType(String value) {
        this.incidentType = value;
    }

    /**
     * Gets the value of the killingType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getKillingType() {
        return killingType;
    }

    /**
     * Sets the value of the killingType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setKillingType(String value) {
        this.killingType = value;
    }

    /**
     * Gets the value of the formation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormation() {
        return formation;
    }

    /**
     * Sets the value of the formation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormation(String value) {
        this.formation = value;
    }

    /**
     * Gets the value of the tempBottom property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempBottom() {
        return tempBottom;
    }

    /**
     * Sets the value of the tempBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempBottom(ThermodynamicTemperatureMeasure value) {
        this.tempBottom = value;
    }

    /**
     * Gets the value of the presMaxChoke property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresMaxChoke() {
        return presMaxChoke;
    }

    /**
     * Sets the value of the presMaxChoke property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresMaxChoke(PressureMeasure value) {
        this.presMaxChoke = value;
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
     * Gets the value of the extensionNameValue property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionNameValue property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getExtensionNameValue().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsExtensionNameValue }
     * 
     * 
     */
    public List<CsExtensionNameValue> getExtensionNameValue() {
        if (extensionNameValue == null) {
            extensionNameValue = new ArrayList<CsExtensionNameValue>();
        }
        return this.extensionNameValue;
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
