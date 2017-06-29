package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoxPinConfig.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="BoxPinConfig">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="bottom box, top box"/>
 *     <enumeration value="bottom box, top pin"/>
 *     <enumeration value="bottom pin top box"/>
 *     <enumeration value="bottom pin"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "BoxPinConfig")
@XmlEnum
public enum BoxPinConfig {


    /**
     * Bottom box, top box
     * 
     */
    @XmlEnumValue("bottom box, top box")
    BOTTOM_BOX_TOP_BOX("bottom box, top box"),

    /**
     * Bottom box, top pin
     * 
     */
    @XmlEnumValue("bottom box, top pin")
    BOTTOM_BOX_TOP_PIN("bottom box, top pin"),

    /**
     * Bottom pin top box
     * 
     */
    @XmlEnumValue("bottom pin top box")
    BOTTOM_PIN_TOP_BOX("bottom pin top box"),

    /**
     * Bottom pin
     * 
     */
    @XmlEnumValue("bottom pin")
    BOTTOM_PIN("bottom pin"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    BoxPinConfig(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoxPinConfig fromValue(String v) {
        for (BoxPinConfig c: BoxPinConfig.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
