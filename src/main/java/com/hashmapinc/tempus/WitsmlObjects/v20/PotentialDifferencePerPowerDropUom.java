


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PotentialDifferencePerPowerDropUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PotentialDifferencePerPowerDropUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="V/B"/>
 *     <enumeration value="V/dB"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PotentialDifferencePerPowerDropUom")
@XmlEnum
public enum PotentialDifferencePerPowerDropUom {


    /**
     * volt per bel
     * 
     */
    @XmlEnumValue("V/B")
    V_B("V/B"),

    /**
     * volt per decibel
     * 
     */
    @XmlEnumValue("V/dB")
    V_D_B("V/dB");
    private final String value;

    PotentialDifferencePerPowerDropUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PotentialDifferencePerPowerDropUom fromValue(String v) {
        for (PotentialDifferencePerPowerDropUom c: PotentialDifferencePerPowerDropUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
