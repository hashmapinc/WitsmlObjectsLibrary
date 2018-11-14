


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermalResistanceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ThermalResistanceUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="deltaK/W"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThermalResistanceUom")
@XmlEnum
public enum ThermalResistanceUom {


    /**
     * delta kelvin per watt
     * 
     */
    @XmlEnumValue("deltaK/W")
    DELTA_K_W("deltaK/W");
    private final String value;

    ThermalResistanceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermalResistanceUom fromValue(String v) {
        for (ThermalResistanceUom c: ThermalResistanceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
