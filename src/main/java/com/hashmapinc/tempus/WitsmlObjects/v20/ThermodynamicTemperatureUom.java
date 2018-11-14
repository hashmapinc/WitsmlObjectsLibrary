


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermodynamicTemperatureUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ThermodynamicTemperatureUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="degC"/>
 *     <enumeration value="degF"/>
 *     <enumeration value="degR"/>
 *     <enumeration value="K"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThermodynamicTemperatureUom")
@XmlEnum
public enum ThermodynamicTemperatureUom {


    /**
     * degree Celsius
     * 
     */
    @XmlEnumValue("degC")
    DEG_C("degC"),

    /**
     * degree Fahrenheit
     * 
     */
    @XmlEnumValue("degF")
    DEG_F("degF"),

    /**
     * degree Rankine
     * 
     */
    @XmlEnumValue("degR")
    DEG_R("degR"),

    /**
     * degree kelvin
     * 
     */
    K("K");
    private final String value;

    ThermodynamicTemperatureUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermodynamicTemperatureUom fromValue(String v) {
        for (ThermodynamicTemperatureUom c: ThermodynamicTemperatureUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
