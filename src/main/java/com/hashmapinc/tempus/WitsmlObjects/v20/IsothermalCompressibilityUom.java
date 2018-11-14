


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IsothermalCompressibilityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="IsothermalCompressibilityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="dm3/(kW.h)"/>
 *     <enumeration value="dm3/MJ"/>
 *     <enumeration value="m3/(kW.h)"/>
 *     <enumeration value="m3/J"/>
 *     <enumeration value="mm3/J"/>
 *     <enumeration value="pt[UK]/(hp.h)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IsothermalCompressibilityUom")
@XmlEnum
public enum IsothermalCompressibilityUom {


    /**
     * cubic decimetre per kilowatt hour
     * 
     */
    @XmlEnumValue("dm3/(kW.h)")
    DM_3_K_W_H("dm3/(kW.h)"),

    /**
     * cubic decimetre per megajoule
     * 
     */
    @XmlEnumValue("dm3/MJ")
    DM_3_MJ("dm3/MJ"),

    /**
     * cubic metre per kilowatt hour
     * 
     */
    @XmlEnumValue("m3/(kW.h)")
    M_3_K_W_H("m3/(kW.h)"),

    /**
     * cubic metre per joule
     * 
     */
    @XmlEnumValue("m3/J")
    M_3_J("m3/J"),

    /**
     * cubic millimetre per joule
     * 
     */
    @XmlEnumValue("mm3/J")
    MM_3_J("mm3/J"),

    /**
     * UK pint per horsepower hour
     * 
     */
    @XmlEnumValue("pt[UK]/(hp.h)")
    PT_UK_HP_H("pt[UK]/(hp.h)");
    private final String value;

    IsothermalCompressibilityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IsothermalCompressibilityUom fromValue(String v) {
        for (IsothermalCompressibilityUom c: IsothermalCompressibilityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
