


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MolarEnergyUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MolarEnergyUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Btu[IT]/lbmol"/>
 *     <enumeration value="J/mol"/>
 *     <enumeration value="kcal[th]/mol"/>
 *     <enumeration value="kJ/kmol"/>
 *     <enumeration value="MJ/kmol"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MolarEnergyUom")
@XmlEnum
public enum MolarEnergyUom {


    /**
     * BTU per pound-mass-mole
     * 
     */
    @XmlEnumValue("Btu[IT]/lbmol")
    BTU_IT_LBMOL("Btu[IT]/lbmol"),

    /**
     * joule per gram-mole
     * 
     */
    @XmlEnumValue("J/mol")
    J_MOL("J/mol"),

    /**
     * thousand calorie per gram-mole
     * 
     */
    @XmlEnumValue("kcal[th]/mol")
    KCAL_TH_MOL("kcal[th]/mol"),

    /**
     * kilojoule per kilogram-mole
     * 
     */
    @XmlEnumValue("kJ/kmol")
    K_J_KMOL("kJ/kmol"),

    /**
     * megajoule per kilogram-mole
     * 
     */
    @XmlEnumValue("MJ/kmol")
    MJ_KMOL("MJ/kmol");
    private final String value;

    MolarEnergyUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MolarEnergyUom fromValue(String v) {
        for (MolarEnergyUom c: MolarEnergyUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
