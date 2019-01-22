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




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellCRS to1411CsWellCRS() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellCRS crs = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellCRS();

        // assign fields
        crs.setName(this.getName());
        crs.setDescription(this.getDescription());
        crs.setUid(this.getUid());

        // mapProjection
        if (null != this.getMapProjection())
            crs.setMapProjection(this.getMapProjection().to1411CsProjectionx());

        // geographic
        if (null != this.getGeographic()) {
            // nameCRS
            if (null != srcWellCRS.get(i).getGeographic().getNameCRS()) {
                assertEquals(srcWellCRS.get(i).getGeographic().getNameCRS().getValue(), destWellCRS.get(i).getGeographic().getNameCRS().getValue());
                assertEquals(srcWellCRS.get(i).getGeographic().getNameCRS().getNamingSystem(), destWellCRS.get(i).getGeographic().getNameCRS().getNamingSystem());
                assertEquals(srcWellCRS.get(i).getGeographic().getNameCRS().getCode(), destWellCRS.get(i).getGeographic().getNameCRS().getCode());
            }

            // geodeticDatumCode
            if (null != srcWellCRS.get(i).getGeographic().getGeodeticDatumCode())
                assertEquals(srcWellCRS.get(i).getGeographic().getGeodeticDatumCode().value(), destWellCRS.get(i).getGeographic().getGeodeticDatumCode().value());

            // xTranslation
            if (null != srcWellCRS.get(i).getGeographic().getXTranslation()) {
                assertEquals(srcWellCRS.get(i).getGeographic().getXTranslation().getUom(), destWellCRS.get(i).getGeographic().getXTranslation().getUom());
                assertEquals(srcWellCRS.get(i).getGeographic().getXTranslation().getValue(), destWellCRS.get(i).getGeographic().getXTranslation().getValue());
            }

            // yTranslation
            if (null != srcWellCRS.get(i).getGeographic().getYTranslation()) {
                assertEquals(srcWellCRS.get(i).getGeographic().getYTranslation().getUom(), destWellCRS.get(i).getGeographic().getYTranslation().getUom());
                assertEquals(srcWellCRS.get(i).getGeographic().getYTranslation().getValue(), destWellCRS.get(i).getGeographic().getYTranslation().getValue());
            }

            // zTranslation
            if (null != srcWellCRS.get(i).getGeographic().getZTranslation()) {
                assertEquals(srcWellCRS.get(i).getGeographic().getZTranslation().getUom(), destWellCRS.get(i).getGeographic().getZTranslation().getUom());
                assertEquals(srcWellCRS.get(i).getGeographic().getZTranslation().getValue(), destWellCRS.get(i).getGeographic().getZTranslation().getValue());
            }

            // xRotation
            if (null != srcWellCRS.get(i).getGeographic().getXRotation()) {
                assertEquals(srcWellCRS.get(i).getGeographic().getXRotation().getUom(), destWellCRS.get(i).getGeographic().getXRotation().getUom());
                assertEquals(srcWellCRS.get(i).getGeographic().getXRotation().getValue(), destWellCRS.get(i).getGeographic().getXRotation().getValue());
            }

            // yRotation
            if (null != srcWellCRS.get(i).getGeographic().getYRotation()) {
                assertEquals(srcWellCRS.get(i).getGeographic().getYRotation().getUom(), destWellCRS.get(i).getGeographic().getYRotation().getUom());
                assertEquals(srcWellCRS.get(i).getGeographic().getYRotation().getValue(), destWellCRS.get(i).getGeographic().getYRotation().getValue());
            }

            // zRotation
            if (null != srcWellCRS.get(i).getGeographic().getZRotation()) {
                assertEquals(srcWellCRS.get(i).getGeographic().getZRotation().getUom(), destWellCRS.get(i).getGeographic().getZRotation().getUom());
                assertEquals(srcWellCRS.get(i).getGeographic().getZRotation().getValue(), destWellCRS.get(i).getGeographic().getZRotation().getValue());
            }

            assertEquals(srcWellCRS.get(i).getGeographic().getScaleFactor(), destWellCRS.get(i).getGeographic().getScaleFactor());

            // ellipsoidCode
            if (null != srcWellCRS.get(i).getGeographic().getEllipsoidCode())
                assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidCode().value(), destWellCRS.get(i).getGeographic().getEllipsoidCode().value());

            // ellipsoidSemiMajorAxis
            if (null != srcWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis()) {
                assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getUom(), destWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getUom());
                assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getValue(), destWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getValue());
            }

            assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidInverseFlattening(), destWellCRS.get(i).getGeographic().getEllipsoidInverseFlattening());
        }

        // localCRS
        if (null != this.getLocalCRS()) {
            assertEquals(srcWellCRS.get(i).getLocalCRS().isUsesWellAsOrigin(), destWellCRS.get(i).getLocalCRS().isUsesWellAsOrigin());

            // origin
            if (null != srcWellCRS.get(i).getLocalCRS().getOrigin()) {
                assertEquals(srcWellCRS.get(i).getLocalCRS().getOrigin().getUidRef(), destWellCRS.get(i).getLocalCRS().getOrigin().getUidRef());
                assertEquals(srcWellCRS.get(i).getLocalCRS().getOrigin().getValue(), destWellCRS.get(i).getLocalCRS().getOrigin().getValue());
            }

            assertEquals(srcWellCRS.get(i).getLocalCRS().getOriginDescription(), destWellCRS.get(i).getLocalCRS().getOriginDescription());

            // yAxisAzimuth
            if (null != srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth()) {
                assertEquals(srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getUom(), destWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getUom());

                // northDirection
                if (null != srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getNorthDirection())
                    assertEquals(srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getNorthDirection().value(), destWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getNorthDirection().value());
            }

            assertEquals(srcWellCRS.get(i).getLocalCRS().getYAxisDescription(), destWellCRS.get(i).getLocalCRS().getYAxisDescription());
            assertEquals(srcWellCRS.get(i).getLocalCRS().isXRotationCounterClockwise(), destWellCRS.get(i).getLocalCRS().isXRotationCounterClockwise());
        }

        return crs;
    }
    //=========================================================================

}
