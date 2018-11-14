


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines an array as a range of integers. The range is defined by an initial value and a count defining the size of the range.
 * 
 * <p>Java class for IntegerRangeArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="IntegerRangeArray">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractIntegerArray">
 *       <sequence>
 *         <element name="Count" type="{http://www.energistics.org/energyml/data/commonv2}PositiveLong"/>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegerRangeArray", propOrder = {
    "count",
    "value"
})
public class IntegerRangeArray
    extends AbstractIntegerArray
{

    @XmlElement(name = "Count")
    protected long count;
    @XmlElement(name = "Value")
    protected long value;

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

    /**
     * Gets the value of the value property.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

}
