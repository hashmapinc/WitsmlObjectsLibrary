package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Representation of a number as a Double, possibly qualified as a ratio of Doubles.
 * 			Ratio component attributes 'numerator' and 'denominator' may be both present or both absent.	
 * 			When ratio component attributes are present, the ratio represented is to be used with
 * 			the Double representation included for human readability.
 * 			A 'canonical' representation, according to the following rules, is suggested:
 * 			Only use numerator/denominator when the representation of the number as Double is not
 * 			sufficiently precise (i. e. causes errors of accumulation).
 * 			Express both numerator and denominator as integers (Doubles with integer values) reduced
 * 			to 'least common denominator' if possible.
 * 
 * <p>Java class for ratioGenericMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="ratioGenericMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.witsml.org/schemas/131}uomString" />
 *       <attribute name="numerator" type="{http://www.witsml.org/schemas/131}unitlessQuantity" />
 *       <attribute name="denominator" type="{http://www.witsml.org/schemas/131}unitlessQuantity" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ratioGenericMeasure")
public class RatioGenericMeasure
    extends AbstractMeasure
{

    @XmlAttribute(name = "uom", required = true)
    protected String uom;
    @XmlAttribute(name = "numerator")
    protected Double numerator;
    @XmlAttribute(name = "denominator")
    protected Double denominator;

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
     * Gets the value of the numerator property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumerator() {
        return numerator;
    }

    /**
     * Sets the value of the numerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumerator(Double value) {
        this.numerator = value;
    }

    /**
     * Gets the value of the denominator property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDenominator(Double value) {
        this.denominator = value;
    }




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.RatioGenericMeasure to1411RatioGenericMeasure() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.RatioGenericMeasure measure = new com.hashmapinc.tempus.WitsmlObjects.v1411.RatioGenericMeasure();

        measure.setValue(this.getValue());
        measure.setUom(this.getUom());
        measure.setDenominator(this.getDenominator());
        measure.setNumerator(this.getNumerator());

        return measure;
    }
    //=========================================================================

}
