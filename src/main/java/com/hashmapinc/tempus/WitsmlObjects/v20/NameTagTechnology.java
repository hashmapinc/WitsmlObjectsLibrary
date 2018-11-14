


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameTagTechnology.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="NameTagTechnology">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="intrinsic"/>
 *     <enumeration value="labeled"/>
 *     <enumeration value="painted"/>
 *     <enumeration value="stamped"/>
 *     <enumeration value="tagged"/>
 *     <enumeration value="temporary"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameTagTechnology", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum NameTagTechnology {

    @XmlEnumValue("intrinsic")
    INTRINSIC("intrinsic"),
    @XmlEnumValue("labeled")
    LABELED("labeled"),
    @XmlEnumValue("painted")
    PAINTED("painted"),
    @XmlEnumValue("stamped")
    STAMPED("stamped"),
    @XmlEnumValue("tagged")
    TAGGED("tagged"),
    @XmlEnumValue("temporary")
    TEMPORARY("temporary");
    private final String value;

    NameTagTechnology(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameTagTechnology fromValue(String v) {
        for (NameTagTechnology c: NameTagTechnology.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
