


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellFluid.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="WellFluid">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="air"/>
 *     <enumeration value="condensate"/>
 *     <enumeration value="dry"/>
 *     <enumeration value="gas"/>
 *     <enumeration value="gas-water"/>
 *     <enumeration value="non HC gas"/>
 *     <enumeration value="non HC gas -- CO2"/>
 *     <enumeration value="oil"/>
 *     <enumeration value="oil-gas"/>
 *     <enumeration value="oil-water"/>
 *     <enumeration value="steam"/>
 *     <enumeration value="water"/>
 *     <enumeration value="water -- brine"/>
 *     <enumeration value="water -- fresh water"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WellFluid", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum WellFluid {


    /**
     * This is generally an injected fluid.
     * 
     */
    @XmlEnumValue("air")
    AIR("air"),

    /**
     * Liquid hydrocarbons produced with natural gas that are separated from the gas by cooling and various other means. Condensate generally has an API gravity of 50 degrees to 120 degrees and is water white, straw, or bluish in color. It is the liquid recovery from a well classified as a gas well. It is generally dissolved in the gaseous state under reservoir conditions but separates as a liquid either in passing up the hole or at the surface. These hydrocarbons, from associated and non-associated gas well gas, normally are recovered from lease separators or field facilities by mechanical separation.
     * 
     */
    @XmlEnumValue("condensate")
    CONDENSATE("condensate"),

    /**
     * The well facility is classified as a dry well. 
     * It has not been, nor will it be used to produce or inject any fluids.
     * 
     */
    @XmlEnumValue("dry")
    DRY("dry"),

    /**
     * The well is classified as a gas well, producing or injecting a hydrocarbon gas. The gas is generally methane but may have a mixture of other gases also.
     * 
     */
    @XmlEnumValue("gas")
    GAS("gas"),

    /**
     * The well facility is classified as producing both gas and water. USe this classification when the produced stream flow is a mixture of gas and water. When a facility produces gas and water in separate streams, classify it twice, as gas and as water.
     * 
     */
    @XmlEnumValue("gas-water")
    GAS_WATER("gas-water"),

    /**
     * The well produces or injects non-hydrocarbon gases. Typical other gases would be helium and carbon dioxide.
     * 
     */
    @XmlEnumValue("non HC gas")
    NON_HC_GAS("non HC gas"),

    /**
     * Carbon dioxide gas.
     * 
     */
    @XmlEnumValue("non HC gas -- CO2")
    NON_HC_GAS_CO_2("non HC gas -- CO2"),

    /**
     * The liquid hydrocarbon generally referred to as crude oil.
     * 
     */
    @XmlEnumValue("oil")
    OIL("oil"),

    /**
     * The well facility is classified as producing both gas and oil. Use this classification when the produced stream flow is a mixture of oil and gas. When a facility produces oil and gas in separate streams, classify it twice, as oil and as gas.
     * 
     */
    @XmlEnumValue("oil-gas")
    OIL_GAS("oil-gas"),

    /**
     * The well facility is classified as producing both oil and water. Use this classification when the produced stream flow is a mixture of oil and water. When a facility produces oil and water in separate streams, classify it twice, as oil and as water.
     * 
     */
    @XmlEnumValue("oil-water")
    OIL_WATER("oil-water"),

    /**
     * The gaseous state of water. This is generally an 
     * injected fluid, but it is possible that some hydrothermal wells 
     * produce steam.
     * 
     */
    @XmlEnumValue("steam")
    STEAM("steam"),

    /**
     * The well is classified as a water well without 
     * distinguishing between brine or fresh water.
     * 
     */
    @XmlEnumValue("water")
    WATER("water"),

    /**
     * The well facility is classified as producing 
     * or injecting salt water.
     * 
     */
    @XmlEnumValue("water -- brine")
    WATER_BRINE("water -- brine"),

    /**
     * The well facility is classified as producing 
     * fresh water that is capable of use for drinking or crop irrigation.
     * 
     */
    @XmlEnumValue("water -- fresh water")
    WATER_FRESH_WATER("water -- fresh water");
    private final String value;

    WellFluid(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WellFluid fromValue(String v) {
        for (WellFluid c: WellFluid.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
