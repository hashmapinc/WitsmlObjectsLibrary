


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MolecularWeightUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="MolecularWeightUom">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}UomEnum">
 *     <enumeration value="g/mol"/>
 *     <enumeration value="kg/mol"/>
 *     <enumeration value="lbm/lbmol"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MolecularWeightUom")
@XmlEnum
public enum MolecularWeightUom {


    /**
     * gram per mole
     * 
     */
    @XmlEnumValue("g/mol")
    G_MOL("g/mol"),

    /**
     * kilogram per mole
     * 
     */
    @XmlEnumValue("kg/mol")
    KG_MOL("kg/mol"),

    /**
     * pound-mass per pound-mole
     * 
     */
    @XmlEnumValue("lbm/lbmol")
    LBM_LBMOL("lbm/lbmol");
    private final String value;

    MolecularWeightUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MolecularWeightUom fromValue(String v) {
        for (MolecularWeightUom c: MolecularWeightUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
