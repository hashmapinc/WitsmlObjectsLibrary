package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="MeasurementType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="acceleration"/>
 *     <enumeration value="acoustic caliper"/>
 *     <enumeration value="acoustic casing collar locator"/>
 *     <enumeration value="acoustic impedance"/>
 *     <enumeration value="acoustic porosity"/>
 *     <enumeration value="acoustic velocity"/>
 *     <enumeration value="acoustic wave matrix travel time"/>
 *     <enumeration value="acoustic wave travel time"/>
 *     <enumeration value="amplitude"/>
 *     <enumeration value="amplitude of acoustic wave"/>
 *     <enumeration value="amplitude of E-M wave"/>
 *     <enumeration value="amplitude ratio"/>
 *     <enumeration value="area"/>
 *     <enumeration value="attenuation"/>
 *     <enumeration value="attenuation of acoustic wave"/>
 *     <enumeration value="attenuation of E-M wave"/>
 *     <enumeration value="auxiliary"/>
 *     <enumeration value="average porosity"/>
 *     <enumeration value="azimuth"/>
 *     <enumeration value="barite mud correction"/>
 *     <enumeration value="bed thickness correction"/>
 *     <enumeration value="bit size"/>
 *     <enumeration value="blocked"/>
 *     <enumeration value="borehole environment correction"/>
 *     <enumeration value="borehole fluid composition correction"/>
 *     <enumeration value="borehole fluid correction"/>
 *     <enumeration value="borehole size correction"/>
 *     <enumeration value="bromide mud correction"/>
 *     <enumeration value="bulk compressibility"/>
 *     <enumeration value="bulk density"/>
 *     <enumeration value="bulk volume"/>
 *     <enumeration value="bulk volume gas"/>
 *     <enumeration value="bulk volume hydrocarbon"/>
 *     <enumeration value="bulk volume oil"/>
 *     <enumeration value="bulk volume water"/>
 *     <enumeration value="C/O ratio"/>
 *     <enumeration value="caliper"/>
 *     <enumeration value="cased hole correction"/>
 *     <enumeration value="casing collar locator"/>
 *     <enumeration value="casing correction"/>
 *     <enumeration value="casing diameter correction"/>
 *     <enumeration value="casing inspection"/>
 *     <enumeration value="casing thickness correction"/>
 *     <enumeration value="casing weight correction"/>
 *     <enumeration value="cement correction"/>
 *     <enumeration value="cement density correction"/>
 *     <enumeration value="cement evaluation"/>
 *     <enumeration value="cement thickness correction"/>
 *     <enumeration value="cement type correction"/>
 *     <enumeration value="CH density porosity"/>
 *     <enumeration value="CH dolomite density porosity"/>
 *     <enumeration value="CH dolomite neutron porosity"/>
 *     <enumeration value="CH limestone density porosity"/>
 *     <enumeration value="CH limestone neutron porosity"/>
 *     <enumeration value="CH neutron porosity"/>
 *     <enumeration value="CH sandstone density porosity"/>
 *     <enumeration value="CH sandstone neutron porosity"/>
 *     <enumeration value="compressional wave dolomite porosity"/>
 *     <enumeration value="compressional wave limestone porosity"/>
 *     <enumeration value="compressional wave matrix travel time"/>
 *     <enumeration value="compressional wave sandstone porosity"/>
 *     <enumeration value="compressional wave travel time"/>
 *     <enumeration value="conductivity"/>
 *     <enumeration value="conductivity from attenuation"/>
 *     <enumeration value="conductivity from phase shift"/>
 *     <enumeration value="connate water conductivity"/>
 *     <enumeration value="connate water resistivity"/>
 *     <enumeration value="conventional core porosity"/>
 *     <enumeration value="core matrix density"/>
 *     <enumeration value="core permeability"/>
 *     <enumeration value="core porosity"/>
 *     <enumeration value="corrected"/>
 *     <enumeration value="count rate"/>
 *     <enumeration value="count rate ratio"/>
 *     <enumeration value="cross plot porosity"/>
 *     <enumeration value="decay time"/>
 *     <enumeration value="deep conductivity"/>
 *     <enumeration value="deep induction conductivity"/>
 *     <enumeration value="deep induction resistivity"/>
 *     <enumeration value="deep laterolog conductivity"/>
 *     <enumeration value="deep laterolog resistivity"/>
 *     <enumeration value="deep resistivity"/>
 *     <enumeration value="density"/>
 *     <enumeration value="density porosity"/>
 *     <enumeration value="depth"/>
 *     <enumeration value="depth adjusted"/>
 *     <enumeration value="depth derived from velocity"/>
 *     <enumeration value="deviation"/>
 *     <enumeration value="dielectric"/>
 *     <enumeration value="diffusion correction"/>
 *     <enumeration value="dip"/>
 *     <enumeration value="dipmeter"/>
 *     <enumeration value="dipmeter conductivity"/>
 *     <enumeration value="dipmeter resistivity"/>
 *     <enumeration value="dolomite acoustic porosity"/>
 *     <enumeration value="dolomite density porosity"/>
 *     <enumeration value="dolomite neutron porosity"/>
 *     <enumeration value="edited"/>
 *     <enumeration value="effective porosity"/>
 *     <enumeration value="electric current"/>
 *     <enumeration value="electric potential"/>
 *     <enumeration value="electromagnetic wave matrix travel time"/>
 *     <enumeration value="electromagnetic wave travel time"/>
 *     <enumeration value="element"/>
 *     <enumeration value="elemental ratio"/>
 *     <enumeration value="enhanced"/>
 *     <enumeration value="filtered"/>
 *     <enumeration value="flowmeter"/>
 *     <enumeration value="fluid density"/>
 *     <enumeration value="fluid velocity"/>
 *     <enumeration value="fluid viscosity"/>
 *     <enumeration value="flushed zone conductivity"/>
 *     <enumeration value="flushed zone resistivity"/>
 *     <enumeration value="flushed zone saturation"/>
 *     <enumeration value="force"/>
 *     <enumeration value="formation density correction"/>
 *     <enumeration value="formation properties correction"/>
 *     <enumeration value="formation salinity correction"/>
 *     <enumeration value="formation saturation correction"/>
 *     <enumeration value="formation volume factor correction"/>
 *     <enumeration value="formation water density correction"/>
 *     <enumeration value="formation water saturation correction"/>
 *     <enumeration value="free fluid index"/>
 *     <enumeration value="friction effect correction"/>
 *     <enumeration value="gamma ray"/>
 *     <enumeration value="gamma ray minus uranium"/>
 *     <enumeration value="gas saturation"/>
 *     <enumeration value="gradiomanometer"/>
 *     <enumeration value="high frequency conductivity"/>
 *     <enumeration value="high frequency electromagnetic"/>
 *     <enumeration value="high frequency electromagnetic porosity"/>
 *     <enumeration value="high frequency E-M phase shift"/>
 *     <enumeration value="high frequency resistivity"/>
 *     <enumeration value="hydrocarbon correction"/>
 *     <enumeration value="hydrocarbon density correction"/>
 *     <enumeration value="hydrocarbon gravity correction"/>
 *     <enumeration value="hydrocarbon saturation"/>
 *     <enumeration value="hydrocarbon viscosity correction"/>
 *     <enumeration value="image"/>
 *     <enumeration value="interpretation variable"/>
 *     <enumeration value="iron mud correction"/>
 *     <enumeration value="joined"/>
 *     <enumeration value="KCl mud correction"/>
 *     <enumeration value="length"/>
 *     <enumeration value="limestone acoustic porosity"/>
 *     <enumeration value="limestone density porosity"/>
 *     <enumeration value="limestone neutron porosity"/>
 *     <enumeration value="lithology correction"/>
 *     <enumeration value="log derived permeability"/>
 *     <enumeration value="log matrix density"/>
 *     <enumeration value="magnetic casing collar locator"/>
 *     <enumeration value="matrix density"/>
 *     <enumeration value="matrix travel time"/>
 *     <enumeration value="measured depth"/>
 *     <enumeration value="mechanical caliper"/>
 *     <enumeration value="mechanical casing collar locator"/>
 *     <enumeration value="medium conductivity"/>
 *     <enumeration value="medium induction conductivity"/>
 *     <enumeration value="medium induction resistivity"/>
 *     <enumeration value="medium laterolog conductivity"/>
 *     <enumeration value="medium laterolog resistivity"/>
 *     <enumeration value="medium resistivity"/>
 *     <enumeration value="micro conductivity"/>
 *     <enumeration value="micro inverse conductivity"/>
 *     <enumeration value="micro inverse resistivity"/>
 *     <enumeration value="micro laterolog conductivity"/>
 *     <enumeration value="micro laterolog resistivity"/>
 *     <enumeration value="micro normal conductivity"/>
 *     <enumeration value="micro normal resistivity"/>
 *     <enumeration value="micro resistivity"/>
 *     <enumeration value="micro spherically focused conductivity"/>
 *     <enumeration value="micro spherically focused resistivity"/>
 *     <enumeration value="mineral"/>
 *     <enumeration value="mud cake conductivity"/>
 *     <enumeration value="mud cake correction"/>
 *     <enumeration value="mud cake density correction"/>
 *     <enumeration value="mud cake resistivity"/>
 *     <enumeration value="mud cake resistivity correction"/>
 *     <enumeration value="mud cake thickness correction"/>
 *     <enumeration value="mud composition correction"/>
 *     <enumeration value="mud conductivity"/>
 *     <enumeration value="mud filtrate conductivity"/>
 *     <enumeration value="mud filtrate correction"/>
 *     <enumeration value="mud filtrate density correction"/>
 *     <enumeration value="mud filtrate resistivity"/>
 *     <enumeration value="mud filtrate resistivity correction"/>
 *     <enumeration value="mud filtrate salinity correction"/>
 *     <enumeration value="mud resistivity"/>
 *     <enumeration value="mud salinity correction"/>
 *     <enumeration value="mud viscosity correction"/>
 *     <enumeration value="mud weight correction"/>
 *     <enumeration value="neutron die away time"/>
 *     <enumeration value="neutron porosity"/>
 *     <enumeration value="nuclear caliper"/>
 *     <enumeration value="nuclear magnetic decay time"/>
 *     <enumeration value="nuclear magnetism log permeability"/>
 *     <enumeration value="nuclear magnetism porosity"/>
 *     <enumeration value="OH density porosity"/>
 *     <enumeration value="OH dolomite density porosity"/>
 *     <enumeration value="OH dolomite neutron porosity"/>
 *     <enumeration value="OH limestone density porosity"/>
 *     <enumeration value="OH limestone neutron porosity"/>
 *     <enumeration value="OH neutron porosity"/>
 *     <enumeration value="OH sandstone density porosity"/>
 *     <enumeration value="OH sandstone neutron porosity"/>
 *     <enumeration value="oil based mud correction"/>
 *     <enumeration value="oil saturation"/>
 *     <enumeration value="perforating"/>
 *     <enumeration value="permeability"/>
 *     <enumeration value="phase shift"/>
 *     <enumeration value="photoelectric absorption"/>
 *     <enumeration value="photoelectric absorption correction"/>
 *     <enumeration value="physical measurement correction"/>
 *     <enumeration value="plane angle"/>
 *     <enumeration value="porosity"/>
 *     <enumeration value="porosity correction"/>
 *     <enumeration value="potassium"/>
 *     <enumeration value="pressure"/>
 *     <enumeration value="pressure correction"/>
 *     <enumeration value="processed"/>
 *     <enumeration value="pulsed neutron porosity"/>
 *     <enumeration value="quality"/>
 *     <enumeration value="ratio"/>
 *     <enumeration value="raw"/>
 *     <enumeration value="relative bearing"/>
 *     <enumeration value="resistivity"/>
 *     <enumeration value="resistivity factor correction"/>
 *     <enumeration value="resistivity from attenuation"/>
 *     <enumeration value="resistivity from phase shift"/>
 *     <enumeration value="resistivity phase shift"/>
 *     <enumeration value="resistivity ratio"/>
 *     <enumeration value="salinity"/>
 *     <enumeration value="sampling"/>
 *     <enumeration value="sandstone acoustic porosity"/>
 *     <enumeration value="sandstone density porosity"/>
 *     <enumeration value="sandstone neutron porosity"/>
 *     <enumeration value="saturation"/>
 *     <enumeration value="shale volume"/>
 *     <enumeration value="shallow conductivity"/>
 *     <enumeration value="shallow induction conductivity"/>
 *     <enumeration value="shallow induction resistivity"/>
 *     <enumeration value="shallow laterolog conductivity"/>
 *     <enumeration value="shallow laterolog resistivity"/>
 *     <enumeration value="shallow resistivity"/>
 *     <enumeration value="shear wave dolomite porosity"/>
 *     <enumeration value="shear wave limestone porosity"/>
 *     <enumeration value="shear wave matrix travel time"/>
 *     <enumeration value="shear wave sandstone porosity"/>
 *     <enumeration value="shear wave travel time"/>
 *     <enumeration value="shifted"/>
 *     <enumeration value="sidewall core porosity"/>
 *     <enumeration value="sigma"/>
 *     <enumeration value="sigma formation"/>
 *     <enumeration value="sigma gas"/>
 *     <enumeration value="sigma hydrocarbon"/>
 *     <enumeration value="sigma matrix"/>
 *     <enumeration value="sigma oil"/>
 *     <enumeration value="sigma water"/>
 *     <enumeration value="slippage velocity correction"/>
 *     <enumeration value="smoothed"/>
 *     <enumeration value="spectral gamma ray"/>
 *     <enumeration value="spherically focused conductivity"/>
 *     <enumeration value="spherically focused resistivity"/>
 *     <enumeration value="spontaneous potential"/>
 *     <enumeration value="spreading loss correction"/>
 *     <enumeration value="synthetic well log trace"/>
 *     <enumeration value="temperature"/>
 *     <enumeration value="temperature correction"/>
 *     <enumeration value="tension"/>
 *     <enumeration value="Th/K ratio"/>
 *     <enumeration value="thorium"/>
 *     <enumeration value="time"/>
 *     <enumeration value="tool diameter correction"/>
 *     <enumeration value="tool eccentricity correction"/>
 *     <enumeration value="total gamma ray"/>
 *     <enumeration value="total porosity"/>
 *     <enumeration value="tracer survey"/>
 *     <enumeration value="travel time"/>
 *     <enumeration value="true conductivity"/>
 *     <enumeration value="true resistivity"/>
 *     <enumeration value="true vertical depth"/>
 *     <enumeration value="tube wave dolomite porosity"/>
 *     <enumeration value="tube wave limestone porosity"/>
 *     <enumeration value="tube wave matrix travel time"/>
 *     <enumeration value="tube wave sandstone porosity"/>
 *     <enumeration value="tube wave travel time"/>
 *     <enumeration value="uranium"/>
 *     <enumeration value="velocity"/>
 *     <enumeration value="volume"/>
 *     <enumeration value="water based fluid correction"/>
 *     <enumeration value="water holdup correction"/>
 *     <enumeration value="water saturated conductivity"/>
 *     <enumeration value="water saturated resistivity"/>
 *     <enumeration value="water saturation"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "MeasurementType")
