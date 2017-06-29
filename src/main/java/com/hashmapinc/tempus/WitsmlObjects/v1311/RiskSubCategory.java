package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskSubCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="RiskSubCategory">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="gas kick"/>
 *     <enumeration value="shallow water influx"/>
 *     <enumeration value="other influx or kicks"/>
 *     <enumeration value="loss circulation"/>
 *     <enumeration value="poor hole cleaning"/>
 *     <enumeration value="good hole cleaning at high ROP"/>
 *     <enumeration value="high mud weight"/>
 *     <enumeration value="special additives needed"/>
 *     <enumeration value="gumbo problems"/>
 *     <enumeration value="high ECD - rheology related"/>
 *     <enumeration value="excessive circulation"/>
 *     <enumeration value="performing a kill"/>
 *     <enumeration value="mud weight change"/>
 *     <enumeration value="excessive pipe cement scaling"/>
 *     <enumeration value="pit gain or loss"/>
 *     <enumeration value="mud stability problems"/>
 *     <enumeration value="shallow gas flow"/>
 *     <enumeration value="twist off"/>
 *     <enumeration value="stuck pipe"/>
 *     <enumeration value="wireline stuck in hole"/>
 *     <enumeration value="stick and slip"/>
 *     <enumeration value="vibration - axial"/>
 *     <enumeration value="vibration - torsional"/>
 *     <enumeration value="vibration - transverse"/>
 *     <enumeration value="vibration unknown or rough drilling"/>
 *     <enumeration value="uneven wear of BHA"/>
 *     <enumeration value="uneven wear of drillstring"/>
 *     <enumeration value="excessive torque"/>
 *     <enumeration value="excessive drag"/>
 *     <enumeration value="reaming greater than 2 hours"/>
 *     <enumeration value="washouts"/>
 *     <enumeration value="tight hole or overPull"/>
 *     <enumeration value="failed inspections or fatigue wear"/>
 *     <enumeration value="mechanical"/>
 *     <enumeration value="drilling greater than 1000 feet/day"/>
 *     <enumeration value="drilling greater than 2000 feet/day"/>
 *     <enumeration value="drilling less than 20 feet/day"/>
 *     <enumeration value="trips greater than 24 hours"/>
 *     <enumeration value="excessive time for BHA makeup"/>
 *     <enumeration value="waiting on decisions"/>
 *     <enumeration value="waiting on weather"/>
 *     <enumeration value="waiting on tools"/>
 *     <enumeration value="sloughing or packoffs"/>
 *     <enumeration value="ballooning"/>
 *     <enumeration value="fracture problems"/>
 *     <enumeration value="unstable zones"/>
 *     <enumeration value="formation integrity test"/>
 *     <enumeration value="leak-off test"/>
 *     <enumeration value="tectonics"/>
 *     <enumeration value="pore pressure"/>
 *     <enumeration value="breakouts"/>
 *     <enumeration value="bed parallel"/>
 *     <enumeration value="wellbore stability"/>
 *     <enumeration value="excessive doglegs"/>
 *     <enumeration value="sidetrack"/>
 *     <enumeration value="BHA change for directional"/>
 *     <enumeration value="wrong total flow area"/>
 *     <enumeration value="well collision - actual"/>
 *     <enumeration value="well collision - technical"/>
 *     <enumeration value="geosteering"/>
 *     <enumeration value="abnormal tendency changes"/>
 *     <enumeration value="resurveying"/>
 *     <enumeration value="in-field referencing (IFR) actions"/>
 *     <enumeration value="bit or BHA performance"/>
 *     <enumeration value="drilling optimization"/>
 *     <enumeration value="bit balling"/>
 *     <enumeration value="lost cones or broken cutters"/>
 *     <enumeration value="excessive bit wear or gauge"/>
 *     <enumeration value="low rate of bit penetration"/>
 *     <enumeration value="high rate of bit penetration"/>
 *     <enumeration value="downhole tool"/>
 *     <enumeration value="surface system"/>
 *     <enumeration value="motor or rotary steerable system failure"/>
 *     <enumeration value="topdrive failure"/>
 *     <enumeration value="hoisting equipment failure"/>
 *     <enumeration value="circulating equipment failure"/>
 *     <enumeration value="electrical system failure"/>
 *     <enumeration value="blow out preventer events"/>
 *     <enumeration value="surface instrumentation problems"/>
 *     <enumeration value="rig communications"/>
 *     <enumeration value="completion equipment failure"/>
 *     <enumeration value="miscellaneous rig equipment"/>
 *     <enumeration value="tool or equipment failure"/>
 *     <enumeration value="squeeze jobs"/>
 *     <enumeration value="casing surge losses"/>
 *     <enumeration value="stuck casing or completion"/>
 *     <enumeration value="shoe failures"/>
 *     <enumeration value="early cement setup"/>
 *     <enumeration value="casing collapse"/>
 *     <enumeration value="milling"/>
 *     <enumeration value="excessive casing wear or cuttings"/>
 *     <enumeration value="excessive formation damage or skin"/>
 *     <enumeration value="casing rotation or reciprocation rqd"/>
 *     <enumeration value="broaching"/>
 *     <enumeration value="completion or casing"/>
 *     <enumeration value="stratigraphy"/>
 *     <enumeration value="fishing"/>
 *     <enumeration value="junk in hole"/>
 *     <enumeration value="delay due to political unrest"/>
 *     <enumeration value="rig move"/>
 *     <enumeration value="gas hydrates"/>
 *     <enumeration value="pending analysis"/>
 *     <enumeration value="riser disconnect"/>
 *     <enumeration value="other"/>
 *     <enumeration value="personnel"/>
 *     <enumeration value="environmental"/>
 *     <enumeration value="automotive"/>
 *     <enumeration value="asset"/>
 *     <enumeration value="information"/>
 *     <enumeration value="time"/>
 *     <enumeration value="HSE"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "RiskSubCategory")
