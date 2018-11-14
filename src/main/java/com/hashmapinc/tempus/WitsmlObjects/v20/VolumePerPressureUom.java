


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumePerPressureUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="VolumePerPressureUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="bbl/psi"/>
 *     <enumeration value="m3/kPa"/>
 *     <enumeration value="m3/Pa"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VolumePerPressureUom")
@XmlEnum
public enum VolumePerPressureUom {


    /**
     * barrel per psi
     * 
     */
    @XmlEnumValue("bbl/psi")
    BBL_PSI("bbl/psi"),

    /**
     * cubic metre per kilopascal
     * 
     */
    @XmlEnumValue("m3/kPa")
    M_3_K_PA("m3/kPa"),

    /**
     * cubic metre per Pascal
     * 
     */
    @XmlEnumValue("m3/Pa")
    M_3_PA("m3/Pa");
    private final String value;

    VolumePerPressureUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumePerPressureUom fromValue(String v) {
        for (VolumePerPressureUom c: VolumePerPressureUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
