package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TubularComponent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="TubularComponent">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="non-magnetic stabilizer"/>
 *     <enumeration value="non-magnetic collar"/>
 *     <enumeration value="stabilizer"/>
 *     <enumeration value="adjustable kickoff"/>
 *     <enumeration value="accelerator"/>
 *     <enumeration value="rotary steering tool"/>
 *     <enumeration value="sub-bar catcher"/>
 *     <enumeration value="sub-bent"/>
 *     <enumeration value="bit core diamond"/>
 *     <enumeration value="bit core PDC"/>
 *     <enumeration value="bit diamond fixed cut"/>
 *     <enumeration value="bit insert roller cone"/>
 *     <enumeration value="bit mill tooth roller cone"/>
 *     <enumeration value="bit PDC fixed cutter"/>
 *     <enumeration value="sub-bit"/>
 *     <enumeration value="bridge plug"/>
 *     <enumeration value="bullnose"/>
 *     <enumeration value="bull plug"/>
 *     <enumeration value="sub-bumper"/>
 *     <enumeration value="casing"/>
 *     <enumeration value="casing cutter"/>
 *     <enumeration value="hanger casing subsea"/>
 *     <enumeration value="hanger casing surface"/>
 *     <enumeration value="casing head"/>
 *     <enumeration value="catch assembly"/>
 *     <enumeration value="sub-catcher"/>
 *     <enumeration value="sub-circulation"/>
 *     <enumeration value="coiled tubing in hole"/>
 *     <enumeration value="coiled tubing on coil"/>
 *     <enumeration value="drill pipe compressive"/>
 *     <enumeration value="sub-cone"/>
 *     <enumeration value="core barrel"/>
 *     <enumeration value="core orientation barrel"/>
 *     <enumeration value="sub-crossover"/>
 *     <enumeration value="casing crossover"/>
 *     <enumeration value="sub-dart"/>
 *     <enumeration value="die collar"/>
 *     <enumeration value="die collar LH"/>
 *     <enumeration value="directional guidance system"/>
 *     <enumeration value="drill collar"/>
 *     <enumeration value="drill pipe"/>
 *     <enumeration value="drill pipe LH"/>
 *     <enumeration value="drill stem test BHA"/>
 *     <enumeration value="drive pipe"/>
 *     <enumeration value="dual catch assembly"/>
 *     <enumeration value="extension bowl overshot"/>
 *     <enumeration value="extension sub-overshot"/>
 *     <enumeration value="float collar"/>
 *     <enumeration value="float shoe"/>
 *     <enumeration value="sub-float"/>
 *     <enumeration value="flow head"/>
 *     <enumeration value="guide shoe"/>
 *     <enumeration value="MWD hang off sub"/>
 *     <enumeration value="heavy weight drill pipe"/>
 *     <enumeration value="heavy weight drill pipe LH"/>
 *     <enumeration value="riser high pressure"/>
 *     <enumeration value="bit hole opener"/>
 *     <enumeration value="casing inflatable packer"/>
 *     <enumeration value="motor instrumented"/>
 *     <enumeration value="jar"/>
 *     <enumeration value="sub-jetting"/>
 *     <enumeration value="junk basket"/>
 *     <enumeration value="junk basket reverse circulation"/>
 *     <enumeration value="sub-junk"/>
 *     <enumeration value="kelly"/>
 *     <enumeration value="keyseat wiper tool"/>
 *     <enumeration value="landing float collar"/>
 *     <enumeration value="lead impression block"/>
 *     <enumeration value="liner"/>
 *     <enumeration value="hanger liner"/>
 *     <enumeration value="magnet"/>
 *     <enumeration value="riser marine"/>
 *     <enumeration value="mill dress"/>
 *     <enumeration value="mill flat bottom"/>
 *     <enumeration value="mill hollow"/>
 *     <enumeration value="mill polish"/>
 *     <enumeration value="mill section"/>
 *     <enumeration value="mill taper"/>
 *     <enumeration value="mill washover"/>
 *     <enumeration value="mill packer picker assembly"/>
 *     <enumeration value="millout extension"/>
 *     <enumeration value="multilateral hanger running tool"/>
 *     <enumeration value="hanger mud line"/>
 *     <enumeration value="motor"/>
 *     <enumeration value="mule shoe"/>
 *     <enumeration value="logging while drilling tool"/>
 *     <enumeration value="stabilizer near bit roller reamer"/>
 *     <enumeration value="stabilizer near bit"/>
 *     <enumeration value="stabilizer non-rotating"/>
 *     <enumeration value="sub-orienting"/>
 *     <enumeration value="other"/>
 *     <enumeration value="overshot"/>
 *     <enumeration value="overshot LH"/>
 *     <enumeration value="oversize lip guide overshot"/>
 *     <enumeration value="packer"/>
 *     <enumeration value="polished bore receptacle"/>
 *     <enumeration value="mill pilot"/>
 *     <enumeration value="pipe cutter"/>
 *     <enumeration value="ported stinger"/>
 *     <enumeration value="sub-ported"/>
 *     <enumeration value="prepacked screens"/>
 *     <enumeration value="sub-pressure relief"/>
 *     <enumeration value="riser production"/>
 *     <enumeration value="MWD pulser"/>
 *     <enumeration value="sub-pump out"/>
 *     <enumeration value="sub-restrictor"/>
 *     <enumeration value="packer retrieve TT squeeze"/>
 *     <enumeration value="reversing tool"/>
 *     <enumeration value="stabilizer string roller reamer"/>
 *     <enumeration value="packer RTTS"/>
 *     <enumeration value="running tool"/>
 *     <enumeration value="safety joint"/>
 *     <enumeration value="safety joint LH"/>
 *     <enumeration value="sub-saver"/>
 *     <enumeration value="scab liner bit guide"/>
 *     <enumeration value="scraper"/>
 *     <enumeration value="scratchers"/>
 *     <enumeration value="casing shoe screw-in"/>
 *     <enumeration value="sub-shock"/>
 *     <enumeration value="drill collar short"/>
 *     <enumeration value="sub-side entry"/>
 *     <enumeration value="slotted liner"/>
 *     <enumeration value="spear"/>
 *     <enumeration value="stage cement collar"/>
 *     <enumeration value="motor steerable"/>
 *     <enumeration value="packer storm valve RTTS"/>
 *     <enumeration value="stabilizer string"/>
 *     <enumeration value="surface pipe"/>
 *     <enumeration value="taper tap"/>
 *     <enumeration value="taper tap LH"/>
 *     <enumeration value="tubing-conveyed perforating gun"/>
 *     <enumeration value="thruster"/>
 *     <enumeration value="tieback polished bore receptacle"/>
 *     <enumeration value="tieback stinger"/>
 *     <enumeration value="tubing"/>
 *     <enumeration value="hanger tubing"/>
 *     <enumeration value="turbine"/>
 *     <enumeration value="bit under reamer"/>
 *     <enumeration value="stabilizer variable blade"/>
 *     <enumeration value="washover pipe"/>
 *     <enumeration value="mill watermelon"/>
 *     <enumeration value="whipstock"/>
 *     <enumeration value="whipstock anchor"/>
 *     <enumeration value="stabilizer turbo back"/>
 *     <enumeration value="stabilizer inline"/>
 *     <enumeration value="stabilizer steerable"/>
 *     <enumeration value="sub-stop"/>
 *     <enumeration value="sub-filter"/>
 *     <enumeration value="mill casing cutting"/>
 *     <enumeration value="reamer"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "TubularComponent")
