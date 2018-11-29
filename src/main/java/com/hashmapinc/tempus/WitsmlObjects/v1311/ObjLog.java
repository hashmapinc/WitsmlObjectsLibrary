package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

import com.hashmapinc.tempus.WitsmlObjects.AbstractWitsmlObject;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for obj_log complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <complexType name="obj_log">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_log" minOccurs="0"/>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_log", propOrder = {
        "nameWell",
        "nameWellbore",
        "name",
        "objectGrowing",
        "dataRowCount",
        "serviceCompany",
        "runNumber",
        "bhaRunNumber",
        "pass",
        "creationDate",
        "description",
        "indexType",
        "startIndex",
        "endIndex",
        "stepIncrement",
        "startDateTimeIndex",
        "endDateTimeIndex",
        "direction",
        "indexCurve",
        "nullValue",
        "logParam",
        "logCurveInfo",
        "logData",
        "commonData",
        "customData"
})
public class ObjLog {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    private Boolean objectGrowing;
    private Integer dataRowCount;
    private String serviceCompany;
    private String runNumber;
    private Short bhaRunNumber;
    private String pass;
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar creationDate;
    protected String description;
    @XmlSchemaType(name = "string")
    private LogIndexType indexType;
    private GenericMeasure startIndex;
    private GenericMeasure endIndex;
    private RatioGenericMeasure stepIncrement;
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar startDateTimeIndex;
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar endDateTimeIndex;
    @XmlSchemaType(name = "string")
    protected LogIndexDirection direction;
    private IndexCurve indexCurve;
    private String nullValue;
    private List<IndexedObject> logParam;
    private List<CsLogCurveInfo> logCurveInfo;
    private CsLogData logData;
    protected CsCommonData commonData;
    protected CsCustomData customData;
    @XmlAttribute(name = "uidWell")
    protected String uidWell;
    @XmlAttribute(name = "uidWellbore")
    protected String uidWellbore;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * get the parent uid as a string
     */
    //@Override
    public String getParentUid() {
        return this.uidWellbore;
    }

    /**
     * Gets the value of the nameWell property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameWell() {
        return nameWell;
    }

    /**
     * Sets the value of the nameWell property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameWell(String value) {
        this.nameWell = value;
    }

    /**
     * Gets the value of the nameWellbore property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNameWellbore() {
        return nameWellbore;
    }

    /**
     * Sets the value of the nameWellbore property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNameWellbore(String value) {
        this.nameWellbore = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the objectGrowing property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isObjectGrowing() {
        return objectGrowing;
    }

    /**
     * Sets the value of the objectGrowing property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setObjectGrowing(Boolean value) {
        this.objectGrowing = value;
    }

    /**
     * Gets the value of the dataRowCount property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDataRowCount() {
        return dataRowCount;
    }

    /**
     * Sets the value of the dataRowCount property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDataRowCount(Integer value) {
        this.dataRowCount = value;
    }

    /**
     * Gets the value of the serviceCompany property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getServiceCompany() {
        return serviceCompany;
    }

    /**
     * Sets the value of the serviceCompany property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setServiceCompany(String value) {
        this.serviceCompany = value;
    }

    /**
     * Gets the value of the runNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRunNumber() {
        return runNumber;
    }

    /**
     * Sets the value of the runNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRunNumber(String value) {
        this.runNumber = value;
    }

    /**
     * Gets the value of the bhaRunNumber property.
     *
     * @return possible object is
     * {@link Short }
     */
    public Short getBhaRunNumber() {
        return bhaRunNumber;
    }

    /**
     * Sets the value of the bhaRunNumber property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setBhaRunNumber(Short value) {
        this.bhaRunNumber = value;
    }

    /**
     * Gets the value of the pass property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPass() {
        return pass;
    }

    /**
     * Sets the value of the pass property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPass(String value) {
        this.pass = value;
    }

    /**
     * Gets the value of the creationDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the indexType property.
     *
     * @return possible object is
     * {@link LogIndexType }
     */
    public LogIndexType getIndexType() {
        return indexType;
    }

    /**
     * Sets the value of the indexType property.
     *
     * @param value allowed object is
     *              {@link LogIndexType }
     */
    public void setIndexType(LogIndexType value) {
        this.indexType = value;
    }

