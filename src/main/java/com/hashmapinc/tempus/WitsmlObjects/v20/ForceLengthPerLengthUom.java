


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForceLengthPerLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ForceLengthPerLengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kgf.m/m"/>
 *     <enumeration value="lbf.ft/in"/>
 *     <enumeration value="lbf.in/in"/>
 *     <enumeration value="N.m/m"/>
 *     <enumeration value="tonf[US].mi/ft"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForceLengthPerLengthUom")
@XmlEnum
public enum ForceLengthPerLengthUom {


    /**
     * thousand gram-force metre per metre
     * 
     */
    @XmlEnumValue("kgf.m/m")
    KGF_M_M("kgf.m/m"),

    /**
     * foot pound-force per inch
     * 
     */
    @XmlEnumValue("lbf.ft/in")
    LBF_FT_IN("lbf.ft/in"),

    /**
     * pound-force inch per inch
     * 
     */
    @XmlEnumValue("lbf.in/in")
    LBF_IN_IN("lbf.in/in"),

    /**
     * newton metre per metre
     * 
     */
    @XmlEnumValue("N.m/m")
    N_M_M("N.m/m"),

    /**
     * US ton-force mile per foot
     * 
     */
    @XmlEnumValue("tonf[US].mi/ft")
    TONF_US_MI_FT("tonf[US].mi/ft");
    private final String value;

    ForceLengthPerLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForceLengthPerLengthUom fromValue(String v) {
        for (ForceLengthPerLengthUom c: ForceLengthPerLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
