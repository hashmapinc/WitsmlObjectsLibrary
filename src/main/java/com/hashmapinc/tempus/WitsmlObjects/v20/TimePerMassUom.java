


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimePerMassUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="TimePerMassUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="s/kg"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimePerMassUom")
@XmlEnum
public enum TimePerMassUom {


    /**
     * second per kilogram
     * 
     */
    @XmlEnumValue("s/kg")
    S_KG("s/kg");
    private final String value;

    TimePerMassUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimePerMassUom fromValue(String v) {
        for (TimePerMassUom c: TimePerMassUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
