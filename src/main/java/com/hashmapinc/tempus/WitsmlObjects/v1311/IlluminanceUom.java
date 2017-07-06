package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for illuminanceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="illuminanceUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="lx"/>
 *     <enumeration value="lm/m2"/>
 *     <enumeration value="footcandle"/>
 *     <enumeration value="klx"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "illuminanceUom")
@XmlEnum
public enum IlluminanceUom {

    @XmlEnumValue("lx")
    LX("lx"),
    @XmlEnumValue("lm/m2")
    LM_M_2("lm/m2"),
    @XmlEnumValue("footcandle")
    FOOTCANDLE("footcandle"),
    @XmlEnumValue("klx")
    KLX("klx");
    private final String value;

    IlluminanceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IlluminanceUom fromValue(String v) {
        for (IlluminanceUom c: IlluminanceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
