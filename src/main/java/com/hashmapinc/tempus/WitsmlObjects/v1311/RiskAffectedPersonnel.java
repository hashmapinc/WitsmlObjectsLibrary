package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RiskAffectedPersonnel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="RiskAffectedPersonnel">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractTypeEnum">
 *     <enumeration value="cementer"/>
 *     <enumeration value="company man"/>
 *     <enumeration value="contractor"/>
 *     <enumeration value="directional driller"/>
 *     <enumeration value="driller"/>
 *     <enumeration value="drilling engineer"/>
 *     <enumeration value="drilling superintendent"/>
 *     <enumeration value="drilling team"/>
 *     <enumeration value="facility engineer"/>
 *     <enumeration value="field service manager"/>
 *     <enumeration value="foreman"/>
 *     <enumeration value="general service supervisor"/>
 *     <enumeration value="geologist"/>
 *     <enumeration value="member"/>
 *     <enumeration value="mud engineer"/>
 *     <enumeration value="mud logger"/>
 *     <enumeration value="MWD or LWD engineer"/>
 *     <enumeration value="perform engineer"/>
 *     <enumeration value="petrophysicist"/>
 *     <enumeration value="production engineer"/>
 *     <enumeration value="remotely operated vehicle engineer"/>
 *     <enumeration value="safety manger"/>
 *     <enumeration value="sales engineer"/>
 *     <enumeration value="service supervisor"/>
 *     <enumeration value="technical support"/>
 *     <enumeration value="tool pusher"/>
 *     <enumeration value="wireline engineer"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "RiskAffectedPersonnel")
@XmlEnum
public enum RiskAffectedPersonnel {

    @XmlEnumValue("cementer")
    CEMENTER("cementer"),
    @XmlEnumValue("company man")
    COMPANY_MAN("company man"),
    @XmlEnumValue("contractor")
    CONTRACTOR("contractor"),
    @XmlEnumValue("directional driller")
    DIRECTIONAL_DRILLER("directional driller"),
    @XmlEnumValue("driller")
    DRILLER("driller"),
    @XmlEnumValue("drilling engineer")
    DRILLING_ENGINEER("drilling engineer"),
    @XmlEnumValue("drilling superintendent")
    DRILLING_SUPERINTENDENT("drilling superintendent"),
    @XmlEnumValue("drilling team")
    DRILLING_TEAM("drilling team"),
    @XmlEnumValue("facility engineer")
    FACILITY_ENGINEER("facility engineer"),
    @XmlEnumValue("field service manager")
    FIELD_SERVICE_MANAGER("field service manager"),
    @XmlEnumValue("foreman")
    FOREMAN("foreman"),
    @XmlEnumValue("general service supervisor")
    GENERAL_SERVICE_SUPERVISOR("general service supervisor"),
    @XmlEnumValue("geologist")
    GEOLOGIST("geologist"),
    @XmlEnumValue("member")
    MEMBER("member"),
    @XmlEnumValue("mud engineer")
    MUD_ENGINEER("mud engineer"),
    @XmlEnumValue("mud logger")
    MUD_LOGGER("mud logger"),

    /**
     * measurement while drilling or logging while drilling
     * 
     */
    @XmlEnumValue("MWD or LWD engineer")
    MWD_OR_LWD_ENGINEER("MWD or LWD engineer"),
    @XmlEnumValue("perform engineer")
    PERFORM_ENGINEER("perform engineer"),
    @XmlEnumValue("petrophysicist")
    PETROPHYSICIST("petrophysicist"),
    @XmlEnumValue("production engineer")
    PRODUCTION_ENGINEER("production engineer"),
    @XmlEnumValue("remotely operated vehicle engineer")
    REMOTELY_OPERATED_VEHICLE_ENGINEER("remotely operated vehicle engineer"),
    @XmlEnumValue("safety manger")
    SAFETY_MANGER("safety manger"),
    @XmlEnumValue("sales engineer")
    SALES_ENGINEER("sales engineer"),
    @XmlEnumValue("service supervisor")
    SERVICE_SUPERVISOR("service supervisor"),
    @XmlEnumValue("technical support")
    TECHNICAL_SUPPORT("technical support"),
    @XmlEnumValue("tool pusher")
    TOOL_PUSHER("tool pusher"),
    @XmlEnumValue("wireline engineer")
    WIRELINE_ENGINEER("wireline engineer");
    private final String value;

    RiskAffectedPersonnel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RiskAffectedPersonnel fromValue(String v) {
        for (RiskAffectedPersonnel c: RiskAffectedPersonnel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
