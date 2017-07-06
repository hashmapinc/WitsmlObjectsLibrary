package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Equipment NameTag Schema
 * 
 * <p>Java class for cs_nameTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_nameTag">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}kindString"/>
 *         <element name="numberingScheme" type="{http://www.witsml.org/schemas/131}NameTagNumberingScheme"/>
 *         <element name="technology" type="{http://www.witsml.org/schemas/131}NameTagTechnology" minOccurs="0"/>
 *         <element name="location" type="{http://www.witsml.org/schemas/131}NameTagLocation" minOccurs="0"/>
 *         <element name="installationDate" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="installationCompany" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="mountingCode" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="comment" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
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
@XmlType(name = "cs_nameTag", propOrder = {
    "name",
    "numberingScheme",
    "technology",
    "location",
    "installationDate",
    "installationCompany",
    "mountingCode",
    "comment"
})
public class CsNameTag {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String numberingScheme;
    protected String technology;
    protected String location;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar installationDate;
    protected String installationCompany;
    protected String mountingCode;
    protected String comment;
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
     * Gets the value of the numberingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberingScheme() {
        return numberingScheme;
    }

    /**
     * Sets the value of the numberingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberingScheme(String value) {
        this.numberingScheme = value;
    }

    /**
     * Gets the value of the technology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnology() {
        return technology;
    }

    /**
     * Sets the value of the technology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnology(String value) {
        this.technology = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the installationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstallationDate() {
        return installationDate;
    }

    /**
     * Sets the value of the installationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstallationDate(XMLGregorianCalendar value) {
        this.installationDate = value;
    }

    /**
     * Gets the value of the installationCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationCompany() {
        return installationCompany;
    }

    /**
     * Sets the value of the installationCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationCompany(String value) {
        this.installationCompany = value;
    }

    /**
     * Gets the value of the mountingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountingCode() {
        return mountingCode;
    }

    /**
     * Sets the value of the mountingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountingCode(String value) {
        this.mountingCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