@XmlEnum
public enum TubularComponent {

    @XmlEnumValue("non-magnetic stabilizer")
    NON_MAGNETIC_STABILIZER("non-magnetic stabilizer"),

    /**
     * Drill colllar made from non-magnetic material. 
     * 					Used to avoid magnetic interference with downhole directional 
     * 					measurements.
     * 
     */
    @XmlEnumValue("non-magnetic collar")
    NON_MAGNETIC_COLLAR("non-magnetic collar"),

    /**
     * Drill string component with blades that help 
     * 					keep the drill string away from the sides of the hole.
     * 
     */
    @XmlEnumValue("stabilizer")
    STABILIZER("stabilizer"),

    /**
     * A sub that is used with a downhole motor to
     * 					change the direction of the wellbore. It can be adjusted to give 
     * 					a variable angle of deviation.
     * 
     */
    @XmlEnumValue("adjustable kickoff")
    ADJUSTABLE_KICKOFF("adjustable kickoff"),

    /**
     * A downhole tool used in conjunction with a jar
     * 					that stores energy for rapid release when the jar is fired. 
     * 					Depending on the operating mode, the energy in tension or 
     * 					compression is stored by means of a mechanical spring or 
     * 					compressible fluid such as nitrogen gas.
     * 
     */
    @XmlEnumValue("accelerator")
    ACCELERATOR("accelerator"),

