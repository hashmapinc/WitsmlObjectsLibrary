


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MassLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MassLengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kg.m"/>
 *     <enumeration value="lbm.ft"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MassLengthUom")
@XmlEnum
public enum MassLengthUom {


    /**
     * kilogram metre
     * 
     */
    @XmlEnumValue("kg.m")
    KG_M("kg.m"),

    /**
     * pound-mass foot
     * 
     */
    @XmlEnumValue("lbm.ft")
    LBM_FT("lbm.ft");
    private final String value;

    MassLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MassLengthUom fromValue(String v) {
        for (MassLengthUom c: MassLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
