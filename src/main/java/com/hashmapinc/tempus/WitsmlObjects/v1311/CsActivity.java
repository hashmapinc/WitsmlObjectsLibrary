package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Operations Activity Component Schema 
 * 
 * <p>Java class for cs_activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_activity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTimStart" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="dTimEnd" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="duration" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="phase" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="activityCode" type="{http://www.witsml.org/schemas/131}ActivityCode" minOccurs="0"/>
 *         <element name="detailActivity" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="typeActivityClass" type="{http://www.witsml.org/schemas/131}ActivityClassType" minOccurs="0"/>
 *         <element name="mdHoleStart" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="tvdHoleStart" type="{http://www.witsml.org/schemas/131}wellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="mdHoleEnd" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="tvdHoleEnd" type="{http://www.witsml.org/schemas/131}wellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="mdBitStart" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="mdBitEnd" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="state" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="operator" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="tubular" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
 *         <element name="optimum" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="productive" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="itemState" type="{http://www.witsml.org/schemas/131}ItemState" minOccurs="0"/>
 *         <element name="comments" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_activity", propOrder = {
    "dTimStart",
    "dTimEnd",
    "duration",
    "phase",
    "activityCode",
    "detailActivity",
    "typeActivityClass",
    "mdHoleStart",
    "tvdHoleStart",
    "mdHoleEnd",
    "tvdHoleEnd",
    "mdBitStart",
    "mdBitEnd",
    "state",
    "operator",
    "tubular",
    "optimum",
    "productive",
    "itemState",
    "comments"
})
public class CsActivity {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimEnd;
    protected TimeMeasure duration;
    protected String phase;
    protected String activityCode;
    protected String detailActivity;
    @XmlSchemaType(name = "string")
    protected String typeActivityClass;
    protected MeasuredDepthCoord mdHoleStart;
    protected WellVerticalDepthCoord tvdHoleStart;
    protected MeasuredDepthCoord mdHoleEnd;
    protected WellVerticalDepthCoord tvdHoleEnd;
    protected MeasuredDepthCoord mdBitStart;
    protected MeasuredDepthCoord mdBitEnd;
    protected String state;
    protected String operator;
    protected RefNameString tubular;
    protected Boolean optimum;
    protected Boolean productive;
    @XmlSchemaType(name = "string")
    protected String itemState;
    protected String comments;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the dTimStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimStart() {
        return dTimStart;
    }

    /**
     * Sets the value of the dTimStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimStart(XMLGregorianCalendar value) {
        this.dTimStart = value;
    }

    /**
     * Gets the value of the dTimEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimEnd() {
        return dTimEnd;
    }

    /**
     * Sets the value of the dTimEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimEnd(XMLGregorianCalendar value) {
        this.dTimEnd = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setDuration(TimeMeasure value) {
        this.duration = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    /**
     * Gets the value of the activityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * Sets the value of the activityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCode(String value) {
        this.activityCode = value;
    }

    /**
     * Gets the value of the detailActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailActivity() {
        return detailActivity;
    }

    /**
     * Sets the value of the detailActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailActivity(String value) {
        this.detailActivity = value;
    }

    /**
     * Gets the value of the typeActivityClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeActivityClass() {
        return typeActivityClass;
    }

    /**
     * Sets the value of the typeActivityClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeActivityClass(String value) {
        this.typeActivityClass = value;
    }

    /**
     * Gets the value of the mdHoleStart property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdHoleStart() {
        return mdHoleStart;
    }

    /**
     * Sets the value of the mdHoleStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdHoleStart(MeasuredDepthCoord value) {
        this.mdHoleStart = value;
    }

    /**
     * Gets the value of the tvdHoleStart property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdHoleStart() {
        return tvdHoleStart;
    }

    /**
     * Sets the value of the tvdHoleStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdHoleStart(WellVerticalDepthCoord value) {
        this.tvdHoleStart = value;
    }

    /**
     * Gets the value of the mdHoleEnd property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdHoleEnd() {
        return mdHoleEnd;
    }

    /**
     * Sets the value of the mdHoleEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdHoleEnd(MeasuredDepthCoord value) {
        this.mdHoleEnd = value;
    }

    /**
     * Gets the value of the tvdHoleEnd property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdHoleEnd() {
        return tvdHoleEnd;
    }

    /**
     * Sets the value of the tvdHoleEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdHoleEnd(WellVerticalDepthCoord value) {
        this.tvdHoleEnd = value;
    }

    /**
     * Gets the value of the mdBitStart property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBitStart() {
        return mdBitStart;
    }

    /**
     * Sets the value of the mdBitStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBitStart(MeasuredDepthCoord value) {
        this.mdBitStart = value;
    }

    /**
     * Gets the value of the mdBitEnd property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBitEnd() {
        return mdBitEnd;
    }

    /**
     * Sets the value of the mdBitEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBitEnd(MeasuredDepthCoord value) {
        this.mdBitEnd = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the tubular property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getTubular() {
        return tubular;
    }

    /**
     * Sets the value of the tubular property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setTubular(RefNameString value) {
        this.tubular = value;
    }

    /**
     * Gets the value of the optimum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptimum() {
        return optimum;
    }

    /**
     * Sets the value of the optimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimum(Boolean value) {
        this.optimum = value;
    }

    /**
     * Gets the value of the productive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductive() {
        return productive;
    }

    /**
     * Sets the value of the productive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductive(Boolean value) {
        this.productive = value;
    }

    /**
     * Gets the value of the itemState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemState() {
        return itemState;
    }

    /**
     * Sets the value of the itemState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemState(String value) {
        this.itemState = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
