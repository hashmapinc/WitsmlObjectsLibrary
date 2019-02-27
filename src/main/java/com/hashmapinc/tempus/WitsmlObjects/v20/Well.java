


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to capture the general information about a well. Sometimes  called a "well header". Contains all information that is the same for all wellbores (sidetracks). 
 * 
 * <p>Java class for Well complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="Well">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="NameLegal" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="NumLicense" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="NumGovt" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="DTimLicense" type="{http://www.energistics.org/energyml/data/commonv2}TimeStamp" minOccurs="0"/>
 *         <element name="Field" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="Country" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="State" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="County" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="Region" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="District" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="Block" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="TimeZone" type="{http://www.energistics.org/energyml/data/commonv2}TimeZone" minOccurs="0"/>
 *         <element name="Operator" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="OperatorDiv" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="OriginalOperator" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="PcInterest" type="{http://www.energistics.org/energyml/data/commonv2}DimensionlessMeasure" minOccurs="0"/>
 *         <element name="NumAPI" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="StatusWell" type="{http://www.energistics.org/energyml/data/commonv2}WellStatus" minOccurs="0"/>
 *         <element name="PurposeWell" type="{http://www.energistics.org/energyml/data/witsmlv2}WellPurpose" minOccurs="0"/>
 *         <element name="FluidWell" type="{http://www.energistics.org/energyml/data/witsmlv2}WellFluid" minOccurs="0"/>
 *         <element name="DirectionWell" type="{http://www.energistics.org/energyml/data/witsmlv2}WellDirection" minOccurs="0"/>
 *         <element name="DTimSpud" type="{http://www.energistics.org/energyml/data/commonv2}TimeStamp" minOccurs="0"/>
 *         <element name="DTimPa" type="{http://www.energistics.org/energyml/data/commonv2}TimeStamp" minOccurs="0"/>
 *         <element name="WaterDepth" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *         <element name="GeographicLocationWGS84" type="{http://www.energistics.org/energyml/data/witsmlv2}GeodeticWellLocation" minOccurs="0"/>
 *         <element name="WellLocation" type="{http://www.energistics.org/energyml/data/witsmlv2}AbstractWellLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="WellPublicLandSurveySystemLocation" type="{http://www.energistics.org/energyml/data/witsmlv2}PublicLandSurveySystem" minOccurs="0"/>
 *         <element name="ReferencePoint" type="{http://www.energistics.org/energyml/data/witsmlv2}ReferencePoint" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="WellheadElevation" type="{http://www.energistics.org/energyml/data/witsmlv2}WellElevationCoord" minOccurs="0"/>
 *         <element name="WellDatum" type="{http://www.energistics.org/energyml/data/witsmlv2}WellDatum" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GroundElevation" type="{http://www.energistics.org/energyml/data/witsmlv2}WellElevationCoord" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@SuppressWarnings("ALL")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Well", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "nameLegal",
    "numLicense",
    "numGovt",
    "dTimLicense",
    "field",
    "country",
    "state",
    "county",
    "region",
    "district",
    "block",
    "timeZone",
    "operator",
    "operatorDiv",
    "originalOperator",
    "pcInterest",
    "numAPI",
    "statusWell",
    "purposeWell",
    "fluidWell",
    "directionWell",
    "dTimSpud",
    "dTimPa",
    "waterDepth",
    "geographicLocationWGS84",
    "wellLocation",
    "wellPublicLandSurveySystemLocation",
    "referencePoint",
    "wellheadElevation",
    "wellDatum",
    "groundElevation"
})
public class Well
    extends AbstractObject
{

    @XmlElement(name = "NameLegal")
    private String nameLegal;
    @XmlElement(name = "NumLicense")
    private String numLicense;
    @XmlElement(name = "NumGovt")
    protected String numGovt;
    @XmlElement(name = "DTimLicense")
    private String dTimLicense;
    @XmlElement(name = "Field")
    protected String field;
    @XmlElement(name = "Country")
    private String country;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "County")
    private String county;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "District")
    private String district;
    @XmlElement(name = "Block")
    protected String block;
    @XmlElement(name = "TimeZone")
    private String timeZone;
    @XmlElement(name = "Operator")
    protected String operator;
    @XmlElement(name = "OperatorDiv")
    private String operatorDiv;
    @XmlElement(name = "OriginalOperator")
    private String originalOperator;
    @XmlElement(name = "PcInterest")
    private DimensionlessMeasure pcInterest;
    @XmlElement(name = "NumAPI")
    private String numAPI;
    @XmlElement(name = "StatusWell")
    @XmlSchemaType(name = "string")
    private String statusWell;
    @XmlElement(name = "PurposeWell")
    @XmlSchemaType(name = "string")
    private String purposeWell;
    @XmlElement(name = "FluidWell")
    @XmlSchemaType(name = "string")
    private String fluidWell;
    @XmlElement(name = "DirectionWell")
    @XmlSchemaType(name = "string")
    private String directionWell;
    @XmlElement(name = "DTimSpud")
    private String dTimSpud;
    @XmlElement(name = "DTimPa")
    private String dTimPa;
    @XmlElement(name = "WaterDepth")
    protected DimensionlessMeasure waterDepth;
    @XmlElement(name = "GeographicLocationWGS84")
    private GeodeticWellLocation geographicLocationWGS84;
    @XmlElement(name = "WellLocation")
    private List<AbstractWellLocation> wellLocation;
    @XmlElement(name = "WellPublicLandSurveySystemLocation")
    private PublicLandSurveySystem wellPublicLandSurveySystemLocation;
    @XmlElement(name = "ReferencePoint")
    private List<ReferencePoint> referencePoint;
    @XmlElement(name = "WellheadElevation")
    private WellElevationCoord wellheadElevation;
    @XmlElement(name = "WellDatum")
    protected List<WellDatum> wellDatum;
    @XmlElement(name = "GroundElevation")
    private WellElevationCoord groundElevation;

    /**
     * Gets the value of the nameLegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLegal() {
        return nameLegal;
    }

    /**
     * Sets the value of the nameLegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLegal(String value) {
        this.nameLegal = value;
    }

    /**
     * Gets the value of the numLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumLicense() {
        return numLicense;
    }

    /**
     * Sets the value of the numLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumLicense(String value) {
        this.numLicense = value;
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
     * Gets the value of the dTimLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTimLicense() {
        return dTimLicense;
    }

    /**
     * Sets the value of the dTimLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTimLicense(String value) {
        this.dTimLicense = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
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
     * Gets the value of the operatorDiv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorDiv() {
        return operatorDiv;
    }

    /**
     * Sets the value of the operatorDiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorDiv(String value) {
        this.operatorDiv = value;
    }

    /**
     * Gets the value of the originalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalOperator() {
        return originalOperator;
    }

    /**
     * Sets the value of the originalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalOperator(String value) {
        this.originalOperator = value;
    }

    /**
     * Gets the value of the pcInterest property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionlessMeasure }
     *     
     */
    public DimensionlessMeasure getPcInterest() {
        return pcInterest;
    }

    /**
     * Sets the value of the pcInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionlessMeasure }
     *     
     */
    public void setPcInterest(DimensionlessMeasure value) {
        this.pcInterest = value;
    }

    /**
     * Gets the value of the numAPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAPI() {
        return numAPI;
    }

    /**
     * Sets the value of the numAPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAPI(String value) {
        this.numAPI = value;
    }

    /**
     * Gets the value of the statusWell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusWell() {
        return statusWell;
    }

    /**
     * Sets the value of the statusWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusWell(String value) {
        this.statusWell = value;
    }

    /**
     * Gets the value of the purposeWell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeWell() {
        return purposeWell;
    }

    /**
     * Sets the value of the purposeWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeWell(String value) {
        this.purposeWell = value;
    }

    /**
     * Gets the value of the fluidWell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFluidWell() {
        return fluidWell;
    }

    /**
     * Sets the value of the fluidWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFluidWell(String value) {
        this.fluidWell = value;
    }

    /**
     * Gets the value of the directionWell property.
     * 
     * @return
     *     possible object is
     *     {@link WellDirection }
     *     
     */
    public String getDirectionWell() {
        return directionWell;
    }

    /**
     * Sets the value of the directionWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellDirection }
     *     
     */
    public void setDirectionWell(String value) {
        this.directionWell = value;
    }

    /**
     * Gets the value of the dTimSpud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTimSpud() {
        return dTimSpud;
    }

    /**
     * Sets the value of the dTimSpud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTimSpud(String value) {
        this.dTimSpud = value;
    }

    /**
     * Gets the value of the dTimPa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTimPa() {
        return dTimPa;
    }

    /**
     * Sets the value of the dTimPa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTimPa(String value) {
        this.dTimPa = value;
    }

    /**
     * Gets the value of the waterDepth property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public DimensionlessMeasure getWaterDepth() {
        return waterDepth;
    }

    /**
     * Sets the value of the waterDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setWaterDepth(DimensionlessMeasure value) {
        this.waterDepth = value;
    }

    /**
     * Gets the value of the geographicLocationWGS84 property.
     * 
     * @return
     *     possible object is
     *     {@link GeodeticWellLocation }
     *     
     */
    public GeodeticWellLocation getGeographicLocationWGS84() {
        return geographicLocationWGS84;
    }

    /**
     * Sets the value of the geographicLocationWGS84 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeodeticWellLocation }
     *     
     */
    public void setGeographicLocationWGS84(GeodeticWellLocation value) {
        this.geographicLocationWGS84 = value;
    }

    /**
     * Gets the value of the wellLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWellLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractWellLocation }
     * 
     * 
     */
    public List<AbstractWellLocation> getWellLocation() {
        if (wellLocation == null) {
            wellLocation = new ArrayList<AbstractWellLocation>();
        }
        return this.wellLocation;
    }

    /**
     * Gets the value of the wellPublicLandSurveySystemLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PublicLandSurveySystem }
     *     
     */
    public PublicLandSurveySystem getWellPublicLandSurveySystemLocation() {
        return wellPublicLandSurveySystemLocation;
    }

    /**
     * Sets the value of the wellPublicLandSurveySystemLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicLandSurveySystem }
     *     
     */
    public void setWellPublicLandSurveySystemLocation(PublicLandSurveySystem value) {
        this.wellPublicLandSurveySystemLocation = value;
    }

    /**
     * Gets the value of the referencePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencePoint }
     * 
     * 
     */
    public List<ReferencePoint> getReferencePoint() {
        if (referencePoint == null) {
            referencePoint = new ArrayList<ReferencePoint>();
        }
        return this.referencePoint;
    }

    /**
     * Gets the value of the wellheadElevation property.
     * 
     * @return
     *     possible object is
     *     {@link WellElevationCoord }
     *     
     */
    public WellElevationCoord getWellheadElevation() {
        return wellheadElevation;
    }

    /**
     * Sets the value of the wellheadElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellElevationCoord }
     *     
     */
    public void setWellheadElevation(WellElevationCoord value) {
        this.wellheadElevation = value;
    }

    /**
     * Gets the value of the wellDatum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellDatum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWellDatum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WellDatum }
     * 
     * 
     */
    public List<WellDatum> getWellDatum() {
        if (wellDatum == null) {
            wellDatum = new ArrayList<WellDatum>();
        }
        return this.wellDatum;
    }

    /**
     * Gets the value of the groundElevation property.
     * 
     * @return
     *     possible object is
     *     {@link WellElevationCoord }
     *     
     */
    public WellElevationCoord getGroundElevation() {
        return groundElevation;
    }

    /**
     * Sets the value of the groundElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellElevationCoord }
     *     
     */
    public void setGroundElevation(WellElevationCoord value) {
        this.groundElevation = value;
    }

}
