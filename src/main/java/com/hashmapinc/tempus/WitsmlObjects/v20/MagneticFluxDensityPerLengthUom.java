


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MagneticFluxDensityPerLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MagneticFluxDensityPerLengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="gauss/cm"/>
 *     <enumeration value="mT/dm"/>
 *     <enumeration value="T/m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MagneticFluxDensityPerLengthUom")
@XmlEnum
public enum MagneticFluxDensityPerLengthUom {


    /**
     * gauss per centimetre
     * 
     */
    @XmlEnumValue("gauss/cm")
    GAUSS_CM("gauss/cm"),

    /**
     * millitesla per decimetre
     * 
     */
    @XmlEnumValue("mT/dm")
    M_T_DM("mT/dm"),

    /**
     * tesla per metre
     * 
     */
    @XmlEnumValue("T/m")
    T_M("T/m");
    private final String value;

    MagneticFluxDensityPerLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MagneticFluxDensityPerLengthUom fromValue(String v) {
        for (MagneticFluxDensityPerLengthUom c: MagneticFluxDensityPerLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
