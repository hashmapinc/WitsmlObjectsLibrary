package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Describes a well log data block.	
 * 
 * <p>Java class for cs_blockInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_blockInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dataRowCount" type="{http://www.witsml.org/schemas/131}positiveBigCount" minOccurs="0"/>
 *         <element name="pass" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="description" type="{http://www.witsml.org/schemas/131}descriptionString" minOccurs="0"/>
 *         <element name="indexType" type="{http://www.witsml.org/schemas/131}String"/>
 *         <element name="startIndex" type="{http://www.witsml.org/schemas/131}genericMeasure" minOccurs="0"/>
 *         <element name="endIndex" type="{http://www.witsml.org/schemas/131}genericMeasure" minOccurs="0"/>
 *         <element name="stepIncrement" type="{http://www.witsml.org/schemas/131}ratioGenericMeasure" minOccurs="0"/>
 *         <element name="startDateTimeIndex" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="endDateTimeIndex" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="direction" type="{http://www.witsml.org/schemas/131}String" minOccurs="0"/>
 *         <element name="indexCurve" type="{http://www.witsml.org/schemas/131}indexCurve" minOccurs="0"/>
 *         <element name="nullValue" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="logParam" type="{http://www.witsml.org/schemas/131}indexedObject" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="blockCurveInfo" type="{http://www.witsml.org/schemas/131}cs_blockCurveInfo" maxOccurs="unbounded"/>
 *       </sequence>
 *       <attribute name="uid" use="required" type="{http://www.witsml.org/schemas/131}uidString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_blockInfo", propOrder = {
    "dataRowCount",
    "pass",
    "description",
    "indexType",
    "startIndex",
    "endIndex",
    "stepIncrement",
    "startDateTimeIndex",
    "endDateTimeIndex",
    "direction",
    "indexCurve",
    "nullValue",
    "logParam",
    "blockCurveInfo"
})
public class CsBlockInfo {

    protected Integer dataRowCount;
    protected String pass;
    protected String description;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String indexType;
    protected GenericMeasure startIndex;
    protected GenericMeasure endIndex;
    protected RatioGenericMeasure stepIncrement;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTimeIndex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTimeIndex;
    @XmlSchemaType(name = "string")
    protected String direction;
    protected IndexCurve indexCurve;
    protected String nullValue;
    protected List<IndexedObject> logParam;
    @XmlElement(required = true)
    protected List<CsBlockCurveInfo> blockCurveInfo;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;

    /**
     * Gets the value of the dataRowCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataRowCount() {
        return dataRowCount;
    }

    /**
     * Sets the value of the dataRowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataRowCount(Integer value) {
        this.dataRowCount = value;
    }

    /**
     * Gets the value of the pass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPass() {
        return pass;
    }

    /**
     * Sets the value of the pass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPass(String value) {
        this.pass = value;
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
     * Gets the value of the startIndex property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setStartIndex(GenericMeasure value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the endIndex property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getEndIndex() {
        return endIndex;
    }

    /**
     * Sets the value of the endIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setEndIndex(GenericMeasure value) {
        this.endIndex = value;
    }

    /**
     * Gets the value of the stepIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link RatioGenericMeasure }
     *     
     */
    public RatioGenericMeasure getStepIncrement() {
        return stepIncrement;
    }

    /**
     * Sets the value of the stepIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatioGenericMeasure }
     *     
     */
    public void setStepIncrement(RatioGenericMeasure value) {
        this.stepIncrement = value;
    }

    /**
     * Gets the value of the startDateTimeIndex property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTimeIndex() {
        return startDateTimeIndex;
    }

    /**
     * Sets the value of the startDateTimeIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTimeIndex(XMLGregorianCalendar value) {
        this.startDateTimeIndex = value;
    }

    /**
     * Gets the value of the endDateTimeIndex property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTimeIndex() {
        return endDateTimeIndex;
    }

    /**
     * Sets the value of the endDateTimeIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTimeIndex(XMLGregorianCalendar value) {
        this.endDateTimeIndex = value;
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
     * Gets the value of the indexCurve property.
     * 
     * @return
     *     possible object is
     *     {@link IndexCurve }
     *     
     */
    public IndexCurve getIndexCurve() {
        return indexCurve;
    }

    /**
     * Sets the value of the indexCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexCurve }
     *     
     */
    public void setIndexCurve(IndexCurve value) {
        this.indexCurve = value;
    }

    /**
     * Gets the value of the nullValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullValue() {
        return nullValue;
    }

    /**
     * Sets the value of the nullValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullValue(String value) {
        this.nullValue = value;
    }

    /**
     * Gets the value of the logParam property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logParam property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getLogParam().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedObject }
     * 
     * 
     */
    public List<IndexedObject> getLogParam() {
        if (logParam == null) {
            logParam = new ArrayList<IndexedObject>();
        }
        return this.logParam;
    }

    /**
     * Gets the value of the blockCurveInfo property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockCurveInfo property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getBlockCurveInfo().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsBlockCurveInfo }
     * 
     * 
     */
    public List<CsBlockCurveInfo> getBlockCurveInfo() {
        if (blockCurveInfo == null) {
            blockCurveInfo = new ArrayList<CsBlockCurveInfo>();
        }
        return this.blockCurveInfo;
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
