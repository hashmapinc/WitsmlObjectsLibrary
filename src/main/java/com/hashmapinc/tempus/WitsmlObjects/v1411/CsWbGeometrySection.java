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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Wellbore Geometry Component Schema.
 * 			This defines the "fixed" components in a wellbore. 
 * 			It does not define the "transient" drilling strings or the "hanging" 
 * 			production components. 
 * 
 * <p>Java class for cs_wbGeometrySection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_wbGeometrySection">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="typeHoleCasing" type="{http://www.witsml.org/schemas/1series}HoleCasingType" minOccurs="0"/>
 *         <element name="mdTop" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="mdBottom" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord" minOccurs="0"/>
 *         <element name="tvdTop" type="{http://www.witsml.org/schemas/1series}wellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="tvdBottom" type="{http://www.witsml.org/schemas/1series}wellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="idSection" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="odSection" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="wtPerLen" type="{http://www.witsml.org/schemas/1series}massPerLengthMeasure" minOccurs="0"/>
 *         <element name="grade" type="{http://www.witsml.org/schemas/1series}str32" minOccurs="0"/>
 *         <element name="curveConductor" type="{http://www.witsml.org/schemas/1series}logicalBoolean" minOccurs="0"/>
 *         <element name="diaDrift" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="factFric" type="{http://www.witsml.org/schemas/1series}unitlessQuantity" minOccurs="0"/>
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
@XmlType(name = "cs_wbGeometrySection", propOrder = {
    "typeHoleCasing",
    "mdTop",
    "mdBottom",
    "tvdTop",
    "tvdBottom",
    "idSection",
    "odSection",
    "wtPerLen",
    "grade",
    "curveConductor",
    "diaDrift",
    "factFric",
    "extensionNameValue"
})
public class CsWbGeometrySection {

    @XmlSchemaType(name = "string")
    protected String typeHoleCasing;
    protected MeasuredDepthCoord mdTop;
    protected MeasuredDepthCoord mdBottom;
    protected WellVerticalDepthCoord tvdTop;
    protected WellVerticalDepthCoord tvdBottom;
    protected LengthMeasure idSection;
    protected LengthMeasure odSection;
    protected MassPerLengthMeasure wtPerLen;
    protected String grade;
    protected Boolean curveConductor;
    protected LengthMeasure diaDrift;
    protected Double factFric;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the typeHoleCasing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeHoleCasing() {
        return typeHoleCasing;
    }

    /**
     * Sets the value of the typeHoleCasing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeHoleCasing(String value) {
        this.typeHoleCasing = value;
    }

    /**
     * Gets the value of the mdTop property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdTop() {
        return mdTop;
    }

    /**
     * Sets the value of the mdTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdTop(MeasuredDepthCoord value) {
        this.mdTop = value;
    }

    /**
     * Gets the value of the mdBottom property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBottom() {
        return mdBottom;
    }

    /**
     * Sets the value of the mdBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBottom(MeasuredDepthCoord value) {
        this.mdBottom = value;
    }

    /**
     * Gets the value of the tvdTop property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdTop() {
        return tvdTop;
    }

    /**
     * Sets the value of the tvdTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdTop(WellVerticalDepthCoord value) {
        this.tvdTop = value;
    }

    /**
     * Gets the value of the tvdBottom property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdBottom() {
        return tvdBottom;
    }

    /**
     * Sets the value of the tvdBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdBottom(WellVerticalDepthCoord value) {
        this.tvdBottom = value;
    }

    /**
     * Gets the value of the idSection property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdSection() {
        return idSection;
    }

    /**
     * Sets the value of the idSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdSection(LengthMeasure value) {
        this.idSection = value;
    }

    /**
     * Gets the value of the odSection property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdSection() {
        return odSection;
    }

    /**
     * Sets the value of the odSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdSection(LengthMeasure value) {
        this.odSection = value;
    }

    /**
     * Gets the value of the wtPerLen property.
     * 
     * @return
     *     possible object is
     *     {@link MassPerLengthMeasure }
     *     
     */
    public MassPerLengthMeasure getWtPerLen() {
        return wtPerLen;
    }

    /**
     * Sets the value of the wtPerLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassPerLengthMeasure }
     *     
     */
    public void setWtPerLen(MassPerLengthMeasure value) {
        this.wtPerLen = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
    }

    /**
     * Gets the value of the curveConductor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurveConductor() {
        return curveConductor;
    }

    /**
     * Sets the value of the curveConductor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurveConductor(Boolean value) {
        this.curveConductor = value;
    }

    /**
     * Gets the value of the diaDrift property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaDrift() {
        return diaDrift;
    }

    /**
     * Sets the value of the diaDrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaDrift(LengthMeasure value) {
        this.diaDrift = value;
    }

    /**
     * Gets the value of the factFric property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFactFric() {
        return factFric;
    }

    /**
     * Sets the value of the factFric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFactFric(Double value) {
        this.factFric = value;
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
