package com.hashmapinc.tempus.WitsmlObjects.v1311;

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
 *         <element name="nameAdd" type="{http://www.witsml.org/schemas/131}str32"/>
 *         <element name="typeAdd" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="formAdd" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="densAdd" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <choice>
 *           <sequence>
 *             <element name="typeConc" type="{http://www.witsml.org/schemas/131}str16"/>
 *             <element name="concentration" type="{http://www.witsml.org/schemas/131}massConcentrationMeasure"/>
 *           </sequence>
 *           <element name="wtSack" type="{http://www.witsml.org/schemas/131}massMeasure" minOccurs="0"/>
 *           <element name="volSack" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         </choice>
 *         <element name="additive" type="{http://www.witsml.org/schemas/131}massMeasure"/>
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
@XmlType(name = "cs_cementAdditive", propOrder = {
    "nameAdd",
    "typeAdd",
    "formAdd",
    "densAdd",
    "typeConc",
    "concentration",
    "wtSack",
    "volSack",
    "additive"
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
