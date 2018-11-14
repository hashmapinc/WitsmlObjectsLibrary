


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermeabilityLengthUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PermeabilityLengthUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="D.ft"/>
 *     <enumeration value="D.m"/>
 *     <enumeration value="mD.ft"/>
 *     <enumeration value="mD.m"/>
 *     <enumeration value="TD[API].m"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PermeabilityLengthUom")
@XmlEnum
public enum PermeabilityLengthUom {


    /**
     * darcy foot
     * 
     */
    @XmlEnumValue("D.ft")
    D_FT("D.ft"),

    /**
     * darcy metre
     * 
     */
    @XmlEnumValue("D.m")
    D_M("D.m"),

    /**
     * millidarcy foot
     * 
     */
    @XmlEnumValue("mD.ft")
    M_D_FT("mD.ft"),

    /**
     * millidarcy metre
     * 
     */
    @XmlEnumValue("mD.m")
    M_D_M("mD.m"),

    /**
     * teradarcy-API metre
     * 
     */
    @XmlEnumValue("TD[API].m")
    TD_API_M("TD[API].m");
    private final String value;

    PermeabilityLengthUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermeabilityLengthUom fromValue(String v) {
        for (PermeabilityLengthUom c: PermeabilityLengthUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