@XmlEnum
public enum RiskSubCategory {

    @XmlEnumValue("gas kick")
    GAS_KICK("gas kick"),
    @XmlEnumValue("shallow water influx")
    SHALLOW_WATER_INFLUX("shallow water influx"),
    @XmlEnumValue("other influx or kicks")
    OTHER_INFLUX_OR_KICKS("other influx or kicks"),
    @XmlEnumValue("loss circulation")
    LOSS_CIRCULATION("loss circulation"),
    @XmlEnumValue("poor hole cleaning")
    POOR_HOLE_CLEANING("poor hole cleaning"),

    /**
     * Rate of Penetration
     * 
     */
    @XmlEnumValue("good hole cleaning at high ROP")
    GOOD_HOLE_CLEANING_AT_HIGH_ROP("good hole cleaning at high ROP"),

    /**
     * High mud weight (i.e., greater than 10 parts per US gallon).
     * 
     */
    @XmlEnumValue("high mud weight")
    HIGH_MUD_WEIGHT("high mud weight"),
    @XmlEnumValue("special additives needed")
    SPECIAL_ADDITIVES_NEEDED("special additives needed"),
    @XmlEnumValue("gumbo problems")
    GUMBO_PROBLEMS("gumbo problems"),
    @XmlEnumValue("high ECD - rheology related")
    HIGH_ECD_RHEOLOGY_RELATED("high ECD - rheology related"),

    /**
     * Greater than 2 hours.
     * 
     */
    @XmlEnumValue("excessive circulation")
    EXCESSIVE_CIRCULATION("excessive circulation"),
    @XmlEnumValue("performing a kill")
    PERFORMING_A_KILL("performing a kill"),

    /**
     * Greater than 0.5 parts per US gallon.
     * 
     */
    @XmlEnumValue("mud weight change")
    MUD_WEIGHT_CHANGE("mud weight change"),
    @XmlEnumValue("excessive pipe cement scaling")
    EXCESSIVE_PIPE_CEMENT_SCALING("excessive pipe cement scaling"),

