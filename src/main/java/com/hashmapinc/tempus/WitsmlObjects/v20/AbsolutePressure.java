


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbsolutePressure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbsolutePressure">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractPressureValue">
 *       <sequence>
 *         <element name="AbsolutePressure" type="{http://www.energistics.org/energyml/data/commonv2}PressureMeasureExt"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsolutePressure", propOrder = {
    "absolutePressure"
})
public class AbsolutePressure
    extends AbstractPressureValue
{

    @XmlElement(name = "AbsolutePressure", required = true)
    protected PressureMeasureExt absolutePressure;

    /**
     * Gets the value of the absolutePressure property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasureExt }
     *     
     */
    public PressureMeasureExt getAbsolutePressure() {
        return absolutePressure;
    }

    /**
     * Sets the value of the absolutePressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasureExt }
     *     
     */
    public void setAbsolutePressure(PressureMeasureExt value) {
        this.absolutePressure = value;
    }

}
