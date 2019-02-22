


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of one parameter that participate in one type of activity.
 * 
 * <p>Java class for ParameterTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ParameterTemplate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AllowedKind" type="{http://www.energistics.org/energyml/data/commonv2}String" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IsInput" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="KeyConstraint" type="{http://www.energistics.org/energyml/data/commonv2}String2000" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IsOutput" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Title" type="{http://www.energistics.org/energyml/data/commonv2}String2000"/>
 *         <element name="DataObjectContentType" type="{http://www.energistics.org/energyml/data/commonv2}String2000" minOccurs="0"/>
 *         <element name="MaxOccurs" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="MinOccurs" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="Constraint" type="{http://www.energistics.org/energyml/data/commonv2}String2000" minOccurs="0"/>
 *         <element name="DefaultValue" type="{http://www.energistics.org/energyml/data/commonv2}AbstractActivityParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterTemplate", propOrder = {
    "allowedKind",
    "isInput",
    "keyConstraint",
    "isOutput",
    "title",
    "dataObjectContentType",
    "maxOccurs",
    "minOccurs",
    "constraint",
    "defaultValue"
})
public class ParameterTemplate {

    @XmlElement(name = "AllowedKind")
    @XmlSchemaType(name = "string")
    protected List<String> allowedKind;
    @XmlElement(name = "IsInput")
    protected boolean isInput;
    @XmlElement(name = "KeyConstraint")
    protected List<String> keyConstraint;
    @XmlElement(name = "IsOutput")
    protected boolean isOutput;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "DataObjectContentType")
    protected String dataObjectContentType;
    @XmlElement(name = "MaxOccurs")
    protected long maxOccurs;
    @XmlElement(name = "MinOccurs")
    protected long minOccurs;
    @XmlElement(name = "Constraint")
    protected String constraint;
    @XmlElement(name = "DefaultValue")
    protected List<AbstractActivityParameter> defaultValue;

    /**
     * Gets the value of the allowedKind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedKind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedKind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllowedKind() {
        if (allowedKind == null) {
            allowedKind = new ArrayList<String>();
        }
        return this.allowedKind;
    }

    /**
     * Gets the value of the isInput property.
     * 
     */
    public boolean isIsInput() {
        return isInput;
    }

    /**
     * Sets the value of the isInput property.
     * 
     */
    public void setIsInput(boolean value) {
        this.isInput = value;
    }

    /**
     * Gets the value of the keyConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeyConstraint() {
        if (keyConstraint == null) {
            keyConstraint = new ArrayList<String>();
        }
        return this.keyConstraint;
    }

    /**
     * Gets the value of the isOutput property.
     * 
     */
    public boolean isIsOutput() {
        return isOutput;
    }

    /**
     * Sets the value of the isOutput property.
     * 
     */
    public void setIsOutput(boolean value) {
        this.isOutput = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the dataObjectContentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataObjectContentType() {
        return dataObjectContentType;
    }

    /**
     * Sets the value of the dataObjectContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataObjectContentType(String value) {
        this.dataObjectContentType = value;
    }

    /**
     * Gets the value of the maxOccurs property.
     * 
     */
    public long getMaxOccurs() {
        return maxOccurs;
    }

    /**
     * Sets the value of the maxOccurs property.
     * 
     */
    public void setMaxOccurs(long value) {
        this.maxOccurs = value;
    }

    /**
     * Gets the value of the minOccurs property.
     * 
     */
    public long getMinOccurs() {
        return minOccurs;
    }

    /**
     * Sets the value of the minOccurs property.
     * 
     */
    public void setMinOccurs(long value) {
        this.minOccurs = value;
    }

    /**
     * Gets the value of the constraint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraint() {
        return constraint;
    }

    /**
     * Sets the value of the constraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraint(String value) {
        this.constraint = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractActivityParameter }
     * 
     * 
     */
    public List<AbstractActivityParameter> getDefaultValue() {
        if (defaultValue == null) {
            defaultValue = new ArrayList<AbstractActivityParameter>();
        }
        return this.defaultValue;
    }

}
