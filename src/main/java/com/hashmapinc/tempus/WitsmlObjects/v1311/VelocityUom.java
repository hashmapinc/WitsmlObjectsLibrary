package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for velocityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="velocityUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="m/s"/>
 *     <enumeration value="cm/a"/>
 *     <enumeration value="cm/s"/>
 *     <enumeration value="dm/s"/>
 *     <enumeration value="ft/d"/>
 *     <enumeration value="ft/h"/>
 *     <enumeration value="ft/min"/>
 *     <enumeration value="ft/ms"/>
 *     <enumeration value="ft/s"/>
 *     <enumeration value="ft/us"/>
 *     <enumeration value="in/a"/>
 *     <enumeration value="in/min"/>
 *     <enumeration value="in/s"/>
 *     <enumeration value="kft/h"/>
 *     <enumeration value="kft/s"/>
 *     <enumeration value="km/h"/>
 *     <enumeration value="km/s"/>
 *     <enumeration value="knot"/>
 *     <enumeration value="m/d"/>
 *     <enumeration value="m/h"/>
 *     <enumeration value="m/min"/>
 *     <enumeration value="m/ms"/>
 *     <enumeration value="mi/h"/>
 *     <enumeration value="mil/yr"/>
 *     <enumeration value="mm/a"/>
 *     <enumeration value="mm/s"/>
 *     <enumeration value="nm/s"/>
 *     <enumeration value="um/s"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "velocityUom")
@XmlEnum
public enum VelocityUom {

    @XmlEnumValue("m/s")
    M_S("m/s"),
    @XmlEnumValue("cm/a")
    CM_A("cm/a"),
    @XmlEnumValue("cm/s")
    CM_S("cm/s"),
    @XmlEnumValue("dm/s")
    DM_S("dm/s"),
    @XmlEnumValue("ft/d")
    FT_D("ft/d"),
    @XmlEnumValue("ft/h")
    FT_H("ft/h"),
    @XmlEnumValue("ft/min")
    FT_MIN("ft/min"),
    @XmlEnumValue("ft/ms")
    FT_MS("ft/ms"),
    @XmlEnumValue("ft/s")
    FT_S("ft/s"),
    @XmlEnumValue("ft/us")
    FT_US("ft/us"),
    @XmlEnumValue("in/a")
    IN_A("in/a"),
    @XmlEnumValue("in/min")
    IN_MIN("in/min"),
    @XmlEnumValue("in/s")
    IN_S("in/s"),
    @XmlEnumValue("kft/h")
    KFT_H("kft/h"),
    @XmlEnumValue("kft/s")
    KFT_S("kft/s"),
    @XmlEnumValue("km/h")
    KM_H("km/h"),
    @XmlEnumValue("km/s")
    KM_S("km/s"),
    @XmlEnumValue("knot")
    KNOT("knot"),
    @XmlEnumValue("m/d")
    M_D("m/d"),
    @XmlEnumValue("m/h")
    M_H("m/h"),
    @XmlEnumValue("m/min")
    M_MIN("m/min"),
    @XmlEnumValue("m/ms")
    M_MS("m/ms"),
    @XmlEnumValue("mi/h")
    MI_H("mi/h"),
    @XmlEnumValue("mil/yr")
    MIL_YR("mil/yr"),
    @XmlEnumValue("mm/a")
    MM_A("mm/a"),
    @XmlEnumValue("mm/s")
    MM_S("mm/s"),
    @XmlEnumValue("nm/s")
    NM_S("nm/s"),
    @XmlEnumValue("um/s")
    UM_S("um/s");
    private final String value;

    VelocityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VelocityUom fromValue(String v) {
        for (VelocityUom c: VelocityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
