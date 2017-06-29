package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The instrument box used for distributed temperature surveys
 * 
 * <p>Java class for cs_instrumentBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_instrumentBox">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="manufacturer" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="manufacturingDate" type="{http://www.witsml.org/schemas/131}anyDate" minOccurs="0"/>
 *         <element name="type" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="nameTag" type="{http://www.witsml.org/schemas/131}cs_nameTag" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="softwareVersion" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="factoryCalibration" type="{http://www.witsml.org/schemas/131}cs_instrumentBoxCalibration" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="internalOvenLocationNear" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *         <element name="internalOvenLocationFar" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="ovenSetPoint" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure"/>
 *         <element name="testCable" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="offset" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="differentialLossSetting" type="{http://www.witsml.org/schemas/131}generalMeasureType" minOccurs="0"/>
 *         <element name="parameter" type="{http://www.witsml.org/schemas/131}indexedObject" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cs_instrumentBox", propOrder = {
    "name",
    "manufacturer",
    "manufacturingDate",
    "type",
    "nameTag",
    "softwareVersion",
    "factoryCalibration",
    "internalOvenLocationNear",
    "internalOvenLocationFar",
    "ovenSetPoint",
    "testCable",
    "offset",
    "differentialLossSetting",
    "parameter"
})
public class CsInstrumentBox {

    protected String name;
    protected String manufacturer;
    protected String manufacturingDate;
    protected String type;
    protected List<CsNameTag> nameTag;
    protected String softwareVersion;
    protected List<CsInstrumentBoxCalibration> factoryCalibration;
    @XmlElement(required = true)
    protected LengthMeasure internalOvenLocationNear;
    protected LengthMeasure internalOvenLocationFar;
    @XmlElement(required = true)
    protected ThermodynamicTemperatureMeasure ovenSetPoint;
    protected String testCable;
    protected String offset;
    protected GeneralMeasureType differentialLossSetting;
    protected List<IndexedObject> parameter;
    @XmlAttribute(name = "uid")
    protected String uid;

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
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the manufacturingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingDate() {
        return manufacturingDate;
    }

    /**
     * Sets the value of the manufacturingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingDate(String value) {
        this.manufacturingDate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the nameTag property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameTag property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getNameTag().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsNameTag }
     * 
     * 
     */
    public List<CsNameTag> getNameTag() {
        if (nameTag == null) {
            nameTag = new ArrayList<CsNameTag>();
        }
        return this.nameTag;
    }

    /**
     * Gets the value of the softwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Sets the value of the softwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVersion(String value) {
        this.softwareVersion = value;
    }

    /**
     * Gets the value of the factoryCalibration property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factoryCalibration property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getFactoryCalibration().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsInstrumentBoxCalibration }
     * 
     * 
     */
    public List<CsInstrumentBoxCalibration> getFactoryCalibration() {
        if (factoryCalibration == null) {
            factoryCalibration = new ArrayList<CsInstrumentBoxCalibration>();
        }
        return this.factoryCalibration;
    }

    /**
     * Gets the value of the internalOvenLocationNear property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getInternalOvenLocationNear() {
        return internalOvenLocationNear;
    }

    /**
     * Sets the value of the internalOvenLocationNear property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setInternalOvenLocationNear(LengthMeasure value) {
        this.internalOvenLocationNear = value;
    }

    /**
     * Gets the value of the internalOvenLocationFar property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getInternalOvenLocationFar() {
        return internalOvenLocationFar;
    }

    /**
     * Sets the value of the internalOvenLocationFar property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setInternalOvenLocationFar(LengthMeasure value) {
        this.internalOvenLocationFar = value;
    }

    /**
     * Gets the value of the ovenSetPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getOvenSetPoint() {
        return ovenSetPoint;
    }

    /**
     * Sets the value of the ovenSetPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setOvenSetPoint(ThermodynamicTemperatureMeasure value) {
        this.ovenSetPoint = value;
    }

    /**
     * Gets the value of the testCable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestCable() {
        return testCable;
    }

    /**
     * Sets the value of the testCable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestCable(String value) {
        this.testCable = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffset(String value) {
        this.offset = value;
    }

    /**
     * Gets the value of the differentialLossSetting property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMeasureType }
     *     
     */
    public GeneralMeasureType getDifferentialLossSetting() {
        return differentialLossSetting;
    }

    /**
     * Sets the value of the differentialLossSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMeasureType }
     *     
     */
    public void setDifferentialLossSetting(GeneralMeasureType value) {
        this.differentialLossSetting = value;
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
     * {@link IndexedObject }
     * 
     * 
     */
    public List<IndexedObject> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<IndexedObject>();
        }
        return this.parameter;
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
