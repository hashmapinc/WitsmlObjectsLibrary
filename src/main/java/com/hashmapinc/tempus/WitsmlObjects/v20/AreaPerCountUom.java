


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaPerCountUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AreaPerCountUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="b/electron"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AreaPerCountUom")
@XmlEnum
public enum AreaPerCountUom {

    @XmlEnumValue("b/electron")
    B_ELECTRON("b/electron");
    private final String value;

    AreaPerCountUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaPerCountUom fromValue(String v) {
        for (AreaPerCountUom c: AreaPerCountUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