    /**
     * A downhole tool that can steer the progress of
     * 					the bit by applying forces to the 
     * 					sides of the hole while drilling with rotating pipe.
     * 
     */
    @XmlEnumValue("rotary steering tool")
    ROTARY_STEERING_TOOL("rotary steering tool"),
    @XmlEnumValue("sub-bar catcher")
    SUB_BAR_CATCHER("sub-bar catcher"),

    /**
     * A drill string component that has a fixed bend angle. Used in
     * 					conjunction with a downhole motor for deviating the wellbore.
     * 
     */
    @XmlEnumValue("sub-bent")
    SUB_BENT("sub-bent"),

    /**
     * A diamond tipped drill bit used for coring
     * 
     */
    @XmlEnumValue("bit core diamond")
    BIT_CORE_DIAMOND("bit core diamond"),

    /**
     * Polycrystalline diamond compact core bit.
     * 
     */
    @XmlEnumValue("bit core PDC")
    BIT_CORE_PDC("bit core PDC"),

    /**
     * Drill bit with cutters containing diamonds.
     * 
     */
    @XmlEnumValue("bit diamond fixed cut")
    BIT_DIAMOND_FIXED_CUT("bit diamond fixed cut"),

    /**
     * Roller cone bit with cutters made from tungsten carbide or other 
     * 					wear resistant material.
     * 
     */
    @XmlEnumValue("bit insert roller cone")
    BIT_INSERT_ROLLER_CONE("bit insert roller cone"),

    /**
     * Roller cone drill bit with steel teeth.
     * 
     */
    @XmlEnumValue("bit mill tooth roller cone")
    BIT_MILL_TOOTH_ROLLER_CONE("bit mill tooth roller cone"),

    /**
     * Polycrystalline diamond compact drill bit.
     * 
     */
    @XmlEnumValue("bit PDC fixed cutter")
    BIT_PDC_FIXED_CUTTER("bit PDC fixed cutter"),

    /**
     * Drill string component used to connect the drill bit to the rest of 
     * 					the string.
     * 
     */
    @XmlEnumValue("sub-bit")
    SUB_BIT("sub-bit"),

    /**
     * A downhole tool that is located and set to isolate the lower part of 
     * 					the wellbore.
     * 
     */
    @XmlEnumValue("bridge plug")
    BRIDGE_PLUG("bridge plug"),

    /**
     * A blank end component substituting for a bit, when re entering 
     * 					an already existing hole to guide the BHA, to avoid inadvertent sidetracks, 
     * 					such as when run below a hole opener in an existing hole.
     * 
     */
    @XmlEnumValue("bullnose")
    BULLNOSE("bullnose"),

    /**
     * A solid plug used as an isolation device in piping 
     * 					systems, conduits or wellbore tubulars.
     * 
     */
    @XmlEnumValue("bull plug")
    BULL_PLUG("bull plug"),

    /**
     * A spring loaded component used to minimize variations in weight
     * 					transfer to the drill bit.
     * 
     */
    @XmlEnumValue("sub-bumper")
    SUB_BUMPER("sub-bumper"),

    /**
     * Tubing used to line the wellbore and protect against pressure
     * 					differences between the wellbore fluids and the formation.
     * 
     */
    @XmlEnumValue("casing")
    CASING("casing"),

    /**
     * Tool used for cutting through casing.
     * 
     */
    @XmlEnumValue("casing cutter")
    CASING_CUTTER("casing cutter"),

    /**
     * Component used to hang a casing string from the well head
     * 					at the sea bed.
     * 
     */
    @XmlEnumValue("hanger casing subsea")
    HANGER_CASING_SUBSEA("hanger casing subsea"),

    /**
     * Component used to hang casing from a surface location on land or a
     * 					fixed platform.
     * 
     */
    @XmlEnumValue("hanger casing surface")
    HANGER_CASING_SURFACE("hanger casing surface"),

    /**
     * The adapter between the first casing string and either the BOP stack 
     * 					(during drilling) or the wellhead (after completion).
     * 
     */
    @XmlEnumValue("casing head")
    CASING_HEAD("casing head"),
    @XmlEnumValue("catch assembly")
    CATCH_ASSEMBLY("catch assembly"),
    @XmlEnumValue("sub-catcher")
    SUB_CATCHER("sub-catcher"),

    /**
     * Component used to allow venting part of the drilling fluids 
     * 					into the annulus rather than through the bit.
     * 
     */
    @XmlEnumValue("sub-circulation")
    SUB_CIRCULATION("sub-circulation"),

    /**
     * Section of coiled tubing that is inside the wellbore.
     * 
     */
    @XmlEnumValue("coiled tubing in hole")
    COILED_TUBING_IN_HOLE("coiled tubing in hole"),

