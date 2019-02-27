


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Parameter containing a Double value.
 * 
 * <p>Java class for DoubleQuantityParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="DoubleQuantityParameter">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractActivityParameter">
 *       <sequence>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="Uom" type="{http://www.energistics.org/energyml/data/commonv2}UnitOfMeasureExt"/>
 *         <element name="CustomUnitDictionary" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoubleQuantityParameter", propOrder = {
    "value",
    "uom",
    "customUnitDictionary"
})
public class DoubleQuantityParameter
    extends AbstractActivityParameter
{

    @XmlElement(name = "Value")
    protected Double value;
    @XmlElement(name = "Uom", required = true)
    protected String uom;
    @XmlElement(name = "CustomUnitDictionary")
    protected DataObjectReference customUnitDictionary;

    /**
     * Gets the value of the value property.
     * 
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the customUnitDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getCustomUnitDictionary() {
        return customUnitDictionary;
    }

    /**
     * Sets the value of the customUnitDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setCustomUnitDictionary(DataObjectReference value) {
        this.customUnitDictionary = value;
    }

}
