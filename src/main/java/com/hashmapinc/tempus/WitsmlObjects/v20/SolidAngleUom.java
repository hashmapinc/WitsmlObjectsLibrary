


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SolidAngleUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="SolidAngleUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="sr"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SolidAngleUom")
@XmlEnum
public enum SolidAngleUom {


    /**
     * steradian
     * 
     */
    @XmlEnumValue("sr")
    SR("sr");
    private final String value;

    SolidAngleUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SolidAngleUom fromValue(String v) {
        for (SolidAngleUom c: SolidAngleUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
