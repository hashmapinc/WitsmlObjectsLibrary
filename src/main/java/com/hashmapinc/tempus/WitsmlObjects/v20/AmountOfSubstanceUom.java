


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountOfSubstanceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AmountOfSubstanceUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kmol"/>
 *     <enumeration value="lbmol"/>
 *     <enumeration value="mmol"/>
 *     <enumeration value="mol"/>
 *     <enumeration value="umol"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmountOfSubstanceUom")
@XmlEnum
public enum AmountOfSubstanceUom {


    /**
     * kilogram-mole
     * 
     */
    @XmlEnumValue("kmol")
    KMOL("kmol"),

    /**
     * pound-mass-mole
     * 
     */
    @XmlEnumValue("lbmol")
    LBMOL("lbmol"),

    /**
     * milligram-mole
     * 
     */
    @XmlEnumValue("mmol")
    MMOL("mmol"),

    /**
     * gram-mole
     * 
     */
    @XmlEnumValue("mol")
    MOL("mol"),

    /**
     * microgram-mole
     * 
     */
    @XmlEnumValue("umol")
    UMOL("umol");
    private final String value;

    AmountOfSubstanceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountOfSubstanceUom fromValue(String v) {
        for (AmountOfSubstanceUom c: AmountOfSubstanceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
