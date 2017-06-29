package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerrickType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="DerrickType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="double"/>
 *     <enumeration value="quadruple"/>
 *     <enumeration value="slant"/>
 *     <enumeration value="triple"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "DerrickType")
@XmlEnum
public enum DerrickType {


    /**
     *  2 stand capacity derrick
     * 
     */
    @XmlEnumValue("double")
    DOUBLE("double"),

    /**
     *  4 stand capacity derrick
     * 
     */
    @XmlEnumValue("quadruple")
    QUADRUPLE("quadruple"),

    /**
     * Slant derrick
     * 
     */
    @XmlEnumValue("slant")
    SLANT("slant"),

    /**
     *  3 stand capacity derrick
     * 
     */
    @XmlEnumValue("triple")
    TRIPLE("triple"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    DerrickType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DerrickType fromValue(String v) {
        for (DerrickType c: DerrickType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
