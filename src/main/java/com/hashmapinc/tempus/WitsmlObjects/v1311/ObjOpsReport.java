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
 * <p>Java class for obj_opsReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_opsReport">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_opsReport" minOccurs="0"/>
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
@XmlType(name = "obj_opsReport", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "rig",
    "dTim",
    "eTimStart",
    "eTimSpud",
    "eTimLoc",
    "mdReport",
    "tvdReport",
    "distDrill",
    "eTimDrill",
    "mdPlanned",
    "ropAv",
    "ropCurrent",
    "supervisor",
    "engineer",
    "geologist",
    "eTimDrillRot",
    "eTimDrillSlid",
    "eTimCirc",
    "eTimReam",
    "eTimHold",
    "eTimSteering",
    "distDrillRot",
    "distDrillSlid",
    "distReam",
    "distHold",
    "distSteering",
    "numPob",
    "numContract",
    "numOperator",
    "numService",
    "activity",
    "drillingParams",
    "wbGeometry",
    "dayCost",
    "trajectoryStation",
    "fluid",
    "scr",
    "pitVolume",
    "mudVolume",
    "mudInventory",
    "bulk",
    "rigResponse",
    "pumpOp",
    "shakerOp",
    "hse",
    "personnel",
    "supportCraft",
    "weather",
    "numAFE",
    "costDay",
    "costDayMud",
    "diaHole",
    "conditionHole",
    "lithology",
    "nameFormation",
    "diaCsgLast",
    "mdCsgLast",
    "tvdCsgLast",
    "tvdLot",
    "presLotEmw",
    "presKickTol",
    "volKickTol",
    "maasp",
    "tubular",
    "sum24Hr",
    "forecast24Hr",
    "statusCurrent",
    "commonData",
    "customData"
})
public class ObjOpsReport {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    protected RefNameString rig;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected TimeMeasure eTimStart;
    protected TimeMeasure eTimSpud;
    protected TimeMeasure eTimLoc;
    protected MeasuredDepthCoord mdReport;
    protected WellVerticalDepthCoord tvdReport;
    protected LengthMeasure distDrill;
    protected TimeMeasure eTimDrill;
    protected MeasuredDepthCoord mdPlanned;
    protected VelocityMeasure ropAv;
    protected VelocityMeasure ropCurrent;
    protected String supervisor;
    protected String engineer;
    protected String geologist;
    protected TimeMeasure eTimDrillRot;
    protected TimeMeasure eTimDrillSlid;
    protected TimeMeasure eTimCirc;
    protected TimeMeasure eTimReam;
    protected TimeMeasure eTimHold;
    protected TimeMeasure eTimSteering;
    protected LengthMeasure distDrillRot;
    protected LengthMeasure distDrillSlid;
    protected LengthMeasure distReam;
    protected LengthMeasure distHold;
    protected LengthMeasure distSteering;
    protected Short numPob;
    protected Short numContract;
    protected Short numOperator;
    protected Short numService;
    protected List<CsActivity> activity;
    protected List<CsDrillingParams> drillingParams;
    protected CsWbGeometry wbGeometry;
    protected List<CsDayCost> dayCost;
    protected List<CsTrajectoryStation> trajectoryStation;
    protected List<CsFluid> fluid;
    protected List<CsScr> scr;
    protected List<CsPitVolume> pitVolume;
    protected CsMudVolume mudVolume;
    protected List<CsInventory> mudInventory;
    protected List<CsInventory> bulk;
    protected CsRigResponse rigResponse;
    protected List<CsPumpOp> pumpOp;
    protected List<CsShakerOp> shakerOp;
    protected CsHse hse;
    protected List<CsPersonnel> personnel;
    protected List<CsSupportCraft> supportCraft;
    protected List<CsWeather> weather;
    protected String numAFE;
    protected Cost costDay;
    protected Cost costDayMud;
    protected LengthMeasure diaHole;
    protected String conditionHole;
    protected String lithology;
    protected String nameFormation;
    protected LengthMeasure diaCsgLast;
    protected MeasuredDepthCoord mdCsgLast;
    protected WellVerticalDepthCoord tvdCsgLast;
    protected WellVerticalDepthCoord tvdLot;
    protected DensityMeasure presLotEmw;
    protected PressureMeasure presKickTol;
    protected VolumeMeasure volKickTol;
    protected PressureMeasure maasp;
    protected RefNameString tubular;
    protected String sum24Hr;
    protected String forecast24Hr;
    protected String statusCurrent;
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
     * Gets the value of the rig property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getRig() {
        return rig;
    }

