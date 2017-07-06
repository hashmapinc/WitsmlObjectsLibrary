package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for equivalentPerMassUom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <simpleType name="equivalentPerMassUom">
 *   <restriction base="{http://www.witsml.org/schemas/131}abstractUomEnum">
 *     <enumeration value="eq/kg"/>
 *     <enumeration value="meq/g"/>
 *     <enumeration value="meq/100g"/>
 *   </restriction>
 * </simpleType>
 * } </pre>
 * 
 */
@XmlType(name = "equivalentPerMassUom")
@XmlEnum
public enum EquivalentPerMassUom {

    @XmlEnumValue("eq/kg")
    EQ_KG("eq/kg"),
    @XmlEnumValue("meq/g")
    MEQ_G("meq/g"),
    @XmlEnumValue("meq/100g")
    MEQ_100_G("meq/100g");
    private final String value;

    EquivalentPerMassUom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquivalentPerMassUom fromValue(String v) {
        for (EquivalentPerMassUom c: EquivalentPerMassUom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
