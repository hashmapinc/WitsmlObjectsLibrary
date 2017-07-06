package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This records the result arrays, along with context information, from an 
 * 			Optical Time Domain Reflectometry (OTDR) run. The arrays will define the relative scattered 
 * 			power from the Rayleigh scattering vs distance along the fiber. The actual data values are 
 * 			recorded in a wellLog object, which is referenced in a subelement.
 * 
 * <p>Java class for cs_otdr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_otdr">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="reasonForRun" type="{http://www.witsml.org/schemas/131}OTDRReason"/>
 *         <element name="dTimRun" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dataInWellLog" type="{http://www.witsml.org/schemas/131}refNameString"/>
 *         <element name="fiberEndConncected" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
 *         <element name="comment" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
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
@XmlType(name = "cs_otdr", propOrder = {
    "reasonForRun",
    "dTimRun",
    "dataInWellLog",
    "fiberEndConncected",
    "comment"
})
public class CsOtdr {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OTDRReason reasonForRun;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimRun;
    @XmlElement(required = true)
    protected RefNameString dataInWellLog;
    protected RefNameString fiberEndConncected;
    protected String comment;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the reasonForRun property.
     * 
     * @return
     *     possible object is
     *     {@link OTDRReason }
     *     
     */
    public OTDRReason getReasonForRun() {
        return reasonForRun;
    }

    /**
     * Sets the value of the reasonForRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link OTDRReason }
     *     
     */
    public void setReasonForRun(OTDRReason value) {
        this.reasonForRun = value;
    }

    /**
     * Gets the value of the dTimRun property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimRun() {
        return dTimRun;
    }

    /**
     * Sets the value of the dTimRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimRun(XMLGregorianCalendar value) {
        this.dTimRun = value;
    }

    /**
     * Gets the value of the dataInWellLog property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getDataInWellLog() {
        return dataInWellLog;
    }

    /**
     * Sets the value of the dataInWellLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setDataInWellLog(RefNameString value) {
        this.dataInWellLog = value;
    }

    /**
     * Gets the value of the fiberEndConncected property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getFiberEndConncected() {
        return fiberEndConncected;
    }

    /**
     * Sets the value of the fiberEndConncected property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setFiberEndConncected(RefNameString value) {
        this.fiberEndConncected = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
