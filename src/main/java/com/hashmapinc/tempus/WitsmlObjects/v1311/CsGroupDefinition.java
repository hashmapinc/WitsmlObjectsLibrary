package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML realtime group definition component object.
 * 
 * <p>Java class for cs_groupDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_groupDefinition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.witsml.org/schemas/131}str32"/>
 *         <element name="multiplexed" type="{http://www.witsml.org/schemas/131}logicalBoolean"/>
 *         <element name="interval" type="{http://www.witsml.org/schemas/131}cs_interval" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="persistedAsLog" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
 *           <element name="persistedAsWellLog" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
 *         </choice>
 *         <element name="comment" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="channelDefinition" type="{http://www.witsml.org/schemas/131}cs_channelDefinition" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_groupDefinition", propOrder = {
    "id",
    "multiplexed",
    "interval",
    "persistedAsLog",
    "persistedAsWellLog",
    "comment",
    "channelDefinition"
})
public class CsGroupDefinition {

    @XmlElement(required = true)
    protected String id;
    protected boolean multiplexed;
    protected CsInterval interval;
    protected RefNameString persistedAsLog;
    protected RefNameString persistedAsWellLog;
    protected String comment;
    @XmlElement(required = true)
    protected List<CsChannelDefinition> channelDefinition;

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
     * Gets the value of the multiplexed property.
     * 
     */
    public boolean isMultiplexed() {
        return multiplexed;
    }

    /**
     * Sets the value of the multiplexed property.
     * 
     */
    public void setMultiplexed(boolean value) {
        this.multiplexed = value;
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
     * Gets the value of the persistedAsLog property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getPersistedAsLog() {
        return persistedAsLog;
    }

    /**
     * Sets the value of the persistedAsLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setPersistedAsLog(RefNameString value) {
        this.persistedAsLog = value;
    }

    /**
     * Gets the value of the persistedAsWellLog property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getPersistedAsWellLog() {
        return persistedAsWellLog;
    }

    /**
     * Sets the value of the persistedAsWellLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setPersistedAsWellLog(RefNameString value) {
        this.persistedAsWellLog = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the channelDefinition property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channelDefinition property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getChannelDefinition().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsChannelDefinition }
     * 
     * 
     */
    public List<CsChannelDefinition> getChannelDefinition() {
        if (channelDefinition == null) {
            channelDefinition = new ArrayList<CsChannelDefinition>();
        }
        return this.channelDefinition;
    }

}
