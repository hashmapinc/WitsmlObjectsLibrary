


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IlluminanceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="IlluminanceUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="footcandle"/>
 *     <enumeration value="klx"/>
 *     <enumeration value="lm/m2"/>
 *     <enumeration value="lx"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IlluminanceUom")
@XmlEnum
public enum IlluminanceUom {


    /**
     * footcandle
     * 
     */
    @XmlEnumValue("footcandle")
    FOOTCANDLE("footcandle"),

    /**
     * kilolux
     * 
     */
    @XmlEnumValue("klx")
    KLX("klx"),

    /**
     * lumen per square metre
     * 
     */
    @XmlEnumValue("lm/m2")
    LM_M_2("lm/m2"),

    /**
     * lux
     * 
     */
    @XmlEnumValue("lx")
    LX("lx");
    private final String value;

    IlluminanceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IlluminanceUom fromValue(String v) {
        for (IlluminanceUom c: IlluminanceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
