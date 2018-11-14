


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MomentumUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MomentumUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kg.m/s"/>
 *     <enumeration value="lbm.ft/s"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MomentumUom")
@XmlEnum
public enum MomentumUom {


    /**
     * kilogram metre per second
     * 
     */
    @XmlEnumValue("kg.m/s")
    KG_M_S("kg.m/s"),

    /**
     * foot pound-mass per second
     * 
     */
    @XmlEnumValue("lbm.ft/s")
    LBM_FT_S("lbm.ft/s");
    private final String value;

    MomentumUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MomentumUom fromValue(String v) {
        for (MomentumUom c: MomentumUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
