package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="PitType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="bulk"/>
 *     <enumeration value="chemical"/>
 *     <enumeration value="drilling"/>
 *     <enumeration value="mix"/>
 *     <enumeration value="mud cleaning"/>
 *     <enumeration value="sand trap"/>
 *     <enumeration value="slug"/>
 *     <enumeration value="storage"/>
 *     <enumeration value="surge tank"/>
 *     <enumeration value="trip tank"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "PitType")
@XmlEnum
public enum PitType {

    @XmlEnumValue("bulk")
    BULK("bulk"),
    @XmlEnumValue("chemical")
    CHEMICAL("chemical"),
    @XmlEnumValue("drilling")
    DRILLING("drilling"),
    @XmlEnumValue("mix")
    MIX("mix"),
    @XmlEnumValue("mud cleaning")
    MUD_CLEANING("mud cleaning"),
    @XmlEnumValue("sand trap")
    SAND_TRAP("sand trap"),

    /**
     * That pit in the active pit system located 
     * 					immediately downstream of the shale shakers, whose primary 
     * 					purpose is to allow the settling and disposal of the larger 
     * 					drilled cuttings not removed by the shale shakers. It is 
     * 					occasionally also called a settling tank.
     * 
     */
    @XmlEnumValue("slug")
    SLUG("slug"),
    @XmlEnumValue("storage")
    STORAGE("storage"),
    @XmlEnumValue("surge tank")
    SURGE_TANK("surge tank"),
    @XmlEnumValue("trip tank")
    TRIP_TANK("trip tank"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    PitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PitType fromValue(String v) {
        for (PitType c: PitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
