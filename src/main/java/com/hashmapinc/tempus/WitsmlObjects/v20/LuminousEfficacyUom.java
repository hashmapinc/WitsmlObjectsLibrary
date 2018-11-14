


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LuminousEfficacyUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LuminousEfficacyUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="lm/W"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuminousEfficacyUom")
@XmlEnum
public enum LuminousEfficacyUom {


    /**
     * lumen per watt
     * 
     */
    @XmlEnumValue("lm/W")
    LM_W("lm/W");
    private final String value;

    LuminousEfficacyUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuminousEfficacyUom fromValue(String v) {
        for (LuminousEfficacyUom c: LuminousEfficacyUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
