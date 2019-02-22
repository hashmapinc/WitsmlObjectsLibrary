


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A read-only class that is the union of those channel indexes that are shared by all channels in the channel set.
 * 
 * <p>Java class for ChannelIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ChannelIndex">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IndexType" type="{http://www.energistics.org/energyml/data/witsmlv2}String"/>
 *         <element name="Uom" type="{http://www.energistics.org/energyml/data/commonv2}UnitOfMeasureExt"/>
 *         <element name="Direction" type="{http://www.energistics.org/energyml/data/witsmlv2}String"/>
 *         <element name="Mnemonic" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="DatumReference" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelIndex", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "indexType",
    "uom",
    "direction",
    "mnemonic",
    "datumReference"
})
public class ChannelIndex {

    @XmlElement(name = "IndexType", required = true)
    @XmlSchemaType(name = "string")
    protected String indexType;
    @XmlElement(name = "Uom", required = true)
    protected String uom;
    @XmlElement(name = "Direction", required = true)
    @XmlSchemaType(name = "string")
    protected String direction;
    @XmlElement(name = "Mnemonic", required = true)
    protected String mnemonic;
    @XmlElement(name = "DatumReference")
    protected String datumReference;

    /**
     * Gets the value of the indexType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexType() {
        return indexType;
    }

    /**
     * Sets the value of the indexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexType(String value) {
        this.indexType = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
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
     * Gets the value of the datumReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumReference() {
        return datumReference;
    }

    /**
     * Sets the value of the datumReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumReference(String value) {
        this.datumReference = value;
    }

}
