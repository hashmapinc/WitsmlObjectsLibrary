


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The instantiation of an error term in an error model.The content of this element (a number) is the variance scaling factor of the term in the model.
 * 
 * <p>Java class for IscwsaErrorTermValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="IscwsaErrorTermValue">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Term" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="Prop" type="{http://www.energistics.org/energyml/data/witsmlv2}ErrorPropagationMode"/>
 *         <element name="Bias" type="{http://www.w3.org/2001/XMLSchema}Double" minOccurs="0"/>
 *         <element name="Comment" type="{http://www.energistics.org/energyml/data/commonv2}String2000" minOccurs="0"/>
 *         <element name="ExtensionNameValue" type="{http://www.energistics.org/energyml/data/commonv2}ExtensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Value" type="{http://www.energistics.org/energyml/data/witsmlv2}MeasureOrQuantity"/>
 *       </sequence>
 *       <attribute name="uid" use="required" type="{http://www.energistics.org/energyml/data/commonv2}String64" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscwsaErrorTermValue", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "term",
    "prop",
    "bias",
    "comment",
    "extensionNameValue",
    "value"
})
public class IscwsaErrorTermValue {

    @XmlElement(name = "Term", required = true)
    protected String term;
    @XmlElement(name = "Prop", required = true)
    @XmlSchemaType(name = "string")
    protected String prop;
    @XmlElement(name = "Bias")
    protected Double bias;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ExtensionNameValue")
    protected List<ExtensionNameValue> extensionNameValue;
    @XmlElement(name = "Value", required = true)
    protected MeasureOrQuantity value;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the prop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProp() {
        return prop;
    }

    /**
     * Sets the value of the prop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProp(String value) {
        this.prop = value;
    }

    /**
     * Gets the value of the bias property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBias() {
        return bias;
    }

    /**
     * Sets the value of the bias property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBias(Double value) {
        this.bias = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the extensionNameValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionNameValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionNameValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionNameValue }
     * 
     * 
     */
    public List<ExtensionNameValue> getExtensionNameValue() {
        if (extensionNameValue == null) {
            extensionNameValue = new ArrayList<ExtensionNameValue>();
        }
        return this.extensionNameValue;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureOrQuantity }
     *     
     */
    public MeasureOrQuantity getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureOrQuantity }
     *     
     */
    public void setValue(MeasureOrQuantity value) {
        this.value = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
