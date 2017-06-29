package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accelerationLinearUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="accelerationLinearUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="m/s2"/>
 *     <enumeration value="cm/s2"/>
 *     <enumeration value="ft/s2"/>
 *     <enumeration value="Gal"/>
 *     <enumeration value="mgn"/>
 *     <enumeration value="gn"/>
 *     <enumeration value="mGal"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "accelerationLinearUom")
@XmlEnum
public enum AccelerationLinearUom {

    @XmlEnumValue("m/s2")
    M_S_2("m/s2"),
    @XmlEnumValue("cm/s2")
    CM_S_2("cm/s2"),
    @XmlEnumValue("ft/s2")
    FT_S_2("ft/s2"),
    @XmlEnumValue("Gal")
    GAL("Gal"),
    @XmlEnumValue("mgn")
    MGN("mgn"),
    @XmlEnumValue("gn")
    GN("gn"),
    @XmlEnumValue("mGal")
    M_GAL("mGal");
    private final String value;

    AccelerationLinearUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccelerationLinearUom fromValue(String v) {
        for (AccelerationLinearUom c: AccelerationLinearUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
