


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricConductanceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectricConductanceUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="cS"/>
 *     <enumeration value="dS"/>
 *     <enumeration value="ES"/>
 *     <enumeration value="fS"/>
 *     <enumeration value="GS"/>
 *     <enumeration value="kS"/>
 *     <enumeration value="mS"/>
 *     <enumeration value="MS"/>
 *     <enumeration value="nS"/>
 *     <enumeration value="pS"/>
 *     <enumeration value="S"/>
 *     <enumeration value="TS"/>
 *     <enumeration value="uS"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectricConductanceUom")
@XmlEnum
public enum ElectricConductanceUom {


    /**
     * centisiemens
     * 
     */
    @XmlEnumValue("cS")
    C_S("cS"),

    /**
     * decisiemens
     * 
     */
    @XmlEnumValue("dS")
    D_S("dS"),

    /**
     * exasiemens
     * 
     */
    ES("ES"),

    /**
     * femtosiemens
     * 
     */
    @XmlEnumValue("fS")
    F_S("fS"),

    /**
     * gigasiemens
     * 
     */
    GS("GS"),

    /**
     * kilosiemens
     * 
     */
    @XmlEnumValue("kS")
    K_S("kS"),

    /**
     * millisiemens
     * 
     */
    @XmlEnumValue("mS")
    M_S("mS"),

    /**
     * megasiemens
     * 
     */
    MS("MS"),

    /**
     * nanosiemens
     * 
     */
    @XmlEnumValue("nS")
    N_S("nS"),

    /**
     * picosiemens
     * 
     */
    @XmlEnumValue("pS")
    P_S("pS"),

    /**
     * siemens
     * 
     */
    S("S"),

    /**
     * terasiemens
     * 
     */
    TS("TS"),

    /**
     * microsiemens
     * 
     */
    @XmlEnumValue("uS")
    U_S("uS");
    private final String value;

    ElectricConductanceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricConductanceUom fromValue(String v) {
        for (ElectricConductanceUom c: ElectricConductanceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
