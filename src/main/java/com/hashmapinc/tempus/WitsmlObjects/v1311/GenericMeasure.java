package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A generic measure type.
 * 			This should not be used except in situations where the underlying class of data is 
 * 			captured elsewhere. For example, for a log curve.
 * 
 * <p>Java class for genericMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="genericMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractMeasure">
 *       <attribute name="uom" type="{http://www.witsml.org/schemas/131}uomString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericMeasure")
public class GenericMeasure
    extends AbstractMeasure
{

    @XmlAttribute(name = "uom")
    protected String uom;

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




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.GenericMeasure to1411GenericMeasure() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.GenericMeasure measure =
                new com.hashmapinc.tempus.WitsmlObjects.v1411.GenericMeasure();

        // assign fields
        measure.setValue(this.getValue());
        measure.setUom(this.getUom());

        return measure;
    }

    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1311.GenericMeasure to1311GenericMeasure() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.GenericMeasure measure =
                new com.hashmapinc.tempus.WitsmlObjects.v1311.GenericMeasure();

        // assign fields
        measure.setValue(this.getValue());
        measure.setUom(this.getUom());

        return measure;
    }

    public com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure to20GenericMeasure() {
        com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure measure =
                new com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure();

        // assign fields
        measure.setValue(this.getValue());
        measure.setUom(this.getUom());

        return measure;
    }
    //=========================================================================

}
