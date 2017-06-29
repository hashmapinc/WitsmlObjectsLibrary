package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Operations Health, Safety and Environment Component Schema
 * 
 * <p>Java class for cs_hse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_hse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="daysIncFree" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="incident" type="{http://www.witsml.org/schemas/131}cs_incident" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="lastCsgPresTest" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="presLastCsg" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="lastBopPresTest" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="nextBopPresTest" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="presStdPipe" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presKellyHose" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presDiverter" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presAnnular" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presRams" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presChokeLine" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="presChokeMan" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="lastFireBoatDrill" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="lastAbandonDrill" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="lastRigInspection" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="lastSafetyMeeting" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="lastSafetyInspection" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="lastTripDrill" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="lastDiverterDrill" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="lastBopDrill" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="regAgencyInsp" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="nonComplianceIssued" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="numStopCards" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="fluidDischarged" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volCtgDischarged" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volOilCtgDischarge" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="wasteDischarged" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="comments" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_hse", propOrder = {
    "daysIncFree",
    "incident",
    "lastCsgPresTest",
    "presLastCsg",
    "lastBopPresTest",
    "nextBopPresTest",
    "presStdPipe",
    "presKellyHose",
    "presDiverter",
    "presAnnular",
    "presRams",
    "presChokeLine",
    "presChokeMan",
    "lastFireBoatDrill",
    "lastAbandonDrill",
    "lastRigInspection",
    "lastSafetyMeeting",
    "lastSafetyInspection",
    "lastTripDrill",
    "lastDiverterDrill",
    "lastBopDrill",
    "regAgencyInsp",
    "nonComplianceIssued",
    "numStopCards",
    "fluidDischarged",
    "volCtgDischarged",
    "volOilCtgDischarge",
    "wasteDischarged",
    "comments"
})
public class CsHse {

    protected TimeMeasure daysIncFree;
    protected List<CsIncident> incident;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCsgPresTest;
    protected PressureMeasure presLastCsg;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastBopPresTest;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextBopPresTest;
    protected PressureMeasure presStdPipe;
    protected PressureMeasure presKellyHose;
    protected PressureMeasure presDiverter;
    protected PressureMeasure presAnnular;
    protected PressureMeasure presRams;
    protected PressureMeasure presChokeLine;
    protected PressureMeasure presChokeMan;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastFireBoatDrill;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAbandonDrill;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRigInspection;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSafetyMeeting;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSafetyInspection;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTripDrill;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDiverterDrill;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastBopDrill;
    protected Boolean regAgencyInsp;
    protected Boolean nonComplianceIssued;
    protected Short numStopCards;
    protected VolumeMeasure fluidDischarged;
    protected VolumeMeasure volCtgDischarged;
    protected VolumeMeasure volOilCtgDischarge;
    protected VolumeMeasure wasteDischarged;
    protected String comments;

    /**
     * Gets the value of the daysIncFree property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getDaysIncFree() {
        return daysIncFree;
    }

    /**
     * Sets the value of the daysIncFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setDaysIncFree(TimeMeasure value) {
        this.daysIncFree = value;
    }

    /**
     * Gets the value of the incident property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incident property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getIncident().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsIncident }
     * 
     * 
     */
    public List<CsIncident> getIncident() {
        if (incident == null) {
            incident = new ArrayList<CsIncident>();
        }
        return this.incident;
    }

