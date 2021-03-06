//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  General information about a wellbore for a drill operations report. 
 * 
 * <p>Java class for cs_drillReportWellboreInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_drillReportWellboreInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTimSpud" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="dTimPreSpud" type="{http://www.witsml.org/schemas/1series}timestamp" minOccurs="0"/>
 *         <element name="dateDrillComplete" type="{http://www.witsml.org/schemas/1series}date" minOccurs="0"/>
 *         <element name="operator" type="{http://www.witsml.org/schemas/1series}nameString" minOccurs="0"/>
 *         <element name="drillContractor" type="{http://www.witsml.org/schemas/1series}nameString" minOccurs="0"/>
 *         <element name="rigAlias" type="{http://www.witsml.org/schemas/1series}cs_alias" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_drillReportWellboreInfo", propOrder = {
    "dTimSpud",
    "dTimPreSpud",
    "dateDrillComplete",
    "operator",
    "drillContractor",
    "rigAlias"
})
public class CsDrillReportWellboreInfo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimSpud;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimPreSpud;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDrillComplete;
    protected String operator;
    protected String drillContractor;
    protected List<CsAlias> rigAlias;

    /**
     * Gets the value of the dTimSpud property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimSpud() {
        return dTimSpud;
    }

    /**
     * Sets the value of the dTimSpud property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimSpud(XMLGregorianCalendar value) {
        this.dTimSpud = value;
    }

    /**
     * Gets the value of the dTimPreSpud property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimPreSpud() {
        return dTimPreSpud;
    }

    /**
     * Sets the value of the dTimPreSpud property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimPreSpud(XMLGregorianCalendar value) {
        this.dTimPreSpud = value;
    }

    /**
     * Gets the value of the dateDrillComplete property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDrillComplete() {
        return dateDrillComplete;
    }

    /**
     * Sets the value of the dateDrillComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDrillComplete(XMLGregorianCalendar value) {
        this.dateDrillComplete = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the drillContractor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrillContractor() {
        return drillContractor;
    }

    /**
     * Sets the value of the drillContractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrillContractor(String value) {
        this.drillContractor = value;
    }

    /**
     * Gets the value of the rigAlias property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rigAlias property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getRigAlias().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsAlias }
     * 
     * 
     */
    public List<CsAlias> getRigAlias() {
        if (rigAlias == null) {
            rigAlias = new ArrayList<CsAlias>();
        }
        return this.rigAlias;
    }

}
