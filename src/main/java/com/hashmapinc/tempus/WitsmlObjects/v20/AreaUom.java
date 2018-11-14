


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AreaUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="acre"/>
 *     <enumeration value="b"/>
 *     <enumeration value="cm2"/>
 *     <enumeration value="ft2"/>
 *     <enumeration value="ha"/>
 *     <enumeration value="in2"/>
 *     <enumeration value="km2"/>
 *     <enumeration value="m2"/>
 *     <enumeration value="mi[US]2"/>
 *     <enumeration value="mi2"/>
 *     <enumeration value="mm2"/>
 *     <enumeration value="section"/>
 *     <enumeration value="um2"/>
 *     <enumeration value="yd2"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AreaUom")
@XmlEnum
public enum AreaUom {


    /**
     * acre
     * 
     */
    @XmlEnumValue("acre")
    ACRE("acre"),

    /**
     * barn
     * 
     */
    @XmlEnumValue("b")
    B("b"),

    /**
     * square centimetre
     * 
     */
    @XmlEnumValue("cm2")
    CM_2("cm2"),

    /**
     * square foot
     * 
     */
    @XmlEnumValue("ft2")
    FT_2("ft2"),

    /**
     * hectare
     * 
     */
    @XmlEnumValue("ha")
    HA("ha"),

    /**
     * square inch
     * 
     */
    @XmlEnumValue("in2")
    IN_2("in2"),

    /**
     * square kilometre
     * 
     */
    @XmlEnumValue("km2")
    KM_2("km2"),

    /**
     * square metre
     * 
     */
    @XmlEnumValue("m2")
    M_2("m2"),

    /**
     * square US survey mile
     * 
     */
    @XmlEnumValue("mi[US]2")
    MI_US_2("mi[US]2"),

    /**
     * square mile
     * 
     */
    @XmlEnumValue("mi2")
    MI_2("mi2"),

    /**
     * square millimetre
     * 
     */
    @XmlEnumValue("mm2")
    MM_2("mm2"),

    /**
     * section
     * 
     */
    @XmlEnumValue("section")
    SECTION("section"),

    /**
     * square micrometre
     * 
     */
    @XmlEnumValue("um2")
    UM_2("um2"),

    /**
     * square yard
     * 
     */
    @XmlEnumValue("yd2")
    YD_2("yd2");
    private final String value;

    AreaUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaUom fromValue(String v) {
        for (AreaUom c: AreaUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