    /**
     * Section of coiled tubing that is on the coil.
     * 
     */
    @XmlEnumValue("coiled tubing on coil")
    COILED_TUBING_ON_COIL("coiled tubing on coil"),

    /**
     * Strengthened drill pipe.
     * 
     */
    @XmlEnumValue("drill pipe compressive")
    DRILL_PIPE_COMPRESSIVE("drill pipe compressive"),
    @XmlEnumValue("sub-cone")
    SUB_CONE("sub-cone"),

    /**
     * Tool used with a coring bit to retrieve geological core samples.
     * 
     */
    @XmlEnumValue("core barrel")
    CORE_BARREL("core barrel"),

    /**
     * Core barrel used to sample geological cores at a know orientation.
     * 
     */
    @XmlEnumValue("core orientation barrel")
    CORE_ORIENTATION_BARREL("core orientation barrel"),

    /**
     * Sub used to convert from one thread type or size to another.
     * 
     */
    @XmlEnumValue("sub-crossover")
    SUB_CROSSOVER("sub-crossover"),

    /**
     * Component used to convert between casing threads and/or sizes.
     * 
     */
    @XmlEnumValue("casing crossover")
    CASING_CROSSOVER("casing crossover"),

    /**
     * A sub that controls activation of tools by means of dropping a dart down the 
     * 					drillstring.
     * 
     */
    @XmlEnumValue("sub-dart")
    SUB_DART("sub-dart"),
    @XmlEnumValue("die collar")
    DIE_COLLAR("die collar"),

    /**
     * Die collar with left-handed  thread.
     * 
     */
    @XmlEnumValue("die collar LH")
    DIE_COLLAR_LH("die collar LH"),

    /**
     * A tool that permits control of the drilling direction.
     * 
     */
    @XmlEnumValue("directional guidance system")
    DIRECTIONAL_GUIDANCE_SYSTEM("directional guidance system"),

    /**
     * Heavy pipe without tool joints used to apply weight to the bit.
     * 
     */
    @XmlEnumValue("drill collar")
    DRILL_COLLAR("drill collar"),

    /**
     * Pipe used to convey the drilling assembly to the bottom of the hole.
     * 
     */
    @XmlEnumValue("drill pipe")
    DRILL_PIPE("drill pipe"),

    /**
     * Left-handed thread drill pipe
     * 
     */
    @XmlEnumValue("drill pipe LH")
    DRILL_PIPE_LH("drill pipe LH"),

    /**
     * Bottom Hole Assembly for drill stem testing
     * 
     */
    @XmlEnumValue("drill stem test BHA")
    DRILL_STEM_TEST_BHA("drill stem test BHA"),

    /**
     * Pipe that is driven into the ground or sea bed to start drilling a well.
     * 
     */
    @XmlEnumValue("drive pipe")
    DRIVE_PIPE("drive pipe"),
    @XmlEnumValue("dual catch assembly")
    DUAL_CATCH_ASSEMBLY("dual catch assembly"),

    /**
     * A type of overshot tool used in fishing stuck pipe.
     * 
     */
    @XmlEnumValue("extension bowl overshot")
    EXTENSION_BOWL_OVERSHOT("extension bowl overshot"),

    /**
     * A type of overshot tool used in fishing stuck pipe.
     * 
     */
    @XmlEnumValue("extension sub-overshot")
    EXTENSION_SUB_OVERSHOT("extension sub-overshot"),

    /**
     * A short length of casing fitted with a check valve. Prevents
     * 					fluids from flowing back up the tubular string.
     * 
     */
    @XmlEnumValue("float collar")
    FLOAT_COLLAR("float collar"),

    /**
     * A tapered, often bullet-nosed device fitted with a check valve and typically found 
     * 					at the bottom of a casing string. 
     * 
     */
    @XmlEnumValue("float shoe")
    FLOAT_SHOE("float shoe"),

    /**
     * A valve, plunger or flapper, run in a drill collar to prevent 
     * 					fluid flow and debris into the string while running in hole. Sometime ported 
     * 					with a small leak path to allow shut in drillpipe pressure readings.
     * 
     */
    @XmlEnumValue("sub-float")
    SUB_FLOAT("sub-float"),
    @XmlEnumValue("flow head")
    FLOW_HEAD("flow head"),

    /**
     * A tapered, often bullet-nosed piece of equipment often found on the bottom of 
     * 					a casing string. Helps to guide the casing down the center of the hole when a casing string
     * 					is being run into the hole.
     * 
     */
    @XmlEnumValue("guide shoe")
    GUIDE_SHOE("guide shoe"),

