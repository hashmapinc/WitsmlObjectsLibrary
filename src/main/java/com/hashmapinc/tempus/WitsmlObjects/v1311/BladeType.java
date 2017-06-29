package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BladeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="BladeType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="clamp-on"/>
 *     <enumeration value="integral"/>
 *     <enumeration value="sleeve"/>
 *     <enumeration value="welded"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "BladeType")
@XmlEnum
public enum BladeType {

    @XmlEnumValue("clamp-on")
    CLAMP_ON("clamp-on"),
    @XmlEnumValue("integral")
    INTEGRAL("integral"),
    @XmlEnumValue("sleeve")
    SLEEVE("sleeve"),
    @XmlEnumValue("welded")
    WELDED("welded"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    BladeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BladeType fromValue(String v) {
        for (BladeType c: BladeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
