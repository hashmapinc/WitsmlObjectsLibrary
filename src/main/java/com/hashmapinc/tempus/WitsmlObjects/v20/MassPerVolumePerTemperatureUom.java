


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MassPerVolumePerTemperatureUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MassPerVolumePerTemperatureUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kg/m3.degC"/>
 *     <enumeration value="kg/m3.K"/>
 *     <enumeration value="lb/ft.degF"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MassPerVolumePerTemperatureUom")
@XmlEnum
public enum MassPerVolumePerTemperatureUom {

    @XmlEnumValue("kg/m3.degC")
    KG_M_3_DEG_C("kg/m3.degC"),
    @XmlEnumValue("kg/m3.K")
    KG_M_3_K("kg/m3.K"),
    @XmlEnumValue("lb/ft.degF")
    LB_FT_DEG_F("lb/ft.degF");
    private final String value;

    MassPerVolumePerTemperatureUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MassPerVolumePerTemperatureUom fromValue(String v) {
        for (MassPerVolumePerTemperatureUom c: MassPerVolumePerTemperatureUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
