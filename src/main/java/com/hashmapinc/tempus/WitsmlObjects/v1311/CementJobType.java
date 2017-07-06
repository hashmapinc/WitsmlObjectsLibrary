package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CementJobType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="CementJobType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="primary"/>
 *     <enumeration value="plug"/>
 *     <enumeration value="squeeze"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "CementJobType")
@XmlEnum
public enum CementJobType {

    @XmlEnumValue("primary")
    PRIMARY("primary"),
    @XmlEnumValue("plug")
    PLUG("plug"),
    @XmlEnumValue("squeeze")
    SQUEEZE("squeeze"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    CementJobType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CementJobType fromValue(String v) {
        for (CementJobType c: CementJobType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
