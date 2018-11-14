


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricFieldStrengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectricFieldStrengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="mV/ft"/>
 *     <enumeration value="mV/m"/>
 *     <enumeration value="uV/ft"/>
 *     <enumeration value="uV/m"/>
 *     <enumeration value="V/m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectricFieldStrengthUom")
@XmlEnum
public enum ElectricFieldStrengthUom {


    /**
     * millivolt per foot
     * 
     */
    @XmlEnumValue("mV/ft")
    M_V_FT("mV/ft"),

    /**
     * millivolt per metre
     * 
     */
    @XmlEnumValue("mV/m")
    M_V_M("mV/m"),

    /**
     * microvolt per foot
     * 
     */
    @XmlEnumValue("uV/ft")
    U_V_FT("uV/ft"),

    /**
     * microvolt per metre
     * 
     */
    @XmlEnumValue("uV/m")
    U_V_M("uV/m"),

    /**
     * volt per metre
     * 
     */
    @XmlEnumValue("V/m")
    V_M("V/m");
    private final String value;

    ElectricFieldStrengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricFieldStrengthUom fromValue(String v) {
        for (ElectricFieldStrengthUom c: ElectricFieldStrengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
