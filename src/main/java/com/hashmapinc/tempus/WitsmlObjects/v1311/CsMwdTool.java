package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Tubular MWD Tool Component Schema
 * 
 * <p>Java class for cs_mwdTool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_mwdTool">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="flowrateMn" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="flowrateMx" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="tempMx" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="idEquv" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="sensor" type="{http://www.witsml.org/schemas/131}cs_sensor" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_mwdTool", propOrder = {
    "flowrateMn",
    "flowrateMx",
    "tempMx",
    "idEquv",
    "sensor",
    "customData"
})
public class CsMwdTool {

    protected VolumeFlowRateMeasure flowrateMn;
    protected VolumeFlowRateMeasure flowrateMx;
    protected ThermodynamicTemperatureMeasure tempMx;
    protected LengthMeasure idEquv;
    protected List<CsSensor> sensor;
    protected CsCustomData customData;

    /**
     * Gets the value of the flowrateMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowrateMn() {
        return flowrateMn;
    }

    /**
     * Sets the value of the flowrateMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowrateMn(VolumeFlowRateMeasure value) {
        this.flowrateMn = value;
    }

    /**
     * Gets the value of the flowrateMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getFlowrateMx() {
        return flowrateMx;
    }

    /**
     * Sets the value of the flowrateMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setFlowrateMx(VolumeFlowRateMeasure value) {
        this.flowrateMx = value;
    }

    /**
     * Gets the value of the tempMx property.
     * 
     * @return
     *     possible object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public ThermodynamicTemperatureMeasure getTempMx() {
        return tempMx;
    }

    /**
     * Sets the value of the tempMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThermodynamicTemperatureMeasure }
     *     
     */
    public void setTempMx(ThermodynamicTemperatureMeasure value) {
        this.tempMx = value;
    }

    /**
     * Gets the value of the idEquv property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdEquv() {
        return idEquv;
    }

    /**
     * Sets the value of the idEquv property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdEquv(LengthMeasure value) {
        this.idEquv = value;
    }

    /**
     * Gets the value of the sensor property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sensor property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getSensor().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsSensor }
     * 
     * 
     */
    public List<CsSensor> getSensor() {
        if (sensor == null) {
            sensor = new ArrayList<CsSensor>();
        }
        return this.sensor;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCustomData }
     *     
     */
    public CsCustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCustomData }
     *     
     */
    public void setCustomData(CsCustomData value) {
        this.customData = value;
    }

}
