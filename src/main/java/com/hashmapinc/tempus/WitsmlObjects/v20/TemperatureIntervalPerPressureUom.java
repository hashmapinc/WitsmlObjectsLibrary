


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemperatureIntervalPerPressureUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="TemperatureIntervalPerPressureUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="deltaC/kPa"/>
 *     <enumeration value="deltaF/psi"/>
 *     <enumeration value="deltaK/Pa"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TemperatureIntervalPerPressureUom")
@XmlEnum
public enum TemperatureIntervalPerPressureUom {


    /**
     * delta Celsius per kilopascal
     * 
     */
    @XmlEnumValue("deltaC/kPa")
    DELTA_C_K_PA("deltaC/kPa"),

    /**
     * delta Fahrenheit per psi
     * 
     */
    @XmlEnumValue("deltaF/psi")
    DELTA_F_PSI("deltaF/psi"),

    /**
     * delta kelvin per Pascal
     * 
     */
    @XmlEnumValue("deltaK/Pa")
    DELTA_K_PA("deltaK/Pa");
    private final String value;

    TemperatureIntervalPerPressureUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemperatureIntervalPerPressureUom fromValue(String v) {
        for (TemperatureIntervalPerPressureUom c: TemperatureIntervalPerPressureUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
