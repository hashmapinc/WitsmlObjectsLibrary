package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeodeticDatum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="GeodeticDatum">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="ADND"/>
 *     <enumeration value="ARC50"/>
 *     <enumeration value="AUSG"/>
 *     <enumeration value="CAA"/>
 *     <enumeration value="CHAS"/>
 *     <enumeration value="CORAL"/>
 *     <enumeration value="ED50"/>
 *     <enumeration value="ED87"/>
 *     <enumeration value="ERIN65"/>
 *     <enumeration value="GD49"/>
 *     <enumeration value="GHANA"/>
 *     <enumeration value="GUAM63"/>
 *     <enumeration value="HJRS55"/>
 *     <enumeration value="HTS"/>
 *     <enumeration value="INCH"/>
 *     <enumeration value="INDIA1"/>
 *     <enumeration value="INDIA2"/>
 *     <enumeration value="INDNS74"/>
 *     <enumeration value="LIB64"/>
 *     <enumeration value="LUZON"/>
 *     <enumeration value="MRCH"/>
 *     <enumeration value="NAD27"/>
 *     <enumeration value="NAD83"/>
 *     <enumeration value="NGRA"/>
 *     <enumeration value="None"/>
 *     <enumeration value="NPRM"/>
 *     <enumeration value="OSGB36"/>
 *     <enumeration value="POTS1"/>
 *     <enumeration value="PULK1"/>
 *     <enumeration value="PULK2"/>
 *     <enumeration value="QRNQ"/>
 *     <enumeration value="SA56"/>
 *     <enumeration value="SRL60"/>
 *     <enumeration value="TNRV25"/>
 *     <enumeration value="TOKYO"/>
 *     <enumeration value="UserDefined"/>
 *     <enumeration value="VROL"/>
 *     <enumeration value="WGS72"/>
 *     <enumeration value="WGS84"/>
 *     <enumeration value="YACR"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "GeodeticDatum")
@XmlEnum
public enum GeodeticDatum {


    /**
     * Adindian ellipsoid=CL80 region="Sudan, Ethiopia"
     * 
     */
    ADND("ADND"),

    /**
     * ARC 1950 ellipsoid=CL80B region="Southern Africa"
     * 
     */
    @XmlEnumValue("ARC50")
    ARC_50("ARC50"),

    /**
     * Australian ellipsoid=GRS67 region="Australia Geodetic"
     * 
     */
    AUSG("AUSG"),

    /**
     * Camp Area Astro ellipsoid=INT24 region=Antarctica 
     * 
     */
    CAA("CAA"),

    /**
     * Chau Astro ellipsoid=INT24 region=Paraguay 
     * 
     */
    CHAS("CHAS"),

    /**
     * Corrego Alegre ellipsoid=INT24 region=INT24 
     * 
     */
    CORAL("CORAL"),

    /**
     * European 1950 ellipsoid=INT24 region="Europe, Middle East, North Africa"
     * 
     */
    @XmlEnumValue("ED50")
    ED_50("ED50"),

    /**
     * European 1987 ellipsoid=INT24 region="Europe, Middle East, North Africa"
     * 
     */
    @XmlEnumValue("ED87")
    ED_87("ED87"),

    /**
     * Ireland 1965 ellipsoid=AIRY_MOD region=Ireland 
     * 
     */
    @XmlEnumValue("ERIN65")
    ERIN_65("ERIN65"),

    /**
     * Geodetic Datum 1949 ellipsoid=INT24 region="New Zealand"
     * 
     */
    @XmlEnumValue("GD49")
    GD_49("GD49"),

    /**
     * Ghana ellipsoid=WAR24 region=Ghana 
     * 
     */
    GHANA("GHANA"),

    /**
     * Guam 1963 ellipsoid=CL66 region="Marianas Islands"
     * 
     */
    @XmlEnumValue("GUAM63")
    GUAM_63("GUAM63"),

    /**
     * Hjorsey 1955 ellipsoid=INT24 region=Iceland 
     * 
     */
    @XmlEnumValue("HJRS55")
    HJRS_55("HJRS55"),

    /**
     * Hu-Tzu-Shan ellipsoid=INT24 region=Taiwan 
     * 
     */
    HTS("HTS"),

    /**
     * Campo Inchauspe ellipsoid=INT24 region=Argentina 
     * 
     */
    INCH("INCH"),

