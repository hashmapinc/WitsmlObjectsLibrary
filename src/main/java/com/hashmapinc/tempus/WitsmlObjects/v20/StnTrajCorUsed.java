


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Captures information about corrections applied to a trajectory station.
 * 
 * <p>Java class for StnTrajCorUsed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="StnTrajCorUsed">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GravAxialAccelCor" type="{http://www.energistics.org/energyml/data/commonv2}LinearAccelerationMeasure" minOccurs="0"/>
 *         <element name="GravTran1AccelCor" type="{http://www.energistics.org/energyml/data/commonv2}LinearAccelerationMeasure" minOccurs="0"/>
 *         <element name="GravTran2AccelCor" type="{http://www.energistics.org/energyml/data/commonv2}LinearAccelerationMeasure" minOccurs="0"/>
 *         <element name="MagAxialDrlstrCor" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityMeasure" minOccurs="0"/>
 *         <element name="MagTran1DrlstrCor" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityMeasure" minOccurs="0"/>
 *         <element name="MagTran2DrlstrCor" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityMeasure" minOccurs="0"/>
 *         <element name="MagTran1MSACor" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityMeasure" minOccurs="0"/>
 *         <element name="MagTran2MSACor" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityMeasure" minOccurs="0"/>
 *         <element name="MagAxialMSACor" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityMeasure" minOccurs="0"/>
 *         <element name="SagIncCor" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="SagAziCor" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="StnMagDeclUsed" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="StnGridConUsed" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="DirSensorOffset" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StnTrajCorUsed", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "gravAxialAccelCor",
    "gravTran1AccelCor",
    "gravTran2AccelCor",
    "magAxialDrlstrCor",
    "magTran1DrlstrCor",
    "magTran2DrlstrCor",
    "magTran1MSACor",
    "magTran2MSACor",
    "magAxialMSACor",
    "sagIncCor",
    "sagAziCor",
    "stnMagDeclUsed",
    "stnGridConUsed",
    "dirSensorOffset"
})
public class StnTrajCorUsed {

    @XmlElement(name = "GravAxialAccelCor")
    protected LinearAccelerationMeasure gravAxialAccelCor;
    @XmlElement(name = "GravTran1AccelCor")
    protected LinearAccelerationMeasure gravTran1AccelCor;
    @XmlElement(name = "GravTran2AccelCor")
    protected LinearAccelerationMeasure gravTran2AccelCor;
    @XmlElement(name = "MagAxialDrlstrCor")
    protected MagneticFluxDensityMeasure magAxialDrlstrCor;
    @XmlElement(name = "MagTran1DrlstrCor")
    protected MagneticFluxDensityMeasure magTran1DrlstrCor;
    @XmlElement(name = "MagTran2DrlstrCor")
    protected MagneticFluxDensityMeasure magTran2DrlstrCor;
    @XmlElement(name = "MagTran1MSACor")
    protected MagneticFluxDensityMeasure magTran1MSACor;
    @XmlElement(name = "MagTran2MSACor")
    protected MagneticFluxDensityMeasure magTran2MSACor;
    @XmlElement(name = "MagAxialMSACor")
    protected MagneticFluxDensityMeasure magAxialMSACor;
    @XmlElement(name = "SagIncCor")
    protected PlaneAngleMeasure sagIncCor;
    @XmlElement(name = "SagAziCor")
    protected PlaneAngleMeasure sagAziCor;
    @XmlElement(name = "StnMagDeclUsed")
    protected PlaneAngleMeasure stnMagDeclUsed;
    @XmlElement(name = "StnGridConUsed")
    protected PlaneAngleMeasure stnGridConUsed;
    @XmlElement(name = "DirSensorOffset")
    protected LengthMeasure dirSensorOffset;

