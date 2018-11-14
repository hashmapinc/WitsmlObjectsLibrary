


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LightExposureUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LightExposureUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="footcandle.s"/>
 *     <enumeration value="lx.s"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LightExposureUom")
@XmlEnum
public enum LightExposureUom {


    /**
     * footcandle second
     * 
     */
    @XmlEnumValue("footcandle.s")
    FOOTCANDLE_S("footcandle.s"),

    /**
     * lux second
     * 
     */
    @XmlEnumValue("lx.s")
    LX_S("lx.s");
    private final String value;

    LightExposureUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LightExposureUom fromValue(String v) {
        for (LightExposureUom c: LightExposureUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
