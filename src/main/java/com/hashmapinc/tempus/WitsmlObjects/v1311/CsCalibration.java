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
 * Calibration parameters vary from vendor to vendor, depending 
 * 			on the calibration method being used. This is a general type that allows a calibration 
 * 			date, business associate, and many  name/value pairs.
 * 
 * <p>Java class for cs_calibration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_calibration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTimCalibration" type="{http://www.witsml.org/schemas/131}date" minOccurs="0"/>
 *         <element name="calibratedBy" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="calibrationProtocol" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="parameter" type="{http://www.witsml.org/schemas/131}cs_calibrationParameter" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cs_calibration", propOrder = {
    "dTimCalibration",
    "calibratedBy",
    "calibrationProtocol",
    "parameter",
    "remarks"
})
public class CsCalibration {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dTimCalibration;
    protected String calibratedBy;
    protected String calibrationProtocol;
    protected List<CsCalibrationParameter> parameter;
    protected String remarks;
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