    /**
     * Component used for hanging the Measurement While Drilling tool.
     * 
     */
    @XmlEnumValue("MWD hang off sub")
    MWD_HANG_OFF_SUB("MWD hang off sub"),

    /**
     * A type of drillpipe whose walls are thicker and collars are longer than 
     * 					conventional drillpipe.
     * 
     */
    @XmlEnumValue("heavy weight drill pipe")
    HEAVY_WEIGHT_DRILL_PIPE("heavy weight drill pipe"),

    /**
     * Left-handed thread heavy weight drill pipe.
     * 
     */
    @XmlEnumValue("heavy weight drill pipe LH")
    HEAVY_WEIGHT_DRILL_PIPE_LH("heavy weight drill pipe LH"),

    /**
     * Marine riser used for deep water or high pressure applications
     * 
     */
    @XmlEnumValue("riser high pressure")
    RISER_HIGH_PRESSURE("riser high pressure"),

    /**
     * Drill bit used for enlarging the hole.
     * 
     */
    @XmlEnumValue("bit hole opener")
    BIT_HOLE_OPENER("bit hole opener"),

    /**
     * Expandable device used for packing off or isolating a section of wellbore
     * 					used for performing well pressure tests.
     * 
     */
    @XmlEnumValue("casing inflatable packer")
    CASING_INFLATABLE_PACKER("casing inflatable packer"),

    /**
     * Downhole mud motor that can also take measurements of downhole drilling
     * 					parameters.
     * 
     */
    @XmlEnumValue("motor instrumented")
    MOTOR_INSTRUMENTED("motor instrumented"),

    /**
     * Hydraulic or spring-loaded component used to free stuck pipe.
     * 
     */
    @XmlEnumValue("jar")
    JAR("jar"),
    @XmlEnumValue("sub-jetting")
    SUB_JETTING("sub-jetting"),

    /**
     * Component used to collect debris from the bottom of the hole.
     * 
     */
    @XmlEnumValue("junk basket")
    JUNK_BASKET("junk basket"),

    /**
     * Component used to collect debris from the bottom of the hole when 
     * 					reverse circulating
     * 
     */
    @XmlEnumValue("junk basket reverse circulation")
    JUNK_BASKET_REVERSE_CIRCULATION("junk basket reverse circulation"),

    /**
     * Component used to collect debris from the bottom of the hole.
     * 
     */
    @XmlEnumValue("sub-junk")
    SUB_JUNK("sub-junk"),

    /**
     * Hexagonal or square pipe used to rotate the drill string from the rig floor.
     * 
     */
    @XmlEnumValue("kelly")
    KELLY("kelly"),

    /**
     * Tool used to open out narrow sections of open hole caused by pipe
     * 					friction in tight radius bends.
     * 
     */
    @XmlEnumValue("keyseat wiper tool")
    KEYSEAT_WIPER_TOOL("keyseat wiper tool"),

    /**
     * A component installed near the bottom of the casing string on which the cement plugs land 
     * 					during the primary cementing operation.
     * 
     */
    @XmlEnumValue("landing float collar")
    LANDING_FLOAT_COLLAR("landing float collar"),

    /**
     * Tool run on pipe or wireline to engage the top of a fish, and 
     * 					enable the condition of the exposed end of the fish to be ascertained from 
     * 					the pattern in soft lead in the tool.
     * 
     */
    @XmlEnumValue("lead impression block")
    LEAD_IMPRESSION_BLOCK("lead impression block"),

    /**
     * Casing or tubing that is hung from the inside of existing casing 
     * 					rather than from the sea bed or surface.
     * 
     */
    @XmlEnumValue("liner")
    LINER("liner"),

    /**
     * Component that is used to hang liner from inside casing.
     * 
     */
    @XmlEnumValue("hanger liner")
    HANGER_LINER("hanger liner"),

    /**
     * Magnet used to retrieve magnetic debris from the hole.
     * 
     */
    @XmlEnumValue("magnet")
    MAGNET("magnet"),

    /**
     * Large diameter pipe that connects from the sea bed to an offshore rig.
     * 
     */
    @XmlEnumValue("riser marine")
    RISER_MARINE("riser marine"),

    /**
     * Milling tool used to dress or clean up pipe that is to be retrieved from the hole.
     * 
     */
    @XmlEnumValue("mill dress")
    MILL_DRESS("mill dress"),

    /**
     * Flat bottomed milling tool, used to tidy up the broken end of pipe
     * 					stuck in the hole prior to fishing.
     * 
     */
    @XmlEnumValue("mill flat bottom")
    MILL_FLAT_BOTTOM("mill flat bottom"),