@XmlEnum
public enum MeasurementType {


    /**
     * Output from an accelerometer on a logging tool.
     * 
     */
    @XmlEnumValue("acceleration")
    ACCELERATION("acceleration"),

    /**
     * A well log which uses an acoustic device to measure hole diameter.
     * 
     */
    @XmlEnumValue("acoustic caliper")
    ACOUSTIC_CALIPER("acoustic caliper"),

    /**
     * The signal measured by an acoustic device at the location of casing collars and other features (e.g., perforations).
     * 
     */
    @XmlEnumValue("acoustic casing collar locator")
    ACOUSTIC_CASING_COLLAR_LOCATOR("acoustic casing collar locator"),

    /**
     * Seismic velocity multiplied by density.
     * 
     */
    @XmlEnumValue("acoustic impedance")
    ACOUSTIC_IMPEDANCE("acoustic impedance"),

    /**
     * Porosity calculated from an acoustic log.
     * 
     */
    @XmlEnumValue("acoustic porosity")
    ACOUSTIC_POROSITY("acoustic porosity"),

    /**
     * The velocity of an acoustic wave.
     * 
     */
    @XmlEnumValue("acoustic velocity")
    ACOUSTIC_VELOCITY("acoustic velocity"),

    /**
     * The time it takes for an acoustic wave to traverse a fixed distance of a given material or matrix. In this case the material or matrix is a specific, zero porosity rock, e.g. sandstone, limestone or dolomite.
     * 
     */
    @XmlEnumValue("acoustic wave matrix travel time")
    ACOUSTIC_WAVE_MATRIX_TRAVEL_TIME("acoustic wave matrix travel time"),

    /**
     * The time it takes for an acoustic wave to traverse a fixed distance.
     * 
     */
    @XmlEnumValue("acoustic wave travel time")
    ACOUSTIC_WAVE_TRAVEL_TIME("acoustic wave travel time"),

    /**
     * Any measurement of the maximum departure of a wave from an average value.
     * 
     */
    @XmlEnumValue("amplitude")
    AMPLITUDE("amplitude"),

    /**
     * The extent of departure of an acoustic wave measured from the mean position.
     * 
     */
    @XmlEnumValue("amplitude of acoustic wave")
    AMPLITUDE_OF_ACOUSTIC_WAVE("amplitude of acoustic wave"),

    /**
     * The extent of departure of an electromagnetic wave measured from the mean position.
     * 
     */
    @XmlEnumValue("amplitude of E-M wave")
    AMPLITUDE_OF_E_M_WAVE("amplitude of E-M wave"),

    /**
     * The ratio of two amplitudes.
     * 
     */
    @XmlEnumValue("amplitude ratio")
    AMPLITUDE_RATIO("amplitude ratio"),

    /**
     * A particular extent of space or surface.
     * 
     */
    @XmlEnumValue("area")
    AREA("area"),

    /**
     * The amount of reduction in the amplitude of a wave.
     * 
     */
    @XmlEnumValue("attenuation")
    ATTENUATION("attenuation"),

    /**
     * The amount of reduction in the amplitude of an acoustic wave.
     * 
     */
    @XmlEnumValue("attenuation of acoustic wave")
    ATTENUATION_OF_ACOUSTIC_WAVE("attenuation of acoustic wave"),

    /**
     * The amount of reduction in the amplitude of an electromagnetic wave.
     * 
     */
    @XmlEnumValue("attenuation of E-M wave")
    ATTENUATION_OF_E_M_WAVE("attenuation of E-M wave"),

    /**
     * A general classification for measurements which are very specialized and not normally accessed by petrophysicists.
     * 
     */
    @XmlEnumValue("auxiliary")
    AUXILIARY("auxiliary"),

    /**
     * The pore volume of a rock averaged using various well log or core porosity measurements.
     * 
     */
    @XmlEnumValue("average porosity")
    AVERAGE_POROSITY("average porosity"),

    /**
     * In the horizontal plane, it is the clockwise angle of departure from magnetic north (while looking down hole).
     * 
     */
    @XmlEnumValue("azimuth")
    AZIMUTH("azimuth"),

    /**
     * A trace which has been corrected for the effects of barite in the borehole fluid.
     * 
     */
    @XmlEnumValue("barite mud correction")
    BARITE_MUD_CORRECTION("barite mud correction"),

    /**
     * A trace which has been corrected for bed thickness effects.
     * 
     */
    @XmlEnumValue("bed thickness correction")
    BED_THICKNESS_CORRECTION("bed thickness correction"),

    /**
     * The diameter of the drill bit used to drill the hole.
     * 
     */
    @XmlEnumValue("bit size")
    BIT_SIZE("bit size"),

    /**
     * A well log trace which has been edited to reflect sharp bed boundaries.  The trace has a square wave appearance.
     * 
     */
    @XmlEnumValue("blocked")
    BLOCKED("blocked"),

    /**
     * A trace which has been corrected for the effects of the borehole environment; e.g., borehole size.
     * 
     */
    @XmlEnumValue("borehole environment correction")
    BOREHOLE_ENVIRONMENT_CORRECTION("borehole environment correction"),

