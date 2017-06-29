package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="LogDataType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="date time"/>
 *     <enumeration value="double"/>
 *     <enumeration value="long"/>
 *     <enumeration value="string"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "LogDataType")
@XmlEnum
public enum LogDataType {


    /**
     * Date with time data value.
     * 
     */
    @XmlEnumValue("date time")
    DATE_TIME("date time"),

    /**
     * Double precision floating point value.
     * 
     */
    @XmlEnumValue("double")
    DOUBLE("double"),

    /**
     * Long integer data value.
     * 
     */
    @XmlEnumValue("long")
    LONG("long"),

    /**
     * Character string data.
     * 
     */
    @XmlEnumValue("string")
    STRING("string"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LogDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogDataType fromValue(String v) {
        for (LogDataType c: LogDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
