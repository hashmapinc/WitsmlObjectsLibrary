package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The mnemonic of a log index curve plus 
 * 			the column index of the curve.
 * 
 * <p>Java class for indexCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="indexCurve">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>str32">
 *       <attribute name="columnIndex" use="required" type="{http://www.witsml.org/schemas/131}nonNegativeCount" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indexCurve", propOrder = {
    "value"
})
public class IndexCurve {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "columnIndex", required = true)
    protected short columnIndex;

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
     * Gets the value of the columnIndex property.
     * 
     */
    public short getColumnIndex() {
        return columnIndex;
    }

    /**
     * Sets the value of the columnIndex property.
     * 
     */
    public void setColumnIndex(short value) {
        this.columnIndex = value;
    }

}
