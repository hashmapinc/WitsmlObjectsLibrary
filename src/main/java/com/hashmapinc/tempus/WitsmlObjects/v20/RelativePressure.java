


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelativePressure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="RelativePressure">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractPressureValue">
 *       <sequence>
 *         <element name="RelativePressure" type="{http://www.energistics.org/energyml/data/commonv2}PressureMeasure"/>
 *         <element name="ReferencePressure" type="{http://www.energistics.org/energyml/data/commonv2}ReferencePressure"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativePressure", propOrder = {
    "relativePressure",
    "referencePressure"
})
public class RelativePressure
    extends AbstractPressureValue
{

    @XmlElement(name = "RelativePressure", required = true)
    protected PressureMeasure relativePressure;
    @XmlElement(name = "ReferencePressure", required = true)
    protected ReferencePressure referencePressure;

    /**
     * Gets the value of the relativePressure property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getRelativePressure() {
        return relativePressure;
    }

    /**
     * Sets the value of the relativePressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setRelativePressure(PressureMeasure value) {
        this.relativePressure = value;
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
