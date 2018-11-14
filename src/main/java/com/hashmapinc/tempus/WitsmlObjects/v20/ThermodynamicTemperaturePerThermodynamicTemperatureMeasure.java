


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ThermodynamicTemperaturePerThermodynamicTemperatureMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ThermodynamicTemperaturePerThermodynamicTemperatureMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.energistics.org/energyml/data/commonv2>AbstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.energistics.org/energyml/data/commonv2}ThermodynamicTemperaturePerThermodynamicTemperatureUom" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThermodynamicTemperaturePerThermodynamicTemperatureMeasure", propOrder = {
    "value"
})
public class ThermodynamicTemperaturePerThermodynamicTemperatureMeasure {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "uom", required = true)
    protected ThermodynamicTemperaturePerThermodynamicTemperatureUom uom;

    /**
     * The intended abstract supertype of all quantities that have a value with a unit of measure. The unit of measure is in the uom attribute of the subtypes. 
     * 
     * This type allows all quantities to be profiled to be a 'float' instead of a 'double'.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperaturePerThermodynamicTemperatureUom }
     *     
     */
    public ThermodynamicTemperaturePerThermodynamicTemperatureUom getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperaturePerThermodynamicTemperatureUom }
     *     
     */
    public void setUom(ThermodynamicTemperaturePerThermodynamicTemperatureUom value) {
        this.uom = value;
    }

}
