


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A grouping of channels with a compatible index, for some purpose. Each channel has its own index. A ‘compatible’ index simply means that all of the channels are either in time or in depth using a common datum.
 * 
 * <p>Java class for ChannelSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ChannelSet">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="Index" type="{http://www.energistics.org/energyml/data/witsmlv2}ChannelIndex" maxOccurs="unbounded"/>
 *         <element name="Channel" type="{http://www.energistics.org/energyml/data/witsmlv2}Channel" maxOccurs="unbounded"/>
 *         <element name="Data" type="{http://www.energistics.org/energyml/data/witsmlv2}ChannelData" minOccurs="0"/>
 *         <group ref="{http://www.energistics.org/energyml/data/witsmlv2}ChannelSetMetadata"/>
 *         <element name="Wellbore" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference" minOccurs="0"/>
 *         <element name="DataContext" type="{http://www.energistics.org/energyml/data/witsmlv2}AbstractLogDataContext" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelSet", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "index",
    "channel",
    "data",
    "channelState",
    "timeDepth",
    "channelClass",
    "runNumber",
    "passNumber",
    "startIndex",
    "endIndex",
    "loggingCompanyName",
    "loggingCompanyCode",
    "toolName",
    "toolClass",
    "derivation",
    "loggingMethod",
    "nominalHoleSize",
    "wellbore",
    "dataContext"
})
public class ChannelSet
    extends AbstractObject
{

    @XmlElement(name = "Index", required = true)
    protected List<ChannelIndex> index;
    @XmlElement(name = "Channel", required = true)
    protected List<Channel> channel;
    @XmlElement(name = "Data")
    protected ChannelData data;
    @XmlElement(name = "ChannelState")
    @XmlSchemaType(name = "string")
    protected String channelState;
    @XmlElement(name = "TimeDepth")
    protected String timeDepth;
    @XmlElement(name = "ChannelClass")
    protected DataObjectReference channelClass;
    @XmlElement(name = "RunNumber")
    protected String runNumber;
    @XmlElement(name = "PassNumber")
    protected String passNumber;
    @XmlElement(name = "StartIndex")
    protected AbstractIndexValue startIndex;
    @XmlElement(name = "EndIndex")
    protected AbstractIndexValue endIndex;
    @XmlElement(name = "LoggingCompanyName")
    protected String loggingCompanyName;
    @XmlElement(name = "LoggingCompanyCode")
    protected String loggingCompanyCode;
    @XmlElement(name = "ToolName")
    protected String toolName;
    @XmlElement(name = "ToolClass")
    protected String toolClass;
    @XmlElement(name = "Derivation")
    @XmlSchemaType(name = "string")
    protected String derivation;
    @XmlElement(name = "LoggingMethod")
    @XmlSchemaType(name = "string")
    protected String loggingMethod;
    @XmlElement(name = "NominalHoleSize")
    protected LengthMeasureExt nominalHoleSize;
    @XmlElement(name = "Wellbore")
    protected DataObjectReference wellbore;
    @XmlElement(name = "DataContext")
    protected AbstractLogDataContext dataContext;

    /**
     * Gets the value of the index property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the index property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelIndex }
     * 
     * 
     */
    public List<ChannelIndex> getIndex() {
        if (index == null) {
            index = new ArrayList<ChannelIndex>();
        }
        return this.index;
    }

    /**
     * Gets the value of the channel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Channel }
     * 
     * 
     */
    public List<Channel> getChannel() {
        if (channel == null) {
            channel = new ArrayList<Channel>();
        }
        return this.channel;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelData }
     *     
     */
    public ChannelData getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelData }
     *     
     */
    public void setData(ChannelData value) {
        this.data = value;
    }

    /**
     * Gets the value of the channelState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelState() {
        return channelState;
    }

    /**
     * Sets the value of the channelState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelState(String value) {
        this.channelState = value;
    }

    /**
     * Gets the value of the timeDepth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeDepth() {
        return timeDepth;
    }

    /**
     * Sets the value of the timeDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeDepth(String value) {
        this.timeDepth = value;
    }

    /**
     * Gets the value of the channelClass property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getChannelClass() {
        return channelClass;
    }

    /**
     * Sets the value of the channelClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setChannelClass(DataObjectReference value) {
        this.channelClass = value;
    }

    /**
     * Gets the value of the runNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunNumber() {
        return runNumber;
    }

    /**
     * Sets the value of the runNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunNumber(String value) {
        this.runNumber = value;
    }

    /**
     * Gets the value of the passNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassNumber() {
        return passNumber;
    }

    /**
     * Sets the value of the passNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassNumber(String value) {
        this.passNumber = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractIndexValue }
     *     
     */
    public AbstractIndexValue getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractIndexValue }
     *     
     */
    public void setStartIndex(AbstractIndexValue value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the endIndex property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractIndexValue }
     *     
     */
    public AbstractIndexValue getEndIndex() {
        return endIndex;
    }

    /**
     * Sets the value of the endIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractIndexValue }
     *     
     */
    public void setEndIndex(AbstractIndexValue value) {
        this.endIndex = value;
    }

    /**
     * Gets the value of the loggingCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggingCompanyName() {
        return loggingCompanyName;
    }

    /**
     * Sets the value of the loggingCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggingCompanyName(String value) {
        this.loggingCompanyName = value;
    }

    /**
     * Gets the value of the loggingCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggingCompanyCode() {
        return loggingCompanyCode;
    }

    /**
     * Sets the value of the loggingCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggingCompanyCode(String value) {
        this.loggingCompanyCode = value;
    }

    /**
     * Gets the value of the toolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolName() {
        return toolName;
    }

    /**
     * Sets the value of the toolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolName(String value) {
        this.toolName = value;
    }

    /**
     * Gets the value of the toolClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolClass() {
        return toolClass;
    }

    /**
     * Sets the value of the toolClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolClass(String value) {
        this.toolClass = value;
    }

    /**
     * Gets the value of the derivation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivation() {
        return derivation;
    }

    /**
     * Sets the value of the derivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivation(String value) {
        this.derivation = value;
    }

    /**
     * Gets the value of the loggingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggingMethod() {
        return loggingMethod;
    }

    /**
     * Sets the value of the loggingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggingMethod(String value) {
        this.loggingMethod = value;
    }

    /**
     * Gets the value of the nominalHoleSize property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasureExt }
     *     
     */
    public LengthMeasureExt getNominalHoleSize() {
        return nominalHoleSize;
    }

    /**
     * Sets the value of the nominalHoleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasureExt }
     *     
     */
    public void setNominalHoleSize(LengthMeasureExt value) {
        this.nominalHoleSize = value;
    }

    /**
     * Gets the value of the wellbore property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getWellbore() {
        return wellbore;
    }

    /**
     * Sets the value of the wellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setWellbore(DataObjectReference value) {
        this.wellbore = value;
    }

    /**
     * Gets the value of the dataContext property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractLogDataContext }
     *     
     */
    public AbstractLogDataContext getDataContext() {
        return dataContext;
    }

    /**
     * Sets the value of the dataContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractLogDataContext }
     *     
     */
    public void setDataContext(AbstractLogDataContext value) {
        this.dataContext = value;
    }

}
