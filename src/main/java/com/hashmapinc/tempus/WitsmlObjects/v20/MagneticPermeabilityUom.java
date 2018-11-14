


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MagneticPermeabilityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MagneticPermeabilityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="H/m"/>
 *     <enumeration value="uH/m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MagneticPermeabilityUom")
@XmlEnum
public enum MagneticPermeabilityUom {


    /**
     * henry per metre
     * 
     */
    @XmlEnumValue("H/m")
    H_M("H/m"),

    /**
     * microhenry per metre
     * 
     */
    @XmlEnumValue("uH/m")
    U_H_M("uH/m");
    private final String value;

    MagneticPermeabilityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MagneticPermeabilityUom fromValue(String v) {
        for (MagneticPermeabilityUom c: MagneticPermeabilityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
