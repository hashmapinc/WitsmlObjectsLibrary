


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermalConductivityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ThermalConductivityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Btu[IT]/(h.ft.deltaF)"/>
 *     <enumeration value="cal[th]/(h.cm.deltaC)"/>
 *     <enumeration value="cal[th]/(s.cm.deltaC)"/>
 *     <enumeration value="kcal[th]/(h.m.deltaC)"/>
 *     <enumeration value="W/(m.deltaK)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThermalConductivityUom")
@XmlEnum
public enum ThermalConductivityUom {


    /**
     * BTU per hour foot delta Fahrenheit
     * 
     */
    @XmlEnumValue("Btu[IT]/(h.ft.deltaF)")
    BTU_IT_H_FT_DELTA_F("Btu[IT]/(h.ft.deltaF)"),

    /**
     * calorie per hour centimetre delta Celsius
     * 
     */
    @XmlEnumValue("cal[th]/(h.cm.deltaC)")
    CAL_TH_H_CM_DELTA_C("cal[th]/(h.cm.deltaC)"),

    /**
     * calorie per second centimetre delta Celsius
     * 
     */
    @XmlEnumValue("cal[th]/(s.cm.deltaC)")
    CAL_TH_S_CM_DELTA_C("cal[th]/(s.cm.deltaC)"),

    /**
     * thousand calorie per hour metre delta Celsius
     * 
     */
    @XmlEnumValue("kcal[th]/(h.m.deltaC)")
    KCAL_TH_H_M_DELTA_C("kcal[th]/(h.m.deltaC)"),

    /**
     * watt per metre delta kelvin
     * 
     */
    @XmlEnumValue("W/(m.deltaK)")
    W_M_DELTA_K("W/(m.deltaK)");
    private final String value;

    ThermalConductivityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermalConductivityUom fromValue(String v) {
        for (ThermalConductivityUom c: ThermalConductivityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
