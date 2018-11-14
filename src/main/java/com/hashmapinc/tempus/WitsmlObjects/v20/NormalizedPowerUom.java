


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NormalizedPowerUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="NormalizedPowerUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="B.W"/>
 *     <enumeration value="dB.mW"/>
 *     <enumeration value="dB.MW"/>
 *     <enumeration value="dB.W"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NormalizedPowerUom")
@XmlEnum
public enum NormalizedPowerUom {


    /**
     * bel watt
     * 
     */
    @XmlEnumValue("B.W")
    B_W("B.W"),

    /**
     * decibel milliwatt
     * 
     */
    @XmlEnumValue("dB.mW")
    D_B_M_W("dB.mW"),

    /**
     * decibel megawatt
     * 
     */
    @XmlEnumValue("dB.MW")
    D_B_MW("dB.MW"),

    /**
     * decibel watt
     * 
     */
    @XmlEnumValue("dB.W")
    D_B_W("dB.W");
    private final String value;

    NormalizedPowerUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormalizedPowerUom fromValue(String v) {
        for (NormalizedPowerUom c: NormalizedPowerUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
