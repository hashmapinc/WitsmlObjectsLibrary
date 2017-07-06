package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FiberMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="FiberMode">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="singlemode"/>
 *     <enumeration value="multimode"/>
 *     <enumeration value="other"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "FiberMode")
@XmlEnum
public enum FiberMode {


    /**
     * A single, narrow, core of constant refractive index, 
     * 					surrounded by glass cladding. The core diameter is comparable to a 
     * 					wave length of the light (about 5 um).
     * 
     */
    @XmlEnumValue("singlemode")
    SINGLEMODE("singlemode"),

    /**
     * The core has a graded refractive index. The 
     * 					core is generally about 50um in diameter.
     * 
     */
    @XmlEnumValue("multimode")
    MULTIMODE("multimode"),

    /**
     * The fiber mode is neither singlemode or multimode.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    FiberMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FiberMode fromValue(String v) {
        for (FiberMode c: FiberMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
