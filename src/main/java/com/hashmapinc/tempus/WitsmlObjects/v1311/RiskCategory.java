package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="RiskCategory">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="hydraulics"/>
 *     <enumeration value="mechanical"/>
 *     <enumeration value="time related"/>
 *     <enumeration value="wellbore stability"/>
 *     <enumeration value="directional drilling"/>
 *     <enumeration value="bit"/>
 *     <enumeration value="equipment failure"/>
 *     <enumeration value="completion"/>
 *     <enumeration value="casing"/>
 *     <enumeration value="other"/>
 *     <enumeration value="HSE"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "RiskCategory")
@XmlEnum
public enum RiskCategory {

    @XmlEnumValue("hydraulics")
    HYDRAULICS("hydraulics"),
    @XmlEnumValue("mechanical")
    MECHANICAL("mechanical"),
    @XmlEnumValue("time related")
    TIME_RELATED("time related"),
    @XmlEnumValue("wellbore stability")
    WELLBORE_STABILITY("wellbore stability"),
    @XmlEnumValue("directional drilling")
    DIRECTIONAL_DRILLING("directional drilling"),
    @XmlEnumValue("bit")
    BIT("bit"),
    @XmlEnumValue("equipment failure")
    EQUIPMENT_FAILURE("equipment failure"),
    @XmlEnumValue("completion")
    COMPLETION("completion"),
    @XmlEnumValue("casing")
    CASING("casing"),
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * health, safety and environmental
     * 
     */
    HSE("HSE"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    RiskCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RiskCategory fromValue(String v) {
        for (RiskCategory c: RiskCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
