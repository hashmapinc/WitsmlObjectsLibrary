


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerPerAreaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PowerPerAreaUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Btu[IT]/(h.ft2)"/>
 *     <enumeration value="Btu[IT]/(s.ft2)"/>
 *     <enumeration value="cal[th]/(h.cm2)"/>
 *     <enumeration value="hp/in2"/>
 *     <enumeration value="hp[hyd]/in2"/>
 *     <enumeration value="kW/cm2"/>
 *     <enumeration value="kW/m2"/>
 *     <enumeration value="mW/m2"/>
 *     <enumeration value="ucal[th]/(s.cm2)"/>
 *     <enumeration value="W/cm2"/>
 *     <enumeration value="W/m2"/>
 *     <enumeration value="W/mm2"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PowerPerAreaUom")
@XmlEnum
public enum PowerPerAreaUom {


    /**
     * (BTU per hour) per square foot
     * 
     */
    @XmlEnumValue("Btu[IT]/(h.ft2)")
    BTU_IT_H_FT_2("Btu[IT]/(h.ft2)"),

    /**
     * BTU per second square foot
     * 
     */
    @XmlEnumValue("Btu[IT]/(s.ft2)")
    BTU_IT_S_FT_2("Btu[IT]/(s.ft2)"),

    /**
     * calorie per hour square centimetre
     * 
     */
    @XmlEnumValue("cal[th]/(h.cm2)")
    CAL_TH_H_CM_2("cal[th]/(h.cm2)"),

    /**
     * horsepower per square inch
     * 
     */
    @XmlEnumValue("hp/in2")
    HP_IN_2("hp/in2"),

    /**
     * hydraulic-horsepower per square inch
     * 
     */
    @XmlEnumValue("hp[hyd]/in2")
    HP_HYD_IN_2("hp[hyd]/in2"),

    /**
     * kilowatt per square centimetre
     * 
     */
    @XmlEnumValue("kW/cm2")
    K_W_CM_2("kW/cm2"),

    /**
     * kilowatt per square metre
     * 
     */
    @XmlEnumValue("kW/m2")
    K_W_M_2("kW/m2"),

    /**
     * milliwatt per square metre
     * 
     */
    @XmlEnumValue("mW/m2")
    M_W_M_2("mW/m2"),

    /**
     * millionth of calorie per second square centimetre
     * 
     */
    @XmlEnumValue("ucal[th]/(s.cm2)")
    UCAL_TH_S_CM_2("ucal[th]/(s.cm2)"),

    /**
     * watt per square centimetre
     * 
     */
    @XmlEnumValue("W/cm2")
    W_CM_2("W/cm2"),

    /**
     * watt per square metre
     * 
     */
    @XmlEnumValue("W/m2")
    W_M_2("W/m2"),

    /**
     * watt per square millimetre
     * 
     */
    @XmlEnumValue("W/mm2")
    W_MM_2("W/mm2");
    private final String value;

    PowerPerAreaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PowerPerAreaUom fromValue(String v) {
        for (PowerPerAreaUom c: PowerPerAreaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
