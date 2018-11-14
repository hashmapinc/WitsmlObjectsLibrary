


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyLengthPerAreaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="EnergyLengthPerAreaUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="J.m/m2"/>
 *     <enumeration value="kcal[th].m/cm2"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyLengthPerAreaUom")
@XmlEnum
public enum EnergyLengthPerAreaUom {


    /**
     * joule metre per square metre
     * 
     */
    @XmlEnumValue("J.m/m2")
    J_M_M_2("J.m/m2"),

    /**
     * thousand calorie metre per square centimetre
     * 
     */
    @XmlEnumValue("kcal[th].m/cm2")
    KCAL_TH_M_CM_2("kcal[th].m/cm2");
    private final String value;

    EnergyLengthPerAreaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyLengthPerAreaUom fromValue(String v) {
        for (EnergyLengthPerAreaUom c: EnergyLengthPerAreaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
