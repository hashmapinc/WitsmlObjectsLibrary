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
 * <p>Java class for obj_risk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_risk">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_risk" minOccurs="0"/>
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
@XmlType(name = "obj_risk", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "objectReference",
    "type",
    "category",
    "subCategory",
    "extendCategory",
    "affectedPersonnel",
    "dTimStart",
    "dTimEnd",
    "mdHoleStart",
    "mdHoleEnd",
    "tvdHoleStart",
    "tvdHoleEnd",
    "mdBitStart",
    "mdBitEnd",
    "diaHole",
    "severityLevel",
    "probabilityLevel",
    "summary",
    "details",
    "identification",
    "contingency",
    "mitigation",
    "commonData",
    "customData"
})
public class ObjRisk {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    protected RefObjectString objectReference;
    @XmlSchemaType(name = "string")
    protected RiskType type;
    @XmlSchemaType(name = "string")
    protected RiskCategory category;
    @XmlSchemaType(name = "string")
    protected RiskSubCategory subCategory;
    protected String extendCategory;
    @XmlSchemaType(name = "string")
    protected List<RiskAffectedPersonnel> affectedPersonnel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimEnd;
    protected MeasuredDepthCoord mdHoleStart;
    protected MeasuredDepthCoord mdHoleEnd;
    protected WellVerticalDepthCoord tvdHoleStart;
    protected WellVerticalDepthCoord tvdHoleEnd;
    protected MeasuredDepthCoord mdBitStart;
    protected MeasuredDepthCoord mdBitEnd;
    protected LengthMeasure diaHole;
    protected Short severityLevel;
    protected Short probabilityLevel;
    protected String summary;
    protected String details;
    protected String identification;
    protected String contingency;
    protected List<String> mitigation;
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
     * Gets the value of the objectReference property.
     * 
     * @return
     *     possible object is
     *     {@link RefObjectString }
     *     
     */
    public RefObjectString getObjectReference() {
        return objectReference;
    }

    /**
     * Sets the value of the objectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefObjectString }
     *     
     */
    public void setObjectReference(RefObjectString value) {
        this.objectReference = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RiskType }
     *     
     */
    public RiskType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskType }
     *     
     */
    public void setType(RiskType value) {
        this.type = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link RiskCategory }
     *     
     */
    public RiskCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskCategory }
     *     
     */
    public void setCategory(RiskCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     * @return
     *     possible object is
     *     {@link RiskSubCategory }
     *     
     */
    public RiskSubCategory getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskSubCategory }
     *     
     */
    public void setSubCategory(RiskSubCategory value) {
        this.subCategory = value;
    }

    /**
     * Gets the value of the extendCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendCategory() {
        return extendCategory;
    }

    /**
     * Sets the value of the extendCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendCategory(String value) {
        this.extendCategory = value;
    }

    /**
     * Gets the value of the affectedPersonnel property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedPersonnel property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getAffectedPersonnel().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link RiskAffectedPersonnel }
     * 
     * 
     */
    public List<RiskAffectedPersonnel> getAffectedPersonnel() {
        if (affectedPersonnel == null) {
            affectedPersonnel = new ArrayList<RiskAffectedPersonnel>();
        }
        return this.affectedPersonnel;
    }

    /**
     * Gets the value of the dTimStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimStart() {
        return dTimStart;
    }

    /**
     * Sets the value of the dTimStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimStart(XMLGregorianCalendar value) {
        this.dTimStart = value;
    }

    /**
     * Gets the value of the dTimEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimEnd() {
        return dTimEnd;
    }

    /**
     * Sets the value of the dTimEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimEnd(XMLGregorianCalendar value) {
        this.dTimEnd = value;
    }

    /**
     * Gets the value of the mdHoleStart property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdHoleStart() {
        return mdHoleStart;
    }

    /**
     * Sets the value of the mdHoleStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdHoleStart(MeasuredDepthCoord value) {
        this.mdHoleStart = value;
    }

    /**
     * Gets the value of the mdHoleEnd property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdHoleEnd() {
        return mdHoleEnd;
    }

    /**
     * Sets the value of the mdHoleEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdHoleEnd(MeasuredDepthCoord value) {
        this.mdHoleEnd = value;
    }

    /**
     * Gets the value of the tvdHoleStart property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdHoleStart() {
        return tvdHoleStart;
    }

    /**
     * Sets the value of the tvdHoleStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdHoleStart(WellVerticalDepthCoord value) {
        this.tvdHoleStart = value;
    }

    /**
     * Gets the value of the tvdHoleEnd property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdHoleEnd() {
        return tvdHoleEnd;
    }

    /**
     * Sets the value of the tvdHoleEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdHoleEnd(WellVerticalDepthCoord value) {
        this.tvdHoleEnd = value;
    }

    /**
     * Gets the value of the mdBitStart property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBitStart() {
        return mdBitStart;
    }

    /**
     * Sets the value of the mdBitStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBitStart(MeasuredDepthCoord value) {
        this.mdBitStart = value;
    }

    /**
     * Gets the value of the mdBitEnd property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBitEnd() {
        return mdBitEnd;
    }

    /**
     * Sets the value of the mdBitEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBitEnd(MeasuredDepthCoord value) {
        this.mdBitEnd = value;
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
     * Gets the value of the severityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSeverityLevel() {
        return severityLevel;
    }

    /**
     * Sets the value of the severityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSeverityLevel(Short value) {
        this.severityLevel = value;
    }

    /**
     * Gets the value of the probabilityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getProbabilityLevel() {
        return probabilityLevel;
    }

    /**
     * Sets the value of the probabilityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setProbabilityLevel(Short value) {
        this.probabilityLevel = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentification(String value) {
        this.identification = value;
    }

    /**
     * Gets the value of the contingency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContingency() {
        return contingency;
    }

    /**
     * Sets the value of the contingency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContingency(String value) {
        this.contingency = value;
    }

    /**
     * Gets the value of the mitigation property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mitigation property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getMitigation().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMitigation() {
        if (mitigation == null) {
            mitigation = new ArrayList<String>();
        }
        return this.mitigation;
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
