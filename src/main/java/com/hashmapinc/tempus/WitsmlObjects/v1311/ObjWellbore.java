package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hashmapinc.tempus.WitsmlObjects.AbstractWitsmlObject;
import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlMarshal;
import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlVersionTransformer;

/**
 * <p>Java class for obj_wellbore complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <complexType name="obj_wellbore">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_wellbore" minOccurs="0"/>
 *         <element name="commonData" type="{http://www.witsml.org/schemas/131}cs_commonData" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *       <attribute name="uidWell" type="{http://www.witsml.org/schemas/131}uidString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_wellbore", propOrder = {
    "nameWell",
    "name",
    "parentWellbore",
    "number",
    "suffixAPI",
    "numGovt",
    "statusWellbore",
    "purposeWellbore",
    "typeWellbore",
    "shape",
    "dTimKickoff",
    "achievedTD",
    "mdCurrent",
    "tvdCurrent",
    "mdKickoff",
    "tvdKickoff",
    "mdPlanned",
    "tvdPlanned",
    "mdSubSeaPlanned",
    "tvdSubSeaPlanned",
    "dayTarget",
    "commonData",
    "customData"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObjWellbore extends AbstractWitsmlObject {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String name;
    protected com.hashmapinc.tempus.WitsmlObjects.v1411.RefNameString parentWellbore;
    protected String number;
    protected String suffixAPI;
    protected String numGovt;
    @XmlSchemaType(name = "string")
    protected com.hashmapinc.tempus.WitsmlObjects.v1411.WellStatus statusWellbore;
    @XmlSchemaType(name = "string")
    protected com.hashmapinc.tempus.WitsmlObjects.v1411.WellPurpose purposeWellbore;
    @XmlSchemaType(name = "string")
    protected com.hashmapinc.tempus.WitsmlObjects.v1411.WellboreType typeWellbore;
    @XmlSchemaType(name = "string")
    protected com.hashmapinc.tempus.WitsmlObjects.v1411.WellboreShape shape;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimKickoff;
    protected Boolean achievedTD;
    protected com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord mdCurrent;
    protected com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord tvdCurrent;
    protected com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord mdKickoff;
    protected com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord tvdKickoff;
    protected com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord mdPlanned;
    protected com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord tvdPlanned;
    protected com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord mdSubSeaPlanned;
    protected com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord tvdSubSeaPlanned;
    protected com.hashmapinc.tempus.WitsmlObjects.v20.DimensionlessMeasure dayTarget;
    protected com.hashmapinc.tempus.WitsmlObjects.v1411.CsCommonData commonData;
    protected com.hashmapinc.tempus.WitsmlObjects.v1411.CsCustomData customData;
    @XmlAttribute(name = "uidWell")
    @JsonInclude(JsonInclude.Include.ALWAYS)
    protected String uidWell;
    @XmlAttribute(name = "uid")
    @JsonInclude(JsonInclude.Include.ALWAYS)
    protected String uid;

    /**
     * get the parent uid as a string
     */
    //@Override
    public String getParentUid() {
        return this.uidWell;
    }

    /**
     * Gets the value of the nameWell property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNameWell() {
        return nameWell;
    }

    /**
     * Sets the value of the nameWell property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNameWell(String value) {
        this.nameWell = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parentWellbore property.
     *
     * @return
     *     possible object is
     *     {@link RefNameString }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v1411.RefNameString getParentWellbore() {
        return parentWellbore;
    }

    /**
     * Sets the value of the parentWellbore property.
     *
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *
     */
    public void setParentWellbore(com.hashmapinc.tempus.WitsmlObjects.v1411.RefNameString value) {
        this.parentWellbore = value;
    }

    /**
     * Gets the value of the number property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the suffixAPI property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSuffixAPI() {
        return suffixAPI;
    }

    /**
     * Sets the value of the suffixAPI property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSuffixAPI(String value) {
        this.suffixAPI = value;
    }

    /**
     * Gets the value of the numGovt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumGovt() {
        return numGovt;
    }

    /**
     * Sets the value of the numGovt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumGovt(String value) {
        this.numGovt = value;
    }

    /**
     * Gets the value of the statusWellbore property.
     *
     * @return
     *     possible object is
     *     {@link WellStatus }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v1411.WellStatus getStatusWellbore() {
        return statusWellbore;
    }

    /**
     * Sets the value of the statusWellbore property.
     *
     * @param value
     *     allowed object is
     *     {@link WellStatus }
     *
     */
    public void setStatusWellbore(com.hashmapinc.tempus.WitsmlObjects.v1411.WellStatus value) {
        this.statusWellbore = value;
    }

    /**
     * Gets the value of the purposeWellbore property.
     *
     * @return
     *     possible object is
     *     {@link WellPurpose }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v1411.WellPurpose getPurposeWellbore() {
        return purposeWellbore;
    }

    /**
     * Sets the value of the purposeWellbore property.
     *
     * @param value
     *     allowed object is
     *     {@link WellPurpose }
     *
     */
    public void setPurposeWellbore(com.hashmapinc.tempus.WitsmlObjects.v1411.WellPurpose value) {
        this.purposeWellbore = value;
    }

    /**
     * Gets the value of the typeWellbore property.
     *
     * @return
     *     possible object is
     *     {@link WellboreType }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v1411.WellboreType getTypeWellbore() {
        return typeWellbore;
    }

    /**
     * Sets the value of the typeWellbore property.
     *
     * @param value
     *     allowed object is
     *     {@link WellboreType }
     *
     */
    public void setTypeWellbore(com.hashmapinc.tempus.WitsmlObjects.v1411.WellboreType value) {
        this.typeWellbore = value;
    }

    /**
     * Gets the value of the shape property.
     *
     * @return
     *     possible object is
     *     {@link WellboreShape }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v1411.WellboreShape getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     *
     * @param value
     *     allowed object is
     *     {@link WellboreShape }
     *
     */
    public void setShape(com.hashmapinc.tempus.WitsmlObjects.v1411.WellboreShape value) {
        this.shape = value;
    }

    /**
     * Gets the value of the dTimKickoff property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDTimKickoff() {
        return dTimKickoff;
    }

    /**
     * Sets the value of the dTimKickoff property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDTimKickoff(XMLGregorianCalendar value) {
        this.dTimKickoff = value;
    }

    /**
     * Gets the value of the achievedTD property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isAchievedTD() {
        return achievedTD;
    }

    /**
     * Sets the value of the achievedTD property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAchievedTD(Boolean value) {
        this.achievedTD = value;
    }

    /**
     * Gets the value of the mdCurrent property.
     *
     * @return
     *     possible object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord getMdCurrent() {
        return mdCurrent;
    }

    /**
     * Sets the value of the mdCurrent property.
     *
     * @param value
     *     allowed object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public void setMdCurrent(com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord value) {
        this.mdCurrent = value;
    }

    /**
     * Gets the value of the tvdCurrent property.
     *
     * @return
     *     possible object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord getTvdCurrent() {
        return tvdCurrent;
    }

    /**
     * Sets the value of the tvdCurrent property.
     *
     * @param value
     *     allowed object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public void setTvdCurrent(com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord value) {
        this.tvdCurrent = value;
    }

    /**
     * Gets the value of the mdKickoff property.
     *
     * @return
     *     possible object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord getMdKickoff() {
        return mdKickoff;
    }

    /**
     * Sets the value of the mdKickoff property.
     *
     * @param value
     *     allowed object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public void setMdKickoff(com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord value) {
        this.mdKickoff = value;
    }

    /**
     * Gets the value of the tvdKickoff property.
     *
     * @return
     *     possible object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord getTvdKickoff() {
        return tvdKickoff;
    }

    /**
     * Sets the value of the tvdKickoff property.
     *
     * @param value
     *     allowed object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public void setTvdKickoff(com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord value) {
        this.tvdKickoff = value;
    }

    /**
     * Gets the value of the mdPlanned property.
     *
     * @return
     *     possible object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord getMdPlanned() {
        return mdPlanned;
    }

    /**
     * Sets the value of the mdPlanned property.
     *
     * @param value
     *     allowed object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public void setMdPlanned(com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord value) {
        this.mdPlanned = value;
    }

    /**
     * Gets the value of the tvdPlanned property.
     *
     * @return
     *     possible object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord getTvdPlanned() {
        return tvdPlanned;
    }

    /**
     * Sets the value of the tvdPlanned property.
     *
     * @param value
     *     allowed object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public void setTvdPlanned(com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord value) {
        this.tvdPlanned = value;
    }

    /**
     * Gets the value of the mdSubSeaPlanned property.
     *
     * @return
     *     possible object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord getMdSubSeaPlanned() {
        return mdSubSeaPlanned;
    }

    /**
     * Sets the value of the mdSubSeaPlanned property.
     *
     * @param value
     *     allowed object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public void setMdSubSeaPlanned(com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord value) {
        this.mdSubSeaPlanned = value;
    }

    /**
     * Gets the value of the tvdSubSeaPlanned property.
     *
     * @return
     *     possible object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord getTvdSubSeaPlanned() {
        return tvdSubSeaPlanned;
    }

    /**
     * Sets the value of the tvdSubSeaPlanned property.
     *
     * @param value
     *     allowed object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord }
     *
     */
    public void setTvdSubSeaPlanned(com.hashmapinc.tempus.WitsmlObjects.v20.DepthCoord value) {
        this.tvdSubSeaPlanned = value;
    }

    /**
     * Gets the value of the dayTarget property.
     *
     * @return
     *     possible object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DimensionlessMeasure }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v20.DimensionlessMeasure getDayTarget() {
        return dayTarget;
    }

    /**
     * Sets the value of the dayTarget property.
     *
     * @param value
     *     allowed object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v20.DimensionlessMeasure }
     *
     */
    public void setDayTarget(com.hashmapinc.tempus.WitsmlObjects.v20.DimensionlessMeasure value) {
        this.dayTarget = value;
    }

    /**
     * Gets the value of the commonData property.
     *
     * @return
     *     possible object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v1411.CsCommonData }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsCommonData getCommonData() {
        return commonData;
    }

    /**
     * Sets the value of the commonData property.
     *
     * @param value
     *     allowed object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v1411.CsCommonData }
     *
     */
    public void setCommonData(com.hashmapinc.tempus.WitsmlObjects.v1411.CsCommonData value) {
        this.commonData = value;
    }

    /**
     * Gets the value of the customData property.
     *
     * @return
     *     possible object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v1411.CsCustomData }
     *
     */
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsCustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     *
     * @param value
     *     allowed object is
     *     {@link com.hashmapinc.tempus.WitsmlObjects.v1411.CsCustomData }
     *
     */
    public void setCustomData(com.hashmapinc.tempus.WitsmlObjects.v1411.CsCustomData value) {
        this.customData = value;
    }

    /**
     * Gets the value of the uidWell property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUidWell() {
        return uidWell;
    }

    /**
     * Sets the value of the uidWell property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUidWell(String value) {
        this.uidWell = value;
    }

    /**
     * Gets the value of the uid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    @Override
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

    /**
     * get the version as a string
     */
    @Override
    public String getVersion() {
        return "1.3.1.1";
    }

    /**
     * Gets this object as an xml string in the requested version format.
     *
     * @param version - WITSML version to serialize to
     * @return xml - string value holding the xml string
     */
    @Override
    public String getXMLString(String version) {
        try {
            ObjWellbores wellbores = new ObjWellbores();
            wellbores.addWellbore(this);
            String xml1311 = WitsmlMarshal.serialize(wellbores);
            if ("1.4.1.1".equals(version)) {
                return (new WitsmlVersionTransformer()).convertVersion(xml1311);
            } else if ("1.3.1.1".equals(version)) {
                return xml1311;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Gets this object as an json string in the requested version format.
     *
     * @param version - WITSML version to serialize to
     * @return json - String value holding the json string
     */
    @Override
    public String getJSONString(String version) {
        try {
            if ("1.4.1.1".equals(version)) {
                // convert to 1411 pojo and parse as json
                String xml1411 = this.getXMLString("1.4.1.1");
                com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbores wellbores = WitsmlMarshal.deserialize(xml1411,
                        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbores.class);
                return WitsmlMarshal.serializeToJSON(wellbores.getWellbore().get(0));
            } else if ("1.3.1.1".equals(version)) {
                return WitsmlMarshal.serializeToJSON(this);
            } else {
                return null; // unsupported version
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
