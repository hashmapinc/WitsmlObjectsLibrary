//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardVolumePerTimeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="StandardVolumePerTimeUom">
 *   <restriction base="{http://www.witsml.org/schemas/1series}abstractUomEnum">
 *     <enumeration value="scf(60F)/d"/>
 *     <enumeration value="scm(15C)/s"/>
 *     <enumeration value="scm(15C)/d"/>
 *     <enumeration value="stb(60F)/d"/>
 *     <enumeration value="ksm3/d"/>
 *     <enumeration value="Mscm(15C)/d"/>
 *     <enumeration value="MMscm(15C)/d"/>
 *     <enumeration value="Mstb(60F)/d"/>
 *     <enumeration value="MMstb(60F)/d"/>
 *     <enumeration value="Mscf(60F)/d"/>
 *     <enumeration value="MMscf(60F)/d"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "StandardVolumePerTimeUom")
@XmlEnum
public enum StandardVolumePerTimeUom {

    @XmlEnumValue("scf(60F)/d")
    SCF_60_F_D("scf(60F)/d"),
    @XmlEnumValue("scm(15C)/s")
    SCM_15_C_S("scm(15C)/s"),
    @XmlEnumValue("scm(15C)/d")
    SCM_15_C_D("scm(15C)/d"),
    @XmlEnumValue("stb(60F)/d")
    STB_60_F_D("stb(60F)/d"),
    @XmlEnumValue("ksm3/d")
    KSM_3_D("ksm3/d"),
    @XmlEnumValue("Mscm(15C)/d")
    MSCM_15_C_D("Mscm(15C)/d"),
    @XmlEnumValue("MMscm(15C)/d")
    M_MSCM_15_C_D("MMscm(15C)/d"),
    @XmlEnumValue("Mstb(60F)/d")
    MSTB_60_F_D("Mstb(60F)/d"),
    @XmlEnumValue("MMstb(60F)/d")
    M_MSTB_60_F_D("MMstb(60F)/d"),
    @XmlEnumValue("Mscf(60F)/d")
    MSCF_60_F_D("Mscf(60F)/d"),
    @XmlEnumValue("MMscf(60F)/d")
    M_MSCF_60_F_D("MMscf(60F)/d");
    private final String value;

    StandardVolumePerTimeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardVolumePerTimeUom fromValue(String v) {
        for (StandardVolumePerTimeUom c: StandardVolumePerTimeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
