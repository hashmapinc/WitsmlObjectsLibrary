


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellboreDatumReference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="WellboreDatumReference">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="ground level"/>
 *     <enumeration value="kelly bushing"/>
 *     <enumeration value="mean sea level"/>
 *     <enumeration value="derrick floor"/>
 *     <enumeration value="casing flange"/>
 *     <enumeration value="crown valve"/>
 *     <enumeration value="rotary bushing"/>
 *     <enumeration value="rotary table"/>
 *     <enumeration value="sea floor"/>
 *     <enumeration value="lowest astronomical tide"/>
 *     <enumeration value="mean higher high water"/>
 *     <enumeration value="mean high water"/>
 *     <enumeration value="mean lower low water"/>
 *     <enumeration value="mean low water"/>
 *     <enumeration value="mean tide level"/>
 *     <enumeration value="kickoff point"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WellboreDatumReference")
@XmlEnum
public enum WellboreDatumReference {

    @XmlEnumValue("ground level")
    GROUND_LEVEL("ground level"),
    @XmlEnumValue("kelly bushing")
    KELLY_BUSHING("kelly bushing"),

    /**
     * A tidal datum. The arithmetic mean of hourly heights observed over the National Tidal Datum Epoch (19 years).
     * 
     */
    @XmlEnumValue("mean sea level")
    MEAN_SEA_LEVEL("mean sea level"),
    @XmlEnumValue("derrick floor")
    DERRICK_FLOOR("derrick floor"),

    /**
     * A flange affixed to the top of the casing string used to attach production equipment.
     * 
     */
    @XmlEnumValue("casing flange")
    CASING_FLANGE("casing flange"),
    @XmlEnumValue("crown valve")
    CROWN_VALVE("crown valve"),
    @XmlEnumValue("rotary bushing")
    ROTARY_BUSHING("rotary bushing"),
    @XmlEnumValue("rotary table")
    ROTARY_TABLE("rotary table"),
    @XmlEnumValue("sea floor")
    SEA_FLOOR("sea floor"),

    /**
     * The lowest tide level over the duration of the National Tidal Datum Epoch (19 years).
     * 
     */
    @XmlEnumValue("lowest astronomical tide")
    LOWEST_ASTRONOMICAL_TIDE("lowest astronomical tide"),

    /**
     * A tidal datum. The average of the higher high water height of each tidal day observed over the National Tidal Datum Epoch (19 years).
     * 
     */
    @XmlEnumValue("mean higher high water")
    MEAN_HIGHER_HIGH_WATER("mean higher high water"),

    /**
     * A tidal datum. The average of all the high water heights observed over the National Tidal Datum Epoch (19 years).
     * 
     */
    @XmlEnumValue("mean high water")
    MEAN_HIGH_WATER("mean high water"),

    /**
     * A tidal datum. The average of the lower low water height of each tidal day observed over the National Tidal Datum Epoch (19 years).
     * 
     */
    @XmlEnumValue("mean lower low water")
    MEAN_LOWER_LOW_WATER("mean lower low water"),

    /**
     * A tidal datum. The average of all the low water heights observed over the National Tidal Datum Epoch (19 years).
     * 
     */
    @XmlEnumValue("mean low water")
    MEAN_LOW_WATER("mean low water"),

    /**
     * A tidal datum. The arithmetic mean of mean high water and mean low water. Same as half-tide level.
     * 
     */
    @XmlEnumValue("mean tide level")
    MEAN_TIDE_LEVEL("mean tide level"),

    /**
     * This value is not expected to be used in most typical situations. All reasonable attempts should be made to determine the appropriate value.
     * 
     */
    @XmlEnumValue("kickoff point")
    KICKOFF_POINT("kickoff point");
    private final String value;

    WellboreDatumReference(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WellboreDatumReference fromValue(String v) {
        for (WellboreDatumReference c: WellboreDatumReference.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
