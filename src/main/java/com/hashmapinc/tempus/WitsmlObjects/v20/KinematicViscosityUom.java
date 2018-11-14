


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KinematicViscosityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="KinematicViscosityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="cm2/s"/>
 *     <enumeration value="cSt"/>
 *     <enumeration value="ft2/h"/>
 *     <enumeration value="ft2/s"/>
 *     <enumeration value="in2/s"/>
 *     <enumeration value="m2/h"/>
 *     <enumeration value="m2/s"/>
 *     <enumeration value="mm2/s"/>
 *     <enumeration value="Pa.s.m3/kg"/>
 *     <enumeration value="St"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KinematicViscosityUom")
@XmlEnum
public enum KinematicViscosityUom {


    /**
     * square centimetre per second
     * 
     */
    @XmlEnumValue("cm2/s")
    CM_2_S("cm2/s"),

    /**
     * centistokes
     * 
     */
    @XmlEnumValue("cSt")
    C_ST("cSt"),

    /**
     * square foot per hour
     * 
     */
    @XmlEnumValue("ft2/h")
    FT_2_H("ft2/h"),

    /**
     * square foot per second
     * 
     */
    @XmlEnumValue("ft2/s")
    FT_2_S("ft2/s"),

    /**
     * square inch per second
     * 
     */
    @XmlEnumValue("in2/s")
    IN_2_S("in2/s"),

    /**
     * square metre per hour
     * 
     */
    @XmlEnumValue("m2/h")
    M_2_H("m2/h"),

    /**
     * square metre per second
     * 
     */
    @XmlEnumValue("m2/s")
    M_2_S("m2/s"),

    /**
     * square millimetre per second
     * 
     */
    @XmlEnumValue("mm2/s")
    MM_2_S("mm2/s"),

    /**
     * pascal second square metre per kilogram
     * 
     */
    @XmlEnumValue("Pa.s.m3/kg")
    PA_S_M_3_KG("Pa.s.m3/kg"),

    /**
     * stokes
     * 
     */
    @XmlEnumValue("St")
    ST("St");
    private final String value;

    KinematicViscosityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KinematicViscosityUom fromValue(String v) {
        for (KinematicViscosityUom c: KinematicViscosityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
