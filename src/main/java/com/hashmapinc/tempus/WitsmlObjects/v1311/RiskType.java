package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="RiskType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="risk"/>
 *     <enumeration value="event"/>
 *     <enumeration value="near miss"/>
 *     <enumeration value="best practice"/>
 *     <enumeration value="lessons learned"/>
 *     <enumeration value="other"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "RiskType")
@XmlEnum
public enum RiskType {

    @XmlEnumValue("risk")
    RISK("risk"),
    @XmlEnumValue("event")
    EVENT("event"),
    @XmlEnumValue("near miss")
    NEAR_MISS("near miss"),
    @XmlEnumValue("best practice")
    BEST_PRACTICE("best practice"),
    @XmlEnumValue("lessons learned")
    LESSONS_LEARNED("lessons learned"),
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    RiskType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RiskType fromValue(String v) {
        for (RiskType c: RiskType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
