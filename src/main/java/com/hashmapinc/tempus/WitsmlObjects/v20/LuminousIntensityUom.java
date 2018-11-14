


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LuminousIntensityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LuminousIntensityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="cd"/>
 *     <enumeration value="kcd"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuminousIntensityUom")
@XmlEnum
public enum LuminousIntensityUom {


    /**
     * candela
     * 
     */
    @XmlEnumValue("cd")
    CD("cd"),

    /**
     * kilocandela
     * 
     */
    @XmlEnumValue("kcd")
    KCD("kcd");
    private final String value;

    LuminousIntensityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuminousIntensityUom fromValue(String v) {
        for (LuminousIntensityUom c: LuminousIntensityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
