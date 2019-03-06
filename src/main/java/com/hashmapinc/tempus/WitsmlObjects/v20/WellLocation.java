


package com.hashmapinc.tempus.WitsmlObjects.v20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hashmapinc.tempus.WitsmlObjects.v1411.RefNameString;
import com.hashmapinc.tempus.WitsmlObjects.v20.*;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Location Schema. This is a location that is expressed in terms of 2D coordinates. So that the location can be understood, the coordinate reference system (CRS) must be known. The survey location is given by a pair of tagged values. The pairs may be: (1) latitude/longitude, (2) easting/northing, (3) westing/southing, (4) projectedX/projectedY, or (5) localX/localY. The appropriate pair must be chosen for the data.
 * 
 * <p>Java class for AbstractWellLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractWellLocation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Original" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Description" type="{http://www.energistics.org/energyml/data/commonv2}String2000" minOccurs="0"/>
 *         <element name="ExtensionNameValue" type="{http://www.energistics.org/energyml/data/commonv2}ExtensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="uid" use="required" type="{http://www.energistics.org/energyml/data/commonv2}String64" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WellLocation {

    @XmlElement(name = "Original")
    protected Boolean original;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ExtensionNameValue")
    protected List<ExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;
    @XmlElement(name = "Coordinate1")
    protected Double coordinate1;
    @XmlElement(name = "Coordinate2")
    protected Double coordinate2;
    @XmlElement(name = "Crs", required = true)
    protected RefNameString crs;
    @XmlElement(name = "Latitude", required = true)
    protected PlaneAngleMeasure latitude;
    @XmlElement(name = "Longitude", required = true)
    protected PlaneAngleMeasure longitude;

    /**
     * Gets the value of the original property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginal() {
        return original;
    }

    /**
     * Sets the value of the original property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginal(Boolean value) {
        this.original = value;
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
     * Gets the value of the extensionNameValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionNameValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionNameValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionNameValue }
     * 
     * 
     */
    public List<ExtensionNameValue> getExtensionNameValue() {
        if (extensionNameValue == null) {
            extensionNameValue = new ArrayList<ExtensionNameValue>();
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

    /**
     * Gets the value of the coordinate1 property.
     *
     */
    public Double getCoordinate1() {
        return coordinate1;
    }

    /**
     * Sets the value of the coordinate1 property.
     *
     */
    public void setCoordinate1(Double value) {
        this.coordinate1 = value;
    }

    /**
     * Gets the value of the coordinate2 property.
     *
     */
    public Double getCoordinate2() {
        return coordinate2;
    }

    /**
     * Sets the value of the coordinate2 property.
     *
     */
    public void setCoordinate2(Double value) {
        this.coordinate2 = value;
    }

    /**
     * Gets the value of the latitude property.
     *
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *
     */
    public PlaneAngleMeasure getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     *
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *
     */
    public void setLatitude(PlaneAngleMeasure value) {
        this.latitude = value;
    }


    /**
     * Gets the value of the longitude property.
     *
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *
     */
    public PlaneAngleMeasure getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     *
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *
     */
    public void setLongitude(PlaneAngleMeasure value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the crs property.
     *
     * @return
     *     possible object is
     *     {@link AbstractGeodeticCrs }
     *
     */
    public RefNameString getCrs() {
        return crs;
    }

    /**
     * Sets the value of the crs property.
     *
     * @param value
     *     allowed object is
     *     {@link AbstractGeodeticCrs }
     *
     */
    public void setCrs(RefNameString value) {
        this.crs = value;
    }


    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1311.CsLocation to1311CsLocation() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.CsLocation location = new com.hashmapinc.tempus.WitsmlObjects.v1311.CsLocation();

        // assign fields
        location.setOriginal(this.isOriginal());
        location.setDescription(this.getDescription());
        location.setUid(this.getUid());
        if (this.getLatitude() != null)
            location.setLatitude(this.getLatitude().to1311PlaneAngleMeasure());

        if (this.getLongitude() != null)
            location.setLongitude(this.getLongitude().to1311PlaneAngleMeasure());

        return location;
    }

    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsLocation to1411CsLocation() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsLocation location = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsLocation();

        // assign fields
        location.setOriginal(this.isOriginal());
        location.setDescription(this.getDescription());
        location.setUid(this.getUid());
        if (this.getLatitude() != null)
            location.setLatitude(this.getLatitude().to1411PlaneAngleMeasure());

        if (this.getLongitude() != null)
            location.setLongitude(this.getLongitude().to1411PlaneAngleMeasure());

        return location;
    }
    //=========================================================================

}
