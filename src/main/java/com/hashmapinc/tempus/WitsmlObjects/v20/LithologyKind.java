


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LithologyKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="LithologyKind">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="alkali feldspar rhyolite"/>
 *     <enumeration value="alkali olivine basalt"/>
 *     <enumeration value="amphibolite"/>
 *     <enumeration value="andesite"/>
 *     <enumeration value="anhydrite"/>
 *     <enumeration value="anorthositic rock"/>
 *     <enumeration value="anthracite"/>
 *     <enumeration value="aplite"/>
 *     <enumeration value="arenite"/>
 *     <enumeration value="argillaceous"/>
 *     <enumeration value="arkose"/>
 *     <enumeration value="basalt"/>
 *     <enumeration value="basanite"/>
 *     <enumeration value="bauxite"/>
 *     <enumeration value="bituminous coal"/>
 *     <enumeration value="blueschist metamorphic rock"/>
 *     <enumeration value="boninite"/>
 *     <enumeration value="breccia"/>
 *     <enumeration value="carbonate ooze"/>
 *     <enumeration value="carbonatite"/>
 *     <enumeration value="chalk"/>
 *     <enumeration value="chert"/>
 *     <enumeration value="clay"/>
 *     <enumeration value="claystone"/>
 *     <enumeration value="coal"/>
 *     <enumeration value="conglomerate"/>
 *     <enumeration value="dacite"/>
 *     <enumeration value="diabase"/>
 *     <enumeration value="diamictite"/>
 *     <enumeration value="diorite"/>
 *     <enumeration value="dioritoid"/>
 *     <enumeration value="doleritic rock"/>
 *     <enumeration value="dolomite"/>
 *     <enumeration value="dolomitic"/>
 *     <enumeration value="eclogite"/>
 *     <enumeration value="exotic alkaline rock"/>
 *     <enumeration value="feldspar"/>
 *     <enumeration value="feldspathic arenite"/>
 *     <enumeration value="fine grained igneous rock"/>
 *     <enumeration value="foid dioritoid"/>
 *     <enumeration value="foid gabbroid"/>
 *     <enumeration value="foid syenitoid"/>
 *     <enumeration value="foidite"/>
 *     <enumeration value="foiditoid"/>
 *     <enumeration value="foidolite"/>
 *     <enumeration value="foliated metamorphic rock"/>
 *     <enumeration value="fragmental igneous rock"/>
 *     <enumeration value="gabbro"/>
 *     <enumeration value="gabbroic rock"/>
 *     <enumeration value="gabbroid"/>
 *     <enumeration value="glauconite"/>
 *     <enumeration value="gneiss"/>
 *     <enumeration value="granite"/>
 *     <enumeration value="granodiorite"/>
 *     <enumeration value="granofels"/>
 *     <enumeration value="granulite"/>
 *     <enumeration value="gravel"/>
 *     <enumeration value="greenstone"/>
 *     <enumeration value="gumbo"/>
 *     <enumeration value="gypsum"/>
 *     <enumeration value="halite"/>
 *     <enumeration value="hornfels"/>
 *     <enumeration value="igneous rock"/>
 *     <enumeration value="impact generated material"/>
 *     <enumeration value="impure dolomite"/>
 *     <enumeration value="impure limestone"/>
 *     <enumeration value="intrusive rock (plutonic)"/>
 *     <enumeration value="iron rich sedimentary rock"/>
 *     <enumeration value="kalsilitic and melilitic rocks"/>
 *     <enumeration value="komatiitic rock"/>
 *     <enumeration value="latitic rock"/>
 *     <enumeration value="lignite"/>
 *     <enumeration value="lime boundstone"/>
 *     <enumeration value="lime framestone"/>
 *     <enumeration value="lime grainstone"/>
 *     <enumeration value="lime mudstone"/>
 *     <enumeration value="lime packstone"/>
 *     <enumeration value="lime wackestone"/>
 *     <enumeration value="limestone"/>
 *     <enumeration value="marble"/>
 *     <enumeration value="marl"/>
 *     <enumeration value="metamorphic rock"/>
 *     <enumeration value="mica schist"/>
 *     <enumeration value="migmatite"/>
 *     <enumeration value="monzogabbro"/>
 *     <enumeration value="mud"/>
 *     <enumeration value="mudstone"/>
 *     <enumeration value="mylonitic rock"/>
 *     <enumeration value="no description"/>
 *     <enumeration value="no sample"/>
 *     <enumeration value="ooze"/>
 *     <enumeration value="ophiolite"/>
 *     <enumeration value="organic bearing mudstone"/>
 *     <enumeration value="peat"/>
 *     <enumeration value="pegmatite"/>
 *     <enumeration value="peridotite"/>
 *     <enumeration value="phaneritic igneous rock"/>
 *     <enumeration value="phonolite"/>
 *     <enumeration value="phonolitoid"/>
 *     <enumeration value="phosphate"/>
 *     <enumeration value="phosphate rock"/>
 *     <enumeration value="phyllite"/>
 *     <enumeration value="porphyry"/>
 *     <enumeration value="potassium and magnesium salts"/>
 *     <enumeration value="pyroclastic breccia"/>
 *     <enumeration value="pyroclastic rock"/>
 *     <enumeration value="pyroxenite"/>
 *     <enumeration value="quartz arenite"/>
 *     <enumeration value="quartzite"/>
 *     <enumeration value="rhyolite"/>
 *     <enumeration value="rock salt"/>
 *     <enumeration value="sand"/>
 *     <enumeration value="sandstone"/>
 *     <enumeration value="sandy"/>
 *     <enumeration value="sapropel"/>
 *     <enumeration value="schist"/>
 *     <enumeration value="serpentinite"/>
 *     <enumeration value="shale"/>
 *     <enumeration value="siliceous ooze"/>
 *     <enumeration value="silt"/>
 *     <enumeration value="siltstone"/>
 *     <enumeration value="skarn"/>
 *     <enumeration value="slate"/>
 *     <enumeration value="spilite"/>
 *     <enumeration value="syenite"/>
 *     <enumeration value="syenitoid"/>
 *     <enumeration value="sylvite"/>
 *     <enumeration value="tephrite"/>
 *     <enumeration value="tephritoid"/>
 *     <enumeration value="tholeiitic basalt"/>
 *     <enumeration value="tonalite"/>
 *     <enumeration value="trachyte"/>
 *     <enumeration value="trachytic rock"/>
 *     <enumeration value="trachytoid"/>
 *     <enumeration value="travertine"/>
 *     <enumeration value="tuff"/>
 *     <enumeration value="tuffite"/>
 *     <enumeration value="ultrabasic"/>
 *     <enumeration value="undifferentiated"/>
 *     <enumeration value="unknown"/>
 *     <enumeration value="wacke"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LithologyKind")
