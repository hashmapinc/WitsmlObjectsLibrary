


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * StdTempPress
 * 
 * <p>Java class for ReferenceTemperaturePressure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ReferenceTemperaturePressure">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractTemperaturePressure">
 *       <choice minOccurs="0">
 *         <element name="ReferenceTempPres" type="{http://www.energistics.org/energyml/data/commonv2}ReferenceConditionExt"/>
 *       </choice>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceTemperaturePressure", propOrder = {
    "referenceTempPres"
})
public class ReferenceTemperaturePressure
    extends AbstractTemperaturePressure
{

    @XmlElement(name = "ReferenceTempPres")
    protected String referenceTempPres;

    /**
     * Gets the value of the referenceTempPres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceTempPres() {
        return referenceTempPres;
    }

    /**
     * Sets the value of the referenceTempPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTempPres(String value) {
        this.referenceTempPres = value;
    }

}
