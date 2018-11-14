


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Parameter containing a time index value.
 * 
 * <p>Java class for TimeIndexParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="TimeIndexParameter">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractActivityParameter">
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
@XmlType(name = "TimeIndexParameter", propOrder = {
    "timeIndex"
})
public class TimeIndexParameter
    extends AbstractActivityParameter
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
