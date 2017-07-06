package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Descriptor of a curve associated with a block.
 * 			This captures the representational aspects of the curve.
 * 			The data semantics is defined by logCurveInfo.
 * 
 * <p>Java class for cs_blockCurveInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_blockCurveInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="curveId" type="{http://www.witsml.org/schemas/131}refString"/>
 *         <element name="columnIndex" type="{http://www.witsml.org/schemas/131}nonNegativeCount"/>
 *         <element name="minIndex" type="{http://www.witsml.org/schemas/131}genericMeasure" minOccurs="0"/>
 *         <element name="maxIndex" type="{http://www.witsml.org/schemas/131}genericMeasure" minOccurs="0"/>
 *         <element name="minDateTimeIndex" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="maxDateTimeIndex" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
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
@XmlType(name = "cs_blockCurveInfo", propOrder = {
    "curveId",
    "columnIndex",
    "minIndex",
    "maxIndex",
    "minDateTimeIndex",
    "maxDateTimeIndex"
})
public class CsBlockCurveInfo {

    @XmlElement(required = true)
    protected String curveId;
    protected short columnIndex;
    protected GenericMeasure minIndex;
    protected GenericMeasure maxIndex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minDateTimeIndex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxDateTimeIndex;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the curveId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurveId() {
        return curveId;
    }

    /**
     * Sets the value of the curveId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurveId(String value) {
        this.curveId = value;
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
