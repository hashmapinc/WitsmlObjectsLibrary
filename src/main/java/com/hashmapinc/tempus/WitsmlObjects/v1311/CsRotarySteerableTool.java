package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Rotary Steerable Tool Component Schema 
 * 
 * <p>Java class for cs_rotarySteerableTool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_rotarySteerableTool">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="deflectionMethod" type="{http://www.witsml.org/schemas/131}DeflectionMethod"/>
 *         <choice>
 *           <element name="bendAngle" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *           <element name="bendOffset" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         </choice>
 *         <element name="holeSizeMn" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="holeSizeMx" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="wobMx" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="operatingSpeed" type="{http://www.witsml.org/schemas/131}anglePerTimeMeasure" minOccurs="0"/>
 *         <element name="speedMx" type="{http://www.witsml.org/schemas/131}anglePerTimeMeasure" minOccurs="0"/>
 *         <element name="flowRateMn" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="flowRateMx" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="downLinkFlowRateMn" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="downLinkFlowRateMx" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="pressLossFact" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="padCount" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="padLen" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="padWidth" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="padOffset" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="openPadOd" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="closePadOd" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="sensor" type="{http://www.witsml.org/schemas/131}cs_sensor" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_rotarySteerableTool", propOrder = {
    "deflectionMethod",
    "bendAngle",
    "bendOffset",
    "holeSizeMn",
    "holeSizeMx",
    "wobMx",
    "operatingSpeed",
    "speedMx",
    "flowRateMn",
    "flowRateMx",
    "downLinkFlowRateMn",
    "downLinkFlowRateMx",
    "pressLossFact",
    "padCount",
    "padLen",
    "padWidth",
    "padOffset",
    "openPadOd",
    "closePadOd",
    "sensor",
    "customData"
})
public class CsRotarySteerableTool {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeflectionMethod deflectionMethod;
    protected PlaneAngleMeasure bendAngle;
    protected LengthMeasure bendOffset;
    protected LengthMeasure holeSizeMn;
    protected LengthMeasure holeSizeMx;
    protected ForceMeasure wobMx;
    protected AnglePerTimeMeasure operatingSpeed;
    protected AnglePerTimeMeasure speedMx;
    protected VolumeFlowRateMeasure flowRateMn;
    protected VolumeFlowRateMeasure flowRateMx;
    protected VolumeFlowRateMeasure downLinkFlowRateMn;
    protected VolumeFlowRateMeasure downLinkFlowRateMx;
    protected Double pressLossFact;
    protected Short padCount;
    protected LengthMeasure padLen;
    protected LengthMeasure padWidth;
    protected LengthMeasure padOffset;
    protected LengthMeasure openPadOd;
    protected LengthMeasure closePadOd;
    protected List<CsSensor> sensor;
    protected CsCustomData customData;

    /**
     * Gets the value of the deflectionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeflectionMethod }
     *     
     */
    public DeflectionMethod getDeflectionMethod() {
        return deflectionMethod;
    }

    /**
     * Sets the value of the deflectionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeflectionMethod }
     *     
     */
    public void setDeflectionMethod(DeflectionMethod value) {
        this.deflectionMethod = value;
    }

