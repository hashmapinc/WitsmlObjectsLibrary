package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="WellDirection">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="huff-n-puff"/>
 *     <enumeration value="injector"/>
 *     <enumeration value="producer"/>
 *     <enumeration value="uncertain"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "WellDirection")
@XmlEnum
public enum WellDirection {


    /**
     * The well facility alternately injects (usually 
     * 					a steam or hot fluid) and produces.
     * 
     */
    @XmlEnumValue("huff-n-puff")
    HUFF_N_PUFF("huff-n-puff"),

    /**
     * The well facility is injecting fluids into the 
     * 					subsurface.
     * 
     */
    @XmlEnumValue("injector")
    INJECTOR("injector"),

    /**
     * The well facility is producing fluids from the 
     * 					subsurface.
     * 
     */
    @XmlEnumValue("producer")
    PRODUCER("producer"),

    /**
     * The flow direction of the fluids is variable, 
     * 					but not on a regular basis as is the case with the huff-n-puff 
     * 					flow.
     * 
     */
    @XmlEnumValue("uncertain")
    UNCERTAIN("uncertain"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    WellDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WellDirection fromValue(String v) {
        for (WellDirection c: WellDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
