package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ellipsoid.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="Ellipsoid">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="AGD66"/>
 *     <enumeration value="AIRY_MOD"/>
 *     <enumeration value="AIRY30"/>
 *     <enumeration value="AIRY49"/>
 *     <enumeration value="AUST_NAT"/>
 *     <enumeration value="BESL-DHD"/>
 *     <enumeration value="BESL-NGL"/>
 *     <enumeration value="BESL-RT9"/>
 *     <enumeration value="BESS41"/>
 *     <enumeration value="BESSNAM"/>
 *     <enumeration value="BOGOTA"/>
 *     <enumeration value="CL58"/>
 *     <enumeration value="CL58-1"/>
 *     <enumeration value="CL66"/>
 *     <enumeration value="CL66-M"/>
 *     <enumeration value="CL80"/>
 *     <enumeration value="CL80-A"/>
 *     <enumeration value="CL80-B"/>
 *     <enumeration value="CL80-I"/>
 *     <enumeration value="CL80-J"/>
 *     <enumeration value="CL80-M"/>
 *     <enumeration value="CL80-P"/>
 *     <enumeration value="CMPOINCH"/>
 *     <enumeration value="DAN"/>
 *     <enumeration value="DELA"/>
 *     <enumeration value="ED50"/>
 *     <enumeration value="EGYPT07"/>
 *     <enumeration value="EVER"/>
 *     <enumeration value="EVER48"/>
 *     <enumeration value="EVER56"/>
 *     <enumeration value="EVER69"/>
 *     <enumeration value="EVER-BR"/>
 *     <enumeration value="EVERMOD"/>
 *     <enumeration value="EVER-P"/>
 *     <enumeration value="EVER-TM"/>
 *     <enumeration value="EVTM"/>
 *     <enumeration value="FISC60"/>
 *     <enumeration value="FISC60MOD"/>
 *     <enumeration value="FISC68"/>
 *     <enumeration value="FISCMOD"/>
 *     <enumeration value="GDA94"/>
 *     <enumeration value="GRS67"/>
 *     <enumeration value="GRS80"/>
 *     <enumeration value="HAY09"/>
 *     <enumeration value="HEIS"/>
 *     <enumeration value="HEL06"/>
 *     <enumeration value="HEL07"/>
 *     <enumeration value="HOUG"/>
 *     <enumeration value="IAG-75"/>
 *     <enumeration value="INDIAN75"/>
 *     <enumeration value="INDO-74"/>
 *     <enumeration value="INT24"/>
 *     <enumeration value="IUGG67"/>
 *     <enumeration value="IUGG75"/>
 *     <enumeration value="JEFF48"/>
 *     <enumeration value="KAU63"/>
 *     <enumeration value="KRSV"/>
 *     <enumeration value="MERIT83"/>
 *     <enumeration value="NAD27"/>
 *     <enumeration value="NAHRAN"/>
 *     <enumeration value="NEWINT67"/>
 *     <enumeration value="NWL-10D"/>
 *     <enumeration value="NWL-9D"/>
 *     <enumeration value="OSGB36"/>
 *     <enumeration value="OSU86F"/>
 *     <enumeration value="OSU91A"/>
 *     <enumeration value="PLESSIS-1817"/>
 *     <enumeration value="PSAD56"/>
 *     <enumeration value="PTNOIRE"/>
 *     <enumeration value="SA69"/>
 *     <enumeration value="SPHR"/>
 *     <enumeration value="STRU"/>
 *     <enumeration value="WALB"/>
 *     <enumeration value="WAR24"/>
 *     <enumeration value="WGS60"/>
 *     <enumeration value="WGS66"/>
 *     <enumeration value="WGS72"/>
 *     <enumeration value="WGS84"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "Ellipsoid")
@XmlEnum
public enum Ellipsoid {


    /**
     * Australian Old
     * 
     */
    @XmlEnumValue("AGD66")
    AGD_66("AGD66"),

    /**
     * Modified Airy
     * 
     */
    AIRY_MOD("AIRY_MOD"),

    /**
     * Airy 1830
     * 
     */
    @XmlEnumValue("AIRY30")
    AIRY_30("AIRY30"),

    /**
     * Airy 1849
     * 
     */
    @XmlEnumValue("AIRY49")
    AIRY_49("AIRY49"),

    /**
     * Australian National Same as KAU63 and SA69
     * 
     */
    AUST_NAT("AUST_NAT"),

    /**
     * Bessel Modified
     * 
     */
    @XmlEnumValue("BESL-DHD")
    BESL_DHD("BESL-DHD"),

    /**
     * Bessel - NGO 1948
     * 
     */
    @XmlEnumValue("BESL-NGL")
    BESL_NGL("BESL-NGL"),

