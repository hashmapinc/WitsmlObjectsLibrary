


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearAccelerationUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LinearAccelerationUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="cm/s2"/>
 *     <enumeration value="ft/s2"/>
 *     <enumeration value="Gal"/>
 *     <enumeration value="gn"/>
 *     <enumeration value="in/s2"/>
 *     <enumeration value="m/s2"/>
 *     <enumeration value="mGal"/>
 *     <enumeration value="mgn"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LinearAccelerationUom")
@XmlEnum
public enum LinearAccelerationUom {


    /**
     * centimetre per square second
     * 
     */
    @XmlEnumValue("cm/s2")
    CM_S_2("cm/s2"),

    /**
     * foot per second squared
     * 
     */
    @XmlEnumValue("ft/s2")
    FT_S_2("ft/s2"),

    /**
     * galileo
     * 
     */
    @XmlEnumValue("Gal")
    GAL("Gal"),

    /**
     * gravity
     * 
     */
    @XmlEnumValue("gn")
    GN("gn"),

    /**
     * inch per second squared
     * 
     */
    @XmlEnumValue("in/s2")
    IN_S_2("in/s2"),

    /**
     * metre per second squared
     * 
     */
    @XmlEnumValue("m/s2")
    M_S_2("m/s2"),

    /**
     * milligalileo
     * 
     */
    @XmlEnumValue("mGal")
    M_GAL("mGal"),

    /**
     * thousandth of gravity
     * 
     */
    @XmlEnumValue("mgn")
    MGN("mgn");
    private final String value;

    LinearAccelerationUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinearAccelerationUom fromValue(String v) {
        for (LinearAccelerationUom c: LinearAccelerationUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
