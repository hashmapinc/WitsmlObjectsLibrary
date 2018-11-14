


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LuminousFluxUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LuminousFluxUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="lm"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuminousFluxUom")
@XmlEnum
public enum LuminousFluxUom {


    /**
     * lumen
     * 
     */
    @XmlEnumValue("lm")
    LM("lm");
    private final String value;

    LuminousFluxUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuminousFluxUom fromValue(String v) {
        for (LuminousFluxUom c: LuminousFluxUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
