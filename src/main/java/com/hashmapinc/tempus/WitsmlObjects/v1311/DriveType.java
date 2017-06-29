package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DriveType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="DriveType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="coiled tubing"/>
 *     <enumeration value="rotary kelly drive"/>
 *     <enumeration value="top drive"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "DriveType")
@XmlEnum
public enum DriveType {


    /**
     * Coiled tubing rig
     * 
     */
    @XmlEnumValue("coiled tubing")
    COILED_TUBING("coiled tubing"),

    /**
     * Kelly drive system
     * 
     */
    @XmlEnumValue("rotary kelly drive")
    ROTARY_KELLY_DRIVE("rotary kelly drive"),

    /**
     * Top Drive
     * 
     */
    @XmlEnumValue("top drive")
    TOP_DRIVE("top drive"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    DriveType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DriveType fromValue(String v) {
        for (DriveType c: DriveType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