    /**
     * Bessel - RT90
     * 
     */
    @XmlEnumValue("BESL-RT9")
    BESL_RT_9("BESL-RT9"),

    /**
     * Bessel 1841
     * 
     */
    @XmlEnumValue("BESS41")
    BESS_41("BESS41"),

    /**
     * Bessel 1841 for Namibia
     * 
     */
    BESSNAM("BESSNAM"),

    /**
     * BOGOTA (International 1924)
     * 
     */
    BOGOTA("BOGOTA"),

    /**
     * Clarke 1858
     * 
     */
    @XmlEnumValue("CL58")
    CL_58("CL58"),

    /**
     * Clarke 1858-1
     * 
     */
    @XmlEnumValue("CL58-1")
    CL_58_1("CL58-1"),

    /**
     * Clarke 1866
     * 
     */
    @XmlEnumValue("CL66")
    CL_66("CL66"),

    /**
     * Clarke 1866 for Michigan
     * 
     */
    @XmlEnumValue("CL66-M")
    CL_66_M("CL66-M"),

    /**
     * Clarke 1880
     * 
     */
    @XmlEnumValue("CL80")
    CL_80("CL80"),

    /**
     * Clarke 1880 variation A
     * 
     */
    @XmlEnumValue("CL80-A")
    CL_80_A("CL80-A"),

    /**
     * Clarke 1880 variation B
     * 
     */
    @XmlEnumValue("CL80-B")
    CL_80_B("CL80-B"),

    /**
     * Clarke 1880 IGN
     * 
     */
    @XmlEnumValue("CL80-I")
    CL_80_I("CL80-I"),

    /**
     * Clarke 1880 for Jamaica
     * 
     */
    @XmlEnumValue("CL80-J")
    CL_80_J("CL80-J"),

    /**
     * Clarke 1880 for Merchich
     * 
     */
    @XmlEnumValue("CL80-M")
    CL_80_M("CL80-M"),

    /**
     * Clarke 1880 for Palestine
     * 
     */
    @XmlEnumValue("CL80-P")
    CL_80_P("CL80-P"),

    /**
     * CAMPO INCH (International 1924)
     * 
     */
    CMPOINCH("CMPOINCH"),

    /**
     * Danish
     * 
     */
    DAN("DAN"),

    /**
     * DELAMBRE 1810 
     * 
     */
    DELA("DELA"),

    /**
     * ED50 (International 1924)
     * 
     */
    @XmlEnumValue("ED50")
    ED_50("ED50"),

    /**
     * EGYPT07 (Helmert 1906)
     * 
     */
    @XmlEnumValue("EGYPT07")
    EGYPT_07("EGYPT07"),

    /**
     * Everest 1830 - Indian
     * 
     */
    EVER("EVER"),

    /**
     * Everest 1948
     * 
     */
    @XmlEnumValue("EVER48")
    EVER_48("EVER48"),

    /**
     * Everest 1956
     * 
     */
    @XmlEnumValue("EVER56")
    EVER_56("EVER56"),

    /**
     * Everest 1969
     * 
     */
    @XmlEnumValue("EVER69")
    EVER_69("EVER69"),

    /**
     * Everest Brunei
     * 
     */
    @XmlEnumValue("EVER-BR")
    EVER_BR("EVER-BR"),

    /**
     * Modified Everest
     * 
     */
    EVERMOD("EVERMOD"),

    /**
     * Everest Pakistan
     * 
     */
    @XmlEnumValue("EVER-P")
    EVER_P("EVER-P"),

    /**
     * Everest 1830 (modified) Timbalai
     * 
     */
    @XmlEnumValue("EVER-TM")
    EVER_TM("EVER-TM"),

    /**
     * Everest - Timbali 
     * 
     */
    EVTM("EVTM"),

    /**
     * "Fischer 1960 aka ""Mercury"""
     * 
     */
    @XmlEnumValue("FISC60")
    FISC_60("FISC60"),

    /**
     * Fischer 1960 Modified
     * 
     */
    @XmlEnumValue("FISC60MOD")
    FISC_60_MOD("FISC60MOD"),

    /**
     * "Fischer 1968 aka ""Modified Mercury"""
     * 
     */
    @XmlEnumValue("FISC68")
    FISC_68("FISC68"),

    /**
     * "Modified Fischer 1960 aka ""South Asia"""
     * 
     */
    FISCMOD("FISCMOD"),

    /**
     * GDA94 - Australia
     * 
     */
    @XmlEnumValue("GDA94")
    GDA_94("GDA94"),

    /**
     * Geodetic Reference System 1967
     * 
     */
    @XmlEnumValue("GRS67")
    GRS_67("GRS67"),

