


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrajStationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="TrajStationStatus">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="open"/>
 *     <enumeration value="rejected"/>
 *     <enumeration value="position"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrajStationStatus", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum TrajStationStatus {


    /**
     * Has not been validated; does not influence position computation for stations below it.
     * 
     */
    @XmlEnumValue("open")
    OPEN("open"),

    /**
     * The quality is not ok; does not influence position computation for stations below it.
     * 
     */
    @XmlEnumValue("rejected")
    REJECTED("rejected"),

    /**
     * Validated and in-use.
     * 
     */
    @XmlEnumValue("position")
    POSITION("position");
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
