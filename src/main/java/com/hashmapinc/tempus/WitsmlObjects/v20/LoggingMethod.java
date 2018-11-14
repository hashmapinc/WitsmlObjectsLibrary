


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoggingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LoggingMethod">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="computed"/>
 *     <enumeration value="distributed"/>
 *     <enumeration value="LWD"/>
 *     <enumeration value="mixed"/>
 *     <enumeration value="MWD"/>
 *     <enumeration value="surface"/>
 *     <enumeration value="wireline"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoggingMethod", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum LoggingMethod {


    /**
     * The log is a result of computed analyses from various sources.
     * 
     */
    @XmlEnumValue("computed")
    COMPUTED("computed"),

    /**
     * The log is derived from various different systems.
     * 
     */
    @XmlEnumValue("distributed")
    DISTRIBUTED("distributed"),

    /**
     * The data of the log is a result of logging-while-drilling.
     * 
     */
    LWD("LWD"),

    /**
     * The data is derived from multiple logging methods.
     * 
     */
    @XmlEnumValue("mixed")
    MIXED("mixed"),

    /**
     * The data of the log is a result of measurement-while-drilling.
     * 
     */
    MWD("MWD"),

    /**
     * The data is recorded on the surface or in real time.
     * 
     */
    @XmlEnumValue("surface")
    SURFACE("surface"),

    /**
     * The data is derived as a function of wellbore depth.
     * 
     */
    @XmlEnumValue("wireline")
    WIRELINE("wireline");
    private final String value;

    LoggingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoggingMethod fromValue(String v) {
        for (LoggingMethod c: LoggingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
