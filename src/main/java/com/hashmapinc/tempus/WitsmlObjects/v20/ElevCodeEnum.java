


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElevCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ElevCodeEnum">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="CF"/>
 *     <enumeration value="CV"/>
 *     <enumeration value="DF"/>
 *     <enumeration value="GL"/>
 *     <enumeration value="KB"/>
 *     <enumeration value="RB"/>
 *     <enumeration value="RT"/>
 *     <enumeration value="SF"/>
 *     <enumeration value="LAT"/>
 *     <enumeration value="SL"/>
 *     <enumeration value="MHHW"/>
 *     <enumeration value="MHW"/>
 *     <enumeration value="MLLW"/>
 *     <enumeration value="MLW"/>
 *     <enumeration value="MTL"/>
 *     <enumeration value="KO"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElevCodeEnum", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum ElevCodeEnum {


    /**
     * Casing flange: A flange affixed to the top of the casing string used to attach production equipment.
     * 
     */
    CF("CF"),

    /**
     * Crown valve.
     * 
     */
    CV("CV"),

    /**
     * Derrick floor.
     * 
     */
    DF("DF"),

    /**
     * Ground level.
     * 
     */
    GL("GL"),

    /**
     * Kelly bushing.
     * 
     */
    KB("KB"),

    /**
     * Rotary bushing.
     * 
     */
    RB("RB"),

    /**
     * Rotary table.
     * 
     */
    RT("RT"),

    /**
     * Sea floor.
     * 
     */
    SF("SF"),

    /**
     * Lowest astronomical tide (LAT). The lowest tide level over the duration of the National Tidal Datum Epoch (19 years).
     * 
     */
    LAT("LAT"),

    /**
     * Mean sea level: a tidal datum. The arithmetic mean of hourly heights observed over the National Tidal Datum Epoch (19 years).
     * 
     */
    SL("SL"),

    /**
     * Mean higher high water: a tidal datum. The average of the higher high water height of each tidal day observed over the National Tidal Datum Epoch (19 years).
     * 
     */
    MHHW("MHHW"),

    /**
     * Mean high water: a tidal datum. The average of all the high water heights observed over the National Tidal Datum Epoch (19 years).
     * 
     */
    MHW("MHW"),

    /**
     * Mean lower low water: a tidal datum. The average of the lower low water height of each tidal day observed over the National Tidal Datum Epoch (19 years ).
     * 
     */
    MLLW("MLLW"),

    /**
     * Mean low water: a tidal datum. The average of all the low water heights observed over the National Tidal Datum Epoch (19 years).
     * 
     */
    MLW("MLW"),

    /**
     * Mean tide level: a tidal datum. The arithmetic mean of mean high water and mean low water. Same as the half-tide level.
     * 
     */
    MTL("MTL"),

    /**
     * Kickoff point. 
     * 
     */
    KO("KO"),

    /**
     * The value is not known. Avoid using this value. All reasonable attempts should be made to determine the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ElevCodeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElevCodeEnum fromValue(String v) {
        for (ElevCodeEnum c: ElevCodeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
