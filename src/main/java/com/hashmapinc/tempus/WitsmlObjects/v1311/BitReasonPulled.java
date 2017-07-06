package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BitReasonPulled.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="BitReasonPulled">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="BHA"/>
 *     <enumeration value="CM"/>
 *     <enumeration value="CP"/>
 *     <enumeration value="DMF"/>
 *     <enumeration value="DP"/>
 *     <enumeration value="DST"/>
 *     <enumeration value="DTF"/>
 *     <enumeration value="FM"/>
 *     <enumeration value="HP"/>
 *     <enumeration value="HR"/>
 *     <enumeration value="LOG"/>
 *     <enumeration value="PP"/>
 *     <enumeration value="PR"/>
 *     <enumeration value="RIG"/>
 *     <enumeration value="TD"/>
 *     <enumeration value="TQ"/>
 *     <enumeration value="TW"/>
 *     <enumeration value="WC"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "BitReasonPulled")
@XmlEnum
public enum BitReasonPulled {


    /**
     * Change Bottom Hole Assembly
     * 
     */
    BHA("BHA"),

    /**
     * Condition Mud
     * 
     */
    CM("CM"),

    /**
     * Core Point
     * 
     */
    CP("CP"),

    /**
     * Downhole Motor Failure
     * 
     */
    DMF("DMF"),

    /**
     * Drill Plug
     * 
     */
    DP("DP"),

    /**
     * Drill Stem Test
     * 
     */
    DST("DST"),

    /**
     * Downhole Tool Failure
     * 
     */
    DTF("DTF"),

    /**
     * Formation Change
     * 
     */
    FM("FM"),

    /**
     * Hole Problems
     * 
     */
    HP("HP"),

    /**
     * Hours on Bit
     * 
     */
    HR("HR"),

    /**
     * Run Logs
     * 
     */
    LOG("LOG"),

    /**
     * Pump Pressure
     * 
     */
    PP("PP"),

    /**
     * Penetration Rate
     * 
     */
    PR("PR"),

    /**
     * Rig Repairs
     * 
     */
    RIG("RIG"),

    /**
     * Total Depth/Casing Depth
     * 
     */
    TD("TD"),

    /**
     * Torque
     * 
     */
    TQ("TQ"),

    /**
     * Twist Off
     * 
     */
    TW("TW"),

    /**
     * Weather Conditions
     * 
     */
    WC("WC"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    BitReasonPulled(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BitReasonPulled fromValue(String v) {
        for (BitReasonPulled c: BitReasonPulled.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
