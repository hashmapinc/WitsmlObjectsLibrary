package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstalledFiberPoint.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="InstalledFiberPoint">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="splice"/>
 *     <enumeration value="connector"/>
 *     <enumeration value="end of fiber"/>
 *     <enumeration value="base of fiber"/>
 *     <enumeration value="turn around point"/>
 *     <enumeration value="start of fiber"/>
 *     <enumeration value="oven entry point"/>
 *     <enumeration value="oven exit point"/>
 *     <enumeration value="downhole gauge"/>
 *     <enumeration value="DTS laser head"/>
 *     <enumeration value="DTS reference oven"/>
 *     <enumeration value="splice box"/>
 *     <enumeration value="wellhead junction box"/>
 *     <enumeration value="base tubing hanger flange"/>
 *     <enumeration value="PBR wet connect"/>
 *     <enumeration value="top ESP pump"/>
 *     <enumeration value="base ESP pump"/>
 *     <enumeration value="wellhead temperature gauge"/>
 *     <enumeration value="top completion zone"/>
 *     <enumeration value="base completion zone"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "InstalledFiberPoint")
@XmlEnum
public enum InstalledFiberPoint {


    /**
     * A point at which a fiber is physically, and semi-permanently, 
     * 					connected to another length of fiber.
     * 
     */
    @XmlEnumValue("splice")
    SPLICE("splice"),

    /**
     * A point at which a cable connector is installed, which allows 
     * 					the fiber to be connected to another instrument or fiber length.
     * 
     */
    @XmlEnumValue("connector")
    CONNECTOR("connector"),

    /**
     * The end of the fiber. If a U-geometry is used, and a connector 
     * 					is at both ends, the connector classification should be used rather than the end 
     * 					of fiber classification.
     * 
     */
    @XmlEnumValue("end of fiber")
    END_OF_FIBER("end of fiber"),

    /**
     * The deepest point of the installed fiber in a well. This is 
     * 					a valid value for fiber installations that do NOT turn around at the bottom 
     * 					(J- and U-type installations).
     * 
     */
    @XmlEnumValue("base of fiber")
    BASE_OF_FIBER("base of fiber"),

    /**
     * The point in the turn-around-sub at which measured depth 
     * 					stops increasing and begins decreasing. This is a valid value for fiber 
     * 					installations of the J- and U- type only.
     * 
     */
    @XmlEnumValue("turn around point")
    TURN_AROUND_POINT("turn around point"),

    /**
     * The start of the fiber. If appropriate, the connector 
     * 					classification should be used instead of this classification.
     * 
     */
    @XmlEnumValue("start of fiber")
    START_OF_FIBER("start of fiber"),

    /**
     * The point on the fiber at which it enters the oven.
     * 
     */
    @XmlEnumValue("oven entry point")
    OVEN_ENTRY_POINT("oven entry point"),

    /**
     * The point on the fiber at which it exits the oven. 
     * 					The oven exit point should be closer to the wellbore than the oven entry point.
     * 
     */
    @XmlEnumValue("oven exit point")
    OVEN_EXIT_POINT("oven exit point"),

    /**
     * A downhole point on the fiber at which a gauge is attached.
     * 
     */
    @XmlEnumValue("downhole gauge")
    DOWNHOLE_GAUGE("downhole gauge"),

    /**
     * The connector between the laser head and the optical fiber.
     * 
     */
    @XmlEnumValue("DTS laser head")
    DTS_LASER_HEAD("DTS laser head"),

    /**
     * The oven within or near the DTS instrument box which 
     * 					maintains a length of fiber at a reference temperature.
     * 
     */
    @XmlEnumValue("DTS reference oven")
    DTS_REFERENCE_OVEN("DTS reference oven"),

    /**
     * Container in which ends of lengths of fiber are joined.
     * 
     */
    @XmlEnumValue("splice box")
    SPLICE_BOX("splice box"),

    /**
     * The device at which a fiber originating at the instrument 
     * 					box is joined to a fiber installed in a wellbore.  This is a recommended 
     * 					location at which LengthAlongFiber and measuredDepth in the wellbore are 
     * 					correlated
     * 
     */
    @XmlEnumValue("wellhead junction box")
    WELLHEAD_JUNCTION_BOX("wellhead junction box"),

    /**
     * The device at the base of the wellhead to which the 
     * 					production tubing is attached.  This is a recommended location at which 
     * 					LengthAlongFiber and measuredDepth in the wellbore are correlated.
     * 
     */
    @XmlEnumValue("base tubing hanger flange")
    BASE_TUBING_HANGER_FLANGE("base tubing hanger flange"),

    /**
     * The top-most point at which the fiber intersects the 
     * 					PBR (polished bore receptacle). For J- and U- installations, on the upward 
     * 					portion of the fiber, this is the point at which it leaves the pbf.
     * 
     */
    @XmlEnumValue("PBR wet connect")
    PBR_WET_CONNECT("PBR wet connect"),

    /**
     * The top of the electrical submersible pump (ESP). 
     * 					This is the minimum measured depth point of the pump.
     * 
     */
    @XmlEnumValue("top ESP pump")
    TOP_ESP_PUMP("top ESP pump"),

    /**
     * The base of the electrical submersible pump (ESP). 
     * 					This is the maximum measured depth point of the pump.
     * 
     */
    @XmlEnumValue("base ESP pump")
    BASE_ESP_PUMP("base ESP pump"),

    /**
     * Temperature measuring device at the wellhead independent 
     * 					of the optic fiber sensor.
     * 
     */
    @XmlEnumValue("wellhead temperature gauge")
    WELLHEAD_TEMPERATURE_GAUGE("wellhead temperature gauge"),

    /**
     * The point which is the minimum measured depth of a 
     * 					completion zone.
     * 
     */
    @XmlEnumValue("top completion zone")
    TOP_COMPLETION_ZONE("top completion zone"),

    /**
     * The point which is the maximum measured depth of a 
     * 					completion zone.
     * 
     */
    @XmlEnumValue("base completion zone")
    BASE_COMPLETION_ZONE("base completion zone"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    InstalledFiberPoint(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstalledFiberPoint fromValue(String v) {
        for (InstalledFiberPoint c: InstalledFiberPoint.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