    /**
     * Geodetic Reference System 1980
     * 
     */
    @XmlEnumValue("GRS80")
    GRS_80("GRS80"),

    /**
     * Hayford 1909
     * 
     */
    @XmlEnumValue("HAY09")
    HAY_09("HAY09"),

    /**
     * Heiskanen 1929
     * 
     */
    HEIS("HEIS"),

    /**
     * Helmert 1906
     * 
     */
    @XmlEnumValue("HEL06")
    HEL_06("HEL06"),

    /**
     * Helmert 1907 
     * 
     */
    @XmlEnumValue("HEL07")
    HEL_07("HEL07"),

    /**
     * Hough 1956 
     * 
     */
    HOUG("HOUG"),

    /**
     * IAG 75
     * 
     */
    @XmlEnumValue("IAG-75")
    IAG_75("IAG-75"),

    /**
     * INDIAN75 (Everest 1930)
     * 
     */
    @XmlEnumValue("INDIAN75")
    INDIAN_75("INDIAN75"),

    /**
     * INDO74 (Indonesian 1974)
     * 
     */
    @XmlEnumValue("INDO-74")
    INDO_74("INDO-74"),

    /**
     * International 1924
     * 
     */
    @XmlEnumValue("INT24")
    INT_24("INT24"),

    /**
     * IUGG 1967
     * 
     */
    @XmlEnumValue("IUGG67")
    IUGG_67("IUGG67"),

    /**
     * IUGG 1975
     * 
     */
    @XmlEnumValue("IUGG75")
    IUGG_75("IUGG75"),

    /**
     * Jeffreys 1948
     * 
     */
    @XmlEnumValue("JEFF48")
    JEFF_48("JEFF48"),

    /**
     * Kaula 1963 Same as AUST_NAT and SA69
     * 
     */
    @XmlEnumValue("KAU63")
    KAU_63("KAU63"),

    /**
     * Krassovsky
     * 
     */
    KRSV("KRSV"),

    /**
     * MERIT83
     * 
     */
    @XmlEnumValue("MERIT83")
    MERIT_83("MERIT83"),

    /**
     * NAD27 (Clarke 1866)
     * 
     */
    @XmlEnumValue("NAD27")
    NAD_27("NAD27"),

    /**
     * NAHRAN (Clarke 1880)
     * 
     */
    NAHRAN("NAHRAN"),

    /**
     * New International 1967
     * 
     */
    @XmlEnumValue("NEWINT67")
    NEWINT_67("NEWINT67"),

    /**
     * NWL 10D
     * 
     */
    @XmlEnumValue("NWL-10D")
    NWL_10_D("NWL-10D"),

    /**
     * NWL 9D
     * 
     */
    @XmlEnumValue("NWL-9D")
    NWL_9_D("NWL-9D"),

    /**
     * OSGB36 (Airy 1830)
     * 
     */
    @XmlEnumValue("OSGB36")
    OSGB_36("OSGB36"),

    /**
     * OSU86F
     * 
     */
    @XmlEnumValue("OSU86F")
    OSU_86_F("OSU86F"),

    /**
     * OSU91A
     * 
     */
    @XmlEnumValue("OSU91A")
    OSU_91_A("OSU91A"),

    /**
     * Plessis 1817
     * 
     */
    @XmlEnumValue("PLESSIS-1817")
    PLESSIS_1817("PLESSIS-1817"),

    /**
     * PSAD56 (International 1924)
     * 
     */
    @XmlEnumValue("PSAD56")
    PSAD_56("PSAD56"),

    /**
     * Pointe Noire 1948
     * 
     */
    PTNOIRE("PTNOIRE"),

    /**
     * South American 1969
     * 
     */
    @XmlEnumValue("SA69")
    SA_69("SA69"),

    /**
     * Sphere of radius 6370997
     * 
     */
    SPHR("SPHR"),

    /**
     * Struve 1860
     * 
     */
    STRU("STRU"),

    /**
     * Walbeck
     * 
     */
    WALB("WALB"),

    /**
     * War Office 1924
     * 
     */
    @XmlEnumValue("WAR24")
    WAR_24("WAR24"),

    /**
     * World Geodetic System 1960
     * 
     */
    @XmlEnumValue("WGS60")
    WGS_60("WGS60"),

    /**
     * World Geodetic System 1966
     * 
     */
    @XmlEnumValue("WGS66")
    WGS_66("WGS66"),

    /**
     * World Geodetic System 1972
     * 
     */
    @XmlEnumValue("WGS72")
    WGS_72("WGS72"),

    /**
     * World Geodetic System 1984
     * 
     */
    @XmlEnumValue("WGS84")
    WGS_84("WGS84"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    Ellipsoid(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Ellipsoid fromValue(String v) {
        for (Ellipsoid c: Ellipsoid.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
