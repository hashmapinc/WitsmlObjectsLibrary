


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoseEquivalentUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="DoseEquivalentUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="mrem"/>
 *     <enumeration value="mSv"/>
 *     <enumeration value="rem"/>
 *     <enumeration value="Sv"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DoseEquivalentUom")
@XmlEnum
public enum DoseEquivalentUom {


    /**
     * thousandth of rem
     * 
     */
    @XmlEnumValue("mrem")
    MREM("mrem"),

    /**
     * millisievert
     * 
     */
    @XmlEnumValue("mSv")
    M_SV("mSv"),

    /**
     * rem
     * 
     */
    @XmlEnumValue("rem")
    REM("rem"),

    /**
     * sievert
     * 
     */
    @XmlEnumValue("Sv")
    SV("Sv");
    private final String value;

    DoseEquivalentUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoseEquivalentUom fromValue(String v) {
        for (DoseEquivalentUom c: DoseEquivalentUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
