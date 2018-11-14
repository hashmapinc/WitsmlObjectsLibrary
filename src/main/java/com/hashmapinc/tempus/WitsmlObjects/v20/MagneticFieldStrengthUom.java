


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MagneticFieldStrengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MagneticFieldStrengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="A/m"/>
 *     <enumeration value="A/mm"/>
 *     <enumeration value="Oe"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MagneticFieldStrengthUom")
@XmlEnum
public enum MagneticFieldStrengthUom {


    /**
     * ampere per metre
     * 
     */
    @XmlEnumValue("A/m")
    A_M("A/m"),

    /**
     * ampere per millimetre
     * 
     */
    @XmlEnumValue("A/mm")
    A_MM("A/mm"),

    /**
     * oersted
     * 
     */
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
