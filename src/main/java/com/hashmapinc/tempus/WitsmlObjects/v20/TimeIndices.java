


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Indices
 * into a time series. Used to specify time. (Not to be confused with time step.)
 * 
 * <p>Java class for TimeIndices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="TimeIndices">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TimeIndexCount" type="{http://www.energistics.org/energyml/data/commonv2}PositiveLong"/>
 *         <element name="TimeIndexStart" type="{http://www.energistics.org/energyml/data/commonv2}NonNegativeLong" minOccurs="0"/>
 *         <element name="SimulatorTimeStep" type="{http://www.energistics.org/energyml/data/commonv2}AbstractIntegerArray" minOccurs="0"/>
 *         <element name="UseInterval" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "TimeIndices", propOrder = {
    "timeIndexCount",
    "timeIndexStart",
    "simulatorTimeStep",
    "useInterval",
    "timeSeries"
})
public class TimeIndices {

    @XmlElement(name = "TimeIndexCount")
    protected long timeIndexCount;
    @XmlElement(name = "TimeIndexStart")
    protected Long timeIndexStart;
    @XmlElement(name = "SimulatorTimeStep")
    protected AbstractIntegerArray simulatorTimeStep;
    @XmlElement(name = "UseInterval")
    protected boolean useInterval;
    @XmlElement(name = "TimeSeries", required = true)
    protected DataObjectReference timeSeries;

    /**
     * Gets the value of the timeIndexCount property.
     * 
     */
    public long getTimeIndexCount() {
        return timeIndexCount;
    }

    /**
     * Sets the value of the timeIndexCount property.
     * 
     */
    public void setTimeIndexCount(long value) {
        this.timeIndexCount = value;
    }

    /**
     * Gets the value of the timeIndexStart property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeIndexStart() {
        return timeIndexStart;
    }

    /**
     * Sets the value of the timeIndexStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeIndexStart(Long value) {
        this.timeIndexStart = value;
    }

    /**
     * Gets the value of the simulatorTimeStep property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractIntegerArray }
     *     
     */
    public AbstractIntegerArray getSimulatorTimeStep() {
        return simulatorTimeStep;
    }

    /**
     * Sets the value of the simulatorTimeStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractIntegerArray }
     *     
     */
    public void setSimulatorTimeStep(AbstractIntegerArray value) {
        this.simulatorTimeStep = value;
    }

    /**
     * Gets the value of the useInterval property.
     * 
     */
    public boolean isUseInterval() {
        return useInterval;
    }

    /**
     * Sets the value of the useInterval property.
     * 
     */
    public void setUseInterval(boolean value) {
        this.useInterval = value;
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
