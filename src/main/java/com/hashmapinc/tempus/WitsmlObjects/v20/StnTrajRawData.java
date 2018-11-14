


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Captures raw data for a trajectory station.
 * 
 * <p>Java class for StnTrajRawData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="StnTrajRawData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GravAxialRaw" type="{http://www.energistics.org/energyml/data/commonv2}LinearAccelerationMeasure" minOccurs="0"/>
 *         <element name="GravTran1Raw" type="{http://www.energistics.org/energyml/data/commonv2}LinearAccelerationMeasure" minOccurs="0"/>
 *         <element name="GravTran2Raw" type="{http://www.energistics.org/energyml/data/commonv2}LinearAccelerationMeasure" minOccurs="0"/>
 *         <element name="MagAxialRaw" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityMeasure" minOccurs="0"/>
 *         <element name="MagTran1Raw" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityMeasure" minOccurs="0"/>
 *         <element name="MagTran2Raw" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StnTrajRawData", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "gravAxialRaw",
    "gravTran1Raw",
    "gravTran2Raw",
    "magAxialRaw",
    "magTran1Raw",
    "magTran2Raw"
})
public class StnTrajRawData {

    @XmlElement(name = "GravAxialRaw")
    protected LinearAccelerationMeasure gravAxialRaw;
    @XmlElement(name = "GravTran1Raw")
    protected LinearAccelerationMeasure gravTran1Raw;
    @XmlElement(name = "GravTran2Raw")
    protected LinearAccelerationMeasure gravTran2Raw;
    @XmlElement(name = "MagAxialRaw")
    protected MagneticFluxDensityMeasure magAxialRaw;
    @XmlElement(name = "MagTran1Raw")
    protected MagneticFluxDensityMeasure magTran1Raw;
    @XmlElement(name = "MagTran2Raw")
    protected MagneticFluxDensityMeasure magTran2Raw;

    /**
     * Gets the value of the gravAxialRaw property.
     * 
     * @return
     *     possible object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public LinearAccelerationMeasure getGravAxialRaw() {
        return gravAxialRaw;
    }

    /**
     * Sets the value of the gravAxialRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public void setGravAxialRaw(LinearAccelerationMeasure value) {
        this.gravAxialRaw = value;
    }

    /**
     * Gets the value of the gravTran1Raw property.
     * 
     * @return
     *     possible object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public LinearAccelerationMeasure getGravTran1Raw() {
        return gravTran1Raw;
    }

    /**
     * Sets the value of the gravTran1Raw property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public void setGravTran1Raw(LinearAccelerationMeasure value) {
        this.gravTran1Raw = value;
    }

    /**
     * Gets the value of the gravTran2Raw property.
     * 
     * @return
     *     possible object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public LinearAccelerationMeasure getGravTran2Raw() {
        return gravTran2Raw;
    }

    /**
     * Sets the value of the gravTran2Raw property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public void setGravTran2Raw(LinearAccelerationMeasure value) {
        this.gravTran2Raw = value;
    }

    /**
     * Gets the value of the magAxialRaw property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public MagneticFluxDensityMeasure getMagAxialRaw() {
        return magAxialRaw;
    }

    /**
     * Sets the value of the magAxialRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public void setMagAxialRaw(MagneticFluxDensityMeasure value) {
        this.magAxialRaw = value;
    }

    /**
     * Gets the value of the magTran1Raw property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public MagneticFluxDensityMeasure getMagTran1Raw() {
        return magTran1Raw;
    }

    /**
     * Sets the value of the magTran1Raw property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public void setMagTran1Raw(MagneticFluxDensityMeasure value) {
        this.magTran1Raw = value;
    }

    /**
     * Gets the value of the magTran2Raw property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public MagneticFluxDensityMeasure getMagTran2Raw() {
        return magTran2Raw;
    }

    /**
     * Sets the value of the magTran2Raw property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public void setMagTran2Raw(MagneticFluxDensityMeasure value) {
        this.magTran2Raw = value;
    }

}
