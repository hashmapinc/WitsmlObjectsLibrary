package com.hashmapinc.tempus.WitsmlObjects.v1311;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the datums associated with elevation, vertical depth 
 * 			and measured depth coordinates within the context of a well. 
 * 
 * <p>Java class for cs_wellDatum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_wellDatum">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="code" type="{http://www.witsml.org/schemas/131}ElevCodeEnum" minOccurs="0"/>
 *         <element name="datumName" type="{http://www.witsml.org/schemas/131}wellKnownNameStruct" minOccurs="0"/>
 *         <element name="kind" type="{http://www.witsml.org/schemas/131}kindString" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="wellbore" type="{http://www.witsml.org/schemas/131}cs_refWellWellbore" minOccurs="0"/>
 *         <element name="rig" type="{http://www.witsml.org/schemas/131}cs_refWellWellboreRig" minOccurs="0"/>
 *         <element name="elevation" type="{http://www.witsml.org/schemas/131}wellElevationCoord" minOccurs="0"/>
 *         <element name="measuredDepth" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="comment" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *       <attribute name="defaultMeasuredDepth" type="{http://www.witsml.org/schemas/131}logicalBoolean" />
 *       <attribute name="defaultVerticalDepth" type="{http://www.witsml.org/schemas/131}logicalBoolean" />
 *       <attribute name="defaultElevation" type="{http://www.witsml.org/schemas/131}logicalBoolean" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_wellDatum", propOrder = {
    "name",
    "code",
    "datumName",
    "kind",
    "wellbore",
    "rig",
    "elevation",
    "measuredDepth",
    "comment"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CsWellDatum {

    protected String name;
    @XmlSchemaType(name = "string")
    protected String code;
    protected WellKnownNameStruct datumName;
    protected List<String> kind;
    protected CsRefWellWellbore wellbore;
    protected CsRefWellWellboreRig rig;
    protected WellElevationCoord elevation;
    protected MeasuredDepthCoord measuredDepth;
    protected String comment;
    @XmlAttribute(name = "defaultMeasuredDepth")
    @JsonInclude(JsonInclude.Include.ALWAYS)
    protected Boolean defaultMeasuredDepth;
    @XmlAttribute(name = "defaultVerticalDepth")
    @JsonInclude(JsonInclude.Include.ALWAYS)
    protected Boolean defaultVerticalDepth;
    @XmlAttribute(name = "defaultElevation")
    @JsonInclude(JsonInclude.Include.ALWAYS)
    protected Boolean defaultElevation;
    @XmlAttribute(name = "uid")
    @JsonInclude(JsonInclude.Include.ALWAYS)
    protected String uid;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the datumName property.
     * 
     * @return
     *     possible object is
     *     {@link WellKnownNameStruct }
     *     
     */
    public WellKnownNameStruct getDatumName() {
        return datumName;
    }

    /**
     * Sets the value of the datumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellKnownNameStruct }
     *     
     */
    public void setDatumName(WellKnownNameStruct value) {
        this.datumName = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kind property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getKind().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKind() {
        if (kind == null) {
            kind = new ArrayList<String>();
        }
        return this.kind;
    }

    public void setKind(List<String> kindList) {
        this.kind = kindList;
    }

    /**
     * Gets the value of the wellbore property.
     * 
     * @return
     *     possible object is
     *     {@link CsRefWellWellbore }
     *     
     */
    public CsRefWellWellbore getWellbore() {
        return wellbore;
    }

    /**
     * Sets the value of the wellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsRefWellWellbore }
     *     
     */
    public void setWellbore(CsRefWellWellbore value) {
        this.wellbore = value;
    }

    /**
     * Gets the value of the rig property.
     * 
     * @return
     *     possible object is
     *     {@link CsRefWellWellboreRig }
     *     
     */
    public CsRefWellWellboreRig getRig() {
        return rig;
    }

    /**
     * Sets the value of the rig property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsRefWellWellboreRig }
     *     
     */
    public void setRig(CsRefWellWellboreRig value) {
        this.rig = value;
    }

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link WellElevationCoord }
     *     
     */
    public WellElevationCoord getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellElevationCoord }
     *     
     */
    public void setElevation(WellElevationCoord value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the measuredDepth property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMeasuredDepth() {
        return measuredDepth;
    }

    /**
     * Sets the value of the measuredDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMeasuredDepth(MeasuredDepthCoord value) {
        this.measuredDepth = value;
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
     * Gets the value of the defaultMeasuredDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultMeasuredDepth() {
        return defaultMeasuredDepth;
    }

    /**
     * Sets the value of the defaultMeasuredDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultMeasuredDepth(Boolean value) {
        this.defaultMeasuredDepth = value;
    }

    /**
     * Gets the value of the defaultVerticalDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultVerticalDepth() {
        return defaultVerticalDepth;
    }

    /**
     * Sets the value of the defaultVerticalDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultVerticalDepth(Boolean value) {
        this.defaultVerticalDepth = value;
    }

    /**
     * Gets the value of the defaultElevation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultElevation() {
        return defaultElevation;
    }

    /**
     * Sets the value of the defaultElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultElevation(Boolean value) {
        this.defaultElevation = value;
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




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellDatum to1411CsWellDatum() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellDatum datum = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellDatum(); // datum, I hardly know 'em!

        // non complex objects
        datum.setName(this.getName());
        datum.setKind(this.getKind());
        datum.setComment(this.getComment());
        datum.setUid(this.getUid());
        datum.setCode(this.getCode());

        // complex objects
        // datum name
        if (null != this.getDatumName())
            datum.setDatumName(this.getDatumName().to1411WellKnownNameStruct());

        // wellbore
        if (null != this.getWellbore())
            datum.setDatumName(this.getDatumName().to1411WellKnownNameStruct());

        // wellbore
        if (null != this.getWellbore())
            datum.setWellbore(this.getWellbore().to1411CsRefWellWellbore());

        // rig
        if (null != this.getRig())
            datum.setRig(this.getRig().to1411CsRefWellWellboreRig());

        // elevation
        if (null != this.getElevation())
            datum.setElevation(this.getElevation().to1411WellElevationCoord());

        // measured depth
        if (null != this.getMeasuredDepth())
            datum.setMeasuredDepth(this.getMeasuredDepth().to1411MeasuredDepthCoord());

        return datum;
    }
    //=========================================================================

}
