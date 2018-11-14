


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectromagneticMomentUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectromagneticMomentUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="A.m2"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectromagneticMomentUom")
@XmlEnum
public enum ElectromagneticMomentUom {


    /**
     * ampere square metre
     * 
     */
    @XmlEnumValue("A.m2")
    A_M_2("A.m2");
    private final String value;

    ElectromagneticMomentUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectromagneticMomentUom fromValue(String v) {
        for (ElectromagneticMomentUom c: ElectromagneticMomentUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
