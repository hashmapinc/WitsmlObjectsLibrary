


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeatCapacityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="HeatCapacityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="J/deltaK"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeatCapacityUom")
@XmlEnum
public enum HeatCapacityUom {


    /**
     * joule per delta kelvin
     * 
     */
    @XmlEnumValue("J/deltaK")
    J_DELTA_K("J/deltaK");
    private final String value;

    HeatCapacityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeatCapacityUom fromValue(String v) {
        for (HeatCapacityUom c: HeatCapacityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
