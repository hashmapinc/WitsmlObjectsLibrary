package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="ItemState">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="actual"/>
 *     <enumeration value="model"/>
 *     <enumeration value="plan"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "ItemState")
@XmlEnum
public enum ItemState {


    /**
     * Actual data measured or entered at the well site.
     * 
     */
    @XmlEnumValue("actual")
    ACTUAL("actual"),

    /**
     * Model data used for "what if" calculations.
     * 
     */
    @XmlEnumValue("model")
    MODEL("model"),

    /**
     * A planned object. That is, one which is expected to be executed in the future.
     * 
     */
    @XmlEnumValue("plan")
    PLAN("plan"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ItemState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemState fromValue(String v) {
        for (ItemState c: ItemState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
