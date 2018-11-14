


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LengthPerTemperatureUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LengthPerTemperatureUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="ft/deltaF"/>
 *     <enumeration value="m/deltaK"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LengthPerTemperatureUom")
@XmlEnum
public enum LengthPerTemperatureUom {


    /**
     * foot per delta Fahrenheit
     * 
     */
    @XmlEnumValue("ft/deltaF")
    FT_DELTA_F("ft/deltaF"),

    /**
     * metre per delta kelvin
     * 
     */
    @XmlEnumValue("m/deltaK")
    M_DELTA_K("m/deltaK");
    private final String value;

    LengthPerTemperatureUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LengthPerTemperatureUom fromValue(String v) {
        for (LengthPerTemperatureUom c: LengthPerTemperatureUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
