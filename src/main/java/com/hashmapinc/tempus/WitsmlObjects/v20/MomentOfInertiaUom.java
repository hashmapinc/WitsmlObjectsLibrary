


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MomentOfInertiaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MomentOfInertiaUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kg.m2"/>
 *     <enumeration value="lbm.ft2"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MomentOfInertiaUom")
@XmlEnum
public enum MomentOfInertiaUom {


    /**
     * kilogram square metre
     * 
     */
    @XmlEnumValue("kg.m2")
    KG_M_2("kg.m2"),

    /**
     * pound-mass square foot
     * 
     */
    @XmlEnumValue("lbm.ft2")
    LBM_FT_2("lbm.ft2");
    private final String value;

    MomentOfInertiaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MomentOfInertiaUom fromValue(String v) {
        for (MomentOfInertiaUom c: MomentOfInertiaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
