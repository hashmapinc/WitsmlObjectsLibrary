package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  WITSML - Rig Pit Component Schema 
 * 
 * <p>Java class for cs_pit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_pit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="index" type="{http://www.witsml.org/schemas/131}positiveCount"/>
 *         <element name="dTimInstall" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dTimRemove" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="capMx" type="{http://www.witsml.org/schemas/131}volumeMeasure"/>
 *         <element name="owner" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="typePit" type="{http://www.witsml.org/schemas/131}PitType" minOccurs="0"/>
 *         <element name="isActive" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
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
@XmlType(name = "cs_pit", propOrder = {
    "index",
    "dTimInstall",
    "dTimRemove",
    "capMx",
    "owner",
    "typePit",
    "isActive",
    "nameTag"
})
public class CsPit {

    protected short index;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimInstall;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimRemove;
    @XmlElement(required = true)
    protected VolumeMeasure capMx;
    protected String owner;
    @XmlSchemaType(name = "string")
    protected PitType typePit;
    protected Boolean isActive;
    protected List<CsNameTag> nameTag;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the index property.
     * 
     */
    public short getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(short value) {
        this.index = value;
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
     * Gets the value of the capMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getCapMx() {
        return capMx;
    }

    /**
     * Sets the value of the capMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setCapMx(VolumeMeasure value) {
        this.capMx = value;
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
     * Gets the value of the typePit property.
     * 
     * @return
     *     possible object is
     *     {@link PitType }
     *     
     */
    public PitType getTypePit() {
        return typePit;
    }

    /**
     * Sets the value of the typePit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PitType }
     *     
     */
    public void setTypePit(PitType value) {
        this.typePit = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
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
