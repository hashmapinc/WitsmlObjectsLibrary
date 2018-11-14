


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumePerTimePerPressureLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="VolumePerTimePerPressureLengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="bbl/(ft.psi.d)"/>
 *     <enumeration value="ft3/(ft.psi.d)"/>
 *     <enumeration value="m2/(kPa.d)"/>
 *     <enumeration value="m2/(Pa.s)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VolumePerTimePerPressureLengthUom")
@XmlEnum
public enum VolumePerTimePerPressureLengthUom {


    /**
     * barrel per day foot psi
     * 
     */
    @XmlEnumValue("bbl/(ft.psi.d)")
    BBL_FT_PSI_D("bbl/(ft.psi.d)"),

    /**
     * cubic foot per day foot psi
     * 
     */
    @XmlEnumValue("ft3/(ft.psi.d)")
    FT_3_FT_PSI_D("ft3/(ft.psi.d)"),

    /**
     * square metre per kilopascal day
     * 
     */
    @XmlEnumValue("m2/(kPa.d)")
    M_2_K_PA_D("m2/(kPa.d)"),

    /**
     * square metre per pascal second
     * 
     */
    @XmlEnumValue("m2/(Pa.s)")
    M_2_PA_S("m2/(Pa.s)");
    private final String value;

    VolumePerTimePerPressureLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumePerTimePerPressureLengthUom fromValue(String v) {
        for (VolumePerTimePerPressureLengthUom c: VolumePerTimePerPressureLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
