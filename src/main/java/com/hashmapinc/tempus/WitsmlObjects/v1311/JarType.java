package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JarType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="JarType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="mechanical"/>
 *     <enumeration value="hydraulic"/>
 *     <enumeration value="hydro mechanical"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "JarType")
@XmlEnum
public enum JarType {

    @XmlEnumValue("mechanical")
    MECHANICAL("mechanical"),
    @XmlEnumValue("hydraulic")
    HYDRAULIC("hydraulic"),
    @XmlEnumValue("hydro mechanical")
    HYDRO_MECHANICAL("hydro mechanical"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    JarType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JarType fromValue(String v) {
        for (JarType c: JarType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
