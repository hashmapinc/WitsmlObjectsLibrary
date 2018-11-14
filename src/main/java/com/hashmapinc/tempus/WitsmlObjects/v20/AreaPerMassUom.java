


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaPerMassUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AreaPerMassUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="cm2/g"/>
 *     <enumeration value="ft2/lbm"/>
 *     <enumeration value="m2/g"/>
 *     <enumeration value="m2/kg"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AreaPerMassUom")
@XmlEnum
public enum AreaPerMassUom {


    /**
     * square centimetre per gram
     * 
     */
    @XmlEnumValue("cm2/g")
    CM_2_G("cm2/g"),

    /**
     * square foot per pound-mass
     * 
     */
    @XmlEnumValue("ft2/lbm")
    FT_2_LBM("ft2/lbm"),

    /**
     * square metre per gram
     * 
     */
    @XmlEnumValue("m2/g")
    M_2_G("m2/g"),

    /**
     * square metre per kilogram
     * 
     */
    @XmlEnumValue("m2/kg")
    M_2_KG("m2/kg");
    private final String value;

    AreaPerMassUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaPerMassUom fromValue(String v) {
        for (AreaPerMassUom c: AreaPerMassUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
