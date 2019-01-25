//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accelerationLinearMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="accelerationLinearMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/1series>abstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.witsml.org/schemas/1series}AccelerationLinearUom" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accelerationLinearMeasure")
public class AccelerationLinearMeasure
    extends AbstractMeasure
{

    @XmlAttribute(name = "uom", required = true)
    protected AccelerationLinearUom uom;

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearUom }
     *     
     */
    public AccelerationLinearUom getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearUom }
     *     
     */
    public void setUom(AccelerationLinearUom value) {
        this.uom = value;
    }




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1311.AccelerationLinearMeasure to1311AnglePerLengthMeasure() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.AccelerationLinearMeasure measure = new com.hashmapinc.tempus.WitsmlObjects.v1311.AccelerationLinearMeasure();

        // assign fields
        measure.setValue(this.value);
        if (null != this.getUom())
            measure.setUom(com.hashmapinc.tempus.WitsmlObjects.v1311.AccelerationLinearUom.fromValue(this.getUom().value()));

        return measure;
    }
    //=========================================================================

}
