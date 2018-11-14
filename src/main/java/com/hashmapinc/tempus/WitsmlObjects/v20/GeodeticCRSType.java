


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * gml:GeodeticCRS is a coordinate reference system based on a geodetic datum.
 * 
 * <p>Java class for GeodeticCRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="GeodeticCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://www.opengis.net/gml/3.2}ellipsoidalCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *           <element ref="{http://www.opengis.net/gml/3.2}sphericalCS"/>
 *         </choice>
 *         <element ref="{http://www.opengis.net/gml/3.2}geodeticDatum"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticCRSType", namespace = "http://www.opengis.net/gml/3.2", propOrder = {
    "ellipsoidalCS",
    "cartesianCS",
    "sphericalCS",
    "geodeticDatum"
})
public class GeodeticCRSType
    extends AbstractCRSType
{

    protected EllipsoidalCSPropertyType ellipsoidalCS;
    protected CartesianCSPropertyType cartesianCS;
    protected SphericalCSPropertyType sphericalCS;
    @XmlElement(required = true)
    protected GeodeticDatumPropertyType geodeticDatum;

    /**
     * Gets the value of the ellipsoidalCS property.
     * 
     * @return
     *     possible object is
     *     {@link EllipsoidalCSPropertyType }
     *     
     */
    public EllipsoidalCSPropertyType getEllipsoidalCS() {
        return ellipsoidalCS;
    }

    /**
     * Sets the value of the ellipsoidalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link EllipsoidalCSPropertyType }
     *     
     */
    public void setEllipsoidalCS(EllipsoidalCSPropertyType value) {
        this.ellipsoidalCS = value;
    }

    /**
     * Gets the value of the cartesianCS property.
     * 
     * @return
     *     possible object is
     *     {@link CartesianCSPropertyType }
     *     
     */
    public CartesianCSPropertyType getCartesianCS() {
        return cartesianCS;
    }

    /**
     * Sets the value of the cartesianCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CartesianCSPropertyType }
     *     
     */
    public void setCartesianCS(CartesianCSPropertyType value) {
        this.cartesianCS = value;
    }

    /**
     * Gets the value of the sphericalCS property.
     * 
     * @return
     *     possible object is
     *     {@link SphericalCSPropertyType }
     *     
     */
    public SphericalCSPropertyType getSphericalCS() {
        return sphericalCS;
    }

    /**
     * Sets the value of the sphericalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SphericalCSPropertyType }
     *     
     */
    public void setSphericalCS(SphericalCSPropertyType value) {
        this.sphericalCS = value;
    }

    /**
     * Gets the value of the geodeticDatum property.
     * 
     * @return
     *     possible object is
     *     {@link GeodeticDatumPropertyType }
     *     
     */
    public GeodeticDatumPropertyType getGeodeticDatum() {
        return geodeticDatum;
    }

    /**
     * Sets the value of the geodeticDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeodeticDatumPropertyType }
     *     
     */
    public void setGeodeticDatum(GeodeticDatumPropertyType value) {
        this.geodeticDatum = value;
    }

}
