


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LithologyQualifierKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LithologyQualifierKind">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="alkali feldspar rhyolite"/>
 *     <enumeration value="alkali olivine basalt"/>
 *     <enumeration value="amphibolite"/>
 *     <enumeration value="amphibolitic"/>
 *     <enumeration value="andesite"/>
 *     <enumeration value="andesitic"/>
 *     <enumeration value="anhydrite"/>
 *     <enumeration value="anhydritic"/>
 *     <enumeration value="ankerite"/>
 *     <enumeration value="ankeritic"/>
 *     <enumeration value="anorthositic rock"/>
 *     <enumeration value="anthracite"/>
 *     <enumeration value="anthracitic"/>
 *     <enumeration value="aplite"/>
 *     <enumeration value="aplitic"/>
 *     <enumeration value="arenite"/>
 *     <enumeration value="arenitic"/>
 *     <enumeration value="argillaceous"/>
 *     <enumeration value="arkose"/>
 *     <enumeration value="arkosic"/>
 *     <enumeration value="barite"/>
 *     <enumeration value="baritic"/>
 *     <enumeration value="basalt"/>
 *     <enumeration value="basaltic"/>
 *     <enumeration value="basanite"/>
 *     <enumeration value="basanitic"/>
 *     <enumeration value="bauxite"/>
 *     <enumeration value="bauxitic"/>
 *     <enumeration value="belemnites"/>
 *     <enumeration value="belemnitic"/>
 *     <enumeration value="bioturbated"/>
 *     <enumeration value="bioturbation"/>
 *     <enumeration value="bitumen"/>
 *     <enumeration value="bituminous"/>
 *     <enumeration value="bituminous coal"/>
 *     <enumeration value="blueschist metamorphic rock"/>
 *     <enumeration value="boninite"/>
 *     <enumeration value="breccia"/>
 *     <enumeration value="brecciated"/>
 *     <enumeration value="bryozoan"/>
 *     <enumeration value="bryozoans"/>
 *     <enumeration value="burrowed"/>
 *     <enumeration value="burrows"/>
 *     <enumeration value="calcareous"/>
 *     <enumeration value="calcite"/>
 *     <enumeration value="calcite concretion"/>
 *     <enumeration value="calcitic"/>
 *     <enumeration value="carbonaceous"/>
 *     <enumeration value="carbonate ooze"/>
 *     <enumeration value="carbonatite"/>
 *     <enumeration value="carbonatitic"/>
 *     <enumeration value="chalk"/>
 *     <enumeration value="chalky"/>
 *     <enumeration value="chamosite"/>
 *     <enumeration value="chamositic"/>
 *     <enumeration value="chert"/>
 *     <enumeration value="cherty"/>
 *     <enumeration value="chlorite"/>
 *     <enumeration value="chloritic"/>
 *     <enumeration value="clay"/>
 *     <enumeration value="claystone"/>
 *     <enumeration value="coal"/>
 *     <enumeration value="concretionary"/>
 *     <enumeration value="concretions"/>
 *     <enumeration value="conglomerate"/>
 *     <enumeration value="conglomeratic"/>
 *     <enumeration value="coral fragments"/>
 *     <enumeration value="coralline"/>
 *     <enumeration value="crinoidal"/>
 *     <enumeration value="crinoids"/>
 *     <enumeration value="dacite"/>
 *     <enumeration value="dacitic"/>
 *     <enumeration value="diabase"/>
 *     <enumeration value="diabasic"/>
 *     <enumeration value="diamictite"/>
 *     <enumeration value="diamictitic"/>
 *     <enumeration value="diatomaceous"/>
 *     <enumeration value="diatoms"/>
 *     <enumeration value="diorite"/>
 *     <enumeration value="dioritic"/>
 *     <enumeration value="dioritoid"/>
 *     <enumeration value="dioritoidic"/>
 *     <enumeration value="doleritic rock"/>
 *     <enumeration value="dolomite"/>
 *     <enumeration value="dolomite concretion"/>
 *     <enumeration value="dolomite stringer"/>
 *     <enumeration value="dolomitic"/>
 *     <enumeration value="eclogite"/>
 *     <enumeration value="eclogitic"/>
 *     <enumeration value="exotic alkaline rock"/>
 *     <enumeration value="feldspar"/>
 *     <enumeration value="feldsparic"/>
 *     <enumeration value="feldspathic"/>
 *     <enumeration value="feldspathic arenite"/>
 *     <enumeration value="ferruginous"/>
 *     <enumeration value="fine grained igneous rock"/>
 *     <enumeration value="foid dioritoid"/>
 *     <enumeration value="foid gabbroid"/>
 *     <enumeration value="foid syenitoid"/>
 *     <enumeration value="foidite"/>
 *     <enumeration value="foiditic"/>
 *     <enumeration value="foiditoid"/>
 *     <enumeration value="foidolite"/>
 *     <enumeration value="foidolitic"/>
 *     <enumeration value="foliated metamorphic rock"/>
 *     <enumeration value="foraminifera"/>
 *     <enumeration value="foraminiferous"/>
 *     <enumeration value="forams"/>
 *     <enumeration value="fossil fragments"/>
 *     <enumeration value="fossiliferous"/>
 *     <enumeration value="fossils undifferentiated"/>
 *     <enumeration value="fragmental igneous rock"/>
 *     <enumeration value="gabbro"/>
 *     <enumeration value="gabbroic"/>
 *     <enumeration value="gabbroic rock"/>
 *     <enumeration value="gabbroid"/>
 *     <enumeration value="gabbroidic"/>
 *     <enumeration value="gilsonite"/>
 *     <enumeration value="gilsonitic"/>
 *     <enumeration value="glauconite"/>
 *     <enumeration value="glauconitic"/>
 *     <enumeration value="gneiss"/>
 *     <enumeration value="gneissic"/>
 *     <enumeration value="granite"/>
 *     <enumeration value="granitic"/>
 *     <enumeration value="granodiorite"/>
 *     <enumeration value="granodioritic"/>
 *     <enumeration value="granofels"/>
 *     <enumeration value="granulite"/>
 *     <enumeration value="granulitic"/>
 *     <enumeration value="gravel"/>
 *     <enumeration value="gravelly"/>
 *     <enumeration value="greenstone"/>
 *     <enumeration value="gumbo"/>
 *     <enumeration value="gypsiferous"/>
 *     <enumeration value="gypsum"/>
 *     <enumeration value="halite"/>
 *     <enumeration value="halitic"/>
 *     <enumeration value="hornfels"/>
 *     <enumeration value="hornfelsic"/>
 *     <enumeration value="igneous"/>
 *     <enumeration value="igneous rock"/>
 *     <enumeration value="illite"/>
 *     <enumeration value="illitic"/>
 *     <enumeration value="impact generated material"/>
 *     <enumeration value="impure dolomite"/>
 *     <enumeration value="impure limestone"/>
 *     <enumeration value="intrusive rock (plutonic)"/>
 *     <enumeration value="iron rich sedimentary rock"/>
 *     <enumeration value="kalsilitic and melilitic rocks"/>
 *     <enumeration value="kaolinite"/>
 *     <enumeration value="kaolinitic"/>
 *     <enumeration value="komatiitic rock"/>
 *     <enumeration value="latitic rock"/>
 *     <enumeration value="lignite"/>
 *     <enumeration value="lignitic"/>
 *     <enumeration value="lime boundstone"/>
 *     <enumeration value="lime framestone"/>
 *     <enumeration value="lime grainstone"/>
 *     <enumeration value="lime mudstone"/>
 *     <enumeration value="lime packstone"/>
 *     <enumeration value="lime wackestone"/>
 *     <enumeration value="limestone"/>
 *     <enumeration value="limestone stringer"/>
 *     <enumeration value="lithic"/>
 *     <enumeration value="lithic fragments"/>
 *     <enumeration value="marble"/>
 *     <enumeration value="marcasite"/>
 *     <enumeration value="marcasitic"/>
 *     <enumeration value="marl"/>
 *     <enumeration value="marly"/>
 *     <enumeration value="metamorphic rock"/>
 *     <enumeration value="mica"/>
 *     <enumeration value="mica schist"/>
 *     <enumeration value="micaceous"/>
 *     <enumeration value="microfossiliferous"/>
 *     <enumeration value="microfossils"/>
 *     <enumeration value="migmatite"/>
 *     <enumeration value="migmatitic"/>
 *     <enumeration value="monzogabbro"/>
 *     <enumeration value="monzogabbroic"/>
 *     <enumeration value="mud"/>
 *     <enumeration value="muddy"/>
 *     <enumeration value="mudstone"/>
 *     <enumeration value="mylonitic rock"/>
 *     <enumeration value="no sample"/>
 *     <enumeration value="oncolite"/>
 *     <enumeration value="oncoliths"/>
 *     <enumeration value="oncolitic"/>
 *     <enumeration value="ooids"/>
 *     <enumeration value="ooliths"/>
 *     <enumeration value="oolitic"/>
 *     <enumeration value="ooze"/>
 *     <enumeration value="ophiolite"/>
 *     <enumeration value="ophiolitic"/>
 *     <enumeration value="organic bearing mudstone"/>
 *     <enumeration value="ostracodal"/>
 *     <enumeration value="ostracods"/>
 *     <enumeration value="peat"/>
 *     <enumeration value="peaty"/>
 *     <enumeration value="pebble"/>
 *     <enumeration value="pebbly"/>
 *     <enumeration value="pegmatite"/>
 *     <enumeration value="pegmatitic"/>
 *     <enumeration value="pelletal"/>
 *     <enumeration value="pellets"/>
 *     <enumeration value="peloidal"/>
 *     <enumeration value="peloids"/>
 *     <enumeration value="peridotite"/>
 *     <enumeration value="peridotitic"/>
 *     <enumeration value="phaneritic igneous rock"/>
 *     <enumeration value="phonolite"/>
 *     <enumeration value="phonolitic"/>
 *     <enumeration value="phonolitoid"/>
 *     <enumeration value="phosphate"/>
 *     <enumeration value="phosphate rock"/>
 *     <enumeration value="phosphatic"/>
 *     <enumeration value="phyllite"/>
 *     <enumeration value="phyllitic"/>
 *     <enumeration value="pisolite"/>
 *     <enumeration value="pisoliths"/>
 *     <enumeration value="pisolitic"/>
 *     <enumeration value="plant remains"/>
 *     <enumeration value="porphyritic"/>
 *     <enumeration value="porphyry"/>
 *     <enumeration value="potassium and magnesium salts"/>
 *     <enumeration value="pyrite"/>
 *     <enumeration value="pyritic"/>
 *     <enumeration value="pyroclastic breccia"/>
 *     <enumeration value="pyroclastic rock"/>
 *     <enumeration value="pyroxenite"/>
 *     <enumeration value="pyroxenitic"/>
 *     <enumeration value="quartiferous"/>
 *     <enumeration value="quartz"/>
 *     <enumeration value="quartz arenite"/>
 *     <enumeration value="quartzite"/>
 *     <enumeration value="quartzitic"/>
 *     <enumeration value="radiolaria"/>
 *     <enumeration value="radiolarian"/>
 *     <enumeration value="rhyolite"/>
 *     <enumeration value="rhyolitic"/>
 *     <enumeration value="rock salt"/>
 *     <enumeration value="rootlets"/>
 *     <enumeration value="salty"/>
 *     <enumeration value="sand"/>
 *     <enumeration value="sandstone"/>
 *     <enumeration value="sandy"/>
 *     <enumeration value="sapropel"/>
 *     <enumeration value="sapropelic"/>
 *     <enumeration value="schist"/>
 *     <enumeration value="schisty"/>
 *     <enumeration value="sepentinitic"/>
 *     <enumeration value="serpentinite"/>
 *     <enumeration value="shale"/>
 *     <enumeration value="shaly"/>
 *     <enumeration value="shell fragments"/>
 *     <enumeration value="shelly"/>
 *     <enumeration value="siderite"/>
 *     <enumeration value="siderite concretion"/>
 *     <enumeration value="sideritic"/>
 *     <enumeration value="siliceous ooze"/>
 *     <enumeration value="silt"/>
 *     <enumeration value="siltstone"/>
 *     <enumeration value="silty"/>
 *     <enumeration value="skarn"/>
 *     <enumeration value="skarny"/>
 *     <enumeration value="slate"/>
 *     <enumeration value="slaty"/>
 *     <enumeration value="smectite"/>
 *     <enumeration value="smectitic"/>
 *     <enumeration value="spicular"/>
 *     <enumeration value="spicules"/>
 *     <enumeration value="spilite"/>
 *     <enumeration value="spilitic"/>
 *     <enumeration value="stylolites"/>
 *     <enumeration value="stylolitic"/>
 *     <enumeration value="syenite"/>
 *     <enumeration value="syenitic"/>
 *     <enumeration value="syenitoid"/>
 *     <enumeration value="sylvite"/>
 *     <enumeration value="sylvitic"/>
 *     <enumeration value="tarry"/>
 *     <enumeration value="tephrite"/>
 *     <enumeration value="tephritic"/>
 *     <enumeration value="tephritoid"/>
 *     <enumeration value="tholeiitic basalt"/>
 *     <enumeration value="tonalite"/>
 *     <enumeration value="tonalitic"/>
 *     <enumeration value="trachyte"/>
 *     <enumeration value="trachytic"/>
 *     <enumeration value="trachytic rock"/>
 *     <enumeration value="trachytoid"/>
 *     <enumeration value="travertine"/>
 *     <enumeration value="tuff"/>
 *     <enumeration value="tuffaceous"/>
 *     <enumeration value="tuffite"/>
 *     <enumeration value="tuffitic"/>
 *     <enumeration value="ultrabasic"/>
 *     <enumeration value="undifferentiated"/>
 *     <enumeration value="unknown"/>
 *     <enumeration value="wacke"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LithologyQualifierKind")
