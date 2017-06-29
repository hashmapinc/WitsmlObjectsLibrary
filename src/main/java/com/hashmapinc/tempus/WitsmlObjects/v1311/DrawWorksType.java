package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrawWorksType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="DrawWorksType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="mechanical"/>
 *     <enumeration value="standard electric"/>
 *     <enumeration value="diesel electric"/>
 *     <enumeration value="ram rig"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "DrawWorksType")
@XmlEnum
public enum DrawWorksType {

    @XmlEnumValue("mechanical")
    MECHANICAL("mechanical"),
    @XmlEnumValue("standard electric")
    STANDARD_ELECTRIC("standard electric"),
    @XmlEnumValue("diesel electric")
    DIESEL_ELECTRIC("diesel electric"),
    @XmlEnumValue("ram rig")
    RAM_RIG("ram rig"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    DrawWorksType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DrawWorksType fromValue(String v) {
        for (DrawWorksType c: DrawWorksType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
