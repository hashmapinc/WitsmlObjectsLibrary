


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequencyIntervalUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="FrequencyIntervalUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="O"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FrequencyIntervalUom")
@XmlEnum
public enum FrequencyIntervalUom {


    /**
     * octave
     * 
     */
    O;

    public String value() {
        return name();
    }

    public static FrequencyIntervalUom fromValue(String v) {
        return valueOf(v);
    }

}
