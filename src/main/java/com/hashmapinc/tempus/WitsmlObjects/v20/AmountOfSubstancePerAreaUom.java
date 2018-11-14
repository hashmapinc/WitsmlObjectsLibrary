


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountOfSubstancePerAreaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AmountOfSubstancePerAreaUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="mol/m2"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmountOfSubstancePerAreaUom")
@XmlEnum
public enum AmountOfSubstancePerAreaUom {


    /**
     * gram-mole per square metre
     * 
     */
    @XmlEnumValue("mol/m2")
    MOL_M_2("mol/m2");
    private final String value;

    AmountOfSubstancePerAreaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountOfSubstancePerAreaUom fromValue(String v) {
        for (AmountOfSubstancePerAreaUom c: AmountOfSubstancePerAreaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
