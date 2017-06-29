package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dynamicViscosityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="dynamicViscosityUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="Pa.s"/>
 *     <enumeration value="cP"/>
 *     <enumeration value="P"/>
 *     <enumeration value="psi.s"/>
 *     <enumeration value="dyne.s/cm2"/>
 *     <enumeration value="kgf.s/m2"/>
 *     <enumeration value="lbf.s/ft2"/>
 *     <enumeration value="lbf.s/in2"/>
 *     <enumeration value="mPa.s"/>
 *     <enumeration value="N.s/m2"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "dynamicViscosityUom")
@XmlEnum
public enum DynamicViscosityUom {

    @XmlEnumValue("Pa.s")
    PA_S("Pa.s"),
    @XmlEnumValue("cP")
    C_P("cP"),
    P("P"),
    @XmlEnumValue("psi.s")
    PSI_S("psi.s"),
    @XmlEnumValue("dyne.s/cm2")
    DYNE_S_CM_2("dyne.s/cm2"),
    @XmlEnumValue("kgf.s/m2")
    KGF_S_M_2("kgf.s/m2"),
    @XmlEnumValue("lbf.s/ft2")
    LBF_S_FT_2("lbf.s/ft2"),
    @XmlEnumValue("lbf.s/in2")
    LBF_S_IN_2("lbf.s/in2"),
    @XmlEnumValue("mPa.s")
    M_PA_S("mPa.s"),
    @XmlEnumValue("N.s/m2")
    N_S_M_2("N.s/m2");
    private final String value;

    DynamicViscosityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DynamicViscosityUom fromValue(String v) {
        for (DynamicViscosityUom c: DynamicViscosityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
