package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Rig BOP Component Schema.
 * 
 * <p>Java class for cs_bop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_bop">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="manufacturer" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="model" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="dTimInstall" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dTimRemove" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="nameTag" type="{http://www.witsml.org/schemas/131}cs_nameTag" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="typeConnectionBop" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="sizeConnectionBop" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="presBopRating" type="{http://www.witsml.org/schemas/131}pressureMeasure"/>
 *         <element name="sizeBopSys" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *         <element name="rotBop" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="idBoosterLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="odBoosterLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenBoosterLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idSurfLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="odSurfLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenSurfLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idChkLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="odChkLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenChkLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idKillLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="odKillLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenKillLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="bopComponent" type="{http://www.witsml.org/schemas/131}cs_bopComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="typeDiverter" type="{http://www.witsml.org/schemas/131}shortDescriptionString" minOccurs="0"/>
 *         <element name="diaDiverter" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="presWorkDiverter" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="accumulator" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="capAccFluid" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="presAccPreCharge" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="volAccPreCharge" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="presAccOpRating" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="typeControlManifold" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="descControlManifold" type="{http://www.witsml.org/schemas/131}descriptionString" minOccurs="0"/>
 *         <element name="typeChokeManifold" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="presChokeManifold" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_bop", propOrder = {
    "manufacturer",
    "model",
    "dTimInstall",
    "dTimRemove",
    "nameTag",
    "typeConnectionBop",
    "sizeConnectionBop",
    "presBopRating",
    "sizeBopSys",
    "rotBop",
    "idBoosterLine",
    "odBoosterLine",
    "lenBoosterLine",
    "idSurfLine",
    "odSurfLine",
    "lenSurfLine",
    "idChkLine",
    "odChkLine",
    "lenChkLine",
    "idKillLine",
    "odKillLine",
    "lenKillLine",
    "bopComponent",
    "typeDiverter",
    "diaDiverter",
    "presWorkDiverter",
    "accumulator",
    "capAccFluid",
    "presAccPreCharge",
    "volAccPreCharge",
    "presAccOpRating",
    "typeControlManifold",
    "descControlManifold",
    "typeChokeManifold",
    "presChokeManifold"
})
public class CsBop {

    protected String manufacturer;
    protected String model;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimInstall;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimRemove;
    protected List<CsNameTag> nameTag;
    protected String typeConnectionBop;
    protected LengthMeasure sizeConnectionBop;
    @XmlElement(required = true)
    protected PressureMeasure presBopRating;
    @XmlElement(required = true)
    protected LengthMeasure sizeBopSys;
    protected Boolean rotBop;
    protected LengthMeasure idBoosterLine;
    protected LengthMeasure odBoosterLine;
    protected LengthMeasure lenBoosterLine;
    protected LengthMeasure idSurfLine;
    protected LengthMeasure odSurfLine;
    protected LengthMeasure lenSurfLine;
    protected LengthMeasure idChkLine;
    protected LengthMeasure odChkLine;
    protected LengthMeasure lenChkLine;
    protected LengthMeasure idKillLine;
    protected LengthMeasure odKillLine;
    protected LengthMeasure lenKillLine;
    protected List<CsBopComponent> bopComponent;
    protected String typeDiverter;
    protected LengthMeasure diaDiverter;
    protected PressureMeasure presWorkDiverter;
    protected String accumulator;
    protected VolumeMeasure capAccFluid;
    protected PressureMeasure presAccPreCharge;
    protected VolumeMeasure volAccPreCharge;
    protected PressureMeasure presAccOpRating;
    protected String typeControlManifold;
    protected String descControlManifold;
    protected String typeChokeManifold;
    protected PressureMeasure presChokeManifold;

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
     * Gets the value of the typeConnectionBop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeConnectionBop() {
        return typeConnectionBop;
    }

