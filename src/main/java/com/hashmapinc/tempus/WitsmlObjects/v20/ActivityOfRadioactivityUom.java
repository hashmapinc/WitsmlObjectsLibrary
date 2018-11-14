


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityOfRadioactivityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ActivityOfRadioactivityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Bq"/>
 *     <enumeration value="Ci"/>
 *     <enumeration value="GBq"/>
 *     <enumeration value="MBq"/>
 *     <enumeration value="mCi"/>
 *     <enumeration value="nCi"/>
 *     <enumeration value="pCi"/>
 *     <enumeration value="TBq"/>
 *     <enumeration value="uCi"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActivityOfRadioactivityUom")
@XmlEnum
public enum ActivityOfRadioactivityUom {


    /**
     * becquerel
     * 
     */
    @XmlEnumValue("Bq")
    BQ("Bq"),

    /**
     * curie
     * 
     */
    @XmlEnumValue("Ci")
    CI("Ci"),

    /**
     * gigabecquerel
     * 
     */
    @XmlEnumValue("GBq")
    G_BQ("GBq"),

    /**
     * megabecquerel
     * 
     */
    @XmlEnumValue("MBq")
    M_BQ("MBq"),

    /**
     * thousandth of curie
     * 
     */
    @XmlEnumValue("mCi")
    M_CI("mCi"),

    /**
     * nanocurie
     * 
     */
    @XmlEnumValue("nCi")
    N_CI("nCi"),

    /**
     * picocurie
     * 
     */
    @XmlEnumValue("pCi")
    P_CI("pCi"),

    /**
     * terabecquerel
     * 
     */
    @XmlEnumValue("TBq")
    T_BQ("TBq"),

    /**
     * millionth of curie
     * 
     */
    @XmlEnumValue("uCi")
    U_CI("uCi");
    private final String value;

    ActivityOfRadioactivityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivityOfRadioactivityUom fromValue(String v) {
        for (ActivityOfRadioactivityUom c: ActivityOfRadioactivityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
