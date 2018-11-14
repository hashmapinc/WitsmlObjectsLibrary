


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PressurePerVolumeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PressurePerVolumeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Pa/m3"/>
 *     <enumeration value="psi2.d/(cP.ft3)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PressurePerVolumeUom")
@XmlEnum
public enum PressurePerVolumeUom {


    /**
     * pascal per cubic metre
     * 
     */
    @XmlEnumValue("Pa/m3")
    PA_M_3("Pa/m3"),

    /**
     * psi squared day per centipoise cubic foot
     * 
     */
    @XmlEnumValue("psi2.d/(cP.ft3)")
    PSI_2_D_C_P_FT_3("psi2.d/(cP.ft3)");
    private final String value;

    PressurePerVolumeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PressurePerVolumeUom fromValue(String v) {
        for (PressurePerVolumeUom c: PressurePerVolumeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
