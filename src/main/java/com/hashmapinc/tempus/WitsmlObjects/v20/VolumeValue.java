


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A possibly temperature and pressure corrected volume value.
 * 
 * <p>Java class for VolumeValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="VolumeValue">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Volume" type="{http://www.energistics.org/energyml/data/commonv2}VolumeMeasureExt"/>
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
@XmlType(name = "VolumeValue", propOrder = {
    "volume",
    "measurementPressureTemperature"
})
public class VolumeValue {

    @XmlElement(name = "Volume", required = true)
    protected VolumeMeasureExt volume;
    @XmlElement(name = "MeasurementPressureTemperature", required = true)
    protected AbstractTemperaturePressure measurementPressureTemperature;

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasureExt }
     *     
     */
    public VolumeMeasureExt getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasureExt }
     *     
     */
    public void setVolume(VolumeMeasureExt value) {
        this.volume = value;
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