    /**
     * Sets the value of the rig property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setRig(RefNameString value) {
        this.rig = value;
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
     * Gets the value of the eTimStart property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimStart() {
        return eTimStart;
    }

    /**
     * Sets the value of the eTimStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimStart(TimeMeasure value) {
        this.eTimStart = value;
    }

    /**
     * Gets the value of the eTimSpud property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimSpud() {
        return eTimSpud;
    }

    /**
     * Sets the value of the eTimSpud property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimSpud(TimeMeasure value) {
        this.eTimSpud = value;
    }

    /**
     * Gets the value of the eTimLoc property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimLoc() {
        return eTimLoc;
    }

    /**
     * Sets the value of the eTimLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimLoc(TimeMeasure value) {
        this.eTimLoc = value;
    }

    /**
     * Gets the value of the mdReport property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdReport() {
        return mdReport;
    }

    /**
     * Sets the value of the mdReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdReport(MeasuredDepthCoord value) {
        this.mdReport = value;
    }

    /**
     * Gets the value of the tvdReport property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdReport() {
        return tvdReport;
    }

    /**
     * Sets the value of the tvdReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdReport(WellVerticalDepthCoord value) {
        this.tvdReport = value;
    }

    /**
     * Gets the value of the distDrill property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistDrill() {
        return distDrill;
    }

    /**
     * Sets the value of the distDrill property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistDrill(LengthMeasure value) {
        this.distDrill = value;
    }

    /**
     * Gets the value of the eTimDrill property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimDrill() {
        return eTimDrill;
    }

    /**
     * Sets the value of the eTimDrill property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimDrill(TimeMeasure value) {
        this.eTimDrill = value;
    }

    /**
     * Gets the value of the mdPlanned property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdPlanned() {
        return mdPlanned;
    }

    /**
     * Sets the value of the mdPlanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdPlanned(MeasuredDepthCoord value) {
        this.mdPlanned = value;
    }

    /**
     * Gets the value of the ropAv property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getRopAv() {
        return ropAv;
    }

    /**
     * Sets the value of the ropAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setRopAv(VelocityMeasure value) {
        this.ropAv = value;
    }

    /**
     * Gets the value of the ropCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getRopCurrent() {
        return ropCurrent;
    }

    /**
     * Sets the value of the ropCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setRopCurrent(VelocityMeasure value) {
        this.ropCurrent = value;
    }

    /**
     * Gets the value of the supervisor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisor() {
        return supervisor;
    }

    /**
     * Sets the value of the supervisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisor(String value) {
        this.supervisor = value;
    }

    /**
     * Gets the value of the engineer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineer() {
        return engineer;
    }

    /**
     * Sets the value of the engineer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineer(String value) {
        this.engineer = value;
    }

    /**
     * Gets the value of the geologist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeologist() {
        return geologist;
    }

    /**
     * Sets the value of the geologist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeologist(String value) {
        this.geologist = value;
    }

    /**
     * Gets the value of the eTimDrillRot property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimDrillRot() {
        return eTimDrillRot;
    }

    /**
     * Sets the value of the eTimDrillRot property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimDrillRot(TimeMeasure value) {
        this.eTimDrillRot = value;
    }

    /**
     * Gets the value of the eTimDrillSlid property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimDrillSlid() {
        return eTimDrillSlid;
    }

    /**
     * Sets the value of the eTimDrillSlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimDrillSlid(TimeMeasure value) {
        this.eTimDrillSlid = value;
    }

    /**
     * Gets the value of the eTimCirc property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimCirc() {
        return eTimCirc;
    }

    /**
     * Sets the value of the eTimCirc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimCirc(TimeMeasure value) {
        this.eTimCirc = value;
    }

    /**
     * Gets the value of the eTimReam property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimReam() {
        return eTimReam;
    }

    /**
     * Sets the value of the eTimReam property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimReam(TimeMeasure value) {
        this.eTimReam = value;
    }

    /**
     * Gets the value of the eTimHold property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimHold() {
        return eTimHold;
    }

    /**
     * Sets the value of the eTimHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimHold(TimeMeasure value) {
        this.eTimHold = value;
    }

    /**
     * Gets the value of the eTimSteering property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimSteering() {
        return eTimSteering;
    }

    /**
     * Sets the value of the eTimSteering property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimSteering(TimeMeasure value) {
        this.eTimSteering = value;
    }

    /**
     * Gets the value of the distDrillRot property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistDrillRot() {
        return distDrillRot;
    }

    /**
     * Sets the value of the distDrillRot property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistDrillRot(LengthMeasure value) {
        this.distDrillRot = value;
    }

    /**
     * Gets the value of the distDrillSlid property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistDrillSlid() {
        return distDrillSlid;
    }

    /**
     * Sets the value of the distDrillSlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistDrillSlid(LengthMeasure value) {
        this.distDrillSlid = value;
    }

    /**
     * Gets the value of the distReam property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistReam() {
        return distReam;
    }

    /**
     * Sets the value of the distReam property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistReam(LengthMeasure value) {
        this.distReam = value;
    }

    /**
     * Gets the value of the distHold property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistHold() {
        return distHold;
    }

    /**
     * Sets the value of the distHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistHold(LengthMeasure value) {
        this.distHold = value;
    }

    /**
     * Gets the value of the distSteering property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistSteering() {
        return distSteering;
    }

    /**
     * Sets the value of the distSteering property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistSteering(LengthMeasure value) {
        this.distSteering = value;
    }

    /**
     * Gets the value of the numPob property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumPob() {
        return numPob;
    }

    /**
     * Sets the value of the numPob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumPob(Short value) {
        this.numPob = value;
    }

    /**
     * Gets the value of the numContract property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumContract() {
        return numContract;
    }

    /**
     * Sets the value of the numContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumContract(Short value) {
        this.numContract = value;
    }

    /**
     * Gets the value of the numOperator property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumOperator() {
        return numOperator;
    }

    /**
     * Sets the value of the numOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumOperator(Short value) {
        this.numOperator = value;
    }

    /**
     * Gets the value of the numService property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumService() {
        return numService;
    }

    /**
     * Sets the value of the numService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumService(Short value) {
        this.numService = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getActivity().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsActivity }
     * 
     * 
     */
    public List<CsActivity> getActivity() {
        if (activity == null) {
            activity = new ArrayList<CsActivity>();
        }
        return this.activity;
    }

