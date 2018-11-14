


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An array of Boolean values defined by specifying explicitly which indices in the array are either true or false. This class is used to represent very sparse true or false data.
 * 
 * <p>Java class for BooleanArrayFromIndexArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="BooleanArrayFromIndexArray">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractBooleanArray">
 *       <sequence>
 *         <element name="Count" type="{http://www.energistics.org/energyml/data/commonv2}PositiveLong"/>
 *         <element name="Indices" type="{http://www.energistics.org/energyml/data/commonv2}AbstractIntegerArray"/>
 *         <element name="IndexIsTrue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanArrayFromIndexArray", propOrder = {
    "count",
    "indices",
    "indexIsTrue"
})
public class BooleanArrayFromIndexArray
    extends AbstractBooleanArray
{

    @XmlElement(name = "Count")
    protected long count;
    @XmlElement(name = "Indices", required = true)
    protected AbstractIntegerArray indices;
    @XmlElement(name = "IndexIsTrue")
    protected boolean indexIsTrue;

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
     * Gets the value of the indices property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractIntegerArray }
     *     
     */
    public AbstractIntegerArray getIndices() {
        return indices;
    }

    /**
     * Sets the value of the indices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractIntegerArray }
     *     
     */
    public void setIndices(AbstractIntegerArray value) {
        this.indices = value;
    }

    /**
     * Gets the value of the indexIsTrue property.
     * 
     */
    public boolean isIndexIsTrue() {
        return indexIsTrue;
    }

    /**
     * Sets the value of the indexIsTrue property.
     * 
     */
    public void setIndexIsTrue(boolean value) {
        this.indexIsTrue = value;
    }

}
