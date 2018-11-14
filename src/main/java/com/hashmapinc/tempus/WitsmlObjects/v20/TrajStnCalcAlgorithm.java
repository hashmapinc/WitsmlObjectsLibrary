


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrajStnCalcAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="TrajStnCalcAlgorithm">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="average angle"/>
 *     <enumeration value="balanced tangential"/>
 *     <enumeration value="constant tool face"/>
 *     <enumeration value="custom"/>
 *     <enumeration value="inertial"/>
 *     <enumeration value="minimum curvature"/>
 *     <enumeration value="radius of curvature"/>
 *     <enumeration value="tangential"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrajStnCalcAlgorithm", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum TrajStnCalcAlgorithm {

    @XmlEnumValue("average angle")
    AVERAGE_ANGLE("average angle"),
    @XmlEnumValue("balanced tangential")
    BALANCED_TANGENTIAL("balanced tangential"),
    @XmlEnumValue("constant tool face")
    CONSTANT_TOOL_FACE("constant tool face"),
    @XmlEnumValue("custom")
    CUSTOM("custom"),
    @XmlEnumValue("inertial")
    INERTIAL("inertial"),
    @XmlEnumValue("minimum curvature")
    MINIMUM_CURVATURE("minimum curvature"),
    @XmlEnumValue("radius of curvature")
    RADIUS_OF_CURVATURE("radius of curvature"),
    @XmlEnumValue("tangential")
    TANGENTIAL("tangential");
    private final String value;

    TrajStnCalcAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrajStnCalcAlgorithm fromValue(String v) {
        for (TrajStnCalcAlgorithm c: TrajStnCalcAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
