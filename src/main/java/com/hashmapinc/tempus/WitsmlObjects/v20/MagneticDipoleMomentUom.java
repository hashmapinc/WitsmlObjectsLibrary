


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MagneticDipoleMomentUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MagneticDipoleMomentUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Wb.m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MagneticDipoleMomentUom")
@XmlEnum
public enum MagneticDipoleMomentUom {


    /**
     * weber metre
     * 
     */
    @XmlEnumValue("Wb.m")
    WB_M("Wb.m");
    private final String value;

    MagneticDipoleMomentUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MagneticDipoleMomentUom fromValue(String v) {
        for (MagneticDipoleMomentUom c: MagneticDipoleMomentUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
