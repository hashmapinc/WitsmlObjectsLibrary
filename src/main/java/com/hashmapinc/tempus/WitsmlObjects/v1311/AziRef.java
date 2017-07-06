package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AziRef.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="AziRef">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="magnetic north"/>
 *     <enumeration value="grid north"/>
 *     <enumeration value="true north"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "AziRef")
@XmlEnum
public enum AziRef {


    /**
     * The north direction as defined by the magnetic 
     * 					north pole at the time of the measurement. The magnetic north pole 
     * 					is the direction that a magnet will point to when freely rotating.
     * 
     */
    @XmlEnumValue("magnetic north")
    MAGNETIC_NORTH("magnetic north"),

    /**
     * The north direction is defined by the coordinate 
     * 					grid in the projection coordinate system.
     * 
     */
    @XmlEnumValue("grid north")
    GRID_NORTH("grid north"),

    /**
     * The north direction as defined by the true 
     * 					north pole. The true north pole is an average of the actual measured 
     * 					north axis, which is the axis of rotation of the earth.
     * 
     */
    @XmlEnumValue("true north")
    TRUE_NORTH("true north"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    AziRef(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AziRef fromValue(String v) {
        for (AziRef c: AziRef.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
