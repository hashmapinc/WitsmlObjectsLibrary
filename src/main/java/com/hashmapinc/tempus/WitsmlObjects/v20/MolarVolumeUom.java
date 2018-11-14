


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MolarVolumeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MolarVolumeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="dm3/kmol"/>
 *     <enumeration value="ft3/lbmol"/>
 *     <enumeration value="L/kmol"/>
 *     <enumeration value="L/mol"/>
 *     <enumeration value="m3/kmol"/>
 *     <enumeration value="m3/mol"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MolarVolumeUom")
@XmlEnum
public enum MolarVolumeUom {


    /**
     * cubic decimetre per kilogram-mole
     * 
     */
    @XmlEnumValue("dm3/kmol")
    DM_3_KMOL("dm3/kmol"),

    /**
     * cubic foot per pound-mass-mole
     * 
     */
    @XmlEnumValue("ft3/lbmol")
    FT_3_LBMOL("ft3/lbmol"),

    /**
     * litre per kilogram-mole
     * 
     */
    @XmlEnumValue("L/kmol")
    L_KMOL("L/kmol"),

    /**
     * litre per gram-mole
     * 
     */
    @XmlEnumValue("L/mol")
    L_MOL("L/mol"),

    /**
     * cubic metre per kilogram-mole
     * 
     */
    @XmlEnumValue("m3/kmol")
    M_3_KMOL("m3/kmol"),

    /**
     * cubic metre per gram-mole
     * 
     */
    @XmlEnumValue("m3/mol")
    M_3_MOL("m3/mol");
    private final String value;

    MolarVolumeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MolarVolumeUom fromValue(String v) {
        for (MolarVolumeUom c: MolarVolumeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
