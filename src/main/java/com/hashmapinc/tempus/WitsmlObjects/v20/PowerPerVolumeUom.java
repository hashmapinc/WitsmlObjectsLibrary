


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerPerVolumeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PowerPerVolumeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Btu[IT]/(h.ft3)"/>
 *     <enumeration value="Btu[IT]/(s.ft3)"/>
 *     <enumeration value="cal[th]/(h.cm3)"/>
 *     <enumeration value="cal[th]/(s.cm3)"/>
 *     <enumeration value="hp/ft3"/>
 *     <enumeration value="kW/m3"/>
 *     <enumeration value="uW/m3"/>
 *     <enumeration value="W/m3"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PowerPerVolumeUom")
@XmlEnum
public enum PowerPerVolumeUom {


    /**
     * BTU per hour cubic foot
     * 
     */
    @XmlEnumValue("Btu[IT]/(h.ft3)")
    BTU_IT_H_FT_3("Btu[IT]/(h.ft3)"),

    /**
     * (BTU per second) per cubic foot
     * 
     */
    @XmlEnumValue("Btu[IT]/(s.ft3)")
    BTU_IT_S_FT_3("Btu[IT]/(s.ft3)"),

    /**
     * calorie per hour cubic centimetre
     * 
     */
    @XmlEnumValue("cal[th]/(h.cm3)")
    CAL_TH_H_CM_3("cal[th]/(h.cm3)"),

    /**
     * calorie per second cubic centimetre
     * 
     */
    @XmlEnumValue("cal[th]/(s.cm3)")
    CAL_TH_S_CM_3("cal[th]/(s.cm3)"),

    /**
     * horsepower per cubic foot
     * 
     */
    @XmlEnumValue("hp/ft3")
    HP_FT_3("hp/ft3"),

    /**
     * kilowatt per cubic metre
     * 
     */
    @XmlEnumValue("kW/m3")
    K_W_M_3("kW/m3"),

    /**
     * microwatt per cubic metre
     * 
     */
    @XmlEnumValue("uW/m3")
    U_W_M_3("uW/m3"),

    /**
     * watt per cubic metre
     * 
     */
    @XmlEnumValue("W/m3")
    W_M_3("W/m3");
    private final String value;

    PowerPerVolumeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PowerPerVolumeUom fromValue(String v) {
        for (PowerPerVolumeUom c: PowerPerVolumeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
