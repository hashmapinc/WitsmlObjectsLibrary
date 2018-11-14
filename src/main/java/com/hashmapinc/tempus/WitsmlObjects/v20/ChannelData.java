


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the bulk data for the log, either as a base64-encoded string or as a reference to an external file.
 * 
 * <p>Java class for ChannelData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ChannelData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FileUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelData", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "data",
    "fileUri"
})
public class ChannelData {

    @XmlElement(name = "Data")
    protected String data;
    @XmlElement(name = "FileUri")
    @XmlSchemaType(name = "anyURI")
    protected String fileUri;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the fileUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileUri() {
        return fileUri;
    }

    /**
     * Sets the value of the fileUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileUri(String value) {
        this.fileUri = value;
    }

}
