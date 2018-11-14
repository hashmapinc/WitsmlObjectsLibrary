


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ChannelState">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="calculated"/>
 *     <enumeration value="final"/>
 *     <enumeration value="memory"/>
 *     <enumeration value="processed"/>
 *     <enumeration value="real time"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChannelState", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum ChannelState {


    /**
     * Calculated from measurements
     * 
     */
    @XmlEnumValue("calculated")
    CALCULATED("calculated"),

    /**
     * Considered final and not subject to change
     * 
     */
    @XmlEnumValue("final")
    FINAL("final"),

    /**
     * Sensor data is recorded into downhole memory of a tool, rather than transmitting in "real time" to surface. 
     * 
     */
    @XmlEnumValue("memory")
    MEMORY("memory"),

    /**
     * Results of calculations based on measurements
     * 
     */
    @XmlEnumValue("processed")
    PROCESSED("processed"),

    /**
     * Measurements at the actual time.
     * 
     */
    @XmlEnumValue("real time")
    REAL_TIME("real time");
    private final String value;

    ChannelState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelState fromValue(String v) {
        for (ChannelState c: ChannelState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
