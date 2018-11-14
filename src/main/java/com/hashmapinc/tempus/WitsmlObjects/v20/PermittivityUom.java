


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermittivityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PermittivityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="F/m"/>
 *     <enumeration value="uF/m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PermittivityUom")
@XmlEnum
public enum PermittivityUom {


    /**
     * farad per metre
     * 
     */
    @XmlEnumValue("F/m")
    F_M("F/m"),

    /**
     * microfarad per metre
     * 
     */
    @XmlEnumValue("uF/m")
    U_F_M("uF/m");
    private final String value;

    PermittivityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermittivityUom fromValue(String v) {
        for (PermittivityUom c: PermittivityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