    /**
     * Gets the value of the startIndex property.
     *
     * @return possible object is
     * {@link GenericMeasure }
     */
    public GenericMeasure getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     *
     * @param value allowed object is
     *              {@link GenericMeasure }
     */
    public void setStartIndex(GenericMeasure value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the endIndex property.
     *
     * @return possible object is
     * {@link GenericMeasure }
     */
    public GenericMeasure getEndIndex() {
        return endIndex;
    }

    /**
     * Sets the value of the endIndex property.
     *
     * @param value allowed object is
     *              {@link GenericMeasure }
     */
    public void setEndIndex(GenericMeasure value) {
        this.endIndex = value;
    }

    /**
     * Gets the value of the stepIncrement property.
     *
     * @return possible object is
     * {@link RatioGenericMeasure }
     */
    public RatioGenericMeasure getStepIncrement() {
        return stepIncrement;
    }

    /**
     * Sets the value of the stepIncrement property.
     *
     * @param value allowed object is
     *              {@link RatioGenericMeasure }
     */
    public void setStepIncrement(RatioGenericMeasure value) {
        this.stepIncrement = value;
    }

    /**
     * Gets the value of the startDateTimeIndex property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getStartDateTimeIndex() {
        return startDateTimeIndex;
    }

    /**
     * Sets the value of the startDateTimeIndex property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setStartDateTimeIndex(XMLGregorianCalendar value) {
        this.startDateTimeIndex = value;
    }

    /**
     * Gets the value of the endDateTimeIndex property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEndDateTimeIndex() {
        return endDateTimeIndex;
    }

    /**
     * Sets the value of the endDateTimeIndex property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setEndDateTimeIndex(XMLGregorianCalendar value) {
        this.endDateTimeIndex = value;
    }

    /**
     * Gets the value of the direction property.
     *
     * @return possible object is
     * {@link LogIndexDirection }
     */
    public LogIndexDirection getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     *
     * @param value allowed object is
     *              {@link LogIndexDirection }
     */
    public void setDirection(LogIndexDirection value) {
        this.direction = value;
    }

    /**
     * Gets the value of the indexCurve property.
     *
     * @return possible object is
     * {@link IndexCurve }
     */
    public IndexCurve getIndexCurve() {
        return indexCurve;
    }

    /**
     * Sets the value of the indexCurve property.
     *
     * @param value allowed object is
     *              {@link IndexCurve }
     */
    public void setIndexCurve(IndexCurve value) {
        this.indexCurve = value;
    }

    /**
     * Gets the value of the nullValue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNullValue() {
        return nullValue;
    }

    /**
     * Sets the value of the nullValue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNullValue(String value) {
        this.nullValue = value;
    }

    /**
     * Gets the value of the logParam property.
     *
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logParam property.
     *
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getLogParam().add(newItem);
     * } </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedObject }
     */
    public List<IndexedObject> getLogParam() {
        if (logParam == null) {
            logParam = new ArrayList<IndexedObject>();
        }
        return this.logParam;
    }

    /**
     * Gets the value of the logCurveInfo property.
     *
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logCurveInfo property.
     *
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getLogCurveInfo().add(newItem);
     * } </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsLogCurveInfo }
     */
    public List<CsLogCurveInfo> getLogCurveInfo() {
        if (logCurveInfo == null) {
            logCurveInfo = new ArrayList<CsLogCurveInfo>();
        }
        return this.logCurveInfo;
    }

    /**
     * Gets the value of the logData property.
     *
     * @return possible object is
     * {@link CsLogData }
     */
    public CsLogData getLogData() {
        return logData;
    }

    /**
     * Sets the value of the logData property.
     *
     * @param value allowed object is
     *              {@link CsLogData }
     */
    public void setLogData(CsLogData value) {
        this.logData = value;
    }

    /**
     * Gets the value of the commonData property.
     *
     * @return possible object is
     * {@link CsCommonData }
     */
    public CsCommonData getCommonData() {
        return commonData;
    }

    /**
     * Sets the value of the commonData property.
     *
     * @param value allowed object is
     *              {@link CsCommonData }
     */
    public void setCommonData(CsCommonData value) {
        this.commonData = value;
    }

    /**
     * Gets the value of the customData property.
     *
     * @return possible object is
     * {@link CsCustomData }
     */
    public CsCustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     *
     * @param value allowed object is
     *              {@link CsCustomData }
     */
    public void setCustomData(CsCustomData value) {
        this.customData = value;
    }

    /**
     * Gets the value of the uidWell property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUidWell() {
        return uidWell;
    }

    /**
     * Sets the value of the uidWell property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUidWell(String value) {
        this.uidWell = value;
    }

    /**
     * Gets the value of the uidWellbore property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUidWellbore() {
        return uidWellbore;
    }

    /**
     * Sets the value of the uidWellbore property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUidWellbore(String value) {
        this.uidWellbore = value;
    }

    /**
     * Gets the value of the uid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
