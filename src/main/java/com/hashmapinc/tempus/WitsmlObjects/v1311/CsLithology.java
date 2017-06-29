package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Lithology Component Schema
 * 
 * <p>Java class for cs_lithology complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_lithology">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="type" type="{http://www.witsml.org/schemas/131}LithologyType" minOccurs="0"/>
 *         <element name="codeLith" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="lithPc" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasurePercent" minOccurs="0"/>
 *         <element name="description" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="lithClass" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="grainType" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="dunhamClass" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="color" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="texture" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="hardness" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="sizeGrain" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="roundness" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="sorting" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="matrixCement" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="porosityVisible" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="permeability" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="densShale" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="qualifier" type="{http://www.witsml.org/schemas/131}cs_qualifier" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cs_lithology", propOrder = {
    "type",
    "codeLith",
    "lithPc",
    "description",
    "lithClass",
    "grainType",
    "dunhamClass",
    "color",
    "texture",
    "hardness",
    "sizeGrain",
    "roundness",
    "sorting",
    "matrixCement",
    "porosityVisible",
    "permeability",
    "densShale",
    "qualifier"
})
public class CsLithology {

    protected String type;
    protected String codeLith;
    protected VolumePerVolumeMeasurePercent lithPc;
    protected String description;
    protected String lithClass;
    protected String grainType;
    protected String dunhamClass;
    protected String color;
    protected String texture;
    protected String hardness;
    protected String sizeGrain;
    protected String roundness;
    protected String sorting;
    protected String matrixCement;
    protected String porosityVisible;
    protected String permeability;
    protected DensityMeasure densShale;
    protected List<CsQualifier> qualifier;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the codeLith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeLith() {
        return codeLith;
    }

    /**
     * Sets the value of the codeLith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeLith(String value) {
        this.codeLith = value;
    }

    /**
     * Gets the value of the lithPc property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasurePercent }
     *     
     */
    public VolumePerVolumeMeasurePercent getLithPc() {
        return lithPc;
    }

    /**
     * Sets the value of the lithPc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasurePercent }
     *     
     */
    public void setLithPc(VolumePerVolumeMeasurePercent value) {
        this.lithPc = value;
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

    /**
     * Gets the value of the lithClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLithClass() {
        return lithClass;
    }

    /**
     * Sets the value of the lithClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLithClass(String value) {
        this.lithClass = value;
    }

    /**
     * Gets the value of the grainType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrainType() {
        return grainType;
    }

    /**
     * Sets the value of the grainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrainType(String value) {
        this.grainType = value;
    }

    /**
     * Gets the value of the dunhamClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunhamClass() {
        return dunhamClass;
    }

    /**
     * Sets the value of the dunhamClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunhamClass(String value) {
        this.dunhamClass = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the texture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexture() {
        return texture;
    }

    /**
     * Sets the value of the texture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexture(String value) {
        this.texture = value;
    }

    /**
     * Gets the value of the hardness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardness() {
        return hardness;
    }

    /**
     * Sets the value of the hardness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardness(String value) {
        this.hardness = value;
    }

    /**
     * Gets the value of the sizeGrain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeGrain() {
        return sizeGrain;
    }

    /**
     * Sets the value of the sizeGrain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeGrain(String value) {
        this.sizeGrain = value;
    }

    /**
     * Gets the value of the roundness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundness() {
        return roundness;
    }

    /**
     * Sets the value of the roundness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundness(String value) {
        this.roundness = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorting(String value) {
        this.sorting = value;
    }

    /**
     * Gets the value of the matrixCement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixCement() {
        return matrixCement;
    }

    /**
     * Sets the value of the matrixCement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixCement(String value) {
        this.matrixCement = value;
    }

    /**
     * Gets the value of the porosityVisible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorosityVisible() {
        return porosityVisible;
    }

    /**
     * Sets the value of the porosityVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorosityVisible(String value) {
        this.porosityVisible = value;
    }

    /**
     * Gets the value of the permeability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermeability() {
        return permeability;
    }

    /**
     * Sets the value of the permeability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermeability(String value) {
        this.permeability = value;
    }

    /**
     * Gets the value of the densShale property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensShale() {
        return densShale;
    }

    /**
     * Sets the value of the densShale property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensShale(DensityMeasure value) {
        this.densShale = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifier property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getQualifier().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsQualifier }
     * 
     * 
     */
    public List<CsQualifier> getQualifier() {
        if (qualifier == null) {
            qualifier = new ArrayList<CsQualifier>();
        }
        return this.qualifier;
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
