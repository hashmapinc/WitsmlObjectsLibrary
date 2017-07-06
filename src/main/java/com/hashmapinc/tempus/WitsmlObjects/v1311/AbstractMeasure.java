package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * The intended abstract supertype of all quantities that have a value 
 * 			with a unit of measure. The unit of measure is in the uom attribute of the subtypes. 
 * 			This type allows all quantities to be profiled to be a 'float' instead of a 'double'.
 * 
 * <p>Java class for abstractMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <complexType name="abstractMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractDouble">
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractMeasure", propOrder = {
    "value"
})
@XmlSeeAlso({
    MomentOfForceMeasure.class,
    AccelerationLinearMeasure.class,
    TimeMeasure.class,
    DimensionlessMeasure.class,
    DensityMeasure.class,
    EnergyPerAreaMeasure.class,
    ForcePerVolumeMeasure.class,
    VolumePerVolumeMeasure.class,
    MagneticFieldStrengthMeasure.class,
    VolumeMeasure.class,
    AnglePerLengthMeasure.class,
    TemperatureSlopeMeasure.class,
    VolumePerVolumeMeasurePercent.class,
    ElectricPotentialMeasure.class,
    PerLengthMeasure.class,
    ThermodynamicTemperatureMeasure.class,
    SpecificVolumeMeasure.class,
    FrequencyMeasure.class,
    MeasuredDepthCoord.class,
    AreaMeasure.class,
    ForceMeasure.class,
    RelativePowerMeasure.class,
    GenericMeasure.class,
    WellElevationCoord.class,
    YAxisAzimuth.class,
    MassPerLengthMeasure.class,
    ForcePerLengthMeasure.class,
    WellVerticalDepthCoord.class,
    LengthMeasure.class,
    AreaPerAreaMeasure.class,
    PressureMeasure.class,
    EquivalentPerMassMeasure.class,
    DynamicViscosityMeasure.class,
    ElectricCurrentMeasure.class,
    LengthPerLengthMeasure.class,
    VelocityMeasure.class,
    MassMeasure.class,
    GeneralMeasureType.class,
    IlluminanceMeasure.class,
    AnglePerTimeMeasure.class,
    PlaneAngleMeasure.class,
    MassConcentrationMeasure.class,
    RatioGenericMeasure.class,
    PowerMeasure.class,
    VolumeFlowRateMeasure.class,
    MagneticInductionMeasure.class
})
public abstract class AbstractMeasure {

    @XmlValue
    protected double value;

    /**
     * This type disallows an "empty" double value.
     * 			This type should not be used directly except to derive another type.
     * @return returns the value as a Double
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * @param value The value to set as a Double
     */
    public void setValue(double value) {
        this.value = value;
    }

}
