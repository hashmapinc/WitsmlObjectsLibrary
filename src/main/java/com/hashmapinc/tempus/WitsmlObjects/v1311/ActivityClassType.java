package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="ActivityClassType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="planned"/>
 *     <enumeration value="unplanned"/>
 *     <enumeration value="downtime"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "ActivityClassType")
@XmlEnum
public enum ActivityClassType {

    @XmlEnumValue("planned")
    PLANNED("planned"),
    @XmlEnumValue("unplanned")
    UNPLANNED("unplanned"),
    @XmlEnumValue("downtime")
    DOWNTIME("downtime"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ActivityClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityClassType fromValue(String v) {
        for (ActivityClassType c: ActivityClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
