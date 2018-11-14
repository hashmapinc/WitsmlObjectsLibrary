


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AziRef.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AziRef">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="magnetic north"/>
 *     <enumeration value="grid north"/>
 *     <enumeration value="true north"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AziRef", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum AziRef {


    /**
     * The north direction as defined by Magnetic North Pole at the time of the measurement. The Magnetic North Pole is the direction that a magnet points to when freely rotating.
     * 
     */
    @XmlEnumValue("magnetic north")
    MAGNETIC_NORTH("magnetic north"),

    /**
     * The north direction is defined by the coordinate grid in the projection coordinate system.
     * 
     */
    @XmlEnumValue("grid north")
    GRID_NORTH("grid north"),

    /**
     * The north direction as defined by the true North Pole. The true North Pole is an average of the actual measured north axis, which is the axis of rotation of the earth.
     * 
     */
    @XmlEnumValue("true north")
    TRUE_NORTH("true north");
    private final String value;

    AziRef(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AziRef fromValue(String v) {
        for (AziRef c: AziRef.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