    /**
     * Sets the value of the typeConnectionBop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeConnectionBop(String value) {
        this.typeConnectionBop = value;
    }

    /**
     * Gets the value of the sizeConnectionBop property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getSizeConnectionBop() {
        return sizeConnectionBop;
    }

    /**
     * Sets the value of the sizeConnectionBop property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setSizeConnectionBop(LengthMeasure value) {
        this.sizeConnectionBop = value;
    }

    /**
     * Gets the value of the presBopRating property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresBopRating() {
        return presBopRating;
    }

    /**
     * Sets the value of the presBopRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresBopRating(PressureMeasure value) {
        this.presBopRating = value;
    }

    /**
     * Gets the value of the sizeBopSys property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getSizeBopSys() {
        return sizeBopSys;
    }

    /**
     * Sets the value of the sizeBopSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setSizeBopSys(LengthMeasure value) {
        this.sizeBopSys = value;
    }

    /**
     * Gets the value of the rotBop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRotBop() {
        return rotBop;
    }

    /**
     * Sets the value of the rotBop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRotBop(Boolean value) {
        this.rotBop = value;
    }

    /**
     * Gets the value of the idBoosterLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdBoosterLine() {
        return idBoosterLine;
    }

    /**
     * Sets the value of the idBoosterLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdBoosterLine(LengthMeasure value) {
        this.idBoosterLine = value;
    }

    /**
     * Gets the value of the odBoosterLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdBoosterLine() {
        return odBoosterLine;
    }

    /**
     * Sets the value of the odBoosterLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdBoosterLine(LengthMeasure value) {
        this.odBoosterLine = value;
    }

    /**
     * Gets the value of the lenBoosterLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenBoosterLine() {
        return lenBoosterLine;
    }

    /**
     * Sets the value of the lenBoosterLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenBoosterLine(LengthMeasure value) {
        this.lenBoosterLine = value;
    }

    /**
     * Gets the value of the idSurfLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdSurfLine() {
        return idSurfLine;
    }

    /**
     * Sets the value of the idSurfLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdSurfLine(LengthMeasure value) {
        this.idSurfLine = value;
    }

    /**
     * Gets the value of the odSurfLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdSurfLine() {
        return odSurfLine;
    }

    /**
     * Sets the value of the odSurfLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdSurfLine(LengthMeasure value) {
        this.odSurfLine = value;
    }

    /**
     * Gets the value of the lenSurfLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenSurfLine() {
        return lenSurfLine;
    }

    /**
     * Sets the value of the lenSurfLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenSurfLine(LengthMeasure value) {
        this.lenSurfLine = value;
    }

    /**
     * Gets the value of the idChkLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdChkLine() {
        return idChkLine;
    }

    /**
     * Sets the value of the idChkLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdChkLine(LengthMeasure value) {
        this.idChkLine = value;
    }

    /**
     * Gets the value of the odChkLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdChkLine() {
        return odChkLine;
    }

    /**
     * Sets the value of the odChkLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdChkLine(LengthMeasure value) {
        this.odChkLine = value;
    }

    /**
     * Gets the value of the lenChkLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenChkLine() {
        return lenChkLine;
    }

    /**
     * Sets the value of the lenChkLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenChkLine(LengthMeasure value) {
        this.lenChkLine = value;
    }

    /**
     * Gets the value of the idKillLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdKillLine() {
        return idKillLine;
    }

    /**
     * Sets the value of the idKillLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdKillLine(LengthMeasure value) {
        this.idKillLine = value;
    }

    /**
     * Gets the value of the odKillLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdKillLine() {
        return odKillLine;
    }

    /**
     * Sets the value of the odKillLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdKillLine(LengthMeasure value) {
        this.odKillLine = value;
    }

    /**
     * Gets the value of the lenKillLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenKillLine() {
        return lenKillLine;
    }

    /**
     * Sets the value of the lenKillLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenKillLine(LengthMeasure value) {
        this.lenKillLine = value;
    }

    /**
     * Gets the value of the bopComponent property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bopComponent property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getBopComponent().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsBopComponent }
     * 
     * 
     */
    public List<CsBopComponent> getBopComponent() {
        if (bopComponent == null) {
            bopComponent = new ArrayList<CsBopComponent>();
        }
        return this.bopComponent;
    }

    /**
     * Gets the value of the typeDiverter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDiverter() {
        return typeDiverter;
    }

    /**
     * Sets the value of the typeDiverter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDiverter(String value) {
        this.typeDiverter = value;
    }

    /**
     * Gets the value of the diaDiverter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaDiverter() {
        return diaDiverter;
    }

    /**
     * Sets the value of the diaDiverter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaDiverter(LengthMeasure value) {
        this.diaDiverter = value;
    }

    /**
     * Gets the value of the presWorkDiverter property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresWorkDiverter() {
        return presWorkDiverter;
    }

    /**
     * Sets the value of the presWorkDiverter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresWorkDiverter(PressureMeasure value) {
        this.presWorkDiverter = value;
    }

    /**
     * Gets the value of the accumulator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulator() {
        return accumulator;
    }

    /**
     * Sets the value of the accumulator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulator(String value) {
        this.accumulator = value;
    }

    /**
     * Gets the value of the capAccFluid property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getCapAccFluid() {
        return capAccFluid;
    }

    /**
     * Sets the value of the capAccFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setCapAccFluid(VolumeMeasure value) {
        this.capAccFluid = value;
    }

    /**
     * Gets the value of the presAccPreCharge property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresAccPreCharge() {
        return presAccPreCharge;
    }

    /**
     * Sets the value of the presAccPreCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresAccPreCharge(PressureMeasure value) {
        this.presAccPreCharge = value;
    }

    /**
     * Gets the value of the volAccPreCharge property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolAccPreCharge() {
        return volAccPreCharge;
    }

    /**
     * Sets the value of the volAccPreCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolAccPreCharge(VolumeMeasure value) {
        this.volAccPreCharge = value;
    }

    /**
     * Gets the value of the presAccOpRating property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresAccOpRating() {
        return presAccOpRating;
    }

    /**
     * Sets the value of the presAccOpRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresAccOpRating(PressureMeasure value) {
        this.presAccOpRating = value;
    }

    /**
     * Gets the value of the typeControlManifold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeControlManifold() {
        return typeControlManifold;
    }

    /**
     * Sets the value of the typeControlManifold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeControlManifold(String value) {
        this.typeControlManifold = value;
    }

    /**
     * Gets the value of the descControlManifold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescControlManifold() {
        return descControlManifold;
    }

    /**
     * Sets the value of the descControlManifold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescControlManifold(String value) {
        this.descControlManifold = value;
    }

    /**
     * Gets the value of the typeChokeManifold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeChokeManifold() {
        return typeChokeManifold;
    }

    /**
     * Sets the value of the typeChokeManifold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeChokeManifold(String value) {
        this.typeChokeManifold = value;
    }

    /**
     * Gets the value of the presChokeManifold property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresChokeManifold() {
        return presChokeManifold;
    }

    /**
     * Sets the value of the presChokeManifold property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresChokeManifold(PressureMeasure value) {
        this.presChokeManifold = value;
    }

}
