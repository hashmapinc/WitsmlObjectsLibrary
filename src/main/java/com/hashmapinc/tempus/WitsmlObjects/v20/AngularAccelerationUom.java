


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AngularAccelerationUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AngularAccelerationUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="rad/s2"/>
 *     <enumeration value="rpm/s"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AngularAccelerationUom")
@XmlEnum
public enum AngularAccelerationUom {


    /**
     * radian per second squared
     * 
     */
    @XmlEnumValue("rad/s2")
    RAD_S_2("rad/s2"),

    /**
     * (revolution per minute) per second
     * 
     */
    @XmlEnumValue("rpm/s")
    RPM_S("rpm/s");
    private final String value;

    AngularAccelerationUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AngularAccelerationUom fromValue(String v) {
        for (AngularAccelerationUom c: AngularAccelerationUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
