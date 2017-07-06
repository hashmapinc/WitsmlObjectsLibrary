//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Representation of a number as a double, possibly qualified as a ratio of doubles.	
 * 			Ratio component attributes 'numerator' and 'denominator' may be both present or both absent.	
 * 			When ratio component attributes are present, the ratio represented is to be used with
 * 			the double representation included for human readability.
 * 			A 'canonical' representation, according to the following rules, is suggested:
 * 			Only use numerator/denominator when the representation of the number as double is not 
 * 			sufficiently precise (i. e. causes errors of accumulation).
 * 			Express both numerator and denominator as integers (doubles with integer values) reduced 
 * 			to 'least common denominator' if possible.
 * 
 * <p>Java class for ratioGenericMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="ratioGenericMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/1series>abstractMeasure">
 *       <attribute name="uom" use="required" type="{http://www.witsml.org/schemas/1series}uomString" />
 *       <attribute name="numerator" type="{http://www.witsml.org/schemas/1series}unitlessQuantity" />
 *       <attribute name="denominator" type="{http://www.witsml.org/schemas/1series}unitlessQuantity" />
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

}
