package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML Trajectory Station Raw Data
 * 
 * <p>Java class for cs_stnTrajRawData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_stnTrajRawData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="gravAxialRaw" type="{http://www.witsml.org/schemas/131}accelerationLinearMeasure" minOccurs="0"/>
 *         <element name="gravTran1Raw" type="{http://www.witsml.org/schemas/131}accelerationLinearMeasure" minOccurs="0"/>
 *         <element name="gravTran2Raw" type="{http://www.witsml.org/schemas/131}accelerationLinearMeasure" minOccurs="0"/>
 *         <element name="magAxialRaw" type="{http://www.witsml.org/schemas/131}magneticInductionMeasure" minOccurs="0"/>
 *         <element name="magTran1Raw" type="{http://www.witsml.org/schemas/131}magneticInductionMeasure" minOccurs="0"/>
 *         <element name="magTran2Raw" type="{http://www.witsml.org/schemas/131}magneticInductionMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_stnTrajRawData", propOrder = {
    "gravAxialRaw",
    "gravTran1Raw",
    "gravTran2Raw",
    "magAxialRaw",
    "magTran1Raw",
    "magTran2Raw"
})
public class CsStnTrajRawData {

    protected AccelerationLinearMeasure gravAxialRaw;
    protected AccelerationLinearMeasure gravTran1Raw;
    protected AccelerationLinearMeasure gravTran2Raw;
    protected MagneticInductionMeasure magAxialRaw;
    protected MagneticInductionMeasure magTran1Raw;
    protected MagneticInductionMeasure magTran2Raw;

    /**
     * Gets the value of the gravAxialRaw property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public AccelerationLinearMeasure getGravAxialRaw() {
        return gravAxialRaw;
    }

    /**
     * Sets the value of the gravAxialRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public void setGravAxialRaw(AccelerationLinearMeasure value) {
        this.gravAxialRaw = value;
    }

    /**
     * Gets the value of the gravTran1Raw property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public AccelerationLinearMeasure getGravTran1Raw() {
        return gravTran1Raw;
    }

    /**
     * Sets the value of the gravTran1Raw property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public void setGravTran1Raw(AccelerationLinearMeasure value) {
        this.gravTran1Raw = value;
    }

    /**
     * Gets the value of the gravTran2Raw property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public AccelerationLinearMeasure getGravTran2Raw() {
        return gravTran2Raw;
    }

    /**
     * Sets the value of the gravTran2Raw property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public void setGravTran2Raw(AccelerationLinearMeasure value) {
        this.gravTran2Raw = value;
    }

    /**
     * Gets the value of the magAxialRaw property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagAxialRaw() {
        return magAxialRaw;
    }

    /**
     * Sets the value of the magAxialRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagAxialRaw(MagneticInductionMeasure value) {
        this.magAxialRaw = value;
    }

    /**
     * Gets the value of the magTran1Raw property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagTran1Raw() {
        return magTran1Raw;
    }

    /**
     * Sets the value of the magTran1Raw property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagTran1Raw(MagneticInductionMeasure value) {
        this.magTran1Raw = value;
    }

    /**
     * Gets the value of the magTran2Raw property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagTran2Raw() {
        return magTran2Raw;
    }

    /**
     * Sets the value of the magTran2Raw property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagTran2Raw(MagneticInductionMeasure value) {
        this.magTran2Raw = value;
    }




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsStnTrajRawData to1411CsStnTrajRawData() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsStnTrajRawData rawData = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsStnTrajRawData();

        // assign fields
        if (null != this.getGravAxialRaw())
            rawData.setGravAxialRaw(this.getGravAxialRaw().to1411AnglePerLengthMeasure());

        if (null != this.getGravTran1Raw())
            rawData.setGravTran1Raw(this.getGravTran1Raw().to1411AnglePerLengthMeasure());

        if (null != this.getGravTran2Raw())
            rawData.setGravTran2Raw(this.getGravTran2Raw().to1411AnglePerLengthMeasure());

        if (null != this.getMagAxialRaw())
            rawData.setMagAxialRaw(this.getMagAxialRaw().to1411MagneticInductionMeasure());

        if (null != this.getMagTran1Raw())
            rawData.setMagTran1Raw(this.getMagTran1Raw().to1411MagneticInductionMeasure());

        if (null != this.getMagTran2Raw())
            rawData.setMagTran2Raw(this.getMagTran2Raw().to1411MagneticInductionMeasure());

        return rawData;
    }
    //=========================================================================

}