    /**
     * Gets the value of the drillingParams property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drillingParams property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getDrillingParams().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsDrillingParams }
     * 
     * 
     */
    public List<CsDrillingParams> getDrillingParams() {
        if (drillingParams == null) {
            drillingParams = new ArrayList<CsDrillingParams>();
        }
        return this.drillingParams;
    }

    /**
     * Gets the value of the wbGeometry property.
     * 
     * @return
     *     possible object is
     *     {@link CsWbGeometry }
     *     
     */
    public CsWbGeometry getWbGeometry() {
        return wbGeometry;
    }

    /**
     * Sets the value of the wbGeometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsWbGeometry }
     *     
     */
    public void setWbGeometry(CsWbGeometry value) {
        this.wbGeometry = value;
    }

    /**
     * Gets the value of the dayCost property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayCost property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getDayCost().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsDayCost }
     * 
     * 
     */
    public List<CsDayCost> getDayCost() {
        if (dayCost == null) {
            dayCost = new ArrayList<CsDayCost>();
        }
        return this.dayCost;
    }

    /**
     * Gets the value of the trajectoryStation property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trajectoryStation property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getTrajectoryStation().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsTrajectoryStation }
     * 
     * 
     */
    public List<CsTrajectoryStation> getTrajectoryStation() {
        if (trajectoryStation == null) {
            trajectoryStation = new ArrayList<CsTrajectoryStation>();
        }
        return this.trajectoryStation;
    }

