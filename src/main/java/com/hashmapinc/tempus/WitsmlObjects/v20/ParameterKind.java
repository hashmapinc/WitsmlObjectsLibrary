


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ParameterKind">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="dataObject"/>
 *     <enumeration value="double"/>
 *     <enumeration value="integer"/>
 *     <enumeration value="string"/>
 *     <enumeration value="timestamp"/>
 *     <enumeration value="subActivity"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParameterKind")
@XmlEnum
public enum ParameterKind {

    @XmlEnumValue("dataObject")
    DATA_OBJECT("dataObject"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("timestamp")
    TIMESTAMP("timestamp"),
    @XmlEnumValue("subActivity")
    SUB_ACTIVITY("subActivity");
    private final String value;

    ParameterKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterKind fromValue(String v) {
        for (ParameterKind c: ParameterKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
