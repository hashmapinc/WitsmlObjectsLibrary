


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LengthPerVolumeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LengthPerVolumeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="ft/bbl"/>
 *     <enumeration value="ft/ft3"/>
 *     <enumeration value="ft/gal[US]"/>
 *     <enumeration value="km/dm3"/>
 *     <enumeration value="km/L"/>
 *     <enumeration value="m/m3"/>
 *     <enumeration value="mi/gal[UK]"/>
 *     <enumeration value="mi/gal[US]"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LengthPerVolumeUom")
@XmlEnum
public enum LengthPerVolumeUom {


    /**
     * foot per barrel
     * 
     */
    @XmlEnumValue("ft/bbl")
    FT_BBL("ft/bbl"),

    /**
     * foot per cubic foot
     * 
     */
    @XmlEnumValue("ft/ft3")
    FT_FT_3("ft/ft3"),

    /**
     * foot per US gallon
     * 
     */
    @XmlEnumValue("ft/gal[US]")
    FT_GAL_US("ft/gal[US]"),

    /**
     * kilometre per cubic decimetre
     * 
     */
    @XmlEnumValue("km/dm3")
    KM_DM_3("km/dm3"),

    /**
     * kilometre per litre
     * 
     */
    @XmlEnumValue("km/L")
    KM_L("km/L"),

    /**
     * metre per cubic metre
     * 
     */
    @XmlEnumValue("m/m3")
    M_M_3("m/m3"),

    /**
     * mile per UK gallon
     * 
     */
    @XmlEnumValue("mi/gal[UK]")
    MI_GAL_UK("mi/gal[UK]"),

    /**
     * mile per US gallon
     * 
     */
    @XmlEnumValue("mi/gal[US]")
    MI_GAL_US("mi/gal[US]");
    private final String value;

    LengthPerVolumeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LengthPerVolumeUom fromValue(String v) {
        for (LengthPerVolumeUom c: LengthPerVolumeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
