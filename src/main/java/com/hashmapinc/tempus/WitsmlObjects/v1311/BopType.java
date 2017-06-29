package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BopType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="BopType">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="annular preventer"/>
 *     <enumeration value="shear ram"/>
 *     <enumeration value="blind ram"/>
 *     <enumeration value="pipe ram"/>
 *     <enumeration value="drilling spool"/>
 *     <enumeration value="flexible joint"/>
 *     <enumeration value="connector"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "BopType")
@XmlEnum
public enum BopType {

    @XmlEnumValue("annular preventer")
    ANNULAR_PREVENTER("annular preventer"),
    @XmlEnumValue("shear ram")
    SHEAR_RAM("shear ram"),
    @XmlEnumValue("blind ram")
    BLIND_RAM("blind ram"),
    @XmlEnumValue("pipe ram")
    PIPE_RAM("pipe ram"),
    @XmlEnumValue("drilling spool")
    DRILLING_SPOOL("drilling spool"),
    @XmlEnumValue("flexible joint")
    FLEXIBLE_JOINT("flexible joint"),
    @XmlEnumValue("connector")
    CONNECTOR("connector"),

    /**
     * The value is not known. This value should not be used
     * 					in normal situations. All reasonable attempts should be made to determine
     * 					the appropriate value. Use of this value may result in rejection in some situations.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    BopType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BopType fromValue(String v) {
        for (BopType c: BopType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
