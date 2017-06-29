package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for powerUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="powerUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="W"/>
 *     <enumeration value="ch"/>
 *     <enumeration value="CV"/>
 *     <enumeration value="ehp"/>
 *     <enumeration value="GW"/>
 *     <enumeration value="hhp"/>
 *     <enumeration value="hp"/>
 *     <enumeration value="kcal/h"/>
 *     <enumeration value="kW"/>
 *     <enumeration value="MJ/a"/>
 *     <enumeration value="MW"/>
 *     <enumeration value="mW"/>
 *     <enumeration value="nW"/>
 *     <enumeration value="ton of refrig"/>
 *     <enumeration value="TW"/>
 *     <enumeration value="uW"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "powerUom")
@XmlEnum
public enum PowerUom {

    W("W"),
    @XmlEnumValue("ch")
    CH("ch"),
    CV("CV"),
    @XmlEnumValue("ehp")
    EHP("ehp"),
    GW("GW"),
    @XmlEnumValue("hhp")
    HHP("hhp"),
    @XmlEnumValue("hp")
    HP("hp"),
    @XmlEnumValue("kcal/h")
    KCAL_H("kcal/h"),
    @XmlEnumValue("kW")
    K_W("kW"),
    @XmlEnumValue("MJ/a")
    MJ_A("MJ/a"),
    MW("MW"),
    @XmlEnumValue("mW")
    M_W("mW"),
    @XmlEnumValue("nW")
    N_W("nW"),
    @XmlEnumValue("ton of refrig")
    TON_OF_REFRIG("ton of refrig"),
    TW("TW"),
    @XmlEnumValue("uW")
    U_W("uW");
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
