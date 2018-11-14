


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AggregationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="set"/>
 *     <enumeration value="bag"/>
 *     <enumeration value="sequence"/>
 *     <enumeration value="array"/>
 *     <enumeration value="record"/>
 *     <enumeration value="table"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AggregationType", namespace = "http://www.opengis.net/gml/3.2")
@XmlEnum
public enum AggregationType {

    @XmlEnumValue("set")
    SET("set"),
    @XmlEnumValue("bag")
    BAG("bag"),
    @XmlEnumValue("sequence")
    SEQUENCE("sequence"),
    @XmlEnumValue("array")
    ARRAY("array"),
    @XmlEnumValue("record")
    RECORD("record"),
    @XmlEnumValue("table")
    TABLE("table");
    private final String value;

    AggregationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AggregationType fromValue(String v) {
        for (AggregationType c: AggregationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
