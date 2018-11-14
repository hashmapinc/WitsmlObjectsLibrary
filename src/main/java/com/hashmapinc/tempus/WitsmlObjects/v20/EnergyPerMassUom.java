


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyPerMassUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="EnergyPerMassUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Btu[IT]/lbm"/>
 *     <enumeration value="cal[th]/g"/>
 *     <enumeration value="cal[th]/kg"/>
 *     <enumeration value="cal[th]/lbm"/>
 *     <enumeration value="erg/g"/>
 *     <enumeration value="erg/kg"/>
 *     <enumeration value="hp.h/lbm"/>
 *     <enumeration value="J/g"/>
 *     <enumeration value="J/kg"/>
 *     <enumeration value="kcal[th]/g"/>
 *     <enumeration value="kcal[th]/kg"/>
 *     <enumeration value="kJ/kg"/>
 *     <enumeration value="kW.h/kg"/>
 *     <enumeration value="lbf.ft/lbm"/>
 *     <enumeration value="MJ/kg"/>
 *     <enumeration value="MW.h/kg"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyPerMassUom")
@XmlEnum
public enum EnergyPerMassUom {


    /**
     * BTU per pound-mass
     * 
     */
    @XmlEnumValue("Btu[IT]/lbm")
    BTU_IT_LBM("Btu[IT]/lbm"),

    /**
     * calorie per gram
     * 
     */
    @XmlEnumValue("cal[th]/g")
    CAL_TH_G("cal[th]/g"),

    /**
     * calorie per kilogram
     * 
     */
    @XmlEnumValue("cal[th]/kg")
    CAL_TH_KG("cal[th]/kg"),

    /**
     * calorie per pound-mass
     * 
     */
    @XmlEnumValue("cal[th]/lbm")
    CAL_TH_LBM("cal[th]/lbm"),

    /**
     * erg per gram
     * 
     */
    @XmlEnumValue("erg/g")
    ERG_G("erg/g"),

    /**
     * erg per kilogram
     * 
     */
    @XmlEnumValue("erg/kg")
    ERG_KG("erg/kg"),

    /**
     * horsepower hour per pound-mass
     * 
     */
    @XmlEnumValue("hp.h/lbm")
    HP_H_LBM("hp.h/lbm"),

    /**
     * joule per gram
     * 
     */
    @XmlEnumValue("J/g")
    J_G("J/g"),

    /**
     * joule per kilogram
     * 
     */
    @XmlEnumValue("J/kg")
    J_KG("J/kg"),

    /**
     * thousand calorie per gram
     * 
     */
    @XmlEnumValue("kcal[th]/g")
    KCAL_TH_G("kcal[th]/g"),

    /**
     * thousand calorie per kilogram
     * 
     */
    @XmlEnumValue("kcal[th]/kg")
    KCAL_TH_KG("kcal[th]/kg"),

    /**
     * kilojoule per kilogram
     * 
     */
    @XmlEnumValue("kJ/kg")
    K_J_KG("kJ/kg"),

    /**
     * kilowatt hour per kilogram
     * 
     */
    @XmlEnumValue("kW.h/kg")
    K_W_H_KG("kW.h/kg"),

    /**
     * foot pound-force per pound-mass
     * 
     */
    @XmlEnumValue("lbf.ft/lbm")
    LBF_FT_LBM("lbf.ft/lbm"),

    /**
     * megajoule per kilogram
     * 
     */
    @XmlEnumValue("MJ/kg")
    MJ_KG("MJ/kg"),

    /**
     * megawatt hour per kilogram
     * 
     */
    @XmlEnumValue("MW.h/kg")
    MW_H_KG("MW.h/kg");
    private final String value;

    EnergyPerMassUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyPerMassUom fromValue(String v) {
        for (EnergyPerMassUom c: EnergyPerMassUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
