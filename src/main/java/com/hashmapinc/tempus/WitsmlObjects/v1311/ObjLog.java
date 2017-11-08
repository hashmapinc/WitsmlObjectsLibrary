package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.*;
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
public class ObjLog
    extends com.hashmapinc.tempus.WitsmlObjects.common.ObjLog {

    private Integer dataRowCount;
    @XmlSchemaType(name = "string")
    private LogIndexType indexType;
    private GenericMeasure startIndex;
    private GenericMeasure endIndex;
    private RatioGenericMeasure stepIncrement;
    @XmlSchemaType(name = "string")
    protected LogIndexDirection direction;
    private IndexCurve indexCurve;
    private List<IndexedObject> logParam;
    private List<CsLogCurveInfo> logCurveInfo;
    private CsLogData logData;
    protected CsCommonData commonData;
    protected CsCustomData customData;

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
}
