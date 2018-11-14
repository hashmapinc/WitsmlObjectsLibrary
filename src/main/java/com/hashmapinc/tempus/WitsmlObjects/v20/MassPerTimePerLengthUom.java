


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MassPerTimePerLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MassPerTimePerLengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kg/(m.s)"/>
 *     <enumeration value="lbm/(ft.h)"/>
 *     <enumeration value="lbm/(ft.s)"/>
 *     <enumeration value="Pa.s"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MassPerTimePerLengthUom")
@XmlEnum
public enum MassPerTimePerLengthUom {


    /**
     * kilogram per metre second
     * 
     */
    @XmlEnumValue("kg/(m.s)")
    KG_M_S("kg/(m.s)"),

    /**
     * pound-mass per hour foot
     * 
     */
    @XmlEnumValue("lbm/(ft.h)")
    LBM_FT_H("lbm/(ft.h)"),

    /**
     * pound-mass per second foot
     * 
     */
    @XmlEnumValue("lbm/(ft.s)")
    LBM_FT_S("lbm/(ft.s)"),

    /**
     * pascal second
     * 
     */
    @XmlEnumValue("Pa.s")
    PA_S("Pa.s");
    private final String value;

    MassPerTimePerLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MassPerTimePerLengthUom fromValue(String v) {
        for (MassPerTimePerLengthUom c: MassPerTimePerLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
