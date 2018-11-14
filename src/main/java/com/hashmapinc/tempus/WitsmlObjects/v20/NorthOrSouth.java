


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NorthOrSouth.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="NorthOrSouth">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="north"/>
 *     <enumeration value="south"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NorthOrSouth", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum NorthOrSouth {


    /**
     * North of something.
     * 
     */
    @XmlEnumValue("north")
    NORTH("north"),

    /**
     * South of something.
     * 
     */
    @XmlEnumValue("south")
    SOUTH("south");
    private final String value;

    NorthOrSouth(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NorthOrSouth fromValue(String v) {
        for (NorthOrSouth c: NorthOrSouth.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
