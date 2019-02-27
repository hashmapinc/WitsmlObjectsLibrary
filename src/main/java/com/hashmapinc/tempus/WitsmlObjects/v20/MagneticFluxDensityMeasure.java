


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MagneticFluxDensityMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="MagneticFluxDensityMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.energistics.org/energyml/data/commonv2>AbstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityUom" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MagneticFluxDensityMeasure", propOrder = {
    "value"
})
public class MagneticFluxDensityMeasure {

    @XmlValue
    protected Double value;
    @XmlAttribute(name = "uom", required = true)
    protected String uom;

    /**
     * The intended abstract supertype of all quantities that have a value with a unit of measure. The unit of measure is in the uom attribute of the subtypes. 
     * 
     * This type allows all quantities to be profiled to be a 'float' instead of a 'double'.
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

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1311.MagneticInductionMeasure to1311MagneticInductionMeasure() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.MagneticInductionMeasure measure = new com.hashmapinc.tempus.WitsmlObjects.v1311.MagneticInductionMeasure();

        // assign fields
        measure.setValue(this.getValue());
        measure.setUom(this.getUom());

        return measure;
    }

    public com.hashmapinc.tempus.WitsmlObjects.v1411.MagneticInductionMeasure to1411MagneticInductionMeasure() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.MagneticInductionMeasure measure = new com.hashmapinc.tempus.WitsmlObjects.v1411.MagneticInductionMeasure();

        // assign fields
        measure.setValue(this.getValue());
        measure.setUom(this.getUom());

        return measure;
    }
    //=========================================================================

}
