package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BladeShapeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="BladeShapeType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="dynamic"/>
 *     <enumeration value="melon"/>
 *     <enumeration value="spiral"/>
 *     <enumeration value="straight"/>
 *     <enumeration value="variable"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "BladeShapeType")
@XmlEnum
public enum BladeShapeType {

    @XmlEnumValue("dynamic")
    DYNAMIC("dynamic"),
    @XmlEnumValue("melon")
    MELON("melon"),
    @XmlEnumValue("spiral")
    SPIRAL("spiral"),
    @XmlEnumValue("straight")
    STRAIGHT("straight"),
    @XmlEnumValue("variable")
    VARIABLE("variable"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    BladeShapeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BladeShapeType fromValue(String v) {
        for (BladeShapeType c: BladeShapeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
