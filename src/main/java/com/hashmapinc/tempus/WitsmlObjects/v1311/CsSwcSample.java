package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Sidewall Core Sample Component Schema
 * 
 * <p>Java class for cs_swcSample complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_swcSample">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="md" type="{http://www.witsml.org/schemas/131}measuredDepthCoord"/>
 *         <element name="lithology" type="{http://www.witsml.org/schemas/131}cs_lithology" minOccurs="0"/>
 *         <element name="show" type="{http://www.witsml.org/schemas/131}cs_show" minOccurs="0"/>
 *         <element name="nameFormation" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="comments" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
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
@XmlType(name = "cs_swcSample", propOrder = {
    "md",
    "lithology",
    "show",
    "nameFormation",
    "comments"
})
public class CsSwcSample {

    @XmlElement(required = true)
    protected MeasuredDepthCoord md;
    protected CsLithology lithology;
    protected CsShow show;
    protected String nameFormation;
    protected String comments;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the md property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMd() {
        return md;
    }

    /**
     * Sets the value of the md property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMd(MeasuredDepthCoord value) {
        this.md = value;
    }

    /**
     * Gets the value of the lithology property.
     * 
     * @return
     *     possible object is
     *     {@link CsLithology }
     *     
     */
    public CsLithology getLithology() {
        return lithology;
    }

    /**
     * Sets the value of the lithology property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsLithology }
     *     
     */
    public void setLithology(CsLithology value) {
        this.lithology = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link CsShow }
     *     
     */
    public CsShow getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsShow }
     *     
     */
    public void setShow(CsShow value) {
        this.show = value;
    }

    /**
     * Gets the value of the nameFormation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFormation() {
        return nameFormation;
    }

    /**
     * Sets the value of the nameFormation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFormation(String value) {
        this.nameFormation = value;
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
