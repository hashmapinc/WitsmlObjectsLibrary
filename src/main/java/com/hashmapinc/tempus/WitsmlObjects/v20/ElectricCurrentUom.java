


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricCurrentUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectricCurrentUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="A"/>
 *     <enumeration value="cA"/>
 *     <enumeration value="dA"/>
 *     <enumeration value="EA"/>
 *     <enumeration value="fA"/>
 *     <enumeration value="GA"/>
 *     <enumeration value="kA"/>
 *     <enumeration value="MA"/>
 *     <enumeration value="mA"/>
 *     <enumeration value="nA"/>
 *     <enumeration value="pA"/>
 *     <enumeration value="TA"/>
 *     <enumeration value="uA"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectricCurrentUom")
@XmlEnum
public enum ElectricCurrentUom {


    /**
     * ampere
     * 
     */
    A("A"),

    /**
     * centiampere
     * 
     */
    @XmlEnumValue("cA")
    C_A("cA"),

    /**
     * deciampere
     * 
     */
    @XmlEnumValue("dA")
    D_A("dA"),

    /**
     * exaampere
     * 
     */
    EA("EA"),

    /**
     * femtoampere
     * 
     */
    @XmlEnumValue("fA")
    F_A("fA"),

    /**
     * gigaampere
     * 
     */
    GA("GA"),

    /**
     * kiloampere
     * 
     */
    @XmlEnumValue("kA")
    K_A("kA"),

    /**
     * megaampere
     * 
     */
    MA("MA"),

    /**
     * milliampere
     * 
     */
    @XmlEnumValue("mA")
    M_A("mA"),

    /**
     * nanoampere
     * 
     */
    @XmlEnumValue("nA")
    N_A("nA"),

    /**
     * picoampere
     * 
     */
    @XmlEnumValue("pA")
    P_A("pA"),

    /**
     * teraampere
     * 
     */
    TA("TA"),

    /**
     * microampere
     * 
     */
    @XmlEnumValue("uA")
    U_A("uA");
    private final String value;

    ElectricCurrentUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricCurrentUom fromValue(String v) {
        for (ElectricCurrentUom c: ElectricCurrentUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
