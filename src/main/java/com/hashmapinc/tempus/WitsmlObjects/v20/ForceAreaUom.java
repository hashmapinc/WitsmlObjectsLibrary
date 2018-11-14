


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForceAreaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ForceAreaUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="dyne.cm2"/>
 *     <enumeration value="kgf.m2"/>
 *     <enumeration value="kN.m2"/>
 *     <enumeration value="lbf.in2"/>
 *     <enumeration value="mN.m2"/>
 *     <enumeration value="N.m2"/>
 *     <enumeration value="pdl.cm2"/>
 *     <enumeration value="tonf[UK].ft2"/>
 *     <enumeration value="tonf[US].ft2"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForceAreaUom")
@XmlEnum
public enum ForceAreaUom {


    /**
     * dyne square centimetre
     * 
     */
    @XmlEnumValue("dyne.cm2")
    DYNE_CM_2("dyne.cm2"),

    /**
     * thousand gram-force square metre
     * 
     */
    @XmlEnumValue("kgf.m2")
    KGF_M_2("kgf.m2"),

    /**
     * kilonewton square metre
     * 
     */
    @XmlEnumValue("kN.m2")
    K_N_M_2("kN.m2"),

    /**
     * pound-force square inch
     * 
     */
    @XmlEnumValue("lbf.in2")
    LBF_IN_2("lbf.in2"),

    /**
     * millinewton square metre
     * 
     */
    @XmlEnumValue("mN.m2")
    M_N_M_2("mN.m2"),

    /**
     * newton square metre
     * 
     */
    @XmlEnumValue("N.m2")
    N_M_2("N.m2"),

    /**
     * poundal square centimetre
     * 
     */
    @XmlEnumValue("pdl.cm2")
    PDL_CM_2("pdl.cm2"),

    /**
     * UK ton-force square foot
     * 
     */
    @XmlEnumValue("tonf[UK].ft2")
    TONF_UK_FT_2("tonf[UK].ft2"),

    /**
     * US ton-force square foot
     * 
     */
    @XmlEnumValue("tonf[US].ft2")
    TONF_US_FT_2("tonf[US].ft2");
    private final String value;

    ForceAreaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForceAreaUom fromValue(String v) {
        for (ForceAreaUom c: ForceAreaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