    /**
     * Deprecated. Use mud composition correction.
     * 
     */
    @XmlEnumValue("borehole fluid composition correction")
    BOREHOLE_FLUID_COMPOSITION_CORRECTION("borehole fluid composition correction"),

    /**
     * A trace which has been corrected for the effects of borehole fluid; e.g., a mud cake correction.
     * 
     */
    @XmlEnumValue("borehole fluid correction")
    BOREHOLE_FLUID_CORRECTION("borehole fluid correction"),

    /**
     * A trace which has been corrected for the effects of borehole size.
     * 
     */
    @XmlEnumValue("borehole size correction")
    BOREHOLE_SIZE_CORRECTION("borehole size correction"),

    /**
     * A trace which has been corrected for the effects of bromide in the borehole fluid.
     * 
     */
    @XmlEnumValue("bromide mud correction")
    BROMIDE_MUD_CORRECTION("bromide mud correction"),

    /**
     * The relative compressibility of a material.
     * 
     */
    @XmlEnumValue("bulk compressibility")
    BULK_COMPRESSIBILITY("bulk compressibility"),

    /**
     * The measured density of a rock with the pore volume filled with fluid.  The pore fluid is generally assumed to be water.
     * 
     */
    @XmlEnumValue("bulk density")
    BULK_DENSITY("bulk density"),

    /**
     * A quantity per unit volume.
     * 
     */
    @XmlEnumValue("bulk volume")
    BULK_VOLUME("bulk volume"),

    /**
     * The quantity of gas present in a unit volume of rock.  The product of gas saturation and total porosity.
     * 
     */
    @XmlEnumValue("bulk volume gas")
    BULK_VOLUME_GAS("bulk volume gas"),

    /**
     * The quantity of hydrocarbon present in a unit volume of rock.  The product of hydrocarbon saturation and total porosity.
     * 
     */
    @XmlEnumValue("bulk volume hydrocarbon")
    BULK_VOLUME_HYDROCARBON("bulk volume hydrocarbon"),

    /**
     * The quantity of oil present in a unit volume of rock.  The product of oil saturation and total porosity.
     * 
     */
    @XmlEnumValue("bulk volume oil")
    BULK_VOLUME_OIL("bulk volume oil"),

    /**
     * The quantity of formation water present in a unit volume of rock.  The product of water saturation and total porosity.
     * 
     */
    @XmlEnumValue("bulk volume water")
    BULK_VOLUME_WATER("bulk volume water"),

    /**
     * The ratio of the Carbon measurement to the Oxygen measurement.
     * 
     */
    @XmlEnumValue("C/O ratio")
    C_O_RATIO("C/O ratio"),

    /**
     * A well log used to record hole diameter (open or cased).
     * 
     */
    @XmlEnumValue("caliper")
    CALIPER("caliper"),

    /**
     * A trace which has been corrected for the effects of being recorded in a cased hole; e.g., corrected for casing weight and thickness.
     * 
     */
    @XmlEnumValue("cased hole correction")
    CASED_HOLE_CORRECTION("cased hole correction"),

    /**
     * The signal measured by a device at the location of casing collars and other features (e.g., perforations).
     * 
     */
    @XmlEnumValue("casing collar locator")
    CASING_COLLAR_LOCATOR("casing collar locator"),

    /**
     * A trace which has been corrected for the effects of casing; this includes things such as casing weight, thickness and diameter.
     * 
     */
    @XmlEnumValue("casing correction")
    CASING_CORRECTION("casing correction"),

    /**
     * A trace which has been corrected for the effects of casing diameter.
     * 
     */
    @XmlEnumValue("casing diameter correction")
    CASING_DIAMETER_CORRECTION("casing diameter correction"),

    /**
     * Any of the measurements made for the purpose of determining the properties of the well casing.
     * 
     */
    @XmlEnumValue("casing inspection")
    CASING_INSPECTION("casing inspection"),

    /**
     * A trace which has been corrected for the effects of casing thickness.
     * 
     */
    @XmlEnumValue("casing thickness correction")
    CASING_THICKNESS_CORRECTION("casing thickness correction"),

    /**
     * A trace which has been corrected for the effects of casing weight.
     * 
     */
    @XmlEnumValue("casing weight correction")
    CASING_WEIGHT_CORRECTION("casing weight correction"),

    /**
     * A trace which has been corrected for the effects of the cement surrounding the casing; this includes cement thickness, density and type.
     * 
     */
    @XmlEnumValue("cement correction")
    CEMENT_CORRECTION("cement correction"),

    /**
     * A trace which has been corrected for the effects of cement density.
     * 
     */
    @XmlEnumValue("cement density correction")
    CEMENT_DENSITY_CORRECTION("cement density correction"),

    /**
     * Any of the measurements made to determine the presence and quality of the cement bond to casing or to formation.
     * 
     */
    @XmlEnumValue("cement evaluation")
    CEMENT_EVALUATION("cement evaluation"),

    /**
     * A trace which has been corrected for the effects of cement thickness.
     * 
     */
    @XmlEnumValue("cement thickness correction")
    CEMENT_THICKNESS_CORRECTION("cement thickness correction"),

    /**
     * A trace which has been corrected for the effects of the type of cement used.
     * 
     */
    @XmlEnumValue("cement type correction")
    CEMENT_TYPE_CORRECTION("cement type correction"),
    @XmlEnumValue("CH density porosity")
    CH_DENSITY_POROSITY("CH density porosity"),

    /**
     * Porosity calculated from the bulk density measurement of a cased hole density log using a dolomite matrix density.
     * 
     */
    @XmlEnumValue("CH dolomite density porosity")
    CH_DOLOMITE_DENSITY_POROSITY("CH dolomite density porosity"),

    /**
     * Porosity calculated from a cased hole neutron log using a dolomite matrix.
     * 
     */
    @XmlEnumValue("CH dolomite neutron porosity")
    CH_DOLOMITE_NEUTRON_POROSITY("CH dolomite neutron porosity"),

    /**
     * Porosity calculated from the bulk density measurement of a cased hole density log using a limestone matrix density.
     * 
     */
    @XmlEnumValue("CH limestone density porosity")
    CH_LIMESTONE_DENSITY_POROSITY("CH limestone density porosity"),

    /**
     * Porosity calculated from a cased hole neutron log using a limestone matrix.
     * 
     */
    @XmlEnumValue("CH limestone neutron porosity")
    CH_LIMESTONE_NEUTRON_POROSITY("CH limestone neutron porosity"),
    @XmlEnumValue("CH neutron porosity")
    CH_NEUTRON_POROSITY("CH neutron porosity"),

    /**
     * Porosity calculated from the bulk density measurement of a cased hole density log using a sandstone matrix density.
     * 
     */
    @XmlEnumValue("CH sandstone density porosity")
    CH_SANDSTONE_DENSITY_POROSITY("CH sandstone density porosity"),

    /**
     * Porosity calculated from an open hole neutron log using a sandstone matrix.
     * 
     */
    @XmlEnumValue("CH sandstone neutron porosity")
    CH_SANDSTONE_NEUTRON_POROSITY("CH sandstone neutron porosity"),

    /**
     * Porosity calculated from a compressional wave acoustic log using a dolomite matrix.
     * 
     */
    @XmlEnumValue("compressional wave dolomite porosity")
    COMPRESSIONAL_WAVE_DOLOMITE_POROSITY("compressional wave dolomite porosity"),

    /**
     * Porosity calculated from a compressional wave acoustic log using a limestone matrix
     * 
     */
    @XmlEnumValue("compressional wave limestone porosity")
    COMPRESSIONAL_WAVE_LIMESTONE_POROSITY("compressional wave limestone porosity"),

    /**
     * The time it takes for a compressional acoustic wave to traverse a fixed distance of a given material or matrix. In this case the material or matrix is a specific, zero porosity rock, e.g. sandstone, limestone or dolomite.
     * 
     */
    @XmlEnumValue("compressional wave matrix travel time")
    COMPRESSIONAL_WAVE_MATRIX_TRAVEL_TIME("compressional wave matrix travel time"),

    /**
     * Porosity calculated from a compressional wave acoustic log using a sandstone matrix.
     * 
     */
    @XmlEnumValue("compressional wave sandstone porosity")
    COMPRESSIONAL_WAVE_SANDSTONE_POROSITY("compressional wave sandstone porosity"),

    /**
     * The time it takes for a compressional acoustic wave to traverse a fixed distance.
     * 
     */
    @XmlEnumValue("compressional wave travel time")
    COMPRESSIONAL_WAVE_TRAVEL_TIME("compressional wave travel time"),

    /**
     * The property of a medium (solid or fluid) which allows the medium to conduct a form of energy; e.g., electrical conductivity or thermal conductivity.
     * 
     */
    @XmlEnumValue("conductivity")
    CONDUCTIVITY("conductivity"),

    /**
     * Conductivity calculated from the attenuation of an electromagnetic wave. Generally recorded from a LWD resistivity tool.
     * 
     */
    @XmlEnumValue("conductivity from attenuation")
    CONDUCTIVITY_FROM_ATTENUATION("conductivity from attenuation"),

    /**
     * Conductivity calculated from the phase shift of an electromagnetic wave. Generally recorded from a LWD resistivity tool.
     * 
     */
    @XmlEnumValue("conductivity from phase shift")
    CONDUCTIVITY_FROM_PHASE_SHIFT("conductivity from phase shift"),

    /**
     * The conductivity of the water entrapped in the interstices of the rock.
     * 
     */
    @XmlEnumValue("connate water conductivity")
    CONNATE_WATER_CONDUCTIVITY("connate water conductivity"),

    /**
     * The resistivity of the water entrapped in the interstices of the rock.
     * 
     */
    @XmlEnumValue("connate water resistivity")
    CONNATE_WATER_RESISTIVITY("connate water resistivity"),

    /**
     * Porosity from a measurement made on a conventional core.
     * 
     */
    @XmlEnumValue("conventional core porosity")
    CONVENTIONAL_CORE_POROSITY("conventional core porosity"),

    /**
     * The density of a rock matrix measured on a core sample.
     * 
     */
    @XmlEnumValue("core matrix density")
    CORE_MATRIX_DENSITY("core matrix density"),

