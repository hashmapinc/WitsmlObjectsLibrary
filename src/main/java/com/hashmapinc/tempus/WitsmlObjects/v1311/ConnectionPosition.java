package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="ConnectionPosition">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="both"/>
 *     <enumeration value="bottom"/>
 *     <enumeration value="top"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "ConnectionPosition")
@XmlEnum
public enum ConnectionPosition {


    /**
     * The connection is the same at both ends of the component
     * 
     */
    @XmlEnumValue("both")
    BOTH("both"),

    /**
     * This connection is only at the bottom of the component
     * 
     */
    @XmlEnumValue("bottom")
    BOTTOM("bottom"),

    /**
     * This connection is only at the top of the component
     * 
     */
    @XmlEnumValue("top")
    TOP("top"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ConnectionPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionPosition fromValue(String v) {
        for (ConnectionPosition c: ConnectionPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
