package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PumpOpType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="PumpOpType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="drilling"/>
 *     <enumeration value="reaming"/>
 *     <enumeration value="circulating"/>
 *     <enumeration value="slow pump"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "PumpOpType")
@XmlEnum
public enum PumpOpType {

    @XmlEnumValue("drilling")
    DRILLING("drilling"),
    @XmlEnumValue("reaming")
    REAMING("reaming"),
    @XmlEnumValue("circulating")
    CIRCULATING("circulating"),
    @XmlEnumValue("slow pump")
    SLOW_PUMP("slow pump"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    PumpOpType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PumpOpType fromValue(String v) {
        for (PumpOpType c: PumpOpType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
