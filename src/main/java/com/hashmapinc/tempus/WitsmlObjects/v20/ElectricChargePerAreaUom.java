


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricChargePerAreaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectricChargePerAreaUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="C/cm2"/>
 *     <enumeration value="C/m2"/>
 *     <enumeration value="C/mm2"/>
 *     <enumeration value="mC/m2"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectricChargePerAreaUom")
@XmlEnum
public enum ElectricChargePerAreaUom {


    /**
     * coulomb per square centimetre
     * 
     */
    @XmlEnumValue("C/cm2")
    C_CM_2("C/cm2"),

    /**
     * coulomb per square metre
     * 
     */
    @XmlEnumValue("C/m2")
    C_M_2("C/m2"),

    /**
     * coulomb per square millimetre
     * 
     */
    @XmlEnumValue("C/mm2")
    C_MM_2("C/mm2"),

    /**
     * millicoulomb per square metre
     * 
     */
    @XmlEnumValue("mC/m2")
    M_C_M_2("mC/m2");
    private final String value;

    ElectricChargePerAreaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricChargePerAreaUom fromValue(String v) {
        for (ElectricChargePerAreaUom c: ElectricChargePerAreaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
