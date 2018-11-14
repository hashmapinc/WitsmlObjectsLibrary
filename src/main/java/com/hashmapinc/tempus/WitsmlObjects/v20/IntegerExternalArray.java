


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Array of integer values provided explicitly by an HDF5 dataset. The null value must be  explicitly provided in the NullValue attribute of this class.
 * 
 * <p>Java class for IntegerExternalArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="IntegerExternalArray">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractIntegerArray">
 *       <sequence>
 *         <element name="NullValue" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "IntegerExternalArray", propOrder = {
    "nullValue",
    "values"
})
public class IntegerExternalArray
    extends AbstractIntegerArray
{

    @XmlElement(name = "NullValue")
    protected long nullValue;
    @XmlElement(name = "Values", required = true)
    protected ExternalDataset values;

    /**
     * Gets the value of the nullValue property.
     * 
     */
    public long getNullValue() {
        return nullValue;
    }

    /**
     * Sets the value of the nullValue property.
     * 
     */
    public void setNullValue(long value) {
        this.nullValue = value;
    }

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
