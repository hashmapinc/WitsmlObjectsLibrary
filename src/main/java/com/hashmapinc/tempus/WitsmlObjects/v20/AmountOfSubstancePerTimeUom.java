


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountOfSubstancePerTimeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AmountOfSubstancePerTimeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kat"/>
 *     <enumeration value="kmol/h"/>
 *     <enumeration value="kmol/s"/>
 *     <enumeration value="lbmol/h"/>
 *     <enumeration value="lbmol/s"/>
 *     <enumeration value="mol/s"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmountOfSubstancePerTimeUom")
@XmlEnum
public enum AmountOfSubstancePerTimeUom {


    /**
     * katal
     * 
     */
    @XmlEnumValue("kat")
    KAT("kat"),

    /**
     * kilogram-mole per hour
     * 
     */
    @XmlEnumValue("kmol/h")
    KMOL_H("kmol/h"),

    /**
     * kilogram-mole per second
     * 
     */
    @XmlEnumValue("kmol/s")
    KMOL_S("kmol/s"),

    /**
     * pound-mass-mole per hour
     * 
     */
    @XmlEnumValue("lbmol/h")
    LBMOL_H("lbmol/h"),

    /**
     * pound-mass-mole per second
     * 
     */
    @XmlEnumValue("lbmol/s")
    LBMOL_S("lbmol/s"),

    /**
     * gram-mole per second
     * 
     */
    @XmlEnumValue("mol/s")
    MOL_S("mol/s");
    private final String value;

    AmountOfSubstancePerTimeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountOfSubstancePerTimeUom fromValue(String v) {
        for (AmountOfSubstancePerTimeUom c: AmountOfSubstancePerTimeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
