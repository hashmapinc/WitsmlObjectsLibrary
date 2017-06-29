package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for thermodynamicTemperatureUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="thermodynamicTemperatureUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="K"/>
 *     <enumeration value="degC"/>
 *     <enumeration value="degF"/>
 *     <enumeration value="degR"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "thermodynamicTemperatureUom")
@XmlEnum
public enum ThermodynamicTemperatureUom {

    K("K"),
    @XmlEnumValue("degC")
    DEG_C("degC"),
    @XmlEnumValue("degF")
    DEG_F("degF"),
    @XmlEnumValue("degR")
    DEG_R("degR");
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
