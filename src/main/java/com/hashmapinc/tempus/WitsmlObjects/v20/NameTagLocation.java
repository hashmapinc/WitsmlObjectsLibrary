


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameTagLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="NameTagLocation">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="body"/>
 *     <enumeration value="box"/>
 *     <enumeration value="other"/>
 *     <enumeration value="pin"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NameTagLocation", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum NameTagLocation {

    @XmlEnumValue("body")
    BODY("body"),
    @XmlEnumValue("box")
    BOX("box"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("pin")
    PIN("pin");
    private final String value;

    NameTagLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameTagLocation fromValue(String v) {
        for (NameTagLocation c: NameTagLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
