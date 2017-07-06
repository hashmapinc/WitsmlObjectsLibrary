package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasuredDepthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="MeasuredDepthUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="m"/>
 *     <enumeration value="ft"/>
 *     <enumeration value="ftUS"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "MeasuredDepthUom")
@XmlEnum
public enum MeasuredDepthUom {


    /**
     * meter
     * 
     */
    @XmlEnumValue("m")
    M("m"),

    /**
     * International Foot
     * 
     */
    @XmlEnumValue("ft")
    FT("ft"),

    /**
     * US Survey Foot
     * 
     */
    @XmlEnumValue("ftUS")
    FT_US("ftUS");
    private final String value;

    MeasuredDepthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasuredDepthUom fromValue(String v) {
        for (MeasuredDepthUom c: MeasuredDepthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
