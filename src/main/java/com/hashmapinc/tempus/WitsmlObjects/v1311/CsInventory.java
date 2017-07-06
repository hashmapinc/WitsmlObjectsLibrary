package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Inventory Component Schema 
 * 
 * <p>Java class for cs_inventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_inventory">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}str32"/>
 *         <choice>
 *           <element name="itemWtPerUnit" type="{http://www.witsml.org/schemas/131}massMeasure" minOccurs="0"/>
 *           <element name="itemVolPerUnit" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         </choice>
 *         <element name="pricePerUnit" type="{http://www.witsml.org/schemas/131}cost" minOccurs="0"/>
 *         <element name="qtyStart" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="qtyAdjustment" type="{http://www.witsml.org/schemas/131}integerCount" minOccurs="0"/>
 *         <element name="qtyReceived" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="qtyReturned" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="qtyUsed" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="costItem" type="{http://www.witsml.org/schemas/131}cost" minOccurs="0"/>
 *         <element name="qtyOnLocation" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
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
@XmlType(name = "cs_inventory", propOrder = {
    "name",
    "itemWtPerUnit",
    "itemVolPerUnit",
    "pricePerUnit",
    "qtyStart",
    "qtyAdjustment",
    "qtyReceived",
    "qtyReturned",
    "qtyUsed",
    "costItem",
    "qtyOnLocation"
})
public class CsInventory {

    @XmlElement(required = true)
    protected String name;
    protected MassMeasure itemWtPerUnit;
    protected VolumeMeasure itemVolPerUnit;
    protected Cost pricePerUnit;
    protected Short qtyStart;
    protected Integer qtyAdjustment;
    protected Short qtyReceived;
    protected Short qtyReturned;
    protected Short qtyUsed;
    protected Cost costItem;
    protected Short qtyOnLocation;
    @XmlAttribute(name = "uid")
    protected String uid;

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
     * Gets the value of the itemWtPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link MassMeasure }
     *     
     */
    public MassMeasure getItemWtPerUnit() {
        return itemWtPerUnit;
    }

    /**
     * Sets the value of the itemWtPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassMeasure }
     *     
     */
    public void setItemWtPerUnit(MassMeasure value) {
        this.itemWtPerUnit = value;
    }

    /**
     * Gets the value of the itemVolPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getItemVolPerUnit() {
        return itemVolPerUnit;
    }

    /**
     * Sets the value of the itemVolPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setItemVolPerUnit(VolumeMeasure value) {
        this.itemVolPerUnit = value;
    }

    /**
     * Gets the value of the pricePerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * Sets the value of the pricePerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setPricePerUnit(Cost value) {
        this.pricePerUnit = value;
    }

    /**
     * Gets the value of the qtyStart property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQtyStart() {
        return qtyStart;
    }

    /**
     * Sets the value of the qtyStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQtyStart(Short value) {
        this.qtyStart = value;
    }

    /**
     * Gets the value of the qtyAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtyAdjustment() {
        return qtyAdjustment;
    }

    /**
     * Sets the value of the qtyAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtyAdjustment(Integer value) {
        this.qtyAdjustment = value;
    }

    /**
     * Gets the value of the qtyReceived property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQtyReceived() {
        return qtyReceived;
    }

    /**
     * Sets the value of the qtyReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQtyReceived(Short value) {
        this.qtyReceived = value;
    }

    /**
     * Gets the value of the qtyReturned property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQtyReturned() {
        return qtyReturned;
    }

    /**
     * Sets the value of the qtyReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQtyReturned(Short value) {
        this.qtyReturned = value;
    }

    /**
     * Gets the value of the qtyUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQtyUsed() {
        return qtyUsed;
    }

    /**
     * Sets the value of the qtyUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQtyUsed(Short value) {
        this.qtyUsed = value;
    }

    /**
     * Gets the value of the costItem property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getCostItem() {
        return costItem;
    }

    /**
     * Sets the value of the costItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setCostItem(Cost value) {
        this.costItem = value;
    }

    /**
     * Gets the value of the qtyOnLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQtyOnLocation() {
        return qtyOnLocation;
    }

    /**
     * Sets the value of the qtyOnLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQtyOnLocation(Short value) {
        this.qtyOnLocation = value;
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