@XmlEnum
public enum LithologyKind {

    @XmlEnumValue("alkali feldspar rhyolite")
    ALKALI_FELDSPAR_RHYOLITE("alkali feldspar rhyolite"),
    @XmlEnumValue("alkali olivine basalt")
    ALKALI_OLIVINE_BASALT("alkali olivine basalt"),
    @XmlEnumValue("amphibolite")
    AMPHIBOLITE("amphibolite"),
    @XmlEnumValue("andesite")
    ANDESITE("andesite"),
    @XmlEnumValue("anhydrite")
    ANHYDRITE("anhydrite"),
    @XmlEnumValue("anorthositic rock")
    ANORTHOSITIC_ROCK("anorthositic rock"),
    @XmlEnumValue("anthracite")
    ANTHRACITE("anthracite"),
    @XmlEnumValue("aplite")
    APLITE("aplite"),
    @XmlEnumValue("arenite")
    ARENITE("arenite"),
    @XmlEnumValue("argillaceous")
    ARGILLACEOUS("argillaceous"),
    @XmlEnumValue("arkose")
    ARKOSE("arkose"),
    @XmlEnumValue("basalt")
    BASALT("basalt"),
    @XmlEnumValue("basanite")
    BASANITE("basanite"),
    @XmlEnumValue("bauxite")
    BAUXITE("bauxite"),
    @XmlEnumValue("bituminous coal")
    BITUMINOUS_COAL("bituminous coal"),
    @XmlEnumValue("blueschist metamorphic rock")
    BLUESCHIST_METAMORPHIC_ROCK("blueschist metamorphic rock"),
    @XmlEnumValue("boninite")
    BONINITE("boninite"),
    @XmlEnumValue("breccia")
    BRECCIA("breccia"),
    @XmlEnumValue("carbonate ooze")
    CARBONATE_OOZE("carbonate ooze"),
    @XmlEnumValue("carbonatite")
    CARBONATITE("carbonatite"),
    @XmlEnumValue("chalk")
    CHALK("chalk"),
    @XmlEnumValue("chert")
    CHERT("chert"),
    @XmlEnumValue("clay")
    CLAY("clay"),
    @XmlEnumValue("claystone")
    CLAYSTONE("claystone"),
    @XmlEnumValue("coal")
    COAL("coal"),
    @XmlEnumValue("conglomerate")
    CONGLOMERATE("conglomerate"),
    @XmlEnumValue("dacite")
    DACITE("dacite"),
    @XmlEnumValue("diabase")
    DIABASE("diabase"),
    @XmlEnumValue("diamictite")
    DIAMICTITE("diamictite"),
    @XmlEnumValue("diorite")
    DIORITE("diorite"),
    @XmlEnumValue("dioritoid")
    DIORITOID("dioritoid"),
    @XmlEnumValue("doleritic rock")
    DOLERITIC_ROCK("doleritic rock"),
    @XmlEnumValue("dolomite")
    DOLOMITE("dolomite"),
    @XmlEnumValue("dolomitic")
    DOLOMITIC("dolomitic"),
    @XmlEnumValue("eclogite")
    ECLOGITE("eclogite"),
    @XmlEnumValue("exotic alkaline rock")
    EXOTIC_ALKALINE_ROCK("exotic alkaline rock"),
    @XmlEnumValue("feldspar")
    FELDSPAR("feldspar"),
    @XmlEnumValue("feldspathic arenite")
    FELDSPATHIC_ARENITE("feldspathic arenite"),
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
    @XmlEnumValue("foiditoid")
    FOIDITOID("foiditoid"),
    @XmlEnumValue("foidolite")
    FOIDOLITE("foidolite"),
    @XmlEnumValue("foliated metamorphic rock")
    FOLIATED_METAMORPHIC_ROCK("foliated metamorphic rock"),
    @XmlEnumValue("fragmental igneous rock")
    FRAGMENTAL_IGNEOUS_ROCK("fragmental igneous rock"),
    @XmlEnumValue("gabbro")
    GABBRO("gabbro"),
    @XmlEnumValue("gabbroic rock")
    GABBROIC_ROCK("gabbroic rock"),
    @XmlEnumValue("gabbroid")
    GABBROID("gabbroid"),
    @XmlEnumValue("glauconite")
    GLAUCONITE("glauconite"),
    @XmlEnumValue("gneiss")
    GNEISS("gneiss"),
    @XmlEnumValue("granite")
    GRANITE("granite"),
    @XmlEnumValue("granodiorite")
    GRANODIORITE("granodiorite"),
    @XmlEnumValue("granofels")
    GRANOFELS("granofels"),
    @XmlEnumValue("granulite")
    GRANULITE("granulite"),
    @XmlEnumValue("gravel")
    GRAVEL("gravel"),
    @XmlEnumValue("greenstone")
    GREENSTONE("greenstone"),
    @XmlEnumValue("gumbo")
    GUMBO("gumbo"),
    @XmlEnumValue("gypsum")
    GYPSUM("gypsum"),
    @XmlEnumValue("halite")
    HALITE("halite"),
    @XmlEnumValue("hornfels")
    HORNFELS("hornfels"),
    @XmlEnumValue("igneous rock")
    IGNEOUS_ROCK("igneous rock"),
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
    @XmlEnumValue("komatiitic rock")
    KOMATIITIC_ROCK("komatiitic rock"),
    @XmlEnumValue("latitic rock")
    LATITIC_ROCK("latitic rock"),
    @XmlEnumValue("lignite")
    LIGNITE("lignite"),
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
    @XmlEnumValue("marble")
    MARBLE("marble"),
    @XmlEnumValue("marl")
    MARL("marl"),
    @XmlEnumValue("metamorphic rock")
    METAMORPHIC_ROCK("metamorphic rock"),
    @XmlEnumValue("mica schist")
    MICA_SCHIST("mica schist"),
    @XmlEnumValue("migmatite")
    MIGMATITE("migmatite"),
    @XmlEnumValue("monzogabbro")
    MONZOGABBRO("monzogabbro"),
    @XmlEnumValue("mud")
    MUD("mud"),
    @XmlEnumValue("mudstone")
    MUDSTONE("mudstone"),
    @XmlEnumValue("mylonitic rock")
    MYLONITIC_ROCK("mylonitic rock"),
    @XmlEnumValue("no description")
    NO_DESCRIPTION("no description"),
    @XmlEnumValue("no sample")
    NO_SAMPLE("no sample"),
    @XmlEnumValue("ooze")
    OOZE("ooze"),
    @XmlEnumValue("ophiolite")
    OPHIOLITE("ophiolite"),
    @XmlEnumValue("organic bearing mudstone")
    ORGANIC_BEARING_MUDSTONE("organic bearing mudstone"),
    @XmlEnumValue("peat")
    PEAT("peat"),
    @XmlEnumValue("pegmatite")
    PEGMATITE("pegmatite"),
    @XmlEnumValue("peridotite")
    PERIDOTITE("peridotite"),
    @XmlEnumValue("phaneritic igneous rock")
    PHANERITIC_IGNEOUS_ROCK("phaneritic igneous rock"),
    @XmlEnumValue("phonolite")
    PHONOLITE("phonolite"),
    @XmlEnumValue("phonolitoid")
    PHONOLITOID("phonolitoid"),
    @XmlEnumValue("phosphate")
    PHOSPHATE("phosphate"),
    @XmlEnumValue("phosphate rock")
    PHOSPHATE_ROCK("phosphate rock"),
    @XmlEnumValue("phyllite")
    PHYLLITE("phyllite"),
    @XmlEnumValue("porphyry")
    PORPHYRY("porphyry"),
    @XmlEnumValue("potassium and magnesium salts")
    POTASSIUM_AND_MAGNESIUM_SALTS("potassium and magnesium salts"),
    @XmlEnumValue("pyroclastic breccia")
    PYROCLASTIC_BRECCIA("pyroclastic breccia"),
    @XmlEnumValue("pyroclastic rock")
    PYROCLASTIC_ROCK("pyroclastic rock"),
    @XmlEnumValue("pyroxenite")
    PYROXENITE("pyroxenite"),
    @XmlEnumValue("quartz arenite")
    QUARTZ_ARENITE("quartz arenite"),
    @XmlEnumValue("quartzite")
    QUARTZITE("quartzite"),
    @XmlEnumValue("rhyolite")
    RHYOLITE("rhyolite"),
    @XmlEnumValue("rock salt")
    ROCK_SALT("rock salt"),
    @XmlEnumValue("sand")
    SAND("sand"),
    @XmlEnumValue("sandstone")
    SANDSTONE("sandstone"),
    @XmlEnumValue("sandy")
    SANDY("sandy"),
    @XmlEnumValue("sapropel")
    SAPROPEL("sapropel"),
    @XmlEnumValue("schist")
    SCHIST("schist"),
    @XmlEnumValue("serpentinite")
    SERPENTINITE("serpentinite"),
    @XmlEnumValue("shale")
    SHALE("shale"),
    @XmlEnumValue("siliceous ooze")
    SILICEOUS_OOZE("siliceous ooze"),
    @XmlEnumValue("silt")
    SILT("silt"),
    @XmlEnumValue("siltstone")
    SILTSTONE("siltstone"),
    @XmlEnumValue("skarn")
    SKARN("skarn"),
    @XmlEnumValue("slate")
    SLATE("slate"),
    @XmlEnumValue("spilite")
    SPILITE("spilite"),
    @XmlEnumValue("syenite")
    SYENITE("syenite"),
    @XmlEnumValue("syenitoid")
    SYENITOID("syenitoid"),
    @XmlEnumValue("sylvite")
    SYLVITE("sylvite"),
    @XmlEnumValue("tephrite")
    TEPHRITE("tephrite"),
    @XmlEnumValue("tephritoid")
    TEPHRITOID("tephritoid"),
    @XmlEnumValue("tholeiitic basalt")
    THOLEIITIC_BASALT("tholeiitic basalt"),
    @XmlEnumValue("tonalite")
    TONALITE("tonalite"),
    @XmlEnumValue("trachyte")
    TRACHYTE("trachyte"),
    @XmlEnumValue("trachytic rock")
    TRACHYTIC_ROCK("trachytic rock"),
    @XmlEnumValue("trachytoid")
    TRACHYTOID("trachytoid"),
    @XmlEnumValue("travertine")
    TRAVERTINE("travertine"),
    @XmlEnumValue("tuff")
    TUFF("tuff"),
    @XmlEnumValue("tuffite")
    TUFFITE("tuffite"),
    @XmlEnumValue("ultrabasic")
    ULTRABASIC("ultrabasic"),
    @XmlEnumValue("undifferentiated")
    UNDIFFERENTIATED("undifferentiated"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("wacke")
    WACKE("wacke");
    private final String value;

    LithologyKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LithologyKind fromValue(String v) {
        for (LithologyKind c: LithologyKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
