package com.hashmapinc.tempus.WitsmlObjects.v1311;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Well Coordinate Reference System Component Schema.
 * 			Note that this is intended for use with two dimensional coordinates. 
 * 			That does not prevent the use of a three dimensional CRS. It just means that
 * 			only two coordinates will be specified in that 3D system. The veritcal coordinates are
 * 			specified separately and, for 3D systems, one of the linked wellDatums should represent
 * 			the vertical datum of that 3D system so that the height in the 3d system can be determined. 
 * 
 * <p>Java class for cs_wellCRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_wellCRS">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <choice minOccurs="0">
 *           <element name="mapProjection" type="{http://www.witsml.org/schemas/131}cs_projectionx" minOccurs="0"/>
 *           <element name="geographic" type="{http://www.witsml.org/schemas/131}cs_geodeticModel" minOccurs="0"/>
 *           <element name="localCRS" type="{http://www.witsml.org/schemas/131}cs_localCRS" minOccurs="0"/>
 *         </choice>
 *         <element name="description" type="{http://www.witsml.org/schemas/131}descriptionString" minOccurs="0"/>
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
@XmlType(name = "cs_wellCRS", propOrder = {
    "name",
    "mapProjection",
    "geographic",
    "localCRS",
    "description"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CsWellCRS {

    @XmlElement(required = true)
    protected String name;
    protected CsProjectionx mapProjection;
    protected CsGeodeticModel geographic;
    protected CsLocalCRS localCRS;
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
     * Gets the value of the mapProjection property.
     * 
     * @return
     *     possible object is
     *     {@link CsProjectionx }
     *     
     */
    public CsProjectionx getMapProjection() {
        return mapProjection;
    }

    /**
     * Sets the value of the mapProjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsProjectionx }
     *     
     */
    public void setMapProjection(CsProjectionx value) {
        this.mapProjection = value;
    }

    /**
     * Gets the value of the geographic property.
     * 
     * @return
     *     possible object is
     *     {@link CsGeodeticModel }
     *     
     */
    public CsGeodeticModel getGeographic() {
        return geographic;
    }

    /**
     * Sets the value of the geographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsGeodeticModel }
     *     
     */
    public void setGeographic(CsGeodeticModel value) {
        this.geographic = value;
    }

    /**
     * Gets the value of the localCRS property.
     * 
     * @return
     *     possible object is
     *     {@link CsLocalCRS }
     *     
     */
    public CsLocalCRS getLocalCRS() {
        return localCRS;
    }

    /**
     * Sets the value of the localCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsLocalCRS }
     *     
     */
    public void setLocalCRS(CsLocalCRS value) {
        this.localCRS = value;
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
