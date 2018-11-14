


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumePerTimePerTimeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="VolumePerTimePerTimeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="bbl/d2"/>
 *     <enumeration value="bbl/h2"/>
 *     <enumeration value="dm3/s2"/>
 *     <enumeration value="ft3/d2"/>
 *     <enumeration value="ft3/h2"/>
 *     <enumeration value="ft3/min2"/>
 *     <enumeration value="ft3/s2"/>
 *     <enumeration value="gal[UK]/h2"/>
 *     <enumeration value="gal[UK]/min2"/>
 *     <enumeration value="gal[US]/h2"/>
 *     <enumeration value="gal[US]/min2"/>
 *     <enumeration value="L/s2"/>
 *     <enumeration value="m3/d2"/>
 *     <enumeration value="m3/s2"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VolumePerTimePerTimeUom")
@XmlEnum
public enum VolumePerTimePerTimeUom {


    /**
     * (barrel per day) per day
     * 
     */
    @XmlEnumValue("bbl/d2")
    BBL_D_2("bbl/d2"),

    /**
     * (barrel per hour) per hour
     * 
     */
    @XmlEnumValue("bbl/h2")
    BBL_H_2("bbl/h2"),

    /**
     * (cubic decimetre per second) per second
     * 
     */
    @XmlEnumValue("dm3/s2")
    DM_3_S_2("dm3/s2"),

    /**
     * (cubic foot per day) per day
     * 
     */
    @XmlEnumValue("ft3/d2")
    FT_3_D_2("ft3/d2"),

    /**
     * (cubic foot per hour) per hour
     * 
     */
    @XmlEnumValue("ft3/h2")
    FT_3_H_2("ft3/h2"),

    /**
     * (cubic foot per minute) per minute
     * 
     */
    @XmlEnumValue("ft3/min2")
    FT_3_MIN_2("ft3/min2"),

    /**
     * (cubic foot per second) per second
     * 
     */
    @XmlEnumValue("ft3/s2")
    FT_3_S_2("ft3/s2"),

    /**
     * (UK gallon per hour) per hour
     * 
     */
    @XmlEnumValue("gal[UK]/h2")
    GAL_UK_H_2("gal[UK]/h2"),

    /**
     * (UK gallon per minute) per minute
     * 
     */
    @XmlEnumValue("gal[UK]/min2")
    GAL_UK_MIN_2("gal[UK]/min2"),

    /**
     * (US gallon per hour) per hour
     * 
     */
    @XmlEnumValue("gal[US]/h2")
    GAL_US_H_2("gal[US]/h2"),

    /**
     * (US gallon per minute) per minute
     * 
     */
    @XmlEnumValue("gal[US]/min2")
    GAL_US_MIN_2("gal[US]/min2"),

    /**
     * (litre per second) per second
     * 
     */
    @XmlEnumValue("L/s2")
    L_S_2("L/s2"),

    /**
     * (cubic metre per day) per day
     * 
     */
    @XmlEnumValue("m3/d2")
    M_3_D_2("m3/d2"),

    /**
     * cubic metre per second squared
     * 
     */
    @XmlEnumValue("m3/s2")
    M_3_S_2("m3/s2");
    private final String value;

    VolumePerTimePerTimeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumePerTimePerTimeUom fromValue(String v) {
        for (VolumePerTimePerTimeUom c: VolumePerTimePerTimeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
