


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasureClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MeasureClass">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="absorbed dose"/>
 *     <enumeration value="activity of radioactivity"/>
 *     <enumeration value="amount of substance"/>
 *     <enumeration value="amount of substance per amount of substance"/>
 *     <enumeration value="amount of substance per area"/>
 *     <enumeration value="amount of substance per time"/>
 *     <enumeration value="amount of substance per time per area"/>
 *     <enumeration value="amount of substance per volume"/>
 *     <enumeration value="angle per length"/>
 *     <enumeration value="angle per volume"/>
 *     <enumeration value="angular acceleration"/>
 *     <enumeration value="angular velocity"/>
 *     <enumeration value="api gamma ray"/>
 *     <enumeration value="api gravity"/>
 *     <enumeration value="api neutron"/>
 *     <enumeration value="area"/>
 *     <enumeration value="area per amount of substance"/>
 *     <enumeration value="area per area"/>
 *     <enumeration value="area per count"/>
 *     <enumeration value="area per mass"/>
 *     <enumeration value="area per time"/>
 *     <enumeration value="area per volume"/>
 *     <enumeration value="attenuation per frequency interval"/>
 *     <enumeration value="capacitance"/>
 *     <enumeration value="cation exchange capacity"/>
 *     <enumeration value="data transfer speed"/>
 *     <enumeration value="diffusion coefficient"/>
 *     <enumeration value="diffusive time of flight"/>
 *     <enumeration value="digital storage"/>
 *     <enumeration value="dimensionless"/>
 *     <enumeration value="dipole moment"/>
 *     <enumeration value="dose equivalent"/>
 *     <enumeration value="dynamic viscosity"/>
 *     <enumeration value="electric charge"/>
 *     <enumeration value="electric charge per area"/>
 *     <enumeration value="electric charge per mass"/>
 *     <enumeration value="electric charge per volume"/>
 *     <enumeration value="electric conductance"/>
 *     <enumeration value="electric conductivity"/>
 *     <enumeration value="electric current"/>
 *     <enumeration value="electric current density"/>
 *     <enumeration value="electric field strength"/>
 *     <enumeration value="electric potential difference"/>
 *     <enumeration value="electric resistance"/>
 *     <enumeration value="electric resistance per length"/>
 *     <enumeration value="electrical resistivity"/>
 *     <enumeration value="electromagnetic moment"/>
 *     <enumeration value="energy"/>
 *     <enumeration value="energy length per area"/>
 *     <enumeration value="energy length per time area temperature"/>
 *     <enumeration value="energy per area"/>
 *     <enumeration value="energy per length"/>
 *     <enumeration value="energy per mass"/>
 *     <enumeration value="energy per mass per time"/>
 *     <enumeration value="energy per volume"/>
 *     <enumeration value="force"/>
 *     <enumeration value="force area"/>
 *     <enumeration value="force length per length"/>
 *     <enumeration value="force per force"/>
 *     <enumeration value="force per length"/>
 *     <enumeration value="force per volume"/>
 *     <enumeration value="frequency"/>
 *     <enumeration value="frequency interval"/>
 *     <enumeration value="heat capacity"/>
 *     <enumeration value="heat flow rate"/>
 *     <enumeration value="heat transfer coefficient"/>
 *     <enumeration value="illuminance"/>
 *     <enumeration value="inductance"/>
 *     <enumeration value="isothermal compressibility"/>
 *     <enumeration value="kinematic viscosity"/>
 *     <enumeration value="length"/>
 *     <enumeration value="length per length"/>
 *     <enumeration value="length per mass"/>
 *     <enumeration value="length per pressure"/>
 *     <enumeration value="length per temperature"/>
 *     <enumeration value="length per time"/>
 *     <enumeration value="length per volume"/>
 *     <enumeration value="light exposure"/>
 *     <enumeration value="linear acceleration"/>
 *     <enumeration value="linear thermal expansion"/>
 *     <enumeration value="logarithmic power ratio"/>
 *     <enumeration value="logarithmic power ratio per length"/>
 *     <enumeration value="luminance"/>
 *     <enumeration value="luminous efficacy"/>
 *     <enumeration value="luminous flux"/>
 *     <enumeration value="luminous intensity"/>
 *     <enumeration value="magnetic dipole moment"/>
 *     <enumeration value="magnetic field strength"/>
 *     <enumeration value="magnetic flux"/>
 *     <enumeration value="magnetic flux density"/>
 *     <enumeration value="magnetic flux density per length"/>
 *     <enumeration value="magnetic permeability"/>
 *     <enumeration value="magnetic vector potential"/>
 *     <enumeration value="mass"/>
 *     <enumeration value="mass length"/>
 *     <enumeration value="mass per area"/>
 *     <enumeration value="mass per energy"/>
 *     <enumeration value="mass per length"/>
 *     <enumeration value="mass per mass"/>
 *     <enumeration value="mass per time"/>
 *     <enumeration value="mass per time per area"/>
 *     <enumeration value="mass per time per length"/>
 *     <enumeration value="mass per volume"/>
 *     <enumeration value="mass per volume per length"/>
 *     <enumeration value="mass per volume per pressure"/>
 *     <enumeration value="mass per volume per temperature"/>
 *     <enumeration value="mobility"/>
 *     <enumeration value="molar energy"/>
 *     <enumeration value="molar heat capacity"/>
 *     <enumeration value="molar volume"/>
 *     <enumeration value="molecular weight"/>
 *     <enumeration value="moment of force"/>
 *     <enumeration value="moment of inertia"/>
 *     <enumeration value="momentum"/>
 *     <enumeration value="normalized power"/>
 *     <enumeration value="permeability length"/>
 *     <enumeration value="permeability rock"/>
 *     <enumeration value="permittivity"/>
 *     <enumeration value="plane angle"/>
 *     <enumeration value="potential difference per power drop"/>
 *     <enumeration value="power"/>
 *     <enumeration value="power per area"/>
 *     <enumeration value="power per power"/>
 *     <enumeration value="power per volume"/>
 *     <enumeration value="pressure"/>
 *     <enumeration value="pressure per pressure"/>
 *     <enumeration value="pressure per time"/>
 *     <enumeration value="pressure per volume"/>
 *     <enumeration value="pressure squared"/>
 *     <enumeration value="pressure squared per force time per area"/>
 *     <enumeration value="pressure time per volume"/>
 *     <enumeration value="quantity of light"/>
 *     <enumeration value="radiance"/>
 *     <enumeration value="radiant intensity"/>
 *     <enumeration value="reciprocal area"/>
 *     <enumeration value="reciprocal electric potential difference"/>
 *     <enumeration value="reciprocal force"/>
 *     <enumeration value="reciprocal length"/>
 *     <enumeration value="reciprocal mass"/>
 *     <enumeration value="reciprocal mass time"/>
 *     <enumeration value="reciprocal pressure"/>
 *     <enumeration value="reciprocal time"/>
 *     <enumeration value="reciprocal volume"/>
 *     <enumeration value="reluctance"/>
 *     <enumeration value="second moment of area"/>
 *     <enumeration value="signaling event per time"/>
 *     <enumeration value="solid angle"/>
 *     <enumeration value="specific heat capacity"/>
 *     <enumeration value="temperature interval"/>
 *     <enumeration value="temperature interval per length"/>
 *     <enumeration value="temperature interval per pressure"/>
 *     <enumeration value="temperature interval per time"/>
 *     <enumeration value="thermal conductance"/>
 *     <enumeration value="thermal conductivity"/>
 *     <enumeration value="thermal diffusivity"/>
 *     <enumeration value="thermal insulance"/>
 *     <enumeration value="thermal resistance"/>
 *     <enumeration value="thermodynamic temperature"/>
 *     <enumeration value="thermodynamic temperature per thermodynamic temperature"/>
 *     <enumeration value="time"/>
 *     <enumeration value="time per length"/>
 *     <enumeration value="time per mass"/>
 *     <enumeration value="time per time"/>
 *     <enumeration value="time per volume"/>
 *     <enumeration value="vertical coordinate"/>
 *     <enumeration value="volume"/>
 *     <enumeration value="volume flow rate per volume flow rate"/>
 *     <enumeration value="volume per area"/>
 *     <enumeration value="volume per length"/>
 *     <enumeration value="volume per mass"/>
 *     <enumeration value="volume per pressure"/>
 *     <enumeration value="volume per rotation"/>
 *     <enumeration value="volume per time"/>
 *     <enumeration value="volume per time length"/>
 *     <enumeration value="volume per time per area"/>
 *     <enumeration value="volume per time per length"/>
 *     <enumeration value="volume per time per pressure"/>
 *     <enumeration value="volume per time per pressure length"/>
 *     <enumeration value="volume per time per time"/>
 *     <enumeration value="volume per time per volume"/>
 *     <enumeration value="volume per volume"/>
 *     <enumeration value="volumetric heat transfer coefficient"/>
 *     <enumeration value="volumetric thermal expansion"/>
 *     <enumeration value="unitless"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasureClass")
