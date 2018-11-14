


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecificHeatCapacityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="SpecificHeatCapacityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Btu[IT]/(lbm.deltaF)"/>
 *     <enumeration value="Btu[IT]/(lbm.deltaR)"/>
 *     <enumeration value="cal[th]/(g.deltaK)"/>
 *     <enumeration value="J/(g.deltaK)"/>
 *     <enumeration value="J/(kg.deltaK)"/>
 *     <enumeration value="kcal[th]/(kg.deltaC)"/>
 *     <enumeration value="kJ/(kg.deltaK)"/>
 *     <enumeration value="kW.h/(kg.deltaC)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecificHeatCapacityUom")
@XmlEnum
public enum SpecificHeatCapacityUom {


    /**
     * BTU per pound-mass delta Fahrenheit
     * 
     */
    @XmlEnumValue("Btu[IT]/(lbm.deltaF)")
    BTU_IT_LBM_DELTA_F("Btu[IT]/(lbm.deltaF)"),

    /**
     * BTU per pound-mass delta Rankine
     * 
     */
    @XmlEnumValue("Btu[IT]/(lbm.deltaR)")
    BTU_IT_LBM_DELTA_R("Btu[IT]/(lbm.deltaR)"),

    /**
     * calorie per gram delta kelvin
     * 
     */
    @XmlEnumValue("cal[th]/(g.deltaK)")
    CAL_TH_G_DELTA_K("cal[th]/(g.deltaK)"),

    /**
     * joule per gram delta kelvin
     * 
     */
    @XmlEnumValue("J/(g.deltaK)")
    J_G_DELTA_K("J/(g.deltaK)"),

    /**
     * joule per kilogram delta kelvin
     * 
     */
    @XmlEnumValue("J/(kg.deltaK)")
    J_KG_DELTA_K("J/(kg.deltaK)"),

    /**
     * thousand calorie per kilogram delta Celsius
     * 
     */
    @XmlEnumValue("kcal[th]/(kg.deltaC)")
    KCAL_TH_KG_DELTA_C("kcal[th]/(kg.deltaC)"),

    /**
     * kilojoule per kilogram delta kelvin
     * 
     */
    @XmlEnumValue("kJ/(kg.deltaK)")
    K_J_KG_DELTA_K("kJ/(kg.deltaK)"),

    /**
     * kilowatt hour per kilogram delta Celsius
     * 
     */
    @XmlEnumValue("kW.h/(kg.deltaC)")
    K_W_H_KG_DELTA_C("kW.h/(kg.deltaC)");
    private final String value;

    SpecificHeatCapacityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecificHeatCapacityUom fromValue(String v) {
        for (SpecificHeatCapacityUom c: SpecificHeatCapacityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
