


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to store explicit string values, i.e., values that are not Double, boolean or integers. The datatype of the values will be identified by means of the HDF5 API.
 * 
 * <p>Java class for StringExternalArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="StringExternalArray">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractStringArray">
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
@XmlType(name = "StringExternalArray", propOrder = {
    "values"
})
public class StringExternalArray
    extends AbstractStringArray
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
