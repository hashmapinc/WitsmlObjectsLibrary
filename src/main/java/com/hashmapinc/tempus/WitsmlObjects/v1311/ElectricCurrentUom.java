package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for electricCurrentUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="electricCurrentUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="A"/>
 *     <enumeration value="MA"/>
 *     <enumeration value="kA"/>
 *     <enumeration value="mA"/>
 *     <enumeration value="nA"/>
 *     <enumeration value="pA"/>
 *     <enumeration value="uA"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "electricCurrentUom")
@XmlEnum
public enum ElectricCurrentUom {

    A("A"),
    MA("MA"),
    @XmlEnumValue("kA")
    K_A("kA"),
    @XmlEnumValue("mA")
    M_A("mA"),
    @XmlEnumValue("nA")
    N_A("nA"),
    @XmlEnumValue("pA")
    P_A("pA"),
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
