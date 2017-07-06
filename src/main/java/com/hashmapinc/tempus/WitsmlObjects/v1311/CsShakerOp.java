package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Operations Shaker Component Schema
 * 
 * <p>Java class for cs_shakerOp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_shakerOp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="shaker" type="{http://www.witsml.org/schemas/131}refNameString"/>
 *         <element name="mdHole" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="hoursRun" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="pcScreenCovered" type="{http://www.witsml.org/schemas/131}areaPerAreaMeasure" minOccurs="0"/>
 *         <element name="shakerScreen" type="{http://www.witsml.org/schemas/131}cs_shakerScreen" minOccurs="0"/>
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
@XmlType(name = "cs_shakerOp", propOrder = {
    "shaker",
    "mdHole",
    "dTim",
    "hoursRun",
    "pcScreenCovered",
    "shakerScreen"
})
public class CsShakerOp {

    @XmlElement(required = true)
    protected RefNameString shaker;
    protected MeasuredDepthCoord mdHole;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected TimeMeasure hoursRun;
    protected AreaPerAreaMeasure pcScreenCovered;
    protected CsShakerScreen shakerScreen;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the shaker property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getShaker() {
        return shaker;
    }

    /**
     * Sets the value of the shaker property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setShaker(RefNameString value) {
        this.shaker = value;
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
     * Gets the value of the hoursRun property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getHoursRun() {
        return hoursRun;
    }

    /**
     * Sets the value of the hoursRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setHoursRun(TimeMeasure value) {
        this.hoursRun = value;
    }

    /**
     * Gets the value of the pcScreenCovered property.
     * 
     * @return
     *     possible object is
     *     {@link AreaPerAreaMeasure }
     *     
     */
    public AreaPerAreaMeasure getPcScreenCovered() {
        return pcScreenCovered;
    }

    /**
     * Sets the value of the pcScreenCovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaPerAreaMeasure }
     *     
     */
    public void setPcScreenCovered(AreaPerAreaMeasure value) {
        this.pcScreenCovered = value;
    }

    /**
     * Gets the value of the shakerScreen property.
     * 
     * @return
     *     possible object is
     *     {@link CsShakerScreen }
     *     
     */
    public CsShakerScreen getShakerScreen() {
        return shakerScreen;
    }

    /**
     * Sets the value of the shakerScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsShakerScreen }
     *     
     */
    public void setShakerScreen(CsShakerScreen value) {
        this.shakerScreen = value;
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
