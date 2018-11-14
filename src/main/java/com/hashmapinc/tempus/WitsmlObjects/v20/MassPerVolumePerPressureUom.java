


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MassPerVolumePerPressureUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MassPerVolumePerPressureUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kg/m3.kPa"/>
 *     <enumeration value="lb/ft.psi"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MassPerVolumePerPressureUom")
@XmlEnum
public enum MassPerVolumePerPressureUom {

    @XmlEnumValue("kg/m3.kPa")
    KG_M_3_K_PA("kg/m3.kPa"),
    @XmlEnumValue("lb/ft.psi")
    LB_FT_PSI("lb/ft.psi");
    private final String value;

    MassPerVolumePerPressureUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MassPerVolumePerPressureUom fromValue(String v) {
        for (MassPerVolumePerPressureUom c: MassPerVolumePerPressureUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
