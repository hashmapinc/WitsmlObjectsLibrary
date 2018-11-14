


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents an array of integers based on an origin and a multi-dimensional offset. The offset is based on a linearization of a multi-dimensional offset.
 * 
 * If count(i) is the number of elements in the dimension i and offset(i) is the offset in the dimension i, then:
 * globalOffsetInNDimension = startValue+ ni*offset(n) + n_1i*count(n)*offset(n-1) + .... + 0i*count(n)*count(n-1)*....count(1)*offset(0)
 * 
 * <p>Java class for IntegerLatticeArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="IntegerLatticeArray">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractIntegerArray">
 *       <sequence>
 *         <element name="StartValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Offset" type="{http://www.energistics.org/energyml/data/commonv2}IntegerConstantArray" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegerLatticeArray", propOrder = {
    "startValue",
    "offset"
})
public class IntegerLatticeArray
    extends AbstractIntegerArray
{

    @XmlElement(name = "StartValue")
    protected long startValue;
    @XmlElement(name = "Offset", required = true)
    protected List<IntegerConstantArray> offset;

    /**
     * Gets the value of the startValue property.
     * 
     */
    public long getStartValue() {
        return startValue;
    }

    /**
     * Sets the value of the startValue property.
     * 
     */
    public void setStartValue(long value) {
        this.startValue = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegerConstantArray }
     * 
     * 
     */
    public List<IntegerConstantArray> getOffset() {
        if (offset == null) {
            offset = new ArrayList<IntegerConstantArray>();
        }
        return this.offset;
    }

}
