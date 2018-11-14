


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Array of Boolean values provided explicitly by an HDF5 dataset.
 * 
 * <p>Java class for BooleanExternalArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="BooleanExternalArray">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractBooleanArray">
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
@XmlType(name = "BooleanExternalArray", propOrder = {
    "values"
})
public class BooleanExternalArray
    extends AbstractBooleanArray
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
