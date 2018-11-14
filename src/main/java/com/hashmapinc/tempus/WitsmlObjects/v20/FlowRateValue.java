


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A possibly temperature and pressure corrected flow rate value.
 * 
 * <p>Java class for FlowRateValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="FlowRateValue">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FlowRate" type="{http://www.energistics.org/energyml/data/commonv2}VolumePerTimeMeasureExt"/>
 *         <element name="MeasurementPressureTemperature" type="{http://www.energistics.org/energyml/data/commonv2}AbstractTemperaturePressure"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowRateValue", propOrder = {
    "flowRate",
    "measurementPressureTemperature"
})
public class FlowRateValue {

    @XmlElement(name = "FlowRate", required = true)
    protected VolumePerTimeMeasureExt flowRate;
    @XmlElement(name = "MeasurementPressureTemperature", required = true)
    protected AbstractTemperaturePressure measurementPressureTemperature;

    /**
     * Gets the value of the flowRate property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerTimeMeasureExt }
     *     
     */
    public VolumePerTimeMeasureExt getFlowRate() {
        return flowRate;
    }

    /**
     * Sets the value of the flowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerTimeMeasureExt }
     *     
     */
    public void setFlowRate(VolumePerTimeMeasureExt value) {
        this.flowRate = value;
    }

    /**
     * Gets the value of the measurementPressureTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractTemperaturePressure }
     *     
     */
    public AbstractTemperaturePressure getMeasurementPressureTemperature() {
        return measurementPressureTemperature;
    }

    /**
     * Sets the value of the measurementPressureTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractTemperaturePressure }
     *     
     */
    public void setMeasurementPressureTemperature(AbstractTemperaturePressure value) {
        this.measurementPressureTemperature = value;
    }

}
