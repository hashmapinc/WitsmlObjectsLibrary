


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxisOrder2d.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AxisOrder2d">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="easting northing"/>
 *     <enumeration value="northing easting"/>
 *     <enumeration value="westing southing"/>
 *     <enumeration value="southing westing"/>
 *     <enumeration value="northing westing"/>
 *     <enumeration value="westing northing"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxisOrder2d")
@XmlEnum
public enum AxisOrder2D {


    /**
     * The first axis is easting and the second axis is northing.
     * 
     */
    @XmlEnumValue("easting northing")
    EASTING_NORTHING("easting northing"),

    /**
     * The first axis is northing and the second asis is easting.
     * 
     */
    @XmlEnumValue("northing easting")
    NORTHING_EASTING("northing easting"),

    /**
     * The first axis is westing and the second axis is southing.
     * 
     */
    @XmlEnumValue("westing southing")
    WESTING_SOUTHING("westing southing"),

    /**
     * The first axis is southing and the second axis is westing.
     * 
     */
    @XmlEnumValue("southing westing")
    SOUTHING_WESTING("southing westing"),

    /**
     * the first axis is northing and the second axis is westing.
     * 
     */
    @XmlEnumValue("northing westing")
    NORTHING_WESTING("northing westing"),

    /**
     * the first axis is westing and the second axis is northing.
     * 
     */
    @XmlEnumValue("westing northing")
    WESTING_NORTHING("westing northing");
    private final String value;

    AxisOrder2D(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxisOrder2D fromValue(String v) {
        for (AxisOrder2D c: AxisOrder2D.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
