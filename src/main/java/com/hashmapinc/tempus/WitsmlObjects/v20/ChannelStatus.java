


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChannelStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ChannelStatus">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="active"/>
 *     <enumeration value="closed"/>
 *     <enumeration value="inactive"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChannelStatus", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum ChannelStatus {


    /**
     * Actively producing data points.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * Closed and will never produce new data points.
     * 
     */
    @XmlEnumValue("closed")
    CLOSED("closed"),

    /**
     * Currently inactive but may produce data points in the future.
     * 
     */
    @XmlEnumValue("inactive")
    INACTIVE("inactive");
    private final String value;

    ChannelStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelStatus fromValue(String v) {
        for (ChannelStatus c: ChannelStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
