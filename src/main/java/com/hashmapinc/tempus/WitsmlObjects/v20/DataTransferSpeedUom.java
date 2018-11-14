


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataTransferSpeedUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="DataTransferSpeedUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="bit/s"/>
 *     <enumeration value="byte/s"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTransferSpeedUom")
@XmlEnum
public enum DataTransferSpeedUom {


    /**
     * bit per second
     * 
     */
    @XmlEnumValue("bit/s")
    BIT_S("bit/s"),

    /**
     * byte per second
     * 
     */
    @XmlEnumValue("byte/s")
    BYTE_S("byte/s");
    private final String value;

    DataTransferSpeedUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTransferSpeedUom fromValue(String v) {
        for (DataTransferSpeedUom c: DataTransferSpeedUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
