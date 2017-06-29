package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for massPerLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="massPerLengthUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="kg/m"/>
 *     <enumeration value="klbm/in"/>
 *     <enumeration value="lbm/ft"/>
 *     <enumeration value="Mg/in"/>
 *     <enumeration value="kg.m/cm2"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "massPerLengthUom")
@XmlEnum
public enum MassPerLengthUom {

    @XmlEnumValue("kg/m")
    KG_M("kg/m"),
    @XmlEnumValue("klbm/in")
    KLBM_IN("klbm/in"),
    @XmlEnumValue("lbm/ft")
    LBM_FT("lbm/ft"),
    @XmlEnumValue("Mg/in")
    MG_IN("Mg/in"),
    @XmlEnumValue("kg.m/cm2")
    KG_M_CM_2("kg.m/cm2");
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
