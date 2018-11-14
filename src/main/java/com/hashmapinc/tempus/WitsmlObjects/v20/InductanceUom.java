


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InductanceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="InductanceUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="cH"/>
 *     <enumeration value="dH"/>
 *     <enumeration value="EH"/>
 *     <enumeration value="fH"/>
 *     <enumeration value="GH"/>
 *     <enumeration value="H"/>
 *     <enumeration value="kH"/>
 *     <enumeration value="MH"/>
 *     <enumeration value="mH"/>
 *     <enumeration value="nH"/>
 *     <enumeration value="TH"/>
 *     <enumeration value="uH"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InductanceUom")
@XmlEnum
public enum InductanceUom {


    /**
     * centihenry
     * 
     */
    @XmlEnumValue("cH")
    C_H("cH"),

    /**
     * decihenry
     * 
     */
    @XmlEnumValue("dH")
    D_H("dH"),

    /**
     * exahenry
     * 
     */
    EH("EH"),

    /**
     * femtohenry
     * 
     */
    @XmlEnumValue("fH")
    F_H("fH"),

    /**
     * gigahenry
     * 
     */
    GH("GH"),

    /**
     * henry
     * 
     */
    H("H"),

    /**
     * kilohenry
     * 
     */
    @XmlEnumValue("kH")
    K_H("kH"),

    /**
     * megahenry
     * 
     */
    MH("MH"),

    /**
     * millihenry
     * 
     */
    @XmlEnumValue("mH")
    M_H("mH"),

    /**
     * nanohenry
     * 
     */
    @XmlEnumValue("nH")
    N_H("nH"),

    /**
     * terahenry
     * 
     */
    TH("TH"),

    /**
     * microhenry
     * 
     */
    @XmlEnumValue("uH")
    U_H("uH");
    private final String value;

    InductanceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InductanceUom fromValue(String v) {
        for (InductanceUom c: InductanceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
