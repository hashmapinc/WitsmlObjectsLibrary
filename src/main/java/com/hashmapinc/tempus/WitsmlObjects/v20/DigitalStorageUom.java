


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DigitalStorageUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="DigitalStorageUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="bit"/>
 *     <enumeration value="byte"/>
 *     <enumeration value="Kibyte"/>
 *     <enumeration value="Mibyte"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DigitalStorageUom")
@XmlEnum
public enum DigitalStorageUom {


    /**
     * bit
     * 
     */
    @XmlEnumValue("bit")
    BIT("bit"),

    /**
     * byte
     * 
     */
    @XmlEnumValue("byte")
    BYTE("byte"),

    /**
     * kibibyte
     * 
     */
    @XmlEnumValue("Kibyte")
    KIBYTE("Kibyte"),

    /**
     * mebibyte
     * 
     */
    @XmlEnumValue("Mibyte")
    MIBYTE("Mibyte");
    private final String value;

    DigitalStorageUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DigitalStorageUom fromValue(String v) {
        for (DigitalStorageUom c: DigitalStorageUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
