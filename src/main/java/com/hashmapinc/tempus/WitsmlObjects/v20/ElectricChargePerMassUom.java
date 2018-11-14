


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricChargePerMassUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectricChargePerMassUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="A.s/kg"/>
 *     <enumeration value="C/g"/>
 *     <enumeration value="C/kg"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectricChargePerMassUom")
@XmlEnum
public enum ElectricChargePerMassUom {


    /**
     * ampere second per kilogram
     * 
     */
    @XmlEnumValue("A.s/kg")
    A_S_KG("A.s/kg"),

    /**
     * coulomb per gram
     * 
     */
    @XmlEnumValue("C/g")
    C_G("C/g"),

    /**
     * coulomb per kilogram
     * 
     */
    @XmlEnumValue("C/kg")
    C_KG("C/kg");
    private final String value;

    ElectricChargePerMassUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricChargePerMassUom fromValue(String v) {
        for (ElectricChargePerMassUom c: ElectricChargePerMassUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
