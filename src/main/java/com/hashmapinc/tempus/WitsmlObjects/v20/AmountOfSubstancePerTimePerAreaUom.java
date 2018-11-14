


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountOfSubstancePerTimePerAreaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AmountOfSubstancePerTimePerAreaUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="lbmol/(h.ft2)"/>
 *     <enumeration value="lbmol/(s.ft2)"/>
 *     <enumeration value="mol/(s.m2)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmountOfSubstancePerTimePerAreaUom")
@XmlEnum
public enum AmountOfSubstancePerTimePerAreaUom {


    /**
     * pound-mass-mole per hour square foot
     * 
     */
    @XmlEnumValue("lbmol/(h.ft2)")
    LBMOL_H_FT_2("lbmol/(h.ft2)"),

    /**
     * pound-mass-mole per second square foot
     * 
     */
    @XmlEnumValue("lbmol/(s.ft2)")
    LBMOL_S_FT_2("lbmol/(s.ft2)"),

    /**
     * gram-mole per second square metre
     * 
     */
    @XmlEnumValue("mol/(s.m2)")
    MOL_S_M_2("mol/(s.m2)");
    private final String value;

    AmountOfSubstancePerTimePerAreaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountOfSubstancePerTimePerAreaUom fromValue(String v) {
        for (AmountOfSubstancePerTimePerAreaUom c: AmountOfSubstancePerTimePerAreaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