    /**
     * The permeability derived from a core.
     * 
     */
    @XmlEnumValue("core permeability")
    CORE_PERMEABILITY("core permeability"),

    /**
     * Porosity from a core measurement.
     * 
     */
    @XmlEnumValue("core porosity")
    CORE_POROSITY("core porosity"),

    /**
     * A trace which has had corrections applied; e.g. environmental corrections.
     * 
     */
    @XmlEnumValue("corrected")
    CORRECTED("corrected"),

    /**
     * The rate of occurrences; e.g. the far counts from a density tool..
     * 
     */
    @XmlEnumValue("count rate")
    COUNT_RATE("count rate"),

    /**
     * The ratio of two count rates.
     * 
     */
    @XmlEnumValue("count rate ratio")
    COUNT_RATE_RATIO("count rate ratio"),

    /**
     * The pore volume of a rock calculated from cross plotting two or more well log porosity measurements.
     * 
     */
    @XmlEnumValue("cross plot porosity")
    CROSS_PLOT_POROSITY("cross plot porosity"),

    /**
     * The time it takes for a population to decay, generally expressed as a half life.
     * 
     */
    @XmlEnumValue("decay time")
    DECAY_TIME("decay time"),

    /**
     * The conductivity which represents a measurement made several feet into the formation; generally considered a measurement of the undisturbed formation.
     * 
     */
    @XmlEnumValue("deep conductivity")
    DEEP_CONDUCTIVITY("deep conductivity"),

    /**
     * The conductivity, measured by an induction log, which represents a measurement made several feet into the formation; generally considered a measurement of the undisturbed formation.
     * 
     */
    @XmlEnumValue("deep induction conductivity")
    DEEP_INDUCTION_CONDUCTIVITY("deep induction conductivity"),

    /**
     * The resistivity, measured by an induction log, which represents a measurement made several feet into the formation; generally considered a measurement of the undisturbed formation.
     * 
     */
    @XmlEnumValue("deep induction resistivity")
    DEEP_INDUCTION_RESISTIVITY("deep induction resistivity"),

    /**
     * The conductivity, measured by a laterolog, which represents a measurement made several feet into the formation; generally considered a measurement of the undisturbed formation.
     * 
     */
    @XmlEnumValue("deep laterolog conductivity")
    DEEP_LATEROLOG_CONDUCTIVITY("deep laterolog conductivity"),

    /**
     * The resistivity, measured by a laterolog, which represents a measurement made several feet into the formation; generally considered a measurement of the undisturbed formation.
     * 
     */
    @XmlEnumValue("deep laterolog resistivity")
    DEEP_LATEROLOG_RESISTIVITY("deep laterolog resistivity"),

    /**
     * The resistivity which represents a measurement made several feet into the formation; generally considered a measurement of the undisturbed formation.
     * 
     */
    @XmlEnumValue("deep resistivity")
    DEEP_RESISTIVITY("deep resistivity"),

    /**
     * Mass per unit Volume - well logging units are usually gm/cc.
     * 
     */
    @XmlEnumValue("density")
    DENSITY("density"),

    /**
     * Porosity calculated using the bulk density measurement from a density log.
     * 
     */
    @XmlEnumValue("density porosity")
    DENSITY_POROSITY("density porosity"),

    /**
     * The distance to a point in a wellbore.
     * 
     */
    @XmlEnumValue("depth")
    DEPTH("depth"),

    /**
     * The process of depth correcting a trace by depth matching it to a reference trace.
     * 
     */
    @XmlEnumValue("depth adjusted")
    DEPTH_ADJUSTED("depth adjusted"),

    /**
     * The depth calculated from velocity information.
     * 
     */
    @XmlEnumValue("depth derived from velocity")
    DEPTH_DERIVED_FROM_VELOCITY("depth derived from velocity"),

    /**
     * Departure of a borehole from vertical.  Also, the angle measured between the tool axis and vertical.
     * 
     */
    @XmlEnumValue("deviation")
    DEVIATION("deviation"),

    /**
     * Relative permittivity.
     * 
     */
    @XmlEnumValue("dielectric")
    DIELECTRIC("dielectric"),

    /**
     * A trace which has been corrected for the effects of diffusion.
     * 
     */
    @XmlEnumValue("diffusion correction")
    DIFFUSION_CORRECTION("diffusion correction"),

    /**
     * The angle that a structural surface, e.g. a bedding or fault plane, makes with the horizontal, measured perpendicular to the strike of the structure.
     * 
     */
    @XmlEnumValue("dip")
    DIP("dip"),

    /**
     * Any of a number of measurements produced by a tool designed to measure formation dip and borehole characteristics through direct and indirect measurements.
     * 
     */
    @XmlEnumValue("dipmeter")
    DIPMETER("dipmeter"),

    /**
     * The conductivity, measured by a dipmeter, which represents a measurement made approximately one to two feet into the formation; generally considered to measure the formation where it contains fluids which are comprised primarily of mud filtrate.
     * 
     */
    @XmlEnumValue("dipmeter conductivity")
    DIPMETER_CONDUCTIVITY("dipmeter conductivity"),

    /**
     * The resistivity, measured by a dipmeter, which represents a measurement made approximately one to two feet into the formation; generally considered to measure the formation where it contains fluids which are comprised primarily of mud filtrate.
     * 
     */
    @XmlEnumValue("dipmeter resistivity")
    DIPMETER_RESISTIVITY("dipmeter resistivity"),

    /**
     * Porosity calculated from an acoustic log using a dolomite matrix.
     * 
     */
    @XmlEnumValue("dolomite acoustic porosity")
    DOLOMITE_ACOUSTIC_POROSITY("dolomite acoustic porosity"),

    /**
     * Porosity calculated from the bulk density measurement of a density log using a dolomite matrix density.
     * 
     */
    @XmlEnumValue("dolomite density porosity")
    DOLOMITE_DENSITY_POROSITY("dolomite density porosity"),

    /**
     * Porosity calculated from a neutron log using a dolomite matrix.
     * 
     */
    @XmlEnumValue("dolomite neutron porosity")
    DOLOMITE_NEUTRON_POROSITY("dolomite neutron porosity"),

    /**
     * A well log trace which has been corrected or adjusted through an editing process.
     * 
     */
    @XmlEnumValue("edited")
    EDITED("edited"),

    /**
     * The interconnected pore volume occupied by free fluids.
     * 
     */
    @XmlEnumValue("effective porosity")
    EFFECTIVE_POROSITY("effective porosity"),

    /**
     * The flow of electric charge.
     * 
     */
    @XmlEnumValue("electric current")
    ELECTRIC_CURRENT("electric current"),

    /**
     * The difference in electrical energy between two systems.
     * 
     */
    @XmlEnumValue("electric potential")
    ELECTRIC_POTENTIAL("electric potential"),

    /**
     * The time it takes for an electromagnetic wave to traverse a fixed distance of a given material or matrix. In this case the material or matrix is a specific, zero porosity rock, e.g. sandstone, limestone or dolomite.
     * 
     */
    @XmlEnumValue("electromagnetic wave matrix travel time")
    ELECTROMAGNETIC_WAVE_MATRIX_TRAVEL_TIME("electromagnetic wave matrix travel time"),

    /**
     * The time it takes for an electromagnetic wave to traverse a fixed distance.
     * 
     */
    @XmlEnumValue("electromagnetic wave travel time")
    ELECTROMAGNETIC_WAVE_TRAVEL_TIME("electromagnetic wave travel time"),

    /**
     * The elemental composition, generally in weight percent, of a formation as calculated from information obtained from a geochemical logging pass; e.g., weight percent of Al, Si, Ca, Fe, etc.
     * 
     */
    @XmlEnumValue("element")
    ELEMENT("element"),

    /**
     * The ratio of two different elemental measurements; e.g. K/U.
     * 
     */
    @XmlEnumValue("elemental ratio")
    ELEMENTAL_RATIO("elemental ratio"),

    /**
     * A well log trace which has been filtered to improve its value; e.g. inverse filtering for better resolution.
     * 
     */
    @XmlEnumValue("enhanced")
    ENHANCED("enhanced"),

    /**
     * A well log trace which has had a filter applied to it.
     * 
     */
    @XmlEnumValue("filtered")
    FILTERED("filtered"),

    /**
     * A logging tool to measure the rate and/or direction of fluid flow in a wellbore.
     * 
     */
    @XmlEnumValue("flowmeter")
    FLOWMETER("flowmeter"),

    /**
     * The quantity per unit volume of fluid.
     * 
     */
    @XmlEnumValue("fluid density")
    FLUID_DENSITY("fluid density"),

    /**
     * The velocity of a flowing fluid.
     * 
     */
    @XmlEnumValue("fluid velocity")
    FLUID_VELOCITY("fluid velocity"),

    /**
     * The amount of a fluid resistance to flow.
     * 
     */
    @XmlEnumValue("fluid viscosity")
    FLUID_VISCOSITY("fluid viscosity"),

    /**
     * The conductivity of the zone immediately behind the mud cake and which is considered to be flushed by mud filtrate, i.e., it is considered to have all mobile formation fluids displaced from it.
     * 
     */
    @XmlEnumValue("flushed zone conductivity")
    FLUSHED_ZONE_CONDUCTIVITY("flushed zone conductivity"),

    /**
     * The resistivity of the zone immediately behind the mud cake and which is considered to be flushed by mud filtrate, i.e., it is considered to have all mobile formation fluids displaced from it.
     * 
     */
    @XmlEnumValue("flushed zone resistivity")
    FLUSHED_ZONE_RESISTIVITY("flushed zone resistivity"),

    /**
     * The fraction or percentage of pore volume of rock occupied by drilling mud or mud filtrate in the flushed zone.
     * 
     */
    @XmlEnumValue("flushed zone saturation")
    FLUSHED_ZONE_SATURATION("flushed zone saturation"),

    /**
     * Energy exerted or brought to bear.
     * 
     */
    @XmlEnumValue("force")
    FORCE("force"),

    /**
     * A trace which has been corrected for formation density effects.
     * 
     */
    @XmlEnumValue("formation density correction")
    FORMATION_DENSITY_CORRECTION("formation density correction"),

