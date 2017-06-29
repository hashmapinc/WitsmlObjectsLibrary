package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  WITSML - Realtime Channel Component Schema 
 * 
 * <p>Java class for cs_channel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_channel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.witsml.org/schemas/131}str32"/>
 *         <element name="mnemonic" type="{http://www.witsml.org/schemas/131}str32"/>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="md" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="value" type="{http://www.witsml.org/schemas/131}encodedArrayString"/>
 *         <element name="densData" type="{http://www.witsml.org/schemas/131}perLengthMeasure" minOccurs="0"/>
 *         <element name="qualData" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="fet" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_channel", propOrder = {
    "id",
    "mnemonic",
    "dTim",
    "md",
    "value",
    "densData",
    "qualData",
    "fet"
})
public class CsChannel {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String mnemonic;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected MeasuredDepthCoord md;
    @XmlElement(required = true)
    protected EncodedArrayString value;
    protected PerLengthMeasure densData;
    protected String qualData;
    protected TimeMeasure fet;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the mnemonic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnemonic() {
        return mnemonic;
    }

    /**
     * Sets the value of the mnemonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnemonic(String value) {
        this.mnemonic = value;
    }

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
     * Gets the value of the md property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMd() {
        return md;
    }

    /**
     * Sets the value of the md property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMd(MeasuredDepthCoord value) {
        this.md = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link EncodedArrayString }
     *     
     */
    public EncodedArrayString getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodedArrayString }
     *     
     */
    public void setValue(EncodedArrayString value) {
        this.value = value;
    }

    /**
     * Gets the value of the densData property.
     * 
     * @return
     *     possible object is
     *     {@link PerLengthMeasure }
     *     
     */
    public PerLengthMeasure getDensData() {
        return densData;
    }

    /**
     * Sets the value of the densData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerLengthMeasure }
     *     
     */
    public void setDensData(PerLengthMeasure value) {
        this.densData = value;
    }

    /**
     * Gets the value of the qualData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualData() {
        return qualData;
    }

    /**
     * Sets the value of the qualData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualData(String value) {
        this.qualData = value;
    }

    /**
     * Gets the value of the fet property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getFet() {
        return fet;
    }

    /**
     * Sets the value of the fet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setFet(TimeMeasure value) {
        this.fet = value;
    }

}
