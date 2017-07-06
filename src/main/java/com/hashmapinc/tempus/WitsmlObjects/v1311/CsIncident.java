package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Operations HSE Component Schema
 * 
 * <p>Java class for cs_incident complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_incident">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/131}timestamp"/>
 *         <element name="reporter" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="numMinorInjury" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="numMajorInjury" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="numFatality" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="isNearMiss" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="descLocation" type="{http://www.witsml.org/schemas/131}shortDescriptionString" minOccurs="0"/>
 *         <element name="descAccident" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="remedialActionDesc" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="causeDesc" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="eTimLostGross" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="costLostGross" type="{http://www.witsml.org/schemas/131}cost" minOccurs="0"/>
 *         <element name="responsibleCompany" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
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
@XmlType(name = "cs_incident", propOrder = {
    "dTim",
    "reporter",
    "numMinorInjury",
    "numMajorInjury",
    "numFatality",
    "isNearMiss",
    "descLocation",
    "descAccident",
    "remedialActionDesc",
    "causeDesc",
    "eTimLostGross",
    "costLostGross",
    "responsibleCompany"
})
public class CsIncident {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected String reporter;
    protected Short numMinorInjury;
    protected Short numMajorInjury;
    protected Short numFatality;
    protected Boolean isNearMiss;
    protected String descLocation;
    protected String descAccident;
    protected String remedialActionDesc;
    protected String causeDesc;
    protected TimeMeasure eTimLostGross;
    protected Cost costLostGross;
    protected String responsibleCompany;
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
     * Gets the value of the reporter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporter() {
        return reporter;
    }

    /**
     * Sets the value of the reporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporter(String value) {
        this.reporter = value;
    }

    /**
     * Gets the value of the numMinorInjury property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumMinorInjury() {
        return numMinorInjury;
    }

    /**
     * Sets the value of the numMinorInjury property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumMinorInjury(Short value) {
        this.numMinorInjury = value;
    }

    /**
     * Gets the value of the numMajorInjury property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumMajorInjury() {
        return numMajorInjury;
    }

    /**
     * Sets the value of the numMajorInjury property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumMajorInjury(Short value) {
        this.numMajorInjury = value;
    }

    /**
     * Gets the value of the numFatality property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumFatality() {
        return numFatality;
    }

    /**
     * Sets the value of the numFatality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumFatality(Short value) {
        this.numFatality = value;
    }

    /**
     * Gets the value of the isNearMiss property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNearMiss() {
        return isNearMiss;
    }

    /**
     * Sets the value of the isNearMiss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNearMiss(Boolean value) {
        this.isNearMiss = value;
    }

    /**
     * Gets the value of the descLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescLocation() {
        return descLocation;
    }

    /**
     * Sets the value of the descLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescLocation(String value) {
        this.descLocation = value;
    }

    /**
     * Gets the value of the descAccident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescAccident() {
        return descAccident;
    }

    /**
     * Sets the value of the descAccident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescAccident(String value) {
        this.descAccident = value;
    }

    /**
     * Gets the value of the remedialActionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemedialActionDesc() {
        return remedialActionDesc;
    }

    /**
     * Sets the value of the remedialActionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemedialActionDesc(String value) {
        this.remedialActionDesc = value;
    }

    /**
     * Gets the value of the causeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseDesc() {
        return causeDesc;
    }

    /**
     * Sets the value of the causeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseDesc(String value) {
        this.causeDesc = value;
    }

    /**
     * Gets the value of the eTimLostGross property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimLostGross() {
        return eTimLostGross;
    }

    /**
     * Sets the value of the eTimLostGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimLostGross(TimeMeasure value) {
        this.eTimLostGross = value;
    }

    /**
     * Gets the value of the costLostGross property.
     * 
     * @return
     *     possible object is
     *     {@link Cost }
     *     
     */
    public Cost getCostLostGross() {
        return costLostGross;
    }

    /**
     * Sets the value of the costLostGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cost }
     *     
     */
    public void setCostLostGross(Cost value) {
        this.costLostGross = value;
    }

    /**
     * Gets the value of the responsibleCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleCompany() {
        return responsibleCompany;
    }

    /**
     * Sets the value of the responsibleCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleCompany(String value) {
        this.responsibleCompany = value;
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
