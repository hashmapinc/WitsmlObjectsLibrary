package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlTransient
public abstract class ObjWellbore {

    @XmlAttribute(name = "version", required = true)
    private String version;
    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String name;
    protected String number;
    protected String suffixAPI;
    protected String numGovt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimKickoff;
    protected Boolean achievedTD;
    @XmlAttribute(name = "uidWell")
    protected String uidWell;
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
     * Gets the value of the number property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the suffixAPI property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSuffixAPI() {
        return suffixAPI;
    }

    /**
     * Sets the value of the suffixAPI property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSuffixAPI(String value) {
        this.suffixAPI = value;
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
     * Gets the value of the dTimKickoff property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDTimKickoff() {
        return dTimKickoff;
    }

    /**
     * Sets the value of the dTimKickoff property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDTimKickoff(XMLGregorianCalendar value) {
        this.dTimKickoff = value;
    }

    /**
     * Gets the value of the achievedTD property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isAchievedTD() {
        return achievedTD;
    }

    /**
     * Sets the value of the achievedTD property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAchievedTD(Boolean value) {
        this.achievedTD = value;
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
