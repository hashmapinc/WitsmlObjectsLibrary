package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlTransient
public abstract class ObjWell {

    @XmlAttribute(name = "version", required = true)
    private String version;
    @XmlElement(required = true)
    protected String name;
    protected String nameLegal;
    protected String numLicense;
    protected String numGovt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimLicense;
    protected String field;
    protected String country;
    protected String state;
    protected String county;
    protected String region;
    protected String district;
    protected String block;
    protected String timeZone;
    protected String operator;
    protected String operatorDiv;
    protected String numAPI;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimSpud;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimPa;
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
    public String getVersion() { return version; }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVersion(String value) { this.version = value; }

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
     * Gets the value of the nameLegal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNameLegal() {
        return nameLegal;
    }

    /**
     * Sets the value of the nameLegal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNameLegal(String value) {
        this.nameLegal = value;
    }

    /**
     * Gets the value of the numLicense property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumLicense() {
        return numLicense;
    }

    /**
     * Sets the value of the numLicense property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumLicense(String value) {
        this.numLicense = value;
    }

    /**
     * Gets the value of the numGovt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumGovt() {
        return numGovt;
    }

    /**
     * Sets the value of the numGovt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumGovt(String value) {
        this.numGovt = value;
    }

    /**
     * Gets the value of the dTimLicense property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDTimLicense() {
        return dTimLicense;
    }

    /**
     * Sets the value of the dTimLicense property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDTimLicense(XMLGregorianCalendar value) {
        this.dTimLicense = value;
    }

    /**
     * Gets the value of the field property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the county property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the region property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the district property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the block property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the timeZone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the operator property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the operatorDiv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperatorDiv() {
        return operatorDiv;
    }

    /**
     * Sets the value of the operatorDiv property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperatorDiv(String value) {
        this.operatorDiv = value;
    }

    /**
     * Gets the value of the numAPI property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumAPI() {
        return numAPI;
    }

    /**
     * Sets the value of the numAPI property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumAPI(String value) {
        this.numAPI = value;
    }

    /**
     * Gets the value of the dTimSpud property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDTimSpud() {
        return dTimSpud;
    }

    /**
     * Sets the value of the dTimSpud property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDTimSpud(XMLGregorianCalendar value) {
        this.dTimSpud = value;
    }

    /**
     * Gets the value of the dTimPa property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDTimPa() {
        return dTimPa;
    }

    /**
     * Sets the value of the dTimPa property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDTimPa(XMLGregorianCalendar value) {
        this.dTimPa = value;
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
