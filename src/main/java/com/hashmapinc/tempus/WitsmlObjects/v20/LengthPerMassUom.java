


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LengthPerMassUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LengthPerMassUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="ft/lbm"/>
 *     <enumeration value="m/kg"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LengthPerMassUom")
@XmlEnum
public enum LengthPerMassUom {


    /**
     * foot per pound-mass
     * 
     */
    @XmlEnumValue("ft/lbm")
    FT_LBM("ft/lbm"),

    /**
     * metre per kilogram
     * 
     */
    @XmlEnumValue("m/kg")
    M_KG("m/kg");
    private final String value;

    LengthPerMassUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LengthPerMassUom fromValue(String v) {
        for (LengthPerMassUom c: LengthPerMassUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
