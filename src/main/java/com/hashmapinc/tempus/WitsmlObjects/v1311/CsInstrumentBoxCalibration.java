package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Calibration parameters vary from vendor to vendor, depending on the 
 * 			calibration method being used. This is an extension of the general cs_calibration, and allows for 
 * 			specific parameters associated with an instrument box. The two additional parameters are 
 * 			the offset temperature calibration, and the slope calibration. These allow for a linear 
 * 			shift in temperature vs measurements. Additional offset and slope calibrations may be 
 * 			performed at measurement time.
 * 
 * <p>Java class for cs_instrumentBoxCalibration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_instrumentBoxCalibration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTimCalibration" type="{http://www.witsml.org/schemas/131}date" minOccurs="0"/>
 *         <element name="calibratedBy" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="calibrationProtocol" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="parameter" type="{http://www.witsml.org/schemas/131}cs_calibrationParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="remarks" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="offsetTemperatureCalibration" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="slopeCalibration" type="{http://www.witsml.org/schemas/131}temperatureSlopeMeasure" minOccurs="0"/>
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
@XmlType(name = "cs_instrumentBoxCalibration", propOrder = {
    "dTimCalibration",
    "calibratedBy",
    "calibrationProtocol",
    "parameter",
    "remarks",
    "offsetTemperatureCalibration",
    "slopeCalibration"
})
public class CsInstrumentBoxCalibration {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dTimCalibration;
    protected String calibratedBy;
    protected String calibrationProtocol;
    protected List<CsCalibrationParameter> parameter;
    protected String remarks;
    protected ThermodynamicTemperatureMeasure offsetTemperatureCalibration;
    protected TemperatureSlopeMeasure slopeCalibration;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the dTimCalibration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimCalibration() {
        return dTimCalibration;
    }

    /**
     * Sets the value of the dTimCalibration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimCalibration(XMLGregorianCalendar value) {
        this.dTimCalibration = value;
    }

    /**
     * Gets the value of the calibratedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibratedBy() {
        return calibratedBy;
    }

    /**
     * Sets the value of the calibratedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibratedBy(String value) {
        this.calibratedBy = value;
    }

    /**
     * Gets the value of the calibrationProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibrationProtocol() {
        return calibrationProtocol;
    }

    /**
     * Sets the value of the calibrationProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibrationProtocol(String value) {
        this.calibrationProtocol = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getParameter().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsCalibrationParameter }
     * 
     * 
     */
    public List<CsCalibrationParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<CsCalibrationParameter>();
        }
        return this.parameter;
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
     * Gets the value of the offsetTemperatureCalibration property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getOffsetTemperatureCalibration() {
        return offsetTemperatureCalibration;
    }

    /**
     * Sets the value of the offsetTemperatureCalibration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setOffsetTemperatureCalibration(ThermodynamicTemperatureMeasure value) {
        this.offsetTemperatureCalibration = value;
    }

    /**
     * Gets the value of the slopeCalibration property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureSlopeMeasure }
     *     
     */
    public TemperatureSlopeMeasure getSlopeCalibration() {
        return slopeCalibration;
    }

    /**
     * Sets the value of the slopeCalibration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureSlopeMeasure }
     *     
     */
    public void setSlopeCalibration(TemperatureSlopeMeasure value) {
        this.slopeCalibration = value;
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
