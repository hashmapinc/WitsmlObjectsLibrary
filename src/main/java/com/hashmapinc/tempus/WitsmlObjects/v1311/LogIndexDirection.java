package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogIndexDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="LogIndexDirection">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="decreasing"/>
 *     <enumeration value="increasing"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "LogIndexDirection")
@XmlEnum
public enum LogIndexDirection {


    /**
     * Log items are in order of decreasing index values 
     * 					(e.g. wireline log logging while pulling out of hole)
     * 
     */
    @XmlEnumValue("decreasing")
    DECREASING("decreasing"),

    /**
     * Log items are in order of increasing index values 
     * 					(e.g. increasing depths or times)
     * 
     */
    @XmlEnumValue("increasing")
    INCREASING("increasing"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LogIndexDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogIndexDirection fromValue(String v) {
        for (LogIndexDirection c: LogIndexDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
