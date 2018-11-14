


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MagneticVectorPotentialUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MagneticVectorPotentialUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Wb/m"/>
 *     <enumeration value="Wb/mm"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MagneticVectorPotentialUom")
@XmlEnum
public enum MagneticVectorPotentialUom {


    /**
     * weber per metre
     * 
     */
    @XmlEnumValue("Wb/m")
    WB_M("Wb/m"),

    /**
     * weber per millimetre
     * 
     */
    @XmlEnumValue("Wb/mm")
    WB_MM("Wb/mm");
    private final String value;

    MagneticVectorPotentialUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MagneticVectorPotentialUom fromValue(String v) {
        for (MagneticVectorPotentialUom c: MagneticVectorPotentialUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
