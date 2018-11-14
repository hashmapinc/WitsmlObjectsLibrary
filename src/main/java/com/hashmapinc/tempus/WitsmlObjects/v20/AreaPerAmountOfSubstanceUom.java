


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaPerAmountOfSubstanceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AreaPerAmountOfSubstanceUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="m2/mol"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AreaPerAmountOfSubstanceUom")
@XmlEnum
public enum AreaPerAmountOfSubstanceUom {


    /**
     * square metre per gram-mole
     * 
     */
    @XmlEnumValue("m2/mol")
    M_2_MOL("m2/mol");
    private final String value;

    AreaPerAmountOfSubstanceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaPerAmountOfSubstanceUom fromValue(String v) {
        for (AreaPerAmountOfSubstanceUom c: AreaPerAmountOfSubstanceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
