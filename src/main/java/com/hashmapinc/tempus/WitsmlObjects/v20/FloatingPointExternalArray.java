


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An array of Double values provided explicitly by an HDF5 dataset.
 * By convention, the null value is NaN.
 * 
 * <p>Java class for FloatingPointExternalArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="FloatingPointExternalArray">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractFloatingPointArray">
 *       <sequence>
 *         <element name="Values" type="{http://www.energistics.org/energyml/data/commonv2}ExternalDataset"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingPointExternalArray", propOrder = {
    "values"
})
@XmlSeeAlso({
    DoubleExternalArray.class,
    FloatExternalArray.class
})
public class FloatingPointExternalArray
    extends AbstractFloatingPointArray
{

    @XmlElement(name = "Values", required = true)
    protected ExternalDataset values;

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalDataset }
     *     
     */
    public ExternalDataset getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalDataset }
     *     
     */
    public void setValues(ExternalDataset value) {
        this.values = value;
    }

}
