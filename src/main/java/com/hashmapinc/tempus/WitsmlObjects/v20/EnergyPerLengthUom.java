


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyPerLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="EnergyPerLengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="J/m"/>
 *     <enumeration value="MJ/m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyPerLengthUom")
@XmlEnum
public enum EnergyPerLengthUom {


    /**
     * joule per metre
     * 
     */
    @XmlEnumValue("J/m")
    J_M("J/m"),

    /**
     * megajoule per metre
     * 
     */
    @XmlEnumValue("MJ/m")
    MJ_M("MJ/m");
    private final String value;

    EnergyPerLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyPerLengthUom fromValue(String v) {
        for (EnergyPerLengthUom c: EnergyPerLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