    /**
     * Indian 'Kalimpur' ellipsoid=EVER region=India 
     * 
     */
    @XmlEnumValue("INDIA1")
    INDIA_1("INDIA1"),

    /**
     * Indian 'Kalimpur' ellipsoid=INT24 region=India 
     * 
     */
    @XmlEnumValue("INDIA2")
    INDIA_2("INDIA2"),

    /**
     * Indonesia 1974 ellipsoid=GRS67 region=Indonesia 
     * 
     */
    @XmlEnumValue("INDNS74")
    INDNS_74("INDNS74"),

    /**
     * Liberia 1964 ellipsoid=CL80 region=Liberia 
     * 
     */
    @XmlEnumValue("LIB64")
    LIB_64("LIB64"),

    /**
     * Luzon ellipsoid=CL66 region=Philippines 
     * 
     */
    LUZON("LUZON"),

    /**
     * Merchich ellipsoid=CL80A region=Morocco 
     * 
     */
    MRCH("MRCH"),

    /**
     * North American 'Meades Ranch' ellipsoid=CL66 region="North America"
     * 
     */
    @XmlEnumValue("NAD27")
    NAD_27("NAD27"),

    /**
     * North American Datum of 1983 ellipsoid=GRS80 region="Canada, Cuba, U.S., Caribbean"
     * 
     */
    @XmlEnumValue("NAD83")
    NAD_83("NAD83"),

    /**
     * Nigeria ellipsoid=CL80 region=Nigeria 
     * 
     */
    NGRA("NGRA"),
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Naparima ellipsoid=INT24 region="Trinidad and Tobago"
     * 
     */
    NPRM("NPRM"),

    /**
     * Ordnance Survey of Great Britain 1936 ellipsoid=AIRY region="Great Britain, Northern Ireland"
     * 
     */
    @XmlEnumValue("OSGB36")
    OSGB_36("OSGB36"),

    /**
     * European 'Pelmert Tower, Potsdam' ellipsoid=INT24 region="Most of Eurasia, Africa"
     * 
     */
    @XmlEnumValue("POTS1")
    POTS_1("POTS1"),

    /**
     * Russian 'Pulkovo' ellipsoid=BESS41 
     * 
     */
    @XmlEnumValue("PULK1")
    PULK_1("PULK1"),

    /**
     * Russian 'Pulkovo' ellipsoid=KRSV 
     * 
     */
    @XmlEnumValue("PULK2")
    PULK_2("PULK2"),

    /**
     * Qornoq ellipsoid=INT24 region=Greenland 
     * 
     */
    QRNQ("QRNQ"),

    /**
     * Provisional South American, 1956 ellipsoid=INT24 region="Bolivia, Chile, Colombia, Ecuador, Peru, Venezuela, the Guianas"
     * 
     */
    @XmlEnumValue("SA56")
    SA_56("SA56"),

    /**
     * Sierra Leone 1960 ellipsoid=CL80 region="Sierra Leone"
     * 
     */
    @XmlEnumValue("SRL60")
    SRL_60("SRL60"),

    /**
     * Tananarive (Antananarivo) Obsv. 1925T ellipsoid=INT24 region="Malagasy Republic"
     * 
     */
    @XmlEnumValue("TNRV25")
    TNRV_25("TNRV25"),

    /**
     * Tokyo ellipsoid=BESS41 region=Japan
     * 
     */
    TOKYO("TOKYO"),

    /**
     * Datum defined elsewhere
     * 
     */
    @XmlEnumValue("UserDefined")
    USER_DEFINED("UserDefined"),

    /**
     * Voirol ellipsoid=CL80 region="Algeria, Tunisia"
     * 
     */
    VROL("VROL"),

    /**
     * World Geodetic System 1972 ellipsoid=WGS72
     * 
     */
    @XmlEnumValue("WGS72")
    WGS_72("WGS72"),

    /**
     * World Geodetic System 1984 ellipsoid=WGS84 region="Sino-Soviet Bloc, SW Asia, Hydrographic, Aeronautical"
     * 
     */
    @XmlEnumValue("WGS84")
    WGS_84("WGS84"),

    /**
     * Yacare ellipsoid=INT24 region=Uruguay
     * 
     */
    YACR("YACR"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    GeodeticDatum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeodeticDatum fromValue(String v) {
        for (GeodeticDatum c: GeodeticDatum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
