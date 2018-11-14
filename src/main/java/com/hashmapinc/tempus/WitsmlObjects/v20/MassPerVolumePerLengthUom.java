


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MassPerVolumePerLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MassPerVolumePerLengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="g/cm4"/>
 *     <enumeration value="kg/dm4"/>
 *     <enumeration value="kg/m4"/>
 *     <enumeration value="lbm/(gal[UK].ft)"/>
 *     <enumeration value="lbm/(gal[US].ft)"/>
 *     <enumeration value="lbm/ft4"/>
 *     <enumeration value="Pa.s2/m3"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MassPerVolumePerLengthUom")
@XmlEnum
public enum MassPerVolumePerLengthUom {


    /**
     * gram per centimetre to the fourth power
     * 
     */
    @XmlEnumValue("g/cm4")
    G_CM_4("g/cm4"),

    /**
     * kilogram per decimetre to the fourth power
     * 
     */
    @XmlEnumValue("kg/dm4")
    KG_DM_4("kg/dm4"),

    /**
     * kilogram per metre to the fourth power
     * 
     */
    @XmlEnumValue("kg/m4")
    KG_M_4("kg/m4"),

    /**
     * pound-mass per UK gallon foot
     * 
     */
    @XmlEnumValue("lbm/(gal[UK].ft)")
    LBM_GAL_UK_FT("lbm/(gal[UK].ft)"),

    /**
     * pound-mass per US gallon foot
     * 
     */
    @XmlEnumValue("lbm/(gal[US].ft)")
    LBM_GAL_US_FT("lbm/(gal[US].ft)"),

    /**
     * pound-mass per foot to the fourth power
     * 
     */
    @XmlEnumValue("lbm/ft4")
    LBM_FT_4("lbm/ft4"),

    /**
     * pascal second squared per cubic metre
     * 
     */
    @XmlEnumValue("Pa.s2/m3")
    PA_S_2_M_3("Pa.s2/m3");
    private final String value;

    MassPerVolumePerLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MassPerVolumePerLengthUom fromValue(String v) {
        for (MassPerVolumePerLengthUom c: MassPerVolumePerLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
