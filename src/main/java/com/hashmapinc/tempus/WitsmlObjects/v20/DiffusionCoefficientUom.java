


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiffusionCoefficientUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="DiffusionCoefficientUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="m2/s"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiffusionCoefficientUom")
@XmlEnum
public enum DiffusionCoefficientUom {


    /**
     * square metre per second
     * 
     */
    @XmlEnumValue("m2/s")
    M_2_S("m2/s");
    private final String value;

    DiffusionCoefficientUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiffusionCoefficientUom fromValue(String v) {
        for (DiffusionCoefficientUom c: DiffusionCoefficientUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
