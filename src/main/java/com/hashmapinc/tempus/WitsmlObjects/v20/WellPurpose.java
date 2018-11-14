


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellPurpose.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="WellPurpose">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="appraisal"/>
 *     <enumeration value="appraisal -- confirmation appraisal"/>
 *     <enumeration value="appraisal -- exploratory appraisal"/>
 *     <enumeration value="exploration"/>
 *     <enumeration value="exploration -- deeper-pool wildcat"/>
 *     <enumeration value="exploration -- new-field wildcat"/>
 *     <enumeration value="exploration -- new-pool wildcat"/>
 *     <enumeration value="exploration -- outpost wildcat"/>
 *     <enumeration value="exploration -- shallower-pool wildcat"/>
 *     <enumeration value="development"/>
 *     <enumeration value="development -- infill development"/>
 *     <enumeration value="development -- injector"/>
 *     <enumeration value="development -- producer"/>
 *     <enumeration value="fluid storage"/>
 *     <enumeration value="fluid storage -- gas storage"/>
 *     <enumeration value="general srvc"/>
 *     <enumeration value="general srvc -- borehole re-acquisition"/>
 *     <enumeration value="general srvc -- observation"/>
 *     <enumeration value="general srvc -- relief"/>
 *     <enumeration value="general srvc -- research"/>
 *     <enumeration value="general srvc -- research -- drill test"/>
 *     <enumeration value="general srvc -- research -- strat test"/>
 *     <enumeration value="general srvc -- waste disposal"/>
 *     <enumeration value="mineral"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WellPurpose", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum WellPurpose {


    /**
     * A well drilled into a formation shown to be potentially productive of oil or gas by an earlier well for the purpose of obtaining more information about the reservoir. Also known as a delineation well.
     * 
     */
    @XmlEnumValue("appraisal")
    APPRAISAL("appraisal"),

    /**
     * An appraisal well, generally drilled in a location interpreted to be in the reservoir, whose purpose is to confirm the interpretation.
     * 
     */
    @XmlEnumValue("appraisal -- confirmation appraisal")
    APPRAISAL_CONFIRMATION_APPRAISAL("appraisal -- confirmation appraisal"),

    /**
     * An appraisal well, generally drilled in an area unknown to be part of the reservoir, whose purpose is to determine the extent of the reservoir.
     * 
     */
    @XmlEnumValue("appraisal -- exploratory appraisal")
    APPRAISAL_EXPLORATORY_APPRAISAL("appraisal -- exploratory appraisal"),

    /**
     * An exploratory well drilled in an unproved area to test for a new field, a new pay, a deeper reservoir, or a shallower reservoir. Also known as a wildcat.
     * 
     */
    @XmlEnumValue("exploration")
    EXPLORATION("exploration"),

    /**
     * An exploratory well drilled to search for additional pools of hydrocarbon near known pools of hydrocarbon but at deeper stratigraphic levels than known pools.
     * 
     */
    @XmlEnumValue("exploration -- deeper-pool wildcat")
    EXPLORATION_DEEPER_POOL_WILDCAT("exploration -- deeper-pool wildcat"),

    /**
     * An exploratory well drilled to search for an occurrence of hydrocarbon at a relatively considerable distance outside the limits of known pools of hydrocarbon, as those limits were understood at the time.
     * 
     */
    @XmlEnumValue("exploration -- new-field wildcat")
    EXPLORATION_NEW_FIELD_WILDCAT("exploration -- new-field wildcat"),

    /**
     * An exploratory well drilled to search for additional pools of hydrocarbon near and at the same stratigraphic level as known pools.
     * 
     */
    @XmlEnumValue("exploration -- new-pool wildcat")
    EXPLORATION_NEW_POOL_WILDCAT("exploration -- new-pool wildcat"),

    /**
     * An exploratory well drilled to search for additional pools of hydrocarbon or to extend the limits of a known pool by searching in the same interval at some distance from a known pool.
     * 
     */
    @XmlEnumValue("exploration -- outpost wildcat")
    EXPLORATION_OUTPOST_WILDCAT("exploration -- outpost wildcat"),

    /**
     * An exploratory well drilled to search for additional pools of hydrocarbon near but at a shallower stratigraphic levels than known pools.
     * 
     */
    @XmlEnumValue("exploration -- shallower-pool wildcat")
    EXPLORATION_SHALLOWER_POOL_WILDCAT("exploration -- shallower-pool wildcat"),

    /**
     * A well drilled in a zone in an area already proved productive.
     * 
     */
    @XmlEnumValue("development")
    DEVELOPMENT("development"),

    /**
     * A development well drilled to fill in between established wells, usually as part of a drilling program to reduce the spacing between wells to increase production.
     * 
     */
    @XmlEnumValue("development -- infill development")
    DEVELOPMENT_INFILL_DEVELOPMENT("development -- infill development"),

    /**
     * A development well drilled with the intent of injecting fluids into the reservoir for the purpose of improving reservoir production.
     * 
     */
    @XmlEnumValue("development -- injector")
    DEVELOPMENT_INJECTOR("development -- injector"),

    /**
     * A development well drilled with the intent of producing fluids.
     * 
     */
    @XmlEnumValue("development -- producer")
    DEVELOPMENT_PRODUCER("development -- producer"),

    /**
     * A well drilled for storing fluids - generally either hydrocarbons or waste disposal.
     * 
     */
    @XmlEnumValue("fluid storage")
    FLUID_STORAGE("fluid storage"),

    /**
     * A well drilled with the intent of injecting gas into the reservoir rock as a storage facility.
     * 
     */
    @XmlEnumValue("fluid storage -- gas storage")
    FLUID_STORAGE_GAS_STORAGE("fluid storage -- gas storage"),

    /**
     * A well drilled with the intent of providing a general service as opposed to producing or injecting fluids. Examples of such services are geologic tests, pressure relief (for blowouts), and monitoring and observation.
     * 
     */
    @XmlEnumValue("general srvc")
    GENERAL_SRVC("general srvc"),

    /**
     * A service well drilled to intersect another well below the surface for the purpose of extending the life of a well whose surface borehole has been lost or damaged.
     * 
     */
    @XmlEnumValue("general srvc -- borehole re-acquisition")
    GENERAL_SRVC_BOREHOLE_RE_ACQUISITION("general srvc -- borehole re-acquisition"),

    /**
     * A service well drilled for the purpose of monitoring fluids in a reservoir, or observing some other subsurface phenomena. Also called a monitor well.
     * 
     */
    @XmlEnumValue("general srvc -- observation")
    GENERAL_SRVC_OBSERVATION("general srvc -- observation"),

    /**
     * A service well drilled with the specific purpose to provide communication at some point below the surface to another well that is out of control.
     * 
     */
    @XmlEnumValue("general srvc -- relief")
    GENERAL_SRVC_RELIEF("general srvc -- relief"),

    /**
     * A well drilled with the purpose of obtaining information on the stratigraphy, on drilling practices, for logging tests, or other such purpose. It is not expected to find economic reserves of hydrocarbons.
     * 
     */
    @XmlEnumValue("general srvc -- research")
    GENERAL_SRVC_RESEARCH("general srvc -- research"),

    /**
     * A research well drilled to test the suitablity of a particular type of equipment or drilling practice.
     * 
     */
    @XmlEnumValue("general srvc -- research -- drill test")
    GENERAL_SRVC_RESEARCH_DRILL_TEST("general srvc -- research -- drill test"),

    /**
     * A research well drilled for the purpose of gathering geologic information on the stratigraphy of an area. A C.O.S.T. well would be included in this category.
     * 
     */
    @XmlEnumValue("general srvc -- research -- strat test")
    GENERAL_SRVC_RESEARCH_STRAT_TEST("general srvc -- research -- strat test"),

    /**
     * A service well drilled for the purpose of injection of sewage, industrial waste, or other waste fluids into the subsurface for disposal.
     * 
     */
    @XmlEnumValue("general srvc -- waste disposal")
    GENERAL_SRVC_WASTE_DISPOSAL("general srvc -- waste disposal"),

    /**
     * A non-oil and gas well drilled for the purpose of locating and/or extracting a mineral from the subsurface, usually through the injection and/or extraction of mineral-bearing fluids.
     * 
     */
    @XmlEnumValue("mineral")
    MINERAL("mineral");
    private final String value;

    WellPurpose(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WellPurpose fromValue(String v) {
        for (WellPurpose c: WellPurpose.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
