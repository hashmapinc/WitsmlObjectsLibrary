


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyPerMassPerTimeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="EnergyPerMassPerTimeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="mrem/h"/>
 *     <enumeration value="mSv/h"/>
 *     <enumeration value="rem/h"/>
 *     <enumeration value="Sv/h"/>
 *     <enumeration value="Sv/s"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyPerMassPerTimeUom")
@XmlEnum
public enum EnergyPerMassPerTimeUom {


    /**
     * thousandth of irem per hour
     * 
     */
    @XmlEnumValue("mrem/h")
    MREM_H("mrem/h"),

    /**
     * millisievert per hour
     * 
     */
    @XmlEnumValue("mSv/h")
    M_SV_H("mSv/h"),

    /**
     * rem per hour
     * 
     */
    @XmlEnumValue("rem/h")
    REM_H("rem/h"),

    /**
     * sievert per hour
     * 
     */
    @XmlEnumValue("Sv/h")
    SV_H("Sv/h"),

    /**
     * sievert per second
     * 
     */
    @XmlEnumValue("Sv/s")
    SV_S("Sv/s");
    private final String value;

    EnergyPerMassPerTimeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyPerMassPerTimeUom fromValue(String v) {
        for (EnergyPerMassPerTimeUom c: EnergyPerMassPerTimeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
