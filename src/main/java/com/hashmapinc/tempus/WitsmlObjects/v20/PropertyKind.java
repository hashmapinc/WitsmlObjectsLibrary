


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Property kinds carry the semantics of property values. They are used to identify if the values are, for example, representing porosity, length, stress tensor, etc. Energistics provides a list of standard property kind that represent the basis for the commonly used properties in the E and P subsurface workflow.
 * 
 * <p>Java class for PropertyKind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="PropertyKind">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="IsAbstract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="DeprecationDate" type="{http://www.energistics.org/energyml/data/commonv2}TimeStamp" minOccurs="0"/>
 *         <element name="QuantityClass" type="{http://www.energistics.org/energyml/data/commonv2}QuantityClassKindExt"/>
 *         <element name="Parent" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyKind", propOrder = {
    "isAbstract",
    "deprecationDate",
    "quantityClass",
    "parent"
})
public class PropertyKind
    extends AbstractObject
{

    @XmlElement(name = "IsAbstract")
    protected boolean isAbstract;
    @XmlElement(name = "DeprecationDate")
    protected String deprecationDate;
    @XmlElement(name = "QuantityClass", required = true)
    protected String quantityClass;
    @XmlElement(name = "Parent")
    protected DataObjectReference parent;

    /**
     * Gets the value of the isAbstract property.
     * 
     */
    public boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * Sets the value of the isAbstract property.
     * 
     */
    public void setIsAbstract(boolean value) {
        this.isAbstract = value;
    }

    /**
     * Gets the value of the deprecationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeprecationDate() {
        return deprecationDate;
    }

    /**
     * Sets the value of the deprecationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeprecationDate(String value) {
        this.deprecationDate = value;
    }

    /**
     * Gets the value of the quantityClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityClass() {
        return quantityClass;
    }

    /**
     * Sets the value of the quantityClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityClass(String value) {
        this.quantityClass = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setParent(DataObjectReference value) {
        this.parent = value;
    }

}
