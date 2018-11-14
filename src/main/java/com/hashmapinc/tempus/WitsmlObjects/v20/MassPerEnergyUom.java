


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MassPerEnergyUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MassPerEnergyUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kg/(kW.h)"/>
 *     <enumeration value="kg/J"/>
 *     <enumeration value="kg/MJ"/>
 *     <enumeration value="lbm/(hp.h)"/>
 *     <enumeration value="mg/J"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MassPerEnergyUom")
@XmlEnum
public enum MassPerEnergyUom {


    /**
     * kilogram per kilowatt hour
     * 
     */
    @XmlEnumValue("kg/(kW.h)")
    KG_K_W_H("kg/(kW.h)"),

    /**
     * kilogram per joule
     * 
     */
    @XmlEnumValue("kg/J")
    KG_J("kg/J"),

    /**
     * kilogram per megajoule
     * 
     */
    @XmlEnumValue("kg/MJ")
    KG_MJ("kg/MJ"),

    /**
     * pound-mass per horsepower hour
     * 
     */
    @XmlEnumValue("lbm/(hp.h)")
    LBM_HP_H("lbm/(hp.h)"),

    /**
     * milligram per joule
     * 
     */
    @XmlEnumValue("mg/J")
    MG_J("mg/J");
    private final String value;

    MassPerEnergyUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MassPerEnergyUom fromValue(String v) {
        for (MassPerEnergyUom c: MassPerEnergyUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
