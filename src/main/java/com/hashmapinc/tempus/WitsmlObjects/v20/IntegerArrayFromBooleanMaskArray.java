


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * One-dimensional array of integer values obtained from the true elements of the Boolean mask.
 * 
 * <p>Java class for IntegerArrayFromBooleanMaskArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="IntegerArrayFromBooleanMaskArray">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractIntegerArray">
 *       <sequence>
 *         <element name="TotalIndexCount" type="{http://www.energistics.org/energyml/data/commonv2}PositiveLong"/>
 *         <element name="Mask" type="{http://www.energistics.org/energyml/data/commonv2}AbstractBooleanArray"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegerArrayFromBooleanMaskArray", propOrder = {
    "totalIndexCount",
    "mask"
})
public class IntegerArrayFromBooleanMaskArray
    extends AbstractIntegerArray
{

    @XmlElement(name = "TotalIndexCount")
    protected long totalIndexCount;
    @XmlElement(name = "Mask", required = true)
    protected AbstractBooleanArray mask;

    /**
     * Gets the value of the totalIndexCount property.
     * 
     */
    public long getTotalIndexCount() {
        return totalIndexCount;
    }

    /**
     * Sets the value of the totalIndexCount property.
     * 
     */
    public void setTotalIndexCount(long value) {
        this.totalIndexCount = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractBooleanArray }
     *     
     */
    public AbstractBooleanArray getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractBooleanArray }
     *     
     */
    public void setMask(AbstractBooleanArray value) {
        this.mask = value;
    }

}
