package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoleCasingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="HoleCasingType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="blow out preventer"/>
 *     <enumeration value="casing"/>
 *     <enumeration value="conductor"/>
 *     <enumeration value="curved conductor"/>
 *     <enumeration value="liner"/>
 *     <enumeration value="open hole"/>
 *     <enumeration value="riser"/>
 *     <enumeration value="tubing"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "HoleCasingType")
@XmlEnum
public enum HoleCasingType {

    @XmlEnumValue("blow out preventer")
    BLOW_OUT_PREVENTER("blow out preventer"),
    @XmlEnumValue("casing")
    CASING("casing"),
    @XmlEnumValue("conductor")
    CONDUCTOR("conductor"),
    @XmlEnumValue("curved conductor")
    CURVED_CONDUCTOR("curved conductor"),
    @XmlEnumValue("liner")
    LINER("liner"),
    @XmlEnumValue("open hole")
    OPEN_HOLE("open hole"),
    @XmlEnumValue("riser")
    RISER("riser"),
    @XmlEnumValue("tubing")
    TUBING("tubing"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    HoleCasingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HoleCasingType fromValue(String v) {
        for (HoleCasingType c: HoleCasingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
