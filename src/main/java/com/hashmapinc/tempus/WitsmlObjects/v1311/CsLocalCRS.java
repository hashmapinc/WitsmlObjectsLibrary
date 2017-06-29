package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cs_localCRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_localCRS">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice minOccurs="0">
 *           <element name="usesWellAsOrigin" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *           <element name="origin" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
 *           <element name="originDescription" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         </choice>
 *         <element name="yAxisAzimuth" type="{http://www.witsml.org/schemas/131}yAxisAzimuth" minOccurs="0"/>
 *         <element name="yAxisDescription" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="xRotationCounterClockwise" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_localCRS", propOrder = {
    "usesWellAsOrigin",
    "origin",
    "originDescription",
    "yAxisAzimuth",
    "yAxisDescription",
    "xRotationCounterClockwise"
})
public class CsLocalCRS {

    protected Boolean usesWellAsOrigin;
    protected RefNameString origin;
    protected String originDescription;
    protected YAxisAzimuth yAxisAzimuth;
    protected String yAxisDescription;
    protected Boolean xRotationCounterClockwise;

    /**
     * Gets the value of the usesWellAsOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsesWellAsOrigin() {
        return usesWellAsOrigin;
    }

    /**
     * Sets the value of the usesWellAsOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsesWellAsOrigin(Boolean value) {
        this.usesWellAsOrigin = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setOrigin(RefNameString value) {
        this.origin = value;
    }

    /**
     * Gets the value of the originDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDescription() {
        return originDescription;
    }

    /**
     * Sets the value of the originDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDescription(String value) {
        this.originDescription = value;
    }

    /**
     * Gets the value of the yAxisAzimuth property.
     * 
     * @return
     *     possible object is
     *     {@link YAxisAzimuth }
     *     
     */
    public YAxisAzimuth getYAxisAzimuth() {
        return yAxisAzimuth;
    }

    /**
     * Sets the value of the yAxisAzimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link YAxisAzimuth }
     *     
     */
    public void setYAxisAzimuth(YAxisAzimuth value) {
        this.yAxisAzimuth = value;
    }

    /**
     * Gets the value of the yAxisDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYAxisDescription() {
        return yAxisDescription;
    }

    /**
     * Sets the value of the yAxisDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYAxisDescription(String value) {
        this.yAxisDescription = value;
    }

    /**
     * Gets the value of the xRotationCounterClockwise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXRotationCounterClockwise() {
        return xRotationCounterClockwise;
    }

    /**
     * Sets the value of the xRotationCounterClockwise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXRotationCounterClockwise(Boolean value) {
        this.xRotationCounterClockwise = value;
    }

}
