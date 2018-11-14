


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricResistancePerLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectricResistancePerLengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="ohm/m"/>
 *     <enumeration value="uohm/ft"/>
 *     <enumeration value="uohm/m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectricResistancePerLengthUom")
@XmlEnum
public enum ElectricResistancePerLengthUom {


    /**
     * ohm per metre
     * 
     */
    @XmlEnumValue("ohm/m")
    OHM_M("ohm/m"),

    /**
     * microhm per foot
     * 
     */
    @XmlEnumValue("uohm/ft")
    UOHM_FT("uohm/ft"),

    /**
     * microhm per metre
     * 
     */
    @XmlEnumValue("uohm/m")
    UOHM_M("uohm/m");
    private final String value;

    ElectricResistancePerLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricResistancePerLengthUom fromValue(String v) {
        for (ElectricResistancePerLengthUom c: ElectricResistancePerLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
