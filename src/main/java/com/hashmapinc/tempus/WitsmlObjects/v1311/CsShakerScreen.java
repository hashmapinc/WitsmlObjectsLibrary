package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Operations Shaker Screen Component Schema
 * 
 * <p>Java class for cs_shakerScreen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_shakerScreen">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTimStart" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dTimEnd" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="numDeck" type="{http://www.witsml.org/schemas/131}positiveCount" minOccurs="0"/>
 *         <element name="meshX" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="meshY" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="manufacturer" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="model" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="cutPoint" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_shakerScreen", propOrder = {
    "dTimStart",
    "dTimEnd",
    "numDeck",
    "meshX",
    "meshY",
    "manufacturer",
    "model",
    "cutPoint"
})
public class CsShakerScreen {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimEnd;
    protected Short numDeck;
    protected LengthMeasure meshX;
    protected LengthMeasure meshY;
    protected String manufacturer;
    protected String model;
    protected LengthMeasure cutPoint;

    /**
     * Gets the value of the dTimStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimStart() {
        return dTimStart;
    }

    /**
     * Sets the value of the dTimStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimStart(XMLGregorianCalendar value) {
        this.dTimStart = value;
    }

    /**
     * Gets the value of the dTimEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimEnd() {
        return dTimEnd;
    }

    /**
     * Sets the value of the dTimEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimEnd(XMLGregorianCalendar value) {
        this.dTimEnd = value;
    }

    /**
     * Gets the value of the numDeck property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumDeck() {
        return numDeck;
    }

    /**
     * Sets the value of the numDeck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumDeck(Short value) {
        this.numDeck = value;
    }

    /**
     * Gets the value of the meshX property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getMeshX() {
        return meshX;
    }

    /**
     * Sets the value of the meshX property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setMeshX(LengthMeasure value) {
        this.meshX = value;
    }

    /**
     * Gets the value of the meshY property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getMeshY() {
        return meshY;
    }

    /**
     * Sets the value of the meshY property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setMeshY(LengthMeasure value) {
        this.meshY = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the cutPoint property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getCutPoint() {
        return cutPoint;
    }

    /**
     * Sets the value of the cutPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setCutPoint(LengthMeasure value) {
        this.cutPoint = value;
    }

}
