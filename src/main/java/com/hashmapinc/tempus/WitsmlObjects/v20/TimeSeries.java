


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Stores an ordered list of times, for example, for time-dependent properties, geometries, or representations. It is used in conjunction with the time index to specify times for RESQML.
 * 
 * <p>Java class for TimeSeries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="TimeSeries">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="Time" type="{http://www.energistics.org/energyml/data/commonv2}GeologicTime" maxOccurs="unbounded"/>
 *         <element name="TimeSeriesParentage" type="{http://www.energistics.org/energyml/data/commonv2}TimeSeriesParentage" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeries", propOrder = {
    "time",
    "timeSeriesParentage"
})
public class TimeSeries
    extends AbstractObject
{

    @XmlElement(name = "Time", required = true)
    protected List<GeologicTime> time;
    @XmlElement(name = "TimeSeriesParentage")
    protected TimeSeriesParentage timeSeriesParentage;

    /**
     * Gets the value of the time property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the time property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeologicTime }
     * 
     * 
     */
    public List<GeologicTime> getTime() {
        if (time == null) {
            time = new ArrayList<GeologicTime>();
        }
        return this.time;
    }

    /**
     * Gets the value of the timeSeriesParentage property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeriesParentage }
     *     
     */
    public TimeSeriesParentage getTimeSeriesParentage() {
        return timeSeriesParentage;
    }

    /**
     * Sets the value of the timeSeriesParentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeriesParentage }
     *     
     */
    public void setTimeSeriesParentage(TimeSeriesParentage value) {
        this.timeSeriesParentage = value;
    }

}
