package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlTransient
public abstract class ObjTrajectory {

    @XmlAttribute(name = "version", required = true)
    private String version;
    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    protected Boolean objectGrowing;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimTrajStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimTrajEnd;
    protected String serviceCompany;
    protected Boolean definitive;
    protected Boolean memory;
    protected Boolean finalTraj;
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
     * Gets the value of the dTimTrajStart property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDTimTrajStart() {
        return dTimTrajStart;
    }

    /**
     * Sets the value of the dTimTrajStart property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDTimTrajStart(XMLGregorianCalendar value) {
        this.dTimTrajStart = value;
    }

    /**
     * Gets the value of the dTimTrajEnd property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDTimTrajEnd() {
        return dTimTrajEnd;
    }

    /**
     * Sets the value of the dTimTrajEnd property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDTimTrajEnd(XMLGregorianCalendar value) {
        this.dTimTrajEnd = value;
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
     * Gets the value of the definitive property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDefinitive() {
        return definitive;
    }

    /**
     * Sets the value of the definitive property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDefinitive(Boolean value) {
        this.definitive = value;
    }

    /**
     * Gets the value of the memory property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMemory(Boolean value) {
        this.memory = value;
    }

    /**
     * Gets the value of the finalTraj property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isFinalTraj() {
        return finalTraj;
    }

    /**
     * Sets the value of the finalTraj property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setFinalTraj(Boolean value) {
        this.finalTraj = value;
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
