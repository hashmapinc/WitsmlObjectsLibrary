package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A vertical (gravity based) elevation coordinate within the context of a well.
 * 			Positive moving upward from the reference datum.  
 * 			All coordinates with the same datum (and same uom) can be considered to be in the same 
 * 			Coordinate Reference System and are thus directly comparable.
 * 
 * <p>Java class for wellElevationCoord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="wellElevationCoord">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.witsml.org/schemas/131}WellVerticalCoordinateUom" />
 *       <attribute name="datum" type="{http://www.witsml.org/schemas/131}refWellDatum" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wellElevationCoord")
public class WellElevationCoord
    extends AbstractMeasure
{

    @XmlAttribute(name = "uom", required = true)
    protected WellVerticalCoordinateUom uom;
    @XmlAttribute(name = "datum")
    protected String datum;

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalCoordinateUom }
     *     
     */
    public WellVerticalCoordinateUom getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalCoordinateUom }
     *     
     */
    public void setUom(WellVerticalCoordinateUom value) {
        this.uom = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

}
