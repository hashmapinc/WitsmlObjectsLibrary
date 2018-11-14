


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the data for the log in terms of  the value of a given channel.
 * 
 * <p>Java class for ChannelValueContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ChannelValueContext">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/witsmlv2}AbstractLogDataContext">
 *       <sequence>
 *         <element name="ChannelReference" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference"/>
 *         <element name="DataValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelValueContext", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "channelReference",
    "dataValue"
})
public class ChannelValueContext
    extends AbstractLogDataContext
{

    @XmlElement(name = "ChannelReference", required = true)
    protected DataObjectReference channelReference;
    @XmlElement(name = "DataValue", required = true)
    protected String dataValue;

    /**
     * Gets the value of the channelReference property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getChannelReference() {
        return channelReference;
    }

    /**
     * Sets the value of the channelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setChannelReference(DataObjectReference value) {
        this.channelReference = value;
    }

    /**
     * Gets the value of the dataValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataValue() {
        return dataValue;
    }

    /**
     * Sets the value of the dataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataValue(String value) {
        this.dataValue = value;
    }

}
