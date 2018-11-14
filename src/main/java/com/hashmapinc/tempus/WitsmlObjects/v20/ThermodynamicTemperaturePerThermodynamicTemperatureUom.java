


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermodynamicTemperaturePerThermodynamicTemperatureUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ThermodynamicTemperaturePerThermodynamicTemperatureUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="degC/degC"/>
 *     <enumeration value="degF/degF"/>
 *     <enumeration value="degR/degR"/>
 *     <enumeration value="Euc"/>
 *     <enumeration value="K/K"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThermodynamicTemperaturePerThermodynamicTemperatureUom")
@XmlEnum
public enum ThermodynamicTemperaturePerThermodynamicTemperatureUom {


    /**
     * degree Celsius per degree Celsius
     * 
     */
    @XmlEnumValue("degC/degC")
    DEG_C_DEG_C("degC/degC"),

    /**
     * degree Fahrenheit per degree Fahrenheit
     * 
     */
    @XmlEnumValue("degF/degF")
    DEG_F_DEG_F("degF/degF"),

    /**
     * degree Rankine per degree Rankine
     * 
     */
    @XmlEnumValue("degR/degR")
    DEG_R_DEG_R("degR/degR"),

    /**
     * euclid
     * 
     */
    @XmlEnumValue("Euc")
    EUC("Euc"),

    /**
     * kelvin per kelvin
     * 
     */
    @XmlEnumValue("K/K")
    K_K("K/K");
    private final String value;

    ThermodynamicTemperaturePerThermodynamicTemperatureUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermodynamicTemperaturePerThermodynamicTemperatureUom fromValue(String v) {
        for (ThermodynamicTemperaturePerThermodynamicTemperatureUom c: ThermodynamicTemperaturePerThermodynamicTemperatureUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
