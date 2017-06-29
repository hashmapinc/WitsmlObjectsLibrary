package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="WellStatus">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="abandoned"/>
 *     <enumeration value="active"/>
 *     <enumeration value="active -- injecting"/>
 *     <enumeration value="active -- producing"/>
 *     <enumeration value="completed"/>
 *     <enumeration value="drilling"/>
 *     <enumeration value="partially plugged"/>
 *     <enumeration value="permitted"/>
 *     <enumeration value="plugged and abandoned"/>
 *     <enumeration value="proposed"/>
 *     <enumeration value="sold"/>
 *     <enumeration value="suspended"/>
 *     <enumeration value="temporarily abandoned"/>
 *     <enumeration value="testing"/>
 *     <enumeration value="tight"/>
 *     <enumeration value="working over"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "WellStatus")
@XmlEnum
public enum WellStatus {


    /**
     * The status of a facility in which drilling, 
     * 					completion, and production operations have been permanently 
     * 					terminated.
     * 
     */
    @XmlEnumValue("abandoned")
    ABANDONED("abandoned"),

    /**
     * For a well to be active, at least one of its 
     * 					wellbores must be active. For a wellbore to be active, at least 
     * 					one of its completions must be actively producing or injecting 
     * 					fluids.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * Fluids are actively being injected into the 
     * 					facility.
     * 
     */
    @XmlEnumValue("active -- injecting")
    ACTIVE_INJECTING("active -- injecting"),

    /**
     * Fluids are actively being produced from the 
     * 					facility.
     * 
     */
    @XmlEnumValue("active -- producing")
    ACTIVE_PRODUCING("active -- producing"),

    /**
     * The completion has been installed, but the 
     * 					facility is not yet active. This status is appropriate only 
     * 					before the initial producing or injecting activity.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The status of a well or wellbore in which drilling 
     * 					operations have begun, but are not yet completed. The status ends 
     * 					when another status becomes appropriate.
     * 
     */
    @XmlEnumValue("drilling")
    DRILLING("drilling"),

    /**
     * The wellbore has been plugged from the bottom, 
     * 					but only partially to the point where it intersects another wellbore.
     * 
     */
    @XmlEnumValue("partially plugged")
    PARTIALLY_PLUGGED("partially plugged"),

    /**
     * The facility has received regulatory approvel, 
     * 					but drilling has not yet commenced. For a well, it has been spudded. 
     * 					For a subsequent wellbore, the whipstock or similar device has not 
     * 					yet been set.
     * 
     */
    @XmlEnumValue("permitted")
    PERMITTED("permitted"),

    /**
     * An abandoned well (or wellbore) whose wellbores 
     * 					have been plugged in such a manner as to prevent the migration of 
     * 					oil, gas, salt water, or other substance from one stratum to another. 
     * 					Generally the criteria for this status is controlled by regulatory 
     * 					authorities.
     * 
     */
    @XmlEnumValue("plugged and abandoned")
    PLUGGED_AND_ABANDONED("plugged and abandoned"),

    /**
     * The status of a well or wellbore from conception 
     * 					to either regulatory approval or commencement of drilling.
     * 
     */
    @XmlEnumValue("proposed")
    PROPOSED("proposed"),

    /**
     * The facility has been sold, so it is no longer 
     * 					appropriate to keep a close internal status value. Status values 
     * 					may be added at later times without changing the sold status.
     * 
     */
    @XmlEnumValue("sold")
    SOLD("sold"),

    /**
     * Production or injection has been temporarily 
     * 					suspended in a manner that will allow immediate resumption of 
     * 					activities.
     * 
     */
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),

    /**
     * Production or injection has been temporarily 
     * 					suspended in a manner that will not allow immediate resumption 
     * 					of activities.
     * 
     */
    @XmlEnumValue("temporarily abandoned")
    TEMPORARILY_ABANDONED("temporarily abandoned"),

    /**
     * The facility operations are suspended while 
     * 					tests are being conducted to determine formation and/or reservoir 
     * 					properties. For example, a drillstem test. This status also 
     * 					includes extended testing.
     * 
     */
    @XmlEnumValue("testing")
    TESTING("testing"),

    /**
     * Information about the status of the well is 
     * 					confidential. This is more explicit than unknown, since it gives 
     * 					the reason that the status value is unknown.
     * 
     */
    @XmlEnumValue("tight")
    TIGHT("tight"),

    /**
     * Maintenance or data acquisition on a well during 
     * 					the production phase. This includes any relevant job which can be 
     * 					done while the well is shut in. This includes many jobs that occur 
     * 					when a well is re-entered.
     * 
     */
    @XmlEnumValue("working over")
    WORKING_OVER("working over"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    WellStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WellStatus fromValue(String v) {
        for (WellStatus c: WellStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
