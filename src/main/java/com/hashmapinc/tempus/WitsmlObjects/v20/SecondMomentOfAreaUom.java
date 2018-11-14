


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecondMomentOfAreaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="SecondMomentOfAreaUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="cm4"/>
 *     <enumeration value="in4"/>
 *     <enumeration value="m4"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecondMomentOfAreaUom")
@XmlEnum
public enum SecondMomentOfAreaUom {


    /**
     * centimetre to the fourth power
     * 
     */
    @XmlEnumValue("cm4")
    CM_4("cm4"),

    /**
     * inch to the fourth power
     * 
     */
    @XmlEnumValue("in4")
    IN_4("in4"),

    /**
     * metre to the fourth power
     * 
     */
    @XmlEnumValue("m4")
    M_4("m4");
    private final String value;

    SecondMomentOfAreaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecondMomentOfAreaUom fromValue(String v) {
        for (SecondMomentOfAreaUom c: SecondMomentOfAreaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
