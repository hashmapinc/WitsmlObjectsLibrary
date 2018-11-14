


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorPropagationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="ErrorPropagationMode">
 *   <restriction base="{http://www.energistics.org/energyml/data/commonv2}TypeEnum">
 *     <enumeration value="B"/>
 *     <enumeration value="R"/>
 *     <enumeration value="S"/>
 *     <enumeration value="W"/>
 *     <enumeration value="G"/>
 *   </restriction>
 * </simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorPropagationMode", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlEnum
public enum ErrorPropagationMode {


    /**
     * Bias.
     * 
     */
    B,

    /**
     * Random.
     * 
     */
    R,

    /**
     * Systematic.
     * 
     */
    S,

    /**
     * Well.
     * 
     */
    W,

    /**
     * Global.
     * 
     */
    G;

    public String value() {
        return name();
    }

    public static ErrorPropagationMode fromValue(String v) {
        return valueOf(v);
    }

}
