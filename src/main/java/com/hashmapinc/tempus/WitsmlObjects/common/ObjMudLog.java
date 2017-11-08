package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlTransient
public abstract class ObjMudLog {

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
    protected XMLGregorianCalendar dTim;
    protected String mudLogCompany;
    protected String mudLogEngineers;
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
     * Gets the value of the mudLogCompany property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMudLogCompany() {
        return mudLogCompany;
    }

    /**
     * Sets the value of the mudLogCompany property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMudLogCompany(String value) {
        this.mudLogCompany = value;
    }

    /**
     * Gets the value of the mudLogEngineers property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMudLogEngineers() {
        return mudLogEngineers;
    }

    /**
     * Sets the value of the mudLogEngineers property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMudLogEngineers(String value) {
        this.mudLogEngineers = value;
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
