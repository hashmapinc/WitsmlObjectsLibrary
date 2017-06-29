package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RigType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="RigType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="barge"/>
 *     <enumeration value="coiled tubing"/>
 *     <enumeration value="floater"/>
 *     <enumeration value="jackup"/>
 *     <enumeration value="land"/>
 *     <enumeration value="platform"/>
 *     <enumeration value="semi-submersible"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "RigType")
@XmlEnum
public enum RigType {


    /**
     * Barge rig
     * 
     */
    @XmlEnumValue("barge")
    BARGE("barge"),

    /**
     * Coiled tubing rig
     * 
     */
    @XmlEnumValue("coiled tubing")
    COILED_TUBING("coiled tubing"),

    /**
     * Floating rig
     * 
     */
    @XmlEnumValue("floater")
    FLOATER("floater"),

    /**
     * Jackup rig
     * 
     */
    @XmlEnumValue("jackup")
    JACKUP("jackup"),

    /**
     * Land rig
     * 
     */
    @XmlEnumValue("land")
    LAND("land"),

    /**
     * Fixed platform
     * 
     */
    @XmlEnumValue("platform")
    PLATFORM("platform"),

    /**
     * Semisubmersible rig
     * 
     */
    @XmlEnumValue("semi-submersible")
    SEMI_SUBMERSIBLE("semi-submersible"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    RigType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RigType fromValue(String v) {
        for (RigType c: RigType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
