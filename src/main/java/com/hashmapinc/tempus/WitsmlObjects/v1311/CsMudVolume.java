package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Operations Mud Volume Component Schema
 * 
 * <p>Java class for cs_mudVolume complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_mudVolume">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="volTotMudStart" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volMudDumped" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volMudReceived" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volMudReturned" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="mudLosses" type="{http://www.witsml.org/schemas/131}cs_mudLosses" minOccurs="0"/>
 *         <element name="volMudBuilt" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volMudString" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volMudCasing" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volMudHole" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volMudRiser" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *         <element name="volTotMudEnd" type="{http://www.witsml.org/schemas/131}volumeMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_mudVolume", propOrder = {
    "volTotMudStart",
    "volMudDumped",
    "volMudReceived",
    "volMudReturned",
    "mudLosses",
    "volMudBuilt",
    "volMudString",
    "volMudCasing",
    "volMudHole",
    "volMudRiser",
    "volTotMudEnd"
})
public class CsMudVolume {

    protected VolumeMeasure volTotMudStart;
    protected VolumeMeasure volMudDumped;
    protected VolumeMeasure volMudReceived;
    protected VolumeMeasure volMudReturned;
    protected CsMudLosses mudLosses;
    protected VolumeMeasure volMudBuilt;
    protected VolumeMeasure volMudString;
    protected VolumeMeasure volMudCasing;
    protected VolumeMeasure volMudHole;
    protected VolumeMeasure volMudRiser;
    protected VolumeMeasure volTotMudEnd;

    /**
     * Gets the value of the volTotMudStart property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolTotMudStart() {
        return volTotMudStart;
    }

    /**
     * Sets the value of the volTotMudStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolTotMudStart(VolumeMeasure value) {
        this.volTotMudStart = value;
    }

    /**
     * Gets the value of the volMudDumped property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolMudDumped() {
        return volMudDumped;
    }

    /**
     * Sets the value of the volMudDumped property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolMudDumped(VolumeMeasure value) {
        this.volMudDumped = value;
    }

    /**
     * Gets the value of the volMudReceived property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolMudReceived() {
        return volMudReceived;
    }

    /**
     * Sets the value of the volMudReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolMudReceived(VolumeMeasure value) {
        this.volMudReceived = value;
    }

    /**
     * Gets the value of the volMudReturned property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolMudReturned() {
        return volMudReturned;
    }

    /**
     * Sets the value of the volMudReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolMudReturned(VolumeMeasure value) {
        this.volMudReturned = value;
    }

    /**
     * Gets the value of the mudLosses property.
     * 
     * @return
     *     possible object is
     *     {@link CsMudLosses }
     *     
     */
    public CsMudLosses getMudLosses() {
        return mudLosses;
    }

    /**
     * Sets the value of the mudLosses property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsMudLosses }
     *     
     */
    public void setMudLosses(CsMudLosses value) {
        this.mudLosses = value;
    }

    /**
     * Gets the value of the volMudBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolMudBuilt() {
        return volMudBuilt;
    }

    /**
     * Sets the value of the volMudBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolMudBuilt(VolumeMeasure value) {
        this.volMudBuilt = value;
    }

    /**
     * Gets the value of the volMudString property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolMudString() {
        return volMudString;
    }

    /**
     * Sets the value of the volMudString property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolMudString(VolumeMeasure value) {
        this.volMudString = value;
    }

    /**
     * Gets the value of the volMudCasing property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolMudCasing() {
        return volMudCasing;
    }

    /**
     * Sets the value of the volMudCasing property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolMudCasing(VolumeMeasure value) {
        this.volMudCasing = value;
    }

    /**
     * Gets the value of the volMudHole property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolMudHole() {
        return volMudHole;
    }

    /**
     * Sets the value of the volMudHole property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolMudHole(VolumeMeasure value) {
        this.volMudHole = value;
    }

    /**
     * Gets the value of the volMudRiser property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolMudRiser() {
        return volMudRiser;
    }

    /**
     * Sets the value of the volMudRiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolMudRiser(VolumeMeasure value) {
        this.volMudRiser = value;
    }

    /**
     * Gets the value of the volTotMudEnd property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolTotMudEnd() {
        return volTotMudEnd;
    }

    /**
     * Sets the value of the volTotMudEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolTotMudEnd(VolumeMeasure value) {
        this.volTotMudEnd = value;
    }

}
