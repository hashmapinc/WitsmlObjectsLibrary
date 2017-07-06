package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The instrument box used for distributed temperature surveys
 * 
 * <p>Java class for cs_boxInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_boxInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="installationDate" type="{http://www.witsml.org/schemas/131}anyDate" minOccurs="0"/>
 *         <element name="installationCompany" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="deInstallationDate" type="{http://www.witsml.org/schemas/131}anyDate" minOccurs="0"/>
 *         <element name="instrumentBox" type="{http://www.witsml.org/schemas/131}cs_instrumentBox" minOccurs="0"/>
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
@XmlType(name = "cs_boxInformation", propOrder = {
    "installationDate",
    "installationCompany",
    "deInstallationDate",
    "instrumentBox"
})
public class CsBoxInformation {

    protected String installationDate;
    protected String installationCompany;
    protected String deInstallationDate;
    protected CsInstrumentBox instrumentBox;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the installationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationDate() {
        return installationDate;
    }

    /**
     * Sets the value of the installationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationDate(String value) {
        this.installationDate = value;
    }

    /**
     * Gets the value of the installationCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationCompany() {
        return installationCompany;
    }

    /**
     * Sets the value of the installationCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationCompany(String value) {
        this.installationCompany = value;
    }

    /**
     * Gets the value of the deInstallationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeInstallationDate() {
        return deInstallationDate;
    }

    /**
     * Sets the value of the deInstallationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeInstallationDate(String value) {
        this.deInstallationDate = value;
    }

    /**
     * Gets the value of the instrumentBox property.
     * 
     * @return
     *     possible object is
     *     {@link CsInstrumentBox }
     *     
     */
    public CsInstrumentBox getInstrumentBox() {
        return instrumentBox;
    }

    /**
     * Sets the value of the instrumentBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsInstrumentBox }
     *     
     */
    public void setInstrumentBox(CsInstrumentBox value) {
        this.instrumentBox = value;
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
