


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Metadata by which the array structure of a compound value is defined. It defines one axis of an array type used in a log channel.
 * 
 * <p>Java class for LogChannelAxis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="LogChannelAxis">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AxisStart" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="AxisSpacing" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="AxisCount" type="{http://www.energistics.org/energyml/data/commonv2}PositiveLong"/>
 *         <element name="AxisName" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="AxisPropertyKind" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="AxisUom" type="{http://www.energistics.org/energyml/data/commonv2}UnitOfMeasureExt"/>
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
@XmlType(name = "LogChannelAxis", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "axisStart",
    "axisSpacing",
    "axisCount",
    "axisName",
    "axisPropertyKind",
    "axisUom"
})
public class LogChannelAxis {

    @XmlElement(name = "AxisStart")
    protected Double axisStart;
    @XmlElement(name = "AxisSpacing")
    protected Double axisSpacing;
    @XmlElement(name = "AxisCount")
    protected long axisCount;
    @XmlElement(name = "AxisName")
    protected String axisName;
    @XmlElement(name = "AxisPropertyKind", required = true)
    protected String axisPropertyKind;
    @XmlElement(name = "AxisUom", required = true)
    protected String axisUom;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;

    /**
     * Gets the value of the axisStart property.
     * 
     */
    public Double getAxisStart() {
        return axisStart;
    }

    /**
     * Sets the value of the axisStart property.
     * 
     */
    public void setAxisStart(Double value) {
        this.axisStart = value;
    }

    /**
     * Gets the value of the axisSpacing property.
     * 
     */
    public Double getAxisSpacing() {
        return axisSpacing;
    }

    /**
     * Sets the value of the axisSpacing property.
     * 
     */
    public void setAxisSpacing(Double value) {
        this.axisSpacing = value;
    }

    /**
     * Gets the value of the axisCount property.
     * 
     */
    public long getAxisCount() {
        return axisCount;
    }

    /**
     * Sets the value of the axisCount property.
     * 
     */
    public void setAxisCount(long value) {
        this.axisCount = value;
    }

    /**
     * Gets the value of the axisName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxisName() {
        return axisName;
    }

    /**
     * Sets the value of the axisName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxisName(String value) {
        this.axisName = value;
    }

    /**
     * Gets the value of the axisPropertyKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxisPropertyKind() {
        return axisPropertyKind;
    }

    /**
     * Sets the value of the axisPropertyKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxisPropertyKind(String value) {
        this.axisPropertyKind = value;
    }

    /**
     * Gets the value of the axisUom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxisUom() {
        return axisUom;
    }

    /**
     * Sets the value of the axisUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxisUom(String value) {
        this.axisUom = value;
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
