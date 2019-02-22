package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The optical fiber used for distributed temperature surveys
 * 
 * <p>Java class for cs_fiber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_fiber">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="mode" type="{http://www.witsml.org/schemas/131}FiberMode"/>
 *         <element name="type" type="{http://www.witsml.org/schemas/131}typeOptionalClassString" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="coating" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="jacket" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="coreDiameter" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="claddedDiameter" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="outsideDiameter" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="refractiveIndex" type="{http://www.witsml.org/schemas/131}cs_refractiveIndex" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="oneWayLoss" type="{http://www.witsml.org/schemas/131}cs_oneWayLoss" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="parameter" type="{http://www.witsml.org/schemas/131}indexedObject" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="spoolNumberTag" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="spoolLength" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="supplyDate" type="{http://www.witsml.org/schemas/131}anyDate" minOccurs="0"/>
 *         <element name="supplier" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="supplierModelNumber" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="factoryCalibration" type="{http://www.witsml.org/schemas/131}cs_calibration" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="installationHistory" type="{http://www.witsml.org/schemas/131}refNameString" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cs_fiber", propOrder = {
    "name",
    "mode",
    "type",
    "coating",
    "jacket",
    "coreDiameter",
    "claddedDiameter",
    "outsideDiameter",
    "refractiveIndex",
    "oneWayLoss",
    "parameter",
    "spoolNumberTag",
    "spoolLength",
    "supplyDate",
    "supplier",
    "supplierModelNumber",
    "factoryCalibration",
    "installationHistory"
})
public class CsFiber {

    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String mode;
    protected List<TypeOptionalClassString> type;
    protected String coating;
    protected String jacket;
    protected LengthMeasure coreDiameter;
    protected LengthMeasure claddedDiameter;
    protected LengthMeasure outsideDiameter;
    protected List<CsRefractiveIndex> refractiveIndex;
    protected List<CsOneWayLoss> oneWayLoss;
    protected List<IndexedObject> parameter;
    protected String spoolNumberTag;
    protected LengthMeasure spoolLength;
    protected String supplyDate;
    protected String supplier;
    protected String supplierModelNumber;
    protected List<CsCalibration> factoryCalibration;
    protected List<RefNameString> installationHistory;
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
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getType().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link TypeOptionalClassString }
     * 
     * 
     */
    public List<TypeOptionalClassString> getType() {
        if (type == null) {
            type = new ArrayList<TypeOptionalClassString>();
        }
        return this.type;
    }

    /**
     * Gets the value of the coating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoating() {
        return coating;
    }

    /**
     * Sets the value of the coating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoating(String value) {
        this.coating = value;
    }

    /**
     * Gets the value of the jacket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJacket() {
        return jacket;
    }

    /**
     * Sets the value of the jacket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJacket(String value) {
        this.jacket = value;
    }

    /**
     * Gets the value of the coreDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getCoreDiameter() {
        return coreDiameter;
    }

    /**
     * Sets the value of the coreDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setCoreDiameter(LengthMeasure value) {
        this.coreDiameter = value;
    }

    /**
     * Gets the value of the claddedDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getCladdedDiameter() {
        return claddedDiameter;
    }

    /**
     * Sets the value of the claddedDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setCladdedDiameter(LengthMeasure value) {
        this.claddedDiameter = value;
    }

    /**
     * Gets the value of the outsideDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOutsideDiameter() {
        return outsideDiameter;
    }

    /**
     * Sets the value of the outsideDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOutsideDiameter(LengthMeasure value) {
        this.outsideDiameter = value;
    }

    /**
     * Gets the value of the refractiveIndex property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refractiveIndex property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getRefractiveIndex().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsRefractiveIndex }
     * 
     * 
     */
    public List<CsRefractiveIndex> getRefractiveIndex() {
        if (refractiveIndex == null) {
            refractiveIndex = new ArrayList<CsRefractiveIndex>();
        }
        return this.refractiveIndex;
    }

    /**
     * Gets the value of the oneWayLoss property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oneWayLoss property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getOneWayLoss().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsOneWayLoss }
     * 
     * 
     */
    public List<CsOneWayLoss> getOneWayLoss() {
        if (oneWayLoss == null) {
            oneWayLoss = new ArrayList<CsOneWayLoss>();
        }
        return this.oneWayLoss;
    }

    /**
     * Gets the value of the parameter property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getParameter().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedObject }
     * 
     * 
     */
    public List<IndexedObject> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<IndexedObject>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the spoolNumberTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpoolNumberTag() {
        return spoolNumberTag;
    }

    /**
     * Sets the value of the spoolNumberTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpoolNumberTag(String value) {
        this.spoolNumberTag = value;
    }

    /**
     * Gets the value of the spoolLength property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getSpoolLength() {
        return spoolLength;
    }

    /**
     * Sets the value of the spoolLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setSpoolLength(LengthMeasure value) {
        this.spoolLength = value;
    }

    /**
     * Gets the value of the supplyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplyDate() {
        return supplyDate;
    }

    /**
     * Sets the value of the supplyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplyDate(String value) {
        this.supplyDate = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplier(String value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the supplierModelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierModelNumber() {
        return supplierModelNumber;
    }

    /**
     * Sets the value of the supplierModelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierModelNumber(String value) {
        this.supplierModelNumber = value;
    }

    /**
     * Gets the value of the factoryCalibration property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factoryCalibration property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getFactoryCalibration().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsCalibration }
     * 
     * 
     */
    public List<CsCalibration> getFactoryCalibration() {
        if (factoryCalibration == null) {
            factoryCalibration = new ArrayList<CsCalibration>();
        }
        return this.factoryCalibration;
    }

    /**
     * Gets the value of the installationHistory property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installationHistory property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getInstallationHistory().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link RefNameString }
     * 
     * 
     */
    public List<RefNameString> getInstallationHistory() {
        if (installationHistory == null) {
            installationHistory = new ArrayList<RefNameString>();
        }
        return this.installationHistory;
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
