package com.hashmapinc.tempus.WitsmlObjects.v1311;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Reference Point Component Schema.
 * 
 * <p>Java class for cs_referencePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_referencePoint">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="type" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="elevation" type="{http://www.witsml.org/schemas/131}wellElevationCoord" minOccurs="0"/>
 *         <element name="measuredDepth" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="location" type="{http://www.witsml.org/schemas/131}cs_location" maxOccurs="unbounded"/>
 *         <element name="description" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
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
@XmlType(name = "cs_referencePoint", propOrder = {
    "name",
    "type",
    "elevation",
    "measuredDepth",
    "location",
    "description"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CsReferencePoint {

    @XmlElement(required = true)
    protected String name;
    protected String type;
    protected WellElevationCoord elevation;
    protected MeasuredDepthCoord measuredDepth;
    @XmlElement(required = true)
    protected List<CsLocation> location;
    protected String description;
    @XmlAttribute(name = "uid")
    @JsonInclude(JsonInclude.Include.ALWAYS)
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
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link WellElevationCoord }
     *     
     */
    public WellElevationCoord getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellElevationCoord }
     *     
     */
    public void setElevation(WellElevationCoord value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the measuredDepth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMeasuredDepth() {
        return measuredDepth;
    }

    /**
     * Sets the value of the measuredDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMeasuredDepth(MeasuredDepthCoord value) {
        this.measuredDepth = value;
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
