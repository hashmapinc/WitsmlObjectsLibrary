


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PressureSquaredUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PressureSquaredUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="bar2"/>
 *     <enumeration value="GPa2"/>
 *     <enumeration value="kPa2"/>
 *     <enumeration value="kpsi2"/>
 *     <enumeration value="Pa2"/>
 *     <enumeration value="psi2"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PressureSquaredUom")
@XmlEnum
public enum PressureSquaredUom {


    /**
     * bar squared
     * 
     */
    @XmlEnumValue("bar2")
    BAR_2("bar2"),

    /**
     * gigapascal squared
     * 
     */
    @XmlEnumValue("GPa2")
    G_PA_2("GPa2"),

    /**
     * kilopascal squared
     * 
     */
    @XmlEnumValue("kPa2")
    K_PA_2("kPa2"),

    /**
     * (thousand psi) squared
     * 
     */
    @XmlEnumValue("kpsi2")
    KPSI_2("kpsi2"),

    /**
     * pascal squared
     * 
     */
    @XmlEnumValue("Pa2")
    PA_2("Pa2"),

    /**
     * psi squared
     * 
     */
    @XmlEnumValue("psi2")
    PSI_2("psi2");
    private final String value;

    PressureSquaredUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PressureSquaredUom fromValue(String v) {
        for (PressureSquaredUom c: PressureSquaredUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
