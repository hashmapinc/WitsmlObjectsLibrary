package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obj_message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_message">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_message" minOccurs="0"/>
 *         <element name="commonData" type="{http://www.witsml.org/schemas/131}cs_commonData" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *       <attribute name="uidWell" type="{http://www.witsml.org/schemas/131}uidString" />
 *       <attribute name="uidWellbore" type="{http://www.witsml.org/schemas/131}uidString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_message", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "objectReference",
    "subObjectReference",
    "dTim",
    "activityCode",
    "detailActivity",
    "md",
    "mdBit",
    "typeMessage",
    "messageText",
    "param",
    "severity",
    "warnProbability",
    "commonData",
    "customData"
})
public class ObjMessage
    extends com.hashmapinc.tempus.WitsmlObjects.common.ObjMessage {

    protected RefObjectString objectReference;
    protected RefObjectString subObjectReference;
    protected MeasuredDepthCoord md;
    protected MeasuredDepthCoord mdBit;
    @XmlSchemaType(name = "string")
    protected MessageType typeMessage;
    protected List<IndexedObject> param;
    @XmlSchemaType(name = "string")
    protected MessageSeverity severity;
    @XmlSchemaType(name = "string")
    protected MessageProbability warnProbability;
    protected CsCommonData commonData;
    protected CsCustomData customData;

    /**
     * Gets the value of the objectReference property.
     * 
     * @return
     *     possible object is
     *     {@link RefObjectString }
     *     
     */
    public RefObjectString getObjectReference() {
        return objectReference;
    }

    /**
     * Sets the value of the objectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefObjectString }
     *     
     */
    public void setObjectReference(RefObjectString value) {
        this.objectReference = value;
    }

    /**
     * Gets the value of the subObjectReference property.
     * 
     * @return
     *     possible object is
     *     {@link RefObjectString }
     *     
     */
    public RefObjectString getSubObjectReference() {
        return subObjectReference;
    }

    /**
     * Sets the value of the subObjectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefObjectString }
     *     
     */
    public void setSubObjectReference(RefObjectString value) {
        this.subObjectReference = value;
    }

    /**
     * Gets the value of the md property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMd() {
        return md;
    }

    /**
     * Sets the value of the md property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMd(MeasuredDepthCoord value) {
        this.md = value;
    }

    /**
     * Gets the value of the mdBit property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBit() {
        return mdBit;
    }

    /**
     * Sets the value of the mdBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBit(MeasuredDepthCoord value) {
        this.mdBit = value;
    }

    /**
     * Gets the value of the typeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getTypeMessage() {
        return typeMessage;
    }

    /**
     * Sets the value of the typeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setTypeMessage(MessageType value) {
        this.typeMessage = value;
    }

    /**
     * Gets the value of the param property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getParam().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedObject }
     * 
     * 
     */
    public List<IndexedObject> getParam() {
        if (param == null) {
            param = new ArrayList<IndexedObject>();
        }
        return this.param;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSeverity }
     *     
     */
    public MessageSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSeverity }
     *     
     */
    public void setSeverity(MessageSeverity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the warnProbability property.
     * 
     * @return
     *     possible object is
     *     {@link MessageProbability }
     *     
     */
    public MessageProbability getWarnProbability() {
        return warnProbability;
    }

    /**
     * Sets the value of the warnProbability property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageProbability }
     *     
     */
    public void setWarnProbability(MessageProbability value) {
        this.warnProbability = value;
    }

    /**
     * Gets the value of the commonData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCommonData }
     *     
     */
    public CsCommonData getCommonData() {
        return commonData;
    }

    /**
     * Sets the value of the commonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCommonData }
     *     
     */
    public void setCommonData(CsCommonData value) {
        this.commonData = value;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCustomData }
     *     
     */
    public CsCustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCustomData }
     *     
     */
    public void setCustomData(CsCustomData value) {
        this.customData = value;
    }
}
