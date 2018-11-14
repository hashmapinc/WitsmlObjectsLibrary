


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeIndexParameterKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="TimeIndexParameterKey">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractParameterKey">
 *       <sequence>
 *         <element name="TimeIndex" type="{http://www.energistics.org/energyml/data/commonv2}TimeIndex"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeIndexParameterKey", propOrder = {
    "timeIndex"
})
public class TimeIndexParameterKey
    extends AbstractParameterKey
{

    @XmlElement(name = "TimeIndex", required = true)
    protected TimeIndex timeIndex;

    /**
     * Gets the value of the timeIndex property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIndex }
     *     
     */
    public TimeIndex getTimeIndex() {
        return timeIndex;
    }

    /**
     * Sets the value of the timeIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIndex }
     *     
     */
    public void setTimeIndex(TimeIndex value) {
        this.timeIndex = value;
    }

}
