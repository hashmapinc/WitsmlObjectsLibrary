


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Various parameters controlling the generation of the survey variance.
 * 
 * <p>Java class for IscwsaModelParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="IscwsaModelParameters">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MisalignmentMode" type="{http://www.energistics.org/energyml/data/witsmlv2}ErrorModelMisalignmentMode"/>
 *         <element name="GyroInitialization" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="GyroReinitializationDistance" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *         <element name="Switching" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="NoiseReductionFactor" type="{http://www.w3.org/2001/XMLSchema}Double" minOccurs="0"/>
 *         <element name="GyroRunningSpeed" type="{http://www.energistics.org/energyml/data/commonv2}LengthPerTimeMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscwsaModelParameters", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "misalignmentMode",
    "gyroInitialization",
    "gyroReinitializationDistance",
    "switching",
    "noiseReductionFactor",
    "gyroRunningSpeed"
})
public class IscwsaModelParameters {

    @XmlElement(name = "MisalignmentMode", required = true)
    protected String misalignmentMode;
    @XmlElement(name = "GyroInitialization")
    protected PlaneAngleMeasure gyroInitialization;
    @XmlElement(name = "GyroReinitializationDistance")
    protected LengthMeasure gyroReinitializationDistance;
    @XmlElement(name = "Switching")
    protected Boolean switching;
    @XmlElement(name = "NoiseReductionFactor")
    protected Double noiseReductionFactor;
    @XmlElement(name = "GyroRunningSpeed")
    protected LengthPerTimeMeasure gyroRunningSpeed;

    /**
     * Gets the value of the misalignmentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMisalignmentMode() {
        return misalignmentMode;
    }

    /**
     * Sets the value of the misalignmentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMisalignmentMode(String value) {
        this.misalignmentMode = value;
    }

    /**
     * Gets the value of the gyroInitialization property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getGyroInitialization() {
        return gyroInitialization;
    }

    /**
     * Sets the value of the gyroInitialization property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setGyroInitialization(PlaneAngleMeasure value) {
        this.gyroInitialization = value;
    }

    /**
     * Gets the value of the gyroReinitializationDistance property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getGyroReinitializationDistance() {
        return gyroReinitializationDistance;
    }

    /**
     * Sets the value of the gyroReinitializationDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setGyroReinitializationDistance(LengthMeasure value) {
        this.gyroReinitializationDistance = value;
    }

    /**
     * Gets the value of the switching property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSwitching() {
        return switching;
    }

    /**
     * Sets the value of the switching property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSwitching(Boolean value) {
        this.switching = value;
    }

    /**
     * Gets the value of the noiseReductionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNoiseReductionFactor() {
        return noiseReductionFactor;
    }

    /**
     * Sets the value of the noiseReductionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNoiseReductionFactor(Double value) {
        this.noiseReductionFactor = value;
    }

    /**
     * Gets the value of the gyroRunningSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link LengthPerTimeMeasure }
     *     
     */
    public LengthPerTimeMeasure getGyroRunningSpeed() {
        return gyroRunningSpeed;
    }

    /**
     * Sets the value of the gyroRunningSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthPerTimeMeasure }
     *     
     */
    public void setGyroRunningSpeed(LengthPerTimeMeasure value) {
        this.gyroRunningSpeed = value;
    }

}