    /**
     * Greater than ten barrles.
     * 
     */
    @XmlEnumValue("pit gain or loss")
    PIT_GAIN_OR_LOSS("pit gain or loss"),
    @XmlEnumValue("mud stability problems")
    MUD_STABILITY_PROBLEMS("mud stability problems"),
    @XmlEnumValue("shallow gas flow")
    SHALLOW_GAS_FLOW("shallow gas flow"),
    @XmlEnumValue("twist off")
    TWIST_OFF("twist off"),

    /**
     * Greater than 30 minutes.
     * 
     */
    @XmlEnumValue("stuck pipe")
    STUCK_PIPE("stuck pipe"),
    @XmlEnumValue("wireline stuck in hole")
    WIRELINE_STUCK_IN_HOLE("wireline stuck in hole"),
    @XmlEnumValue("stick and slip")
    STICK_AND_SLIP("stick and slip"),
    @XmlEnumValue("vibration - axial")
    VIBRATION_AXIAL("vibration - axial"),
    @XmlEnumValue("vibration - torsional")
    VIBRATION_TORSIONAL("vibration - torsional"),
    @XmlEnumValue("vibration - transverse")
    VIBRATION_TRANSVERSE("vibration - transverse"),
    @XmlEnumValue("vibration unknown or rough drilling")
    VIBRATION_UNKNOWN_OR_ROUGH_DRILLING("vibration unknown or rough drilling"),
    @XmlEnumValue("uneven wear of BHA")
    UNEVEN_WEAR_OF_BHA("uneven wear of BHA"),
    @XmlEnumValue("uneven wear of drillstring")
    UNEVEN_WEAR_OF_DRILLSTRING("uneven wear of drillstring"),
    @XmlEnumValue("excessive torque")
    EXCESSIVE_TORQUE("excessive torque"),
    @XmlEnumValue("excessive drag")
    EXCESSIVE_DRAG("excessive drag"),

    /**
     * Greater than 2 hours.
     * 
     */
    @XmlEnumValue("reaming greater than 2 hours")
    REAMING_GREATER_THAN_2_HOURS("reaming greater than 2 hours"),
    @XmlEnumValue("washouts")
    WASHOUTS("washouts"),
    @XmlEnumValue("tight hole or overPull")
    TIGHT_HOLE_OR_OVER_PULL("tight hole or overPull"),
    @XmlEnumValue("failed inspections or fatigue wear")
    FAILED_INSPECTIONS_OR_FATIGUE_WEAR("failed inspections or fatigue wear"),
    @XmlEnumValue("mechanical")
    MECHANICAL("mechanical"),

    /**
     * Greater than 1000 feet per day.
     * 
     */
    @XmlEnumValue("drilling greater than 1000 feet/day")
    DRILLING_GREATER_THAN_1000_FEET_DAY("drilling greater than 1000 feet/day"),

    /**
     * Greater than 2000 feet per day.
     * 
     */
    @XmlEnumValue("drilling greater than 2000 feet/day")
    DRILLING_GREATER_THAN_2000_FEET_DAY("drilling greater than 2000 feet/day"),

    /**
     * Less than 20 feet per day.
     * 
     */
    @XmlEnumValue("drilling less than 20 feet/day")
    DRILLING_LESS_THAN_20_FEET_DAY("drilling less than 20 feet/day"),

    /**
     * Greater than 24 hours.
     * 
     */
    @XmlEnumValue("trips greater than 24 hours")
    TRIPS_GREATER_THAN_24_HOURS("trips greater than 24 hours"),

