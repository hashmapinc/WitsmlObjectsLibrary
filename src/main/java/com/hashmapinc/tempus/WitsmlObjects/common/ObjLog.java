package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlTransient
public abstract class ObjLog {

    @XmlAttribute(name = "version", required = true)
    private String version;
    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    protected Boolean objectGrowing;
    protected String serviceCompany;
    protected String runNumber;
    protected Short bhaRunNumber;
    protected String pass;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTimeIndex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTimeIndex;
    protected String nullValue;
    @XmlAttribute(name = "uidWell")
    protected String uidWell;
    @XmlAttribute(name = "uidWellbore")
    protected String uidWellbore;
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
     * Gets the value of the nameWell property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNameWell() {
        return nameWell;
    }

    /**
     * Sets the value of the nameWell property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNameWell(String value) {
        this.nameWell = value;
    }

    /**
     * Gets the value of the nameWellbore property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNameWellbore() {
        return nameWellbore;
    }

    /**
     * Sets the value of the nameWellbore property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNameWellbore(String value) {
        this.nameWellbore = value;
    }

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
     * Gets the value of the objectGrowing property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isObjectGrowing() {
        return objectGrowing;
    }

    /**
     * Sets the value of the objectGrowing property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setObjectGrowing(Boolean value) {
        this.objectGrowing = value;
    }

    /**
     * Gets the value of the serviceCompany property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServiceCompany() {
        return serviceCompany;
    }

    /**
     * Sets the value of the serviceCompany property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServiceCompany(String value) {
        this.serviceCompany = value;
    }

    /**
     * Gets the value of the runNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRunNumber() {
        return runNumber;
    }

    /**
     * Sets the value of the runNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRunNumber(String value) {
        this.runNumber = value;
    }

    /**
     * Gets the value of the bhaRunNumber property.
     *
     * @return
     *     possible object is
     *     {@link Short }
     *
     */
    public Short getBhaRunNumber() {
        return bhaRunNumber;
    }

    /**
     * Sets the value of the bhaRunNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Short }
     *
     */
    public void setBhaRunNumber(Short value) {
        this.bhaRunNumber = value;
    }

    /**
     * Gets the value of the pass property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPass() {
        return pass;
    }

    /**
     * Sets the value of the pass property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPass(String value) {
        this.pass = value;
    }

    /**
     * Gets the value of the creationDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
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
     * Gets the value of the startDateTimeIndex property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStartDateTimeIndex() {
        return startDateTimeIndex;
    }

    /**
     * Sets the value of the startDateTimeIndex property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setStartDateTimeIndex(XMLGregorianCalendar value) {
        this.startDateTimeIndex = value;
    }

    /**
     * Gets the value of the endDateTimeIndex property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getEndDateTimeIndex() {
        return endDateTimeIndex;
    }

    /**
     * Sets the value of the endDateTimeIndex property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setEndDateTimeIndex(XMLGregorianCalendar value) {
        this.endDateTimeIndex = value;
    }

    /**
     * Gets the value of the nullValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNullValue() {
        return nullValue;
    }

    /**
     * Sets the value of the nullValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNullValue(String value) {
        this.nullValue = value;
    }

    /**
     * Gets the value of the uidWell property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUidWell() {
        return uidWell;
    }

    /**
     * Sets the value of the uidWell property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUidWell(String value) {
        this.uidWell = value;
    }

    /**
     * Gets the value of the uidWellbore property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUidWellbore() {
        return uidWellbore;
    }

    /**
     * Sets the value of the uidWellbore property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUidWellbore(String value) {
        this.uidWellbore = value;
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