    /**
     * A trace which has been corrected for formation properties; e.g., salinity.
     * 
     */
    @XmlEnumValue("formation properties correction")
    FORMATION_PROPERTIES_CORRECTION("formation properties correction"),

    /**
     * A trace which has been corrected for the salinity effects from the water in the formation.
     * 
     */
    @XmlEnumValue("formation salinity correction")
    FORMATION_SALINITY_CORRECTION("formation salinity correction"),

    /**
     * A trace which has been corrected for formation saturation effects.
     * 
     */
    @XmlEnumValue("formation saturation correction")
    FORMATION_SATURATION_CORRECTION("formation saturation correction"),

    /**
     * A trace which has been corrected for the effects of the hydrocarbon formation volume factor.
     * 
     */
    @XmlEnumValue("formation volume factor correction")
    FORMATION_VOLUME_FACTOR_CORRECTION("formation volume factor correction"),

    /**
     * A trace which has been corrected for the effects of the density of the formation water.
     * 
     */
    @XmlEnumValue("formation water density correction")
    FORMATION_WATER_DENSITY_CORRECTION("formation water density correction"),

    /**
     * A trace which has been corrected for water saturation effects.
     * 
     */
    @XmlEnumValue("formation water saturation correction")
    FORMATION_WATER_SATURATION_CORRECTION("formation water saturation correction"),

    /**
     * The percent of the bulk volume occupied by fluids which are free to flow as measured by the nuclear magnetism log.
     * 
     */
    @XmlEnumValue("free fluid index")
    FREE_FLUID_INDEX("free fluid index"),

    /**
     * A trace which has been corrected for the effects of friction.
     * 
     */
    @XmlEnumValue("friction effect correction")
    FRICTION_EFFECT_CORRECTION("friction effect correction"),

    /**
     * The measurement of naturally occurring Gamma Ray radiation being released by radioisotopes in clay or other minerals in the formation.
     * 
     */
    @XmlEnumValue("gamma ray")
    GAMMA_RAY("gamma ray"),

    /**
     * The measurement of the naturally occurring gamma radiation less the radiation attributed to uranium.
     * 
     */
    @XmlEnumValue("gamma ray minus uranium")
    GAMMA_RAY_MINUS_URANIUM("gamma ray minus uranium"),

    /**
     * The fraction or percentage of pore volume of rock occupied by gas.
     * 
     */
    @XmlEnumValue("gas saturation")
    GAS_SATURATION("gas saturation"),

    /**
     * The measurement of the average density of fluids in a wellbore.
     * 
     */
    @XmlEnumValue("gradiomanometer")
    GRADIOMANOMETER("gradiomanometer"),

    /**
     * A measurement of the conductivity of the formation, by a high frequency electromagnetic tool, within the first few cubic inches of the borehole wall.
     * 
     */
    @XmlEnumValue("high frequency conductivity")
    HIGH_FREQUENCY_CONDUCTIVITY("high frequency conductivity"),

    /**
     * High frequency electromagnetic measurements, e.g. from a dielectric logging tool.
     * 
     */
    @XmlEnumValue("high frequency electromagnetic")
    HIGH_FREQUENCY_ELECTROMAGNETIC("high frequency electromagnetic"),

    /**
     * Porosity calculated using a high frequency electromagnetic measurement as input.
     * 
     */
    @XmlEnumValue("high frequency electromagnetic porosity")
    HIGH_FREQUENCY_ELECTROMAGNETIC_POROSITY("high frequency electromagnetic porosity"),

    /**
     * The amount of change in the phase of a high frequency electromagnetic wave.
     * 
     */
    @XmlEnumValue("high frequency E-M phase shift")
    HIGH_FREQUENCY_E_M_PHASE_SHIFT("high frequency E-M phase shift"),

    /**
     *  A measurement of the resistivity of the formation, by a high frequency electromagnetic tool, within the first few cubic inches of the borehole wall.
     * 
     */
    @XmlEnumValue("high frequency resistivity")
    HIGH_FREQUENCY_RESISTIVITY("high frequency resistivity"),

    /**
     * A trace which has been corrected for the effects of hydrocarbons.
     * 
     */
    @XmlEnumValue("hydrocarbon correction")
    HYDROCARBON_CORRECTION("hydrocarbon correction"),

    /**
     * A trace which has been corrected for the effects of hydrocarbon density.
     * 
     */
    @XmlEnumValue("hydrocarbon density correction")
    HYDROCARBON_DENSITY_CORRECTION("hydrocarbon density correction"),

    /**
     * A trace which has been corrected for the effects of hydrocarbon gravity.
     * 
     */
    @XmlEnumValue("hydrocarbon gravity correction")
    HYDROCARBON_GRAVITY_CORRECTION("hydrocarbon gravity correction"),

    /**
     * The fraction or percentage of pore volume of rock occupied by hydrocarbon.
     * 
     */
    @XmlEnumValue("hydrocarbon saturation")
    HYDROCARBON_SATURATION("hydrocarbon saturation"),

    /**
     * A trace which has been corrected for the effects of hydrocarbon viscosity.
     * 
     */
    @XmlEnumValue("hydrocarbon viscosity correction")
    HYDROCARBON_VISCOSITY_CORRECTION("hydrocarbon viscosity correction"),

    /**
     * The likeness of an object produced by an electrical device.
     * 
     */
    @XmlEnumValue("image")
    IMAGE("image"),

    /**
     * A variable in a well log interpretation equation.
     * 
     */
    @XmlEnumValue("interpretation variable")
    INTERPRETATION_VARIABLE("interpretation variable"),

    /**
     * A trace which has been corrected for the effects of iron in the borehole fluid.
     * 
     */
    @XmlEnumValue("iron mud correction")
    IRON_MUD_CORRECTION("iron mud correction"),

    /**
     * A well log trace which has had two or more runs spliced together to make a single trace.
     * 
     */
    @XmlEnumValue("joined")
    JOINED("joined"),

    /**
     * A trace which has been corrected for the effects of KCl in the borehole fluid.
     * 
     */
    @XmlEnumValue("KCl mud correction")
    K_CL_MUD_CORRECTION("KCl mud correction"),

    /**
     * A measured distance or dimension.
     * 
     */
    @XmlEnumValue("length")
    LENGTH("length"),

    /**
     * Porosity calculated from an acoustic log using a limestone matrix.
     * 
     */
    @XmlEnumValue("limestone acoustic porosity")
    LIMESTONE_ACOUSTIC_POROSITY("limestone acoustic porosity"),

    /**
     * Porosity calculated from the bulk density measurement of a density log using a limestone matrix density.
     * 
     */
    @XmlEnumValue("limestone density porosity")
    LIMESTONE_DENSITY_POROSITY("limestone density porosity"),

    /**
     * Porosity calculated from a neutron log using a limestone matrix.
     * 
     */
    @XmlEnumValue("limestone neutron porosity")
    LIMESTONE_NEUTRON_POROSITY("limestone neutron porosity"),

    /**
     * A trace which has been corrected for lithology effects.
     * 
     */
    @XmlEnumValue("lithology correction")
    LITHOLOGY_CORRECTION("lithology correction"),

    /**
     * The permeability derived from a well log.
     * 
     */
    @XmlEnumValue("log derived permeability")
    LOG_DERIVED_PERMEABILITY("log derived permeability"),

    /**
     * The density of a rock matrix used with, or derived from, the bulk density from a well log. The matrix is assumed to have zero porosity.
     * 
     */
    @XmlEnumValue("log matrix density")
    LOG_MATRIX_DENSITY("log matrix density"),

    /**
     * The signal measured by a magnetic device at the location of casing collars and other features (e.g., perforations).
     * 
     */
    @XmlEnumValue("magnetic casing collar locator")
    MAGNETIC_CASING_COLLAR_LOCATOR("magnetic casing collar locator"),

    /**
     * The density of a rock matrix.  In this case, the matrix is assumed to have zero porosity.
     * 
     */
    @XmlEnumValue("matrix density")
    MATRIX_DENSITY("matrix density"),

    /**
     * The time it takes for an electromagnetic or acoustic wave to traverse a fixed distance of a given material or matrix. In this case the material or matrix is a specific, zero porosity rock, e.g. sandstone, limestone or dolomite.
     * 
     */
    @XmlEnumValue("matrix travel time")
    MATRIX_TRAVEL_TIME("matrix travel time"),

    /**
     * The distance measured along the path of a wellbore.
     * 
     */
    @XmlEnumValue("measured depth")
    MEASURED_DEPTH("measured depth"),

    /**
     * A well log which uses a mechanical device to measure hole diameter.
     * 
     */
    @XmlEnumValue("mechanical caliper")
    MECHANICAL_CALIPER("mechanical caliper"),

    /**
     * The signal measured by a mechanical device at the location of casing collars and other features (e.g., perforations).
     * 
     */
    @XmlEnumValue("mechanical casing collar locator")
    MECHANICAL_CASING_COLLAR_LOCATOR("mechanical casing collar locator"),

    /**
     * The conductivity which represents a measurement made approximately two to three feet into the formation; generally considered to measure the formation where it contain fluids which are a mixture of mud filtrate, connate water and possibly hydrocarbons.
     * 
     */
    @XmlEnumValue("medium conductivity")
    MEDIUM_CONDUCTIVITY("medium conductivity"),

    /**
     *  The conductivity, made by an induction log, which represents a measurement made approximately two to three feet into the formation.
     * 
     */
    @XmlEnumValue("medium induction conductivity")
    MEDIUM_INDUCTION_CONDUCTIVITY("medium induction conductivity"),

    /**
     * The resistivity, made by an induction log, which represents a measurement made approximately two to three feet into the formation.
     * 
     */
    @XmlEnumValue("medium induction resistivity")
    MEDIUM_INDUCTION_RESISTIVITY("medium induction resistivity"),

    /**
     * The conductivity, measured by a laterolog, which represents a measurement made approximately two to three feet into the formation.
     * 
     */
    @XmlEnumValue("medium laterolog conductivity")
    MEDIUM_LATEROLOG_CONDUCTIVITY("medium laterolog conductivity"),

    /**
     * The resistivity, measured by a laterolog, which represents a measurement made approximately two to three feet into the formation.
     * 
     */
    @XmlEnumValue("medium laterolog resistivity")
    MEDIUM_LATEROLOG_RESISTIVITY("medium laterolog resistivity"),

