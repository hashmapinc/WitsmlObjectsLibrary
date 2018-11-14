


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelDerivation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ChannelDerivation">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="raw"/>
 *     <enumeration value="simulated"/>
 *     <enumeration value="spliced"/>
 *     <enumeration value="sampled"/>
 *     <enumeration value="model"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChannelDerivation", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum ChannelDerivation {


    /**
     * Raw measured data, directly from sensors.
     * 
     */
    @XmlEnumValue("raw")
    RAW("raw"),

    /**
     * Simulated.
     * 
     */
    @XmlEnumValue("simulated")
    SIMULATED("simulated"),

    /**
     * Derived by splicing values from two or more other channels.
     * 
     */
    @XmlEnumValue("spliced")
    SPLICED("spliced"),

    /**
     * Derived by sampling values from one or more other channels.
     * 
     */
    @XmlEnumValue("sampled")
    SAMPLED("sampled"),

    /**
     * Based on some modeled results of values in another one or more channels.
     * 
     */
    @XmlEnumValue("model")
    MODEL("model");
    private final String value;

    ChannelDerivation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelDerivation fromValue(String v) {
        for (ChannelDerivation c: ChannelDerivation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