@XmlEnum
public enum LithologyQualifierKind {

    @XmlEnumValue("alkali feldspar rhyolite")
    ALKALI_FELDSPAR_RHYOLITE("alkali feldspar rhyolite"),
    @XmlEnumValue("alkali olivine basalt")
    ALKALI_OLIVINE_BASALT("alkali olivine basalt"),
    @XmlEnumValue("amphibolite")
    AMPHIBOLITE("amphibolite"),
    @XmlEnumValue("amphibolitic")
    AMPHIBOLITIC("amphibolitic"),
    @XmlEnumValue("andesite")
    ANDESITE("andesite"),
    @XmlEnumValue("andesitic")
    ANDESITIC("andesitic"),
    @XmlEnumValue("anhydrite")
    ANHYDRITE("anhydrite"),
    @XmlEnumValue("anhydritic")
    ANHYDRITIC("anhydritic"),
    @XmlEnumValue("ankerite")
    ANKERITE("ankerite"),
    @XmlEnumValue("ankeritic")
    ANKERITIC("ankeritic"),
    @XmlEnumValue("anorthositic rock")
    ANORTHOSITIC_ROCK("anorthositic rock"),
    @XmlEnumValue("anthracite")
    ANTHRACITE("anthracite"),
    @XmlEnumValue("anthracitic")
    ANTHRACITIC("anthracitic"),
    @XmlEnumValue("aplite")
    APLITE("aplite"),
    @XmlEnumValue("aplitic")
    APLITIC("aplitic"),
    @XmlEnumValue("arenite")
    ARENITE("arenite"),
    @XmlEnumValue("arenitic")
    ARENITIC("arenitic"),
    @XmlEnumValue("argillaceous")
    ARGILLACEOUS("argillaceous"),
    @XmlEnumValue("arkose")
    ARKOSE("arkose"),
    @XmlEnumValue("arkosic")
    ARKOSIC("arkosic"),
    @XmlEnumValue("barite")
    BARITE("barite"),
    @XmlEnumValue("baritic")
    BARITIC("baritic"),
    @XmlEnumValue("basalt")
    BASALT("basalt"),
    @XmlEnumValue("basaltic")
    BASALTIC("basaltic"),
    @XmlEnumValue("basanite")
    BASANITE("basanite"),
    @XmlEnumValue("basanitic")
    BASANITIC("basanitic"),
    @XmlEnumValue("bauxite")
    BAUXITE("bauxite"),
    @XmlEnumValue("bauxitic")
    BAUXITIC("bauxitic"),
    @XmlEnumValue("belemnites")
    BELEMNITES("belemnites"),
    @XmlEnumValue("belemnitic")
    BELEMNITIC("belemnitic"),
    @XmlEnumValue("bioturbated")
    BIOTURBATED("bioturbated"),
    @XmlEnumValue("bioturbation")
    BIOTURBATION("bioturbation"),
    @XmlEnumValue("bitumen")
    BITUMEN("bitumen"),
    @XmlEnumValue("bituminous")
    BITUMINOUS("bituminous"),
    @XmlEnumValue("bituminous coal")
    BITUMINOUS_COAL("bituminous coal"),
    @XmlEnumValue("blueschist metamorphic rock")
    BLUESCHIST_METAMORPHIC_ROCK("blueschist metamorphic rock"),
    @XmlEnumValue("boninite")
    BONINITE("boninite"),
    @XmlEnumValue("breccia")
    BRECCIA("breccia"),
    @XmlEnumValue("brecciated")
    BRECCIATED("brecciated"),
    @XmlEnumValue("bryozoan")
    BRYOZOAN("bryozoan"),
    @XmlEnumValue("bryozoans")
    BRYOZOANS("bryozoans"),
    @XmlEnumValue("burrowed")
    BURROWED("burrowed"),
    @XmlEnumValue("burrows")
    BURROWS("burrows"),
    @XmlEnumValue("calcareous")
    CALCAREOUS("calcareous"),
    @XmlEnumValue("calcite")
    CALCITE("calcite"),
    @XmlEnumValue("calcite concretion")
    CALCITE_CONCRETION("calcite concretion"),
    @XmlEnumValue("calcitic")
    CALCITIC("calcitic"),
    @XmlEnumValue("carbonaceous")
    CARBONACEOUS("carbonaceous"),
    @XmlEnumValue("carbonate ooze")
    CARBONATE_OOZE("carbonate ooze"),
    @XmlEnumValue("carbonatite")
    CARBONATITE("carbonatite"),
    @XmlEnumValue("carbonatitic")
    CARBONATITIC("carbonatitic"),
    @XmlEnumValue("chalk")
    CHALK("chalk"),
    @XmlEnumValue("chalky")
    CHALKY("chalky"),
    @XmlEnumValue("chamosite")
    CHAMOSITE("chamosite"),
    @XmlEnumValue("chamositic")
    CHAMOSITIC("chamositic"),
    @XmlEnumValue("chert")
    CHERT("chert"),
    @XmlEnumValue("cherty")
    CHERTY("cherty"),
    @XmlEnumValue("chlorite")
    CHLORITE("chlorite"),
    @XmlEnumValue("chloritic")
    CHLORITIC("chloritic"),
    @XmlEnumValue("clay")
    CLAY("clay"),
    @XmlEnumValue("claystone")
    CLAYSTONE("claystone"),
    @XmlEnumValue("coal")
    COAL("coal"),
    @XmlEnumValue("concretionary")
    CONCRETIONARY("concretionary"),
    @XmlEnumValue("concretions")
    CONCRETIONS("concretions"),
    @XmlEnumValue("conglomerate")
    CONGLOMERATE("conglomerate"),
    @XmlEnumValue("conglomeratic")
    CONGLOMERATIC("conglomeratic"),
    @XmlEnumValue("coral fragments")
    CORAL_FRAGMENTS("coral fragments"),
    @XmlEnumValue("coralline")
    CORALLINE("coralline"),
    @XmlEnumValue("crinoidal")
    CRINOIDAL("crinoidal"),
    @XmlEnumValue("crinoids")
    CRINOIDS("crinoids"),
    @XmlEnumValue("dacite")
    DACITE("dacite"),
    @XmlEnumValue("dacitic")
    DACITIC("dacitic"),
    @XmlEnumValue("diabase")
    DIABASE("diabase"),
    @XmlEnumValue("diabasic")
    DIABASIC("diabasic"),
    @XmlEnumValue("diamictite")
    DIAMICTITE("diamictite"),
    @XmlEnumValue("diamictitic")
    DIAMICTITIC("diamictitic"),
    @XmlEnumValue("diatomaceous")
    DIATOMACEOUS("diatomaceous"),
    @XmlEnumValue("diatoms")
    DIATOMS("diatoms"),
    @XmlEnumValue("diorite")
    DIORITE("diorite"),
    @XmlEnumValue("dioritic")
    DIORITIC("dioritic"),
    @XmlEnumValue("dioritoid")
    DIORITOID("dioritoid"),
    @XmlEnumValue("dioritoidic")
    DIORITOIDIC("dioritoidic"),
    @XmlEnumValue("doleritic rock")
    DOLERITIC_ROCK("doleritic rock"),
    @XmlEnumValue("dolomite")
    DOLOMITE("dolomite"),
    @XmlEnumValue("dolomite concretion")
    DOLOMITE_CONCRETION("dolomite concretion"),
    @XmlEnumValue("dolomite stringer")
    DOLOMITE_STRINGER("dolomite stringer"),
    @XmlEnumValue("dolomitic")
    DOLOMITIC("dolomitic"),
    @XmlEnumValue("eclogite")
    ECLOGITE("eclogite"),
    @XmlEnumValue("eclogitic")
    ECLOGITIC("eclogitic"),
    @XmlEnumValue("exotic alkaline rock")
    EXOTIC_ALKALINE_ROCK("exotic alkaline rock"),
    @XmlEnumValue("feldspar")
    FELDSPAR("feldspar"),
    @XmlEnumValue("feldsparic")
    FELDSPARIC("feldsparic"),
    @XmlEnumValue("feldspathic")
    FELDSPATHIC("feldspathic"),
    @XmlEnumValue("feldspathic arenite")
    FELDSPATHIC_ARENITE("feldspathic arenite"),
    @XmlEnumValue("ferruginous")
    FERRUGINOUS("ferruginous"),
    @XmlEnumValue("fine grained igneous rock")
    FINE_GRAINED_IGNEOUS_ROCK("fine grained igneous rock"),
    @XmlEnumValue("foid dioritoid")
    FOID_DIORITOID("foid dioritoid"),
    @XmlEnumValue("foid gabbroid")
    FOID_GABBROID("foid gabbroid"),
    @XmlEnumValue("foid syenitoid")
    FOID_SYENITOID("foid syenitoid"),
    @XmlEnumValue("foidite")
    FOIDITE("foidite"),
    @XmlEnumValue("foiditic")
    FOIDITIC("foiditic"),
    @XmlEnumValue("foiditoid")
    FOIDITOID("foiditoid"),
    @XmlEnumValue("foidolite")
    FOIDOLITE("foidolite"),
    @XmlEnumValue("foidolitic")
    FOIDOLITIC("foidolitic"),
    @XmlEnumValue("foliated metamorphic rock")
    FOLIATED_METAMORPHIC_ROCK("foliated metamorphic rock"),
    @XmlEnumValue("foraminifera")
    FORAMINIFERA("foraminifera"),
    @XmlEnumValue("foraminiferous")
    FORAMINIFEROUS("foraminiferous"),
    @XmlEnumValue("forams")
    FORAMS("forams"),
    @XmlEnumValue("fossil fragments")
    FOSSIL_FRAGMENTS("fossil fragments"),
    @XmlEnumValue("fossiliferous")
    FOSSILIFEROUS("fossiliferous"),
    @XmlEnumValue("fossils undifferentiated")
    FOSSILS_UNDIFFERENTIATED("fossils undifferentiated"),
    @XmlEnumValue("fragmental igneous rock")
    FRAGMENTAL_IGNEOUS_ROCK("fragmental igneous rock"),
    @XmlEnumValue("gabbro")
    GABBRO("gabbro"),
    @XmlEnumValue("gabbroic")
    GABBROIC("gabbroic"),
    @XmlEnumValue("gabbroic rock")
    GABBROIC_ROCK("gabbroic rock"),
    @XmlEnumValue("gabbroid")
    GABBROID("gabbroid"),
    @XmlEnumValue("gabbroidic")
    GABBROIDIC("gabbroidic"),
    @XmlEnumValue("gilsonite")
    GILSONITE("gilsonite"),
    @XmlEnumValue("gilsonitic")
    GILSONITIC("gilsonitic"),
    @XmlEnumValue("glauconite")
    GLAUCONITE("glauconite"),
    @XmlEnumValue("glauconitic")
    GLAUCONITIC("glauconitic"),
    @XmlEnumValue("gneiss")
    GNEISS("gneiss"),
    @XmlEnumValue("gneissic")
    GNEISSIC("gneissic"),
    @XmlEnumValue("granite")
    GRANITE("granite"),
    @XmlEnumValue("granitic")
    GRANITIC("granitic"),
    @XmlEnumValue("granodiorite")
    GRANODIORITE("granodiorite"),
    @XmlEnumValue("granodioritic")
    GRANODIORITIC("granodioritic"),
    @XmlEnumValue("granofels")
    GRANOFELS("granofels"),
    @XmlEnumValue("granulite")
    GRANULITE("granulite"),
    @XmlEnumValue("granulitic")
    GRANULITIC("granulitic"),
    @XmlEnumValue("gravel")
    GRAVEL("gravel"),
    @XmlEnumValue("gravelly")
    GRAVELLY("gravelly"),
    @XmlEnumValue("greenstone")
    GREENSTONE("greenstone"),
    @XmlEnumValue("gumbo")
    GUMBO("gumbo"),
    @XmlEnumValue("gypsiferous")
    GYPSIFEROUS("gypsiferous"),
    @XmlEnumValue("gypsum")
    GYPSUM("gypsum"),
    @XmlEnumValue("halite")
    HALITE("halite"),
    @XmlEnumValue("halitic")
    HALITIC("halitic"),
    @XmlEnumValue("hornfels")
    HORNFELS("hornfels"),
    @XmlEnumValue("hornfelsic")
    HORNFELSIC("hornfelsic"),
    @XmlEnumValue("igneous")
    IGNEOUS("igneous"),
    @XmlEnumValue("igneous rock")
    IGNEOUS_ROCK("igneous rock"),
    @XmlEnumValue("illite")
    ILLITE("illite"),
    @XmlEnumValue("illitic")
    ILLITIC("illitic"),
    @XmlEnumValue("impact generated material")
    IMPACT_GENERATED_MATERIAL("impact generated material"),
    @XmlEnumValue("impure dolomite")
    IMPURE_DOLOMITE("impure dolomite"),
    @XmlEnumValue("impure limestone")
    IMPURE_LIMESTONE("impure limestone"),
    @XmlEnumValue("intrusive rock (plutonic)")
    INTRUSIVE_ROCK_PLUTONIC("intrusive rock (plutonic)"),
    @XmlEnumValue("iron rich sedimentary rock")
    IRON_RICH_SEDIMENTARY_ROCK("iron rich sedimentary rock"),
    @XmlEnumValue("kalsilitic and melilitic rocks")
    KALSILITIC_AND_MELILITIC_ROCKS("kalsilitic and melilitic rocks"),
    @XmlEnumValue("kaolinite")
    KAOLINITE("kaolinite"),
    @XmlEnumValue("kaolinitic")
    KAOLINITIC("kaolinitic"),
    @XmlEnumValue("komatiitic rock")
    KOMATIITIC_ROCK("komatiitic rock"),
    @XmlEnumValue("latitic rock")
    LATITIC_ROCK("latitic rock"),
    @XmlEnumValue("lignite")
    LIGNITE("lignite"),
    @XmlEnumValue("lignitic")
    LIGNITIC("lignitic"),
    @XmlEnumValue("lime boundstone")
    LIME_BOUNDSTONE("lime boundstone"),
    @XmlEnumValue("lime framestone")
    LIME_FRAMESTONE("lime framestone"),
    @XmlEnumValue("lime grainstone")
    LIME_GRAINSTONE("lime grainstone"),
    @XmlEnumValue("lime mudstone")
    LIME_MUDSTONE("lime mudstone"),
    @XmlEnumValue("lime packstone")
    LIME_PACKSTONE("lime packstone"),
    @XmlEnumValue("lime wackestone")
    LIME_WACKESTONE("lime wackestone"),
    @XmlEnumValue("limestone")
    LIMESTONE("limestone"),
    @XmlEnumValue("limestone stringer")
    LIMESTONE_STRINGER("limestone stringer"),
    @XmlEnumValue("lithic")
    LITHIC("lithic"),
    @XmlEnumValue("lithic fragments")
    LITHIC_FRAGMENTS("lithic fragments"),
    @XmlEnumValue("marble")
    MARBLE("marble"),
    @XmlEnumValue("marcasite")
    MARCASITE("marcasite"),
    @XmlEnumValue("marcasitic")
    MARCASITIC("marcasitic"),
    @XmlEnumValue("marl")
    MARL("marl"),
    @XmlEnumValue("marly")
    MARLY("marly"),
    @XmlEnumValue("metamorphic rock")
    METAMORPHIC_ROCK("metamorphic rock"),
    @XmlEnumValue("mica")
    MICA("mica"),
    @XmlEnumValue("mica schist")
    MICA_SCHIST("mica schist"),
    @XmlEnumValue("micaceous")
    MICACEOUS("micaceous"),
    @XmlEnumValue("microfossiliferous")
    MICROFOSSILIFEROUS("microfossiliferous"),
    @XmlEnumValue("microfossils")
    MICROFOSSILS("microfossils"),
    @XmlEnumValue("migmatite")
    MIGMATITE("migmatite"),
    @XmlEnumValue("migmatitic")
    MIGMATITIC("migmatitic"),
    @XmlEnumValue("monzogabbro")
    MONZOGABBRO("monzogabbro"),
    @XmlEnumValue("monzogabbroic")
    MONZOGABBROIC("monzogabbroic"),
    @XmlEnumValue("mud")
    MUD("mud"),
    @XmlEnumValue("muddy")
    MUDDY("muddy"),
    @XmlEnumValue("mudstone")
    MUDSTONE("mudstone"),
    @XmlEnumValue("mylonitic rock")
    MYLONITIC_ROCK("mylonitic rock"),
    @XmlEnumValue("no sample")
    NO_SAMPLE("no sample"),
    @XmlEnumValue("oncolite")
    ONCOLITE("oncolite"),
    @XmlEnumValue("oncoliths")
    ONCOLITHS("oncoliths"),
    @XmlEnumValue("oncolitic")
    ONCOLITIC("oncolitic"),
    @XmlEnumValue("ooids")
    OOIDS("ooids"),
    @XmlEnumValue("ooliths")
    OOLITHS("ooliths"),
    @XmlEnumValue("oolitic")
    OOLITIC("oolitic"),
    @XmlEnumValue("ooze")
    OOZE("ooze"),
    @XmlEnumValue("ophiolite")
    OPHIOLITE("ophiolite"),
    @XmlEnumValue("ophiolitic")
    OPHIOLITIC("ophiolitic"),
    @XmlEnumValue("organic bearing mudstone")
    ORGANIC_BEARING_MUDSTONE("organic bearing mudstone"),
    @XmlEnumValue("ostracodal")
    OSTRACODAL("ostracodal"),
    @XmlEnumValue("ostracods")
    OSTRACODS("ostracods"),
    @XmlEnumValue("peat")
    PEAT("peat"),
    @XmlEnumValue("peaty")
    PEATY("peaty"),
    @XmlEnumValue("pebble")
    PEBBLE("pebble"),
    @XmlEnumValue("pebbly")
    PEBBLY("pebbly"),
    @XmlEnumValue("pegmatite")
    PEGMATITE("pegmatite"),
    @XmlEnumValue("pegmatitic")
    PEGMATITIC("pegmatitic"),
    @XmlEnumValue("pelletal")
    PELLETAL("pelletal"),
    @XmlEnumValue("pellets")
    PELLETS("pellets"),
    @XmlEnumValue("peloidal")
    PELOIDAL("peloidal"),
    @XmlEnumValue("peloids")
    PELOIDS("peloids"),
    @XmlEnumValue("peridotite")
    PERIDOTITE("peridotite"),
    @XmlEnumValue("peridotitic")
    PERIDOTITIC("peridotitic"),
    @XmlEnumValue("phaneritic igneous rock")
    PHANERITIC_IGNEOUS_ROCK("phaneritic igneous rock"),
    @XmlEnumValue("phonolite")
    PHONOLITE("phonolite"),
    @XmlEnumValue("phonolitic")
    PHONOLITIC("phonolitic"),
    @XmlEnumValue("phonolitoid")
    PHONOLITOID("phonolitoid"),
    @XmlEnumValue("phosphate")
    PHOSPHATE("phosphate"),
    @XmlEnumValue("phosphate rock")
    PHOSPHATE_ROCK("phosphate rock"),
    @XmlEnumValue("phosphatic")
    PHOSPHATIC("phosphatic"),
    @XmlEnumValue("phyllite")
    PHYLLITE("phyllite"),
    @XmlEnumValue("phyllitic")
    PHYLLITIC("phyllitic"),
    @XmlEnumValue("pisolite")
    PISOLITE("pisolite"),
    @XmlEnumValue("pisoliths")
    PISOLITHS("pisoliths"),
    @XmlEnumValue("pisolitic")
    PISOLITIC("pisolitic"),
    @XmlEnumValue("plant remains")
    PLANT_REMAINS("plant remains"),
    @XmlEnumValue("porphyritic")
    PORPHYRITIC("porphyritic"),
    @XmlEnumValue("porphyry")
    PORPHYRY("porphyry"),
    @XmlEnumValue("potassium and magnesium salts")
    POTASSIUM_AND_MAGNESIUM_SALTS("potassium and magnesium salts"),
    @XmlEnumValue("pyrite")
    PYRITE("pyrite"),
    @XmlEnumValue("pyritic")
    PYRITIC("pyritic"),
    @XmlEnumValue("pyroclastic breccia")
    PYROCLASTIC_BRECCIA("pyroclastic breccia"),
    @XmlEnumValue("pyroclastic rock")
    PYROCLASTIC_ROCK("pyroclastic rock"),
    @XmlEnumValue("pyroxenite")
    PYROXENITE("pyroxenite"),
    @XmlEnumValue("pyroxenitic")
    PYROXENITIC("pyroxenitic"),
    @XmlEnumValue("quartiferous")
    QUARTIFEROUS("quartiferous"),
    @XmlEnumValue("quartz")
    QUARTZ("quartz"),
    @XmlEnumValue("quartz arenite")
    QUARTZ_ARENITE("quartz arenite"),
    @XmlEnumValue("quartzite")
    QUARTZITE("quartzite"),
    @XmlEnumValue("quartzitic")
    QUARTZITIC("quartzitic"),
    @XmlEnumValue("radiolaria")
    RADIOLARIA("radiolaria"),
    @XmlEnumValue("radiolarian")
    RADIOLARIAN("radiolarian"),
    @XmlEnumValue("rhyolite")
    RHYOLITE("rhyolite"),
    @XmlEnumValue("rhyolitic")
    RHYOLITIC("rhyolitic"),
    @XmlEnumValue("rock salt")
    ROCK_SALT("rock salt"),
    @XmlEnumValue("rootlets")
    ROOTLETS("rootlets"),
    @XmlEnumValue("salty")
    SALTY("salty"),
    @XmlEnumValue("sand")
    SAND("sand"),
    @XmlEnumValue("sandstone")
    SANDSTONE("sandstone"),
    @XmlEnumValue("sandy")
    SANDY("sandy"),
    @XmlEnumValue("sapropel")
    SAPROPEL("sapropel"),
    @XmlEnumValue("sapropelic")
    SAPROPELIC("sapropelic"),
    @XmlEnumValue("schist")
    SCHIST("schist"),
    @XmlEnumValue("schisty")
    SCHISTY("schisty"),
    @XmlEnumValue("sepentinitic")
    SEPENTINITIC("sepentinitic"),
    @XmlEnumValue("serpentinite")
    SERPENTINITE("serpentinite"),
    @XmlEnumValue("shale")
    SHALE("shale"),
    @XmlEnumValue("shaly")
    SHALY("shaly"),
    @XmlEnumValue("shell fragments")
    SHELL_FRAGMENTS("shell fragments"),
    @XmlEnumValue("shelly")
    SHELLY("shelly"),
    @XmlEnumValue("siderite")
    SIDERITE("siderite"),
    @XmlEnumValue("siderite concretion")
    SIDERITE_CONCRETION("siderite concretion"),
    @XmlEnumValue("sideritic")
    SIDERITIC("sideritic"),
    @XmlEnumValue("siliceous ooze")
    SILICEOUS_OOZE("siliceous ooze"),
    @XmlEnumValue("silt")
    SILT("silt"),
    @XmlEnumValue("siltstone")
    SILTSTONE("siltstone"),
    @XmlEnumValue("silty")
    SILTY("silty"),
    @XmlEnumValue("skarn")
    SKARN("skarn"),
    @XmlEnumValue("skarny")
    SKARNY("skarny"),
    @XmlEnumValue("slate")
    SLATE("slate"),
    @XmlEnumValue("slaty")
    SLATY("slaty"),
    @XmlEnumValue("smectite")
    SMECTITE("smectite"),
    @XmlEnumValue("smectitic")
    SMECTITIC("smectitic"),
    @XmlEnumValue("spicular")
    SPICULAR("spicular"),
    @XmlEnumValue("spicules")
    SPICULES("spicules"),
    @XmlEnumValue("spilite")
    SPILITE("spilite"),
    @XmlEnumValue("spilitic")
    SPILITIC("spilitic"),
    @XmlEnumValue("stylolites")
    STYLOLITES("stylolites"),
    @XmlEnumValue("stylolitic")
    STYLOLITIC("stylolitic"),
    @XmlEnumValue("syenite")
    SYENITE("syenite"),
    @XmlEnumValue("syenitic")
    SYENITIC("syenitic"),
    @XmlEnumValue("syenitoid")
    SYENITOID("syenitoid"),
    @XmlEnumValue("sylvite")
    SYLVITE("sylvite"),
    @XmlEnumValue("sylvitic")
    SYLVITIC("sylvitic"),
    @XmlEnumValue("tarry")
    TARRY("tarry"),
    @XmlEnumValue("tephrite")
    TEPHRITE("tephrite"),
    @XmlEnumValue("tephritic")
    TEPHRITIC("tephritic"),
    @XmlEnumValue("tephritoid")
    TEPHRITOID("tephritoid"),
    @XmlEnumValue("tholeiitic basalt")
    THOLEIITIC_BASALT("tholeiitic basalt"),
    @XmlEnumValue("tonalite")
    TONALITE("tonalite"),
    @XmlEnumValue("tonalitic")
    TONALITIC("tonalitic"),
    @XmlEnumValue("trachyte")
    TRACHYTE("trachyte"),
    @XmlEnumValue("trachytic")
    TRACHYTIC("trachytic"),
    @XmlEnumValue("trachytic rock")
    TRACHYTIC_ROCK("trachytic rock"),
    @XmlEnumValue("trachytoid")
    TRACHYTOID("trachytoid"),
    @XmlEnumValue("travertine")
    TRAVERTINE("travertine"),
    @XmlEnumValue("tuff")
    TUFF("tuff"),
    @XmlEnumValue("tuffaceous")
    TUFFACEOUS("tuffaceous"),
    @XmlEnumValue("tuffite")
    TUFFITE("tuffite"),
    @XmlEnumValue("tuffitic")
    TUFFITIC("tuffitic"),
    @XmlEnumValue("ultrabasic")
    ULTRABASIC("ultrabasic"),
    @XmlEnumValue("undifferentiated")
    UNDIFFERENTIATED("undifferentiated"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("wacke")
    WACKE("wacke");
    private final String value;

    LithologyQualifierKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LithologyQualifierKind fromValue(String v) {
        for (LithologyQualifierKind c: LithologyQualifierKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
