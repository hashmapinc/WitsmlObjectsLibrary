package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayElementDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="ArrayElementDataType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="boolean"/>
 *     <enumeration value="integer 8 bit"/>
 *     <enumeration value="integer 16 bit"/>
 *     <enumeration value="integer 32 bit"/>
 *     <enumeration value="integer 64 bit"/>
 *     <enumeration value="IEEE float 32 bit"/>
 *     <enumeration value="IEEE float 64 bit"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "ArrayElementDataType")
@XmlEnum
public enum ArrayElementDataType {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("integer 8 bit")
    INTEGER_8_BIT("integer 8 bit"),
    @XmlEnumValue("integer 16 bit")
    INTEGER_16_BIT("integer 16 bit"),
    @XmlEnumValue("integer 32 bit")
    INTEGER_32_BIT("integer 32 bit"),
    @XmlEnumValue("integer 64 bit")
    INTEGER_64_BIT("integer 64 bit"),
    @XmlEnumValue("IEEE float 32 bit")
    IEEE_FLOAT_32_BIT("IEEE float 32 bit"),
    @XmlEnumValue("IEEE float 64 bit")
    IEEE_FLOAT_64_BIT("IEEE float 64 bit");
    private final String value;

    ArrayElementDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArrayElementDataType fromValue(String v) {
        for (ArrayElementDataType c: ArrayElementDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
