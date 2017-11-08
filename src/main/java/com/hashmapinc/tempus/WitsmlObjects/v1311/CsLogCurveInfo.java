package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML Log - Curve Information
 * 
 * <p>Java class for cs_logCurveInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_logCurveInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mnemonic" type="{http://www.witsml.org/schemas/131}str32"/>
 *         <element name="classWitsml" type="{http://www.witsml.org/schemas/131}RealtimeData" minOccurs="0"/>
 *         <element name="unit" type="{http://www.witsml.org/schemas/131}uomString" minOccurs="0"/>
 *         <element name="mnemAlias" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="nullValue" type="{http://www.witsml.org/schemas/131}encodedValueString" minOccurs="0"/>
 *         <element name="alternateIndex" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="wellDatum" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
 *         <element name="minIndex" type="{http://www.witsml.org/schemas/131}genericMeasure" minOccurs="0"/>
 *         <element name="maxIndex" type="{http://www.witsml.org/schemas/131}genericMeasure" minOccurs="0"/>
 *         <element name="minDateTimeIndex" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="maxDateTimeIndex" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="columnIndex" type="{http://www.witsml.org/schemas/131}nonNegativeCount"/>
 *         <element name="curveDescription" type="{http://www.witsml.org/schemas/131}descriptionString" minOccurs="0"/>
 *         <element name="sensorOffset" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="dataSource" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="densData" type="{http://www.witsml.org/schemas/131}perLengthMeasure" minOccurs="0"/>
 *         <element name="traceState" type="{http://www.witsml.org/schemas/131}LogTraceState" minOccurs="0"/>
 *         <element name="traceOrigin" type="{http://www.witsml.org/schemas/131}LogTraceOrigin" minOccurs="0"/>
 *         <element name="typeLogData" type="{http://www.witsml.org/schemas/131}LogDataType" minOccurs="0"/>
 *         <element name="axisDefinition" type="{http://www.witsml.org/schemas/131}cs_axisDefinition" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cs_logCurveInfo", propOrder = {
    "mnemonic",
    "classWitsml",
    "unit",
    "mnemAlias",
    "nullValue",
    "alternateIndex",
    "wellDatum",
    "minIndex",
    "maxIndex",
    "minDateTimeIndex",
    "maxDateTimeIndex",
    "columnIndex",
    "curveDescription",
    "sensorOffset",
    "dataSource",
    "densData",
    "traceState",
    "traceOrigin",
    "typeLogData",
    "axisDefinition"
})
public class CsLogCurveInfo extends com.hashmapinc.tempus.WitsmlObjects.common.CsLogCurveInfo {

    @XmlElement(required = true)
    protected String mnemonic;
    protected String mnemAlias;
    protected RefNameString wellDatum;
    protected GenericMeasure minIndex;
    protected GenericMeasure maxIndex;
    protected short columnIndex;
    protected LengthMeasure sensorOffset;
    protected PerLengthMeasure densData;
    @XmlSchemaType(name = "string")
    protected LogTraceState traceState;
    @XmlSchemaType(name = "string")
    protected LogTraceOrigin traceOrigin;
    @XmlSchemaType(name = "string")
    protected LogDataType typeLogData;
    protected List<CsAxisDefinition> axisDefinition;

    /**
     * Gets the value of the mnemonic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnemonic() {
        return mnemonic;
    }

    /**
     * Sets the value of the mnemonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnemonic(String value) {
        this.mnemonic = value;
    }

    /**
     * Gets the value of the mnemAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnemAlias() {
        return mnemAlias;
    }

    /**
     * Sets the value of the mnemAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnemAlias(String value) {
        this.mnemAlias = value;
    }

    /**
     * Gets the value of the wellDatum property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getWellDatum() {
        return wellDatum;
    }

    /**
     * Sets the value of the wellDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setWellDatum(RefNameString value) {
        this.wellDatum = value;
    }

    /**
     * Gets the value of the minIndex property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getMinIndex() {
        return minIndex;
    }

    /**
     * Sets the value of the minIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setMinIndex(GenericMeasure value) {
        this.minIndex = value;
    }

    /**
     * Gets the value of the maxIndex property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getMaxIndex() {
        return maxIndex;
    }

    /**
     * Sets the value of the maxIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setMaxIndex(GenericMeasure value) {
        this.maxIndex = value;
    }

    /**
     * Gets the value of the columnIndex property.
     * 
     */
    public short getColumnIndex() {
        return columnIndex;
    }

    /**
     * Sets the value of the columnIndex property.
     * 
     */
    public void setColumnIndex(short value) {
        this.columnIndex = value;
    }

    /**
     * Gets the value of the sensorOffset property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getSensorOffset() {
        return sensorOffset;
    }

    /**
     * Sets the value of the sensorOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setSensorOffset(LengthMeasure value) {
        this.sensorOffset = value;
    }

    /**
     * Gets the value of the densData property.
     * 
     * @return
     *     possible object is
     *     {@link PerLengthMeasure }
     *     
     */
    public PerLengthMeasure getDensData() {
        return densData;
    }

    /**
     * Sets the value of the densData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerLengthMeasure }
     *     
     */
    public void setDensData(PerLengthMeasure value) {
        this.densData = value;
    }

    /**
     * Gets the value of the traceState property.
     * 
     * @return
     *     possible object is
     *     {@link LogTraceState }
     *     
     */
    public LogTraceState getTraceState() {
        return traceState;
    }

    /**
     * Sets the value of the traceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogTraceState }
     *     
     */
    public void setTraceState(LogTraceState value) {
        this.traceState = value;
    }

    /**
     * Gets the value of the traceOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link LogTraceOrigin }
     *     
     */
    public LogTraceOrigin getTraceOrigin() {
        return traceOrigin;
    }

    /**
     * Sets the value of the traceOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogTraceOrigin }
     *     
     */
    public void setTraceOrigin(LogTraceOrigin value) {
        this.traceOrigin = value;
    }

    /**
     * Gets the value of the typeLogData property.
     * 
     * @return
     *     possible object is
     *     {@link LogDataType }
     *     
     */
    public LogDataType getTypeLogData() {
        return typeLogData;
    }

    /**
     * Sets the value of the typeLogData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogDataType }
     *     
     */
    public void setTypeLogData(LogDataType value) {
        this.typeLogData = value;
    }

    /**
     * Gets the value of the axisDefinition property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisDefinition property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getAxisDefinition().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsAxisDefinition }
     * 
     * 
     */
    public List<CsAxisDefinition> getAxisDefinition() {
        if (axisDefinition == null) {
            axisDefinition = new ArrayList<CsAxisDefinition>();
        }
        return this.axisDefinition;
    }
}
