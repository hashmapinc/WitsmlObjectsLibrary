


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyPerAreaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="EnergyPerAreaUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="erg/cm2"/>
 *     <enumeration value="J/cm2"/>
 *     <enumeration value="J/m2"/>
 *     <enumeration value="kgf.m/cm2"/>
 *     <enumeration value="lbf.ft/in2"/>
 *     <enumeration value="mJ/cm2"/>
 *     <enumeration value="mJ/m2"/>
 *     <enumeration value="N/m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyPerAreaUom")
@XmlEnum
public enum EnergyPerAreaUom {


    /**
     * erg per square centimetre
     * 
     */
    @XmlEnumValue("erg/cm2")
    ERG_CM_2("erg/cm2"),

    /**
     * joule per square centimetre
     * 
     */
    @XmlEnumValue("J/cm2")
    J_CM_2("J/cm2"),

    /**
     * joule per square metre
     * 
     */
    @XmlEnumValue("J/m2")
    J_M_2("J/m2"),

    /**
     * thousand gram-force metre per square centimetre
     * 
     */
    @XmlEnumValue("kgf.m/cm2")
    KGF_M_CM_2("kgf.m/cm2"),

    /**
     * foot pound-force per square inch
     * 
     */
    @XmlEnumValue("lbf.ft/in2")
    LBF_FT_IN_2("lbf.ft/in2"),

    /**
     * millijoule per square centimetre
     * 
     */
    @XmlEnumValue("mJ/cm2")
    M_J_CM_2("mJ/cm2"),

    /**
     * millijoule per square metre
     * 
     */
    @XmlEnumValue("mJ/m2")
    M_J_M_2("mJ/m2"),

    /**
     * newton per metre
     * 
     */
    @XmlEnumValue("N/m")
    N_M("N/m");
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
