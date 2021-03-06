//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Cement Additive Component Schema 
 * 
 * <p>Java class for cs_cementAdditive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_cementAdditive">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameAdd" type="{http://www.witsml.org/schemas/1series}str32"/>
 *         <element name="typeAdd" type="{http://www.witsml.org/schemas/1series}str32" minOccurs="0"/>
 *         <element name="formAdd" type="{http://www.witsml.org/schemas/1series}str16" minOccurs="0"/>
 *         <element name="densAdd" type="{http://www.witsml.org/schemas/1series}densityMeasure" minOccurs="0"/>
 *         <choice>
 *           <sequence>
 *             <element name="typeConc" type="{http://www.witsml.org/schemas/1series}str16"/>
 *             <element name="concentration" type="{http://www.witsml.org/schemas/1series}massConcentrationMeasure"/>
 *           </sequence>
 *           <element name="wtSack" type="{http://www.witsml.org/schemas/1series}massMeasure"/>
 *           <element name="volSack" type="{http://www.witsml.org/schemas/1series}volumeMeasure"/>
 *         </choice>
 *         <element name="additive" type="{http://www.witsml.org/schemas/1series}massMeasure"/>
 *         <element name="extensionNameValue" type="{http://www.witsml.org/schemas/1series}cs_extensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/1series}attgrp_uid"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_cementAdditive", propOrder = {
    "nameAdd",
    "typeAdd",
    "formAdd",
    "densAdd",
    "typeConc",
    "concentration",
    "wtSack",
    "volSack",
    "additive",
    "extensionNameValue"
})
public class CsCementAdditive {

    @XmlElement(required = true)
    protected String nameAdd;
    protected String typeAdd;
    protected String formAdd;
    protected DensityMeasure densAdd;
    protected String typeConc;
    protected MassConcentrationMeasure concentration;
    protected MassMeasure wtSack;
    protected VolumeMeasure volSack;
    @XmlElement(required = true)
    protected MassMeasure additive;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the nameAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAdd() {
        return nameAdd;
    }

    /**
     * Sets the value of the nameAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAdd(String value) {
        this.nameAdd = value;
    }

    /**
     * Gets the value of the typeAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeAdd() {
        return typeAdd;
    }

    /**
     * Sets the value of the typeAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeAdd(String value) {
        this.typeAdd = value;
    }

    /**
     * Gets the value of the formAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormAdd() {
        return formAdd;
    }

    /**
     * Sets the value of the formAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormAdd(String value) {
        this.formAdd = value;
    }

    /**
     * Gets the value of the densAdd property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensAdd() {
        return densAdd;
    }

    /**
     * Sets the value of the densAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensAdd(DensityMeasure value) {
        this.densAdd = value;
    }

    /**
     * Gets the value of the typeConc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeConc() {
        return typeConc;
    }

    /**
     * Sets the value of the typeConc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeConc(String value) {
        this.typeConc = value;
    }

    /**
     * Gets the value of the concentration property.
     * 
     * @return
     *     possible object is
     *     {@link MassConcentrationMeasure }
     *     
     */
    public MassConcentrationMeasure getConcentration() {
        return concentration;
    }

    /**
     * Sets the value of the concentration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassConcentrationMeasure }
     *     
     */
    public void setConcentration(MassConcentrationMeasure value) {
        this.concentration = value;
    }

    /**
     * Gets the value of the wtSack property.
     * 
     * @return
     *     possible object is
     *     {@link MassMeasure }
     *     
     */
    public MassMeasure getWtSack() {
        return wtSack;
    }

    /**
     * Sets the value of the wtSack property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassMeasure }
     *     
     */
    public void setWtSack(MassMeasure value) {
        this.wtSack = value;
    }

    /**
     * Gets the value of the volSack property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolSack() {
        return volSack;
    }

    /**
     * Sets the value of the volSack property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolSack(VolumeMeasure value) {
        this.volSack = value;
    }

    /**
     * Gets the value of the additive property.
     * 
     * @return
     *     possible object is
     *     {@link MassMeasure }
     *     
     */
    public MassMeasure getAdditive() {
        return additive;
    }

    /**
     * Sets the value of the additive property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassMeasure }
     *     
     */
    public void setAdditive(MassMeasure value) {
        this.additive = value;
    }

    /**
     * Gets the value of the extensionNameValue property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionNameValue property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getExtensionNameValue().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsExtensionNameValue }
     * 
     * 
     */
    public List<CsExtensionNameValue> getExtensionNameValue() {
        if (extensionNameValue == null) {
            extensionNameValue = new ArrayList<CsExtensionNameValue>();
        }
        return this.extensionNameValue;
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
