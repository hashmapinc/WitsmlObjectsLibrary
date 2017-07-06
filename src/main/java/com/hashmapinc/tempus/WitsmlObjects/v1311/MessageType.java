package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="MessageType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="alarm"/>
 *     <enumeration value="event"/>
 *     <enumeration value="informational"/>
 *     <enumeration value="warning"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "MessageType")
@XmlEnum
public enum MessageType {


    /**
     * An alarm condition when something has exceeded specified limits
     * 
     */
    @XmlEnumValue("alarm")
    ALARM("alarm"),

    /**
     * Information about a specific event
     * 
     */
    @XmlEnumValue("event")
    EVENT("event"),

    /**
     * General information message
     * 
     */
    @XmlEnumValue("informational")
    INFORMATIONAL("informational"),

    /**
     * A cautionary message
     * 
     */
    @XmlEnumValue("warning")
    WARNING("warning"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageType fromValue(String v) {
        for (MessageType c: MessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
