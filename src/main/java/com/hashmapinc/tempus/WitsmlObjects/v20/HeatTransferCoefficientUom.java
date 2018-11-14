


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeatTransferCoefficientUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="HeatTransferCoefficientUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Btu[IT]/(h.ft2.deltaF)"/>
 *     <enumeration value="Btu[IT]/(h.ft2.deltaR)"/>
 *     <enumeration value="Btu[IT]/(h.m2.deltaC)"/>
 *     <enumeration value="Btu[IT]/(s.ft2.deltaF)"/>
 *     <enumeration value="cal[th]/(h.cm2.deltaC)"/>
 *     <enumeration value="cal[th]/(s.cm2.deltaC)"/>
 *     <enumeration value="J/(s.m2.deltaC)"/>
 *     <enumeration value="kcal[th]/(h.m2.deltaC)"/>
 *     <enumeration value="kJ/(h.m2.deltaK)"/>
 *     <enumeration value="kW/(m2.deltaK)"/>
 *     <enumeration value="W/(m2.deltaK)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeatTransferCoefficientUom")
@XmlEnum
public enum HeatTransferCoefficientUom {


    /**
     * BTU per hour square foot delta Fahrenheit
     * 
     */
    @XmlEnumValue("Btu[IT]/(h.ft2.deltaF)")
    BTU_IT_H_FT_2_DELTA_F("Btu[IT]/(h.ft2.deltaF)"),

    /**
     * BTU per hour square foot delta Rankine
     * 
     */
    @XmlEnumValue("Btu[IT]/(h.ft2.deltaR)")
    BTU_IT_H_FT_2_DELTA_R("Btu[IT]/(h.ft2.deltaR)"),

    /**
     * BTU per hour square metre delta Celsius
     * 
     */
    @XmlEnumValue("Btu[IT]/(h.m2.deltaC)")
    BTU_IT_H_M_2_DELTA_C("Btu[IT]/(h.m2.deltaC)"),

    /**
     * (BTU per second) per square foot delta Fahrenheit
     * 
     */
    @XmlEnumValue("Btu[IT]/(s.ft2.deltaF)")
    BTU_IT_S_FT_2_DELTA_F("Btu[IT]/(s.ft2.deltaF)"),

    /**
     * calorie per hour square centimetre delta Celsius
     * 
     */
    @XmlEnumValue("cal[th]/(h.cm2.deltaC)")
    CAL_TH_H_CM_2_DELTA_C("cal[th]/(h.cm2.deltaC)"),

    /**
     * calorie per second square centimetre delta Celsius
     * 
     */
    @XmlEnumValue("cal[th]/(s.cm2.deltaC)")
    CAL_TH_S_CM_2_DELTA_C("cal[th]/(s.cm2.deltaC)"),

    /**
     * joule per second square metre delta Celsius
     * 
     */
    @XmlEnumValue("J/(s.m2.deltaC)")
    J_S_M_2_DELTA_C("J/(s.m2.deltaC)"),

    /**
     * thousand calorie per hour square metre delta Celsius
     * 
     */
    @XmlEnumValue("kcal[th]/(h.m2.deltaC)")
    KCAL_TH_H_M_2_DELTA_C("kcal[th]/(h.m2.deltaC)"),

    /**
     * kilojoule per hour square metre delta kelvin
     * 
     */
    @XmlEnumValue("kJ/(h.m2.deltaK)")
    K_J_H_M_2_DELTA_K("kJ/(h.m2.deltaK)"),

    /**
     * kilowatt per square metre delta kelvin
     * 
     */
    @XmlEnumValue("kW/(m2.deltaK)")
    K_W_M_2_DELTA_K("kW/(m2.deltaK)"),

    /**
     * watt per square metre delta kelvin
     * 
     */
    @XmlEnumValue("W/(m2.deltaK)")
    W_M_2_DELTA_K("W/(m2.deltaK)");
    private final String value;

    HeatTransferCoefficientUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeatTransferCoefficientUom fromValue(String v) {
        for (HeatTransferCoefficientUom c: HeatTransferCoefficientUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