    /**
     * Hollow milling tool
     * 
     */
    @XmlEnumValue("mill hollow")
    MILL_HOLLOW("mill hollow"),
    @XmlEnumValue("mill polish")
    MILL_POLISH("mill polish"),
    @XmlEnumValue("mill section")
    MILL_SECTION("mill section"),

    /**
     * Tapered milling tool.
     * 
     */
    @XmlEnumValue("mill taper")
    MILL_TAPER("mill taper"),

    /**
     * Large diameter milling tool that goes over the end of stuck pipe.
     * 
     */
    @XmlEnumValue("mill washover")
    MILL_WASHOVER("mill washover"),
    @XmlEnumValue("mill packer picker assembly")
    MILL_PACKER_PICKER_ASSEMBLY("mill packer picker assembly"),
    @XmlEnumValue("millout extension")
    MILLOUT_EXTENSION("millout extension"),

    /**
     * Tool used to hang casing in multi-lateral wellbores.
     * 
     */
    @XmlEnumValue("multilateral hanger running tool")
    MULTILATERAL_HANGER_RUNNING_TOOL("multilateral hanger running tool"),
    @XmlEnumValue("hanger mud line")
    HANGER_MUD_LINE("hanger mud line"),

    /**
     * Downhole tool, usually powered by fluid flow, that rotates the drill bit.
     * 
     */
    @XmlEnumValue("motor")
    MOTOR("motor"),
    @XmlEnumValue("mule shoe")
    MULE_SHOE("mule shoe"),

    /**
     * Tool that can take downhole measurements of formation properties and wellbore direction 
     * 					while drilling.
     * 
     */
    @XmlEnumValue("logging while drilling tool")
    LOGGING_WHILE_DRILLING_TOOL("logging while drilling tool"),

    /**
     * Stabilizer that is placed close to the bit
     * 
     */
    @XmlEnumValue("stabilizer near bit roller reamer")
    STABILIZER_NEAR_BIT_ROLLER_REAMER("stabilizer near bit roller reamer"),

    /**
     * Stabilizer placed near the bit to provide directional control.
     * 
     */
    @XmlEnumValue("stabilizer near bit")
    STABILIZER_NEAR_BIT("stabilizer near bit"),

    /**
     * Stabilizer that does not rotate with the drill string.
     * 
     */
    @XmlEnumValue("stabilizer non-rotating")
    STABILIZER_NON_ROTATING("stabilizer non-rotating"),

    /**
     * Sub used to orient the drill string for directionla drilling.
     * 
     */
    @XmlEnumValue("sub-orienting")
    SUB_ORIENTING("sub-orienting"),
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * Tool used for retrieving pipe that has been lost in the hole.
     * 
     */
    @XmlEnumValue("overshot")
    OVERSHOT("overshot"),

    /**
     * Left-handed overshot tool.
     * 
     */
    @XmlEnumValue("overshot LH")
    OVERSHOT_LH("overshot LH"),

    /**
     * Specific type of overshot tool used for fishing.
     * 
     */
    @XmlEnumValue("oversize lip guide overshot")
    OVERSIZE_LIP_GUIDE_OVERSHOT("oversize lip guide overshot"),

    /**
     * Component that can be inflated so that it seals off a section of the 
     * 					wellbore, typically for formation testing.
     * 
     */
    @XmlEnumValue("packer")
    PACKER("packer"),
    @XmlEnumValue("polished bore receptacle")
    POLISHED_BORE_RECEPTACLE("polished bore receptacle"),

    /**
     * Milling tool used in fishing stuck pipe.
     * 
     */
    @XmlEnumValue("mill pilot")
    MILL_PILOT("mill pilot"),

    /**
     * Tool for cutting through pipe that has become stuck in the hole.
     * 
     */
    @XmlEnumValue("pipe cutter")
    PIPE_CUTTER("pipe cutter"),
    @XmlEnumValue("ported stinger")
    PORTED_STINGER("ported stinger"),

    /**
     * Component with a port or vent tha allows mud to be circulated into the
     * 					annulus.
     * 
     */
    @XmlEnumValue("sub-ported")
    SUB_PORTED("sub-ported"),

    /**
     * A type of screen used in sand control applications to support the gravel pack. 
     * 
     */
    @XmlEnumValue("prepacked screens")
    PREPACKED_SCREENS("prepacked screens"),

