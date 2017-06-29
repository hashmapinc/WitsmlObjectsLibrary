package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="MessageSeverity">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="catastrophic"/>
 *     <enumeration value="major"/>
 *     <enumeration value="minor"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "MessageSeverity")
@XmlEnum
public enum MessageSeverity {

    @XmlEnumValue("catastrophic")
    CATASTROPHIC("catastrophic"),
    @XmlEnumValue("major")
    MAJOR("major"),
    @XmlEnumValue("minor")
    MINOR("minor"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MessageSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageSeverity fromValue(String v) {
        for (MessageSeverity c: MessageSeverity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
