package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScrType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="ScrType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="string annulus"/>
 *     <enumeration value="string kill line"/>
 *     <enumeration value="string choke line"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "ScrType")
@XmlEnum
public enum ScrType {

    @XmlEnumValue("string annulus")
    STRING_ANNULUS("string annulus"),
    @XmlEnumValue("string kill line")
    STRING_KILL_LINE("string kill line"),
    @XmlEnumValue("string choke line")
    STRING_CHOKE_LINE("string choke line"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ScrType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScrType fromValue(String v) {
        for (ScrType c: ScrType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