    /**
     * Component used to relieve wellbore pressures.
     * 
     */
    @XmlEnumValue("sub-pressure relief")
    SUB_PRESSURE_RELIEF("sub-pressure relief"),

    /**
     * Riser pipe used to carry produced fluids.
     * 
     */
    @XmlEnumValue("riser production")
    RISER_PRODUCTION("riser production"),

    /**
     * Measurement While Drilling component that send encodes downhole data into
     * 					hydraulic pulses that can be detected and decoded at the surface.
     * 
     */
    @XmlEnumValue("MWD pulser")
    MWD_PULSER("MWD pulser"),
    @XmlEnumValue("sub-pump out")
    SUB_PUMP_OUT("sub-pump out"),

    /**
     * Component that provides a restriction to mud flow to control 
     * 					hydraulics.
     * 
     */
    @XmlEnumValue("sub-restrictor")
    SUB_RESTRICTOR("sub-restrictor"),

    /**
     * Torque Transmission
     * 
     */
    @XmlEnumValue("packer retrieve TT squeeze")
    PACKER_RETRIEVE_TT_SQUEEZE("packer retrieve TT squeeze"),

    /**
     * A downhole tool that is designed to enable communication between the 
     * 					tubing internal diameter and the annulus, typically for reverse-circulation purposes
     * 					
     * 
     */
    @XmlEnumValue("reversing tool")
    REVERSING_TOOL("reversing tool"),

    /**
     * A stabilizer that has rotating rollers rather than fixed blades 
     * 					to reduce friction with the sides of the hole.
     * 
     */
    @XmlEnumValue("stabilizer string roller reamer")
    STABILIZER_STRING_ROLLER_REAMER("stabilizer string roller reamer"),

    /**
     * Retrievable packer, designed for testing, treating, and squeezing.
     * 
     */
    @XmlEnumValue("packer RTTS")
    PACKER_RTTS("packer RTTS"),
    @XmlEnumValue("running tool")
    RUNNING_TOOL("running tool"),

    /**
     * A weak spot in the drillstring so that if tension in the drillstring exceeds a 
     * 					predetermined amount, the safety joint will part and the rest of the drillstring will be salvageable.
     * 					
     * 
     */
    @XmlEnumValue("safety joint")
    SAFETY_JOINT("safety joint"),

    /**
     * Left-handed threaded safety joint providing a 
     * 					weak spot in the drillstring so that if tension in the drillstring exceeds a 
     * 					predetermined amount, the safety joint will part and the rest of the drillstring 
     * 					will be salvageable.
     * 
     */
    @XmlEnumValue("safety joint LH")
    SAFETY_JOINT_LH("safety joint LH"),

    /**
     * Component used to reduce wear on the threads of components such as drill bits
     * 					that are often re-used.
     * 
     */
    @XmlEnumValue("sub-saver")
    SUB_SAVER("sub-saver"),
    @XmlEnumValue("scab liner bit guide")
    SCAB_LINER_BIT_GUIDE("scab liner bit guide"),
    @XmlEnumValue("scraper")
    SCRAPER("scraper"),

    /**
     * A device for cleaning mud and mud filter cake off of the wellbore 
     * 					wall when cementing casing in the hole to ensure good contact and bonding between the 
     * 					cement and the wellbore wall.
     * 
     */
    @XmlEnumValue("scratchers")
    SCRATCHERS("scratchers"),

    /**
     * Screw-in casing shoe.
     * 
     */
    @XmlEnumValue("casing shoe screw-in")
    CASING_SHOE_SCREW_IN("casing shoe screw-in"),
    @XmlEnumValue("sub-shock")
    SUB_SHOCK("sub-shock"),

    /**
     * Short drill collar used to adjust the length and spacing of BHA components.
     * 
     */
    @XmlEnumValue("drill collar short")
    DRILL_COLLAR_SHORT("drill collar short"),
    @XmlEnumValue("sub-side entry")
    SUB_SIDE_ENTRY("sub-side entry"),

    /**
     * Liner casing that has slots to allow passage of produced fluids.
     * 
     */
    @XmlEnumValue("slotted liner")
    SLOTTED_LINER("slotted liner"),

    /**
     * Fishing tool that attaches to the inside of the stuck pipe by threads or grapples.
     * 
     */
    @XmlEnumValue("spear")
    SPEAR("spear"),
    @XmlEnumValue("stage cement collar")
    STAGE_CEMENT_COLLAR("stage cement collar"),

    /**
     * Downhole motor, usually powered by mud flow, that can be steered.
     * 
     */
    @XmlEnumValue("motor steerable")
    MOTOR_STEERABLE("motor steerable"),

