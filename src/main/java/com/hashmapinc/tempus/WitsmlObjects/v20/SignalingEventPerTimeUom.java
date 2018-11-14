


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignalingEventPerTimeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="SignalingEventPerTimeUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="Bd"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignalingEventPerTimeUom")
@XmlEnum
public enum SignalingEventPerTimeUom {


    /**
     * baud
     * 
     */
    @XmlEnumValue("Bd")
    BD("Bd");
    private final String value;

    SignalingEventPerTimeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignalingEventPerTimeUom fromValue(String v) {
        for (SignalingEventPerTimeUom c: SignalingEventPerTimeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
