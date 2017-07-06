package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forcePerVolumeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="forcePerVolumeUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="N/m3"/>
 *     <enumeration value="atm/100m"/>
 *     <enumeration value="atm/m"/>
 *     <enumeration value="bar/km"/>
 *     <enumeration value="bar/m"/>
 *     <enumeration value="GPa/cm"/>
 *     <enumeration value="kPa/100m"/>
 *     <enumeration value="kPa/m"/>
 *     <enumeration value="lbf/ft3"/>
 *     <enumeration value="lbf/galUS"/>
 *     <enumeration value="MPa/m"/>
 *     <enumeration value="psi/ft"/>
 *     <enumeration value="psi/100ft"/>
 *     <enumeration value="psi/kft"/>
 *     <enumeration value="psi/m"/>
 *     <enumeration value="Pa/m"/>
 *     <enumeration value="atm/ft"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "forcePerVolumeUom")
@XmlEnum
public enum ForcePerVolumeUom {

    @XmlEnumValue("N/m3")
    N_M_3("N/m3"),
    @XmlEnumValue("atm/100m")
    ATM_100_M("atm/100m"),
    @XmlEnumValue("atm/m")
    ATM_M("atm/m"),
    @XmlEnumValue("bar/km")
    BAR_KM("bar/km"),
    @XmlEnumValue("bar/m")
    BAR_M("bar/m"),
    @XmlEnumValue("GPa/cm")
    G_PA_CM("GPa/cm"),
    @XmlEnumValue("kPa/100m")
    K_PA_100_M("kPa/100m"),
    @XmlEnumValue("kPa/m")
    K_PA_M("kPa/m"),
    @XmlEnumValue("lbf/ft3")
    LBF_FT_3("lbf/ft3"),
    @XmlEnumValue("lbf/galUS")
    LBF_GAL_US("lbf/galUS"),
    @XmlEnumValue("MPa/m")
    M_PA_M("MPa/m"),
    @XmlEnumValue("psi/ft")
    PSI_FT("psi/ft"),
    @XmlEnumValue("psi/100ft")
    PSI_100_FT("psi/100ft"),
    @XmlEnumValue("psi/kft")
    PSI_KFT("psi/kft"),
    @XmlEnumValue("psi/m")
    PSI_M("psi/m"),
    @XmlEnumValue("Pa/m")
    PA_M("Pa/m"),
    @XmlEnumValue("atm/ft")
    ATM_FT("atm/ft");
    private final String value;

    ForcePerVolumeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForcePerVolumeUom fromValue(String v) {
        for (ForcePerVolumeUom c: ForcePerVolumeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