    /**
     * Retrievable packer, designed for testing, treating, and squeezing.
     * 
     */
    @XmlEnumValue("packer storm valve RTTS")
    PACKER_STORM_VALVE_RTTS("packer storm valve RTTS"),
    @XmlEnumValue("stabilizer string")
    STABILIZER_STRING("stabilizer string"),

    /**
     * Pipework that connects the top of the drillstring to the mud pumps.
     * 
     */
    @XmlEnumValue("surface pipe")
    SURFACE_PIPE("surface pipe"),

    /**
     * Tool used to tap a thread into components that are stuck in the hole.
     * 
     */
    @XmlEnumValue("taper tap")
    TAPER_TAP("taper tap"),

    /**
     * Left-handed thread tapping tool.
     * 
     */
    @XmlEnumValue("taper tap LH")
    TAPER_TAP_LH("taper tap LH"),

    /**
     * Perforating gun that is deployed on the end of a tubular string rather
     * 					than a wireline
     * 
     */
    @XmlEnumValue("tubing-conveyed perforating gun")
    TUBING_CONVEYED_PERFORATING_GUN("tubing-conveyed perforating gun"),

    /**
     * Drilling tool used to maintain weight on bit.
     * 
     */
    @XmlEnumValue("thruster")
    THRUSTER("thruster"),
    @XmlEnumValue("tieback polished bore receptacle")
    TIEBACK_POLISHED_BORE_RECEPTACLE("tieback polished bore receptacle"),

    /**
     * Tool used to position a tie-back string of tubing connecting
     * 					a liner to the surface.
     * 
     */
    @XmlEnumValue("tieback stinger")
    TIEBACK_STINGER("tieback stinger"),

    /**
     * Small diameter pipe that is run inside casing or tubing as
     * 					part of the well completion.
     * 
     */
    @XmlEnumValue("tubing")
    TUBING("tubing"),

    /**
     * Component used to hang tubing inside casing or liner.
     * 
     */
    @XmlEnumValue("hanger tubing")
    HANGER_TUBING("hanger tubing"),

    /**
     * Downhole device used for directional drilling, powered by 
     * 					mud circulation that rotates the drill
     * 					bit while the drill string remains non-rotating
     * 
     */
    @XmlEnumValue("turbine")
    TURBINE("turbine"),

    /**
     * Component that is run behind the bit and opens out the hole to
     * 					a larger diameter.
     * 
     */
    @XmlEnumValue("bit under reamer")
    BIT_UNDER_REAMER("bit under reamer"),

    /**
     * Stabilizer with blades that can be adjusted to varying diameters.
     * 
     */
    @XmlEnumValue("stabilizer variable blade")
    STABILIZER_VARIABLE_BLADE("stabilizer variable blade"),

    /**
     * Large diameter pipe with an internal grapple used for retrieving 
     * 					stuch pipe.
     * 
     */
    @XmlEnumValue("washover pipe")
    WASHOVER_PIPE("washover pipe"),

    /**
     * Milling tool shaped like a watermelon.
     * 
     */
    @XmlEnumValue("mill watermelon")
    MILL_WATERMELON("mill watermelon"),

    /**
     * Wedge shaped tool used to drill off in a different direction.
     * 
     */
    @XmlEnumValue("whipstock")
    WHIPSTOCK("whipstock"),

    /**
     * Anchor device used to position whipstock.
     * 
     */
    @XmlEnumValue("whipstock anchor")
    WHIPSTOCK_ANCHOR("whipstock anchor"),
    @XmlEnumValue("stabilizer turbo back")
    STABILIZER_TURBO_BACK("stabilizer turbo back"),
    @XmlEnumValue("stabilizer inline")
    STABILIZER_INLINE("stabilizer inline"),

    /**
     * Stabilizer with adjustable blades to allow steering the 
     * 					drilling direction.
     * 
     */
    @XmlEnumValue("stabilizer steerable")
    STABILIZER_STEERABLE("stabilizer steerable"),
    @XmlEnumValue("sub-stop")
    SUB_STOP("sub-stop"),
    @XmlEnumValue("sub-filter")
    SUB_FILTER("sub-filter"),

    /**
     * Milling tool used for cutting through casing.
     * 
     */
    @XmlEnumValue("mill casing cutting")
    MILL_CASING_CUTTING("mill casing cutting"),

    /**
     * Tool used to enlarge the hole.
     * 
     */
    @XmlEnumValue("reamer")
    REAMER("reamer"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TubularComponent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TubularComponent fromValue(String v) {
        for (TubularComponent c: TubularComponent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
