


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectricalResistivityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElectricalResistivityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="kohm.m"/>
 *     <enumeration value="nohm.mil2/ft"/>
 *     <enumeration value="nohm.mm2/m"/>
 *     <enumeration value="ohm.cm"/>
 *     <enumeration value="ohm.m"/>
 *     <enumeration value="ohm.m2/m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElectricalResistivityUom")
@XmlEnum
public enum ElectricalResistivityUom {


    /**
     * kiloohm metre
     * 
     */
    @XmlEnumValue("kohm.m")
    KOHM_M("kohm.m"),

    /**
     * nanoohm square mil per foot
     * 
     */
    @XmlEnumValue("nohm.mil2/ft")
    NOHM_MIL_2_FT("nohm.mil2/ft"),

    /**
     * nanoohm square milimetre per metre
     * 
     */
    @XmlEnumValue("nohm.mm2/m")
    NOHM_MM_2_M("nohm.mm2/m"),

    /**
     * ohm centimetre
     * 
     */
    @XmlEnumValue("ohm.cm")
    OHM_CM("ohm.cm"),

    /**
     * ohm metre
     * 
     */
    @XmlEnumValue("ohm.m")
    OHM_M("ohm.m"),

    /**
     * ohm square metre per metre
     * 
     */
    @XmlEnumValue("ohm.m2/m")
    OHM_M_2_M("ohm.m2/m");
    private final String value;

    ElectricalResistivityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricalResistivityUom fromValue(String v) {
        for (ElectricalResistivityUom c: ElectricalResistivityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
