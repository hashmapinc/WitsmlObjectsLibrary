package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A set of points recorded during the installation process. The information 
 * 			can include the length along the fiber, the measured depth, and a type of point.
 * 
 * <p>Java class for cs_singleInstalledPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_singleInstalledPoint">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="md" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="lengthAlongFiber" type="{http://www.witsml.org/schemas/131}lengthMeasure"/>
 *         <element name="type" type="{http://www.witsml.org/schemas/131}InstalledFiberPoint" minOccurs="0"/>
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
@XmlType(name = "cs_singleInstalledPoint", propOrder = {
    "md",
    "lengthAlongFiber",
    "type"
})
public class CsSingleInstalledPoint {

    protected MeasuredDepthCoord md;
    @XmlElement(required = true)
    protected LengthMeasure lengthAlongFiber;
    @XmlSchemaType(name = "string")
    protected InstalledFiberPoint type;
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
     * Gets the value of the lengthAlongFiber property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLengthAlongFiber() {
        return lengthAlongFiber;
    }

    /**
     * Sets the value of the lengthAlongFiber property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLengthAlongFiber(LengthMeasure value) {
        this.lengthAlongFiber = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link InstalledFiberPoint }
     *     
     */
    public InstalledFiberPoint getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledFiberPoint }
     *     
     */
    public void setType(InstalledFiberPoint value) {
        this.type = value;
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
