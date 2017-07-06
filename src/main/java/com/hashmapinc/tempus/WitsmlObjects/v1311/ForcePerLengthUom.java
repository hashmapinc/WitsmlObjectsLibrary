package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forcePerLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="forcePerLengthUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="N/30m"/>
 *     <enumeration value="N/m"/>
 *     <enumeration value="dyne/cm"/>
 *     <enumeration value="kN/m"/>
 *     <enumeration value="kgf/cm"/>
 *     <enumeration value="lbf/100ft"/>
 *     <enumeration value="lbf/30m"/>
 *     <enumeration value="lbf/ft"/>
 *     <enumeration value="lbf/in"/>
 *     <enumeration value="mN/km"/>
 *     <enumeration value="mN/m"/>
 *     <enumeration value="pdl/cm"/>
 *     <enumeration value="tonfUK/ft"/>
 *     <enumeration value="tonfUS/ft"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "forcePerLengthUom")
@XmlEnum
public enum ForcePerLengthUom {

    @XmlEnumValue("N/30m")
    N_30_M("N/30m"),
    @XmlEnumValue("N/m")
    N_M("N/m"),
    @XmlEnumValue("dyne/cm")
    DYNE_CM("dyne/cm"),
    @XmlEnumValue("kN/m")
    K_N_M("kN/m"),
    @XmlEnumValue("kgf/cm")
    KGF_CM("kgf/cm"),
    @XmlEnumValue("lbf/100ft")
    LBF_100_FT("lbf/100ft"),
    @XmlEnumValue("lbf/30m")
    LBF_30_M("lbf/30m"),
    @XmlEnumValue("lbf/ft")
    LBF_FT("lbf/ft"),
    @XmlEnumValue("lbf/in")
    LBF_IN("lbf/in"),
    @XmlEnumValue("mN/km")
    M_N_KM("mN/km"),
    @XmlEnumValue("mN/m")
    M_N_M("mN/m"),
    @XmlEnumValue("pdl/cm")
    PDL_CM("pdl/cm"),
    @XmlEnumValue("tonfUK/ft")
    TONF_UK_FT("tonfUK/ft"),
    @XmlEnumValue("tonfUS/ft")
    TONF_US_FT("tonfUS/ft");
    private final String value;

    ForcePerLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForcePerLengthUom fromValue(String v) {
        for (ForcePerLengthUom c: ForcePerLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