    /**
     * Gets the value of the gravAxialAccelCor property.
     * 
     * @return
     *     possible object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public LinearAccelerationMeasure getGravAxialAccelCor() {
        return gravAxialAccelCor;
    }

    /**
     * Sets the value of the gravAxialAccelCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public void setGravAxialAccelCor(LinearAccelerationMeasure value) {
        this.gravAxialAccelCor = value;
    }

    /**
     * Gets the value of the gravTran1AccelCor property.
     * 
     * @return
     *     possible object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public LinearAccelerationMeasure getGravTran1AccelCor() {
        return gravTran1AccelCor;
    }

    /**
     * Sets the value of the gravTran1AccelCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public void setGravTran1AccelCor(LinearAccelerationMeasure value) {
        this.gravTran1AccelCor = value;
    }

    /**
     * Gets the value of the gravTran2AccelCor property.
     * 
     * @return
     *     possible object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public LinearAccelerationMeasure getGravTran2AccelCor() {
        return gravTran2AccelCor;
    }

    /**
     * Sets the value of the gravTran2AccelCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public void setGravTran2AccelCor(LinearAccelerationMeasure value) {
        this.gravTran2AccelCor = value;
    }

    /**
     * Gets the value of the magAxialDrlstrCor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public MagneticFluxDensityMeasure getMagAxialDrlstrCor() {
        return magAxialDrlstrCor;
    }

    /**
     * Sets the value of the magAxialDrlstrCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public void setMagAxialDrlstrCor(MagneticFluxDensityMeasure value) {
        this.magAxialDrlstrCor = value;
    }

    /**
     * Gets the value of the magTran1DrlstrCor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public MagneticFluxDensityMeasure getMagTran1DrlstrCor() {
        return magTran1DrlstrCor;
    }

    /**
     * Sets the value of the magTran1DrlstrCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public void setMagTran1DrlstrCor(MagneticFluxDensityMeasure value) {
        this.magTran1DrlstrCor = value;
    }

    /**
     * Gets the value of the magTran2DrlstrCor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public MagneticFluxDensityMeasure getMagTran2DrlstrCor() {
        return magTran2DrlstrCor;
    }

    /**
     * Sets the value of the magTran2DrlstrCor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public void setMagTran2DrlstrCor(MagneticFluxDensityMeasure value) {
        this.magTran2DrlstrCor = value;
    }

    /**
     * Gets the value of the magTran1MSACor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public MagneticFluxDensityMeasure getMagTran1MSACor() {
        return magTran1MSACor;
    }

    /**
     * Sets the value of the magTran1MSACor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public void setMagTran1MSACor(MagneticFluxDensityMeasure value) {
        this.magTran1MSACor = value;
    }

    /**
     * Gets the value of the magTran2MSACor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public MagneticFluxDensityMeasure getMagTran2MSACor() {
        return magTran2MSACor;
    }

    /**
     * Sets the value of the magTran2MSACor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public void setMagTran2MSACor(MagneticFluxDensityMeasure value) {
        this.magTran2MSACor = value;
    }

    /**
     * Gets the value of the magAxialMSACor property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public MagneticFluxDensityMeasure getMagAxialMSACor() {
        return magAxialMSACor;
    }

    /**
     * Sets the value of the magAxialMSACor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public void setMagAxialMSACor(MagneticFluxDensityMeasure value) {
        this.magAxialMSACor = value;
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
     * Gets the value of the stnGridConUsed property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getStnGridConUsed() {
        return stnGridConUsed;
    }

    /**
     * Sets the value of the stnGridConUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setStnGridConUsed(PlaneAngleMeasure value) {
        this.stnGridConUsed = value;
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




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1311.CsStnTrajCorUsed to1311CsStnTrajCorUsed() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.CsStnTrajCorUsed cor = new com.hashmapinc.tempus.WitsmlObjects.v1311.CsStnTrajCorUsed();

        // assign fields
        if (null != this.getGravAxialAccelCor())
            cor.setGravAxialAccelCor(this.getGravAxialAccelCor().to1311AnglePerLengthMeasure());

        if (null != this.getGravTran1AccelCor())
            cor.setGravTran1AccelCor(this.getGravTran1AccelCor().to1311AnglePerLengthMeasure());

        if (null != this.getGravTran2AccelCor())
            cor.setGravTran2AccelCor(this.getGravTran2AccelCor().to1311AnglePerLengthMeasure());

        if (null != this.getMagAxialDrlstrCor())
            cor.setMagAxialDrlstrCor(this.getMagAxialDrlstrCor().to1311MagneticInductionMeasure());

        if (null != this.getMagTran1DrlstrCor())
            cor.setMagTran1DrlstrCor(this.getMagTran1DrlstrCor().to1311MagneticInductionMeasure());

        if (null != this.getMagTran2DrlstrCor())
            cor.setMagTran2DrlstrCor(this.getMagTran2DrlstrCor().to1311MagneticInductionMeasure());

        if (null != this.getSagIncCor())
            cor.setSagIncCor(this.getSagIncCor().to1311PlaneAngleMeasure());

        if (null != this.getSagAziCor())
            cor.setSagAziCor(this.getSagAziCor().to1311PlaneAngleMeasure());

        if (null != this.getStnMagDeclUsed())
            cor.setStnMagDeclUsed(this.getStnMagDeclUsed().to1311PlaneAngleMeasure());

        if (null != this.getDirSensorOffset())
            cor.setDirSensorOffset(this.getDirSensorOffset().to1311LengthMeasure());

        return cor;
    }


    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsStnTrajCorUsed to1411CsStnTrajCorUsed() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsStnTrajCorUsed cor = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsStnTrajCorUsed();

        // assign fields
        if (null != this.getGravAxialAccelCor())
            cor.setGravAxialAccelCor(this.getGravAxialAccelCor().to1411AnglePerLengthMeasure());

        if (null != this.getGravTran1AccelCor())
            cor.setGravTran1AccelCor(this.getGravTran1AccelCor().to1411AnglePerLengthMeasure());

        if (null != this.getGravTran2AccelCor())
            cor.setGravTran2AccelCor(this.getGravTran2AccelCor().to1411AnglePerLengthMeasure());

        if (null != this.getMagAxialDrlstrCor())
            cor.setMagAxialDrlstrCor(this.getMagAxialDrlstrCor().to1411MagneticInductionMeasure());

        if (null != this.getMagTran1DrlstrCor())
            cor.setMagTran1DrlstrCor(this.getMagTran1DrlstrCor().to1411MagneticInductionMeasure());

        if (null != this.getMagTran2DrlstrCor())
            cor.setMagTran2DrlstrCor(this.getMagTran2DrlstrCor().to1411MagneticInductionMeasure());

        if (null != this.getSagIncCor())
            cor.setSagIncCor(this.getSagIncCor().to1411PlaneAngleMeasure());

        if (null != this.getSagAziCor())
            cor.setSagAziCor(this.getSagAziCor().to1411PlaneAngleMeasure());

        if (null != this.getStnMagDeclUsed())
            cor.setStnMagDeclUsed(this.getStnMagDeclUsed().to1411PlaneAngleMeasure());

        if (null != this.getDirSensorOffset())
            cor.setDirSensorOffset(this.getDirSensorOffset().to1411LengthMeasure());

        return cor;
    }
    //=========================================================================

}
