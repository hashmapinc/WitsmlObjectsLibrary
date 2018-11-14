


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferencePressureKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ReferencePressureKind">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="absolute"/>
 *     <enumeration value="ambient"/>
 *     <enumeration value="legal"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferencePressureKind")
@XmlEnum
public enum ReferencePressureKind {


    /**
     * absolute
     * 
     */
    @XmlEnumValue("absolute")
    ABSOLUTE("absolute"),

    /**
     * ambient
     * 
     */
    @XmlEnumValue("ambient")
    AMBIENT("ambient"),
    @XmlEnumValue("legal")
    LEGAL("legal");
    private final String value;

    ReferencePressureKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReferencePressureKind fromValue(String v) {
        for (ReferencePressureKind c: ReferencePressureKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
