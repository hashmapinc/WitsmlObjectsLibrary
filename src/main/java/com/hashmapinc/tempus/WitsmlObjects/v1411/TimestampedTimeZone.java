//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A local time zone conforming to the XSD:dateTime specification.
 * 			The dTim attribute can capture when the local time zone changed.
 * 			The use of this type is generally related to a specific (set of) date and time
 * 			for which the original time zone needs to be captured.
 * 
 * <p>Java class for timestampedTimeZone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="timestampedTimeZone">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/1series>abstractTimeZone">
 *       <attribute name="dTim" type="{http://www.witsml.org/schemas/1series}timestamp" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timestampedTimeZone", propOrder = {
    "value"
})
public class TimestampedTimeZone {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "dTim")
    @JsonProperty("dTim")
    protected XMLGregorianCalendar dTim;

    /**
     * A time zone conforming to the XSD:dateTime specification.
     * 			It should be of the form "Z" or "shh.mm" where 
     * 				"s" is "+" or "-", 
     * 				"hh" is 00 to 23 and
     * 				"mm" is 00 to 59.
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
     * Gets the value of the dTim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @JsonProperty("dTimCreation")
    public XMLGregorianCalendar getDTim() {
        return dTim;
    }

    /**
     * Sets the value of the dTim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTim(XMLGregorianCalendar value) {
        this.dTim = value;
    }

}
