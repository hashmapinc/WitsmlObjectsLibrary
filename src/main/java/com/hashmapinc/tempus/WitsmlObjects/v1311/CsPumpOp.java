package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Operations Pump Component Schema
 * 
 * <p>Java class for cs_pumpOp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_pumpOp">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="pump" type="{http://www.witsml.org/schemas/131}refPositiveCount"/>
 *         <element name="typeOperation" type="{http://www.witsml.org/schemas/131}PumpOpType" minOccurs="0"/>
 *         <element name="idLiner" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenStroke" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="rateStroke" type="{http://www.witsml.org/schemas/131}anglePerTimeMeasure"/>
 *         <element name="pressure" type="{http://www.witsml.org/schemas/131}pressureMeasure"/>
 *         <element name="pcEfficiency" type="{http://www.witsml.org/schemas/131}relativePowerMeasure" minOccurs="0"/>
 *         <element name="pumpOutput" type="{http://www.witsml.org/schemas/131}volumeFlowRateMeasure" minOccurs="0"/>
 *         <element name="mdBit" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_pumpOp", propOrder = {
    "dTim",
    "pump",
    "typeOperation",
    "idLiner",
    "lenStroke",
    "rateStroke",
    "pressure",
    "pcEfficiency",
    "pumpOutput",
    "mdBit"
})
public class CsPumpOp {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    @XmlElement(required = true)
    protected RefPositiveCount pump;
    @XmlSchemaType(name = "string")
    protected PumpOpType typeOperation;
    protected LengthMeasure idLiner;
    protected LengthMeasure lenStroke;
    @XmlElement(required = true)
    protected AnglePerTimeMeasure rateStroke;
    @XmlElement(required = true)
    protected PressureMeasure pressure;
    protected RelativePowerMeasure pcEfficiency;
    protected VolumeFlowRateMeasure pumpOutput;
    protected MeasuredDepthCoord mdBit;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the dTim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTim() {
        return dTim;
    }

    /**
     * Sets the value of the dTim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTim(XMLGregorianCalendar value) {
        this.dTim = value;
    }

    /**
     * Gets the value of the pump property.
     * 
     * @return
     *     possible object is
     *     {@link RefPositiveCount }
     *     
     */
    public RefPositiveCount getPump() {
        return pump;
    }

    /**
     * Sets the value of the pump property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefPositiveCount }
     *     
     */
    public void setPump(RefPositiveCount value) {
        this.pump = value;
    }

    /**
     * Gets the value of the typeOperation property.
     * 
     * @return
     *     possible object is
     *     {@link PumpOpType }
     *     
     */
    public PumpOpType getTypeOperation() {
        return typeOperation;
    }

    /**
     * Sets the value of the typeOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PumpOpType }
     *     
     */
    public void setTypeOperation(PumpOpType value) {
        this.typeOperation = value;
    }

    /**
     * Gets the value of the idLiner property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdLiner() {
        return idLiner;
    }

    /**
     * Sets the value of the idLiner property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdLiner(LengthMeasure value) {
        this.idLiner = value;
    }

    /**
     * Gets the value of the lenStroke property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenStroke() {
        return lenStroke;
    }

    /**
     * Sets the value of the lenStroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenStroke(LengthMeasure value) {
        this.lenStroke = value;
    }

    /**
     * Gets the value of the rateStroke property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public AnglePerTimeMeasure getRateStroke() {
        return rateStroke;
    }

    /**
     * Sets the value of the rateStroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public void setRateStroke(AnglePerTimeMeasure value) {
        this.rateStroke = value;
    }

    /**
     * Gets the value of the pressure property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPressure(PressureMeasure value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the pcEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link RelativePowerMeasure }
     *     
     */
    public RelativePowerMeasure getPcEfficiency() {
        return pcEfficiency;
    }

    /**
     * Sets the value of the pcEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativePowerMeasure }
     *     
     */
    public void setPcEfficiency(RelativePowerMeasure value) {
        this.pcEfficiency = value;
    }

    /**
     * Gets the value of the pumpOutput property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public VolumeFlowRateMeasure getPumpOutput() {
        return pumpOutput;
    }

    /**
     * Sets the value of the pumpOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeFlowRateMeasure }
     *     
     */
    public void setPumpOutput(VolumeFlowRateMeasure value) {
        this.pumpOutput = value;
    }

    /**
     * Gets the value of the mdBit property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBit() {
        return mdBit;
    }

    /**
     * Sets the value of the mdBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBit(MeasuredDepthCoord value) {
        this.mdBit = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
