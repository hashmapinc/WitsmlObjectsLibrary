


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogarithmicPowerRatioUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LogarithmicPowerRatioUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="B"/>
 *     <enumeration value="dB"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LogarithmicPowerRatioUom")
@XmlEnum
public enum LogarithmicPowerRatioUom {


    /**
     * bel
     * 
     */
    B("B"),

    /**
     * decibel
     * 
     */
    @XmlEnumValue("dB")
    D_B("dB");
    private final String value;

    LogarithmicPowerRatioUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogarithmicPowerRatioUom fromValue(String v) {
        for (LogarithmicPowerRatioUom c: LogarithmicPowerRatioUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
