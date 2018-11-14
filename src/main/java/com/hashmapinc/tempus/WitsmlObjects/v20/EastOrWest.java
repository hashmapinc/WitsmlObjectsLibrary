


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EastOrWest.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="EastOrWest">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="east"/>
 *     <enumeration value="west"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EastOrWest", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum EastOrWest {


    /**
     * East of something.
     * 
     */
    @XmlEnumValue("east")
    EAST("east"),

    /**
     * West of something.
     * 
     */
    @XmlEnumValue("west")
    WEST("west");
    private final String value;

    EastOrWest(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EastOrWest fromValue(String v) {
        for (EastOrWest c: EastOrWest.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
