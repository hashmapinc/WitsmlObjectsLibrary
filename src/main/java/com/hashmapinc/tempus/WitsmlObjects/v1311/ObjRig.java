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
 * <p>Java class for obj_rig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_rig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_rig" minOccurs="0"/>
 *         <element name="commonData" type="{http://www.witsml.org/schemas/131}cs_commonData" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *       <attribute name="uidWell" type="{http://www.witsml.org/schemas/131}uidString" />
 *       <attribute name="uidWellbore" type="{http://www.witsml.org/schemas/131}uidString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_rig", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "owner",
    "typeRig",
    "manufacturer",
    "yearEntService",
    "classRig",
    "approvals",
    "registration",
    "telNumber",
    "faxNumber",
    "emailAddress",
    "nameContact",
    "ratingDrillDepth",
    "ratingWaterDepth",
    "isOffshore",
    "airGap",
    "dTimStartOp",
    "dTimEndOp",
    "bop",
    "pit",
    "pump",
    "shaker",
    "centrifuge",
    "hydrocyclone",
    "degasser",
    "surfaceEquipment",
    "numDerricks",
    "typeDerrick",
    "ratingDerrick",
    "htDerrick",
    "ratingHkld",
    "capWindDerrick",
    "wtBlock",
    "ratingBlock",
    "numBlockLines",
    "typeHook",
    "ratingHook",
    "sizeDrillLine",
    "typeDrawWorks",
    "powerDrawWorks",
    "ratingDrawWorks",
    "motorDrawWorks",
    "descBrake",
    "typeSwivel",
    "ratingSwivel",
    "rotSystem",
    "descRotSystem",
    "ratingTqRotSys",
    "rotSizeOpening",
    "ratingRotSystem",
    "scrSystem",
    "pipeHandlingSystem",
    "capBulkMud",
    "capLiquidMud",
    "capDrillWater",
    "capPotableWater",
    "capFuel",
    "capBulkCement",
    "mainEngine",
    "generator",
    "cementUnit",
    "numBunks",
    "bunksPerRoom",
    "numCranes",
    "numAnch",
    "moorType",
    "numGuideTens",
    "numRiserTens",
    "varDeckLdMx",
    "vdlStorm",
    "numThrusters",
    "azimuthing",
    "motionCompensationMn",
    "motionCompensationMx",
    "strokeMotionCompensation",
    "riserAngleLimit",
    "heaveMx",
    "gantry",
    "flares",
    "commonData",
    "customData"
})
public class ObjRig {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    protected String owner;
    @XmlSchemaType(name = "string")
    protected String typeRig;
    protected String manufacturer;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yearEntService;
    protected String classRig;
    protected String approvals;
    protected String registration;
    protected String telNumber;
    protected String faxNumber;
    protected String emailAddress;
    protected String nameContact;
    protected LengthMeasure ratingDrillDepth;
    protected LengthMeasure ratingWaterDepth;
    protected Boolean isOffshore;
    protected LengthMeasure airGap;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimStartOp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimEndOp;
    protected CsBop bop;
    protected List<CsPit> pit;
    protected List<CsPump> pump;
    protected List<CsShaker> shaker;
    protected List<CsCentrifuge> centrifuge;
    protected List<CsHydrocyclone> hydrocyclone;
    protected List<CsDegasser> degasser;
    protected CsSurfaceEquipment surfaceEquipment;
    protected Short numDerricks;
    @XmlSchemaType(name = "string")
    protected String typeDerrick;
    protected ForceMeasure ratingDerrick;
    protected LengthMeasure htDerrick;
    protected ForceMeasure ratingHkld;
    protected VelocityMeasure capWindDerrick;
    protected ForceMeasure wtBlock;
    protected ForceMeasure ratingBlock;
    protected Short numBlockLines;
    protected String typeHook;
    protected ForceMeasure ratingHook;
    protected LengthMeasure sizeDrillLine;
    @XmlSchemaType(name = "string")
    protected String typeDrawWorks;
    protected PowerMeasure powerDrawWorks;
    protected ForceMeasure ratingDrawWorks;
    protected String motorDrawWorks;
    protected String descBrake;
    protected String typeSwivel;
    protected ForceMeasure ratingSwivel;
    @XmlSchemaType(name = "string")
    protected String rotSystem;
    protected String descRotSystem;
    protected MomentOfForceMeasure ratingTqRotSys;
    protected LengthMeasure rotSizeOpening;
    protected ForceMeasure ratingRotSystem;
    protected String scrSystem;
    protected String pipeHandlingSystem;
    protected VolumeMeasure capBulkMud;
    protected VolumeMeasure capLiquidMud;
    protected VolumeMeasure capDrillWater;
    protected VolumeMeasure capPotableWater;
    protected VolumeMeasure capFuel;
    protected VolumeMeasure capBulkCement;
    protected String mainEngine;
    protected String generator;
    protected String cementUnit;
    protected Short numBunks;
    protected Short bunksPerRoom;
    protected Short numCranes;
    protected Short numAnch;
    protected String moorType;
    protected Short numGuideTens;
    protected Short numRiserTens;
    protected ForceMeasure varDeckLdMx;
    protected ForceMeasure vdlStorm;
    protected Short numThrusters;
    protected Boolean azimuthing;
    protected ForceMeasure motionCompensationMn;
    protected ForceMeasure motionCompensationMx;
    protected LengthMeasure strokeMotionCompensation;
    protected PlaneAngleMeasure riserAngleLimit;
    protected LengthMeasure heaveMx;
    protected String gantry;
    protected String flares;
    protected CsCommonData commonData;
    protected CsCustomData customData;
    @XmlAttribute(name = "uidWell")
    protected String uidWell;
    @XmlAttribute(name = "uidWellbore")
    protected String uidWellbore;
    @XmlAttribute(name = "uid")
    protected String uid;

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
     * Gets the value of the typeRig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeRig() {
        return typeRig;
    }

