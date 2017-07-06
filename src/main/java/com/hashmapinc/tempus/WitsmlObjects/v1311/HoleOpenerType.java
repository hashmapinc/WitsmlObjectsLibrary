package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoleOpenerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="HoleOpenerType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="under-reamer"/>
 *     <enumeration value="fixed blade"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "HoleOpenerType")
@XmlEnum
public enum HoleOpenerType {

    @XmlEnumValue("under-reamer")
    UNDER_REAMER("under-reamer"),
    @XmlEnumValue("fixed blade")
    FIXED_BLADE("fixed blade"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    HoleOpenerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HoleOpenerType fromValue(String v) {
        for (HoleOpenerType c: HoleOpenerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
