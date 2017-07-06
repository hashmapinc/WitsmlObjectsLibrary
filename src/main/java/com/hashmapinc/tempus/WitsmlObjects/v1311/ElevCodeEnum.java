package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElevCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="ElevCodeEnum">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
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
 * } </pre>
 * 
 */
@XmlType(name = "ElevCodeEnum")
@XmlEnum
public enum ElevCodeEnum {


    /**
     * casing flange: A flange affixed to the top of the 
     * 					casing string used to attach production equipment.
     * 
     */
    CF("CF"),

    /**
     * crown valve
     * 
     */
    CV("CV"),

    /**
     * derrick floor
     * 
     */
    DF("DF"),

    /**
     * ground level
     * 
     */
    GL("GL"),

    /**
     * kelly bushing
     * 
     */
    KB("KB"),

    /**
     * rotary bushing
     * 
     */
    RB("RB"),

    /**
     * rotary table
     * 
     */
    RT("RT"),

    /**
     * sea floor
     * 
     */
    SF("SF"),

    /**
     * Lowest Astronomical Tide. The lowest tide level
     * 					over the duration of the National Tidal Datum Epoch (19 years).
     * 
     */
    LAT("LAT"),

    /**
     * Mean Sea Level - A tidal datum. The arithmetic mean 
     * 					of hourly heights observed over the National Tidal Datum Epoch (19 years).
     * 
     */
    SL("SL"),

    /**
     * Mean Higher High Water - A tidal datum. The average of 
     * 					the higher high water height of each tidal day observed over the National 
     * 					Tidal Datum Epoch (19 years).
     * 
     */
    MHHW("MHHW"),

    /**
     * Mean High Water - A tidal datum. The average of all the 
     * 					high water heights observed over the National Tidal Datum Epoch (19 years).
     * 
     */
    MHW("MHW"),

    /**
     * Mean Lower Low Water -  A tidal datum. The average of the 
     * 					lower low water height of each tidal day observed over the National Tidal 
     * 					Datum Epoch (19 years ).
     * 
     */
    MLLW("MLLW"),

    /**
     * Mean Low Water - A tidal datum. The average of all the 
     * 					low water heights observed over the National Tidal Datum Epoch (19 years).
     * 
     */
    MLW("MLW"),

    /**
     * Mean Tide Level - A tidal datum. The arithmetic mean of mean 
     * 					high water and mean low water. Same as half-tide level.
     * 
     */
    MTL("MTL"),

    /**
     * kickoff point
     * 
     */
    KO("KO"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
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