    /**
     * Gets the value of the lastCsgPresTest property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCsgPresTest() {
        return lastCsgPresTest;
    }

    /**
     * Sets the value of the lastCsgPresTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCsgPresTest(XMLGregorianCalendar value) {
        this.lastCsgPresTest = value;
    }

    /**
     * Gets the value of the presLastCsg property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresLastCsg() {
        return presLastCsg;
    }

    /**
     * Sets the value of the presLastCsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresLastCsg(PressureMeasure value) {
        this.presLastCsg = value;
    }

    /**
     * Gets the value of the lastBopPresTest property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBopPresTest() {
        return lastBopPresTest;
    }

    /**
     * Sets the value of the lastBopPresTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBopPresTest(XMLGregorianCalendar value) {
        this.lastBopPresTest = value;
    }

    /**
     * Gets the value of the nextBopPresTest property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextBopPresTest() {
        return nextBopPresTest;
    }

    /**
     * Sets the value of the nextBopPresTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextBopPresTest(XMLGregorianCalendar value) {
        this.nextBopPresTest = value;
    }

    /**
     * Gets the value of the presStdPipe property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresStdPipe() {
        return presStdPipe;
    }

    /**
     * Sets the value of the presStdPipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresStdPipe(PressureMeasure value) {
        this.presStdPipe = value;
    }

    /**
     * Gets the value of the presKellyHose property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresKellyHose() {
        return presKellyHose;
    }

    /**
     * Sets the value of the presKellyHose property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresKellyHose(PressureMeasure value) {
        this.presKellyHose = value;
    }

    /**
     * Gets the value of the presDiverter property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresDiverter() {
        return presDiverter;
    }

    /**
     * Sets the value of the presDiverter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresDiverter(PressureMeasure value) {
        this.presDiverter = value;
    }

    /**
     * Gets the value of the presAnnular property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresAnnular() {
        return presAnnular;
    }

    /**
     * Sets the value of the presAnnular property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresAnnular(PressureMeasure value) {
        this.presAnnular = value;
    }

    /**
     * Gets the value of the presRams property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresRams() {
        return presRams;
    }

    /**
     * Sets the value of the presRams property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresRams(PressureMeasure value) {
        this.presRams = value;
    }

    /**
     * Gets the value of the presChokeLine property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresChokeLine() {
        return presChokeLine;
    }

    /**
     * Sets the value of the presChokeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresChokeLine(PressureMeasure value) {
        this.presChokeLine = value;
    }

    /**
     * Gets the value of the presChokeMan property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresChokeMan() {
        return presChokeMan;
    }

    /**
     * Sets the value of the presChokeMan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresChokeMan(PressureMeasure value) {
        this.presChokeMan = value;
    }

    /**
     * Gets the value of the lastFireBoatDrill property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastFireBoatDrill() {
        return lastFireBoatDrill;
    }

    /**
     * Sets the value of the lastFireBoatDrill property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastFireBoatDrill(XMLGregorianCalendar value) {
        this.lastFireBoatDrill = value;
    }

    /**
     * Gets the value of the lastAbandonDrill property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAbandonDrill() {
        return lastAbandonDrill;
    }

    /**
     * Sets the value of the lastAbandonDrill property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAbandonDrill(XMLGregorianCalendar value) {
        this.lastAbandonDrill = value;
    }

    /**
     * Gets the value of the lastRigInspection property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRigInspection() {
        return lastRigInspection;
    }

    /**
     * Sets the value of the lastRigInspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRigInspection(XMLGregorianCalendar value) {
        this.lastRigInspection = value;
    }

    /**
     * Gets the value of the lastSafetyMeeting property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSafetyMeeting() {
        return lastSafetyMeeting;
    }

    /**
     * Sets the value of the lastSafetyMeeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSafetyMeeting(XMLGregorianCalendar value) {
        this.lastSafetyMeeting = value;
    }

    /**
     * Gets the value of the lastSafetyInspection property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSafetyInspection() {
        return lastSafetyInspection;
    }

    /**
     * Sets the value of the lastSafetyInspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSafetyInspection(XMLGregorianCalendar value) {
        this.lastSafetyInspection = value;
    }

    /**
     * Gets the value of the lastTripDrill property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTripDrill() {
        return lastTripDrill;
    }

    /**
     * Sets the value of the lastTripDrill property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTripDrill(XMLGregorianCalendar value) {
        this.lastTripDrill = value;
    }

    /**
     * Gets the value of the lastDiverterDrill property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDiverterDrill() {
        return lastDiverterDrill;
    }

    /**
     * Sets the value of the lastDiverterDrill property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDiverterDrill(XMLGregorianCalendar value) {
        this.lastDiverterDrill = value;
    }

    /**
     * Gets the value of the lastBopDrill property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBopDrill() {
        return lastBopDrill;
    }

    /**
     * Sets the value of the lastBopDrill property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBopDrill(XMLGregorianCalendar value) {
        this.lastBopDrill = value;
    }

    /**
     * Gets the value of the regAgencyInsp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegAgencyInsp() {
        return regAgencyInsp;
    }

    /**
     * Sets the value of the regAgencyInsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegAgencyInsp(Boolean value) {
        this.regAgencyInsp = value;
    }

    /**
     * Gets the value of the nonComplianceIssued property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonComplianceIssued() {
        return nonComplianceIssued;
    }

    /**
     * Sets the value of the nonComplianceIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonComplianceIssued(Boolean value) {
        this.nonComplianceIssued = value;
    }

    /**
     * Gets the value of the numStopCards property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumStopCards() {
        return numStopCards;
    }

    /**
     * Sets the value of the numStopCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumStopCards(Short value) {
        this.numStopCards = value;
    }

    /**
     * Gets the value of the fluidDischarged property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getFluidDischarged() {
        return fluidDischarged;
    }

    /**
     * Sets the value of the fluidDischarged property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setFluidDischarged(VolumeMeasure value) {
        this.fluidDischarged = value;
    }

    /**
     * Gets the value of the volCtgDischarged property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolCtgDischarged() {
        return volCtgDischarged;
    }

    /**
     * Sets the value of the volCtgDischarged property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolCtgDischarged(VolumeMeasure value) {
        this.volCtgDischarged = value;
    }

    /**
     * Gets the value of the volOilCtgDischarge property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolOilCtgDischarge() {
        return volOilCtgDischarge;
    }

    /**
     * Sets the value of the volOilCtgDischarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolOilCtgDischarge(VolumeMeasure value) {
        this.volOilCtgDischarge = value;
    }

    /**
     * Gets the value of the wasteDischarged property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getWasteDischarged() {
        return wasteDischarged;
    }

    /**
     * Sets the value of the wasteDischarged property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setWasteDischarged(VolumeMeasure value) {
        this.wasteDischarged = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
