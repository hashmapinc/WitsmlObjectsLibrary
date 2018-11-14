


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricChargeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectricChargeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="A.h"/>
 *     <enumeration value="A.s"/>
 *     <enumeration value="C"/>
 *     <enumeration value="cC"/>
 *     <enumeration value="dC"/>
 *     <enumeration value="EC"/>
 *     <enumeration value="fC"/>
 *     <enumeration value="GC"/>
 *     <enumeration value="kC"/>
 *     <enumeration value="MC"/>
 *     <enumeration value="mC"/>
 *     <enumeration value="nC"/>
 *     <enumeration value="pC"/>
 *     <enumeration value="TC"/>
 *     <enumeration value="uC"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectricChargeUom")
@XmlEnum
public enum ElectricChargeUom {


    /**
     * ampere hour
     * 
     */
    @XmlEnumValue("A.h")
    A_H("A.h"),

    /**
     * ampere second
     * 
     */
    @XmlEnumValue("A.s")
    A_S("A.s"),

    /**
     * coulomb
     * 
     */
    C("C"),

    /**
     * centicoulomb
     * 
     */
    @XmlEnumValue("cC")
    C_C("cC"),

    /**
     * decicoulomb
     * 
     */
    @XmlEnumValue("dC")
    D_C("dC"),

    /**
     * exacoulomb
     * 
     */
    EC("EC"),

    /**
     * femtocoulomb
     * 
     */
    @XmlEnumValue("fC")
    F_C("fC"),

    /**
     * gigacoulomb
     * 
     */
    GC("GC"),

    /**
     * kilocoulomb
     * 
     */
    @XmlEnumValue("kC")
    K_C("kC"),

    /**
     * megacoulomb
     * 
     */
    MC("MC"),

    /**
     * millicoulomb
     * 
     */
    @XmlEnumValue("mC")
    M_C("mC"),

    /**
     * nanocoulomb
     * 
     */
    @XmlEnumValue("nC")
    N_C("nC"),

    /**
     * picocoulomb
     * 
     */
    @XmlEnumValue("pC")
    P_C("pC"),

    /**
     * teracoulomb
     * 
     */
    TC("TC"),

    /**
     * microcoulomb
     * 
     */
    @XmlEnumValue("uC")
    U_C("uC");
    private final String value;

    ElectricChargeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricChargeUom fromValue(String v) {
        for (ElectricChargeUom c: ElectricChargeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
