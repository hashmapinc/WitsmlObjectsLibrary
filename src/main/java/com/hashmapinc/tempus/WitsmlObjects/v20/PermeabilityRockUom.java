


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PermeabilityRockUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="PermeabilityRockUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="D"/>
 *     <enumeration value="D[API]"/>
 *     <enumeration value="mD"/>
 *     <enumeration value="TD[API]"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PermeabilityRockUom")
@XmlEnum
public enum PermeabilityRockUom {


    /**
     * darcy
     * 
     */
    D("D"),

    /**
     * darcy-API
     * 
     */
    @XmlEnumValue("D[API]")
    D_API("D[API]"),

    /**
     * millidarcy
     * 
     */
    @XmlEnumValue("mD")
    M_D("mD"),

    /**
     * teradarcy-API
     * 
     */
    @XmlEnumValue("TD[API]")
    TD_API("TD[API]");
    private final String value;

    PermeabilityRockUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermeabilityRockUom fromValue(String v) {
        for (PermeabilityRockUom c: PermeabilityRockUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
