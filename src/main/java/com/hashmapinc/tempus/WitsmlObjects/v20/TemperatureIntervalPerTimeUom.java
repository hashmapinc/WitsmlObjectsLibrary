


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemperatureIntervalPerTimeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="TemperatureIntervalPerTimeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="deltaC/h"/>
 *     <enumeration value="deltaC/min"/>
 *     <enumeration value="deltaC/s"/>
 *     <enumeration value="deltaF/h"/>
 *     <enumeration value="deltaF/min"/>
 *     <enumeration value="deltaF/s"/>
 *     <enumeration value="deltaK/s"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TemperatureIntervalPerTimeUom")
@XmlEnum
public enum TemperatureIntervalPerTimeUom {


    /**
     * delta Celsius per hour
     * 
     */
    @XmlEnumValue("deltaC/h")
    DELTA_C_H("deltaC/h"),

    /**
     * delta Celsius per minute
     * 
     */
    @XmlEnumValue("deltaC/min")
    DELTA_C_MIN("deltaC/min"),

    /**
     * delta Celsius per second
     * 
     */
    @XmlEnumValue("deltaC/s")
    DELTA_C_S("deltaC/s"),

    /**
     * delta Fahrenheit per hour
     * 
     */
    @XmlEnumValue("deltaF/h")
    DELTA_F_H("deltaF/h"),

    /**
     * delta Fahrenheit per minute
     * 
     */
    @XmlEnumValue("deltaF/min")
    DELTA_F_MIN("deltaF/min"),

    /**
     * delta Fahrenheit per second
     * 
     */
    @XmlEnumValue("deltaF/s")
    DELTA_F_S("deltaF/s"),

    /**
     * delta kelvin per second
     * 
     */
    @XmlEnumValue("deltaK/s")
    DELTA_K_S("deltaK/s");
    private final String value;

    TemperatureIntervalPerTimeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemperatureIntervalPerTimeUom fromValue(String v) {
        for (TemperatureIntervalPerTimeUom c: TemperatureIntervalPerTimeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
