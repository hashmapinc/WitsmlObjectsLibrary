


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Location of the well by latitude and longitude.
 * 
 * <p>Java class for GeodeticWellLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="GeodeticWellLocation">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/witsmlv2}AbstractWellLocation">
 *       <sequence>
 *         <element name="Latitude" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure"/>
 *         <element name="Longitude" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure"/>
 *         <element name="Crs" type="{http://www.energistics.org/energyml/data/commonv2}AbstractGeodeticCrs"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticWellLocation", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "latitude",
    "longitude",
    "crs"
})
public class GeodeticWellLocation
    extends AbstractWellLocation
{

    @XmlElement(name = "Latitude", required = true)
    protected PlaneAngleMeasure latitude;
    @XmlElement(name = "Longitude", required = true)
    protected PlaneAngleMeasure longitude;
    @XmlElement(name = "Crs", required = true)
    protected AbstractGeodeticCrs crs;

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
    public AbstractGeodeticCrs getCrs() {
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
    public void setCrs(AbstractGeodeticCrs value) {
        this.crs = value;
    }

}
