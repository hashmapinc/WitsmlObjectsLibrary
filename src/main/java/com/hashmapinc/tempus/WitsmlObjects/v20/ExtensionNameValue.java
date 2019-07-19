


package com.hashmapinc.tempus.WitsmlObjects.v20;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Extension values Schema. The intent is to allow standard WITSML "named" 
 * extensions without having to modify the schema. A client or server can ignore any name that it 
 * does not recognize but certain meta data is required in order to allow 
 * generic clients or servers to process the value.
 * 
 * <p>Java class for ExtensionNameValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ExtensionNameValue">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="Value" type="{http://www.energistics.org/energyml/data/commonv2}StringMeasure"/>
 *         <element name="MeasureClass" type="{http://www.energistics.org/energyml/data/commonv2}MeasureClass" minOccurs="0"/>
 *         <element name="DTim" type="{http://www.energistics.org/energyml/data/commonv2}TimeStamp" minOccurs="0"/>
 *         <element name="Index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Description" type="{http://www.energistics.org/energyml/data/commonv2}String2000" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionNameValue", propOrder = {
    "name",
    "value",
    "measureClass",
    "dTim",
    "index",
    "description"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtensionNameValue {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Value", required = true)
    protected StringMeasure value;
    @XmlElement(name = "MeasureClass")
    @XmlSchemaType(name = "string")
    protected String measureClass;
    @XmlElement(name = "DTim")
    protected String dTim;
    @XmlElement(name = "Index")
    protected Long index;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link StringMeasure }
     *     
     */
    public StringMeasure getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMeasure }
     *     
     */
    public void setValue(StringMeasure value) {
        this.value = value;
    }

    /**
     * Gets the value of the measureClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureClass() {
        return measureClass;
    }

    /**
     * Sets the value of the measureClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureClass(String value) {
        this.measureClass = value;
    }

    /**
     * Gets the value of the dTim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTim() {
        return dTim;
    }

    /**
     * Sets the value of the dTim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTim(String value) {
        this.dTim = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Long getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Long value) {
        this.index = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