    /**
     * Bottom Hole Assembly
     * 
     */
    @XmlEnumValue("excessive time for BHA makeup")
    EXCESSIVE_TIME_FOR_BHA_MAKEUP("excessive time for BHA makeup"),
    @XmlEnumValue("waiting on decisions")
    WAITING_ON_DECISIONS("waiting on decisions"),
    @XmlEnumValue("waiting on weather")
    WAITING_ON_WEATHER("waiting on weather"),
    @XmlEnumValue("waiting on tools")
    WAITING_ON_TOOLS("waiting on tools"),
    @XmlEnumValue("sloughing or packoffs")
    SLOUGHING_OR_PACKOFFS("sloughing or packoffs"),
    @XmlEnumValue("ballooning")
    BALLOONING("ballooning"),
    @XmlEnumValue("fracture problems")
    FRACTURE_PROBLEMS("fracture problems"),
    @XmlEnumValue("unstable zones")
    UNSTABLE_ZONES("unstable zones"),
    @XmlEnumValue("formation integrity test")
    FORMATION_INTEGRITY_TEST("formation integrity test"),
    @XmlEnumValue("leak-off test")
    LEAK_OFF_TEST("leak-off test"),
    @XmlEnumValue("tectonics")
    TECTONICS("tectonics"),
    @XmlEnumValue("pore pressure")
    PORE_PRESSURE("pore pressure"),
    @XmlEnumValue("breakouts")
    BREAKOUTS("breakouts"),
    @XmlEnumValue("bed parallel")
    BED_PARALLEL("bed parallel"),
    @XmlEnumValue("wellbore stability")
    WELLBORE_STABILITY("wellbore stability"),
    @XmlEnumValue("excessive doglegs")
    EXCESSIVE_DOGLEGS("excessive doglegs"),
    @XmlEnumValue("sidetrack")
    SIDETRACK("sidetrack"),

    /**
     * Bottom Hole Assembly
     * 
     */
    @XmlEnumValue("BHA change for directional")
    BHA_CHANGE_FOR_DIRECTIONAL("BHA change for directional"),
    @XmlEnumValue("wrong total flow area")
    WRONG_TOTAL_FLOW_AREA("wrong total flow area"),
    @XmlEnumValue("well collision - actual")
    WELL_COLLISION_ACTUAL("well collision - actual"),
    @XmlEnumValue("well collision - technical")
    WELL_COLLISION_TECHNICAL("well collision - technical"),
    @XmlEnumValue("geosteering")
    GEOSTEERING("geosteering"),
    @XmlEnumValue("abnormal tendency changes")
    ABNORMAL_TENDENCY_CHANGES("abnormal tendency changes"),
    @XmlEnumValue("resurveying")
    RESURVEYING("resurveying"),
    @XmlEnumValue("in-field referencing (IFR) actions")
    IN_FIELD_REFERENCING_IFR_ACTIONS("in-field referencing (IFR) actions"),

