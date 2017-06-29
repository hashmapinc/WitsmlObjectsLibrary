package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Projection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="Projection">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="Albers equal area"/>
 *     <enumeration value="azimuthal equidistant"/>
 *     <enumeration value="Cassini"/>
 *     <enumeration value="equidistant conic"/>
 *     <enumeration value="equirectangular"/>
 *     <enumeration value="gnomonic"/>
 *     <enumeration value="Lambert azimuthal"/>
 *     <enumeration value="Lambert conformal conic"/>
 *     <enumeration value="Mercator"/>
 *     <enumeration value="Miller"/>
 *     <enumeration value="oblique Mercator"/>
 *     <enumeration value="orthographic"/>
 *     <enumeration value="perspective"/>
 *     <enumeration value="polar stereographic"/>
 *     <enumeration value="polyconic"/>
 *     <enumeration value="sinusoidal"/>
 *     <enumeration value="state plane"/>
 *     <enumeration value="stereographic"/>
 *     <enumeration value="transverse Mercator"/>
 *     <enumeration value="universal transverse Mercator"/>
 *     <enumeration value="user defined"/>
 *     <enumeration value="Van der Grinten"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "Projection")
@XmlEnum
public enum Projection {


    /**
     *  217-PARAMETERS-PROJECTION-ALBERS
     * 
     */
    @XmlEnumValue("Albers equal area")
    ALBERS_EQUAL_AREA("Albers equal area"),

    /**
     *  217-PARAMETERS-PROJECTION-AZIMUTHAL
     * 
     */
    @XmlEnumValue("azimuthal equidistant")
    AZIMUTHAL_EQUIDISTANT("azimuthal equidistant"),

    /**
     *  217-PARAMETERS-PROJECTION-CASSINI
     * 
     */
    @XmlEnumValue("Cassini")
    CASSINI("Cassini"),

    /**
     *  217-PARAMETERS-PROJECTION-EQUIDISTANT
     * 
     */
    @XmlEnumValue("equidistant conic")
    EQUIDISTANT_CONIC("equidistant conic"),

    /**
     *  217-PARAMETERS-PROJECTION-EQUIRECTANGULAR
     * 
     */
    @XmlEnumValue("equirectangular")
    EQUIRECTANGULAR("equirectangular"),

    /**
     *  217-PARAMETERS-PROJECTION-GNOMONIC
     * 
     */
    @XmlEnumValue("gnomonic")
    GNOMONIC("gnomonic"),

    /**
     *  217-PARAMETERS-PROJECTION-LAMBERT-AZIMUTH
     * 
     */
    @XmlEnumValue("Lambert azimuthal")
    LAMBERT_AZIMUTHAL("Lambert azimuthal"),

    /**
     *  217-PARAMETERS-PROJECTION-LAMBERT
     * 
     */
    @XmlEnumValue("Lambert conformal conic")
    LAMBERT_CONFORMAL_CONIC("Lambert conformal conic"),

    /**
     *  217-PARAMETERS-PROJECTION-MERCATOR
     * 
     */
    @XmlEnumValue("Mercator")
    MERCATOR("Mercator"),

    /**
     *  217-PARAMETERS-PROJECTION-MILLER
     * 
     */
    @XmlEnumValue("Miller")
    MILLER("Miller"),

    /**
     *  217-PARAMETERS-PROJECTION-OBLIQUE-MERCATOR
     * 
     */
    @XmlEnumValue("oblique Mercator")
    OBLIQUE_MERCATOR("oblique Mercator"),

    /**
     *  217-PARAMETERS-PROJECTION-ORTHO
     * 
     */
    @XmlEnumValue("orthographic")
    ORTHOGRAPHIC("orthographic"),

    /**
     *  217-PARAMETERS-PROJECTION-PERSPECTIVE
     * 
     */
    @XmlEnumValue("perspective")
    PERSPECTIVE("perspective"),

    /**
     *  217-PARAMETERS-PROJECTION-POLAR-STEREO
     * 
     */
    @XmlEnumValue("polar stereographic")
    POLAR_STEREOGRAPHIC("polar stereographic"),

    /**
     *  217-PARAMETERS-PROJECTION-POLYCONIC
     * 
     */
    @XmlEnumValue("polyconic")
    POLYCONIC("polyconic"),

    /**
     *  217-PARAMETERS-PROJECTION-SINUSOIDAL
     * 
     */
    @XmlEnumValue("sinusoidal")
    SINUSOIDAL("sinusoidal"),

    /**
     *  217-PARAMETERS-PROJECTION-STATE-PLANE
     * 
     */
    @XmlEnumValue("state plane")
    STATE_PLANE("state plane"),

    /**
     *  217-PARAMETERS-PROJECTION-STEREO
     * 
     */
    @XmlEnumValue("stereographic")
    STEREOGRAPHIC("stereographic"),

    /**
     *  217-PARAMETERS-PROJECTION-TM
     * 
     */
    @XmlEnumValue("transverse Mercator")
    TRANSVERSE_MERCATOR("transverse Mercator"),

    /**
     *  217-PARAMETERS-PROJECTION-UTM
     * 
     */
    @XmlEnumValue("universal transverse Mercator")
    UNIVERSAL_TRANSVERSE_MERCATOR("universal transverse Mercator"),
    @XmlEnumValue("user defined")
    USER_DEFINED("user defined"),

    /**
     *  217-PARAMETERS-PROJECTION-VANDERGRINTEN
     * 
     */
    @XmlEnumValue("Van der Grinten")
    VAN_DER_GRINTEN("Van der Grinten"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    Projection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Projection fromValue(String v) {
        for (Projection c: Projection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
