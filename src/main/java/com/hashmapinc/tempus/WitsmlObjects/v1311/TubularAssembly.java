package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TubularAssembly.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="TubularAssembly">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="drilling"/>
 *     <enumeration value="directional drilling"/>
 *     <enumeration value="fishing"/>
 *     <enumeration value="condition mud"/>
 *     <enumeration value="tubing conveyed logging"/>
 *     <enumeration value="cementing"/>
 *     <enumeration value="casing"/>
 *     <enumeration value="clean out"/>
 *     <enumeration value="completion or testing"/>
 *     <enumeration value="coring"/>
 *     <enumeration value="hole opening or underreaming"/>
 *     <enumeration value="milling or dressing or cutting"/>
 *     <enumeration value="wiper or check or reaming"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "TubularAssembly")
@XmlEnum
public enum TubularAssembly {

    @XmlEnumValue("drilling")
    DRILLING("drilling"),
    @XmlEnumValue("directional drilling")
    DIRECTIONAL_DRILLING("directional drilling"),
    @XmlEnumValue("fishing")
    FISHING("fishing"),
    @XmlEnumValue("condition mud")
    CONDITION_MUD("condition mud"),
    @XmlEnumValue("tubing conveyed logging")
    TUBING_CONVEYED_LOGGING("tubing conveyed logging"),
    @XmlEnumValue("cementing")
    CEMENTING("cementing"),
    @XmlEnumValue("casing")
    CASING("casing"),
    @XmlEnumValue("clean out")
    CLEAN_OUT("clean out"),
    @XmlEnumValue("completion or testing")
    COMPLETION_OR_TESTING("completion or testing"),
    @XmlEnumValue("coring")
    CORING("coring"),
    @XmlEnumValue("hole opening or underreaming")
    HOLE_OPENING_OR_UNDERREAMING("hole opening or underreaming"),
    @XmlEnumValue("milling or dressing or cutting")
    MILLING_OR_DRESSING_OR_CUTTING("milling or dressing or cutting"),
    @XmlEnumValue("wiper or check or reaming")
    WIPER_OR_CHECK_OR_REAMING("wiper or check or reaming"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TubularAssembly(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TubularAssembly fromValue(String v) {
        for (TubularAssembly c: TubularAssembly.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
