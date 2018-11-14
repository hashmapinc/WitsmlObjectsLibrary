


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APINeutronUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="APINeutronUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="nAPI"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APINeutronUom")
@XmlEnum
public enum APINeutronUom {


    /**
     * API neutron unit
     * 
     */
    @XmlEnumValue("nAPI")
    N_API("nAPI");
    private final String value;

    APINeutronUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APINeutronUom fromValue(String v) {
        for (APINeutronUom c: APINeutronUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
