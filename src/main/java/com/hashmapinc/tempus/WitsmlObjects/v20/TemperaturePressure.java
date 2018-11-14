


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * temperature and pressure
 * 
 * <p>Java class for TemperaturePressure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="TemperaturePressure">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractTemperaturePressure">
 *       <sequence>
 *         <element name="Temperature" type="{http://www.energistics.org/energyml/data/commonv2}ThermodynamicTemperatureMeasure"/>
 *         <element name="Pressure" type="{http://www.energistics.org/energyml/data/commonv2}PressureMeasure"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperaturePressure", propOrder = {
    "temperature",
    "pressure"
})
public class TemperaturePressure
    extends AbstractTemperaturePressure
{

    @XmlElement(name = "Temperature", required = true)
    protected ThermodynamicTemperatureMeasure temperature;
    @XmlElement(name = "Pressure", required = true)
    protected PressureMeasure pressure;

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTemperature(ThermodynamicTemperatureMeasure value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the pressure property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPressure(PressureMeasure value) {
        this.pressure = value;
    }

}
