


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LuminanceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LuminanceUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="cd/m2"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuminanceUom")
@XmlEnum
public enum LuminanceUom {


    /**
     * candela per square metre
     * 
     */
    @XmlEnumValue("cd/m2")
    CD_M_2("cd/m2");
    private final String value;

    LuminanceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuminanceUom fromValue(String v) {
        for (LuminanceUom c: LuminanceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
