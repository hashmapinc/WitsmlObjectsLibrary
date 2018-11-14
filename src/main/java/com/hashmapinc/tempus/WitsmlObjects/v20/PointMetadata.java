


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to declare that data points in a specific WITSML log channel may contain value attributes (e.g., quality identifiers). This declaration is independent from the possibility that ETP may have sent ValueAttributes in real time.
 * If an instance of PointMetadata is present for a Channel, then the value for that point is represented as an array in the bulk data string.
 * 
 * <p>Java class for PointMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="PointMetadata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="EtpDataType" type="{http://www.energistics.org/energyml/data/witsmlv2}EtpDataType"/>
 *         <element name="Description" type="{http://www.energistics.org/energyml/data/commonv2}String2000"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointMetadata", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "name",
    "etpDataType",
    "description"
})
public class PointMetadata {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "EtpDataType", required = true)
    @XmlSchemaType(name = "string")
    protected EtpDataType etpDataType;
    @XmlElement(name = "Description", required = true)
    protected String description;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the etpDataType property.
     * 
     * @return
     *     possible object is
     *     {@link EtpDataType }
     *     
     */
    public EtpDataType getEtpDataType() {
        return etpDataType;
    }

    /**
     * Sets the value of the etpDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtpDataType }
     *     
     */
    public void setEtpDataType(EtpDataType value) {
        this.etpDataType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