    /**
     * Gets the value of the fluid property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fluid property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getFluid().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsFluid }
     * 
     * 
     */
    public List<CsFluid> getFluid() {
        if (fluid == null) {
            fluid = new ArrayList<CsFluid>();
        }
        return this.fluid;
    }

    /**
     * Gets the value of the scr property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scr property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getScr().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsScr }
     * 
     * 
     */
    public List<CsScr> getScr() {
        if (scr == null) {
            scr = new ArrayList<CsScr>();
        }
        return this.scr;
    }

    /**
     * Gets the value of the pitVolume property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pitVolume property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getPitVolume().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsPitVolume }
     * 
     * 
     */
    public List<CsPitVolume> getPitVolume() {
        if (pitVolume == null) {
            pitVolume = new ArrayList<CsPitVolume>();
        }
        return this.pitVolume;
    }

    /**
     * Gets the value of the mudVolume property.
     * 
     * @return
     *     possible object is
     *     {@link CsMudVolume }
     *     
     */
    public CsMudVolume getMudVolume() {
        return mudVolume;
    }

    /**
     * Sets the value of the mudVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsMudVolume }
     *     
     */
    public void setMudVolume(CsMudVolume value) {
        this.mudVolume = value;
    }

    /**
     * Gets the value of the mudInventory property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mudInventory property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getMudInventory().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsInventory }
     * 
     * 
     */
    public List<CsInventory> getMudInventory() {
        if (mudInventory == null) {
            mudInventory = new ArrayList<CsInventory>();
        }
        return this.mudInventory;
    }

    /**
     * Gets the value of the bulk property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bulk property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getBulk().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsInventory }
     * 
     * 
     */
    public List<CsInventory> getBulk() {
        if (bulk == null) {
            bulk = new ArrayList<CsInventory>();
        }
        return this.bulk;
    }

    /**
     * Gets the value of the rigResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CsRigResponse }
     *     
     */
    public CsRigResponse getRigResponse() {
        return rigResponse;
    }

    /**
     * Sets the value of the rigResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsRigResponse }
     *     
     */
    public void setRigResponse(CsRigResponse value) {
        this.rigResponse = value;
    }

    /**
     * Gets the value of the pumpOp property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pumpOp property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getPumpOp().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsPumpOp }
     * 
     * 
     */
    public List<CsPumpOp> getPumpOp() {
        if (pumpOp == null) {
            pumpOp = new ArrayList<CsPumpOp>();
        }
        return this.pumpOp;
    }

    /**
     * Gets the value of the shakerOp property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shakerOp property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getShakerOp().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsShakerOp }
     * 
     * 
     */
    public List<CsShakerOp> getShakerOp() {
        if (shakerOp == null) {
            shakerOp = new ArrayList<CsShakerOp>();
        }
        return this.shakerOp;
    }

    /**
     * Gets the value of the hse property.
     * 
     * @return
     *     possible object is
     *     {@link CsHse }
     *     
     */
    public CsHse getHse() {
        return hse;
    }

    /**
     * Sets the value of the hse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsHse }
     *     
     */
    public void setHse(CsHse value) {
        this.hse = value;
    }

    /**
     * Gets the value of the personnel property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnel property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getPersonnel().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsPersonnel }
     * 
     * 
     */
    public List<CsPersonnel> getPersonnel() {
        if (personnel == null) {
            personnel = new ArrayList<CsPersonnel>();
        }
        return this.personnel;
    }

    /**
     * Gets the value of the supportCraft property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportCraft property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getSupportCraft().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsSupportCraft }
     * 
     * 
     */
    public List<CsSupportCraft> getSupportCraft() {
        if (supportCraft == null) {
            supportCraft = new ArrayList<CsSupportCraft>();
        }
        return this.supportCraft;
    }

    /**
     * Gets the value of the weather property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weather property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getWeather().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsWeather }
     * 
     * 
     */
    public List<CsWeather> getWeather() {
        if (weather == null) {
            weather = new ArrayList<CsWeather>();
        }
        return this.weather;
    }

