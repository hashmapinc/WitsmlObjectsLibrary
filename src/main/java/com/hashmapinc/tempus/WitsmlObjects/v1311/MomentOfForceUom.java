package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for momentOfForceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="momentOfForceUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="J"/>
 *     <enumeration value="dN.m"/>
 *     <enumeration value="daN.m"/>
 *     <enumeration value="ft.lbf"/>
 *     <enumeration value="kft.lbf"/>
 *     <enumeration value="kgf.m"/>
 *     <enumeration value="kN.m"/>
 *     <enumeration value="lbf.ft"/>
 *     <enumeration value="lbf.in"/>
 *     <enumeration value="lbm.ft2/s2"/>
 *     <enumeration value="N.m"/>
 *     <enumeration value="pdl.ft"/>
 *     <enumeration value="tonfUS.ft"/>
 *     <enumeration value="tonfUS.mi"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "momentOfForceUom")
@XmlEnum
public enum MomentOfForceUom {

    J("J"),
    @XmlEnumValue("dN.m")
    D_N_M("dN.m"),
    @XmlEnumValue("daN.m")
    DA_N_M("daN.m"),
    @XmlEnumValue("ft.lbf")
    FT_LBF("ft.lbf"),
    @XmlEnumValue("kft.lbf")
    KFT_LBF("kft.lbf"),
    @XmlEnumValue("kgf.m")
    KGF_M("kgf.m"),
    @XmlEnumValue("kN.m")
    K_N_M("kN.m"),
    @XmlEnumValue("lbf.ft")
    LBF_FT("lbf.ft"),
    @XmlEnumValue("lbf.in")
    LBF_IN("lbf.in"),
    @XmlEnumValue("lbm.ft2/s2")
    LBM_FT_2_S_2("lbm.ft2/s2"),
    @XmlEnumValue("N.m")
    N_M("N.m"),
    @XmlEnumValue("pdl.ft")
    PDL_FT("pdl.ft"),
    @XmlEnumValue("tonfUS.ft")
    TONF_US_FT("tonfUS.ft"),
    @XmlEnumValue("tonfUS.mi")
    TONF_US_MI("tonfUS.mi");
    private final String value;

    MomentOfForceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MomentOfForceUom fromValue(String v) {
        for (MomentOfForceUom c: MomentOfForceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
