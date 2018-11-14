


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Indicates that a time series has the associated time series as a parent, i.e., that the series continues from the parent time series.
 * 
 * <p>Java class for TimeSeriesParentage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="TimeSeriesParentage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HasOverlap" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ParentTimeIndex" type="{http://www.energistics.org/energyml/data/commonv2}TimeIndex"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeriesParentage", propOrder = {
    "hasOverlap",
    "parentTimeIndex"
})
public class TimeSeriesParentage {

    @XmlElement(name = "HasOverlap")
    protected boolean hasOverlap;
    @XmlElement(name = "ParentTimeIndex", required = true)
    protected TimeIndex parentTimeIndex;

    /**
     * Gets the value of the hasOverlap property.
     * 
     */
    public boolean isHasOverlap() {
        return hasOverlap;
    }

    /**
     * Sets the value of the hasOverlap property.
     * 
     */
    public void setHasOverlap(boolean value) {
        this.hasOverlap = value;
    }

    /**
     * Gets the value of the parentTimeIndex property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIndex }
     *     
     */
    public TimeIndex getParentTimeIndex() {
        return parentTimeIndex;
    }

    /**
     * Sets the value of the parentTimeIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIndex }
     *     
     */
    public void setParentTimeIndex(TimeIndex value) {
        this.parentTimeIndex = value;
    }

}
