package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obj_mudLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_mudLog">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_mudLog" minOccurs="0"/>
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
@XmlType(name = "obj_mudLog", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "objectGrowing",
    "dTim",
    "mudLogCompany",
    "mudLogEngineers",
    "startMd",
    "endMd",
    "relatedLog",
    "parameter",
    "geologyInterval",
    "commonData",
    "customData"
})
public class ObjMudLog
    extends com.hashmapinc.tempus.WitsmlObjects.common.ObjMudLog {

    protected MeasuredDepthCoord startMd;
    protected MeasuredDepthCoord endMd;
    protected List<RefNameString> relatedLog;
    protected List<CsMudLogParameter> parameter;
    protected List<CsGeologyInterval> geologyInterval;
    protected CsCommonData commonData;
    protected CsCustomData customData;

    /**
     * Gets the value of the startMd property.
     *
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *
     */
    public MeasuredDepthCoord getStartMd() {
        return startMd;
    }

    /**
     * Sets the value of the startMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setStartMd(MeasuredDepthCoord value) {
        this.startMd = value;
    }

    /**
     * Gets the value of the endMd property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getEndMd() {
        return endMd;
    }

    /**
     * Sets the value of the endMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setEndMd(MeasuredDepthCoord value) {
        this.endMd = value;
    }

    /**
     * Gets the value of the relatedLog property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedLog property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getRelatedLog().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link RefNameString }
     * 
     * 
     */
    public List<RefNameString> getRelatedLog() {
        if (relatedLog == null) {
            relatedLog = new ArrayList<RefNameString>();
        }
        return this.relatedLog;
    }

    /**
     * Gets the value of the parameter property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getParameter().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsMudLogParameter }
     * 
     * 
     */
    public List<CsMudLogParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<CsMudLogParameter>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the geologyInterval property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geologyInterval property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getGeologyInterval().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsGeologyInterval }
     * 
     * 
     */
    public List<CsGeologyInterval> getGeologyInterval() {
        if (geologyInterval == null) {
            geologyInterval = new ArrayList<CsGeologyInterval>();
        }
        return this.geologyInterval;
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
