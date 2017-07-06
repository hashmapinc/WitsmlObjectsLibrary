package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The actual data corresponding to the curves defined in 
 * 			the LOGCURVEINFO element. A comma delimited list of data values with one 
 * 			value for each curve on the log (e.g., "xxx,yyy, zzz"). For array curves,
 * 			the value of the array curve will be a space delimited list of values that
 * 			are contained within the commas that delimit the value for that curve
 * 			(e.g., "xxx,aa bb cc,zzz").
 * 			This essentially represents one row of a table where the curve 
 * 			mnemonics represent the column headings. 
 * 			The order of the nodes for each block should match the order implied 
 * 			by "direction".
 * 
 * <p>Java class for data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="data">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>string">
 *       <attribute name="id" type="{http://www.witsml.org/schemas/131}refString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data", propOrder = {
    "value"
})
public class Data {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the value property.
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
