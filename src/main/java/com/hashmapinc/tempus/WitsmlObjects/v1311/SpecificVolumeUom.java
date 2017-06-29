package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specificVolumeUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="specificVolumeUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="m3/kg"/>
 *     <enumeration value="bbl/tonUK"/>
 *     <enumeration value="bbl/tonUS"/>
 *     <enumeration value="cm3/g"/>
 *     <enumeration value="dm3/kg"/>
 *     <enumeration value="dm3/t"/>
 *     <enumeration value="ft3/kg"/>
 *     <enumeration value="ft3/lbm"/>
 *     <enumeration value="ft3/sack94"/>
 *     <enumeration value="galUS/sack94"/>
 *     <enumeration value="galUK/lbm"/>
 *     <enumeration value="galUS/lbm"/>
 *     <enumeration value="galUS/tonUK"/>
 *     <enumeration value="galUS/tonUS"/>
 *     <enumeration value="L/100kg"/>
 *     <enumeration value="L/kg"/>
 *     <enumeration value="L/t"/>
 *     <enumeration value="L/tonUK"/>
 *     <enumeration value="m3/g"/>
 *     <enumeration value="m3/t"/>
 *     <enumeration value="m3/tonUK"/>
 *     <enumeration value="m3/tonUS"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "specificVolumeUom")
@XmlEnum
public enum SpecificVolumeUom {

    @XmlEnumValue("m3/kg")
    M_3_KG("m3/kg"),
    @XmlEnumValue("bbl/tonUK")
    BBL_TON_UK("bbl/tonUK"),
    @XmlEnumValue("bbl/tonUS")
    BBL_TON_US("bbl/tonUS"),
    @XmlEnumValue("cm3/g")
    CM_3_G("cm3/g"),
    @XmlEnumValue("dm3/kg")
    DM_3_KG("dm3/kg"),
    @XmlEnumValue("dm3/t")
    DM_3_T("dm3/t"),
    @XmlEnumValue("ft3/kg")
    FT_3_KG("ft3/kg"),
    @XmlEnumValue("ft3/lbm")
    FT_3_LBM("ft3/lbm"),
    @XmlEnumValue("ft3/sack94")
    FT_3_SACK_94("ft3/sack94"),
    @XmlEnumValue("galUS/sack94")
    GAL_US_SACK_94("galUS/sack94"),
    @XmlEnumValue("galUK/lbm")
    GAL_UK_LBM("galUK/lbm"),
    @XmlEnumValue("galUS/lbm")
    GAL_US_LBM("galUS/lbm"),
    @XmlEnumValue("galUS/tonUK")
    GAL_US_TON_UK("galUS/tonUK"),
    @XmlEnumValue("galUS/tonUS")
    GAL_US_TON_US("galUS/tonUS"),
    @XmlEnumValue("L/100kg")
    L_100_KG("L/100kg"),
    @XmlEnumValue("L/kg")
    L_KG("L/kg"),
    @XmlEnumValue("L/t")
    L_T("L/t"),
    @XmlEnumValue("L/tonUK")
    L_TON_UK("L/tonUK"),
    @XmlEnumValue("m3/g")
    M_3_G("m3/g"),
    @XmlEnumValue("m3/t")
    M_3_T("m3/t"),
    @XmlEnumValue("m3/tonUK")
    M_3_TON_UK("m3/tonUK"),
    @XmlEnumValue("m3/tonUS")
    M_3_TON_US("m3/tonUS");
    private final String value;

    SpecificVolumeUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecificVolumeUom fromValue(String v) {
        for (SpecificVolumeUom c: SpecificVolumeUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
