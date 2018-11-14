


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricPotentialDifferenceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectricPotentialDifferenceUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="cV"/>
 *     <enumeration value="dV"/>
 *     <enumeration value="fV"/>
 *     <enumeration value="GV"/>
 *     <enumeration value="kV"/>
 *     <enumeration value="mV"/>
 *     <enumeration value="MV"/>
 *     <enumeration value="nV"/>
 *     <enumeration value="pV"/>
 *     <enumeration value="TV"/>
 *     <enumeration value="uV"/>
 *     <enumeration value="V"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectricPotentialDifferenceUom")
@XmlEnum
public enum ElectricPotentialDifferenceUom {


    /**
     * centivolt
     * 
     */
    @XmlEnumValue("cV")
    C_V("cV"),

    /**
     * decivolt
     * 
     */
    @XmlEnumValue("dV")
    D_V("dV"),

    /**
     * femtovolt
     * 
     */
    @XmlEnumValue("fV")
    F_V("fV"),

    /**
     * gigavolt
     * 
     */
    GV("GV"),

    /**
     * kilovolt
     * 
     */
    @XmlEnumValue("kV")
    K_V("kV"),

    /**
     * millivolt
     * 
     */
    @XmlEnumValue("mV")
    M_V("mV"),

    /**
     * megavolt
     * 
     */
    MV("MV"),

    /**
     * nanovolt
     * 
     */
    @XmlEnumValue("nV")
    N_V("nV"),

    /**
     * picovolt
     * 
     */
    @XmlEnumValue("pV")
    P_V("pV"),

    /**
     * teravolt
     * 
     */
    TV("TV"),

    /**
     * microvolt
     * 
     */
    @XmlEnumValue("uV")
    U_V("uV"),

    /**
     * volt
     * 
     */
    V("V");
    private final String value;

    ElectricPotentialDifferenceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricPotentialDifferenceUom fromValue(String v) {
        for (ElectricPotentialDifferenceUom c: ElectricPotentialDifferenceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
