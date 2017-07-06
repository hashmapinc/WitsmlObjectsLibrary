package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntervalMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="IntervalMethod">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="average"/>
 *     <enumeration value="maximum"/>
 *     <enumeration value="minimum"/>
 *     <enumeration value="other"/>
 *     <enumeration value="spot sample"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "IntervalMethod")
@XmlEnum
public enum IntervalMethod {

    @XmlEnumValue("average")
    AVERAGE("average"),
    @XmlEnumValue("maximum")
    MAXIMUM("maximum"),
    @XmlEnumValue("minimum")
    MINIMUM("minimum"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("spot sample")
    SPOT_SAMPLE("spot sample"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    IntervalMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntervalMethod fromValue(String v) {
        for (IntervalMethod c: IntervalMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
