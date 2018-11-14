


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MassPerTimePerAreaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MassPerTimePerAreaUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="g.ft/(cm3.s)"/>
 *     <enumeration value="g.m/(cm3.s)"/>
 *     <enumeration value="kg/(m2.s)"/>
 *     <enumeration value="kPa.s/m"/>
 *     <enumeration value="lbm/(ft2.h)"/>
 *     <enumeration value="lbm/(ft2.s)"/>
 *     <enumeration value="MPa.s/m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MassPerTimePerAreaUom")
@XmlEnum
public enum MassPerTimePerAreaUom {


    /**
     * gram foot per cubic centimetre second
     * 
     */
    @XmlEnumValue("g.ft/(cm3.s)")
    G_FT_CM_3_S("g.ft/(cm3.s)"),

    /**
     * gram metre per cubic centimetre second
     * 
     */
    @XmlEnumValue("g.m/(cm3.s)")
    G_M_CM_3_S("g.m/(cm3.s)"),

    /**
     * kilogram per square metre second
     * 
     */
    @XmlEnumValue("kg/(m2.s)")
    KG_M_2_S("kg/(m2.s)"),

    /**
     * kilopascal second per metre
     * 
     */
    @XmlEnumValue("kPa.s/m")
    K_PA_S_M("kPa.s/m"),

    /**
     * pound-mass per square foot hour
     * 
     */
    @XmlEnumValue("lbm/(ft2.h)")
    LBM_FT_2_H("lbm/(ft2.h)"),

    /**
     * pound-mass per square foot second
     * 
     */
    @XmlEnumValue("lbm/(ft2.s)")
    LBM_FT_2_S("lbm/(ft2.s)"),

    /**
     * megapascal second per metre
     * 
     */
    @XmlEnumValue("MPa.s/m")
    M_PA_S_M("MPa.s/m");
    private final String value;

    MassPerTimePerAreaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MassPerTimePerAreaUom fromValue(String v) {
        for (MassPerTimePerAreaUom c: MassPerTimePerAreaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
