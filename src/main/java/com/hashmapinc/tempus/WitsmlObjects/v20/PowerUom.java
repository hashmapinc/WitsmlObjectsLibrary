


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PowerUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="cW"/>
 *     <enumeration value="dW"/>
 *     <enumeration value="EW"/>
 *     <enumeration value="fW"/>
 *     <enumeration value="GW"/>
 *     <enumeration value="hp"/>
 *     <enumeration value="hp[elec]"/>
 *     <enumeration value="hp[hyd]"/>
 *     <enumeration value="hp[metric]"/>
 *     <enumeration value="kW"/>
 *     <enumeration value="MW"/>
 *     <enumeration value="mW"/>
 *     <enumeration value="nW"/>
 *     <enumeration value="pW"/>
 *     <enumeration value="tonRefrig"/>
 *     <enumeration value="TW"/>
 *     <enumeration value="uW"/>
 *     <enumeration value="W"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PowerUom")
@XmlEnum
public enum PowerUom {


    /**
     * centiwatt
     * 
     */
    @XmlEnumValue("cW")
    C_W("cW"),

    /**
     * deciwatt
     * 
     */
    @XmlEnumValue("dW")
    D_W("dW"),

    /**
     * exawatt
     * 
     */
    EW("EW"),

    /**
     * femtowatt
     * 
     */
    @XmlEnumValue("fW")
    F_W("fW"),

    /**
     * gigawatt
     * 
     */
    GW("GW"),

    /**
     * horsepower
     * 
     */
    @XmlEnumValue("hp")
    HP("hp"),

    /**
     * electric-horsepower
     * 
     */
    @XmlEnumValue("hp[elec]")
    HP_ELEC("hp[elec]"),

    /**
     * hydraulic-horsepower
     * 
     */
    @XmlEnumValue("hp[hyd]")
    HP_HYD("hp[hyd]"),

    /**
     * metric-horsepower
     * 
     */
    @XmlEnumValue("hp[metric]")
    HP_METRIC("hp[metric]"),

    /**
     * kilowatt
     * 
     */
    @XmlEnumValue("kW")
    K_W("kW"),

    /**
     * megawatt
     * 
     */
    MW("MW"),

    /**
     * milliwatt
     * 
     */
    @XmlEnumValue("mW")
    M_W("mW"),

    /**
     * nanowatt
     * 
     */
    @XmlEnumValue("nW")
    N_W("nW"),

    /**
     * picowatt
     * 
     */
    @XmlEnumValue("pW")
    P_W("pW"),

    /**
     * ton-refrigeration
     * 
     */
    @XmlEnumValue("tonRefrig")
    TON_REFRIG("tonRefrig"),

    /**
     * terawatt
     * 
     */
    TW("TW"),

    /**
     * microwatt
     * 
     */
    @XmlEnumValue("uW")
    U_W("uW"),

    /**
     * watt
     * 
     */
    W("W");
    private final String value;

    PowerUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PowerUom fromValue(String v) {
        for (PowerUom c: PowerUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