    /**
     * Sets the value of the typeRig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeRig(String value) {
        this.typeRig = value;
    }

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
     * Gets the value of the yearEntService property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearEntService() {
        return yearEntService;
    }

    /**
     * Sets the value of the yearEntService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearEntService(XMLGregorianCalendar value) {
        this.yearEntService = value;
    }

    /**
     * Gets the value of the classRig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassRig() {
        return classRig;
    }

    /**
     * Sets the value of the classRig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassRig(String value) {
        this.classRig = value;
    }

    /**
     * Gets the value of the approvals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovals() {
        return approvals;
    }

    /**
     * Sets the value of the approvals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovals(String value) {
        this.approvals = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistration(String value) {
        this.registration = value;
    }

    /**
     * Gets the value of the telNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNumber() {
        return telNumber;
    }

    /**
     * Sets the value of the telNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelNumber(String value) {
        this.telNumber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the nameContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameContact() {
        return nameContact;
    }

    /**
     * Sets the value of the nameContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameContact(String value) {
        this.nameContact = value;
    }

    /**
     * Gets the value of the ratingDrillDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getRatingDrillDepth() {
        return ratingDrillDepth;
    }

    /**
     * Sets the value of the ratingDrillDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setRatingDrillDepth(LengthMeasure value) {
        this.ratingDrillDepth = value;
    }

    /**
     * Gets the value of the ratingWaterDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getRatingWaterDepth() {
        return ratingWaterDepth;
    }

    /**
     * Sets the value of the ratingWaterDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setRatingWaterDepth(LengthMeasure value) {
        this.ratingWaterDepth = value;
    }

    /**
     * Gets the value of the isOffshore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOffshore() {
        return isOffshore;
    }

    /**
     * Sets the value of the isOffshore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOffshore(Boolean value) {
        this.isOffshore = value;
    }

    /**
     * Gets the value of the airGap property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getAirGap() {
        return airGap;
    }

    /**
     * Sets the value of the airGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setAirGap(LengthMeasure value) {
        this.airGap = value;
    }

    /**
     * Gets the value of the dTimStartOp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimStartOp() {
        return dTimStartOp;
    }

    /**
     * Sets the value of the dTimStartOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimStartOp(XMLGregorianCalendar value) {
        this.dTimStartOp = value;
    }

    /**
     * Gets the value of the dTimEndOp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimEndOp() {
        return dTimEndOp;
    }

    /**
     * Sets the value of the dTimEndOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimEndOp(XMLGregorianCalendar value) {
        this.dTimEndOp = value;
    }

    /**
     * Gets the value of the bop property.
     * 
     * @return
     *     possible object is
     *     {@link CsBop }
     *     
     */
    public CsBop getBop() {
        return bop;
    }

