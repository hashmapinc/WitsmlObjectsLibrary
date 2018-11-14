


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerticalDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="VerticalDirection">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="up"/>
 *     <enumeration value="down"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VerticalDirection")
@XmlEnum
public enum VerticalDirection {


    /**
     * Values are positive when moving away from the center of the Earth.
     * 
     */
    @XmlEnumValue("up")
    UP("up"),

    /**
     * Values are positive when moving toward the center of the Earth.
     * 
     */
    @XmlEnumValue("down")
    DOWN("down");
    private final String value;

    VerticalDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerticalDirection fromValue(String v) {
        for (VerticalDirection c: VerticalDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
