


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolumePerTimePerVolumeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="VolumePerTimePerVolumeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="bbl/(d.acre.ft)"/>
 *     <enumeration value="m3/(s.m3)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VolumePerTimePerVolumeUom")
@XmlEnum
public enum VolumePerTimePerVolumeUom {


    /**
     * barrel per day acre foot
     * 
     */
    @XmlEnumValue("bbl/(d.acre.ft)")
    BBL_D_ACRE_FT("bbl/(d.acre.ft)"),

    /**
     * cubic metre per time cubic metre
     * 
     */
    @XmlEnumValue("m3/(s.m3)")
    M_3_S_M_3("m3/(s.m3)");
    private final String value;

    VolumePerTimePerVolumeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VolumePerTimePerVolumeUom fromValue(String v) {
        for (VolumePerTimePerVolumeUom c: VolumePerTimePerVolumeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