    /**
     * Sets the value of the bop property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsBop }
     *     
     */
    public void setBop(CsBop value) {
        this.bop = value;
    }

    /**
     * Gets the value of the pit property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pit property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getPit().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsPit }
     * 
     * 
     */
    public List<CsPit> getPit() {
        if (pit == null) {
            pit = new ArrayList<CsPit>();
        }
        return this.pit;
    }

    /**
     * Gets the value of the pump property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pump property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getPump().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsPump }
     * 
     * 
     */
    public List<CsPump> getPump() {
        if (pump == null) {
            pump = new ArrayList<CsPump>();
        }
        return this.pump;
    }

    /**
     * Gets the value of the shaker property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shaker property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getShaker().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsShaker }
     * 
     * 
     */
    public List<CsShaker> getShaker() {
        if (shaker == null) {
            shaker = new ArrayList<CsShaker>();
        }
        return this.shaker;
    }

    /**
     * Gets the value of the centrifuge property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the centrifuge property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getCentrifuge().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsCentrifuge }
     * 
     * 
     */
    public List<CsCentrifuge> getCentrifuge() {
        if (centrifuge == null) {
            centrifuge = new ArrayList<CsCentrifuge>();
        }
        return this.centrifuge;
    }

    /**
     * Gets the value of the hydrocyclone property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hydrocyclone property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getHydrocyclone().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsHydrocyclone }
     * 
     * 
     */
    public List<CsHydrocyclone> getHydrocyclone() {
        if (hydrocyclone == null) {
            hydrocyclone = new ArrayList<CsHydrocyclone>();
        }
        return this.hydrocyclone;
    }

    /**
     * Gets the value of the degasser property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the degasser property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getDegasser().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsDegasser }
     * 
     * 
     */
    public List<CsDegasser> getDegasser() {
        if (degasser == null) {
            degasser = new ArrayList<CsDegasser>();
        }
        return this.degasser;
    }

    /**
     * Gets the value of the surfaceEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link CsSurfaceEquipment }
     *     
     */
    public CsSurfaceEquipment getSurfaceEquipment() {
        return surfaceEquipment;
    }

    /**
     * Sets the value of the surfaceEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsSurfaceEquipment }
     *     
     */
    public void setSurfaceEquipment(CsSurfaceEquipment value) {
        this.surfaceEquipment = value;
    }

