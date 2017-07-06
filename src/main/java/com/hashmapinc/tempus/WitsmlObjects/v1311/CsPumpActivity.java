package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The activity of pumping the fiber downhole.
 * 
 * <p>Java class for cs_pumpActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_pumpActivity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="installedFiber" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
 *         <element name="pumpingDate" type="{http://www.witsml.org/schemas/131}anyDate" minOccurs="0"/>
 *         <element name="engineerName" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="serviceCompany" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="pumpFluidType" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="controlLineFluid" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="pumpDirection" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="fiberEndSeal" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="cableMeterType" type="{http://www.witsml.org/schemas/131}kindString" minOccurs="0"/>
 *         <element name="cableMeterSerialNumber" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="cableMeterCalibrationDate" type="{http://www.witsml.org/schemas/131}anyDate" minOccurs="0"/>
 *         <choice>
 *           <element name="wasDriftRunPerformed" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *           <element name="OTDRPerformed" type="{http://www.witsml.org/schemas/131}refNameString" maxOccurs="unbounded" minOccurs="0"/>
 *         </choice>
 *         <element name="excessFiberRecovered" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="pumpLog" type="{http://www.witsml.org/schemas/131}cs_pumpLogTable" minOccurs="0"/>
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
@XmlType(name = "cs_pumpActivity", propOrder = {
    "name",
    "installedFiber",
    "pumpingDate",
    "engineerName",
    "serviceCompany",
    "pumpFluidType",
    "controlLineFluid",
    "pumpDirection",
    "fiberEndSeal",
    "cableMeterType",
    "cableMeterSerialNumber",
    "cableMeterCalibrationDate",
    "wasDriftRunPerformed",
    "otdrPerformed",
    "excessFiberRecovered",
    "pumpLog"
})
public class CsPumpActivity {

    protected String name;
    protected RefNameString installedFiber;
    protected String pumpingDate;
    protected String engineerName;
    protected String serviceCompany;
    protected String pumpFluidType;
    protected String controlLineFluid;
    protected String pumpDirection;
    protected String fiberEndSeal;
    protected String cableMeterType;
    protected String cableMeterSerialNumber;
    protected String cableMeterCalibrationDate;
    protected Boolean wasDriftRunPerformed;
    @XmlElement(name = "OTDRPerformed")
    protected List<RefNameString> otdrPerformed;
    protected LengthMeasure excessFiberRecovered;
    protected CsPumpLogTable pumpLog;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the installedFiber property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getInstalledFiber() {
        return installedFiber;
    }

    /**
     * Sets the value of the installedFiber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setInstalledFiber(RefNameString value) {
        this.installedFiber = value;
    }

    /**
     * Gets the value of the pumpingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPumpingDate() {
        return pumpingDate;
    }

    /**
     * Sets the value of the pumpingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPumpingDate(String value) {
        this.pumpingDate = value;
    }

    /**
     * Gets the value of the engineerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineerName() {
        return engineerName;
    }

    /**
     * Sets the value of the engineerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineerName(String value) {
        this.engineerName = value;
    }

    /**
     * Gets the value of the serviceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCompany() {
        return serviceCompany;
    }

    /**
     * Sets the value of the serviceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCompany(String value) {
        this.serviceCompany = value;
    }

    /**
     * Gets the value of the pumpFluidType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPumpFluidType() {
        return pumpFluidType;
    }

    /**
     * Sets the value of the pumpFluidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPumpFluidType(String value) {
        this.pumpFluidType = value;
    }

    /**
     * Gets the value of the controlLineFluid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlLineFluid() {
        return controlLineFluid;
    }

    /**
     * Sets the value of the controlLineFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlLineFluid(String value) {
        this.controlLineFluid = value;
    }

    /**
     * Gets the value of the pumpDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPumpDirection() {
        return pumpDirection;
    }

    /**
     * Sets the value of the pumpDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPumpDirection(String value) {
        this.pumpDirection = value;
    }

    /**
     * Gets the value of the fiberEndSeal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiberEndSeal() {
        return fiberEndSeal;
    }

    /**
     * Sets the value of the fiberEndSeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiberEndSeal(String value) {
        this.fiberEndSeal = value;
    }

    /**
     * Gets the value of the cableMeterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCableMeterType() {
        return cableMeterType;
    }

    /**
     * Sets the value of the cableMeterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCableMeterType(String value) {
        this.cableMeterType = value;
    }

    /**
     * Gets the value of the cableMeterSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCableMeterSerialNumber() {
        return cableMeterSerialNumber;
    }

    /**
     * Sets the value of the cableMeterSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCableMeterSerialNumber(String value) {
        this.cableMeterSerialNumber = value;
    }

    /**
     * Gets the value of the cableMeterCalibrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCableMeterCalibrationDate() {
        return cableMeterCalibrationDate;
    }

    /**
     * Sets the value of the cableMeterCalibrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCableMeterCalibrationDate(String value) {
        this.cableMeterCalibrationDate = value;
    }

    /**
     * Gets the value of the wasDriftRunPerformed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWasDriftRunPerformed() {
        return wasDriftRunPerformed;
    }

    /**
     * Sets the value of the wasDriftRunPerformed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWasDriftRunPerformed(Boolean value) {
        this.wasDriftRunPerformed = value;
    }

    /**
     * Gets the value of the otdrPerformed property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otdrPerformed property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getOTDRPerformed().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link RefNameString }
     * 
     * 
     */
    public List<RefNameString> getOTDRPerformed() {
        if (otdrPerformed == null) {
            otdrPerformed = new ArrayList<RefNameString>();
        }
        return this.otdrPerformed;
    }

    /**
     * Gets the value of the excessFiberRecovered property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getExcessFiberRecovered() {
        return excessFiberRecovered;
    }

    /**
     * Sets the value of the excessFiberRecovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setExcessFiberRecovered(LengthMeasure value) {
        this.excessFiberRecovered = value;
    }

    /**
     * Gets the value of the pumpLog property.
     * 
     * @return
     *     possible object is
     *     {@link CsPumpLogTable }
     *     
     */
    public CsPumpLogTable getPumpLog() {
        return pumpLog;
    }

    /**
     * Sets the value of the pumpLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsPumpLogTable }
     *     
     */
    public void setPumpLog(CsPumpLogTable value) {
        this.pumpLog = value;
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
