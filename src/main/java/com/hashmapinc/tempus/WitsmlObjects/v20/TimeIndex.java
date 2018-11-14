


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Index into a time series. Used to specify time. (Not to be confused with time step.)
 * 
 * <p>Java class for TimeIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="TimeIndex">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Index" type="{http://www.energistics.org/energyml/data/commonv2}NonNegativeLong"/>
 *         <element name="TimeSeries" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeIndex", propOrder = {
    "index",
    "timeSeries"
})
public class TimeIndex {

    @XmlElement(name = "Index")
    protected long index;
    @XmlElement(name = "TimeSeries", required = true)
    protected DataObjectReference timeSeries;

    /**
     * Gets the value of the index property.
     * 
     */
    public long getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(long value) {
        this.index = value;
    }

    /**
     * Gets the value of the timeSeries property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getTimeSeries() {
        return timeSeries;
    }

    /**
     * Sets the value of the timeSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setTimeSeries(DataObjectReference value) {
        this.timeSeries = value;
    }

}
