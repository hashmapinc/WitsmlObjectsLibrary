


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A channel object. It corresponds roughly to the LogCurveInfo structure in WITSML1411, and directly corresponds to the ChannelMetadataRecord structure in ETP. In historian terminology, a channel corresponds directly to a tag.
 * Channels are the fundamental unit of organization for WITSML logs.
 * 
 * <p>Java class for Channel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="Channel">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="Mnemonic" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="DataType" type="{http://www.energistics.org/energyml/data/witsmlv2}EtpDataType"/>
 *         <element name="Uom" type="{http://www.energistics.org/energyml/data/commonv2}UnitOfMeasureExt"/>
 *         <element name="GrowingStatus" type="{http://www.energistics.org/energyml/data/witsmlv2}ChannelStatus"/>
 *         <element name="Source" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="Wellbore" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference" minOccurs="0"/>
 *         <element name="AxisDefinition" type="{http://www.energistics.org/energyml/data/witsmlv2}LogChannelAxis" maxOccurs="unbounded" minOccurs="0"/>
 *         <group ref="{http://www.energistics.org/energyml/data/witsmlv2}ChannelMetadata"/>
 *         <element name="PointMetadata" type="{http://www.energistics.org/energyml/data/witsmlv2}PointMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DerivedFrom" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Index" type="{http://www.energistics.org/energyml/data/witsmlv2}ChannelIndex" maxOccurs="unbounded"/>
 *         <element name="Parent" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Channel", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "mnemonic",
    "dataType",
    "uom",
    "growingStatus",
    "source",
    "wellbore",
    "axisDefinition",
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
    "pointMetadata",
    "derivedFrom",
    "index",
    "parent"
})
public class Channel
    extends AbstractObject
{

    @XmlElement(name = "Mnemonic", required = true)
    protected String mnemonic;
    @XmlElement(name = "DataType", required = true)
    @XmlSchemaType(name = "string")
    protected EtpDataType dataType;
    @XmlElement(name = "Uom", required = true)
    protected String uom;
    @XmlElement(name = "GrowingStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ChannelStatus growingStatus;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Wellbore")
    protected DataObjectReference wellbore;
    @XmlElement(name = "AxisDefinition")
    protected List<LogChannelAxis> axisDefinition;
    @XmlElement(name = "ChannelState")
    @XmlSchemaType(name = "string")
    protected ChannelState channelState;
    @XmlElement(name = "TimeDepth", required = true)
    protected String timeDepth;
    @XmlElement(name = "ChannelClass", required = true)
    protected DataObjectReference channelClass;
    @XmlElement(name = "RunNumber")
    protected String runNumber;
    @XmlElement(name = "PassNumber")
    protected String passNumber;
    @XmlElement(name = "StartIndex")
    protected AbstractIndexValue startIndex;
    @XmlElement(name = "EndIndex")
    protected AbstractIndexValue endIndex;
    @XmlElement(name = "LoggingCompanyName", required = true)
    protected String loggingCompanyName;
    @XmlElement(name = "LoggingCompanyCode")
    protected String loggingCompanyCode;
    @XmlElement(name = "ToolName")
    protected String toolName;
    @XmlElement(name = "ToolClass")
    protected String toolClass;
    @XmlElement(name = "Derivation")
    @XmlSchemaType(name = "string")
    protected ChannelDerivation derivation;
    @XmlElement(name = "LoggingMethod")
    @XmlSchemaType(name = "string")
    protected LoggingMethod loggingMethod;
    @XmlElement(name = "NominalHoleSize")
    protected LengthMeasureExt nominalHoleSize;
    @XmlElement(name = "PointMetadata")
    protected List<PointMetadata> pointMetadata;
    @XmlElement(name = "DerivedFrom")
    protected List<DataObjectReference> derivedFrom;
    @XmlElement(name = "Index", required = true)
    protected List<ChannelIndex> index;
    @XmlElement(name = "Parent")
    protected DataObjectReference parent;

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
     *     {@link EtpDataType }
     *     
     */
    public EtpDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtpDataType }
     *     
     */
    public void setDataType(EtpDataType value) {
        this.dataType = value;
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
     * Gets the value of the growingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelStatus }
     *     
     */
    public ChannelStatus getGrowingStatus() {
        return growingStatus;
    }

    /**
     * Sets the value of the growingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelStatus }
     *     
     */
    public void setGrowingStatus(ChannelStatus value) {
        this.growingStatus = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
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
     * Gets the value of the axisDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogChannelAxis }
     * 
     * 
     */
    public List<LogChannelAxis> getAxisDefinition() {
        if (axisDefinition == null) {
            axisDefinition = new ArrayList<LogChannelAxis>();
        }
        return this.axisDefinition;
    }

    /**
     * Gets the value of the channelState property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelState }
     *     
     */
    public ChannelState getChannelState() {
        return channelState;
    }

    /**
     * Sets the value of the channelState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelState }
     *     
     */
    public void setChannelState(ChannelState value) {
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
     *     {@link ChannelDerivation }
     *     
     */
    public ChannelDerivation getDerivation() {
        return derivation;
    }

    /**
     * Sets the value of the derivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelDerivation }
     *     
     */
    public void setDerivation(ChannelDerivation value) {
        this.derivation = value;
    }

    /**
     * Gets the value of the loggingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link LoggingMethod }
     *     
     */
    public LoggingMethod getLoggingMethod() {
        return loggingMethod;
    }

    /**
     * Sets the value of the loggingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoggingMethod }
     *     
     */
    public void setLoggingMethod(LoggingMethod value) {
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
     * Gets the value of the pointMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointMetadata }
     * 
     * 
     */
    public List<PointMetadata> getPointMetadata() {
        if (pointMetadata == null) {
            pointMetadata = new ArrayList<PointMetadata>();
        }
        return this.pointMetadata;
    }

    /**
     * Gets the value of the derivedFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivedFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivedFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataObjectReference }
     * 
     * 
     */
    public List<DataObjectReference> getDerivedFrom() {
        if (derivedFrom == null) {
            derivedFrom = new ArrayList<DataObjectReference>();
        }
        return this.derivedFrom;
    }

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
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setParent(DataObjectReference value) {
        this.parent = value;
    }

}
