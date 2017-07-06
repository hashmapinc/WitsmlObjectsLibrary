package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * An encoded value or values. The encoding may utilize 
 * 			any of several xsd encodings. Something external to the value must
 * 			define the encoding. The uom attribute is optional because the value may 
 * 			be a string or unitless quantity. If the value is a measure then
 * 			the uom must be specified.
 * 
 * <p>Java class for encodedArrayString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="encodedArrayString">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractMaximumLengthString">
 *       <attribute name="uom" type="{http://www.witsml.org/schemas/131}uomString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "encodedArrayString", propOrder = {
    "value"
})
public class EncodedArrayString {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "uom")
    protected String uom;

    /**
     * This defines the maximum acceptable length of a
     * 			string that can be stored in a data base.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
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

}