    /**
     * Gets the value of the numDerricks property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumDerricks() {
        return numDerricks;
    }

    /**
     * Sets the value of the numDerricks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumDerricks(Short value) {
        this.numDerricks = value;
    }

    /**
     * Gets the value of the typeDerrick property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDerrick() {
        return typeDerrick;
    }

    /**
     * Sets the value of the typeDerrick property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDerrick(String value) {
        this.typeDerrick = value;
    }

    /**
     * Gets the value of the ratingDerrick property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getRatingDerrick() {
        return ratingDerrick;
    }

    /**
     * Sets the value of the ratingDerrick property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setRatingDerrick(ForceMeasure value) {
        this.ratingDerrick = value;
    }

    /**
     * Gets the value of the htDerrick property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getHtDerrick() {
        return htDerrick;
    }

    /**
     * Sets the value of the htDerrick property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setHtDerrick(LengthMeasure value) {
        this.htDerrick = value;
    }

    /**
     * Gets the value of the ratingHkld property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getRatingHkld() {
        return ratingHkld;
    }

    /**
     * Sets the value of the ratingHkld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setRatingHkld(ForceMeasure value) {
        this.ratingHkld = value;
    }

    /**
     * Gets the value of the capWindDerrick property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getCapWindDerrick() {
        return capWindDerrick;
    }

    /**
     * Sets the value of the capWindDerrick property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setCapWindDerrick(VelocityMeasure value) {
        this.capWindDerrick = value;
    }

    /**
     * Gets the value of the wtBlock property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getWtBlock() {
        return wtBlock;
    }

    /**
     * Sets the value of the wtBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setWtBlock(ForceMeasure value) {
        this.wtBlock = value;
    }

    /**
     * Gets the value of the ratingBlock property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getRatingBlock() {
        return ratingBlock;
    }

    /**
     * Sets the value of the ratingBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setRatingBlock(ForceMeasure value) {
        this.ratingBlock = value;
    }

    /**
     * Gets the value of the numBlockLines property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumBlockLines() {
        return numBlockLines;
    }

    /**
     * Sets the value of the numBlockLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumBlockLines(Short value) {
        this.numBlockLines = value;
    }

    /**
     * Gets the value of the typeHook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeHook() {
        return typeHook;
    }

    /**
     * Sets the value of the typeHook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeHook(String value) {
        this.typeHook = value;
    }

    /**
     * Gets the value of the ratingHook property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getRatingHook() {
        return ratingHook;
    }

    /**
     * Sets the value of the ratingHook property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setRatingHook(ForceMeasure value) {
        this.ratingHook = value;
    }

    /**
     * Gets the value of the sizeDrillLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getSizeDrillLine() {
        return sizeDrillLine;
    }

    /**
     * Sets the value of the sizeDrillLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setSizeDrillLine(LengthMeasure value) {
        this.sizeDrillLine = value;
    }

    /**
     * Gets the value of the typeDrawWorks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDrawWorks() {
        return typeDrawWorks;
    }

    /**
     * Sets the value of the typeDrawWorks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDrawWorks(String value) {
        this.typeDrawWorks = value;
    }

    /**
     * Gets the value of the powerDrawWorks property.
     * 
     * @return
     *     possible object is
     *     {@link PowerMeasure }
     *     
     */
    public PowerMeasure getPowerDrawWorks() {
        return powerDrawWorks;
    }

    /**
     * Sets the value of the powerDrawWorks property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerMeasure }
     *     
     */
    public void setPowerDrawWorks(PowerMeasure value) {
        this.powerDrawWorks = value;
    }

