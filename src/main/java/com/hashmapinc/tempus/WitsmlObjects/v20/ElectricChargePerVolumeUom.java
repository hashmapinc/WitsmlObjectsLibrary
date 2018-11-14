


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricChargePerVolumeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectricChargePerVolumeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="A.s/m3"/>
 *     <enumeration value="C/cm3"/>
 *     <enumeration value="C/m3"/>
 *     <enumeration value="C/mm3"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectricChargePerVolumeUom")
@XmlEnum
public enum ElectricChargePerVolumeUom {


    /**
     * ampere second per cubic metre
     * 
     */
    @XmlEnumValue("A.s/m3")
    A_S_M_3("A.s/m3"),

    /**
     * coulomb per cubic centimetre
     * 
     */
    @XmlEnumValue("C/cm3")
    C_CM_3("C/cm3"),

    /**
     * coulomb per cubic metre
     * 
     */
    @XmlEnumValue("C/m3")
    C_M_3("C/m3"),

    /**
     * coulomb per cubic millimetre
     * 
     */
    @XmlEnumValue("C/mm3")
    C_MM_3("C/mm3");
    private final String value;

    ElectricChargePerVolumeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricChargePerVolumeUom fromValue(String v) {
        for (ElectricChargePerVolumeUom c: ElectricChargePerVolumeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
