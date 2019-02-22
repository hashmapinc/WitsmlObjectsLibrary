package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Mud Log Parameter Component Schema
 * 
 * <p>Java class for cs_mudLogParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_mudLogParameter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="type" type="{http://www.witsml.org/schemas/131}String"/>
 *         <element name="dTime" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="mdTop" type="{http://www.witsml.org/schemas/131}measuredDepthCoord"/>
 *           <element name="mdBottom" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         </sequence>
 *         <choice minOccurs="0">
 *           <element name="force" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *           <element name="concentration" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *           <element name="equivalentMudWeight" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *           <element name="pressureGradient" type="{http://www.witsml.org/schemas/131}forcePerVolumeMeasure" minOccurs="0"/>
 *         </choice>
 *         <element name="text" type="{http://www.witsml.org/schemas/131}uncollapsedString" minOccurs="0"/>
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
@XmlType(name = "cs_mudLogParameter", propOrder = {
    "type",
    "dTime",
    "mdTop",
    "mdBottom",
    "force",
    "concentration",
    "equivalentMudWeight",
    "pressureGradient",
    "text"
})
public class CsMudLogParameter {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String type;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTime;
    protected MeasuredDepthCoord mdTop;
    protected MeasuredDepthCoord mdBottom;
    protected ForceMeasure force;
    protected VolumePerVolumeMeasure concentration;
    protected DensityMeasure equivalentMudWeight;
    protected ForcePerVolumeMeasure pressureGradient;
    protected String text;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the dTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTime() {
        return dTime;
    }

    /**
     * Sets the value of the dTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTime(XMLGregorianCalendar value) {
        this.dTime = value;
    }

    /**
     * Gets the value of the mdTop property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdTop() {
        return mdTop;
    }

    /**
     * Sets the value of the mdTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdTop(MeasuredDepthCoord value) {
        this.mdTop = value;
    }

    /**
     * Gets the value of the mdBottom property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBottom() {
        return mdBottom;
    }

    /**
     * Sets the value of the mdBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBottom(MeasuredDepthCoord value) {
        this.mdBottom = value;
    }

    /**
     * Gets the value of the force property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getForce() {
        return force;
    }

    /**
     * Sets the value of the force property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setForce(ForceMeasure value) {
        this.force = value;
    }

    /**
     * Gets the value of the concentration property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getConcentration() {
        return concentration;
    }

    /**
     * Sets the value of the concentration property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setConcentration(VolumePerVolumeMeasure value) {
        this.concentration = value;
    }

    /**
     * Gets the value of the equivalentMudWeight property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getEquivalentMudWeight() {
        return equivalentMudWeight;
    }

    /**
     * Sets the value of the equivalentMudWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setEquivalentMudWeight(DensityMeasure value) {
        this.equivalentMudWeight = value;
    }

    /**
     * Gets the value of the pressureGradient property.
     * 
     * @return
     *     possible object is
     *     {@link ForcePerVolumeMeasure }
     *     
     */
    public ForcePerVolumeMeasure getPressureGradient() {
        return pressureGradient;
    }

    /**
     * Sets the value of the pressureGradient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForcePerVolumeMeasure }
     *     
     */
    public void setPressureGradient(ForcePerVolumeMeasure value) {
        this.pressureGradient = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
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
