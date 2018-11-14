


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatrixCementKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MatrixCementKind">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="ankerite"/>
 *     <enumeration value="calcite"/>
 *     <enumeration value="chlorite"/>
 *     <enumeration value="dolomite"/>
 *     <enumeration value="illite"/>
 *     <enumeration value="kaolinite"/>
 *     <enumeration value="quartz"/>
 *     <enumeration value="siderite"/>
 *     <enumeration value="smectite"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatrixCementKind")
@XmlEnum
public enum MatrixCementKind {

    @XmlEnumValue("ankerite")
    ANKERITE("ankerite"),
    @XmlEnumValue("calcite")
    CALCITE("calcite"),
    @XmlEnumValue("chlorite")
    CHLORITE("chlorite"),
    @XmlEnumValue("dolomite")
    DOLOMITE("dolomite"),
    @XmlEnumValue("illite")
    ILLITE("illite"),
    @XmlEnumValue("kaolinite")
    KAOLINITE("kaolinite"),
    @XmlEnumValue("quartz")
    QUARTZ("quartz"),
    @XmlEnumValue("siderite")
    SIDERITE("siderite"),
    @XmlEnumValue("smectite")
    SMECTITE("smectite");
    private final String value;

    MatrixCementKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatrixCementKind fromValue(String v) {
        for (MatrixCementKind c: MatrixCementKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
