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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Pit Volume Component Schema
 * 
 * <p>Java class for cs_pitVolume complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_pitVolume">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="pit" type="{http://www.witsml.org/schemas/1series}refPositiveCount"/>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="volPit" type="{http://www.witsml.org/schemas/1series}volumeMeasure"/>
 *         <element name="densFluid" type="{http://www.witsml.org/schemas/1series}densityMeasure" minOccurs="0"/>
 *         <element name="descFluid" type="{http://www.witsml.org/schemas/1series}shortDescriptionString" minOccurs="0"/>
 *         <element name="visFunnel" type="{http://www.witsml.org/schemas/1series}timeMeasure" minOccurs="0"/>
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
@XmlType(name = "cs_pitVolume", propOrder = {
    "pit",
    "dTim",
    "volPit",
    "densFluid",
    "descFluid",
    "visFunnel",
    "extensionNameValue"
})
public class CsPitVolume {

    @XmlElement(required = true)
    protected RefPositiveCount pit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    @XmlElement(required = true)
    protected VolumeMeasure volPit;
    protected DensityMeasure densFluid;
    protected String descFluid;
    protected TimeMeasure visFunnel;
    protected List<CsExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the pit property.
     * 
     * @return
     *     possible object is
     *     {@link RefPositiveCount }
     *     
     */
    public RefPositiveCount getPit() {
        return pit;
    }

    /**
     * Sets the value of the pit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefPositiveCount }
     *     
     */
    public void setPit(RefPositiveCount value) {
        this.pit = value;
    }

    /**
     * Gets the value of the dTim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTim() {
        return dTim;
    }

    /**
     * Sets the value of the dTim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTim(XMLGregorianCalendar value) {
        this.dTim = value;
    }

    /**
     * Gets the value of the volPit property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolPit() {
        return volPit;
    }

    /**
     * Sets the value of the volPit property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolPit(VolumeMeasure value) {
        this.volPit = value;
    }

    /**
     * Gets the value of the densFluid property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensFluid() {
        return densFluid;
    }

    /**
     * Sets the value of the densFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensFluid(DensityMeasure value) {
        this.densFluid = value;
    }

    /**
     * Gets the value of the descFluid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescFluid() {
        return descFluid;
    }

    /**
     * Sets the value of the descFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescFluid(String value) {
        this.descFluid = value;
    }

    /**
     * Gets the value of the visFunnel property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getVisFunnel() {
        return visFunnel;
    }

    /**
     * Sets the value of the visFunnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setVisFunnel(TimeMeasure value) {
        this.visFunnel = value;
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