    /**
     * The resistivity which represents a measurement made approximately two to three feet into the formation; generally considered to measure the formation where it contain fluids which are a mixture of mud filtrate, connate water and possibly hydrocarbons.
     * 
     */
    @XmlEnumValue("medium resistivity")
    MEDIUM_RESISTIVITY("medium resistivity"),

    /**
     * A measurement of the conductivity of the formation within the first few cubic inches of the borehole wall.
     * 
     */
    @XmlEnumValue("micro conductivity")
    MICRO_CONDUCTIVITY("micro conductivity"),

    /**
     * A conductivity measurement made by a micro log tool which measures within the first few cubic inches of the borehole wall.
     * 
     */
    @XmlEnumValue("micro inverse conductivity")
    MICRO_INVERSE_CONDUCTIVITY("micro inverse conductivity"),

    /**
     * A resistivity measurement made by a micro log tool which measures within the first few cubic inches of the borehole wall.
     * 
     */
    @XmlEnumValue("micro inverse resistivity")
    MICRO_INVERSE_RESISTIVITY("micro inverse resistivity"),

    /**
     * A measurement of the conductivity of the formation, by a laterolog, within the first few cubic inches of the borehole wall.
     * 
     */
    @XmlEnumValue("micro laterolog conductivity")
    MICRO_LATEROLOG_CONDUCTIVITY("micro laterolog conductivity"),

    /**
     * A measurement of the resistivity of the formation, by a laterolog, within the first few cubic inches of the borehole wall.
     * 
     */
    @XmlEnumValue("micro laterolog resistivity")
    MICRO_LATEROLOG_RESISTIVITY("micro laterolog resistivity"),

    /**
     * A conductivity measurement made by a micro log tool which measures within the first few cubic inches of the borehole wall.
     * 
     */
    @XmlEnumValue("micro normal conductivity")
    MICRO_NORMAL_CONDUCTIVITY("micro normal conductivity"),

    /**
     * A resistivity measurement made by a micro log tool which measures within the first few cubic inches of the borehole wall.
     * 
     */
    @XmlEnumValue("micro normal resistivity")
    MICRO_NORMAL_RESISTIVITY("micro normal resistivity"),

    /**
     * A measurement of the resistivity of the formation within the first few cubic inches of the borehole wall.
     * 
     */
    @XmlEnumValue("micro resistivity")
    MICRO_RESISTIVITY("micro resistivity"),

    /**
     * A measurement of the conductivity of the formation, by a spherically focused tool, within the first few cubic inches of the borehole wall.
     * 
     */
    @XmlEnumValue("micro spherically focused conductivity")
    MICRO_SPHERICALLY_FOCUSED_CONDUCTIVITY("micro spherically focused conductivity"),

    /**
     * A measurement of the resistivity of the formation, by a spherically focused tool, within the first few cubic inches of the borehole wall.
     * 
     */
    @XmlEnumValue("micro spherically focused resistivity")
    MICRO_SPHERICALLY_FOCUSED_RESISTIVITY("micro spherically focused resistivity"),

    /**
     * The mineral composition, generally in weight percent, of a formation as calculated from elemental information obtained from a geochemical logging pass; e.g., weight percent of dolomite, calcite, illite, quartzite, etc.
     * 
     */
    @XmlEnumValue("mineral")
    MINERAL("mineral"),

    /**
     * The conductivity of the filter cake, the residue deposited on the borehole wall as mud loses filtrate into porous and permeable rock.
     * 
     */
    @XmlEnumValue("mud cake conductivity")
    MUD_CAKE_CONDUCTIVITY("mud cake conductivity"),

    /**
     * A trace which has been corrected for the effects of mud cake; e.g., mud cake thickness and/or density.
     * 
     */
    @XmlEnumValue("mud cake correction")
    MUD_CAKE_CORRECTION("mud cake correction"),

    /**
     * A trace which has been corrected for the effects of mud cake density.
     * 
     */
    @XmlEnumValue("mud cake density correction")
    MUD_CAKE_DENSITY_CORRECTION("mud cake density correction"),

    /**
     * The resistivity of the filter cake, the residue deposited on the borehole wall as mud loses filtrate into porous and permeable rock.
     * 
     */
    @XmlEnumValue("mud cake resistivity")
    MUD_CAKE_RESISTIVITY("mud cake resistivity"),

    /**
     * A trace which has been corrected for the effects of mud cake resistivity.
     * 
     */
    @XmlEnumValue("mud cake resistivity correction")
    MUD_CAKE_RESISTIVITY_CORRECTION("mud cake resistivity correction"),

    /**
     * A trace which has been corrected for the effects of mud cake thickness.
     * 
     */
    @XmlEnumValue("mud cake thickness correction")
    MUD_CAKE_THICKNESS_CORRECTION("mud cake thickness correction"),

    /**
     * A trace which has been corrected for the effects of borehole fluid composition; e.g., a correction for KCl in the borehole fluid.
     * 
     */
    @XmlEnumValue("mud composition correction")
    MUD_COMPOSITION_CORRECTION("mud composition correction"),

    /**
     *  The conductivity of the continuous phase liquid used for the drilling of the well.
     * 
     */
    @XmlEnumValue("mud conductivity")
    MUD_CONDUCTIVITY("mud conductivity"),

    /**
     * The conductivity of the effluent of the continuous phase liquid of the drilling mud which permeates porous and permeable rock.
     * 
     */
    @XmlEnumValue("mud filtrate conductivity")
    MUD_FILTRATE_CONDUCTIVITY("mud filtrate conductivity"),

    /**
     * A trace which has been corrected for the effects of mud filtrate.  This includes things such as filtrate salinity.
     * 
     */
    @XmlEnumValue("mud filtrate correction")
    MUD_FILTRATE_CORRECTION("mud filtrate correction"),

    /**
     * A trace which has been corrected for the effects of mud filtrate density.
     * 
     */
    @XmlEnumValue("mud filtrate density correction")
    MUD_FILTRATE_DENSITY_CORRECTION("mud filtrate density correction"),

    /**
     * The resistivity of the effluent of the continuous phase liquid of the drilling mud which permeates porous and permeable rock.
     * 
     */
    @XmlEnumValue("mud filtrate resistivity")
    MUD_FILTRATE_RESISTIVITY("mud filtrate resistivity"),

    /**
     * A trace which has been corrected for the effects of mud filtrate resistivity.
     * 
     */
    @XmlEnumValue("mud filtrate resistivity correction")
    MUD_FILTRATE_RESISTIVITY_CORRECTION("mud filtrate resistivity correction"),

    /**
     * A trace which has been corrected for the effects of mud filtrate salinity.
     * 
     */
    @XmlEnumValue("mud filtrate salinity correction")
    MUD_FILTRATE_SALINITY_CORRECTION("mud filtrate salinity correction"),

    /**
     * The resistivity of the continuous phase liquid used for the drilling of the well.
     * 
     */
    @XmlEnumValue("mud resistivity")
    MUD_RESISTIVITY("mud resistivity"),

    /**
     * A trace which has been corrected for the effects of salinity in the borehole fluid.
     * 
     */
    @XmlEnumValue("mud salinity correction")
    MUD_SALINITY_CORRECTION("mud salinity correction"),

    /**
     * A trace which has been corrected for the effects of the viscosity of the borehole fluid.
     * 
     */
    @XmlEnumValue("mud viscosity correction")
    MUD_VISCOSITY_CORRECTION("mud viscosity correction"),

    /**
     * A trace which has been corrected for the effects of weighting the borehole fluid.
     * 
     */
    @XmlEnumValue("mud weight correction")
    MUD_WEIGHT_CORRECTION("mud weight correction"),

    /**
     * The time it takes for a neutron population to die away to half value.
     * 
     */
    @XmlEnumValue("neutron die away time")
    NEUTRON_DIE_AWAY_TIME("neutron die away time"),

    /**
     * Porosity from a neutron log.
     * 
     */
    @XmlEnumValue("neutron porosity")
    NEUTRON_POROSITY("neutron porosity"),

    /**
     * A well log which uses a nuclear device to measure hole diameter.
     * 
     */
    @XmlEnumValue("nuclear caliper")
    NUCLEAR_CALIPER("nuclear caliper"),

    /**
     * The decay time of a nuclear magnetic signal.
     * 
     */
    @XmlEnumValue("nuclear magnetic decay time")
    NUCLEAR_MAGNETIC_DECAY_TIME("nuclear magnetic decay time"),

    /**
     * The permeability derived from a nuclear magnetism log.
     * 
     */
    @XmlEnumValue("nuclear magnetism log permeability")
    NUCLEAR_MAGNETISM_LOG_PERMEABILITY("nuclear magnetism log permeability"),

    /**
     * Porosity calculated using the measurements from a nuclear magnetism logging pass.
     * 
     */
    @XmlEnumValue("nuclear magnetism porosity")
    NUCLEAR_MAGNETISM_POROSITY("nuclear magnetism porosity"),
    @XmlEnumValue("OH density porosity")
    OH_DENSITY_POROSITY("OH density porosity"),

    /**
     * Porosity calculated from the bulk density measurement of an open hole density log using a dolomite matrix density.
     * 
     */
    @XmlEnumValue("OH dolomite density porosity")
    OH_DOLOMITE_DENSITY_POROSITY("OH dolomite density porosity"),

    /**
     * Porosity calculated from an open hole neutron log using a dolomite matrix.
     * 
     */
    @XmlEnumValue("OH dolomite neutron porosity")
    OH_DOLOMITE_NEUTRON_POROSITY("OH dolomite neutron porosity"),

    /**
     * Porosity calculated from the bulk density measurement of an open hole density log using a limestone matrix density.
     * 
     */
    @XmlEnumValue("OH limestone density porosity")
    OH_LIMESTONE_DENSITY_POROSITY("OH limestone density porosity"),

    /**
     * Porosity calculated from an open hole neutron log using a limestone matrix.
     * 
     */
    @XmlEnumValue("OH limestone neutron porosity")
    OH_LIMESTONE_NEUTRON_POROSITY("OH limestone neutron porosity"),
    @XmlEnumValue("OH neutron porosity")
    OH_NEUTRON_POROSITY("OH neutron porosity"),

