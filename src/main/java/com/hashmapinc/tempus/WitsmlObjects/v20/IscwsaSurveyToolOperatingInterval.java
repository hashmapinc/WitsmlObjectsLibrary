


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Inclination interval for a particular operating mode.
 * Intervals may overlap to suppress mode flip-flopping, but should cover
 * the entire valid range of the tool.
 * 
 * <p>Java class for IscwsaSurveyToolOperatingInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="IscwsaSurveyToolOperatingInterval">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.energistics.org/energyml/data/witsmlv2}SurveyToolOperatingMode"/>
 *         <element name="Start" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure"/>
 *         <element name="End" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure"/>
 *         <element name="Speed" type="{http://www.energistics.org/energyml/data/commonv2}LengthPerTimeMeasure" minOccurs="0"/>
 *         <element name="SampleRate" type="{http://www.energistics.org/energyml/data/commonv2}TimeMeasure" minOccurs="0"/>
 *         <element name="ExtensionNameValue" type="{http://www.energistics.org/energyml/data/commonv2}ExtensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="uid" use="required" type="{http://www.energistics.org/energyml/data/commonv2}String64" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscwsaSurveyToolOperatingInterval", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "mode",
    "start",
    "end",
    "speed",
    "sampleRate",
    "extensionNameValue"
})
public class IscwsaSurveyToolOperatingInterval {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected String mode;
    @XmlElement(name = "Start", required = true)
    protected PlaneAngleMeasure start;
    @XmlElement(name = "End", required = true)
    protected PlaneAngleMeasure end;
    @XmlElement(name = "Speed")
    protected LengthPerTimeMeasure speed;
    @XmlElement(name = "SampleRate")
    protected TimeMeasure sampleRate;
    @XmlElement(name = "ExtensionNameValue")
    protected List<ExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setStart(PlaneAngleMeasure value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setEnd(PlaneAngleMeasure value) {
        this.end = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link LengthPerTimeMeasure }
     *     
     */
    public LengthPerTimeMeasure getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthPerTimeMeasure }
     *     
     */
    public void setSpeed(LengthPerTimeMeasure value) {
        this.speed = value;
    }

    /**
     * Gets the value of the sampleRate property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getSampleRate() {
        return sampleRate;
    }

    /**
     * Sets the value of the sampleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setSampleRate(TimeMeasure value) {
        this.sampleRate = value;
    }

    /**
     * Gets the value of the extensionNameValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionNameValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionNameValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionNameValue }
     * 
     * 
     */
    public List<ExtensionNameValue> getExtensionNameValue() {
        if (extensionNameValue == null) {
            extensionNameValue = new ArrayList<ExtensionNameValue>();
        }
        return this.extensionNameValue;
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
