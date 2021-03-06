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
 *  WITSML - Rig Degasser Component Schema 
 * 
 * <p>Java class for cs_degasser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_degasser">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="manufacturer" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="model" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="dTimInstall" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dTimRemove" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="type" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="owner" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="height" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="len" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="id" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="capFlow" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="areaSeparatorFlow" type="{http://www.witsml.org/schemas/131}areaMeasure" minOccurs="0"/>
 *         <element name="htMudSeal" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idInlet" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idVentLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenVentLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="capGasSep" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="capBlowdown" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="presRating" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="tempRating" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
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
@XmlType(name = "cs_degasser", propOrder = {
    "manufacturer",
    "model",
    "dTimInstall",
    "dTimRemove",
    "type",
    "owner",
    "height",
    "len",
    "id",
    "capFlow",
    "areaSeparatorFlow",
    "htMudSeal",
    "idInlet",
    "idVentLine",
    "lenVentLine",
    "capGasSep",
    "capBlowdown",
    "presRating",
    "tempRating",
    "nameTag"
})
public class CsDegasser {

    protected String manufacturer;
    protected String model;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimInstall;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimRemove;
    protected String type;
    protected String owner;
    protected LengthMeasure height;
    protected LengthMeasure len;
    protected LengthMeasure id;
    protected VolumeFlowRateMeasure capFlow;
    protected AreaMeasure areaSeparatorFlow;
    protected LengthMeasure htMudSeal;
    protected LengthMeasure idInlet;
    protected LengthMeasure idVentLine;
    protected LengthMeasure lenVentLine;
    protected VolumeFlowRateMeasure capGasSep;
    protected VolumeFlowRateMeasure capBlowdown;
    protected PressureMeasure presRating;
    protected ThermodynamicTemperatureMeasure tempRating;
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
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setHeight(LengthMeasure value) {
        this.height = value;
    }

    /**
     * Gets the value of the len property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLen() {
        return len;
    }

    /**
     * Sets the value of the len property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLen(LengthMeasure value) {
        this.len = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setId(LengthMeasure value) {
        this.id = value;
    }

    /**
     * Gets the value of the capFlow property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getCapFlow() {
        return capFlow;
    }

    /**
     * Sets the value of the capFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setCapFlow(VolumeFlowRateMeasure value) {
        this.capFlow = value;
    }

    /**
     * Gets the value of the areaSeparatorFlow property.
     * 
     * @return
     *     possible object is
     *     {@link AreaMeasure }
     *     
     */
    public AreaMeasure getAreaSeparatorFlow() {
        return areaSeparatorFlow;
    }

    /**
     * Sets the value of the areaSeparatorFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaMeasure }
     *     
     */
    public void setAreaSeparatorFlow(AreaMeasure value) {
        this.areaSeparatorFlow = value;
    }

    /**
     * Gets the value of the htMudSeal property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getHtMudSeal() {
        return htMudSeal;
    }

    /**
     * Sets the value of the htMudSeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setHtMudSeal(LengthMeasure value) {
        this.htMudSeal = value;
    }

    /**
     * Gets the value of the idInlet property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdInlet() {
        return idInlet;
    }

    /**
     * Sets the value of the idInlet property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdInlet(LengthMeasure value) {
        this.idInlet = value;
    }

    /**
     * Gets the value of the idVentLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdVentLine() {
        return idVentLine;
    }

    /**
     * Sets the value of the idVentLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdVentLine(LengthMeasure value) {
        this.idVentLine = value;
    }

    /**
     * Gets the value of the lenVentLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenVentLine() {
        return lenVentLine;
    }

    /**
     * Sets the value of the lenVentLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenVentLine(LengthMeasure value) {
        this.lenVentLine = value;
    }

    /**
     * Gets the value of the capGasSep property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getCapGasSep() {
        return capGasSep;
    }

    /**
     * Sets the value of the capGasSep property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setCapGasSep(VolumeFlowRateMeasure value) {
        this.capGasSep = value;
    }

    /**
     * Gets the value of the capBlowdown property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getCapBlowdown() {
        return capBlowdown;
    }

    /**
     * Sets the value of the capBlowdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setCapBlowdown(VolumeFlowRateMeasure value) {
        this.capBlowdown = value;
    }

    /**
     * Gets the value of the presRating property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresRating() {
        return presRating;
    }

    /**
     * Sets the value of the presRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresRating(PressureMeasure value) {
        this.presRating = value;
    }

    /**
     * Gets the value of the tempRating property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempRating() {
        return tempRating;
    }

    /**
     * Sets the value of the tempRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempRating(ThermodynamicTemperatureMeasure value) {
        this.tempRating = value;
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
