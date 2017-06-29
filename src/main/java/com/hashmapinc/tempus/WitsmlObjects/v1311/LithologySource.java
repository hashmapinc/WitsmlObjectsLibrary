package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LithologySource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="LithologySource">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="interpreted"/>
 *     <enumeration value="core"/>
 *     <enumeration value="cuttings"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "LithologySource")
@XmlEnum
public enum LithologySource {


    /**
     * The lithology has one overall interpretation based on 
     * 					several sources such as logs and cuttings or cores.
     * 
     */
    @XmlEnumValue("interpreted")
    INTERPRETED("interpreted"),

    /**
     * The lithology as based on a visual inspection of the core.
     * 					A percentage is commonly assigned to each portion of the lithology.
     * 
     */
    @XmlEnumValue("core")
    CORE("core"),

    /**
     * The lithology as based on a visual inspection of the cuttings.
     * 					A percentage is commonly assigned to each portion of the lithology.
     * 
     */
    @XmlEnumValue("cuttings")
    CUTTINGS("cuttings"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LithologySource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LithologySource fromValue(String v) {
        for (LithologySource c: LithologySource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
