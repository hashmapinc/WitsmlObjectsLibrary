


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for LinearAccelerationMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="LinearAccelerationMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.energistics.org/energyml/data/commonv2>AbstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.energistics.org/energyml/data/commonv2}LinearAccelerationUom" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearAccelerationMeasure", propOrder = {
    "value"
})
public class LinearAccelerationMeasure {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "uom", required = true)
    protected LinearAccelerationUom uom;

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
     *     {@link LinearAccelerationUom }
     *     
     */
    public LinearAccelerationUom getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearAccelerationUom }
     *     
     */
    public void setUom(LinearAccelerationUom value) {
        this.uom = value;
    }




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1311.AccelerationLinearMeasure to1311AnglePerLengthMeasure() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.AccelerationLinearMeasure measure = new com.hashmapinc.tempus.WitsmlObjects.v1311.AccelerationLinearMeasure();

        // assign fields
        measure.setValue(this.getValue());
        if (null != this.getUom())
            measure.setUom(com.hashmapinc.tempus.WitsmlObjects.v1311.AccelerationLinearUom.fromValue(this.getUom().value()));

        return measure;
    }

    public com.hashmapinc.tempus.WitsmlObjects.v1411.AccelerationLinearMeasure to1411AnglePerLengthMeasure() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.AccelerationLinearMeasure measure = new com.hashmapinc.tempus.WitsmlObjects.v1411.AccelerationLinearMeasure();

        // assign fields
        measure.setValue(this.getValue());
        if (null != this.getUom())
            measure.setUom(com.hashmapinc.tempus.WitsmlObjects.v1411.AccelerationLinearUom.fromValue(this.getUom().value()));

        return measure;
    }
    //=========================================================================

}
