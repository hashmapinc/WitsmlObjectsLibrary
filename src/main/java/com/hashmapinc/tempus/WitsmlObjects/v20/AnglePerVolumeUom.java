


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnglePerVolumeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AnglePerVolumeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="rad/ft3"/>
 *     <enumeration value="rad/m3"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnglePerVolumeUom")
@XmlEnum
public enum AnglePerVolumeUom {


    /**
     * radian per cubic foot
     * 
     */
    @XmlEnumValue("rad/ft3")
    RAD_FT_3("rad/ft3"),

    /**
     * radian per cubic metre
     * 
     */
    @XmlEnumValue("rad/m3")
    RAD_M_3("rad/m3");
    private final String value;

    AnglePerVolumeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnglePerVolumeUom fromValue(String v) {
        for (AnglePerVolumeUom c: AnglePerVolumeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
