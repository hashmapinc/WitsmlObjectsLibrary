


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogarithmicPowerRatioPerLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LogarithmicPowerRatioPerLengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="B/m"/>
 *     <enumeration value="dB/ft"/>
 *     <enumeration value="dB/km"/>
 *     <enumeration value="dB/m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LogarithmicPowerRatioPerLengthUom")
@XmlEnum
public enum LogarithmicPowerRatioPerLengthUom {


    /**
     * bel per metre
     * 
     */
    @XmlEnumValue("B/m")
    B_M("B/m"),

    /**
     * decibel per foot
     * 
     */
    @XmlEnumValue("dB/ft")
    D_B_FT("dB/ft"),

    /**
     * decibel per kilometre
     * 
     */
    @XmlEnumValue("dB/km")
    D_B_KM("dB/km"),

    /**
     * decibel per metre
     * 
     */
    @XmlEnumValue("dB/m")
    D_B_M("dB/m");
    private final String value;

    LogarithmicPowerRatioPerLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogarithmicPowerRatioPerLengthUom fromValue(String v) {
        for (LogarithmicPowerRatioPerLengthUom c: LogarithmicPowerRatioPerLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
