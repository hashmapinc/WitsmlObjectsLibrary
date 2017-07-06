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
 * <p>Java class for obj_cementJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_cementJob">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_cementJob" minOccurs="0"/>
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
@XmlType(name = "obj_cementJob", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "jobType",
    "jobConfig",
    "dTimJob",
    "nameCementedString",
    "holeConfig",
    "nameWorkString",
    "contractor",
    "cementEngr",
    "offshoreJob",
    "mdWater",
    "returnsToSeabed",
    "reciprocating",
    "woc",
    "mdPlugTop",
    "mdPlugBot",
    "mdHole",
    "mdShoe",
    "tvdShoe",
    "mdStringSet",
    "tvdStringSet",
    "cementStage",
    "cementTest",
    "typePlug",
    "nameCementString",
    "dTimPlugSet",
    "cementDrillOut",
    "dTimCementDrillOut",
    "typeSqueeze",
    "mdSqueeze",
    "dTimSqueeze",
    "toolCompany",
    "typeTool",
    "dTimPipeRotStart",
    "dTimPipeRotEnd",
    "rpmPipe",
    "tqInitPipeRot",
    "tqPipeAv",
    "tqPipeMx",
    "dTimRecipStart",
    "dTimRecipEnd",
    "overPull",
    "slackOff",
    "rpmPipeRecip",
    "lenPipeRecipStroke",
    "coilTubing",
    "commonData",
    "customData"
})
public class ObjCementJob {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    @XmlSchemaType(name = "string")
    protected CementJobType jobType;
    protected String jobConfig;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimJob;
    protected String nameCementedString;
    protected CsWbGeometry holeConfig;
    protected String nameWorkString;
    protected String contractor;
    protected String cementEngr;
    protected Boolean offshoreJob;
    protected MeasuredDepthCoord mdWater;
    protected Boolean returnsToSeabed;
    protected Boolean reciprocating;
    protected TimeMeasure woc;
    protected MeasuredDepthCoord mdPlugTop;
    protected MeasuredDepthCoord mdPlugBot;
    protected MeasuredDepthCoord mdHole;
    protected MeasuredDepthCoord mdShoe;
    protected WellVerticalDepthCoord tvdShoe;
    protected MeasuredDepthCoord mdStringSet;
    protected WellVerticalDepthCoord tvdStringSet;
    protected List<CsCementStage> cementStage;
    protected CsCementTest cementTest;
    protected String typePlug;
    protected String nameCementString;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimPlugSet;
    protected Boolean cementDrillOut;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimCementDrillOut;
    protected String typeSqueeze;
    protected MeasuredDepthCoord mdSqueeze;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimSqueeze;
    protected String toolCompany;
    protected String typeTool;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimPipeRotStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimPipeRotEnd;
    protected AnglePerTimeMeasure rpmPipe;
    protected MomentOfForceMeasure tqInitPipeRot;
    protected MomentOfForceMeasure tqPipeAv;
    protected MomentOfForceMeasure tqPipeMx;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimRecipStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimRecipEnd;
    protected ForceMeasure overPull;
    protected ForceMeasure slackOff;
    protected AnglePerTimeMeasure rpmPipeRecip;
    protected LengthMeasure lenPipeRecipStroke;
    protected Boolean coilTubing;
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
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link CementJobType }
     *     
     */
    public CementJobType getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CementJobType }
     *     
     */
    public void setJobType(CementJobType value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the jobConfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobConfig() {
        return jobConfig;
    }

    /**
     * Sets the value of the jobConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobConfig(String value) {
        this.jobConfig = value;
    }

    /**
     * Gets the value of the dTimJob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimJob() {
        return dTimJob;
    }

    /**
     * Sets the value of the dTimJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimJob(XMLGregorianCalendar value) {
        this.dTimJob = value;
    }

    /**
     * Gets the value of the nameCementedString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCementedString() {
        return nameCementedString;
    }

    /**
     * Sets the value of the nameCementedString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCementedString(String value) {
        this.nameCementedString = value;
    }

    /**
     * Gets the value of the holeConfig property.
     * 
     * @return
     *     possible object is
     *     {@link CsWbGeometry }
     *     
     */
    public CsWbGeometry getHoleConfig() {
        return holeConfig;
    }

    /**
     * Sets the value of the holeConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsWbGeometry }
     *     
     */
    public void setHoleConfig(CsWbGeometry value) {
        this.holeConfig = value;
    }

    /**
     * Gets the value of the nameWorkString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWorkString() {
        return nameWorkString;
    }

    /**
     * Sets the value of the nameWorkString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWorkString(String value) {
        this.nameWorkString = value;
    }

    /**
     * Gets the value of the contractor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractor() {
        return contractor;
    }

    /**
     * Sets the value of the contractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractor(String value) {
        this.contractor = value;
    }

    /**
     * Gets the value of the cementEngr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCementEngr() {
        return cementEngr;
    }

    /**
     * Sets the value of the cementEngr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCementEngr(String value) {
        this.cementEngr = value;
    }

    /**
     * Gets the value of the offshoreJob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffshoreJob() {
        return offshoreJob;
    }

    /**
     * Sets the value of the offshoreJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffshoreJob(Boolean value) {
        this.offshoreJob = value;
    }

    /**
     * Gets the value of the mdWater property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdWater() {
        return mdWater;
    }

    /**
     * Sets the value of the mdWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdWater(MeasuredDepthCoord value) {
        this.mdWater = value;
    }

    /**
     * Gets the value of the returnsToSeabed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnsToSeabed() {
        return returnsToSeabed;
    }

    /**
     * Sets the value of the returnsToSeabed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnsToSeabed(Boolean value) {
        this.returnsToSeabed = value;
    }

    /**
     * Gets the value of the reciprocating property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReciprocating() {
        return reciprocating;
    }

    /**
     * Sets the value of the reciprocating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReciprocating(Boolean value) {
        this.reciprocating = value;
    }

    /**
     * Gets the value of the woc property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getWoc() {
        return woc;
    }

    /**
     * Sets the value of the woc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setWoc(TimeMeasure value) {
        this.woc = value;
    }

    /**
     * Gets the value of the mdPlugTop property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdPlugTop() {
        return mdPlugTop;
    }

    /**
     * Sets the value of the mdPlugTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdPlugTop(MeasuredDepthCoord value) {
        this.mdPlugTop = value;
    }

    /**
     * Gets the value of the mdPlugBot property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdPlugBot() {
        return mdPlugBot;
    }

    /**
     * Sets the value of the mdPlugBot property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdPlugBot(MeasuredDepthCoord value) {
        this.mdPlugBot = value;
    }

    /**
     * Gets the value of the mdHole property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdHole() {
        return mdHole;
    }

    /**
     * Sets the value of the mdHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdHole(MeasuredDepthCoord value) {
        this.mdHole = value;
    }

    /**
     * Gets the value of the mdShoe property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdShoe() {
        return mdShoe;
    }

    /**
     * Sets the value of the mdShoe property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdShoe(MeasuredDepthCoord value) {
        this.mdShoe = value;
    }

    /**
     * Gets the value of the tvdShoe property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdShoe() {
        return tvdShoe;
    }

    /**
     * Sets the value of the tvdShoe property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdShoe(WellVerticalDepthCoord value) {
        this.tvdShoe = value;
    }

    /**
     * Gets the value of the mdStringSet property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdStringSet() {
        return mdStringSet;
    }

    /**
     * Sets the value of the mdStringSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdStringSet(MeasuredDepthCoord value) {
        this.mdStringSet = value;
    }

    /**
     * Gets the value of the tvdStringSet property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdStringSet() {
        return tvdStringSet;
    }

    /**
     * Sets the value of the tvdStringSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdStringSet(WellVerticalDepthCoord value) {
        this.tvdStringSet = value;
    }

    /**
     * Gets the value of the cementStage property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cementStage property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getCementStage().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsCementStage }
     * 
     * 
     */
    public List<CsCementStage> getCementStage() {
        if (cementStage == null) {
            cementStage = new ArrayList<CsCementStage>();
        }
        return this.cementStage;
    }

    /**
     * Gets the value of the cementTest property.
     * 
     * @return
     *     possible object is
     *     {@link CsCementTest }
     *     
     */
    public CsCementTest getCementTest() {
        return cementTest;
    }

    /**
     * Sets the value of the cementTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCementTest }
     *     
     */
    public void setCementTest(CsCementTest value) {
        this.cementTest = value;
    }

    /**
     * Gets the value of the typePlug property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypePlug() {
        return typePlug;
    }

    /**
     * Sets the value of the typePlug property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypePlug(String value) {
        this.typePlug = value;
    }

    /**
     * Gets the value of the nameCementString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCementString() {
        return nameCementString;
    }

    /**
     * Sets the value of the nameCementString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCementString(String value) {
        this.nameCementString = value;
    }

    /**
     * Gets the value of the dTimPlugSet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimPlugSet() {
        return dTimPlugSet;
    }

    /**
     * Sets the value of the dTimPlugSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimPlugSet(XMLGregorianCalendar value) {
        this.dTimPlugSet = value;
    }

    /**
     * Gets the value of the cementDrillOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCementDrillOut() {
        return cementDrillOut;
    }

    /**
     * Sets the value of the cementDrillOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCementDrillOut(Boolean value) {
        this.cementDrillOut = value;
    }

    /**
     * Gets the value of the dTimCementDrillOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimCementDrillOut() {
        return dTimCementDrillOut;
    }

    /**
     * Sets the value of the dTimCementDrillOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimCementDrillOut(XMLGregorianCalendar value) {
        this.dTimCementDrillOut = value;
    }

    /**
     * Gets the value of the typeSqueeze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSqueeze() {
        return typeSqueeze;
    }

    /**
     * Sets the value of the typeSqueeze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSqueeze(String value) {
        this.typeSqueeze = value;
    }

    /**
     * Gets the value of the mdSqueeze property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdSqueeze() {
        return mdSqueeze;
    }

    /**
     * Sets the value of the mdSqueeze property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdSqueeze(MeasuredDepthCoord value) {
        this.mdSqueeze = value;
    }

    /**
     * Gets the value of the dTimSqueeze property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimSqueeze() {
        return dTimSqueeze;
    }

    /**
     * Sets the value of the dTimSqueeze property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimSqueeze(XMLGregorianCalendar value) {
        this.dTimSqueeze = value;
    }

    /**
     * Gets the value of the toolCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolCompany() {
        return toolCompany;
    }

    /**
     * Sets the value of the toolCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolCompany(String value) {
        this.toolCompany = value;
    }

    /**
     * Gets the value of the typeTool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeTool() {
        return typeTool;
    }

    /**
     * Sets the value of the typeTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeTool(String value) {
        this.typeTool = value;
    }

    /**
     * Gets the value of the dTimPipeRotStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimPipeRotStart() {
        return dTimPipeRotStart;
    }

    /**
     * Sets the value of the dTimPipeRotStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimPipeRotStart(XMLGregorianCalendar value) {
        this.dTimPipeRotStart = value;
    }

    /**
     * Gets the value of the dTimPipeRotEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimPipeRotEnd() {
        return dTimPipeRotEnd;
    }

    /**
     * Sets the value of the dTimPipeRotEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimPipeRotEnd(XMLGregorianCalendar value) {
        this.dTimPipeRotEnd = value;
    }

    /**
     * Gets the value of the rpmPipe property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public AnglePerTimeMeasure getRpmPipe() {
        return rpmPipe;
    }

    /**
     * Sets the value of the rpmPipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public void setRpmPipe(AnglePerTimeMeasure value) {
        this.rpmPipe = value;
    }

    /**
     * Gets the value of the tqInitPipeRot property.
     * 
     * @return
     *     possible object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public MomentOfForceMeasure getTqInitPipeRot() {
        return tqInitPipeRot;
    }

    /**
     * Sets the value of the tqInitPipeRot property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public void setTqInitPipeRot(MomentOfForceMeasure value) {
        this.tqInitPipeRot = value;
    }

    /**
     * Gets the value of the tqPipeAv property.
     * 
     * @return
     *     possible object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public MomentOfForceMeasure getTqPipeAv() {
        return tqPipeAv;
    }

    /**
     * Sets the value of the tqPipeAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public void setTqPipeAv(MomentOfForceMeasure value) {
        this.tqPipeAv = value;
    }

    /**
     * Gets the value of the tqPipeMx property.
     * 
     * @return
     *     possible object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public MomentOfForceMeasure getTqPipeMx() {
        return tqPipeMx;
    }

    /**
     * Sets the value of the tqPipeMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public void setTqPipeMx(MomentOfForceMeasure value) {
        this.tqPipeMx = value;
    }

    /**
     * Gets the value of the dTimRecipStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimRecipStart() {
        return dTimRecipStart;
    }

    /**
     * Sets the value of the dTimRecipStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimRecipStart(XMLGregorianCalendar value) {
        this.dTimRecipStart = value;
    }

    /**
     * Gets the value of the dTimRecipEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimRecipEnd() {
        return dTimRecipEnd;
    }

    /**
     * Sets the value of the dTimRecipEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimRecipEnd(XMLGregorianCalendar value) {
        this.dTimRecipEnd = value;
    }

    /**
     * Gets the value of the overPull property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getOverPull() {
        return overPull;
    }

    /**
     * Sets the value of the overPull property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setOverPull(ForceMeasure value) {
        this.overPull = value;
    }

    /**
     * Gets the value of the slackOff property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getSlackOff() {
        return slackOff;
    }

    /**
     * Sets the value of the slackOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setSlackOff(ForceMeasure value) {
        this.slackOff = value;
    }

    /**
     * Gets the value of the rpmPipeRecip property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public AnglePerTimeMeasure getRpmPipeRecip() {
        return rpmPipeRecip;
    }

    /**
     * Sets the value of the rpmPipeRecip property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public void setRpmPipeRecip(AnglePerTimeMeasure value) {
        this.rpmPipeRecip = value;
    }

    /**
     * Gets the value of the lenPipeRecipStroke property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenPipeRecipStroke() {
        return lenPipeRecipStroke;
    }

    /**
     * Sets the value of the lenPipeRecipStroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenPipeRecipStroke(LengthMeasure value) {
        this.lenPipeRecipStroke = value;
    }

    /**
     * Gets the value of the coilTubing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoilTubing() {
        return coilTubing;
    }

    /**
     * Sets the value of the coilTubing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoilTubing(Boolean value) {
        this.coilTubing = value;
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
