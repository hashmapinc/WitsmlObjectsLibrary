package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeflectionMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="DeflectionMethod">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="point bit"/>
 *     <enumeration value="push bit"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "DeflectionMethod")
@XmlEnum
public enum DeflectionMethod {


    /**
     * Rotary Steerable System that deviates a 
     * 					wellbore by tilting the bit to point it in the desired 
     * 					direction.
     * 
     */
    @XmlEnumValue("point bit")
    POINT_BIT("point bit"),

    /**
     * Rotary Steerable System that deviates 
     * 					a wellbore by inducing a side force to push the bit in 
     * 					the desired direction.
     * 
     */
    @XmlEnumValue("push bit")
    PUSH_BIT("push bit");
    private final String value;

    DeflectionMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeflectionMethod fromValue(String v) {
        for (DeflectionMethod c: DeflectionMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
