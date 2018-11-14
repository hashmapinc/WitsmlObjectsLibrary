


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapacitanceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="CapacitanceUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="cF"/>
 *     <enumeration value="dF"/>
 *     <enumeration value="EF"/>
 *     <enumeration value="F"/>
 *     <enumeration value="fF"/>
 *     <enumeration value="GF"/>
 *     <enumeration value="kF"/>
 *     <enumeration value="mF"/>
 *     <enumeration value="MF"/>
 *     <enumeration value="nF"/>
 *     <enumeration value="pF"/>
 *     <enumeration value="TF"/>
 *     <enumeration value="uF"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CapacitanceUom")
@XmlEnum
public enum CapacitanceUom {


    /**
     * centifarad
     * 
     */
    @XmlEnumValue("cF")
    C_F("cF"),

    /**
     * decifarad
     * 
     */
    @XmlEnumValue("dF")
    D_F("dF"),

    /**
     * exafarad
     * 
     */
    EF("EF"),

    /**
     * farad
     * 
     */
    F("F"),

    /**
     * femtofarad
     * 
     */
    @XmlEnumValue("fF")
    F_F("fF"),

    /**
     * gigafarad
     * 
     */
    GF("GF"),

    /**
     * kilofarad
     * 
     */
    @XmlEnumValue("kF")
    K_F("kF"),

    /**
     * millifarad
     * 
     */
    @XmlEnumValue("mF")
    M_F("mF"),

    /**
     * megafarad
     * 
     */
    MF("MF"),

    /**
     * nanofarad
     * 
     */
    @XmlEnumValue("nF")
    N_F("nF"),

    /**
     * picofarad
     * 
     */
    @XmlEnumValue("pF")
    P_F("pF"),

    /**
     * terafarad
     * 
     */
    TF("TF"),

    /**
     * microfarad
     * 
     */
    @XmlEnumValue("uF")
    U_F("uF");
    private final String value;

    CapacitanceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CapacitanceUom fromValue(String v) {
        for (CapacitanceUom c: CapacitanceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
