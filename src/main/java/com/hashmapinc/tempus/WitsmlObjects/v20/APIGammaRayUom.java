


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIGammaRayUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="APIGammaRayUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="gAPI"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "APIGammaRayUom")
@XmlEnum
public enum APIGammaRayUom {


    /**
     * API gamma ray unit
     * 
     */
    @XmlEnumValue("gAPI")
    G_API("gAPI");
    private final String value;

    APIGammaRayUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APIGammaRayUom fromValue(String v) {
        for (APIGammaRayUom c: APIGammaRayUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
