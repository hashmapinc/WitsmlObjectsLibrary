


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LengthPerPressureUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LengthPerPressureUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="ft/psi"/>
 *     <enumeration value="m/kPa"/>
 *     <enumeration value="m/Pa"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LengthPerPressureUom")
@XmlEnum
public enum LengthPerPressureUom {


    /**
     * foot per psi
     * 
     */
    @XmlEnumValue("ft/psi")
    FT_PSI("ft/psi"),

    /**
     * metre per kilopascal
     * 
     */
    @XmlEnumValue("m/kPa")
    M_K_PA("m/kPa"),

    /**
     * metre per Pascal
     * 
     */
    @XmlEnumValue("m/Pa")
    M_PA("m/Pa");
    private final String value;

    LengthPerPressureUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LengthPerPressureUom fromValue(String v) {
        for (LengthPerPressureUom c: LengthPerPressureUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
