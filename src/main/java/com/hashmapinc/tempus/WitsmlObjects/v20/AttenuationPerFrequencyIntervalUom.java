


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttenuationPerFrequencyIntervalUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AttenuationPerFrequencyIntervalUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="B/O"/>
 *     <enumeration value="dB/O"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttenuationPerFrequencyIntervalUom")
@XmlEnum
public enum AttenuationPerFrequencyIntervalUom {


    /**
     * bel per octave
     * 
     */
    @XmlEnumValue("B/O")
    B_O("B/O"),

    /**
     * decibel per octave
     * 
     */
    @XmlEnumValue("dB/O")
    D_B_O("dB/O");
    private final String value;

    AttenuationPerFrequencyIntervalUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttenuationPerFrequencyIntervalUom fromValue(String v) {
        for (AttenuationPerFrequencyIntervalUom c: AttenuationPerFrequencyIntervalUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