    /**
     * Porosity calculated from the bulk density measurement of an open hole density log using a sandstone matrix density.
     * 
     */
    @XmlEnumValue("OH sandstone density porosity")
    OH_SANDSTONE_DENSITY_POROSITY("OH sandstone density porosity"),

    /**
     * Porosity calculated from an open hole neutron log using a sandstone matrix.
     * 
     */
    @XmlEnumValue("OH sandstone neutron porosity")
    OH_SANDSTONE_NEUTRON_POROSITY("OH sandstone neutron porosity"),

    /**
     * A trace which has been corrected for the effects of oil based borehole fluid.
     * 
     */
    @XmlEnumValue("oil based mud correction")
    OIL_BASED_MUD_CORRECTION("oil based mud correction"),

    /**
     * The fraction or percentage of pore volume of rock occupied by oil.
     * 
     */
    @XmlEnumValue("oil saturation")
    OIL_SATURATION("oil saturation"),

    /**
     * The procedure for introducing holes through casing into a formation so that formation fluids can enter into the casing.
     * 
     */
    @XmlEnumValue("perforating")
    PERFORATING("perforating"),

    /**
     * The permeability of the surrounding formation.
     * 
     */
    @XmlEnumValue("permeability")
    PERMEABILITY("permeability"),

    /**
     * A change or variation according to a harmonic law from a standard position or instant of starting.
     * 
     */
    @XmlEnumValue("phase shift")
    PHASE_SHIFT("phase shift"),

    /**
     * The effect measured by the density log and produced by the process of a photon colliding with an atom, and then being completely absorbed and its total energy used to eject one of the orbital electrons from those surrounding the nucleus.
     * 
     */
    @XmlEnumValue("photoelectric absorption")
    PHOTOELECTRIC_ABSORPTION("photoelectric absorption"),

    /**
     * The correction that is to be made to the photoelectric absorption curve.
     * 
     */
    @XmlEnumValue("photoelectric absorption correction")
    PHOTOELECTRIC_ABSORPTION_CORRECTION("photoelectric absorption correction"),

    /**
     * A trace which has been corrected for various physical measurement effects; e.g. spreading loss.
     * 
     */
    @XmlEnumValue("physical measurement correction")
    PHYSICAL_MEASUREMENT_CORRECTION("physical measurement correction"),

    /**
     * An angle formed by two intersecting lines.
     * 
     */
    @XmlEnumValue("plane angle")
    PLANE_ANGLE("plane angle"),

    /**
     * The total pore volume occupied by fluid in a rock. Includes isolated nonconnecting pores and volume occupied by absorbed, immobile fluid.
     * 
     */
    @XmlEnumValue("porosity")
    POROSITY("porosity"),

    /**
     * A trace which has been corrected for porosity effects.
     * 
     */
    @XmlEnumValue("porosity correction")
    POROSITY_CORRECTION("porosity correction"),

    /**
     * The measurement of gamma radiation emitted by potassium.
     * 
     */
    @XmlEnumValue("potassium")
    POTASSIUM("potassium"),

    /**
     * The force or thrust exerted upon a surface divided by the area of the surface.
     * 
     */
    @XmlEnumValue("pressure")
    PRESSURE("pressure"),

    /**
     * A trace which has been corrected for the effects of pressure in the borehole.
     * 
     */
    @XmlEnumValue("pressure correction")
    PRESSURE_CORRECTION("pressure correction"),

    /**
     * A well log trace which has been processed in some way; e.g., depth adjusted or environmentally corrected.
     * 
     */
    @XmlEnumValue("processed")
    PROCESSED("processed"),

    /**
     * Porosity calculated from a pulsed neutron log.
     * 
     */
    @XmlEnumValue("pulsed neutron porosity")
    PULSED_NEUTRON_POROSITY("pulsed neutron porosity"),

    /**
     * Degree of excellence.
     * 
     */
    @XmlEnumValue("quality")
    QUALITY("quality"),

    /**
     * A relationship between two values usually expressed as a fraction.
     * 
     */
    @XmlEnumValue("ratio")
    RATIO("ratio"),

    /**
     * A well log trace which has not had any processing.  In other words, a trace which has not been depth adjusted or environmentally corrected.
     * 
     */
    @XmlEnumValue("raw")
    RAW("raw"),

    /**
     * While looking down hole, it is the clockwise angle from the upper side of the sonde to the reference pad or electrode.
     * 
     */
    @XmlEnumValue("relative bearing")
    RELATIVE_BEARING("relative bearing"),

    /**
     * The property measuring the resistance to flow of an electrical current.
     * 
     */
    @XmlEnumValue("resistivity")
    RESISTIVITY("resistivity"),

    /**
     * A trace which has been corrected for resistivity factor effects.
     * 
     */
    @XmlEnumValue("resistivity factor correction")
    RESISTIVITY_FACTOR_CORRECTION("resistivity factor correction"),

    /**
     * Resistivity calculated from the attenuation of an electromagnetic wave. Generally recorded from a LWD resistivity tool.
     * 
     */
    @XmlEnumValue("resistivity from attenuation")
    RESISTIVITY_FROM_ATTENUATION("resistivity from attenuation"),

    /**
     * Resistivity calculated from the phase shift of an electromagnetic wave. Generally recorded from a LWD resistivity tool.
     * 
     */
    @XmlEnumValue("resistivity from phase shift")
    RESISTIVITY_FROM_PHASE_SHIFT("resistivity from phase shift"),

    /**
     * The amount of change in the phase of an electrical wave.
     * 
     */
    @XmlEnumValue("resistivity phase shift")
    RESISTIVITY_PHASE_SHIFT("resistivity phase shift"),

    /**
     * The ratio of two resistivity values.
     * 
     */
    @XmlEnumValue("resistivity ratio")
    RESISTIVITY_RATIO("resistivity ratio"),

    /**
     * The concentration of ions in solution.
     * 
     */
    @XmlEnumValue("salinity")
    SALINITY("salinity"),

    /**
     * To take a sample of or from something.
     * 
     */
    @XmlEnumValue("sampling")
    SAMPLING("sampling"),

    /**
     * Porosity calculated from an acoustic log using a sandstone matrix.
     * 
     */
    @XmlEnumValue("sandstone acoustic porosity")
    SANDSTONE_ACOUSTIC_POROSITY("sandstone acoustic porosity"),

    /**
     * Porosity calculated from the bulk density measurement of a density log using a sandstone matrix density.
     * 
     */
    @XmlEnumValue("sandstone density porosity")
    SANDSTONE_DENSITY_POROSITY("sandstone density porosity"),

    /**
     * Porosity calculated from a neutron log using a sandstone matrix.
     * 
     */
    @XmlEnumValue("sandstone neutron porosity")
    SANDSTONE_NEUTRON_POROSITY("sandstone neutron porosity"),

    /**
     * The fraction or percentage of the pore volume of a rock.
     * 
     */
    @XmlEnumValue("saturation")
    SATURATION("saturation"),

    /**
     * An estimate of the amount of shale present in the formation. Frequently calculated from a gamma ray or SP curve.
     * 
     */
    @XmlEnumValue("shale volume")
    SHALE_VOLUME("shale volume"),

    /**
     * The conductivity which represents a measurement made approximately one to two feet into the formation; generally considered to measure the formation where it contains fluids which are comprised primarily of mud filtrate.
     * 
     */
    @XmlEnumValue("shallow conductivity")
    SHALLOW_CONDUCTIVITY("shallow conductivity"),

    /**
     * The conductivity, measured by an induction log, which represents a measurement made approximately one to two feet into the formation; generally considered to measure the formation where it contains fluids which are comprised primarily of mud filtrate.
     * 
     */
    @XmlEnumValue("shallow induction conductivity")
    SHALLOW_INDUCTION_CONDUCTIVITY("shallow induction conductivity"),

    /**
     * The resistivity, measured by an induction log, which represents a measurement made approximately one to two feet into the formation; generally considered to measure the formation where it contains fluids which are comprised primarily of mud filtrate.
     * 
     */
    @XmlEnumValue("shallow induction resistivity")
    SHALLOW_INDUCTION_RESISTIVITY("shallow induction resistivity"),

    /**
     * The conductivity, measured by a laterolog, which represents a measurement made approximately one to two feet into the formation; generally considered to measure the formation where it contains fluids which are comprised primarily of mud filtrate.
     * 
     */
    @XmlEnumValue("shallow laterolog conductivity")
    SHALLOW_LATEROLOG_CONDUCTIVITY("shallow laterolog conductivity"),

    /**
     * The resistivity, measured by a laterolog, which represents a measurement made approximately one to two feet into the formation; generally considered to measure the formation where it contains fluids which are comprised primarily of mud filtrate.
     * 
     */
    @XmlEnumValue("shallow laterolog resistivity")
    SHALLOW_LATEROLOG_RESISTIVITY("shallow laterolog resistivity"),

    /**
     * The resistivity which represents a measurement made approximately one to two feet into the formation; generally considered to measure the formation where it contains fluids which are comprised primarily of mud filtrate.
     * 
     */
    @XmlEnumValue("shallow resistivity")
    SHALLOW_RESISTIVITY("shallow resistivity"),

    /**
     * Porosity calculated from a shear wave acoustic log using a dolomite matrix.
     * 
     */
    @XmlEnumValue("shear wave dolomite porosity")
    SHEAR_WAVE_DOLOMITE_POROSITY("shear wave dolomite porosity"),

    /**
     * Porosity calculated from a shear wave acoustic log using a limestone matrix.
     * 
     */
    @XmlEnumValue("shear wave limestone porosity")
    SHEAR_WAVE_LIMESTONE_POROSITY("shear wave limestone porosity"),

    /**
     * The time it takes for a shear acoustic wave to traverse a fixed distance of a given material or matrix. In this case the material or matrix is a specific, zero porosity rock, e.g. sandstone, limestone or dolomite.
     * 
     */
    @XmlEnumValue("shear wave matrix travel time")
    SHEAR_WAVE_MATRIX_TRAVEL_TIME("shear wave matrix travel time"),

