package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Operations Slow Circulation Rates (SCR) Component Schema
 * 
 * <p>Java class for cs_scr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_scr">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/131}timestamp"/>
 *         <element name="pump" type="{http://www.witsml.org/schemas/131}refPositiveCount"/>
 *         <element name="typeScr" type="{http://www.witsml.org/schemas/131}ScrType"/>
 *         <element name="rateStroke" type="{http://www.witsml.org/schemas/131}anglePerTimeMeasure"/>
 *         <element name="presRecorded" type="{http://www.witsml.org/schemas/131}pressureMeasure"/>
 *         <element name="mdBit" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
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
@XmlType(name = "cs_scr", propOrder = {
    "dTim",
    "pump",
    "typeScr",
    "rateStroke",
    "presRecorded",
    "mdBit"
})
public class CsScr {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    @XmlElement(required = true)
    protected RefPositiveCount pump;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String typeScr;
    @XmlElement(required = true)
    protected AnglePerTimeMeasure rateStroke;
    @XmlElement(required = true)
    protected PressureMeasure presRecorded;
    protected MeasuredDepthCoord mdBit;
    @XmlAttribute(name = "uid")
    protected String uid;

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
     * Gets the value of the pump property.
     * 
     * @return
     *     possible object is
     *     {@link RefPositiveCount }
     *     
     */
    public RefPositiveCount getPump() {
        return pump;
    }

    /**
     * Sets the value of the pump property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefPositiveCount }
     *     
     */
    public void setPump(RefPositiveCount value) {
        this.pump = value;
    }

    /**
     * Gets the value of the typeScr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeScr() {
        return typeScr;
    }

    /**
     * Sets the value of the typeScr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeScr(String value) {
        this.typeScr = value;
    }

    /**
     * Gets the value of the rateStroke property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public AnglePerTimeMeasure getRateStroke() {
        return rateStroke;
    }

    /**
     * Sets the value of the rateStroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public void setRateStroke(AnglePerTimeMeasure value) {
        this.rateStroke = value;
    }

    /**
     * Gets the value of the presRecorded property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresRecorded() {
        return presRecorded;
    }

    /**
     * Sets the value of the presRecorded property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresRecorded(PressureMeasure value) {
        this.presRecorded = value;
    }

    /**
     * Gets the value of the mdBit property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBit() {
        return mdBit;
    }

    /**
     * Sets the value of the mdBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBit(MeasuredDepthCoord value) {
        this.mdBit = value;
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
