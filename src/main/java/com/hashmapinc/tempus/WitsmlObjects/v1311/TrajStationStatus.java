package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrajStationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="TrajStationStatus">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="locked"/>
 *     <enumeration value="open"/>
 *     <enumeration value="rejected"/>
 *     <enumeration value="valid"/>
 *     <enumeration value="position"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "TrajStationStatus")
@XmlEnum
public enum TrajStationStatus {

    @XmlEnumValue("locked")
    LOCKED("locked"),
    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("rejected")
    REJECTED("rejected"),
    @XmlEnumValue("valid")
    VALID("valid"),
    @XmlEnumValue("position")
    POSITION("position"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TrajStationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrajStationStatus fromValue(String v) {
        for (TrajStationStatus c: TrajStationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
