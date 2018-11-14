


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DipoleMomentUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="DipoleMomentUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="C.m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DipoleMomentUom")
@XmlEnum
public enum DipoleMomentUom {


    /**
     * coulomb metre
     * 
     */
    @XmlEnumValue("C.m")
    C_M("C.m");
    private final String value;

    DipoleMomentUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DipoleMomentUom fromValue(String v) {
        for (DipoleMomentUom c: DipoleMomentUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
