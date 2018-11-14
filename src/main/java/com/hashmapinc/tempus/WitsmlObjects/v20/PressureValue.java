


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PressureValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="PressureValue">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AbstractPressureValue" type="{http://www.energistics.org/energyml/data/commonv2}AbstractPressureValue"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PressureValue", propOrder = {
    "abstractPressureValue"
})
public class PressureValue {

    @XmlElement(name = "AbstractPressureValue", required = true)
    protected AbstractPressureValue abstractPressureValue;

    /**
     * Gets the value of the abstractPressureValue property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractPressureValue }
     *     
     */
    public AbstractPressureValue getAbstractPressureValue() {
        return abstractPressureValue;
    }

    /**
     * Sets the value of the abstractPressureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractPressureValue }
     *     
     */
    public void setAbstractPressureValue(AbstractPressureValue value) {
        this.abstractPressureValue = value;
    }

}
