


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GaugePressure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="GaugePressure">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractPressureValue">
 *       <sequence>
 *         <element name="GaugePressure" type="{http://www.energistics.org/energyml/data/commonv2}PressureMeasureExt"/>
 *         <element name="ReferencePressure" type="{http://www.energistics.org/energyml/data/commonv2}ReferencePressure" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GaugePressure", propOrder = {
    "gaugePressure",
    "referencePressure"
})
public class GaugePressure
    extends AbstractPressureValue
{

    @XmlElement(name = "GaugePressure", required = true)
    protected PressureMeasureExt gaugePressure;
    @XmlElement(name = "ReferencePressure")
    protected ReferencePressure referencePressure;

    /**
     * Gets the value of the gaugePressure property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasureExt }
     *     
     */
    public PressureMeasureExt getGaugePressure() {
        return gaugePressure;
    }

    /**
     * Sets the value of the gaugePressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasureExt }
     *     
     */
    public void setGaugePressure(PressureMeasureExt value) {
        this.gaugePressure = value;
    }

    /**
     * Gets the value of the referencePressure property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePressure }
     *     
     */
    public ReferencePressure getReferencePressure() {
        return referencePressure;
    }

    /**
     * Sets the value of the referencePressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePressure }
     *     
     */
    public void setReferencePressure(ReferencePressure value) {
        this.referencePressure = value;
    }

}
