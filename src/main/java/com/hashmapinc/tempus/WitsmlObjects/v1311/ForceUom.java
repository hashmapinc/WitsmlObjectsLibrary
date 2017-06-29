package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="forceUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="N"/>
 *     <enumeration value="daN"/>
 *     <enumeration value="dyne"/>
 *     <enumeration value="gf"/>
 *     <enumeration value="kdyne"/>
 *     <enumeration value="kgf"/>
 *     <enumeration value="klbf"/>
 *     <enumeration value="kN"/>
 *     <enumeration value="lbf"/>
 *     <enumeration value="Mgf"/>
 *     <enumeration value="mN"/>
 *     <enumeration value="MN"/>
 *     <enumeration value="ozf"/>
 *     <enumeration value="pdl"/>
 *     <enumeration value="tonfUK"/>
 *     <enumeration value="tonfUS"/>
 *     <enumeration value="uN"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "forceUom")
@XmlEnum
public enum ForceUom {

    N("N"),
    @XmlEnumValue("daN")
    DA_N("daN"),
    @XmlEnumValue("dyne")
    DYNE("dyne"),
    @XmlEnumValue("gf")
    GF("gf"),
    @XmlEnumValue("kdyne")
    KDYNE("kdyne"),
    @XmlEnumValue("kgf")
    KGF("kgf"),
    @XmlEnumValue("klbf")
    KLBF("klbf"),
    @XmlEnumValue("kN")
    K_N("kN"),
    @XmlEnumValue("lbf")
    LBF("lbf"),
    @XmlEnumValue("Mgf")
    MGF("Mgf"),
    @XmlEnumValue("mN")
    M_N("mN"),
    MN("MN"),
    @XmlEnumValue("ozf")
    OZF("ozf"),
    @XmlEnumValue("pdl")
    PDL("pdl"),
    @XmlEnumValue("tonfUK")
    TONF_UK("tonfUK"),
    @XmlEnumValue("tonfUS")
    TONF_US("tonfUS"),
    @XmlEnumValue("uN")
    U_N("uN");
    private final String value;

    ForceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForceUom fromValue(String v) {
        for (ForceUom c: ForceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
