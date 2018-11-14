


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIGravityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="APIGravityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="dAPI"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APIGravityUom")
@XmlEnum
public enum APIGravityUom {


    /**
     * API gravity unit
     * 
     */
    @XmlEnumValue("dAPI")
    D_API("dAPI");
    private final String value;

    APIGravityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APIGravityUom fromValue(String v) {
        for (APIGravityUom c: APIGravityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
