


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelIndexType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ChannelIndexType">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="measured depth"/>
 *     <enumeration value="true vertical depth"/>
 *     <enumeration value="pass indexed depth"/>
 *     <enumeration value="date time"/>
 *     <enumeration value="elapsed time"/>
 *     <enumeration value="temperature"/>
 *     <enumeration value="pressure"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChannelIndexType", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum ChannelIndexType {


    /**
     * Measured depth.
     * 
     */
    @XmlEnumValue("measured depth")
    MEASURED_DEPTH("measured depth"),

    /**
     * True vertical depth.
     * 
     */
    @XmlEnumValue("true vertical depth")
    TRUE_VERTICAL_DEPTH("true vertical depth"),

    /**
     * An index value that includes pass, direction, and depth values This can only refer to measured depths. 
     * 
     */
    @XmlEnumValue("pass indexed depth")
    PASS_INDEXED_DEPTH("pass indexed depth"),

    /**
     * Date with time.
     * 
     */
    @XmlEnumValue("date time")
    DATE_TIME("date time"),

    /**
     * Time that has elapsed
     * 
     */
    @XmlEnumValue("elapsed time")
    ELAPSED_TIME("elapsed time"),

    /**
     * Temperature.
     * 
     */
    @XmlEnumValue("temperature")
    TEMPERATURE("temperature"),

    /**
     * Pressure.
     * 
     */
    @XmlEnumValue("pressure")
    PRESSURE("pressure");
    private final String value;

    ChannelIndexType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelIndexType fromValue(String v) {
        for (ChannelIndexType c: ChannelIndexType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
