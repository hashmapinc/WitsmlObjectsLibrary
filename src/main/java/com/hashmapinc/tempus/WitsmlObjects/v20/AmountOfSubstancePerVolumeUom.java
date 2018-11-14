


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountOfSubstancePerVolumeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AmountOfSubstancePerVolumeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kmol/m3"/>
 *     <enumeration value="lbmol/ft3"/>
 *     <enumeration value="lbmol/gal[UK]"/>
 *     <enumeration value="lbmol/gal[US]"/>
 *     <enumeration value="mol/m3"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmountOfSubstancePerVolumeUom")
@XmlEnum
public enum AmountOfSubstancePerVolumeUom {


    /**
     * kilogram-mole per cubic metre
     * 
     */
    @XmlEnumValue("kmol/m3")
    KMOL_M_3("kmol/m3"),

    /**
     * pound-mass-mole per cubic foot
     * 
     */
    @XmlEnumValue("lbmol/ft3")
    LBMOL_FT_3("lbmol/ft3"),

    /**
     * pound-mass-mole per UK gallon
     * 
     */
    @XmlEnumValue("lbmol/gal[UK]")
    LBMOL_GAL_UK("lbmol/gal[UK]"),

    /**
     * pound-mass-mole per US gallon
     * 
     */
    @XmlEnumValue("lbmol/gal[US]")
    LBMOL_GAL_US("lbmol/gal[US]"),

    /**
     * gram-mole per cubic metre
     * 
     */
    @XmlEnumValue("mol/m3")
    MOL_M_3("mol/m3");
    private final String value;

    AmountOfSubstancePerVolumeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountOfSubstancePerVolumeUom fromValue(String v) {
        for (AmountOfSubstancePerVolumeUom c: AmountOfSubstancePerVolumeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
