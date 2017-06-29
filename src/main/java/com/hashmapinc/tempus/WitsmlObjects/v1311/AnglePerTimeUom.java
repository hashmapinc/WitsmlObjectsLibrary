package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anglePerTimeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="anglePerTimeUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="rad/s"/>
 *     <enumeration value="c/s"/>
 *     <enumeration value="dega/h"/>
 *     <enumeration value="dega/min"/>
 *     <enumeration value="dega/s"/>
 *     <enumeration value="rev/s"/>
 *     <enumeration value="rpm"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "anglePerTimeUom")
@XmlEnum
public enum AnglePerTimeUom {

    @XmlEnumValue("rad/s")
    RAD_S("rad/s"),
    @XmlEnumValue("c/s")
    C_S("c/s"),
    @XmlEnumValue("dega/h")
    DEGA_H("dega/h"),
    @XmlEnumValue("dega/min")
    DEGA_MIN("dega/min"),
    @XmlEnumValue("dega/s")
    DEGA_S("dega/s"),
    @XmlEnumValue("rev/s")
    REV_S("rev/s"),
    @XmlEnumValue("rpm")
    RPM("rpm");
    private final String value;

    AnglePerTimeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnglePerTimeUom fromValue(String v) {
        for (AnglePerTimeUom c: AnglePerTimeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
