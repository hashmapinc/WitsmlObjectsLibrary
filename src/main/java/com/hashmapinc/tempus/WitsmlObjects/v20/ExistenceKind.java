


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExistenceKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ExistenceKind">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="actual"/>
 *     <enumeration value="planned"/>
 *     <enumeration value="simulated"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExistenceKind")
@XmlEnum
public enum ExistenceKind {


    /**
     * The object actually exists (from Epicentre 2.1).
     * 
     */
    @XmlEnumValue("actual")
    ACTUAL("actual"),

    /**
     * The object exists only in the planning stage (from Epicentre 2.1).
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned"),

    /**
     * Created, artificially, as an artifact of processing, to replace or to stand for one or more similar objects. Often referred to as model (from Epicentre 2.1).
     * 
     */
    @XmlEnumValue("simulated")
    SIMULATED("simulated");
    private final String value;

    ExistenceKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExistenceKind fromValue(String v) {
        for (ExistenceKind c: ExistenceKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
