


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurveyToolOperatingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="SurveyToolOperatingMode">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="continuous xy"/>
 *     <enumeration value="continuous xyz"/>
 *     <enumeration value="continuous z"/>
 *     <enumeration value="unknown"/>
 *     <enumeration value="stationary"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SurveyToolOperatingMode", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum SurveyToolOperatingMode {

    @XmlEnumValue("continuous xy")
    CONTINUOUS_XY("continuous xy"),
    @XmlEnumValue("continuous xyz")
    CONTINUOUS_XYZ("continuous xyz"),
    @XmlEnumValue("continuous z")
    CONTINUOUS_Z("continuous z"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Tool is operating in a stationary mode.
     * 
     */
    @XmlEnumValue("stationary")
    STATIONARY("stationary");
    private final String value;

    SurveyToolOperatingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurveyToolOperatingMode fromValue(String v) {
        for (SurveyToolOperatingMode c: SurveyToolOperatingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
