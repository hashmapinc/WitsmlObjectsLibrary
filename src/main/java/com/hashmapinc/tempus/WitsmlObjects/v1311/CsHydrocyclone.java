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
 *  WITSML - Rig HydroCyclones Component Schema 
 * 
 * <p>Java class for cs_hydrocyclone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_hydrocyclone">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="manufacturer" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="model" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="dTimInstall" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dTimRemove" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="type" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="descCone" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="owner" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="nameTag" type="{http://www.witsml.org/schemas/131}cs_nameTag" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cs_hydrocyclone", propOrder = {
    "manufacturer",
    "model",
    "dTimInstall",
    "dTimRemove",
    "type",
    "descCone",
    "owner",
    "nameTag"
})
public class CsHydrocyclone {

    protected String manufacturer;
    protected String model;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimInstall;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimRemove;
    protected String type;
    protected String descCone;
    protected String owner;
    protected List<CsNameTag> nameTag;
    @XmlAttribute(name = "uid")
    protected String uid;

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
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the dTimInstall property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimInstall() {
        return dTimInstall;
    }

    /**
     * Sets the value of the dTimInstall property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimInstall(XMLGregorianCalendar value) {
        this.dTimInstall = value;
    }

    /**
     * Gets the value of the dTimRemove property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimRemove() {
        return dTimRemove;
    }

    /**
     * Sets the value of the dTimRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimRemove(XMLGregorianCalendar value) {
        this.dTimRemove = value;
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
     * Gets the value of the descCone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCone() {
        return descCone;
    }

    /**
     * Sets the value of the descCone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCone(String value) {
        this.descCone = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
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
