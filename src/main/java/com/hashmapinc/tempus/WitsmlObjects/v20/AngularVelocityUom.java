


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AngularVelocityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AngularVelocityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="dega/h"/>
 *     <enumeration value="dega/min"/>
 *     <enumeration value="dega/s"/>
 *     <enumeration value="rad/s"/>
 *     <enumeration value="rev/s"/>
 *     <enumeration value="rpm"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AngularVelocityUom")
@XmlEnum
public enum AngularVelocityUom {


    /**
     * angular degree per hour
     * 
     */
    @XmlEnumValue("dega/h")
    DEGA_H("dega/h"),

    /**
     * angular degree per minute
     * 
     */
    @XmlEnumValue("dega/min")
    DEGA_MIN("dega/min"),

    /**
     * angular degree per second
     * 
     */
    @XmlEnumValue("dega/s")
    DEGA_S("dega/s"),

    /**
     * radian per second
     * 
     */
    @XmlEnumValue("rad/s")
    RAD_S("rad/s"),

    /**
     * revolution per second
     * 
     */
    @XmlEnumValue("rev/s")
    REV_S("rev/s"),

    /**
     * revolution per minute
     * 
     */
    @XmlEnumValue("rpm")
    RPM("rpm");
    private final String value;

    AngularVelocityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AngularVelocityUom fromValue(String v) {
        for (AngularVelocityUom c: AngularVelocityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