    /**
     * Gets the value of the ratingDrawWorks property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getRatingDrawWorks() {
        return ratingDrawWorks;
    }

    /**
     * Sets the value of the ratingDrawWorks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setRatingDrawWorks(ForceMeasure value) {
        this.ratingDrawWorks = value;
    }

    /**
     * Gets the value of the motorDrawWorks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotorDrawWorks() {
        return motorDrawWorks;
    }

    /**
     * Sets the value of the motorDrawWorks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotorDrawWorks(String value) {
        this.motorDrawWorks = value;
    }

    /**
     * Gets the value of the descBrake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescBrake() {
        return descBrake;
    }

    /**
     * Sets the value of the descBrake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescBrake(String value) {
        this.descBrake = value;
    }

    /**
     * Gets the value of the typeSwivel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSwivel() {
        return typeSwivel;
    }

    /**
     * Sets the value of the typeSwivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSwivel(String value) {
        this.typeSwivel = value;
    }

    /**
     * Gets the value of the ratingSwivel property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getRatingSwivel() {
        return ratingSwivel;
    }

    /**
     * Sets the value of the ratingSwivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setRatingSwivel(ForceMeasure value) {
        this.ratingSwivel = value;
    }

    /**
     * Gets the value of the rotSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotSystem() {
        return rotSystem;
    }

    /**
     * Sets the value of the rotSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotSystem(String value) {
        this.rotSystem = value;
    }

    /**
     * Gets the value of the descRotSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRotSystem() {
        return descRotSystem;
    }

    /**
     * Sets the value of the descRotSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRotSystem(String value) {
        this.descRotSystem = value;
    }

    /**
     * Gets the value of the ratingTqRotSys property.
     * 
     * @return
     *     possible object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public MomentOfForceMeasure getRatingTqRotSys() {
        return ratingTqRotSys;
    }

    /**
     * Sets the value of the ratingTqRotSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public void setRatingTqRotSys(MomentOfForceMeasure value) {
        this.ratingTqRotSys = value;
    }

    /**
     * Gets the value of the rotSizeOpening property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getRotSizeOpening() {
        return rotSizeOpening;
    }

    /**
     * Sets the value of the rotSizeOpening property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setRotSizeOpening(LengthMeasure value) {
        this.rotSizeOpening = value;
    }

    /**
     * Gets the value of the ratingRotSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getRatingRotSystem() {
        return ratingRotSystem;
    }

    /**
     * Sets the value of the ratingRotSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setRatingRotSystem(ForceMeasure value) {
        this.ratingRotSystem = value;
    }

    /**
     * Gets the value of the scrSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrSystem() {
        return scrSystem;
    }

    /**
     * Sets the value of the scrSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrSystem(String value) {
        this.scrSystem = value;
    }

    /**
     * Gets the value of the pipeHandlingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipeHandlingSystem() {
        return pipeHandlingSystem;
    }

    /**
     * Sets the value of the pipeHandlingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipeHandlingSystem(String value) {
        this.pipeHandlingSystem = value;
    }

    /**
     * Gets the value of the capBulkMud property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getCapBulkMud() {
        return capBulkMud;
    }

    /**
     * Sets the value of the capBulkMud property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setCapBulkMud(VolumeMeasure value) {
        this.capBulkMud = value;
    }

    /**
     * Gets the value of the capLiquidMud property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getCapLiquidMud() {
        return capLiquidMud;
    }

    /**
     * Sets the value of the capLiquidMud property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setCapLiquidMud(VolumeMeasure value) {
        this.capLiquidMud = value;
    }

    /**
     * Gets the value of the capDrillWater property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getCapDrillWater() {
        return capDrillWater;
    }

    /**
     * Sets the value of the capDrillWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setCapDrillWater(VolumeMeasure value) {
        this.capDrillWater = value;
    }

    /**
     * Gets the value of the capPotableWater property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getCapPotableWater() {
        return capPotableWater;
    }

    /**
     * Sets the value of the capPotableWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setCapPotableWater(VolumeMeasure value) {
        this.capPotableWater = value;
    }

    /**
     * Gets the value of the capFuel property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getCapFuel() {
        return capFuel;
    }

    /**
     * Sets the value of the capFuel property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setCapFuel(VolumeMeasure value) {
        this.capFuel = value;
    }

    /**
     * Gets the value of the capBulkCement property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getCapBulkCement() {
        return capBulkCement;
    }

    /**
     * Sets the value of the capBulkCement property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setCapBulkCement(VolumeMeasure value) {
        this.capBulkCement = value;
    }

    /**
     * Gets the value of the mainEngine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainEngine() {
        return mainEngine;
    }

    /**
     * Sets the value of the mainEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainEngine(String value) {
        this.mainEngine = value;
    }

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerator(String value) {
        this.generator = value;
    }

    /**
     * Gets the value of the cementUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCementUnit() {
        return cementUnit;
    }

    /**
     * Sets the value of the cementUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCementUnit(String value) {
        this.cementUnit = value;
    }

    /**
     * Gets the value of the numBunks property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumBunks() {
        return numBunks;
    }

    /**
     * Sets the value of the numBunks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumBunks(Short value) {
        this.numBunks = value;
    }

    /**
     * Gets the value of the bunksPerRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBunksPerRoom() {
        return bunksPerRoom;
    }

    /**
     * Sets the value of the bunksPerRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBunksPerRoom(Short value) {
        this.bunksPerRoom = value;
    }

    /**
     * Gets the value of the numCranes property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumCranes() {
        return numCranes;
    }

    /**
     * Sets the value of the numCranes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumCranes(Short value) {
        this.numCranes = value;
    }

    /**
     * Gets the value of the numAnch property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumAnch() {
        return numAnch;
    }

    /**
     * Sets the value of the numAnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumAnch(Short value) {
        this.numAnch = value;
    }

    /**
     * Gets the value of the moorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoorType() {
        return moorType;
    }

    /**
     * Sets the value of the moorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoorType(String value) {
        this.moorType = value;
    }

    /**
     * Gets the value of the numGuideTens property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumGuideTens() {
        return numGuideTens;
    }

    /**
     * Sets the value of the numGuideTens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumGuideTens(Short value) {
        this.numGuideTens = value;
    }

    /**
     * Gets the value of the numRiserTens property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumRiserTens() {
        return numRiserTens;
    }

    /**
     * Sets the value of the numRiserTens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumRiserTens(Short value) {
        this.numRiserTens = value;
    }

    /**
     * Gets the value of the varDeckLdMx property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getVarDeckLdMx() {
        return varDeckLdMx;
    }

    /**
     * Sets the value of the varDeckLdMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setVarDeckLdMx(ForceMeasure value) {
        this.varDeckLdMx = value;
    }

    /**
     * Gets the value of the vdlStorm property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getVdlStorm() {
        return vdlStorm;
    }

    /**
     * Sets the value of the vdlStorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setVdlStorm(ForceMeasure value) {
        this.vdlStorm = value;
    }

    /**
     * Gets the value of the numThrusters property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumThrusters() {
        return numThrusters;
    }

    /**
     * Sets the value of the numThrusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumThrusters(Short value) {
        this.numThrusters = value;
    }

    /**
     * Gets the value of the azimuthing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAzimuthing() {
        return azimuthing;
    }

    /**
     * Sets the value of the azimuthing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAzimuthing(Boolean value) {
        this.azimuthing = value;
    }

    /**
     * Gets the value of the motionCompensationMn property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getMotionCompensationMn() {
        return motionCompensationMn;
    }

    /**
     * Sets the value of the motionCompensationMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setMotionCompensationMn(ForceMeasure value) {
        this.motionCompensationMn = value;
    }

    /**
     * Gets the value of the motionCompensationMx property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getMotionCompensationMx() {
        return motionCompensationMx;
    }

    /**
     * Sets the value of the motionCompensationMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setMotionCompensationMx(ForceMeasure value) {
        this.motionCompensationMx = value;
    }

    /**
     * Gets the value of the strokeMotionCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getStrokeMotionCompensation() {
        return strokeMotionCompensation;
    }

    /**
     * Sets the value of the strokeMotionCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setStrokeMotionCompensation(LengthMeasure value) {
        this.strokeMotionCompensation = value;
    }

    /**
     * Gets the value of the riserAngleLimit property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getRiserAngleLimit() {
        return riserAngleLimit;
    }

    /**
     * Sets the value of the riserAngleLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setRiserAngleLimit(PlaneAngleMeasure value) {
        this.riserAngleLimit = value;
    }

    /**
     * Gets the value of the heaveMx property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getHeaveMx() {
        return heaveMx;
    }

    /**
     * Sets the value of the heaveMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setHeaveMx(LengthMeasure value) {
        this.heaveMx = value;
    }

    /**
     * Gets the value of the gantry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGantry() {
        return gantry;
    }

    /**
     * Sets the value of the gantry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGantry(String value) {
        this.gantry = value;
    }

    /**
     * Gets the value of the flares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlares() {
        return flares;
    }

    /**
     * Sets the value of the flares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlares(String value) {
        this.flares = value;
    }

    /**
     * Gets the value of the commonData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCommonData }
     *     
     */
    public CsCommonData getCommonData() {
        return commonData;
    }

    /**
     * Sets the value of the commonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCommonData }
     *     
     */
    public void setCommonData(CsCommonData value) {
        this.commonData = value;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCustomData }
     *     
     */
    public CsCustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCustomData }
     *     
     */
    public void setCustomData(CsCustomData value) {
        this.customData = value;
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
