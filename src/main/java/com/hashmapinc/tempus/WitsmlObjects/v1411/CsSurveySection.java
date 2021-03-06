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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Survey Section Component Schema 
 * 
 * <p>Java class for cs_surveySection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_surveySection">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sequence" type="{http://www.witsml.org/schemas/1series}positiveCount"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/1series}nameString" minOccurs="0"/>
 *         <element name="mdStart" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord"/>
 *         <element name="mdEnd" type="{http://www.witsml.org/schemas/1series}measuredDepthCoord"/>
 *         <element name="nameSurveyCompany" type="{http://www.witsml.org/schemas/1series}nameString"/>
 *         <element name="nameTool" type="{http://www.witsml.org/schemas/1series}nameString"/>
 *         <element name="typeTool" type="{http://www.witsml.org/schemas/1series}nameString"/>
 *         <element name="modelError" type="{http://www.witsml.org/schemas/1series}nameString" minOccurs="0"/>
 *         <element name="overwrite" type="{http://www.witsml.org/schemas/1series}logicalBoolean" minOccurs="0"/>
 *         <element name="frequencyMx" type="{http://www.witsml.org/schemas/1series}lengthMeasure" minOccurs="0"/>
 *         <element name="itemState" type="{http://www.witsml.org/schemas/1series}ItemState" minOccurs="0"/>
 *         <element name="comments" type="{http://www.witsml.org/schemas/1series}commentString" minOccurs="0"/>
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
@XmlType(name = "cs_surveySection", propOrder = {
    "sequence",
    "name",
    "mdStart",
    "mdEnd",
    "nameSurveyCompany",
    "nameTool",
    "typeTool",
    "modelError",
    "overwrite",
    "frequencyMx",
    "itemState",
    "comments",
    "extensionNameValue"
})
public class CsSurveySection {

    protected short sequence;
    protected String name;
    @XmlElement(required = true)
    protected MeasuredDepthCoord mdStart;
    @XmlElement(required = true)
    protected MeasuredDepthCoord mdEnd;
    @XmlElement(required = true)
    protected String nameSurveyCompany;
    @XmlElement(required = true)
    protected String nameTool;
    @XmlElement(required = true)
    protected String typeTool;
    protected String modelError;
    protected Boolean overwrite;
    protected LengthMeasure frequencyMx;
    @XmlSchemaType(name = "string")
    protected String itemState;
    protected String comments;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the sequence property.
     * 
     */
    public short getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(short value) {
        this.sequence = value;
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
     * Gets the value of the mdStart property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdStart() {
        return mdStart;
    }

    /**
     * Sets the value of the mdStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdStart(MeasuredDepthCoord value) {
        this.mdStart = value;
    }

    /**
     * Gets the value of the mdEnd property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdEnd() {
        return mdEnd;
    }

    /**
     * Sets the value of the mdEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdEnd(MeasuredDepthCoord value) {
        this.mdEnd = value;
    }

    /**
     * Gets the value of the nameSurveyCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSurveyCompany() {
        return nameSurveyCompany;
    }

    /**
     * Sets the value of the nameSurveyCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSurveyCompany(String value) {
        this.nameSurveyCompany = value;
    }

    /**
     * Gets the value of the nameTool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTool() {
        return nameTool;
    }

    /**
     * Sets the value of the nameTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTool(String value) {
        this.nameTool = value;
    }

    /**
     * Gets the value of the typeTool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeTool() {
        return typeTool;
    }

    /**
     * Sets the value of the typeTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeTool(String value) {
        this.typeTool = value;
    }

    /**
     * Gets the value of the modelError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelError() {
        return modelError;
    }

    /**
     * Sets the value of the modelError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelError(String value) {
        this.modelError = value;
    }

    /**
     * Gets the value of the overwrite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverwrite() {
        return overwrite;
    }

    /**
     * Sets the value of the overwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverwrite(Boolean value) {
        this.overwrite = value;
    }

    /**
     * Gets the value of the frequencyMx property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getFrequencyMx() {
        return frequencyMx;
    }

    /**
     * Sets the value of the frequencyMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setFrequencyMx(LengthMeasure value) {
        this.frequencyMx = value;
    }

    /**
     * Gets the value of the itemState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemState() {
        return itemState;
    }

    /**
     * Sets the value of the itemState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemState(String value) {
        this.itemState = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
