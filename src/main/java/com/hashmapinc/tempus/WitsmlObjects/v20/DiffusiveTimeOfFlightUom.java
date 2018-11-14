


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiffusiveTimeOfFlightUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="DiffusiveTimeOfFlightUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="h(0.5)"/>
 *     <enumeration value="s(0.5)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiffusiveTimeOfFlightUom")
@XmlEnum
public enum DiffusiveTimeOfFlightUom {

    @XmlEnumValue("h(0.5)")
    H_0_5("h(0.5)"),

    /**
     * square root of second
     * 
     */
    @XmlEnumValue("s(0.5)")
    S_0_5("s(0.5)");
    private final String value;

    DiffusiveTimeOfFlightUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiffusiveTimeOfFlightUom fromValue(String v) {
        for (DiffusiveTimeOfFlightUom c: DiffusiveTimeOfFlightUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
