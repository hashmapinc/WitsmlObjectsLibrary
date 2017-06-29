package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurfEquipType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="SurfEquipType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="IADC"/>
 *     <enumeration value="custom"/>
 *     <enumeration value="coiled tubing"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "SurfEquipType")
@XmlEnum
public enum SurfEquipType {

    IADC("IADC"),
    @XmlEnumValue("custom")
    CUSTOM("custom"),
    @XmlEnumValue("coiled tubing")
    COILED_TUBING("coiled tubing"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    SurfEquipType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurfEquipType fromValue(String v) {
        for (SurfEquipType c: SurfEquipType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
