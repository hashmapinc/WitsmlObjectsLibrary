


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerticalCoordinateUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="VerticalCoordinateUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="m"/>
 *     <enumeration value="ft"/>
 *     <enumeration value="ftUS"/>
 *     <enumeration value="ftBr(65)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VerticalCoordinateUom")
@XmlEnum
public enum VerticalCoordinateUom {


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
    FT_US("ftUS"),

    /**
     * British Foot 1865
     * 
     */
    @XmlEnumValue("ftBr(65)")
    FT_BR_65("ftBr(65)");
    private final String value;

    VerticalCoordinateUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerticalCoordinateUom fromValue(String v) {
        for (VerticalCoordinateUom c: VerticalCoordinateUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
