package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for magneticInductionUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="magneticInductionUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="T"/>
 *     <enumeration value="gauss"/>
 *     <enumeration value="mT"/>
 *     <enumeration value="mgauss"/>
 *     <enumeration value="nT"/>
 *     <enumeration value="uT"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "magneticInductionUom")
@XmlEnum
public enum MagneticInductionUom {

    T("T"),
    @XmlEnumValue("gauss")
    GAUSS("gauss"),
    @XmlEnumValue("mT")
    M_T("mT"),
    @XmlEnumValue("mgauss")
    MGAUSS("mgauss"),
    @XmlEnumValue("nT")
    N_T("nT"),
    @XmlEnumValue("uT")
    U_T("uT");
    private final String value;

    MagneticInductionUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MagneticInductionUom fromValue(String v) {
        for (MagneticInductionUom c: MagneticInductionUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
