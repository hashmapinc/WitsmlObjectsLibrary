


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumePerTimePerAreaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="VolumePerTimePerAreaUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="ft3/(min.ft2)"/>
 *     <enumeration value="ft3/(s.ft2)"/>
 *     <enumeration value="gal[UK]/(h.ft2)"/>
 *     <enumeration value="gal[UK]/(h.in2)"/>
 *     <enumeration value="gal[UK]/(min.ft2)"/>
 *     <enumeration value="gal[US]/(h.ft2)"/>
 *     <enumeration value="gal[US]/(h.in2)"/>
 *     <enumeration value="gal[US]/(min.ft2)"/>
 *     <enumeration value="m3/(s.m2)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VolumePerTimePerAreaUom")
@XmlEnum
public enum VolumePerTimePerAreaUom {


    /**
     * cubic foot per minute square foot
     * 
     */
    @XmlEnumValue("ft3/(min.ft2)")
    FT_3_MIN_FT_2("ft3/(min.ft2)"),

    /**
     * cubic foot per second square foot
     * 
     */
    @XmlEnumValue("ft3/(s.ft2)")
    FT_3_S_FT_2("ft3/(s.ft2)"),

    /**
     * UK gallon per hour square foot
     * 
     */
    @XmlEnumValue("gal[UK]/(h.ft2)")
    GAL_UK_H_FT_2("gal[UK]/(h.ft2)"),

    /**
     * UK gallon per hour square inch
     * 
     */
    @XmlEnumValue("gal[UK]/(h.in2)")
    GAL_UK_H_IN_2("gal[UK]/(h.in2)"),

    /**
     * UK gallon per minute square foot
     * 
     */
    @XmlEnumValue("gal[UK]/(min.ft2)")
    GAL_UK_MIN_FT_2("gal[UK]/(min.ft2)"),

    /**
     * US gallon per hour square foot
     * 
     */
    @XmlEnumValue("gal[US]/(h.ft2)")
    GAL_US_H_FT_2("gal[US]/(h.ft2)"),

    /**
     * US gallon per hour square inch
     * 
     */
    @XmlEnumValue("gal[US]/(h.in2)")
    GAL_US_H_IN_2("gal[US]/(h.in2)"),

    /**
     * US gallon per minute square foot
     * 
     */
    @XmlEnumValue("gal[US]/(min.ft2)")
    GAL_US_MIN_FT_2("gal[US]/(min.ft2)"),

    /**
     * cubic metre per second square metre
     * 
     */
    @XmlEnumValue("m3/(s.m2)")
    M_3_S_M_2("m3/(s.m2)");
    private final String value;

    VolumePerTimePerAreaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumePerTimePerAreaUom fromValue(String v) {
        for (VolumePerTimePerAreaUom c: VolumePerTimePerAreaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
