


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents an array of Boolean values where all values are identical. This an optimization for which an array of explicit Boolean values is not required. 
 * 
 * <p>Java class for BooleanConstantArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="BooleanConstantArray">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractBooleanArray">
 *       <sequence>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Count" type="{http://www.energistics.org/energyml/data/commonv2}PositiveLong"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanConstantArray", propOrder = {
    "value",
    "count"
})
public class BooleanConstantArray
    extends AbstractBooleanArray
{

    @XmlElement(name = "Value")
    protected boolean value;
    @XmlElement(name = "Count")
    protected long count;

    /**
     * Gets the value of the value property.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

}