@XmlEnum
public enum MeasureClass {

    @XmlEnumValue("absorbed dose")
    ABSORBED_DOSE("absorbed dose"),
    @XmlEnumValue("activity of radioactivity")
    ACTIVITY_OF_RADIOACTIVITY("activity of radioactivity"),
    @XmlEnumValue("amount of substance")
    AMOUNT_OF_SUBSTANCE("amount of substance"),
    @XmlEnumValue("amount of substance per amount of substance")
    AMOUNT_OF_SUBSTANCE_PER_AMOUNT_OF_SUBSTANCE("amount of substance per amount of substance"),
    @XmlEnumValue("amount of substance per area")
    AMOUNT_OF_SUBSTANCE_PER_AREA("amount of substance per area"),
    @XmlEnumValue("amount of substance per time")
    AMOUNT_OF_SUBSTANCE_PER_TIME("amount of substance per time"),
    @XmlEnumValue("amount of substance per time per area")
    AMOUNT_OF_SUBSTANCE_PER_TIME_PER_AREA("amount of substance per time per area"),
    @XmlEnumValue("amount of substance per volume")
    AMOUNT_OF_SUBSTANCE_PER_VOLUME("amount of substance per volume"),
    @XmlEnumValue("angle per length")
    ANGLE_PER_LENGTH("angle per length"),
    @XmlEnumValue("angle per volume")
    ANGLE_PER_VOLUME("angle per volume"),
    @XmlEnumValue("angular acceleration")
    ANGULAR_ACCELERATION("angular acceleration"),
    @XmlEnumValue("angular velocity")
    ANGULAR_VELOCITY("angular velocity"),
    @XmlEnumValue("api gamma ray")
    API_GAMMA_RAY("api gamma ray"),
    @XmlEnumValue("api gravity")
    API_GRAVITY("api gravity"),
    @XmlEnumValue("api neutron")
    API_NEUTRON("api neutron"),
    @XmlEnumValue("area")
    AREA("area"),
    @XmlEnumValue("area per amount of substance")
    AREA_PER_AMOUNT_OF_SUBSTANCE("area per amount of substance"),
    @XmlEnumValue("area per area")
    AREA_PER_AREA("area per area"),
    @XmlEnumValue("area per count")
    AREA_PER_COUNT("area per count"),
    @XmlEnumValue("area per mass")
    AREA_PER_MASS("area per mass"),
    @XmlEnumValue("area per time")
    AREA_PER_TIME("area per time"),
    @XmlEnumValue("area per volume")
    AREA_PER_VOLUME("area per volume"),
    @XmlEnumValue("attenuation per frequency interval")
    ATTENUATION_PER_FREQUENCY_INTERVAL("attenuation per frequency interval"),
    @XmlEnumValue("capacitance")
    CAPACITANCE("capacitance"),
    @XmlEnumValue("cation exchange capacity")
    CATION_EXCHANGE_CAPACITY("cation exchange capacity"),
    @XmlEnumValue("data transfer speed")
    DATA_TRANSFER_SPEED("data transfer speed"),
    @XmlEnumValue("diffusion coefficient")
    DIFFUSION_COEFFICIENT("diffusion coefficient"),
    @XmlEnumValue("diffusive time of flight")
    DIFFUSIVE_TIME_OF_FLIGHT("diffusive time of flight"),
    @XmlEnumValue("digital storage")
    DIGITAL_STORAGE("digital storage"),
    @XmlEnumValue("dimensionless")
    DIMENSIONLESS("dimensionless"),
    @XmlEnumValue("dipole moment")
    DIPOLE_MOMENT("dipole moment"),
    @XmlEnumValue("dose equivalent")
    DOSE_EQUIVALENT("dose equivalent"),
    @XmlEnumValue("dynamic viscosity")
    DYNAMIC_VISCOSITY("dynamic viscosity"),
    @XmlEnumValue("electric charge")
    ELECTRIC_CHARGE("electric charge"),
    @XmlEnumValue("electric charge per area")
    ELECTRIC_CHARGE_PER_AREA("electric charge per area"),
    @XmlEnumValue("electric charge per mass")
    ELECTRIC_CHARGE_PER_MASS("electric charge per mass"),
    @XmlEnumValue("electric charge per volume")
    ELECTRIC_CHARGE_PER_VOLUME("electric charge per volume"),
    @XmlEnumValue("electric conductance")
    ELECTRIC_CONDUCTANCE("electric conductance"),
    @XmlEnumValue("electric conductivity")
    ELECTRIC_CONDUCTIVITY("electric conductivity"),
    @XmlEnumValue("electric current")
    ELECTRIC_CURRENT("electric current"),
    @XmlEnumValue("electric current density")
    ELECTRIC_CURRENT_DENSITY("electric current density"),
    @XmlEnumValue("electric field strength")
    ELECTRIC_FIELD_STRENGTH("electric field strength"),
    @XmlEnumValue("electric potential difference")
    ELECTRIC_POTENTIAL_DIFFERENCE("electric potential difference"),
    @XmlEnumValue("electric resistance")
    ELECTRIC_RESISTANCE("electric resistance"),
    @XmlEnumValue("electric resistance per length")
    ELECTRIC_RESISTANCE_PER_LENGTH("electric resistance per length"),
    @XmlEnumValue("electrical resistivity")
    ELECTRICAL_RESISTIVITY("electrical resistivity"),
    @XmlEnumValue("electromagnetic moment")
    ELECTROMAGNETIC_MOMENT("electromagnetic moment"),
    @XmlEnumValue("energy")
    ENERGY("energy"),
    @XmlEnumValue("energy length per area")
    ENERGY_LENGTH_PER_AREA("energy length per area"),
    @XmlEnumValue("energy length per time area temperature")
    ENERGY_LENGTH_PER_TIME_AREA_TEMPERATURE("energy length per time area temperature"),
    @XmlEnumValue("energy per area")
    ENERGY_PER_AREA("energy per area"),
    @XmlEnumValue("energy per length")
    ENERGY_PER_LENGTH("energy per length"),
    @XmlEnumValue("energy per mass")
    ENERGY_PER_MASS("energy per mass"),
    @XmlEnumValue("energy per mass per time")
    ENERGY_PER_MASS_PER_TIME("energy per mass per time"),
    @XmlEnumValue("energy per volume")
    ENERGY_PER_VOLUME("energy per volume"),
    @XmlEnumValue("force")
    FORCE("force"),
    @XmlEnumValue("force area")
    FORCE_AREA("force area"),
    @XmlEnumValue("force length per length")
    FORCE_LENGTH_PER_LENGTH("force length per length"),
    @XmlEnumValue("force per force")
    FORCE_PER_FORCE("force per force"),
    @XmlEnumValue("force per length")
    FORCE_PER_LENGTH("force per length"),
    @XmlEnumValue("force per volume")
    FORCE_PER_VOLUME("force per volume"),
    @XmlEnumValue("frequency")
    FREQUENCY("frequency"),
    @XmlEnumValue("frequency interval")
    FREQUENCY_INTERVAL("frequency interval"),
    @XmlEnumValue("heat capacity")
    HEAT_CAPACITY("heat capacity"),
    @XmlEnumValue("heat flow rate")
    HEAT_FLOW_RATE("heat flow rate"),
    @XmlEnumValue("heat transfer coefficient")
    HEAT_TRANSFER_COEFFICIENT("heat transfer coefficient"),
    @XmlEnumValue("illuminance")
    ILLUMINANCE("illuminance"),
    @XmlEnumValue("inductance")
    INDUCTANCE("inductance"),
    @XmlEnumValue("isothermal compressibility")
    ISOTHERMAL_COMPRESSIBILITY("isothermal compressibility"),
    @XmlEnumValue("kinematic viscosity")
    KINEMATIC_VISCOSITY("kinematic viscosity"),
    @XmlEnumValue("length")
    LENGTH("length"),
    @XmlEnumValue("length per length")
    LENGTH_PER_LENGTH("length per length"),
    @XmlEnumValue("length per mass")
    LENGTH_PER_MASS("length per mass"),
    @XmlEnumValue("length per pressure")
    LENGTH_PER_PRESSURE("length per pressure"),
    @XmlEnumValue("length per temperature")
    LENGTH_PER_TEMPERATURE("length per temperature"),
    @XmlEnumValue("length per time")
    LENGTH_PER_TIME("length per time"),
    @XmlEnumValue("length per volume")
    LENGTH_PER_VOLUME("length per volume"),
    @XmlEnumValue("light exposure")
    LIGHT_EXPOSURE("light exposure"),
    @XmlEnumValue("linear acceleration")
    LINEAR_ACCELERATION("linear acceleration"),
    @XmlEnumValue("linear thermal expansion")
    LINEAR_THERMAL_EXPANSION("linear thermal expansion"),
    @XmlEnumValue("logarithmic power ratio")
    LOGARITHMIC_POWER_RATIO("logarithmic power ratio"),
    @XmlEnumValue("logarithmic power ratio per length")
    LOGARITHMIC_POWER_RATIO_PER_LENGTH("logarithmic power ratio per length"),
    @XmlEnumValue("luminance")
    LUMINANCE("luminance"),
    @XmlEnumValue("luminous efficacy")
    LUMINOUS_EFFICACY("luminous efficacy"),
    @XmlEnumValue("luminous flux")
    LUMINOUS_FLUX("luminous flux"),
    @XmlEnumValue("luminous intensity")
    LUMINOUS_INTENSITY("luminous intensity"),
    @XmlEnumValue("magnetic dipole moment")
    MAGNETIC_DIPOLE_MOMENT("magnetic dipole moment"),
    @XmlEnumValue("magnetic field strength")
    MAGNETIC_FIELD_STRENGTH("magnetic field strength"),
    @XmlEnumValue("magnetic flux")
    MAGNETIC_FLUX("magnetic flux"),
    @XmlEnumValue("magnetic flux density")
    MAGNETIC_FLUX_DENSITY("magnetic flux density"),
    @XmlEnumValue("magnetic flux density per length")
    MAGNETIC_FLUX_DENSITY_PER_LENGTH("magnetic flux density per length"),
    @XmlEnumValue("magnetic permeability")
    MAGNETIC_PERMEABILITY("magnetic permeability"),
    @XmlEnumValue("magnetic vector potential")
    MAGNETIC_VECTOR_POTENTIAL("magnetic vector potential"),
    @XmlEnumValue("mass")
    MASS("mass"),
    @XmlEnumValue("mass length")
    MASS_LENGTH("mass length"),
    @XmlEnumValue("mass per area")
    MASS_PER_AREA("mass per area"),
    @XmlEnumValue("mass per energy")
    MASS_PER_ENERGY("mass per energy"),
    @XmlEnumValue("mass per length")
    MASS_PER_LENGTH("mass per length"),
    @XmlEnumValue("mass per mass")
    MASS_PER_MASS("mass per mass"),
    @XmlEnumValue("mass per time")
    MASS_PER_TIME("mass per time"),
    @XmlEnumValue("mass per time per area")
    MASS_PER_TIME_PER_AREA("mass per time per area"),
    @XmlEnumValue("mass per time per length")
    MASS_PER_TIME_PER_LENGTH("mass per time per length"),
    @XmlEnumValue("mass per volume")
    MASS_PER_VOLUME("mass per volume"),
    @XmlEnumValue("mass per volume per length")
    MASS_PER_VOLUME_PER_LENGTH("mass per volume per length"),
    @XmlEnumValue("mass per volume per pressure")
    MASS_PER_VOLUME_PER_PRESSURE("mass per volume per pressure"),
    @XmlEnumValue("mass per volume per temperature")
    MASS_PER_VOLUME_PER_TEMPERATURE("mass per volume per temperature"),
    @XmlEnumValue("mobility")
    MOBILITY("mobility"),
    @XmlEnumValue("molar energy")
    MOLAR_ENERGY("molar energy"),
    @XmlEnumValue("molar heat capacity")
    MOLAR_HEAT_CAPACITY("molar heat capacity"),
    @XmlEnumValue("molar volume")
    MOLAR_VOLUME("molar volume"),
    @XmlEnumValue("molecular weight")
    MOLECULAR_WEIGHT("molecular weight"),
    @XmlEnumValue("moment of force")
    MOMENT_OF_FORCE("moment of force"),
    @XmlEnumValue("moment of inertia")
    MOMENT_OF_INERTIA("moment of inertia"),
    @XmlEnumValue("momentum")
    MOMENTUM("momentum"),
    @XmlEnumValue("normalized power")
    NORMALIZED_POWER("normalized power"),
    @XmlEnumValue("permeability length")
    PERMEABILITY_LENGTH("permeability length"),
    @XmlEnumValue("permeability rock")
    PERMEABILITY_ROCK("permeability rock"),
    @XmlEnumValue("permittivity")
    PERMITTIVITY("permittivity"),
    @XmlEnumValue("plane angle")
    PLANE_ANGLE("plane angle"),
    @XmlEnumValue("potential difference per power drop")
    POTENTIAL_DIFFERENCE_PER_POWER_DROP("potential difference per power drop"),
    @XmlEnumValue("power")
    POWER("power"),
    @XmlEnumValue("power per area")
    POWER_PER_AREA("power per area"),
    @XmlEnumValue("power per power")
    POWER_PER_POWER("power per power"),
    @XmlEnumValue("power per volume")
    POWER_PER_VOLUME("power per volume"),
    @XmlEnumValue("pressure")
    PRESSURE("pressure"),
    @XmlEnumValue("pressure per pressure")
    PRESSURE_PER_PRESSURE("pressure per pressure"),
    @XmlEnumValue("pressure per time")
    PRESSURE_PER_TIME("pressure per time"),
    @XmlEnumValue("pressure per volume")
    PRESSURE_PER_VOLUME("pressure per volume"),
    @XmlEnumValue("pressure squared")
    PRESSURE_SQUARED("pressure squared"),
    @XmlEnumValue("pressure squared per force time per area")
    PRESSURE_SQUARED_PER_FORCE_TIME_PER_AREA("pressure squared per force time per area"),
    @XmlEnumValue("pressure time per volume")
    PRESSURE_TIME_PER_VOLUME("pressure time per volume"),
    @XmlEnumValue("quantity of light")
    QUANTITY_OF_LIGHT("quantity of light"),
    @XmlEnumValue("radiance")
    RADIANCE("radiance"),
    @XmlEnumValue("radiant intensity")
    RADIANT_INTENSITY("radiant intensity"),
    @XmlEnumValue("reciprocal area")
    RECIPROCAL_AREA("reciprocal area"),
    @XmlEnumValue("reciprocal electric potential difference")
    RECIPROCAL_ELECTRIC_POTENTIAL_DIFFERENCE("reciprocal electric potential difference"),
    @XmlEnumValue("reciprocal force")
    RECIPROCAL_FORCE("reciprocal force"),
    @XmlEnumValue("reciprocal length")
    RECIPROCAL_LENGTH("reciprocal length"),
    @XmlEnumValue("reciprocal mass")
    RECIPROCAL_MASS("reciprocal mass"),
    @XmlEnumValue("reciprocal mass time")
    RECIPROCAL_MASS_TIME("reciprocal mass time"),
    @XmlEnumValue("reciprocal pressure")
    RECIPROCAL_PRESSURE("reciprocal pressure"),
    @XmlEnumValue("reciprocal time")
    RECIPROCAL_TIME("reciprocal time"),
    @XmlEnumValue("reciprocal volume")
    RECIPROCAL_VOLUME("reciprocal volume"),
    @XmlEnumValue("reluctance")
    RELUCTANCE("reluctance"),
    @XmlEnumValue("second moment of area")
    SECOND_MOMENT_OF_AREA("second moment of area"),
    @XmlEnumValue("signaling event per time")
    SIGNALING_EVENT_PER_TIME("signaling event per time"),
    @XmlEnumValue("solid angle")
    SOLID_ANGLE("solid angle"),
    @XmlEnumValue("specific heat capacity")
    SPECIFIC_HEAT_CAPACITY("specific heat capacity"),
    @XmlEnumValue("temperature interval")
    TEMPERATURE_INTERVAL("temperature interval"),
    @XmlEnumValue("temperature interval per length")
    TEMPERATURE_INTERVAL_PER_LENGTH("temperature interval per length"),
    @XmlEnumValue("temperature interval per pressure")
    TEMPERATURE_INTERVAL_PER_PRESSURE("temperature interval per pressure"),
    @XmlEnumValue("temperature interval per time")
    TEMPERATURE_INTERVAL_PER_TIME("temperature interval per time"),
    @XmlEnumValue("thermal conductance")
    THERMAL_CONDUCTANCE("thermal conductance"),
    @XmlEnumValue("thermal conductivity")
    THERMAL_CONDUCTIVITY("thermal conductivity"),
    @XmlEnumValue("thermal diffusivity")
    THERMAL_DIFFUSIVITY("thermal diffusivity"),
    @XmlEnumValue("thermal insulance")
    THERMAL_INSULANCE("thermal insulance"),
    @XmlEnumValue("thermal resistance")
    THERMAL_RESISTANCE("thermal resistance"),
    @XmlEnumValue("thermodynamic temperature")
    THERMODYNAMIC_TEMPERATURE("thermodynamic temperature"),
    @XmlEnumValue("thermodynamic temperature per thermodynamic temperature")
    THERMODYNAMIC_TEMPERATURE_PER_THERMODYNAMIC_TEMPERATURE("thermodynamic temperature per thermodynamic temperature"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("time per length")
    TIME_PER_LENGTH("time per length"),
    @XmlEnumValue("time per mass")
    TIME_PER_MASS("time per mass"),
    @XmlEnumValue("time per time")
    TIME_PER_TIME("time per time"),
    @XmlEnumValue("time per volume")
    TIME_PER_VOLUME("time per volume"),
    @XmlEnumValue("vertical coordinate")
    VERTICAL_COORDINATE("vertical coordinate"),
    @XmlEnumValue("volume")
    VOLUME("volume"),
    @XmlEnumValue("volume flow rate per volume flow rate")
    VOLUME_FLOW_RATE_PER_VOLUME_FLOW_RATE("volume flow rate per volume flow rate"),
    @XmlEnumValue("volume per area")
    VOLUME_PER_AREA("volume per area"),
    @XmlEnumValue("volume per length")
    VOLUME_PER_LENGTH("volume per length"),
    @XmlEnumValue("volume per mass")
    VOLUME_PER_MASS("volume per mass"),
    @XmlEnumValue("volume per pressure")
    VOLUME_PER_PRESSURE("volume per pressure"),
    @XmlEnumValue("volume per rotation")
    VOLUME_PER_ROTATION("volume per rotation"),
    @XmlEnumValue("volume per time")
    VOLUME_PER_TIME("volume per time"),
    @XmlEnumValue("volume per time length")
    VOLUME_PER_TIME_LENGTH("volume per time length"),
    @XmlEnumValue("volume per time per area")
    VOLUME_PER_TIME_PER_AREA("volume per time per area"),
    @XmlEnumValue("volume per time per length")
    VOLUME_PER_TIME_PER_LENGTH("volume per time per length"),
    @XmlEnumValue("volume per time per pressure")
    VOLUME_PER_TIME_PER_PRESSURE("volume per time per pressure"),
    @XmlEnumValue("volume per time per pressure length")
    VOLUME_PER_TIME_PER_PRESSURE_LENGTH("volume per time per pressure length"),
    @XmlEnumValue("volume per time per time")
    VOLUME_PER_TIME_PER_TIME("volume per time per time"),
    @XmlEnumValue("volume per time per volume")
    VOLUME_PER_TIME_PER_VOLUME("volume per time per volume"),
    @XmlEnumValue("volume per volume")
    VOLUME_PER_VOLUME("volume per volume"),
    @XmlEnumValue("volumetric heat transfer coefficient")
    VOLUMETRIC_HEAT_TRANSFER_COEFFICIENT("volumetric heat transfer coefficient"),
    @XmlEnumValue("volumetric thermal expansion")
    VOLUMETRIC_THERMAL_EXPANSION("volumetric thermal expansion"),
    @XmlEnumValue("unitless")
    UNITLESS("unitless");
    private final String value;

    MeasureClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasureClass fromValue(String v) {
        for (MeasureClass c: MeasureClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
