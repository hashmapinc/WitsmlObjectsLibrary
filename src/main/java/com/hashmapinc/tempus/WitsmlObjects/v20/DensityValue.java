


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A possibly temperature and pressure corrected desity value.
 * 
 * <p>Java class for DensityValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="DensityValue">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Density" type="{http://www.energistics.org/energyml/data/commonv2}MassPerVolumeMeasureExt"/>
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
@XmlType(name = "DensityValue", propOrder = {
    "density",
    "measurementPressureTemperature"
})
public class DensityValue {

    @XmlElement(name = "Density", required = true)
    protected MassPerVolumeMeasureExt density;
    @XmlElement(name = "MeasurementPressureTemperature", required = true)
    protected AbstractTemperaturePressure measurementPressureTemperature;

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link MassPerVolumeMeasureExt }
     *     
     */
    public MassPerVolumeMeasureExt getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassPerVolumeMeasureExt }
     *     
     */
    public void setDensity(MassPerVolumeMeasureExt value) {
        this.density = value;
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
