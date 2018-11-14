


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="AuthorizationStatus">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="draft"/>
 *     <enumeration value="authorized"/>
 *     <enumeration value="superseded"/>
 *     <enumeration value="withdrawn"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthorizationStatus", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum AuthorizationStatus {


    /**
     * Not yet approved.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * Approved for use.
     * 
     */
    @XmlEnumValue("authorized")
    AUTHORIZED("authorized"),

    /**
     * Obsolete; a newer version is available.
     * 
     */
    @XmlEnumValue("superseded")
    SUPERSEDED("superseded"),

    /**
     * No longer approved in this or any other version.
     * 
     */
    @XmlEnumValue("withdrawn")
    WITHDRAWN("withdrawn");
    private final String value;

    AuthorizationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorizationStatus fromValue(String v) {
        for (AuthorizationStatus c: AuthorizationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
