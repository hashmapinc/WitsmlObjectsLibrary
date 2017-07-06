package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for areaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="areaUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="m2"/>
 *     <enumeration value="acre"/>
 *     <enumeration value="b"/>
 *     <enumeration value="cm2"/>
 *     <enumeration value="ft2"/>
 *     <enumeration value="ha"/>
 *     <enumeration value="in2"/>
 *     <enumeration value="km2"/>
 *     <enumeration value="mi2"/>
 *     <enumeration value="miUS2"/>
 *     <enumeration value="mm2"/>
 *     <enumeration value="um2"/>
 *     <enumeration value="yd2"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "areaUom")
@XmlEnum
public enum AreaUom {

    @XmlEnumValue("m2")
    M_2("m2"),
    @XmlEnumValue("acre")
    ACRE("acre"),
    @XmlEnumValue("b")
    B("b"),
    @XmlEnumValue("cm2")
    CM_2("cm2"),
    @XmlEnumValue("ft2")
    FT_2("ft2"),
    @XmlEnumValue("ha")
    HA("ha"),
    @XmlEnumValue("in2")
    IN_2("in2"),
    @XmlEnumValue("km2")
    KM_2("km2"),
    @XmlEnumValue("mi2")
    MI_2("mi2"),
    @XmlEnumValue("miUS2")
    MI_US_2("miUS2"),
    @XmlEnumValue("mm2")
    MM_2("mm2"),
    @XmlEnumValue("um2")
    UM_2("um2"),
    @XmlEnumValue("yd2")
    YD_2("yd2");
    private final String value;

    AreaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaUom fromValue(String v) {
        for (AreaUom c: AreaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
