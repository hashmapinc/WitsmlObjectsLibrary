package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Geodetic Model Component Schema
 * 
 * <p>Java class for cs_geodeticModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_geodeticModel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameCRS" type="{http://www.witsml.org/schemas/131}wellKnownNameStruct" minOccurs="0"/>
 *         <element name="geodeticDatumCode" type="{http://www.witsml.org/schemas/131}GeodeticDatum" minOccurs="0"/>
 *         <element name="xTranslation" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="yTranslation" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="zTranslation" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="xRotation" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="yRotation" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="zRotation" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="scaleFactor" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="ellipsoidCode" type="{http://www.witsml.org/schemas/131}Ellipsoid" minOccurs="0"/>
 *         <element name="ellipsoidSemiMajorAxis" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="ellipsoidInverseFlattening" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_geodeticModel", propOrder = {
    "nameCRS",
    "geodeticDatumCode",
    "xTranslation",
    "yTranslation",
    "zTranslation",
    "xRotation",
    "yRotation",
    "zRotation",
    "scaleFactor",
    "ellipsoidCode",
    "ellipsoidSemiMajorAxis",
    "ellipsoidInverseFlattening"
})
public class CsGeodeticModel {

    protected WellKnownNameStruct nameCRS;
    @XmlSchemaType(name = "string")
    protected GeodeticDatum geodeticDatumCode;
    protected LengthMeasure xTranslation;
    protected LengthMeasure yTranslation;
    protected LengthMeasure zTranslation;
    protected PlaneAngleMeasure xRotation;
    protected PlaneAngleMeasure yRotation;
    protected PlaneAngleMeasure zRotation;
    protected Double scaleFactor;
    @XmlSchemaType(name = "string")
    protected Ellipsoid ellipsoidCode;
    protected LengthMeasure ellipsoidSemiMajorAxis;
    protected Double ellipsoidInverseFlattening;

    /**
     * Gets the value of the nameCRS property.
     * 
     * @return
     *     possible object is
     *     {@link WellKnownNameStruct }
     *     
     */
    public WellKnownNameStruct getNameCRS() {
        return nameCRS;
    }

    /**
     * Sets the value of the nameCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellKnownNameStruct }
     *     
     */
    public void setNameCRS(WellKnownNameStruct value) {
        this.nameCRS = value;
    }

    /**
     * Gets the value of the geodeticDatumCode property.
     * 
     * @return
     *     possible object is
     *     {@link GeodeticDatum }
     *     
     */
    public GeodeticDatum getGeodeticDatumCode() {
        return geodeticDatumCode;
    }

    /**
     * Sets the value of the geodeticDatumCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeodeticDatum }
     *     
     */
    public void setGeodeticDatumCode(GeodeticDatum value) {
        this.geodeticDatumCode = value;
    }

    /**
     * Gets the value of the xTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getXTranslation() {
        return xTranslation;
    }

    /**
     * Sets the value of the xTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setXTranslation(LengthMeasure value) {
        this.xTranslation = value;
    }

    /**
     * Gets the value of the yTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getYTranslation() {
        return yTranslation;
    }

    /**
     * Sets the value of the yTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setYTranslation(LengthMeasure value) {
        this.yTranslation = value;
    }

    /**
     * Gets the value of the zTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getZTranslation() {
        return zTranslation;
    }

    /**
     * Sets the value of the zTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setZTranslation(LengthMeasure value) {
        this.zTranslation = value;
    }

    /**
     * Gets the value of the xRotation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getXRotation() {
        return xRotation;
    }

    /**
     * Sets the value of the xRotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setXRotation(PlaneAngleMeasure value) {
        this.xRotation = value;
    }

    /**
     * Gets the value of the yRotation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getYRotation() {
        return yRotation;
    }

    /**
     * Sets the value of the yRotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setYRotation(PlaneAngleMeasure value) {
        this.yRotation = value;
    }

    /**
     * Gets the value of the zRotation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getZRotation() {
        return zRotation;
    }

    /**
     * Sets the value of the zRotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setZRotation(PlaneAngleMeasure value) {
        this.zRotation = value;
    }

    /**
     * Gets the value of the scaleFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScaleFactor() {
        return scaleFactor;
    }

    /**
     * Sets the value of the scaleFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setScaleFactor(Double value) {
        this.scaleFactor = value;
    }

    /**
     * Gets the value of the ellipsoidCode property.
     * 
     * @return
     *     possible object is
     *     {@link Ellipsoid }
     *     
     */
    public Ellipsoid getEllipsoidCode() {
        return ellipsoidCode;
    }

    /**
     * Sets the value of the ellipsoidCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ellipsoid }
     *     
     */
    public void setEllipsoidCode(Ellipsoid value) {
        this.ellipsoidCode = value;
    }

    /**
     * Gets the value of the ellipsoidSemiMajorAxis property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getEllipsoidSemiMajorAxis() {
        return ellipsoidSemiMajorAxis;
    }

    /**
     * Sets the value of the ellipsoidSemiMajorAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setEllipsoidSemiMajorAxis(LengthMeasure value) {
        this.ellipsoidSemiMajorAxis = value;
    }

    /**
     * Gets the value of the ellipsoidInverseFlattening property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEllipsoidInverseFlattening() {
        return ellipsoidInverseFlattening;
    }

    /**
     * Sets the value of the ellipsoidInverseFlattening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEllipsoidInverseFlattening(Double value) {
        this.ellipsoidInverseFlattening = value;
    }

}
