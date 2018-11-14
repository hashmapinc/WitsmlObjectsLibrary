


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeSurveyTool.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="TypeSurveyTool">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="gyroscopic inertial"/>
 *     <enumeration value="gyroscopic MWD"/>
 *     <enumeration value="gyroscopic north seeking"/>
 *     <enumeration value="magnetic multiple-shot"/>
 *     <enumeration value="magnetic MWD"/>
 *     <enumeration value="magnetic single-shot"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeSurveyTool", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum TypeSurveyTool {

    @XmlEnumValue("gyroscopic inertial")
    GYROSCOPIC_INERTIAL("gyroscopic inertial"),
    @XmlEnumValue("gyroscopic MWD")
    GYROSCOPIC_MWD("gyroscopic MWD"),
    @XmlEnumValue("gyroscopic north seeking")
    GYROSCOPIC_NORTH_SEEKING("gyroscopic north seeking"),
    @XmlEnumValue("magnetic multiple-shot")
    MAGNETIC_MULTIPLE_SHOT("magnetic multiple-shot"),
    @XmlEnumValue("magnetic MWD")
    MAGNETIC_MWD("magnetic MWD"),
    @XmlEnumValue("magnetic single-shot")
    MAGNETIC_SINGLE_SHOT("magnetic single-shot");
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
