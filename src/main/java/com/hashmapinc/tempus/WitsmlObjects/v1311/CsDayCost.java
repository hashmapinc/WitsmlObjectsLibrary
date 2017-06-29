package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Day Cost Component Schema 
 * 
 * <p>Java class for cs_dayCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_dayCost">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="numAFE" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="costGroup" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="costClass" type="{http://www.witsml.org/schemas/131}str16"/>
 *         <element name="costCode" type="{http://www.witsml.org/schemas/131}str16"/>
 *         <element name="costSubCode" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="costItemDescription" type="{http://www.witsml.org/schemas/131}shortDescriptionString" minOccurs="0"/>
 *         <element name="costPerItem" type="{http://www.witsml.org/schemas/131}cost" minOccurs="0"/>
 *         <element name="itemKind" type="{http://www.witsml.org/schemas/131}uomString" minOccurs="0"/>
 *         <element name="itemSize" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="qtyItem" type="{http://www.witsml.org/schemas/131}positiveCount" minOccurs="0"/>
 *         <element name="costAmount" type="{http://www.witsml.org/schemas/131}cost"/>
 *         <element name="numInvoice" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="numPO" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="numTicket" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="isCarryOver" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="isRental" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="nameTag" type="{http://www.witsml.org/schemas/131}cs_nameTag" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="numSerial" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="nameVendor" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="numVendor" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="pool" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="estimated" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
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
@XmlType(name = "cs_dayCost", propOrder = {
    "numAFE",
    "costGroup",
    "costClass",
    "costCode",
    "costSubCode",
    "costItemDescription",
    "costPerItem",
    "itemKind",
    "itemSize",
    "qtyItem",
    "costAmount",
    "numInvoice",
    "numPO",
    "numTicket",
    "isCarryOver",
    "isRental",
    "nameTag",
    "numSerial",
    "nameVendor",
    "numVendor",
    "pool",
    "estimated"
})
public class CsDayCost {

    protected String numAFE;
    protected String costGroup;
    @XmlElement(required = true)
    protected String costClass;
    @XmlElement(required = true)
    protected String costCode;
    protected String costSubCode;
    protected String costItemDescription;
    protected Cost costPerItem;
    protected String itemKind;
    protected Double itemSize;
    protected Short qtyItem;
    @XmlElement(required = true)
    protected Cost costAmount;
    protected String numInvoice;
    protected String numPO;
    protected String numTicket;
    protected Boolean isCarryOver;
    protected Boolean isRental;
    protected List<CsNameTag> nameTag;
    protected String numSerial;
    protected String nameVendor;
    protected String numVendor;
    protected String pool;
    protected Boolean estimated;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the numAFE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAFE() {
        return numAFE;
    }

    /**
     * Sets the value of the numAFE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAFE(String value) {
        this.numAFE = value;
    }

    /**
     * Gets the value of the costGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostGroup() {
        return costGroup;
    }

    /**
     * Sets the value of the costGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostGroup(String value) {
        this.costGroup = value;
    }

    /**
     * Gets the value of the costClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostClass() {
        return costClass;
    }

    /**
     * Sets the value of the costClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostClass(String value) {
        this.costClass = value;
    }

    /**
     * Gets the value of the costCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCode() {
        return costCode;
    }

    /**
     * Sets the value of the costCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCode(String value) {
        this.costCode = value;
    }

    /**
     * Gets the value of the costSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostSubCode() {
        return costSubCode;
    }

    /**
     * Sets the value of the costSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostSubCode(String value) {
        this.costSubCode = value;
    }

    /**
     * Gets the value of the costItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostItemDescription() {
        return costItemDescription;
    }

    /**
     * Sets the value of the costItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostItemDescription(String value) {
        this.costItemDescription = value;
    }

    /**
     * Gets the value of the costPerItem property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getCostPerItem() {
        return costPerItem;
    }

    /**
     * Sets the value of the costPerItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setCostPerItem(Cost value) {
        this.costPerItem = value;
    }

    /**
     * Gets the value of the itemKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemKind() {
        return itemKind;
    }

    /**
     * Sets the value of the itemKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemKind(String value) {
        this.itemKind = value;
    }

    /**
     * Gets the value of the itemSize property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getItemSize() {
        return itemSize;
    }

    /**
     * Sets the value of the itemSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setItemSize(Double value) {
        this.itemSize = value;
    }

    /**
     * Gets the value of the qtyItem property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getQtyItem() {
        return qtyItem;
    }

    /**
     * Sets the value of the qtyItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setQtyItem(Short value) {
        this.qtyItem = value;
    }

    /**
     * Gets the value of the costAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getCostAmount() {
        return costAmount;
    }

    /**
     * Sets the value of the costAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setCostAmount(Cost value) {
        this.costAmount = value;
    }

    /**
     * Gets the value of the numInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumInvoice() {
        return numInvoice;
    }

    /**
     * Sets the value of the numInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumInvoice(String value) {
        this.numInvoice = value;
    }

    /**
     * Gets the value of the numPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPO() {
        return numPO;
    }

    /**
     * Sets the value of the numPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPO(String value) {
        this.numPO = value;
    }

    /**
     * Gets the value of the numTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTicket() {
        return numTicket;
    }

    /**
     * Sets the value of the numTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTicket(String value) {
        this.numTicket = value;
    }

    /**
     * Gets the value of the isCarryOver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCarryOver() {
        return isCarryOver;
    }

    /**
     * Sets the value of the isCarryOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCarryOver(Boolean value) {
        this.isCarryOver = value;
    }

    /**
     * Gets the value of the isRental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRental() {
        return isRental;
    }

    /**
     * Sets the value of the isRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRental(Boolean value) {
        this.isRental = value;
    }

    /**
     * Gets the value of the nameTag property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameTag property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getNameTag().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsNameTag }
     * 
     * 
     */
    public List<CsNameTag> getNameTag() {
        if (nameTag == null) {
            nameTag = new ArrayList<CsNameTag>();
        }
        return this.nameTag;
    }

    /**
     * Gets the value of the numSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSerial() {
        return numSerial;
    }

    /**
     * Sets the value of the numSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSerial(String value) {
        this.numSerial = value;
    }

    /**
     * Gets the value of the nameVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameVendor() {
        return nameVendor;
    }

    /**
     * Sets the value of the nameVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameVendor(String value) {
        this.nameVendor = value;
    }

    /**
     * Gets the value of the numVendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumVendor() {
        return numVendor;
    }

    /**
     * Sets the value of the numVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumVendor(String value) {
        this.numVendor = value;
    }

    /**
     * Gets the value of the pool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPool(String value) {
        this.pool = value;
    }

    /**
     * Gets the value of the estimated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstimated() {
        return estimated;
    }

    /**
     * Sets the value of the estimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstimated(Boolean value) {
        this.estimated = value;
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
