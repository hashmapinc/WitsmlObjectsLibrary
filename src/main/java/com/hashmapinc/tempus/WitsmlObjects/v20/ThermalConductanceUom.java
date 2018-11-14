


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThermalConductanceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ThermalConductanceUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="W/deltaK"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThermalConductanceUom")
@XmlEnum
public enum ThermalConductanceUom {


    /**
     * watt per delta kelvin
     * 
     */
    @XmlEnumValue("W/deltaK")
    W_DELTA_K("W/deltaK");
    private final String value;

    ThermalConductanceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThermalConductanceUom fromValue(String v) {
        for (ThermalConductanceUom c: ThermalConductanceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
