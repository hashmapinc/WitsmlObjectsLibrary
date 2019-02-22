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
public class CsLogCurveInfo {

    @XmlElement(required = true)
    protected String mnemonic;
    protected String classWitsml;
    protected String unit;
    protected String mnemAlias;
    protected String nullValue;
    protected Boolean alternateIndex;
    protected RefNameString wellDatum;
    protected GenericMeasure minIndex;
    protected GenericMeasure maxIndex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minDateTimeIndex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxDateTimeIndex;
    protected short columnIndex;
    protected String curveDescription;
    protected LengthMeasure sensorOffset;
    protected String dataSource;
    protected PerLengthMeasure densData;
    @XmlSchemaType(name = "string")
    protected String traceState;
    @XmlSchemaType(name = "string")
    protected String traceOrigin;
    @XmlSchemaType(name = "string")
    protected String typeLogData;
    protected List<CsAxisDefinition> axisDefinition;
    @XmlAttribute(name = "uid")
    protected String uid;

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
     * Gets the value of the classWitsml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassWitsml() {
        return classWitsml;
    }

    /**
     * Sets the value of the classWitsml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassWitsml(String value) {
        this.classWitsml = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
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
     * Gets the value of the nullValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullValue() {
        return nullValue;
    }

    /**
     * Sets the value of the nullValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullValue(String value) {
        this.nullValue = value;
    }

    /**
     * Gets the value of the alternateIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternateIndex() {
        return alternateIndex;
    }

    /**
     * Sets the value of the alternateIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternateIndex(Boolean value) {
        this.alternateIndex = value;
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
     * Gets the value of the minDateTimeIndex property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinDateTimeIndex() {
        return minDateTimeIndex;
    }

    /**
     * Sets the value of the minDateTimeIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinDateTimeIndex(XMLGregorianCalendar value) {
        this.minDateTimeIndex = value;
    }

    /**
     * Gets the value of the maxDateTimeIndex property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxDateTimeIndex() {
        return maxDateTimeIndex;
    }

    /**
     * Sets the value of the maxDateTimeIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxDateTimeIndex(XMLGregorianCalendar value) {
        this.maxDateTimeIndex = value;
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
     * Gets the value of the curveDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurveDescription() {
        return curveDescription;
    }

    /**
     * Sets the value of the curveDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurveDescription(String value) {
        this.curveDescription = value;
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
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
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
     *     {@link String }
     *     
     */
    public String getTraceState() {
        return traceState;
    }

    /**
     * Sets the value of the traceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceState(String value) {
        this.traceState = value;
    }

    /**
     * Gets the value of the traceOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceOrigin() {
        return traceOrigin;
    }

    /**
     * Sets the value of the traceOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceOrigin(String value) {
        this.traceOrigin = value;
    }

    /**
     * Gets the value of the typeLogData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLogData() {
        return typeLogData;
    }

    /**
     * Sets the value of the typeLogData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLogData(String value) {
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

    public void setAxisDefinition(List<CsAxisDefinition> values) {
        this.axisDefinition = values;
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




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsLogCurveInfo to1411CsLogCurveInfo() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsLogCurveInfo info = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsLogCurveInfo();

        // simple fields
        info.setClassWitsml(this.getClassWitsml());
        info.setUnit(this.getUnit());
        info.setNullValue(this.getNullValue());
        info.setAlternateIndex(this.isAlternateIndex());
        info.setMinDateTimeIndex(this.getMinDateTimeIndex());
        info.setMaxDateTimeIndex(this.getMaxDateTimeIndex());
        info.setCurveDescription(this.getCurveDescription());
        info.setDataSource(this.getDataSource());
        info.setUid(this.getUid());
        info.setTraceState(this.getTraceState());
        info.setTraceOrigin(this.getTraceOrigin());
        info.setTypeLogData(this.getTypeLogData());

        // complex fields
        // mnemonic
        if (null != this.getMnemonic()) {
            com.hashmapinc.tempus.WitsmlObjects.v1411.ShortNameStruct mnemonic = new com.hashmapinc.tempus.WitsmlObjects.v1411.ShortNameStruct();
            mnemonic.setValue(this.getMnemonic());
            info.setMnemonic(mnemonic);
        }

        // mnemAlias
        if (null != this.getMnemAlias()) {
            com.hashmapinc.tempus.WitsmlObjects.v1411.ShortNameStruct mnemAlias = new com.hashmapinc.tempus.WitsmlObjects.v1411.ShortNameStruct();
            mnemAlias.setValue(this.getMnemAlias());
            info.setMnemAlias(mnemAlias);
        }

        // wellDatum
        if (null != this.getWellDatum())
            info.setWellDatum(this.getWellDatum().to1411RefNameString());

        // minIndex
        if (null != this.getMinIndex())
            info.setMinIndex(this.getMinIndex().to1411GenericMeasure());

        // maxIndex
        if (null != this.getMaxIndex())
            info.setMaxIndex(this.getMaxIndex().to1411GenericMeasure());

        // sensorOffset
        if (null != this.getSensorOffset())
            info.setSensorOffset(this.getSensorOffset().to1411Length());

        // densData
        if (null != this.getDensData())
            info.setDensData(this.getDensData().to1411PerLengthMeasure());

        // repeating fields
        if (null != this.getAxisDefinition()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsAxisDefinition> destDefs = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v1311.CsAxisDefinition srcDef : this.getAxisDefinition())
                destDefs.add(srcDef.to1411CsAxisDefinition());

            info.setAxisDefinition(destDefs);
        }

        return info;
    }
    //=========================================================================

}
