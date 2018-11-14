


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermalInsulanceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ThermalInsulanceUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="deltaC.m2.h/kcal[th]"/>
 *     <enumeration value="deltaF.ft2.h/Btu[IT]"/>
 *     <enumeration value="deltaK.m2/kW"/>
 *     <enumeration value="deltaK.m2/W"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThermalInsulanceUom")
@XmlEnum
public enum ThermalInsulanceUom {


    /**
     * delta Celsius square metre hour per thousand calory
     * 
     */
    @XmlEnumValue("deltaC.m2.h/kcal[th]")
    DELTA_C_M_2_H_KCAL_TH("deltaC.m2.h/kcal[th]"),

    /**
     * delta Fahrenheit square foot hour per BTU
     * 
     */
    @XmlEnumValue("deltaF.ft2.h/Btu[IT]")
    DELTA_F_FT_2_H_BTU_IT("deltaF.ft2.h/Btu[IT]"),

    /**
     * delta kelvin square metre per kilowatt
     * 
     */
    @XmlEnumValue("deltaK.m2/kW")
    DELTA_K_M_2_K_W("deltaK.m2/kW"),

    /**
     * delta kelvin square metre per watt
     * 
     */
    @XmlEnumValue("deltaK.m2/W")
    DELTA_K_M_2_W("deltaK.m2/W");
    private final String value;

    ThermalInsulanceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermalInsulanceUom fromValue(String v) {
        for (ThermalInsulanceUom c: ThermalInsulanceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
