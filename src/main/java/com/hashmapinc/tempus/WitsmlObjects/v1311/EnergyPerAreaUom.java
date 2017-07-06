package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for energyPerAreaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="energyPerAreaUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="N/m"/>
 *     <enumeration value="erg/cm2"/>
 *     <enumeration value="J/cm2"/>
 *     <enumeration value="J/m2"/>
 *     <enumeration value="kgf.m/cm2"/>
 *     <enumeration value="lbf.ft/in2"/>
 *     <enumeration value="mJ/cm2"/>
 *     <enumeration value="mJ/m2"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "energyPerAreaUom")
@XmlEnum
public enum EnergyPerAreaUom {

    @XmlEnumValue("N/m")
    N_M("N/m"),
    @XmlEnumValue("erg/cm2")
    ERG_CM_2("erg/cm2"),
    @XmlEnumValue("J/cm2")
    J_CM_2("J/cm2"),
    @XmlEnumValue("J/m2")
    J_M_2("J/m2"),
    @XmlEnumValue("kgf.m/cm2")
    KGF_M_CM_2("kgf.m/cm2"),
    @XmlEnumValue("lbf.ft/in2")
    LBF_FT_IN_2("lbf.ft/in2"),
    @XmlEnumValue("mJ/cm2")
    M_J_CM_2("mJ/cm2"),
    @XmlEnumValue("mJ/m2")
    M_J_M_2("mJ/m2");
    private final String value;

    EnergyPerAreaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyPerAreaUom fromValue(String v) {
        for (EnergyPerAreaUom c: EnergyPerAreaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
