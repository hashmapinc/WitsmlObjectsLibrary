


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadianceUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="RadianceUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="W/(m2.sr)"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RadianceUom")
@XmlEnum
public enum RadianceUom {


    /**
     * watt per square metre steradian
     * 
     */
    @XmlEnumValue("W/(m2.sr)")
    W_M_2_SR("W/(m2.sr)");
    private final String value;

    RadianceUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RadianceUom fromValue(String v) {
        for (RadianceUom c: RadianceUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
