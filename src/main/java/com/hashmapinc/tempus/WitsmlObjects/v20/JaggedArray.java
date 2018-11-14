


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data storage object for an array of variable length 1D sub-arrays. The jagged array object consists of these two arrays: 
 * 	- An aggregation of all the variable length sub-arrays into a single 1D array.   
 * 	- The offsets into the single 1D array, given by the sum of all the sub-array lengths up to and including the current sub-array.  
 * Often referred to as a "list-of-lists" or "array-of-arrays" construction.
 * 
 * For example to store the following three arrays as a jagged array:
 * (a b c)
 * (d e f g)
 * (h)
 * Elements = (a b c d e f g h)
 * Cumulative Length = (3 7 8)
 * 
 * <p>Java class for JaggedArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="JaggedArray">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Elements" type="{http://www.energistics.org/energyml/data/commonv2}AbstractValueArray"/>
 *         <element name="CumulativeLength" type="{http://www.energistics.org/energyml/data/commonv2}AbstractIntegerArray"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JaggedArray", propOrder = {
    "elements",
    "cumulativeLength"
})
public class JaggedArray {

    @XmlElement(name = "Elements", required = true)
    protected AbstractValueArray elements;
    @XmlElement(name = "CumulativeLength", required = true)
    protected AbstractIntegerArray cumulativeLength;

    /**
     * Gets the value of the elements property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractValueArray }
     *     
     */
    public AbstractValueArray getElements() {
        return elements;
    }

    /**
     * Sets the value of the elements property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractValueArray }
     *     
     */
    public void setElements(AbstractValueArray value) {
        this.elements = value;
    }

    /**
     * Gets the value of the cumulativeLength property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractIntegerArray }
     *     
     */
    public AbstractIntegerArray getCumulativeLength() {
        return cumulativeLength;
    }

    /**
     * Sets the value of the cumulativeLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractIntegerArray }
     *     
     */
    public void setCumulativeLength(AbstractIntegerArray value) {
        this.cumulativeLength = value;
    }

}
