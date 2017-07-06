package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The pump log row are elements defined in the sequence below.
 * 
 * <p>Java class for cs_pumpLogRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_pumpLogRow">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cableSpeed" type="{http://www.witsml.org/schemas/131}velocityMeasure" minOccurs="0"/>
 *         <element name="fiberPumpedLength" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="pumpPressure" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="pumpFluid" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="temperatureIn" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="temperatureOut" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="remarks" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
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
@XmlType(name = "cs_pumpLogRow", propOrder = {
    "cableSpeed",
    "fiberPumpedLength",
    "pumpPressure",
    "pumpFluid",
    "temperatureIn",
    "temperatureOut",
    "remarks"
})
public class CsPumpLogRow {

    protected VelocityMeasure cableSpeed;
    protected LengthMeasure fiberPumpedLength;
    protected PressureMeasure pumpPressure;
    protected String pumpFluid;
    protected ThermodynamicTemperatureMeasure temperatureIn;
    protected ThermodynamicTemperatureMeasure temperatureOut;
    protected String remarks;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the cableSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getCableSpeed() {
        return cableSpeed;
    }

    /**
     * Sets the value of the cableSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setCableSpeed(VelocityMeasure value) {
        this.cableSpeed = value;
    }

    /**
     * Gets the value of the fiberPumpedLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getFiberPumpedLength() {
        return fiberPumpedLength;
    }

    /**
     * Sets the value of the fiberPumpedLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setFiberPumpedLength(LengthMeasure value) {
        this.fiberPumpedLength = value;
    }

    /**
     * Gets the value of the pumpPressure property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPumpPressure() {
        return pumpPressure;
    }

    /**
     * Sets the value of the pumpPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPumpPressure(PressureMeasure value) {
        this.pumpPressure = value;
    }

    /**
     * Gets the value of the pumpFluid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPumpFluid() {
        return pumpFluid;
    }

    /**
     * Sets the value of the pumpFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPumpFluid(String value) {
        this.pumpFluid = value;
    }

    /**
     * Gets the value of the temperatureIn property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTemperatureIn() {
        return temperatureIn;
    }

    /**
     * Sets the value of the temperatureIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTemperatureIn(ThermodynamicTemperatureMeasure value) {
        this.temperatureIn = value;
    }

    /**
     * Gets the value of the temperatureOut property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTemperatureOut() {
        return temperatureOut;
    }

    /**
     * Sets the value of the temperatureOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTemperatureOut(ThermodynamicTemperatureMeasure value) {
        this.temperatureOut = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
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
