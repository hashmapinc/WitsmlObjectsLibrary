package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML Trajectory Station Corrections Applied
 * 
 * <p>Java class for cs_stnTrajCorUsed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_stnTrajCorUsed">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="gravAxialAccelCor" type="{http://www.witsml.org/schemas/131}accelerationLinearMeasure" minOccurs="0"/>
 *         <element name="gravTran1AccelCor" type="{http://www.witsml.org/schemas/131}accelerationLinearMeasure" minOccurs="0"/>
 *         <element name="gravTran2AccelCor" type="{http://www.witsml.org/schemas/131}accelerationLinearMeasure" minOccurs="0"/>
 *         <element name="magAxialDrlstrCor" type="{http://www.witsml.org/schemas/131}magneticInductionMeasure" minOccurs="0"/>
 *         <element name="magTran1DrlstrCor" type="{http://www.witsml.org/schemas/131}magneticInductionMeasure" minOccurs="0"/>
 *         <element name="magTran2DrlstrCor" type="{http://www.witsml.org/schemas/131}magneticInductionMeasure" minOccurs="0"/>
 *         <element name="sagIncCor" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="sagAziCor" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="stnMagDeclUsed" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="stnGridCorUsed" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="dirSensorOffset" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_stnTrajCorUsed", propOrder = {
    "gravAxialAccelCor",
    "gravTran1AccelCor",
    "gravTran2AccelCor",
    "magAxialDrlstrCor",
    "magTran1DrlstrCor",
    "magTran2DrlstrCor",
    "sagIncCor",
    "sagAziCor",
    "stnMagDeclUsed",
    "stnGridCorUsed",
    "dirSensorOffset"
})
public class CsStnTrajCorUsed {

    protected AccelerationLinearMeasure gravAxialAccelCor;
    protected AccelerationLinearMeasure gravTran1AccelCor;
    protected AccelerationLinearMeasure gravTran2AccelCor;
    protected MagneticInductionMeasure magAxialDrlstrCor;
    protected MagneticInductionMeasure magTran1DrlstrCor;
    protected MagneticInductionMeasure magTran2DrlstrCor;
    protected PlaneAngleMeasure sagIncCor;
    protected PlaneAngleMeasure sagAziCor;
    protected PlaneAngleMeasure stnMagDeclUsed;
    protected PlaneAngleMeasure stnGridCorUsed;
    protected LengthMeasure dirSensorOffset;

    /**
     * Gets the value of the gravAxialAccelCor property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public AccelerationLinearMeasure getGravAxialAccelCor() {
        return gravAxialAccelCor;
    }

    /**
     * Sets the value of the gravAxialAccelCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public void setGravAxialAccelCor(AccelerationLinearMeasure value) {
        this.gravAxialAccelCor = value;
    }

    /**
     * Gets the value of the gravTran1AccelCor property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public AccelerationLinearMeasure getGravTran1AccelCor() {
        return gravTran1AccelCor;
    }

    /**
     * Sets the value of the gravTran1AccelCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public void setGravTran1AccelCor(AccelerationLinearMeasure value) {
        this.gravTran1AccelCor = value;
    }

    /**
     * Gets the value of the gravTran2AccelCor property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public AccelerationLinearMeasure getGravTran2AccelCor() {
        return gravTran2AccelCor;
    }

    /**
     * Sets the value of the gravTran2AccelCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public void setGravTran2AccelCor(AccelerationLinearMeasure value) {
        this.gravTran2AccelCor = value;
    }

    /**
     * Gets the value of the magAxialDrlstrCor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagAxialDrlstrCor() {
        return magAxialDrlstrCor;
    }

    /**
     * Sets the value of the magAxialDrlstrCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagAxialDrlstrCor(MagneticInductionMeasure value) {
        this.magAxialDrlstrCor = value;
    }

    /**
     * Gets the value of the magTran1DrlstrCor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagTran1DrlstrCor() {
        return magTran1DrlstrCor;
    }

    /**
     * Sets the value of the magTran1DrlstrCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagTran1DrlstrCor(MagneticInductionMeasure value) {
        this.magTran1DrlstrCor = value;
    }

    /**
     * Gets the value of the magTran2DrlstrCor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagTran2DrlstrCor() {
        return magTran2DrlstrCor;
    }

    /**
     * Sets the value of the magTran2DrlstrCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagTran2DrlstrCor(MagneticInductionMeasure value) {
        this.magTran2DrlstrCor = value;
    }

    /**
     * Gets the value of the sagIncCor property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getSagIncCor() {
        return sagIncCor;
    }

    /**
     * Sets the value of the sagIncCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setSagIncCor(PlaneAngleMeasure value) {
        this.sagIncCor = value;
    }

    /**
     * Gets the value of the sagAziCor property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getSagAziCor() {
        return sagAziCor;
    }

    /**
     * Sets the value of the sagAziCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setSagAziCor(PlaneAngleMeasure value) {
        this.sagAziCor = value;
    }

    /**
     * Gets the value of the stnMagDeclUsed property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getStnMagDeclUsed() {
        return stnMagDeclUsed;
    }

    /**
     * Sets the value of the stnMagDeclUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setStnMagDeclUsed(PlaneAngleMeasure value) {
        this.stnMagDeclUsed = value;
    }

    /**
     * Gets the value of the stnGridCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getStnGridCorUsed() {
        return stnGridCorUsed;
    }

    /**
     * Sets the value of the stnGridCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setStnGridCorUsed(PlaneAngleMeasure value) {
        this.stnGridCorUsed = value;
    }

    /**
     * Gets the value of the dirSensorOffset property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDirSensorOffset() {
        return dirSensorOffset;
    }

    /**
     * Sets the value of the dirSensorOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDirSensorOffset(LengthMeasure value) {
        this.dirSensorOffset = value;
    }

}
