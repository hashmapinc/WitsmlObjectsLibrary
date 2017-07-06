package com.hashmapinc.tempus.WitsmlObjects.v1311;

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
 *         <element name="pit" type="{http://www.witsml.org/schemas/131}refPositiveCount"/>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="volPit" type="{http://www.witsml.org/schemas/131}volumeMeasure"/>
 *         <element name="densFluid" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="descFluid" type="{http://www.witsml.org/schemas/131}shortDescriptionString" minOccurs="0"/>
 *         <element name="visFunnel" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
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
@XmlType(name = "cs_pitVolume", propOrder = {
    "pit",
    "dTim",
    "volPit",
    "densFluid",
    "descFluid",
    "visFunnel"
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
