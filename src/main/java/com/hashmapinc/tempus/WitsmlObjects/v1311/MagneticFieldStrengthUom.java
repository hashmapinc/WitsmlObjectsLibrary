package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for magneticFieldStrengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="magneticFieldStrengthUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="A/m"/>
 *     <enumeration value="A/mm"/>
 *     <enumeration value="gamma"/>
 *     <enumeration value="Oe"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "magneticFieldStrengthUom")
@XmlEnum
public enum MagneticFieldStrengthUom {

    @XmlEnumValue("A/m")
    A_M("A/m"),
    @XmlEnumValue("A/mm")
    A_MM("A/mm"),
    @XmlEnumValue("gamma")
    GAMMA("gamma"),
    @XmlEnumValue("Oe")
    OE("Oe");
    private final String value;

    MagneticFieldStrengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MagneticFieldStrengthUom fromValue(String v) {
        for (MagneticFieldStrengthUom c: MagneticFieldStrengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