    /**
     * Porosity calculated from a shear wave acoustic log using a sandstone matrix.
     * 
     */
    @XmlEnumValue("shear wave sandstone porosity")
    SHEAR_WAVE_SANDSTONE_POROSITY("shear wave sandstone porosity"),

    /**
     * The time it takes for a shear acoustic wave to traverse a fixed distance.
     * 
     */
    @XmlEnumValue("shear wave travel time")
    SHEAR_WAVE_TRAVEL_TIME("shear wave travel time"),

    /**
     * A well log trace which has had its original values shifted by some factor; e.g., added or multiplied by a constant.
     * 
     */
    @XmlEnumValue("shifted")
    SHIFTED("shifted"),

    /**
     * Porosity from a measurement made on a sidewall core.
     * 
     */
    @XmlEnumValue("sidewall core porosity")
    SIDEWALL_CORE_POROSITY("sidewall core porosity"),

    /**
     * The macroscopic capture cross section, i.e. the effective cross-sectional area per unit volume for the capture of neutrons.
     * 
     */
    @XmlEnumValue("sigma")
    SIGMA("sigma"),

    /**
     * The macroscopic capture cross section, i.e. the effective cross-sectional area per unit volume, of the formation for the capture of neutrons.
     * 
     */
    @XmlEnumValue("sigma formation")
    SIGMA_FORMATION("sigma formation"),

    /**
     * The macroscopic capture cross section, i.e. the effective cross-sectional area per unit volume, of gas for the capture of neutrons.
     * 
     */
    @XmlEnumValue("sigma gas")
    SIGMA_GAS("sigma gas"),

    /**
     * The macroscopic capture cross section, i.e. the effective cross-sectional area per unit volume, of hydrocarbon for the capture of neutrons.
     * 
     */
    @XmlEnumValue("sigma hydrocarbon")
    SIGMA_HYDROCARBON("sigma hydrocarbon"),

    /**
     * The macroscopic capture cross section, i.e. the effective cross-sectional area per unit volume, of the rock matrix for the capture of neutrons.
     * 
     */
    @XmlEnumValue("sigma matrix")
    SIGMA_MATRIX("sigma matrix"),

    /**
     * The macroscopic capture cross section, i.e. the effective cross-sectional area per unit volume, of oil for the capture of neutrons.
     * 
     */
    @XmlEnumValue("sigma oil")
    SIGMA_OIL("sigma oil"),

    /**
     * The macroscopic capture cross section, i.e. the effective cross-sectional area per unit volume, of water for the capture of neutrons.
     * 
     */
    @XmlEnumValue("sigma water")
    SIGMA_WATER("sigma water"),

    /**
     * A trace which has been corrected for slippage velocity.
     * 
     */
    @XmlEnumValue("slippage velocity correction")
    SLIPPAGE_VELOCITY_CORRECTION("slippage velocity correction"),

    /**
     * A well log trace which has been filtered to smooth, or average the trace.
     * 
     */
    @XmlEnumValue("smoothed")
    SMOOTHED("smoothed"),

    /**
     * The measurement of all the naturally occurring gamma radiation separated by energy windows.
     * 
     */
    @XmlEnumValue("spectral gamma ray")
    SPECTRAL_GAMMA_RAY("spectral gamma ray"),

    /**
     * The conductivity, measured by a spherically focused log, which represents the resistivity approximately one to two feet into the formation.
     * 
     */
    @XmlEnumValue("spherically focused conductivity")
    SPHERICALLY_FOCUSED_CONDUCTIVITY("spherically focused conductivity"),

    /**
     * The resistivity, measured by a spherically focused log, which represents the resistivity approximately one to two feet into the formation.
     * 
     */
    @XmlEnumValue("spherically focused resistivity")
    SPHERICALLY_FOCUSED_RESISTIVITY("spherically focused resistivity"),

    /**
     * The difference in potential (DC Voltage) between a moveable electrode in the borehole and a distant reference electrode usually at the surface.
     * 
     */
    @XmlEnumValue("spontaneous potential")
    SPONTANEOUS_POTENTIAL("spontaneous potential"),

    /**
     * A trace which has been corrected for the effects of spreading loss.
     * 
     */
    @XmlEnumValue("spreading loss correction")
    SPREADING_LOSS_CORRECTION("spreading loss correction"),

    /**
     * A well log trace which has been artificially created, as opposed to an actual measurement, from associated measurements or information.
     * 
     */
    @XmlEnumValue("synthetic well log trace")
    SYNTHETIC_WELL_LOG_TRACE("synthetic well log trace"),

    /**
     * A temperature measurement.
     * 
     */
    @XmlEnumValue("temperature")
    TEMPERATURE("temperature"),

    /**
     * A trace which has been corrected for the effects of the temperature in the borehole.
     * 
     */
    @XmlEnumValue("temperature correction")
    TEMPERATURE_CORRECTION("temperature correction"),

    /**
     * The tension on the wireline cable while logging.
     * 
     */
    @XmlEnumValue("tension")
    TENSION("tension"),

    /**
     * The ratio of the Thorium measurement to the Potassium measurement.
     * 
     */
    @XmlEnumValue("Th/K ratio")
    TH_K_RATIO("Th/K ratio"),

    /**
     * The measurement of gamma radiation emitted by thorium.
     * 
     */
    @XmlEnumValue("thorium")
    THORIUM("thorium"),

    /**
     * A measured or measurable period.
     * 
     */
    @XmlEnumValue("time")
    TIME("time"),

    /**
     * A trace which has been corrected for the tool diameter.
     * 
     */
    @XmlEnumValue("tool diameter correction")
    TOOL_DIAMETER_CORRECTION("tool diameter correction"),

    /**
     * A trace which has been corrected for the effects of the tool not being centered in the borehole.
     * 
     */
    @XmlEnumValue("tool eccentricity correction")
    TOOL_ECCENTRICITY_CORRECTION("tool eccentricity correction"),

    /**
     * The measurement of all the naturally occurring gamma radiation.
     * 
     */
    @XmlEnumValue("total gamma ray")
    TOTAL_GAMMA_RAY("total gamma ray"),

    /**
     * The total pore volume occupied by fluid in a rock.
     * 
     */
    @XmlEnumValue("total porosity")
    TOTAL_POROSITY("total porosity"),

    /**
     * A well log used for the purpose of monitoring a traceable material; e.g. a radioactive isotope.
     * 
     */
    @XmlEnumValue("tracer survey")
    TRACER_SURVEY("tracer survey"),

    /**
     * The time it takes for an acoustic or electromagnetic wave to traverse a specific distance.
     * 
     */
    @XmlEnumValue("travel time")
    TRAVEL_TIME("travel time"),

    /**
     * The conductivity of fluid-filled rock where fluid distributions and saturations are representative of those in the uninvaded, undisturbed part of the formation.
     * 
     */
    @XmlEnumValue("true conductivity")
    TRUE_CONDUCTIVITY("true conductivity"),

    /**
     * The resistivity of fluid-filled rock where fluid distributions and saturations are representative of those in the uninvaded, undisturbed part of the formation.
     * 
     */
    @XmlEnumValue("true resistivity")
    TRUE_RESISTIVITY("true resistivity"),

    /**
     * The distance along a straight, vertical path.  Usually computed from a measured depth and deviation information.
     * 
     */
    @XmlEnumValue("true vertical depth")
    TRUE_VERTICAL_DEPTH("true vertical depth"),

    /**
     * Porosity calculated from a tube wave acoustic log using a dolomite matrix.
     * 
     */
    @XmlEnumValue("tube wave dolomite porosity")
    TUBE_WAVE_DOLOMITE_POROSITY("tube wave dolomite porosity"),

    /**
     * Porosity calculated from a tube wave acoustic log using a limestone matrix.
     * 
     */
    @XmlEnumValue("tube wave limestone porosity")
    TUBE_WAVE_LIMESTONE_POROSITY("tube wave limestone porosity"),

    /**
     * The time it takes for a  acoustic tube wave to traverse a fixed distance of a given material or matrix. In this case the material or matrix is a specific, zero porosity rock, e.g. sandstone, limestone or dolomite.
     * 
     */
    @XmlEnumValue("tube wave matrix travel time")
    TUBE_WAVE_MATRIX_TRAVEL_TIME("tube wave matrix travel time"),

    /**
     * Porosity calculated from a tube wave acoustic log using a sandstone matrix.
     * 
     */
    @XmlEnumValue("tube wave sandstone porosity")
    TUBE_WAVE_SANDSTONE_POROSITY("tube wave sandstone porosity"),

    /**
     * The time it takes for a tube acoustic wave to traverse a fixed distance.
     * 
     */
    @XmlEnumValue("tube wave travel time")
    TUBE_WAVE_TRAVEL_TIME("tube wave travel time"),

    /**
     * The measurement of gamma radiation emitted by uranium.
     * 
     */
    @XmlEnumValue("uranium")
    URANIUM("uranium"),

    /**
     * directional speed
     * 
     */
    @XmlEnumValue("velocity")
    VELOCITY("velocity"),

    /**
     * cubic capacity
     * 
     */
    @XmlEnumValue("volume")
    VOLUME("volume"),

    /**
     * A trace which has been corrected for the effects of the components in a water based borehole fluid system; e.g., a correction for KCL in the mud.
     * 
     */
    @XmlEnumValue("water based fluid correction")
    WATER_BASED_FLUID_CORRECTION("water based fluid correction"),

    /**
     * A trace which has been corrected for water holdup.
     * 
     */
    @XmlEnumValue("water holdup correction")
    WATER_HOLDUP_CORRECTION("water holdup correction"),

    /**
     * The conductivity of rock completely saturated with connate water.
     * 
     */
    @XmlEnumValue("water saturated conductivity")
    WATER_SATURATED_CONDUCTIVITY("water saturated conductivity"),

    /**
     * The resistivity of rock completely saturated with connate water.
     * 
     */
    @XmlEnumValue("water saturated resistivity")
    WATER_SATURATED_RESISTIVITY("water saturated resistivity"),

    /**
     * The fraction or percentage of pore volume of rock occupied by water.
     * 
     */
    @XmlEnumValue("water saturation")
    WATER_SATURATION("water saturation"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MeasurementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementType fromValue(String v) {
        for (MeasurementType c: MeasurementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
