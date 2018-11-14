


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumetricHeatTransferCoefficientUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="VolumetricHeatTransferCoefficientUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Btu[IT]/(h.ft3.deltaF)"/>
 *     <enumeration value="Btu[IT]/(s.ft3.deltaF)"/>
 *     <enumeration value="kW/(m3.deltaK)"/>
 *     <enumeration value="W/(m3.deltaK)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VolumetricHeatTransferCoefficientUom")
@XmlEnum
public enum VolumetricHeatTransferCoefficientUom {


    /**
     * BTU per hour cubic foot delta Fahrenheit
     * 
     */
    @XmlEnumValue("Btu[IT]/(h.ft3.deltaF)")
    BTU_IT_H_FT_3_DELTA_F("Btu[IT]/(h.ft3.deltaF)"),

    /**
     * (BTU per second) per cubic foot delta Fahrenheit
     * 
     */
    @XmlEnumValue("Btu[IT]/(s.ft3.deltaF)")
    BTU_IT_S_FT_3_DELTA_F("Btu[IT]/(s.ft3.deltaF)"),

    /**
     * killowatt per cubic metre delta kelvin
     * 
     */
    @XmlEnumValue("kW/(m3.deltaK)")
    K_W_M_3_DELTA_K("kW/(m3.deltaK)"),

    /**
     * watt per cubic metre delta kelvin
     * 
     */
    @XmlEnumValue("W/(m3.deltaK)")
    W_M_3_DELTA_K("W/(m3.deltaK)");
    private final String value;

    VolumetricHeatTransferCoefficientUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumetricHeatTransferCoefficientUom fromValue(String v) {
        for (VolumetricHeatTransferCoefficientUom c: VolumetricHeatTransferCoefficientUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