    /**
     * Gets the value of the bendAngle property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getBendAngle() {
        return bendAngle;
    }

    /**
     * Sets the value of the bendAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setBendAngle(PlaneAngleMeasure value) {
        this.bendAngle = value;
    }

    /**
     * Gets the value of the bendOffset property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getBendOffset() {
        return bendOffset;
    }

    /**
     * Sets the value of the bendOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setBendOffset(LengthMeasure value) {
        this.bendOffset = value;
    }

    /**
     * Gets the value of the holeSizeMn property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getHoleSizeMn() {
        return holeSizeMn;
    }

    /**
     * Sets the value of the holeSizeMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setHoleSizeMn(LengthMeasure value) {
        this.holeSizeMn = value;
    }

    /**
     * Gets the value of the holeSizeMx property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getHoleSizeMx() {
        return holeSizeMx;
    }

    /**
     * Sets the value of the holeSizeMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setHoleSizeMx(LengthMeasure value) {
        this.holeSizeMx = value;
    }

    /**
     * Gets the value of the wobMx property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getWobMx() {
        return wobMx;
    }

    /**
     * Sets the value of the wobMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setWobMx(ForceMeasure value) {
        this.wobMx = value;
    }

    /**
     * Gets the value of the operatingSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public AnglePerTimeMeasure getOperatingSpeed() {
        return operatingSpeed;
    }

    /**
     * Sets the value of the operatingSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public void setOperatingSpeed(AnglePerTimeMeasure value) {
        this.operatingSpeed = value;
    }

    /**
     * Gets the value of the speedMx property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public AnglePerTimeMeasure getSpeedMx() {
        return speedMx;
    }

    /**
     * Sets the value of the speedMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public void setSpeedMx(AnglePerTimeMeasure value) {
        this.speedMx = value;
    }

    /**
     * Gets the value of the flowRateMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowRateMn() {
        return flowRateMn;
    }

    /**
     * Sets the value of the flowRateMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowRateMn(VolumeFlowRateMeasure value) {
        this.flowRateMn = value;
    }

    /**
     * Gets the value of the flowRateMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowRateMx() {
        return flowRateMx;
    }

    /**
     * Sets the value of the flowRateMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowRateMx(VolumeFlowRateMeasure value) {
        this.flowRateMx = value;
    }

    /**
     * Gets the value of the downLinkFlowRateMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getDownLinkFlowRateMn() {
        return downLinkFlowRateMn;
    }

    /**
     * Sets the value of the downLinkFlowRateMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setDownLinkFlowRateMn(VolumeFlowRateMeasure value) {
        this.downLinkFlowRateMn = value;
    }

    /**
     * Gets the value of the downLinkFlowRateMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getDownLinkFlowRateMx() {
        return downLinkFlowRateMx;
    }

    /**
     * Sets the value of the downLinkFlowRateMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setDownLinkFlowRateMx(VolumeFlowRateMeasure value) {
        this.downLinkFlowRateMx = value;
    }

    /**
     * Gets the value of the pressLossFact property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPressLossFact() {
        return pressLossFact;
    }

    /**
     * Sets the value of the pressLossFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPressLossFact(Double value) {
        this.pressLossFact = value;
    }

    /**
     * Gets the value of the padCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPadCount() {
        return padCount;
    }

    /**
     * Sets the value of the padCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPadCount(Short value) {
        this.padCount = value;
    }

    /**
     * Gets the value of the padLen property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getPadLen() {
        return padLen;
    }

    /**
     * Sets the value of the padLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setPadLen(LengthMeasure value) {
        this.padLen = value;
    }

    /**
     * Gets the value of the padWidth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getPadWidth() {
        return padWidth;
    }

    /**
     * Sets the value of the padWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setPadWidth(LengthMeasure value) {
        this.padWidth = value;
    }

    /**
     * Gets the value of the padOffset property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getPadOffset() {
        return padOffset;
    }

    /**
     * Sets the value of the padOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setPadOffset(LengthMeasure value) {
        this.padOffset = value;
    }

    /**
     * Gets the value of the openPadOd property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOpenPadOd() {
        return openPadOd;
    }

    /**
     * Sets the value of the openPadOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOpenPadOd(LengthMeasure value) {
        this.openPadOd = value;
    }

    /**
     * Gets the value of the closePadOd property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getClosePadOd() {
        return closePadOd;
    }

    /**
     * Sets the value of the closePadOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setClosePadOd(LengthMeasure value) {
        this.closePadOd = value;
    }

    /**
     * Gets the value of the sensor property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sensor property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getSensor().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsSensor }
     * 
     * 
     */
    public List<CsSensor> getSensor() {
        if (sensor == null) {
            sensor = new ArrayList<CsSensor>();
        }
        return this.sensor;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCustomData }
     *     
     */
    public CsCustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCustomData }
     *     
     */
    public void setCustomData(CsCustomData value) {
        this.customData = value;
    }

}
