package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetSectionScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="TargetSectionScope">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="arc"/>
 *     <enumeration value="line"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "TargetSectionScope")
@XmlEnum
public enum TargetSectionScope {


    /**
     * continuous curve
     * 
     */
    @XmlEnumValue("arc")
    ARC("arc"),

    /**
     * straight line
     * 
     */
    @XmlEnumValue("line")
    LINE("line"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TargetSectionScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TargetSectionScope fromValue(String v) {
        for (TargetSectionScope c: TargetSectionScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
