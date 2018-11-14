


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PressureTimePerVolumeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PressureTimePerVolumeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Pa.s/m3"/>
 *     <enumeration value="psi.d/bbl"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PressureTimePerVolumeUom")
@XmlEnum
public enum PressureTimePerVolumeUom {


    /**
     * pascal second per cubic metre
     * 
     */
    @XmlEnumValue("Pa.s/m3")
    PA_S_M_3("Pa.s/m3"),

    /**
     * psi day per barrel
     * 
     */
    @XmlEnumValue("psi.d/bbl")
    PSI_D_BBL("psi.d/bbl");
    private final String value;

    PressureTimePerVolumeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PressureTimePerVolumeUom fromValue(String v) {
        for (PressureTimePerVolumeUom c: PressureTimePerVolumeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
