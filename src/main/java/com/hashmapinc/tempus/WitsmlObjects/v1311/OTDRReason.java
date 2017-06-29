package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTDRReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="OTDRReason">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="pre-installation"/>
 *     <enumeration value="post-installation"/>
 *     <enumeration value="DTS run"/>
 *     <enumeration value="other"/>
 *     <enumeration value="unknown"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "OTDRReason")
@XmlEnum
public enum OTDRReason {


    /**
     * The OTDR was run prior to installing the fiber in the well.
     * 
     */
    @XmlEnumValue("pre-installation")
    PRE_INSTALLATION("pre-installation"),

    /**
     * The OTDR was run after installating the fiber in the 
     * 					well in order to quality check the installation process.
     * 
     */
    @XmlEnumValue("post-installation")
    POST_INSTALLATION("post-installation"),

    /**
     * The OTDR was run in conjunction with a DTS run. This is 
     * 					generally immediately preceding the timed run.
     * 
     */
    @XmlEnumValue("DTS run")
    DTS_RUN("DTS run"),

    /**
     * The OTDR was run for another reason.
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

    OTDRReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTDRReason fromValue(String v) {
        for (OTDRReason c: OTDRReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
