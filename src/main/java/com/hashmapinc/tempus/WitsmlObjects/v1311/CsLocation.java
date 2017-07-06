package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML Location Component Schema
 * 			This is a location that is expressed in terms of 2D coordinates. 
 * 			In order that the location be understood, the coordinate reference system (CRS) 
 * 			must be known.
 * 
 * <p>Java class for cs_location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_location">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="wellCRS" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <sequence minOccurs="0">
 *             <element name="latitude" type="{http://www.witsml.org/schemas/131}planeAngleMeasure"/>
 *             <element name="longitude" type="{http://www.witsml.org/schemas/131}planeAngleMeasure"/>
 *           </sequence>
 *           <sequence minOccurs="0">
 *             <element name="easting" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *             <element name="northing" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *           </sequence>
 *           <sequence minOccurs="0">
 *             <element name="westing" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *             <element name="southing" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *           </sequence>
 *           <sequence minOccurs="0">
 *             <element name="projectedX" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *             <element name="projectedY" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *           </sequence>
 *           <sequence minOccurs="0">
 *             <element name="localX" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *             <element name="localY" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *           </sequence>
 *         </choice>
 *         <element name="original" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
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
@XmlType(name = "cs_location", propOrder = {
    "wellCRS",
    "latitude",
    "longitude",
    "easting",
    "northing",
    "westing",
    "southing",
    "projectedX",
    "projectedY",
    "localX",
    "localY",
    "original",
    "description"
})
public class CsLocation {

    protected RefNameString wellCRS;
    protected PlaneAngleMeasure latitude;
    protected PlaneAngleMeasure longitude;
    protected LengthMeasure easting;
    protected LengthMeasure northing;
    protected LengthMeasure westing;
    protected LengthMeasure southing;
    protected LengthMeasure projectedX;
    protected LengthMeasure projectedY;
    protected LengthMeasure localX;
    protected LengthMeasure localY;
    protected Boolean original;
    protected String description;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the wellCRS property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getWellCRS() {
        return wellCRS;
    }

    /**
     * Sets the value of the wellCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setWellCRS(RefNameString value) {
        this.wellCRS = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setLatitude(PlaneAngleMeasure value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setLongitude(PlaneAngleMeasure value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the easting property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getEasting() {
        return easting;
    }

    /**
     * Sets the value of the easting property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setEasting(LengthMeasure value) {
        this.easting = value;
    }

    /**
     * Gets the value of the northing property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getNorthing() {
        return northing;
    }

    /**
     * Sets the value of the northing property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setNorthing(LengthMeasure value) {
        this.northing = value;
    }

    /**
     * Gets the value of the westing property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getWesting() {
        return westing;
    }

    /**
     * Sets the value of the westing property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setWesting(LengthMeasure value) {
        this.westing = value;
    }

    /**
     * Gets the value of the southing property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getSouthing() {
        return southing;
    }

    /**
     * Sets the value of the southing property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setSouthing(LengthMeasure value) {
        this.southing = value;
    }

    /**
     * Gets the value of the projectedX property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getProjectedX() {
        return projectedX;
    }

    /**
     * Sets the value of the projectedX property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setProjectedX(LengthMeasure value) {
        this.projectedX = value;
    }

    /**
     * Gets the value of the projectedY property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getProjectedY() {
        return projectedY;
    }

    /**
     * Sets the value of the projectedY property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setProjectedY(LengthMeasure value) {
        this.projectedY = value;
    }

    /**
     * Gets the value of the localX property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLocalX() {
        return localX;
    }

    /**
     * Sets the value of the localX property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLocalX(LengthMeasure value) {
        this.localX = value;
    }

    /**
     * Gets the value of the localY property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLocalY() {
        return localY;
    }

    /**
     * Sets the value of the localY property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLocalY(LengthMeasure value) {
        this.localY = value;
    }

    /**
     * Gets the value of the original property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginal() {
        return original;
    }

    /**
     * Sets the value of the original property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginal(Boolean value) {
        this.original = value;
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
