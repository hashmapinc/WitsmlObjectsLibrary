package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Operations Support Craft Component Schema
 * 
 * <p>Java class for cs_supportCraft complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_supportCraft">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="typeSuppCraft" type="{http://www.witsml.org/schemas/131}SupportCraft" minOccurs="0"/>
 *         <element name="dTimArrived" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dTimDeparted" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="comments" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
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
@XmlType(name = "cs_supportCraft", propOrder = {
    "name",
    "typeSuppCraft",
    "dTimArrived",
    "dTimDeparted",
    "comments"
})
public class CsSupportCraft {

    @XmlElement(required = true)
    protected String name;
    @XmlSchemaType(name = "string")
    protected SupportCraft typeSuppCraft;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimArrived;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimDeparted;
    protected String comments;
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
     * Gets the value of the typeSuppCraft property.
     * 
     * @return
     *     possible object is
     *     {@link SupportCraft }
     *     
     */
    public SupportCraft getTypeSuppCraft() {
        return typeSuppCraft;
    }

    /**
     * Sets the value of the typeSuppCraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCraft }
     *     
     */
    public void setTypeSuppCraft(SupportCraft value) {
        this.typeSuppCraft = value;
    }

    /**
     * Gets the value of the dTimArrived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimArrived() {
        return dTimArrived;
    }

    /**
     * Sets the value of the dTimArrived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimArrived(XMLGregorianCalendar value) {
        this.dTimArrived = value;
    }

    /**
     * Gets the value of the dTimDeparted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimDeparted() {
        return dTimDeparted;
    }

    /**
     * Sets the value of the dTimDeparted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimDeparted(XMLGregorianCalendar value) {
        this.dTimDeparted = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
