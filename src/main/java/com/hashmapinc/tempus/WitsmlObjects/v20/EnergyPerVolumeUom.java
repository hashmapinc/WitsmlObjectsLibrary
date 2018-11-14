


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyPerVolumeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="EnergyPerVolumeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Btu[IT]/bbl"/>
 *     <enumeration value="Btu[IT]/ft3"/>
 *     <enumeration value="Btu[IT]/gal[UK]"/>
 *     <enumeration value="Btu[IT]/gal[US]"/>
 *     <enumeration value="cal[th]/cm3"/>
 *     <enumeration value="cal[th]/mL"/>
 *     <enumeration value="cal[th]/mm3"/>
 *     <enumeration value="erg/cm3"/>
 *     <enumeration value="erg/m3"/>
 *     <enumeration value="hp.h/bbl"/>
 *     <enumeration value="J/dm3"/>
 *     <enumeration value="J/m3"/>
 *     <enumeration value="kcal[th]/cm3"/>
 *     <enumeration value="kcal[th]/m3"/>
 *     <enumeration value="kJ/dm3"/>
 *     <enumeration value="kJ/m3"/>
 *     <enumeration value="kW.h/dm3"/>
 *     <enumeration value="kW.h/m3"/>
 *     <enumeration value="lbf.ft/bbl"/>
 *     <enumeration value="lbf.ft/gal[US]"/>
 *     <enumeration value="MJ/m3"/>
 *     <enumeration value="MW.h/m3"/>
 *     <enumeration value="tonf[US].mi/bbl"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyPerVolumeUom")
@XmlEnum
public enum EnergyPerVolumeUom {


    /**
     * BTU per barrel
     * 
     */
    @XmlEnumValue("Btu[IT]/bbl")
    BTU_IT_BBL("Btu[IT]/bbl"),

    /**
     * BTU per cubic foot
     * 
     */
    @XmlEnumValue("Btu[IT]/ft3")
    BTU_IT_FT_3("Btu[IT]/ft3"),

    /**
     * BTU per UK gallon
     * 
     */
    @XmlEnumValue("Btu[IT]/gal[UK]")
    BTU_IT_GAL_UK("Btu[IT]/gal[UK]"),

    /**
     * BTU per US gallon
     * 
     */
    @XmlEnumValue("Btu[IT]/gal[US]")
    BTU_IT_GAL_US("Btu[IT]/gal[US]"),

    /**
     * calorie per cubic centimetre
     * 
     */
    @XmlEnumValue("cal[th]/cm3")
    CAL_TH_CM_3("cal[th]/cm3"),

    /**
     * calorie per millilitre
     * 
     */
    @XmlEnumValue("cal[th]/mL")
    CAL_TH_M_L("cal[th]/mL"),

    /**
     * calorie per cubic millimetre
     * 
     */
    @XmlEnumValue("cal[th]/mm3")
    CAL_TH_MM_3("cal[th]/mm3"),

    /**
     * erg per cubic centimetre
     * 
     */
    @XmlEnumValue("erg/cm3")
    ERG_CM_3("erg/cm3"),

    /**
     * erg per cubic metre
     * 
     */
    @XmlEnumValue("erg/m3")
    ERG_M_3("erg/m3"),

    /**
     * horsepower hour per barrel
     * 
     */
    @XmlEnumValue("hp.h/bbl")
    HP_H_BBL("hp.h/bbl"),

    /**
     * joule per cubic decimetre
     * 
     */
    @XmlEnumValue("J/dm3")
    J_DM_3("J/dm3"),

    /**
     * joule per cubic metre
     * 
     */
    @XmlEnumValue("J/m3")
    J_M_3("J/m3"),

    /**
     * thousand calorie per cubic centimetre
     * 
     */
    @XmlEnumValue("kcal[th]/cm3")
    KCAL_TH_CM_3("kcal[th]/cm3"),

    /**
     * thousand calorie per cubic metre
     * 
     */
    @XmlEnumValue("kcal[th]/m3")
    KCAL_TH_M_3("kcal[th]/m3"),

    /**
     * kilojoule per cubic decimetre
     * 
     */
    @XmlEnumValue("kJ/dm3")
    K_J_DM_3("kJ/dm3"),

    /**
     * kilojoule per cubic metre
     * 
     */
    @XmlEnumValue("kJ/m3")
    K_J_M_3("kJ/m3"),

    /**
     * kilowatt hour per cubic decimetre
     * 
     */
    @XmlEnumValue("kW.h/dm3")
    K_W_H_DM_3("kW.h/dm3"),

    /**
     * kilowatt hour per cubic metre
     * 
     */
    @XmlEnumValue("kW.h/m3")
    K_W_H_M_3("kW.h/m3"),

    /**
     * foot pound-force per barrel
     * 
     */
    @XmlEnumValue("lbf.ft/bbl")
    LBF_FT_BBL("lbf.ft/bbl"),

    /**
     * foot pound-force per US gallon
     * 
     */
    @XmlEnumValue("lbf.ft/gal[US]")
    LBF_FT_GAL_US("lbf.ft/gal[US]"),

    /**
     * megajoule per cubic metre
     * 
     */
    @XmlEnumValue("MJ/m3")
    MJ_M_3("MJ/m3"),

    /**
     * megawatt hour per cubic metre
     * 
     */
    @XmlEnumValue("MW.h/m3")
    MW_H_M_3("MW.h/m3"),

    /**
     * US ton-force mile per barrel
     * 
     */
    @XmlEnumValue("tonf[US].mi/bbl")
    TONF_US_MI_BBL("tonf[US].mi/bbl");
    private final String value;

    EnergyPerVolumeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyPerVolumeUom fromValue(String v) {
        for (EnergyPerVolumeUom c: EnergyPerVolumeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
