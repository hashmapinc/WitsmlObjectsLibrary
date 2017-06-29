package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for electricPotentialUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="electricPotentialUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="V"/>
 *     <enumeration value="kV"/>
 *     <enumeration value="mV"/>
 *     <enumeration value="MV"/>
 *     <enumeration value="uV"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "electricPotentialUom")
@XmlEnum
public enum ElectricPotentialUom {

    V("V"),
    @XmlEnumValue("kV")
    K_V("kV"),
    @XmlEnumValue("mV")
    M_V("mV"),
    MV("MV"),
    @XmlEnumValue("uV")
    U_V("uV");
    private final String value;

    ElectricPotentialUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricPotentialUom fromValue(String v) {
        for (ElectricPotentialUom c: ElectricPotentialUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
