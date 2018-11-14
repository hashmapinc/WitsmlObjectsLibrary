


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeochronologicalRank.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="GeochronologicalRank">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="eon"/>
 *     <enumeration value="era"/>
 *     <enumeration value="period"/>
 *     <enumeration value="epoch"/>
 *     <enumeration value="age"/>
 *     <enumeration value="chron"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeochronologicalRank")
@XmlEnum
public enum GeochronologicalRank {

    @XmlEnumValue("eon")
    EON("eon"),
    @XmlEnumValue("era")
    ERA("era"),
    @XmlEnumValue("period")
    PERIOD("period"),
    @XmlEnumValue("epoch")
    EPOCH("epoch"),
    @XmlEnumValue("age")
    AGE("age"),
    @XmlEnumValue("chron")
    CHRON("chron");
    private final String value;

    GeochronologicalRank(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeochronologicalRank fromValue(String v) {
        for (GeochronologicalRank c: GeochronologicalRank.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
