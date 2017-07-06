package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeSurveyTool.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="TypeSurveyTool">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="magnetic MWD"/>
 *     <enumeration value="gyroscopic  MWD"/>
 *     <enumeration value="gyroscopic north seeking"/>
 *     <enumeration value="gyroscopic inertial"/>
 *     <enumeration value="magnetic single-shot"/>
 *     <enumeration value="magnetic multiple-shot"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "TypeSurveyTool")
@XmlEnum
public enum TypeSurveyTool {

    @XmlEnumValue("magnetic MWD")
    MAGNETIC_MWD("magnetic MWD"),
    @XmlEnumValue("gyroscopic  MWD")
    GYROSCOPIC_MWD("gyroscopic  MWD"),
    @XmlEnumValue("gyroscopic north seeking")
    GYROSCOPIC_NORTH_SEEKING("gyroscopic north seeking"),
    @XmlEnumValue("gyroscopic inertial")
    GYROSCOPIC_INERTIAL("gyroscopic inertial"),
    @XmlEnumValue("magnetic single-shot")
    MAGNETIC_SINGLE_SHOT("magnetic single-shot"),
    @XmlEnumValue("magnetic multiple-shot")
    MAGNETIC_MULTIPLE_SHOT("magnetic multiple-shot"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TypeSurveyTool(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeSurveyTool fromValue(String v) {
        for (TypeSurveyTool c: TypeSurveyTool.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
