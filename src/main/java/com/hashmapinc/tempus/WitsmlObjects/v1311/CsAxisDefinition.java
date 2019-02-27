package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * Metadata by which the array structure of a compound value is defined.
 * 			This defines one axis of an array. 
 * 			
 * 
 * <p>Java class for cs_axisDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_axisDefinition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="order" type="{http://www.witsml.org/schemas/131}positiveCount"/>
 *         <element name="count" type="{http://www.witsml.org/schemas/131}positiveCount"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="propertyType" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="uom" type="{http://www.witsml.org/schemas/131}uomString" minOccurs="0"/>
 *         <choice>
 *           <element name="doubleValues" type="{http://www.witsml.org/schemas/131}listOfDouble" minOccurs="0"/>
 *           <element name="stringValues" type="{http://www.witsml.org/schemas/131}listOfString" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_axisDefinition", propOrder = {
    "order",
    "count",
    "name",
    "propertyType",
    "uom",
    "doubleValues",
    "stringValues"
})
public class CsAxisDefinition {

    protected short order;
    protected short count;
    protected String name;
    protected String propertyType;
    protected String uom;
    @XmlList
    @XmlElement(type = Double.class)
    protected List<Double> doubleValues;
    @XmlList
    protected List<String> stringValues;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the order property.
     *
     * @return the value of the order property
     */
    public short getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     *
     * @param value The to set Order to
     */
    public void setOrder(short value) {
        this.order = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public short getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(short value) {
        this.count = value;
    }

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
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyType(String value) {
        this.propertyType = value;
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
     * Gets the value of the doubleValues property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doubleValues property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getDoubleValues().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getDoubleValues() {
        if (doubleValues == null) {
            doubleValues = new ArrayList<Double>();
        }
        return this.doubleValues;
    }

    public void setDoubleValues(List<String> values) {
        this.doubleValues = new ArrayList<>();
        for (String value : values) {
            this.doubleValues.add(Double.parseDouble(value));
        }
    }

    /**
     * Gets the value of the stringValues property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringValues property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getStringValues().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStringValues() {
        if (stringValues == null) {
            stringValues = new ArrayList<String>();
        }
        return this.stringValues;
    }

    public void setStringValues(List<String> values) {
        this.stringValues = values;
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




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsAxisDefinition to1411CsAxisDefinition() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsAxisDefinition def = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsAxisDefinition();

        // assign fields
        def.setOrder(this.getOrder());
        def.setCount(this.getCount());
        def.setName(this.getName());
        def.setPropertyType(this.getPropertyType());
        def.setUom(this.getUom());
        def.setUid(this.getUid());
        def.setDoubleValues(this.getDoubleValues());
        def.setStringValues(this.getStringValues());

        return def;
    }
    //=========================================================================

}