    /**
     * Gets the value of the numAFE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAFE() {
        return numAFE;
    }

    /**
     * Sets the value of the numAFE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAFE(String value) {
        this.numAFE = value;
    }

    /**
     * Gets the value of the costDay property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getCostDay() {
        return costDay;
    }

    /**
     * Sets the value of the costDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setCostDay(Cost value) {
        this.costDay = value;
    }

    /**
     * Gets the value of the costDayMud property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getCostDayMud() {
        return costDayMud;
    }

    /**
     * Sets the value of the costDayMud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setCostDayMud(Cost value) {
        this.costDayMud = value;
    }

    /**
     * Gets the value of the diaHole property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaHole() {
        return diaHole;
    }

    /**
     * Sets the value of the diaHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaHole(LengthMeasure value) {
        this.diaHole = value;
    }

    /**
     * Gets the value of the conditionHole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionHole() {
        return conditionHole;
    }

    /**
     * Sets the value of the conditionHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionHole(String value) {
        this.conditionHole = value;
    }

    /**
     * Gets the value of the lithology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLithology() {
        return lithology;
    }

    /**
     * Sets the value of the lithology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLithology(String value) {
        this.lithology = value;
    }

    /**
     * Gets the value of the nameFormation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFormation() {
        return nameFormation;
    }

    /**
     * Sets the value of the nameFormation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFormation(String value) {
        this.nameFormation = value;
    }

    /**
     * Gets the value of the diaCsgLast property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaCsgLast() {
        return diaCsgLast;
    }

    /**
     * Sets the value of the diaCsgLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaCsgLast(LengthMeasure value) {
        this.diaCsgLast = value;
    }

    /**
     * Gets the value of the mdCsgLast property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdCsgLast() {
        return mdCsgLast;
    }

    /**
     * Sets the value of the mdCsgLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdCsgLast(MeasuredDepthCoord value) {
        this.mdCsgLast = value;
    }

    /**
     * Gets the value of the tvdCsgLast property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdCsgLast() {
        return tvdCsgLast;
    }

    /**
     * Sets the value of the tvdCsgLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdCsgLast(WellVerticalDepthCoord value) {
        this.tvdCsgLast = value;
    }

    /**
     * Gets the value of the tvdLot property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdLot() {
        return tvdLot;
    }

    /**
     * Sets the value of the tvdLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdLot(WellVerticalDepthCoord value) {
        this.tvdLot = value;
    }

    /**
     * Gets the value of the presLotEmw property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getPresLotEmw() {
        return presLotEmw;
    }

    /**
     * Sets the value of the presLotEmw property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setPresLotEmw(DensityMeasure value) {
        this.presLotEmw = value;
    }

    /**
     * Gets the value of the presKickTol property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresKickTol() {
        return presKickTol;
    }

    /**
     * Sets the value of the presKickTol property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresKickTol(PressureMeasure value) {
        this.presKickTol = value;
    }

    /**
     * Gets the value of the volKickTol property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolKickTol() {
        return volKickTol;
    }

    /**
     * Sets the value of the volKickTol property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolKickTol(VolumeMeasure value) {
        this.volKickTol = value;
    }

    /**
     * Gets the value of the maasp property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getMaasp() {
        return maasp;
    }

    /**
     * Sets the value of the maasp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setMaasp(PressureMeasure value) {
        this.maasp = value;
    }

    /**
     * Gets the value of the tubular property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getTubular() {
        return tubular;
    }

    /**
     * Sets the value of the tubular property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setTubular(RefNameString value) {
        this.tubular = value;
    }

    /**
     * Gets the value of the sum24Hr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSum24Hr() {
        return sum24Hr;
    }

    /**
     * Sets the value of the sum24Hr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSum24Hr(String value) {
        this.sum24Hr = value;
    }

    /**
     * Gets the value of the forecast24Hr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecast24Hr() {
        return forecast24Hr;
    }

    /**
     * Sets the value of the forecast24Hr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecast24Hr(String value) {
        this.forecast24Hr = value;
    }

    /**
     * Gets the value of the statusCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCurrent() {
        return statusCurrent;
    }

    /**
     * Sets the value of the statusCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCurrent(String value) {
        this.statusCurrent = value;
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
