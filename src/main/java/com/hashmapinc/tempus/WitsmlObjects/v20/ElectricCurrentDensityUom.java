


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricCurrentDensityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectricCurrentDensityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="A/cm2"/>
 *     <enumeration value="A/ft2"/>
 *     <enumeration value="A/m2"/>
 *     <enumeration value="A/mm2"/>
 *     <enumeration value="mA/cm2"/>
 *     <enumeration value="mA/ft2"/>
 *     <enumeration value="uA/cm2"/>
 *     <enumeration value="uA/in2"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectricCurrentDensityUom")
@XmlEnum
public enum ElectricCurrentDensityUom {


    /**
     * ampere per square centimetre
     * 
     */
    @XmlEnumValue("A/cm2")
    A_CM_2("A/cm2"),

    /**
     * ampere per square foot
     * 
     */
    @XmlEnumValue("A/ft2")
    A_FT_2("A/ft2"),

    /**
     * ampere per square metre
     * 
     */
    @XmlEnumValue("A/m2")
    A_M_2("A/m2"),

    /**
     * ampere per square millimetre
     * 
     */
    @XmlEnumValue("A/mm2")
    A_MM_2("A/mm2"),

    /**
     * milliampere per square centimetre
     * 
     */
    @XmlEnumValue("mA/cm2")
    M_A_CM_2("mA/cm2"),

    /**
     * milliampere per square foot
     * 
     */
    @XmlEnumValue("mA/ft2")
    M_A_FT_2("mA/ft2"),

    /**
     * microampere per square centimetre
     * 
     */
    @XmlEnumValue("uA/cm2")
    U_A_CM_2("uA/cm2"),

    /**
     * microampere per square inch
     * 
     */
    @XmlEnumValue("uA/in2")
    U_A_IN_2("uA/in2");
    private final String value;

    ElectricCurrentDensityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricCurrentDensityUom fromValue(String v) {
        for (ElectricCurrentDensityUom c: ElectricCurrentDensityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