    /**
     * Bottom Hole Assembly
     * 
     */
    @XmlEnumValue("bit or BHA performance")
    BIT_OR_BHA_PERFORMANCE("bit or BHA performance"),
    @XmlEnumValue("drilling optimization")
    DRILLING_OPTIMIZATION("drilling optimization"),
    @XmlEnumValue("bit balling")
    BIT_BALLING("bit balling"),
    @XmlEnumValue("lost cones or broken cutters")
    LOST_CONES_OR_BROKEN_CUTTERS("lost cones or broken cutters"),
    @XmlEnumValue("excessive bit wear or gauge")
    EXCESSIVE_BIT_WEAR_OR_GAUGE("excessive bit wear or gauge"),
    @XmlEnumValue("low rate of bit penetration")
    LOW_RATE_OF_BIT_PENETRATION("low rate of bit penetration"),
    @XmlEnumValue("high rate of bit penetration")
    HIGH_RATE_OF_BIT_PENETRATION("high rate of bit penetration"),
    @XmlEnumValue("downhole tool")
    DOWNHOLE_TOOL("downhole tool"),
    @XmlEnumValue("surface system")
    SURFACE_SYSTEM("surface system"),
    @XmlEnumValue("motor or rotary steerable system failure")
    MOTOR_OR_ROTARY_STEERABLE_SYSTEM_FAILURE("motor or rotary steerable system failure"),
    @XmlEnumValue("topdrive failure")
    TOPDRIVE_FAILURE("topdrive failure"),
    @XmlEnumValue("hoisting equipment failure")
    HOISTING_EQUIPMENT_FAILURE("hoisting equipment failure"),
    @XmlEnumValue("circulating equipment failure")
    CIRCULATING_EQUIPMENT_FAILURE("circulating equipment failure"),
    @XmlEnumValue("electrical system failure")
    ELECTRICAL_SYSTEM_FAILURE("electrical system failure"),
    @XmlEnumValue("blow out preventer events")
    BLOW_OUT_PREVENTER_EVENTS("blow out preventer events"),
    @XmlEnumValue("surface instrumentation problems")
    SURFACE_INSTRUMENTATION_PROBLEMS("surface instrumentation problems"),
    @XmlEnumValue("rig communications")
    RIG_COMMUNICATIONS("rig communications"),
    @XmlEnumValue("completion equipment failure")
    COMPLETION_EQUIPMENT_FAILURE("completion equipment failure"),
    @XmlEnumValue("miscellaneous rig equipment")
    MISCELLANEOUS_RIG_EQUIPMENT("miscellaneous rig equipment"),
    @XmlEnumValue("tool or equipment failure")
    TOOL_OR_EQUIPMENT_FAILURE("tool or equipment failure"),
    @XmlEnumValue("squeeze jobs")
    SQUEEZE_JOBS("squeeze jobs"),
    @XmlEnumValue("casing surge losses")
    CASING_SURGE_LOSSES("casing surge losses"),
    @XmlEnumValue("stuck casing or completion")
    STUCK_CASING_OR_COMPLETION("stuck casing or completion"),
    @XmlEnumValue("shoe failures")
    SHOE_FAILURES("shoe failures"),
    @XmlEnumValue("early cement setup")
    EARLY_CEMENT_SETUP("early cement setup"),
    @XmlEnumValue("casing collapse")
    CASING_COLLAPSE("casing collapse"),
    @XmlEnumValue("milling")
    MILLING("milling"),
    @XmlEnumValue("excessive casing wear or cuttings")
    EXCESSIVE_CASING_WEAR_OR_CUTTINGS("excessive casing wear or cuttings"),
    @XmlEnumValue("excessive formation damage or skin")
    EXCESSIVE_FORMATION_DAMAGE_OR_SKIN("excessive formation damage or skin"),
    @XmlEnumValue("casing rotation or reciprocation rqd")
    CASING_ROTATION_OR_RECIPROCATION_RQD("casing rotation or reciprocation rqd"),
    @XmlEnumValue("broaching")
    BROACHING("broaching"),
    @XmlEnumValue("completion or casing")
    COMPLETION_OR_CASING("completion or casing"),
    @XmlEnumValue("stratigraphy")
    STRATIGRAPHY("stratigraphy"),
    @XmlEnumValue("fishing")
    FISHING("fishing"),
    @XmlEnumValue("junk in hole")
    JUNK_IN_HOLE("junk in hole"),
    @XmlEnumValue("delay due to political unrest")
    DELAY_DUE_TO_POLITICAL_UNREST("delay due to political unrest"),
    @XmlEnumValue("rig move")
    RIG_MOVE("rig move"),
    @XmlEnumValue("gas hydrates")
    GAS_HYDRATES("gas hydrates"),
    @XmlEnumValue("pending analysis")
    PENDING_ANALYSIS("pending analysis"),
    @XmlEnumValue("riser disconnect")
    RISER_DISCONNECT("riser disconnect"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("personnel")
    PERSONNEL("personnel"),
    @XmlEnumValue("environmental")
    ENVIRONMENTAL("environmental"),
    @XmlEnumValue("automotive")
    AUTOMOTIVE("automotive"),
    @XmlEnumValue("asset")
    ASSET("asset"),
    @XmlEnumValue("information")
    INFORMATION("information"),
    @XmlEnumValue("time")
    TIME("time"),

    /**
     * health, safety and environmental
     * 
     */
    HSE("HSE");
    private final String value;

    RiskSubCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RiskSubCategory fromValue(String v) {
        for (RiskSubCategory c: RiskSubCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
