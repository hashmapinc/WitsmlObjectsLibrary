package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Realtime Channel Component Schema 
 * 
 * <p>Java class for cs_channelDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_channelDefinition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mnemonic" type="{http://www.witsml.org/schemas/131}str32"/>
 *         <element name="dataType" type="{http://www.witsml.org/schemas/131}String" minOccurs="0"/>
 *         <element name="classWitsml" type="{http://www.witsml.org/schemas/131}RealtimeData" minOccurs="0"/>
 *         <element name="columnIndex" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="unit" type="{http://www.witsml.org/schemas/131}uomString" minOccurs="0"/>
 *         <element name="description" type="{http://www.witsml.org/schemas/131}descriptionString" minOccurs="0"/>
 *         <element name="mnemAlias" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="sensorOffset" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="dataSource" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="interval" type="{http://www.witsml.org/schemas/131}cs_interval" minOccurs="0"/>
 *         <element name="axisDefinition" type="{http://www.witsml.org/schemas/131}cs_axisDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_channelDefinition", propOrder = {
    "mnemonic",
    "dataType",
    "classWitsml",
    "columnIndex",
    "unit",
    "description",
    "mnemAlias",
    "sensorOffset",
    "dataSource",
    "interval",
    "axisDefinition"
})
public class CsChannelDefinition {

    @XmlElement(required = true)
    protected String mnemonic;
    @XmlSchemaType(name = "string")
    protected String dataType;
    protected String classWitsml;
    protected Short columnIndex;
    protected String unit;
    protected String description;
    protected String mnemAlias;
    protected LengthMeasure sensorOffset;
    protected String dataSource;
    protected CsInterval interval;
    protected List<CsAxisDefinition> axisDefinition;

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
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the classWitsml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassWitsml() {
        return classWitsml;
    }

    /**
     * Sets the value of the classWitsml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassWitsml(String value) {
        this.classWitsml = value;
    }

    /**
     * Gets the value of the columnIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getColumnIndex() {
        return columnIndex;
    }

    /**
     * Sets the value of the columnIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setColumnIndex(Short value) {
        this.columnIndex = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
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

    /**
     * Gets the value of the mnemAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnemAlias() {
        return mnemAlias;
    }

    /**
     * Sets the value of the mnemAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnemAlias(String value) {
        this.mnemAlias = value;
    }

    /**
     * Gets the value of the sensorOffset property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getSensorOffset() {
        return sensorOffset;
    }

    /**
     * Sets the value of the sensorOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setSensorOffset(LengthMeasure value) {
        this.sensorOffset = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link CsInterval }
     *     
     */
    public CsInterval getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsInterval }
     *     
     */
    public void setInterval(CsInterval value) {
        this.interval = value;
    }

    /**
     * Gets the value of the axisDefinition property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisDefinition property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getAxisDefinition().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsAxisDefinition }
     * 
     * 
     */
    public List<CsAxisDefinition> getAxisDefinition() {
        if (axisDefinition == null) {
            axisDefinition = new ArrayList<CsAxisDefinition>();
        }
        return this.axisDefinition;
    }

}
