


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameTagNumberingScheme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="NameTagNumberingScheme">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="ANSI/AIM-BC10"/>
 *     <enumeration value="ANSI/AIM-BC2"/>
 *     <enumeration value="ANSI/AIM-BC6"/>
 *     <enumeration value="EAN.UCC"/>
 *     <enumeration value="EPC64"/>
 *     <enumeration value="EPC96"/>
 *     <enumeration value="F2F"/>
 *     <enumeration value="MFM"/>
 *     <enumeration value="MSRCID"/>
 *     <enumeration value="serial number"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameTagNumberingScheme", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum NameTagNumberingScheme {

    @XmlEnumValue("ANSI/AIM-BC10")
    ANSI_AIM_BC_10("ANSI/AIM-BC10"),
    @XmlEnumValue("ANSI/AIM-BC2")
    ANSI_AIM_BC_2("ANSI/AIM-BC2"),
    @XmlEnumValue("ANSI/AIM-BC6")
    ANSI_AIM_BC_6("ANSI/AIM-BC6"),
    @XmlEnumValue("EAN.UCC")
    EAN_UCC("EAN.UCC"),
    @XmlEnumValue("EPC64")
    EPC_64("EPC64"),
    @XmlEnumValue("EPC96")
    EPC_96("EPC96"),
    @XmlEnumValue("F2F")
    F_2_F("F2F"),
    MFM("MFM"),
    MSRCID("MSRCID"),
    @XmlEnumValue("serial number")
    SERIAL_NUMBER("serial number");
    private final String value;

    NameTagNumberingScheme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameTagNumberingScheme fromValue(String v) {
        for (NameTagNumberingScheme c: NameTagNumberingScheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
