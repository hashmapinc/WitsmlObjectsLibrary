


package com.hashmapinc.tempus.WitsmlObjects.v20;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A measured depth coordinate in a wellbore. Positive moving from the reference datum toward the bottomhole. All coordinates with the same datum (and same UOM) can be considered to be in the same coordinate reference system (CRS) and are thus directly comparable.
 * 
 * <p>Java class for DepthCoord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="DepthCoord">
 *   <simpleContent>
 *     <extension base="<http://www.energistics.org/energyml/data/commonv2>AbstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.energistics.org/energyml/data/commonv2}LengthUom" />
 *       <attribute name="datum" use="required" type="{http://www.energistics.org/energyml/data/commonv2}String64" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepthCoord", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "value"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepthCoord {

    @XmlValue
    protected Double value;
    @XmlAttribute(name = "uom", required = true)
    protected String uom;
    @XmlAttribute(name = "datum", required = true)
    protected String datum;

    /**
     * The intended abstract supertype of all quantities that have a value with a unit of measure. The unit of measure is in the uom attribute of the subtypes. 
     * 
     * This type allows all quantities to be profiled to be a 'float' instead of a 'double'.
     * 
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
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
    public com.hashmapinc.tempus.WitsmlObjects.v1311.MeasuredDepthCoord to1311MeasuredDepthCoord() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.MeasuredDepthCoord mdCoord = new com.hashmapinc.tempus.WitsmlObjects.v1311.MeasuredDepthCoord();

        mdCoord.setDatum(this.getDatum());
        mdCoord.setUom(this.getUom());
        mdCoord.setValue(this.getValue());

        return mdCoord;
    }

    public com.hashmapinc.tempus.WitsmlObjects.v1411.MeasuredDepthCoord to1411MeasuredDepthCoord() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.MeasuredDepthCoord mdCoord = new com.hashmapinc.tempus.WitsmlObjects.v1411.MeasuredDepthCoord();

        mdCoord.setDatum(this.getDatum());
        mdCoord.setUom(this.getUom());
        mdCoord.setValue(this.getValue());

        return mdCoord;
    }


    public com.hashmapinc.tempus.WitsmlObjects.v1311.WellVerticalDepthCoord to1311VerticalDepthCoord() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.WellVerticalDepthCoord vdCoord = new com.hashmapinc.tempus.WitsmlObjects.v1311.WellVerticalDepthCoord();

        vdCoord.setDatum(this.datum);
        vdCoord.setUom(this.uom);
        vdCoord.setValue(this.value);

        return vdCoord;
    }

    public com.hashmapinc.tempus.WitsmlObjects.v1411.WellVerticalDepthCoord to1411VerticalDepthCoord() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.WellVerticalDepthCoord vdCoord = new com.hashmapinc.tempus.WitsmlObjects.v1411.WellVerticalDepthCoord();

        vdCoord.setDatum(this.datum);
        vdCoord.setUom(this.uom);
        vdCoord.setValue(this.value);

        return vdCoord;
    }
    //=========================================================================
}
