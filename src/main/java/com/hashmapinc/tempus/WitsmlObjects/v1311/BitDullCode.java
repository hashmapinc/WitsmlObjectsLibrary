package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BitDullCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="BitDullCode">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="BC"/>
 *     <enumeration value="BT"/>
 *     <enumeration value="BU"/>
 *     <enumeration value="CC"/>
 *     <enumeration value="CD"/>
 *     <enumeration value="CI"/>
 *     <enumeration value="CR"/>
 *     <enumeration value="CT"/>
 *     <enumeration value="ER"/>
 *     <enumeration value="FC"/>
 *     <enumeration value="HC"/>
 *     <enumeration value="JD"/>
 *     <enumeration value="LC"/>
 *     <enumeration value="LN"/>
 *     <enumeration value="LT"/>
 *     <enumeration value="NO"/>
 *     <enumeration value="OC"/>
 *     <enumeration value="PB"/>
 *     <enumeration value="PN"/>
 *     <enumeration value="RG"/>
 *     <enumeration value="RO"/>
 *     <enumeration value="SD"/>
 *     <enumeration value="SS"/>
 *     <enumeration value="TR"/>
 *     <enumeration value="WO"/>
 *     <enumeration value="WT"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "BitDullCode")
@XmlEnum
public enum BitDullCode {


    /**
     * Broken Cone
     * 
     */
    BC("BC"),

    /**
     * Broken teeth/cutters
     * 
     */
    BT("BT"),

    /**
     * Balled Up
     * 
     */
    BU("BU"),

    /**
     * Cracked Cone
     * 
     */
    CC("CC"),

    /**
     * Cone Dragged
     * 
     */
    CD("CD"),

    /**
     * Cone Interference
     * 
     */
    CI("CI"),

    /**
     * Cored
     * 
     */
    CR("CR"),

    /**
     * Chipped Teeth
     * 
     */
    CT("CT"),

    /**
     * Erosion
     * 
     */
    ER("ER"),

    /**
     * Flat Crested Wear
     * 
     */
    FC("FC"),

    /**
     * Heat Checking
     * 
     */
    HC("HC"),

    /**
     * Junk Damage
     * 
     */
    JD("JD"),

    /**
     * Lost Nozzle
     * 
     */
    LC("LC"),

    /**
     * Lost Nozzle
     * 
     */
    LN("LN"),

    /**
     * Lost Teeth/Cutters
     * 
     */
    LT("LT"),

    /**
     * No Dull/No Other Wear
     * 
     */
    NO("NO"),

    /**
     * Off-Center Wear
     * 
     */
    OC("OC"),

    /**
     * Pinched Bit
     * 
     */
    PB("PB"),

    /**
     * Plugged Nozzle
     * 
     */
    PN("PN"),

    /**
     * Rounded Gauge
     * 
     */
    RG("RG"),

    /**
     * Ring Out
     * 
     */
    RO("RO"),

    /**
     * Shirttail Damage
     * 
     */
    SD("SD"),

    /**
     * Self-Sharpening Wear
     * 
     */
    SS("SS"),

    /**
     * Tracking
     * 
     */
    TR("TR"),

    /**
     * WashOut on Bit
     * 
     */
    WO("WO"),

    /**
     * Worn Teeth/Cutters
     * 
     */
    WT("WT"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    BitDullCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BitDullCode fromValue(String v) {
        for (BitDullCode c: BitDullCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
