package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Realtime Channel Interval Schema 
 * 
 * <p>Java class for cs_interval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_interval">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="type" type="{http://www.witsml.org/schemas/131}String"/>
 *         <sequence minOccurs="0">
 *           <element name="method" type="{http://www.witsml.org/schemas/131}String"/>
 *           <choice>
 *             <element name="timeInterval" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *             <element name="distanceInterval" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *           </choice>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_interval", propOrder = {
    "type",
    "method",
    "timeInterval",
    "distanceInterval"
})
public class CsInterval {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String type;
    @XmlSchemaType(name = "string")
    protected String method;
    protected TimeMeasure timeInterval;
    protected LengthMeasure distanceInterval;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the timeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setTimeInterval(TimeMeasure value) {
        this.timeInterval = value;
    }

    /**
     * Gets the value of the distanceInterval property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDistanceInterval() {
        return distanceInterval;
    }

    /**
     * Sets the value of the distanceInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDistanceInterval(LengthMeasure value) {
        this.distanceInterval = value;
    }

}
