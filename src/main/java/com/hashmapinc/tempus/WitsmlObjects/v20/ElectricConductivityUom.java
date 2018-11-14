


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricConductivityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectricConductivityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kS/m"/>
 *     <enumeration value="mS/cm"/>
 *     <enumeration value="mS/m"/>
 *     <enumeration value="S/m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectricConductivityUom")
@XmlEnum
public enum ElectricConductivityUom {


    /**
     * kilosiemens per metre
     * 
     */
    @XmlEnumValue("kS/m")
    K_S_M("kS/m"),

    /**
     * millisiemens per centimetre
     * 
     */
    @XmlEnumValue("mS/cm")
    M_S_CM("mS/cm"),

    /**
     * millisiemens per metre
     * 
     */
    @XmlEnumValue("mS/m")
    M_S_M("mS/m"),

    /**
     * siemens per metre
     * 
     */
    @XmlEnumValue("S/m")
    S_M("S/m");
    private final String value;

    ElectricConductivityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricConductivityUom fromValue(String v) {
        for (ElectricConductivityUom c: ElectricConductivityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
