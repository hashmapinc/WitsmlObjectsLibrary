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
 * WITSML - Operations Weather Component Schema
 * 
 * <p>Java class for cs_weather complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_weather">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/1series}timestamp"/>
 *         <element name="agency" type="{http://www.witsml.org/schemas/1series}str32" minOccurs="0"/>
 *         <element name="barometricPressure" type="{http://www.witsml.org/schemas/1series}pressureMeasure" minOccurs="0"/>
 *         <element name="beaufortScaleNumber" type="{http://www.witsml.org/schemas/1series}beaufortScaleIntegerCode" minOccurs="0"/>
 *         <element name="tempSurfaceMn" type="{http://www.witsml.org/schemas/1series}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="tempSurfaceMx" type="{http://www.witsml.org/schemas/1series}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="tempWindChill" type="{http://www.witsml.org/schemas/1series}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="tempsea" type="{http://www.witsml.org/schemas/1series}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="visibility" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="aziWave" type="{http://www.witsml.org/schemas/1series}planeAngleMeasure" minOccurs="0"/>
 *         <element name="htWave" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="significantWave" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="maxWave" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="periodWave" type="{http://www.witsml.org/schemas/1series}timeMeasure" minOccurs="0"/>
 *         <element name="aziWind" type="{http://www.witsml.org/schemas/1series}planeAngleMeasure" minOccurs="0"/>
 *         <element name="velWind" type="{http://www.witsml.org/schemas/1series}velocityMeasure" minOccurs="0"/>
 *         <element name="typePrecip" type="{http://www.witsml.org/schemas/1series}str32" minOccurs="0"/>
 *         <element name="amtPrecip" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="coverCloud" type="{http://www.witsml.org/schemas/1series}str32" minOccurs="0"/>
 *         <element name="ceilingCloud" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="currentSea" type="{http://www.witsml.org/schemas/1series}velocityMeasure" minOccurs="0"/>
 *         <element name="aziCurrentSea" type="{http://www.witsml.org/schemas/1series}planeAngleMeasure" minOccurs="0"/>
 *         <element name="comments" type="{http://www.witsml.org/schemas/1series}commentString" minOccurs="0"/>
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
@XmlType(name = "cs_weather", propOrder = {
    "dTim",
    "agency",
    "barometricPressure",
    "beaufortScaleNumber",
    "tempSurfaceMn",
    "tempSurfaceMx",
    "tempWindChill",
    "tempsea",
    "visibility",
    "aziWave",
    "htWave",
    "significantWave",
    "maxWave",
    "periodWave",
    "aziWind",
    "velWind",
    "typePrecip",
    "amtPrecip",
    "coverCloud",
    "ceilingCloud",
    "currentSea",
    "aziCurrentSea",
    "comments",
    "extensionNameValue"
})
public class CsWeather {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected String agency;
    protected PressureMeasure barometricPressure;
    protected Short beaufortScaleNumber;
    protected ThermodynamicTemperatureMeasure tempSurfaceMn;
    protected ThermodynamicTemperatureMeasure tempSurfaceMx;
    protected ThermodynamicTemperatureMeasure tempWindChill;
    protected ThermodynamicTemperatureMeasure tempsea;
    protected LengthMeasure visibility;
    protected PlaneAngleMeasure aziWave;
    protected LengthMeasure htWave;
    protected LengthMeasure significantWave;
    protected LengthMeasure maxWave;
    protected TimeMeasure periodWave;
    protected PlaneAngleMeasure aziWind;
    protected VelocityMeasure velWind;
    protected String typePrecip;
    protected LengthMeasure amtPrecip;
    protected String coverCloud;
    protected LengthMeasure ceilingCloud;
    protected VelocityMeasure currentSea;
    protected PlaneAngleMeasure aziCurrentSea;
    protected String comments;
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
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgency(String value) {
        this.agency = value;
    }

    /**
     * Gets the value of the barometricPressure property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getBarometricPressure() {
        return barometricPressure;
    }

    /**
     * Sets the value of the barometricPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setBarometricPressure(PressureMeasure value) {
        this.barometricPressure = value;
    }

    /**
     * Gets the value of the beaufortScaleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBeaufortScaleNumber() {
        return beaufortScaleNumber;
    }

    /**
     * Sets the value of the beaufortScaleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBeaufortScaleNumber(Short value) {
        this.beaufortScaleNumber = value;
    }

    /**
     * Gets the value of the tempSurfaceMn property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempSurfaceMn() {
        return tempSurfaceMn;
    }

    /**
     * Sets the value of the tempSurfaceMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempSurfaceMn(ThermodynamicTemperatureMeasure value) {
        this.tempSurfaceMn = value;
    }

    /**
     * Gets the value of the tempSurfaceMx property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempSurfaceMx() {
        return tempSurfaceMx;
    }

    /**
     * Sets the value of the tempSurfaceMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempSurfaceMx(ThermodynamicTemperatureMeasure value) {
        this.tempSurfaceMx = value;
    }

    /**
     * Gets the value of the tempWindChill property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempWindChill() {
        return tempWindChill;
    }

    /**
     * Sets the value of the tempWindChill property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempWindChill(ThermodynamicTemperatureMeasure value) {
        this.tempWindChill = value;
    }

    /**
     * Gets the value of the tempsea property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempsea() {
        return tempsea;
    }

    /**
     * Sets the value of the tempsea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempsea(ThermodynamicTemperatureMeasure value) {
        this.tempsea = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setVisibility(LengthMeasure value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the aziWave property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getAziWave() {
        return aziWave;
    }

    /**
     * Sets the value of the aziWave property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setAziWave(PlaneAngleMeasure value) {
        this.aziWave = value;
    }

    /**
     * Gets the value of the htWave property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getHtWave() {
        return htWave;
    }

    /**
     * Sets the value of the htWave property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setHtWave(LengthMeasure value) {
        this.htWave = value;
    }

    /**
     * Gets the value of the significantWave property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getSignificantWave() {
        return significantWave;
    }

    /**
     * Sets the value of the significantWave property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setSignificantWave(LengthMeasure value) {
        this.significantWave = value;
    }

    /**
     * Gets the value of the maxWave property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getMaxWave() {
        return maxWave;
    }

    /**
     * Sets the value of the maxWave property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setMaxWave(LengthMeasure value) {
        this.maxWave = value;
    }

    /**
     * Gets the value of the periodWave property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getPeriodWave() {
        return periodWave;
    }

    /**
     * Sets the value of the periodWave property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setPeriodWave(TimeMeasure value) {
        this.periodWave = value;
    }

    /**
     * Gets the value of the aziWind property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getAziWind() {
        return aziWind;
    }

    /**
     * Sets the value of the aziWind property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setAziWind(PlaneAngleMeasure value) {
        this.aziWind = value;
    }

    /**
     * Gets the value of the velWind property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getVelWind() {
        return velWind;
    }

    /**
     * Sets the value of the velWind property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setVelWind(VelocityMeasure value) {
        this.velWind = value;
    }

    /**
     * Gets the value of the typePrecip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypePrecip() {
        return typePrecip;
    }

    /**
     * Sets the value of the typePrecip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypePrecip(String value) {
        this.typePrecip = value;
    }

    /**
     * Gets the value of the amtPrecip property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getAmtPrecip() {
        return amtPrecip;
    }

    /**
     * Sets the value of the amtPrecip property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setAmtPrecip(LengthMeasure value) {
        this.amtPrecip = value;
    }

    /**
     * Gets the value of the coverCloud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverCloud() {
        return coverCloud;
    }

    /**
     * Sets the value of the coverCloud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverCloud(String value) {
        this.coverCloud = value;
    }

    /**
     * Gets the value of the ceilingCloud property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getCeilingCloud() {
        return ceilingCloud;
    }

    /**
     * Sets the value of the ceilingCloud property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setCeilingCloud(LengthMeasure value) {
        this.ceilingCloud = value;
    }

    /**
     * Gets the value of the currentSea property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getCurrentSea() {
        return currentSea;
    }

    /**
     * Sets the value of the currentSea property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setCurrentSea(VelocityMeasure value) {
        this.currentSea = value;
    }

    /**
     * Gets the value of the aziCurrentSea property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getAziCurrentSea() {
        return aziCurrentSea;
    }

    /**
     * Sets the value of the aziCurrentSea property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setAziCurrentSea(PlaneAngleMeasure value) {
        this.aziCurrentSea = value;
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
