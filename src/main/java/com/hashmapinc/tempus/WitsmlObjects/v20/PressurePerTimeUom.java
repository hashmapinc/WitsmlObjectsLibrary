


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PressurePerTimeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PressurePerTimeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="atm/h"/>
 *     <enumeration value="bar/h"/>
 *     <enumeration value="kPa/h"/>
 *     <enumeration value="kPa/min"/>
 *     <enumeration value="MPa/h"/>
 *     <enumeration value="Pa/h"/>
 *     <enumeration value="Pa/s"/>
 *     <enumeration value="psi/h"/>
 *     <enumeration value="psi/min"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PressurePerTimeUom")
@XmlEnum
public enum PressurePerTimeUom {


    /**
     * standard atmosphere per hour
     * 
     */
    @XmlEnumValue("atm/h")
    ATM_H("atm/h"),

    /**
     * bar per hour
     * 
     */
    @XmlEnumValue("bar/h")
    BAR_H("bar/h"),

    /**
     * kilopascal per hour
     * 
     */
    @XmlEnumValue("kPa/h")
    K_PA_H("kPa/h"),

    /**
     * kilopascal per min
     * 
     */
    @XmlEnumValue("kPa/min")
    K_PA_MIN("kPa/min"),

    /**
     * megapascal per hour
     * 
     */
    @XmlEnumValue("MPa/h")
    M_PA_H("MPa/h"),

    /**
     * pascal per hour
     * 
     */
    @XmlEnumValue("Pa/h")
    PA_H("Pa/h"),

    /**
     * pascal per second
     * 
     */
    @XmlEnumValue("Pa/s")
    PA_S("Pa/s"),

    /**
     * psi per hour
     * 
     */
    @XmlEnumValue("psi/h")
    PSI_H("psi/h"),

    /**
     * psi per minute
     * 
     */
    @XmlEnumValue("psi/min")
    PSI_MIN("psi/min");
    private final String value;

    PressurePerTimeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PressurePerTimeUom fromValue(String v) {
        for (PressurePerTimeUom c: PressurePerTimeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
