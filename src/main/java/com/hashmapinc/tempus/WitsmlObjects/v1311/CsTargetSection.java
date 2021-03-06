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
 * WITSML Element Types
 * 
 * <p>Java class for cs_targetSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_targetSection">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sectNumber" type="{http://www.witsml.org/schemas/131}positiveCount"/>
 *         <element name="typeTargetSectionScope" type="{http://www.witsml.org/schemas/131}TargetSectionScope"/>
 *         <element name="lenRadius" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="angleArc" type="{http://www.witsml.org/schemas/131}planeAngleMeasure" minOccurs="0"/>
 *         <element name="thickAbove" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="thickBelow" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="location" type="{http://www.witsml.org/schemas/131}cs_location" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "cs_targetSection", propOrder = {
    "sectNumber",
    "typeTargetSectionScope",
    "lenRadius",
    "angleArc",
    "thickAbove",
    "thickBelow",
    "location"
})
public class CsTargetSection {

    protected short sectNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String typeTargetSectionScope;
    protected LengthMeasure lenRadius;
    protected PlaneAngleMeasure angleArc;
    protected LengthMeasure thickAbove;
    protected LengthMeasure thickBelow;
    protected List<CsLocation> location;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the sectNumber property.
     * 
     */
    public short getSectNumber() {
        return sectNumber;
    }

    /**
     * Sets the value of the sectNumber property.
     * 
     */
    public void setSectNumber(short value) {
        this.sectNumber = value;
    }

    /**
     * Gets the value of the typeTargetSectionScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeTargetSectionScope() {
        return typeTargetSectionScope;
    }

    /**
     * Sets the value of the typeTargetSectionScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeTargetSectionScope(String value) {
        this.typeTargetSectionScope = value;
    }

    /**
     * Gets the value of the lenRadius property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenRadius() {
        return lenRadius;
    }

    /**
     * Sets the value of the lenRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenRadius(LengthMeasure value) {
        this.lenRadius = value;
    }

    /**
     * Gets the value of the angleArc property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getAngleArc() {
        return angleArc;
    }

    /**
     * Sets the value of the angleArc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setAngleArc(PlaneAngleMeasure value) {
        this.angleArc = value;
    }

    /**
     * Gets the value of the thickAbove property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getThickAbove() {
        return thickAbove;
    }

    /**
     * Sets the value of the thickAbove property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setThickAbove(LengthMeasure value) {
        this.thickAbove = value;
    }

    /**
     * Gets the value of the thickBelow property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getThickBelow() {
        return thickBelow;
    }

    /**
     * Sets the value of the thickBelow property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setThickBelow(LengthMeasure value) {
        this.thickBelow = value;
    }

    /**
     * Gets the value of the location property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getLocation().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsLocation }
     * 
     * 
     */
    public List<CsLocation> getLocation() {
        if (location == null) {
            location = new ArrayList<CsLocation>();
        }
        return this.location;
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
