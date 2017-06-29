package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogTraceState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="LogTraceState">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="depth adjusted"/>
 *     <enumeration value="edited"/>
 *     <enumeration value="joined"/>
 *     <enumeration value="processed"/>
 *     <enumeration value="raw"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "LogTraceState")
@XmlEnum
public enum LogTraceState {

    @XmlEnumValue("depth adjusted")
    DEPTH_ADJUSTED("depth adjusted"),
    @XmlEnumValue("edited")
    EDITED("edited"),
    @XmlEnumValue("joined")
    JOINED("joined"),
    @XmlEnumValue("processed")
    PROCESSED("processed"),
    @XmlEnumValue("raw")
    RAW("raw"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LogTraceState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogTraceState fromValue(String v) {
        for (LogTraceState c: LogTraceState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
