


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellboreType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="WellboreType">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="bypass"/>
 *     <enumeration value="initial"/>
 *     <enumeration value="redrill"/>
 *     <enumeration value="reentry"/>
 *     <enumeration value="respud"/>
 *     <enumeration value="sidetrack"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WellboreType", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum WellboreType {


    /**
     * The original wellbore had to be abandoned before 
     * its final usage. This wellbore is being drilled as a different 
     * wellbore, but one which has the same target as the one that was 
     * abandoned.
     * 
     */
    @XmlEnumValue("bypass")
    BYPASS("bypass"),

    /**
     * This is the first wellbore that has been 
     * drilled, or attempted, in a given well.
     * 
     */
    @XmlEnumValue("initial")
    INITIAL("initial"),

    /**
     * The wellbore is being redrilled.
     * 
     */
    @XmlEnumValue("redrill")
    REDRILL("redrill"),

    /**
     * The wellbore is being reentered after a period 
     * of abandonment.
     * 
     */
    @XmlEnumValue("reentry")
    REENTRY("reentry"),

    /**
     * The wellbore is part of an existing regulatory well. 
     * The original borehole did not reach the target depth. This borehole 
     * required the well to be respudded (drilled from a different surface 
     * position).
     * 
     */
    @XmlEnumValue("respud")
    RESPUD("respud"),

    /**
     * The wellbore is a deviation from a given wellbore that produces a different borehole from the others, and whose bottomhole differs from any previously existing wellbore bottomholes.
     * 
     */
    @XmlEnumValue("sidetrack")
    SIDETRACK("sidetrack");
    private final String value;

    WellboreType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WellboreType fromValue(String v) {
        for (WellboreType c: WellboreType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
