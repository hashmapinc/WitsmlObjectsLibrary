


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeodeticDatumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="GeodeticDatumType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractDatumType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}primeMeridian"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}ellipsoid"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticDatumType", namespace = "http://www.opengis.net/gml/3.2", propOrder = {
    "primeMeridian",
    "ellipsoid"
})
public class GeodeticDatumType
    extends AbstractDatumType
{

    @XmlElement(required = true)
    protected PrimeMeridianPropertyType primeMeridian;
    @XmlElement(required = true)
    protected EllipsoidPropertyType ellipsoid;

    /**
     * Gets the value of the primeMeridian property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeMeridianPropertyType }
     *     
     */
    public PrimeMeridianPropertyType getPrimeMeridian() {
        return primeMeridian;
    }

    /**
     * Sets the value of the primeMeridian property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeMeridianPropertyType }
     *     
     */
    public void setPrimeMeridian(PrimeMeridianPropertyType value) {
        this.primeMeridian = value;
    }

    /**
     * Gets the value of the ellipsoid property.
     * 
     * @return
     *     possible object is
     *     {@link EllipsoidPropertyType }
     *     
     */
    public EllipsoidPropertyType getEllipsoid() {
        return ellipsoid;
    }

    /**
     * Sets the value of the ellipsoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EllipsoidPropertyType }
     *     
     */
    public void setEllipsoid(EllipsoidPropertyType value) {
        this.ellipsoid = value;
    }

}
