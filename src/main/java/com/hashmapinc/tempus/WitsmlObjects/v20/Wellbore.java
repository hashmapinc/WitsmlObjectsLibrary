


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to capture the general information about a wellbore. This information is sometimes called a "wellbore header". A wellbore represents the path from surface to a unique bottomhole location. The wellbore object is uniquely identified within the context of one well object.
 *
 * <p>Java class for Wellbore complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * <complexType name="Wellbore">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="Number" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="SuffixAPI" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="NumGovt" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="StatusWellbore" type="{http://www.energistics.org/energyml/data/commonv2}WellStatus" minOccurs="0"/>
 *         <element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PurposeWellbore" type="{http://www.energistics.org/energyml/data/witsmlv2}WellPurpose" minOccurs="0"/>
 *         <element name="TypeWellbore" type="{http://www.energistics.org/energyml/data/witsmlv2}WellboreType" minOccurs="0"/>
 *         <element name="Shape" type="{http://www.energistics.org/energyml/data/witsmlv2}WellboreShape" minOccurs="0"/>
 *         <element name="DTimKickoff" type="{http://www.energistics.org/energyml/data/commonv2}TimeStamp" minOccurs="0"/>
 *         <element name="AchievedTD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Md" type="{http://www.energistics.org/energyml/data/witsmlv2}DepthCoord" minOccurs="0"/>
 *         <element name="Tvd" type="{http://www.energistics.org/energyml/data/witsmlv2}WellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="MdBit" type="{http://www.energistics.org/energyml/data/witsmlv2}DepthCoord" minOccurs="0"/>
 *         <element name="TvdBit" type="{http://www.energistics.org/energyml/data/witsmlv2}WellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="MdKickoff" type="{http://www.energistics.org/energyml/data/witsmlv2}DepthCoord" minOccurs="0"/>
 *         <element name="TvdKickoff" type="{http://www.energistics.org/energyml/data/witsmlv2}WellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="MdPlanned" type="{http://www.energistics.org/energyml/data/witsmlv2}DepthCoord" minOccurs="0"/>
 *         <element name="TvdPlanned" type="{http://www.energistics.org/energyml/data/witsmlv2}WellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="MdSubSeaPlanned" type="{http://www.energistics.org/energyml/data/witsmlv2}DepthCoord" minOccurs="0"/>
 *         <element name="TvdSubSeaPlanned" type="{http://www.energistics.org/energyml/data/witsmlv2}WellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="DayTarget" type="{http://www.energistics.org/energyml/data/commonv2}TimeMeasure" minOccurs="0"/>
 *         <element name="Well" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference"/>
 *         <element name="ParentWellbore" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 *
 *
 */
@SuppressWarnings("unused")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wellbore", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
        "number",
        "suffixAPI",
        "numGovt",
        "statusWellbore",
        "isActive",
        "purposeWellbore",
        "typeWellbore",
        "shape",
        "dTimKickoff",
        "achievedTD",
        "md",
        "tvd",
        "mdBit",
        "tvdBit",
        "mdKickoff",
        "tvdKickoff",
        "mdPlanned",
        "tvdPlanned",
        "mdSubSeaPlanned",
        "tvdSubSeaPlanned",
        "dayTarget",
        "well",
        "parentWellbore"
})
public class Wellbore
        extends AbstractObject
{

    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "SuffixAPI")
    private String suffixAPI;
    @XmlElement(name = "NumGovt")
    protected String numGovt;
    @XmlElement(name = "StatusWellbore")
    private String statusWellbore;
    @XmlElement(name = "IsActive")
    private Boolean isActive;
    @XmlElement(name = "PurposeWellbore")
    private String purposeWellbore;
    @XmlElement(name = "TypeWellbore")
    private String typeWellbore;
    @XmlElement(name = "Shape")
    private String shape;
    @XmlElement(name = "DTimKickoff")
    private String dTimKickoff;
    @XmlElement(name = "AchievedTD")
    private Boolean achievedTD;
    @XmlElement(name = "Md")
    protected DepthCoord md;
    @XmlElement(name = "Tvd")
    protected DepthCoord tvd;
    @XmlElement(name = "MdBit")
    protected DepthCoord mdBit;
    @XmlElement(name = "TvdBit")
    private DepthCoord tvdBit;
    @XmlElement(name = "MdKickoff")
    protected DepthCoord mdKickoff;
    @XmlElement(name = "TvdKickoff")
    protected DepthCoord tvdKickoff;
    @XmlElement(name = "MdPlanned")
    protected DepthCoord mdPlanned;
    @XmlElement(name = "TvdPlanned")
    private DepthCoord tvdPlanned;
    @XmlElement(name = "MdSubSeaPlanned")
    private DepthCoord mdSubSeaPlanned;
    @XmlElement(name = "TvdSubSeaPlanned")
    private DepthCoord tvdSubSeaPlanned;
    @XmlElement(name = "DayTarget")
    private DimensionlessMeasure dayTarget;
    @XmlElement(name = "Well", required = true)
    protected DataObjectReference well;
    @XmlElement(name = "ParentWellbore")
    protected DataObjectReference parentWellbore;

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
    public String getStatusWellbore() {
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
    public void setStatusWellbore(String value) {
        this.statusWellbore = value;
    }

    /**
     * Gets the value of the isActive property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the purposeWellbore property.
     *
     * @return
     *     possible object is
     *     {@link WellPurpose }
     *
     */
    public String getPurposeWellbore() {
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
    public void setPurposeWellbore(String value) {
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
    public String getTypeWellbore() {
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
    public void setTypeWellbore(String value) {
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
    public String getShape() {
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
    public void setShape(String value) {
        this.shape = value;
    }

    /**
     * Gets the value of the dTimKickoff property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDTimKickoff() {
        return dTimKickoff;
    }

    /**
     * Sets the value of the dTimKickoff property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDTimKickoff(String value) {
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
     * Gets the value of the md property.
     *
     * @return
     *     possible object is
     *     {@link DepthCoord }
     *
     */
    public DepthCoord getMd() {
        return md;
    }

    /**
     * Sets the value of the md property.
     *
     * @param value
     *     allowed object is
     *     {@link DepthCoord }
     *
     */
    public void setMd(DepthCoord value) {
        this.md = value;
    }

    /**
     * Gets the value of the tvd property.
     *
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *
     */
    public DepthCoord getTvd() {
        return tvd;
    }

    /**
     * Sets the value of the tvd property.
     *
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *
     */
    public void setTvd(DepthCoord value) {
        this.tvd = value;
    }

    /**
     * Gets the value of the mdBit property.
     *
     * @return
     *     possible object is
     *     {@link DepthCoord }
     *
     */
    public DepthCoord getMdBit() {
        return mdBit;
    }

    /**
     * Sets the value of the mdBit property.
     *
     * @param value
     *     allowed object is
     *     {@link DepthCoord }
     *
     */
    public void setMdBit(DepthCoord value) {
        this.mdBit = value;
    }

    /**
     * Gets the value of the tvdBit property.
     *
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *
     */
    public DepthCoord getTvdBit() {
        return tvdBit;
    }

    /**
     * Sets the value of the tvdBit property.
     *
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *
     */
    public void setTvdBit(DepthCoord value) {
        this.tvdBit = value;
    }

    /**
     * Gets the value of the mdKickoff property.
     *
     * @return
     *     possible object is
     *     {@link DepthCoord }
     *
     */
    public DepthCoord getMdKickoff() {
        return mdKickoff;
    }

    /**
     * Sets the value of the mdKickoff property.
     *
     * @param value
     *     allowed object is
     *     {@link DepthCoord }
     *
     */
    public void setMdKickoff(DepthCoord value) {
        this.mdKickoff = value;
    }

    /**
     * Gets the value of the tvdKickoff property.
     *
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *
     */
    public DepthCoord getTvdKickoff() {
        return tvdKickoff;
    }

    /**
     * Sets the value of the tvdKickoff property.
     *
     * @param value
     *     allowed object is
     *     {@link DepthCoord }
     *
     */
    public void setTvdKickoff(DepthCoord value) {
        this.tvdKickoff = value;
    }

    /**
     * Gets the value of the mdPlanned property.
     *
     * @return
     *     possible object is
     *     {@link DepthCoord }
     *
     */
    public DepthCoord getMdPlanned() {
        return mdPlanned;
    }

    /**
     * Sets the value of the mdPlanned property.
     *
     * @param value
     *     allowed object is
     *     {@link DepthCoord }
     *
     */
    public void setMdPlanned(DepthCoord value) {
        this.mdPlanned = value;
    }

    /**
     * Gets the value of the tvdPlanned property.
     *
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *
     */
    public DepthCoord getTvdPlanned() {
        return tvdPlanned;
    }

    /**
     * Sets the value of the tvdPlanned property.
     *
     * @param value
     *     allowed object is
     *     {@link DepthCoord }
     *
     */
    public void setTvdPlanned(DepthCoord value) {
        this.tvdPlanned = value;
    }

    /**
     * Gets the value of the mdSubSeaPlanned property.
     *
     * @return
     *     possible object is
     *     {@link DepthCoord }
     *
     */
    public DepthCoord getMdSubSeaPlanned() {
        return mdSubSeaPlanned;
    }

    /**
     * Sets the value of the mdSubSeaPlanned property.
     *
     * @param value
     *     allowed object is
     *     {@link DepthCoord }
     *
     */
    public void setMdSubSeaPlanned(DepthCoord value) {
        this.mdSubSeaPlanned = value;
    }

    /**
     * Gets the value of the tvdSubSeaPlanned property.
     *
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *
     */
    public DepthCoord getTvdSubSeaPlanned() {
        return tvdSubSeaPlanned;
    }

    /**
     * Sets the value of the tvdSubSeaPlanned property.
     *
     * @param value
     *     allowed object is
     *     {@link DepthCoord }
     *
     */
    public void setTvdSubSeaPlanned(DepthCoord value) {
        this.tvdSubSeaPlanned = value;
    }

    /**
     * Gets the value of the dayTarget property.
     *
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *
     */
    public DimensionlessMeasure getDayTarget() {
        return dayTarget;
    }

    /**
     * Sets the value of the dayTarget property.
     *
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *
     */
    public void setDayTarget(DimensionlessMeasure value) {
        this.dayTarget = value;
    }

    /**
     * Gets the value of the well property.
     *
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *
     */
    public DataObjectReference getWell() {
        return well;
    }

    /**
     * Sets the value of the well property.
     *
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *
     */
    public void setWell(DataObjectReference value) {
        this.well = value;
    }

    /**
     * Gets the value of the parentWellbore property.
     *
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *
     */
    public DataObjectReference getParentWellbore() {
        return parentWellbore;
    }

    /**
     * Sets the value of the parentWellbore property.
     *
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *
     */
    public void setParentWellbore(DataObjectReference value) {
        this.parentWellbore = value;
    }

}