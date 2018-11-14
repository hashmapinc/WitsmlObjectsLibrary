


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyLengthPerTimeAreaTemperatureUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="EnergyLengthPerTimeAreaTemperatureUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Btu[IT].in/(h.ft2.deltaF)"/>
 *     <enumeration value="J.m/(s.m2.deltaK)"/>
 *     <enumeration value="kJ.m/(h.m2.deltaK)"/>
 *     <enumeration value="W/(m.deltaK)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyLengthPerTimeAreaTemperatureUom")
@XmlEnum
public enum EnergyLengthPerTimeAreaTemperatureUom {


    /**
     * BTU per (hour square foot delta Fahrenheit per inch)
     * 
     */
    @XmlEnumValue("Btu[IT].in/(h.ft2.deltaF)")
    BTU_IT_IN_H_FT_2_DELTA_F("Btu[IT].in/(h.ft2.deltaF)"),

    /**
     * joule metre per second square metre delta kelvin
     * 
     */
    @XmlEnumValue("J.m/(s.m2.deltaK)")
    J_M_S_M_2_DELTA_K("J.m/(s.m2.deltaK)"),

    /**
     * kilojoule metre per hour square metre delta kelvin
     * 
     */
    @XmlEnumValue("kJ.m/(h.m2.deltaK)")
    K_J_M_H_M_2_DELTA_K("kJ.m/(h.m2.deltaK)"),

    /**
     * watt per metre delta kelvin
     * 
     */
    @XmlEnumValue("W/(m.deltaK)")
    W_M_DELTA_K("W/(m.deltaK)");
    private final String value;

    EnergyLengthPerTimeAreaTemperatureUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyLengthPerTimeAreaTemperatureUom fromValue(String v) {
        for (EnergyLengthPerTimeAreaTemperatureUom c: EnergyLengthPerTimeAreaTemperatureUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
