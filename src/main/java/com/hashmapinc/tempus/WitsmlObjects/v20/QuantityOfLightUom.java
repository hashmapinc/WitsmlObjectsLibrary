


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityOfLightUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="QuantityOfLightUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="lm.s"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuantityOfLightUom")
@XmlEnum
public enum QuantityOfLightUom {


    /**
     * lumen second
     * 
     */
    @XmlEnumValue("lm.s")
    LM_S("lm.s");
    private final String value;

    QuantityOfLightUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantityOfLightUom fromValue(String v) {
        for (QuantityOfLightUom c: QuantityOfLightUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
