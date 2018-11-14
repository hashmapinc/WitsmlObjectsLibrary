


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemperatureIntervalUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="TemperatureIntervalUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="deltaC"/>
 *     <enumeration value="deltaF"/>
 *     <enumeration value="deltaK"/>
 *     <enumeration value="deltaR"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TemperatureIntervalUom")
@XmlEnum
public enum TemperatureIntervalUom {


    /**
     * delta Celsius
     * 
     */
    @XmlEnumValue("deltaC")
    DELTA_C("deltaC"),

    /**
     * delta Fahrenheit
     * 
     */
    @XmlEnumValue("deltaF")
    DELTA_F("deltaF"),

    /**
     * delta kelvin
     * 
     */
    @XmlEnumValue("deltaK")
    DELTA_K("deltaK"),

    /**
     * delta Rankine
     * 
     */
    @XmlEnumValue("deltaR")
    DELTA_R("deltaR");
    private final String value;

    TemperatureIntervalUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemperatureIntervalUom fromValue(String v) {
        for (TemperatureIntervalUom c: TemperatureIntervalUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
