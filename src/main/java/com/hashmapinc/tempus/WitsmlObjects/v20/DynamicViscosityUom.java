


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicViscosityUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="DynamicViscosityUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="cP"/>
 *     <enumeration value="dP"/>
 *     <enumeration value="dyne.s/cm2"/>
 *     <enumeration value="EP"/>
 *     <enumeration value="fP"/>
 *     <enumeration value="GP"/>
 *     <enumeration value="kgf.s/m2"/>
 *     <enumeration value="kP"/>
 *     <enumeration value="lbf.s/ft2"/>
 *     <enumeration value="lbf.s/in2"/>
 *     <enumeration value="mP"/>
 *     <enumeration value="MP"/>
 *     <enumeration value="mPa.s"/>
 *     <enumeration value="N.s/m2"/>
 *     <enumeration value="nP"/>
 *     <enumeration value="P"/>
 *     <enumeration value="Pa.s"/>
 *     <enumeration value="pP"/>
 *     <enumeration value="psi.s"/>
 *     <enumeration value="TP"/>
 *     <enumeration value="uP"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DynamicViscosityUom")
@XmlEnum
public enum DynamicViscosityUom {


    /**
     * centipoise
     * 
     */
    @XmlEnumValue("cP")
    C_P("cP"),

    /**
     * decipoise
     * 
     */
    @XmlEnumValue("dP")
    D_P("dP"),

    /**
     * dyne second per square centimetre
     * 
     */
    @XmlEnumValue("dyne.s/cm2")
    DYNE_S_CM_2("dyne.s/cm2"),

    /**
     * exapoise
     * 
     */
    EP("EP"),

    /**
     * femtopoise
     * 
     */
    @XmlEnumValue("fP")
    F_P("fP"),

    /**
     * gigapoise
     * 
     */
    GP("GP"),

    /**
     * thousand gram-force second per square metre
     * 
     */
    @XmlEnumValue("kgf.s/m2")
    KGF_S_M_2("kgf.s/m2"),

    /**
     * kilopoise
     * 
     */
    @XmlEnumValue("kP")
    K_P("kP"),

    /**
     * pound-force second per square foot
     * 
     */
    @XmlEnumValue("lbf.s/ft2")
    LBF_S_FT_2("lbf.s/ft2"),

    /**
     * pound-force second per square inch
     * 
     */
    @XmlEnumValue("lbf.s/in2")
    LBF_S_IN_2("lbf.s/in2"),

    /**
     * millipoise
     * 
     */
    @XmlEnumValue("mP")
    M_P("mP"),

    /**
     * megapoise
     * 
     */
    MP("MP"),

    /**
     * millipascal second
     * 
     */
    @XmlEnumValue("mPa.s")
    M_PA_S("mPa.s"),

    /**
     * newton second per square metre
     * 
     */
    @XmlEnumValue("N.s/m2")
    N_S_M_2("N.s/m2"),

    /**
     * nanopoise
     * 
     */
    @XmlEnumValue("nP")
    N_P("nP"),

    /**
     * poise
     * 
     */
    P("P"),

    /**
     * pascal second
     * 
     */
    @XmlEnumValue("Pa.s")
    PA_S("Pa.s"),

    /**
     * picopoise
     * 
     */
    @XmlEnumValue("pP")
    P_P("pP"),

    /**
     * psi second
     * 
     */
    @XmlEnumValue("psi.s")
    PSI_S("psi.s"),

    /**
     * terapoise
     * 
     */
    TP("TP"),

    /**
     * micropoise
     * 
     */
    @XmlEnumValue("uP")
    U_P("uP");
    private final String value;

    DynamicViscosityUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DynamicViscosityUom fromValue(String v) {
        for (DynamicViscosityUom c: DynamicViscosityUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
