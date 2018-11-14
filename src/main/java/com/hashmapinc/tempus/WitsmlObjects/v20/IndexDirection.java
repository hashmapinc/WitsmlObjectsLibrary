


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndexDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="IndexDirection">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="decreasing"/>
 *     <enumeration value="increasing"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndexDirection", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum IndexDirection {


    /**
     * The sort order of the data row index values.  For a "decreasing" direction, the index value of consecutive data nodes are descending.
     * 
     */
    @XmlEnumValue("decreasing")
    DECREASING("decreasing"),

    /**
     * The sort order of the data row index values.  For an "increasing" direction, the index value of consecutive data nodes are ascending.
     * 
     */
    @XmlEnumValue("increasing")
    INCREASING("increasing");
    private final String value;

    IndexDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndexDirection fromValue(String v) {
        for (IndexDirection c: IndexDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
