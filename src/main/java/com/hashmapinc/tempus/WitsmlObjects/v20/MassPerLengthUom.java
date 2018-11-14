


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MassPerLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MassPerLengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kg.m/cm2"/>
 *     <enumeration value="kg/m"/>
 *     <enumeration value="klbm/in"/>
 *     <enumeration value="lbm/ft"/>
 *     <enumeration value="Mg/in"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MassPerLengthUom")
@XmlEnum
public enum MassPerLengthUom {


    /**
     * kilogram metre per square centimetre
     * 
     */
    @XmlEnumValue("kg.m/cm2")
    KG_M_CM_2("kg.m/cm2"),

    /**
     * kilogram per metre
     * 
     */
    @XmlEnumValue("kg/m")
    KG_M("kg/m"),

    /**
     * thousand pound-mass per inch
     * 
     */
    @XmlEnumValue("klbm/in")
    KLBM_IN("klbm/in"),

    /**
     * pound-mass per foot
     * 
     */
    @XmlEnumValue("lbm/ft")
    LBM_FT("lbm/ft"),

    /**
     * megagram per inch
     * 
     */
    @XmlEnumValue("Mg/in")
    MG_IN("Mg/in");
    private final String value;

    MassPerLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MassPerLengthUom fromValue(String v) {
        for (MassPerLengthUom c: MassPerLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
