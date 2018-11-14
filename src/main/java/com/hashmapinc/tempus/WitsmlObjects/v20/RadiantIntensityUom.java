


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadiantIntensityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="RadiantIntensityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="W/sr"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RadiantIntensityUom")
@XmlEnum
public enum RadiantIntensityUom {


    /**
     * watt per steradian
     * 
     */
    @XmlEnumValue("W/sr")
    W_SR("W/sr");
    private final String value;

    RadiantIntensityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RadiantIntensityUom fromValue(String v) {
        for (RadiantIntensityUom c: RadiantIntensityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
