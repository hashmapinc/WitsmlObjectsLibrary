


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A unitless measure is a measure which has no unit of measure symbol, but could be a real physical measurement. Examples would be pH, wire gauge (AWG and BWG) and shoe size.
 * 
 * This is different from a dimensionless measure which represents a ratio whose units of measure have cancelled each other. DImensionless measures can have units of measure (like ppm or %) or may not have a displayable unit of measure symbol (in which case the units symbol Euc is used in a data transfer).
 * 
 * <p>Java class for UnitlessMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="UnitlessMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.energistics.org/energyml/data/commonv2>AbstractMeasure">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitlessMeasure", propOrder = {
    "value"
})
public class UnitlessMeasure {

    @XmlValue
    protected Double value;

    /**
     * The intended abstract supertype of all quantities that have a value with a unit of measure. The unit of measure is in the uom attribute of the subtypes. 
     * 
     * This type allows all quantities to be profiled to be a 'float' instead of a 'Double'.
     * 
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(Double value) {
        this.value = value;
    }

}
