


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MobilityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="D/(Pa.s)"/>
 *     <enumeration value="D/cP"/>
 *     <enumeration value="mD.ft2/(lbf.s)"/>
 *     <enumeration value="mD.in2/(lbf.s)"/>
 *     <enumeration value="mD/(Pa.s)"/>
 *     <enumeration value="mD/cP"/>
 *     <enumeration value="TD[API]/(Pa.s)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilityUom")
@XmlEnum
public enum MobilityUom {


    /**
     * darcy per pascal second
     * 
     */
    @XmlEnumValue("D/(Pa.s)")
    D_PA_S("D/(Pa.s)"),

    /**
     * darcy per centipoise
     * 
     */
    @XmlEnumValue("D/cP")
    D_C_P("D/cP"),

    /**
     * millidarcy square foot per pound-force second
     * 
     */
    @XmlEnumValue("mD.ft2/(lbf.s)")
    M_D_FT_2_LBF_S("mD.ft2/(lbf.s)"),

    /**
     * millidarcy square inch per pound-force second
     * 
     */
    @XmlEnumValue("mD.in2/(lbf.s)")
    M_D_IN_2_LBF_S("mD.in2/(lbf.s)"),

    /**
     * millidarcy per pascal second
     * 
     */
    @XmlEnumValue("mD/(Pa.s)")
    M_D_PA_S("mD/(Pa.s)"),

    /**
     * millidarcy per centipoise
     * 
     */
    @XmlEnumValue("mD/cP")
    M_D_C_P("mD/cP"),

    /**
     * teradarcy-API per pascal second
     * 
     */
    @XmlEnumValue("TD[API]/(Pa.s)")
    TD_API_PA_S("TD[API]/(Pa.s)");
    private final String value;

    MobilityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilityUom fromValue(String v) {
        for (MobilityUom c: MobilityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
