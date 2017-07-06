package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - lithology qualifier Component Schema
 * 
 * <p>Java class for cs_qualifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_qualifier">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="type" type="{http://www.witsml.org/schemas/131}QualifierType"/>
 *         <sequence minOccurs="0">
 *           <element name="mdTop" type="{http://www.witsml.org/schemas/131}measuredDepthCoord"/>
 *           <element name="mdBottom" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         </sequence>
 *         <element name="abundance" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasurePercent" minOccurs="0"/>
 *         <element name="abundanceCode" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="description" type="{http://www.witsml.org/schemas/131}descriptionString" minOccurs="0"/>
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
@XmlType(name = "cs_qualifier", propOrder = {
    "type",
    "mdTop",
    "mdBottom",
    "abundance",
    "abundanceCode",
    "description"
})
public class CsQualifier {

    @XmlElement(required = true)
    protected String type;
    protected MeasuredDepthCoord mdTop;
    protected MeasuredDepthCoord mdBottom;
    protected VolumePerVolumeMeasurePercent abundance;
    protected String abundanceCode;
    protected String description;
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
     * Gets the value of the abundance property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasurePercent }
     *     
     */
    public VolumePerVolumeMeasurePercent getAbundance() {
        return abundance;
    }

    /**
     * Sets the value of the abundance property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasurePercent }
     *     
     */
    public void setAbundance(VolumePerVolumeMeasurePercent value) {
        this.abundance = value;
    }

    /**
     * Gets the value of the abundanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbundanceCode() {
        return abundanceCode;
    }

    /**
     * Sets the value of the abundanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbundanceCode(String value) {
        this.abundanceCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
