


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EtpDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="EtpDataType">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="boolean"/>
 *     <enumeration value="bytes"/>
 *     <enumeration value="double"/>
 *     <enumeration value="float"/>
 *     <enumeration value="int"/>
 *     <enumeration value="long"/>
 *     <enumeration value="null"/>
 *     <enumeration value="string"/>
 *     <enumeration value="vector"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EtpDataType", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum EtpDataType {


    /**
     * True or false values.
     * 
     */
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),

    /**
     * Integer data value (nominally a one-byte value). The value must conform to the format of the xsd:dateTime data type (minInclusive=-128 and maxInclusive=127).
     * 
     */
    @XmlEnumValue("bytes")
    BYTES("bytes"),

    /**
     * Double-precision floating-point value (nominally an 8-byte value). The value must conform to the format of the xsd:double data type.
     * 
     */
    @XmlEnumValue("double")
    DOUBLE("double"),

    /**
     * Single-precision floating-point value (nominally a 4-byte value). The value must conform to the format of the xsd:float data type
     * 
     */
    @XmlEnumValue("float")
    FLOAT("float"),

    /**
     * Integer data value (nominally a 4-byte value). The value must conform to the format of the xsd:int data type.
     * 
     */
    @XmlEnumValue("int")
    INT("int"),

    /**
     * Long integer data value (nominally an 8-byte value). The value must conform to the format of the xsd:long data type.
     * 
     */
    @XmlEnumValue("long")
    LONG("long"),

    /**
     * No value or the value is null.
     * 
     */
    @XmlEnumValue("null")
    NULL("null"),

    /**
     * Character string data. The value must conform to the format of the xsd:string data type. The maximum length of a value is determined by individual servers. 
     * 
     */
    @XmlEnumValue("string")
    STRING("string"),

    /**
     * An array of doubles.
     * 
     */
    @XmlEnumValue("vector")
    VECTOR("vector");
    private final String value;

    EtpDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EtpDataType fromValue(String v) {
        for (EtpDataType c: EtpDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
