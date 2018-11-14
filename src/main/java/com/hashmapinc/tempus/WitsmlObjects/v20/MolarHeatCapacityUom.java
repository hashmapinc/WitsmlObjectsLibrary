


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MolarHeatCapacityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MolarHeatCapacityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Btu[IT]/(lbmol.deltaF)"/>
 *     <enumeration value="cal[th]/(mol.deltaC)"/>
 *     <enumeration value="J/(mol.deltaK)"/>
 *     <enumeration value="kJ/(kmol.deltaK)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MolarHeatCapacityUom")
@XmlEnum
public enum MolarHeatCapacityUom {


    /**
     * BTU per pound-mass-mole delta Fahrenheit
     * 
     */
    @XmlEnumValue("Btu[IT]/(lbmol.deltaF)")
    BTU_IT_LBMOL_DELTA_F("Btu[IT]/(lbmol.deltaF)"),

    /**
     * calorie per gram-mole delta Celsius
     * 
     */
    @XmlEnumValue("cal[th]/(mol.deltaC)")
    CAL_TH_MOL_DELTA_C("cal[th]/(mol.deltaC)"),

    /**
     * joule per gram-mole delta kelvin
     * 
     */
    @XmlEnumValue("J/(mol.deltaK)")
    J_MOL_DELTA_K("J/(mol.deltaK)"),

    /**
     * kilojoule per kilogram-mole delta kelvin
     * 
     */
    @XmlEnumValue("kJ/(kmol.deltaK)")
    K_J_KMOL_DELTA_K("kJ/(kmol.deltaK)");
    private final String value;

    MolarHeatCapacityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MolarHeatCapacityUom fromValue(String v) {
        for (MolarHeatCapacityUom c: MolarHeatCapacityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
