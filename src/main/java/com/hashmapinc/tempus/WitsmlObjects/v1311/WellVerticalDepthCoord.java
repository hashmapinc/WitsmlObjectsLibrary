package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A vertical (gravity based) depth coordinate within the context of a well.
 * 			Positive moving downward from the reference datum. 
 * 			All coordinates with the same datum (and same uom) can be considered to be in the same 
 * 			Coordinate Reference System and are thus directly comparable.
 * 
 * <p>Java class for wellVerticalDepthCoord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="wellVerticalDepthCoord">
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
@XmlType(name = "wellVerticalDepthCoord")
public class WellVerticalDepthCoord
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




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.WellVerticalDepthCoord to1411VerticalDepthCoord() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.WellVerticalDepthCoord coord = new com.hashmapinc.tempus.WitsmlObjects.v1411.WellVerticalDepthCoord();

        if (null != this.getUom())
            coord.setUom(com.hashmapinc.tempus.WitsmlObjects.v1411.WellVerticalCoordinateUom.fromValue(this.getUom().value()));

        coord.setDatum(this.getDatum());
        coord.setValue(this.getValue());

        return coord;
    }

    public com.hashmapinc.tempus.WitsmlObjects.v1411.LengthMeasure to1411LengthMeasure() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.LengthMeasure length = new com.hashmapinc.tempus.WitsmlObjects.v1411.LengthMeasure();

        if (null != this.getUom())
            length.setUom(this.getUom().value());

        length.setValue(this.getValue());

        return length;
    }

    public com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord to20DepthCoord() {
        com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord coord = new com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord();

        if (null != this.getUom())
            coord.setUom(this.getUom().value());

        coord.setDatum(this.getDatum());
        coord.setValue(this.getValue());

        return coord;
    }
    //=========================================================================
}
