


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumePerRotationUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="VolumePerRotationUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="ft3/rad"/>
 *     <enumeration value="m3/rad"/>
 *     <enumeration value="m3/rev"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VolumePerRotationUom")
@XmlEnum
public enum VolumePerRotationUom {


    /**
     * cubic foot per radian
     * 
     */
    @XmlEnumValue("ft3/rad")
    FT_3_RAD("ft3/rad"),

    /**
     * cubic metre per radian
     * 
     */
    @XmlEnumValue("m3/rad")
    M_3_RAD("m3/rad"),

    /**
     * cubic metre per revolution
     * 
     */
    @XmlEnumValue("m3/rev")
    M_3_REV("m3/rev");
    private final String value;

    VolumePerRotationUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumePerRotationUom fromValue(String v) {
        for (VolumePerRotationUom c: VolumePerRotationUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
