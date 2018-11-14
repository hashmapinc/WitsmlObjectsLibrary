


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PressurePerPressureUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PressurePerPressureUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="atm/atm"/>
 *     <enumeration value="bar/bar"/>
 *     <enumeration value="Euc"/>
 *     <enumeration value="kPa/kPa"/>
 *     <enumeration value="MPa/MPa"/>
 *     <enumeration value="Pa/Pa"/>
 *     <enumeration value="psi/psi"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PressurePerPressureUom")
@XmlEnum
public enum PressurePerPressureUom {


    /**
     * standard atmosphere per standard atmosphere
     * 
     */
    @XmlEnumValue("atm/atm")
    ATM_ATM("atm/atm"),

    /**
     * bar per bar
     * 
     */
    @XmlEnumValue("bar/bar")
    BAR_BAR("bar/bar"),

    /**
     * euclid
     * 
     */
    @XmlEnumValue("Euc")
    EUC("Euc"),

    /**
     * kilopascal per kilopascal
     * 
     */
    @XmlEnumValue("kPa/kPa")
    K_PA_K_PA("kPa/kPa"),

    /**
     * megapascal per megapascal
     * 
     */
    @XmlEnumValue("MPa/MPa")
    M_PA_M_PA("MPa/MPa"),

    /**
     * pascal per pascal
     * 
     */
    @XmlEnumValue("Pa/Pa")
    PA_PA("Pa/Pa"),

    /**
     * psi per psi
     * 
     */
    @XmlEnumValue("psi/psi")
    PSI_PSI("psi/psi");
    private final String value;

    PressurePerPressureUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PressurePerPressureUom fromValue(String v) {
        for (PressurePerPressureUom c: PressurePerPressureUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
