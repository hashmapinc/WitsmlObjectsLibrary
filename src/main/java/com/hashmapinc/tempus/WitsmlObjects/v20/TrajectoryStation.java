


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Trajectory Station Component Schema
 * 
 * <p>Java class for TrajectoryStation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="TrajectoryStation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ManuallyEntered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Target" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="DTimStn" type="{http://www.energistics.org/energyml/data/commonv2}TimeStamp" minOccurs="0"/>
 *         <element name="TypeTrajStation" type="{http://www.energistics.org/energyml/data/witsmlv2}TrajStationType"/>
 *         <element name="TypeSurveyTool" type="{http://www.energistics.org/energyml/data/witsmlv2}TypeSurveyTool" minOccurs="0"/>
 *         <element name="CalcAlgorithm" type="{http://www.energistics.org/energyml/data/witsmlv2}TrajStnCalcAlgorithm" minOccurs="0"/>
 *         <element name="Md" type="{http://www.energistics.org/energyml/data/witsmlv2}DepthCoord"/>
 *         <element name="Tvd" type="{http://www.energistics.org/energyml/data/witsmlv2}WellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="Incl" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="Azi" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="Mtf" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="Gtf" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="DispNs" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *         <element name="DispEw" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *         <element name="VertSect" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *         <element name="Dls" type="{http://www.energistics.org/energyml/data/commonv2}AnglePerLengthMeasure" minOccurs="0"/>
 *         <element name="RateTurn" type="{http://www.energistics.org/energyml/data/commonv2}AnglePerLengthMeasure" minOccurs="0"/>
 *         <element name="RateBuild" type="{http://www.energistics.org/energyml/data/commonv2}AnglePerLengthMeasure" minOccurs="0"/>
 *         <element name="MdDelta" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *         <element name="TvdDelta" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *         <element name="GravTotalUncert" type="{http://www.energistics.org/energyml/data/commonv2}LinearAccelerationMeasure" minOccurs="0"/>
 *         <element name="DipAngleUncert" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="MagTotalUncert" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityMeasure" minOccurs="0"/>
 *         <element name="GravAccelCorUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="MagXAxialCorUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SagCorUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="MagDrlstrCorUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="InfieldRefCorUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="InterpolatedInfieldRefCorUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="InHoleRefCorUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AxialMagInterferenceCorUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="CosagCorUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="MSACorUsed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="GravTotalFieldReference" type="{http://www.energistics.org/energyml/data/commonv2}LinearAccelerationMeasure" minOccurs="0"/>
 *         <element name="MagTotalFieldReference" type="{http://www.energistics.org/energyml/data/commonv2}MagneticFluxDensityMeasure" minOccurs="0"/>
 *         <element name="MagDipAngleReference" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="MagModelUsed" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="MagModelValid" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="GeoModelUsed" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="StatusTrajStation" type="{http://www.energistics.org/energyml/data/witsmlv2}TrajStationStatus" minOccurs="0"/>
 *         <element name="ExtensionNameValue" type="{http://www.energistics.org/energyml/data/commonv2}ExtensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Valid" type="{http://www.energistics.org/energyml/data/witsmlv2}StnTrajValid" minOccurs="0"/>
 *         <element name="MatrixCov" type="{http://www.energistics.org/energyml/data/witsmlv2}StnTrajMatrixCov" minOccurs="0"/>
 *         <element name="Location" type="{http://www.energistics.org/energyml/data/witsmlv2}AbstractWellLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SourceStation" type="{http://www.energistics.org/energyml/data/witsmlv2}RefWellboreTrajectoryStation" minOccurs="0"/>
 *         <element name="RawData" type="{http://www.energistics.org/energyml/data/witsmlv2}StnTrajRawData" minOccurs="0"/>
 *         <element name="CorUsed" type="{http://www.energistics.org/energyml/data/witsmlv2}StnTrajCorUsed" minOccurs="0"/>
 *         <element name="IscwsaToolErrorModel" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="uid" use="required" type="{http://www.energistics.org/energyml/data/commonv2}String64" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrajectoryStation", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "manuallyEntered",
    "target",
    "dTimStn",
    "typeTrajStation",
    "typeSurveyTool",
    "calcAlgorithm",
    "md",
    "tvd",
    "incl",
    "azi",
    "mtf",
    "gtf",
    "dispNs",
    "dispEw",
    "vertSect",
    "dls",
    "rateTurn",
    "rateBuild",
    "mdDelta",
    "tvdDelta",
    "gravTotalUncert",
    "dipAngleUncert",
    "magTotalUncert",
    "gravAccelCorUsed",
    "magXAxialCorUsed",
    "sagCorUsed",
    "magDrlstrCorUsed",
    "infieldRefCorUsed",
    "interpolatedInfieldRefCorUsed",
    "inHoleRefCorUsed",
    "axialMagInterferenceCorUsed",
    "cosagCorUsed",
    "msaCorUsed",
    "gravTotalFieldReference",
    "magTotalFieldReference",
    "magDipAngleReference",
    "magModelUsed",
    "magModelValid",
    "geoModelUsed",
    "statusTrajStation",
    "extensionNameValue",
    "valid",
    "matrixCov",
    "location",
    "sourceStation",
    "rawData",
    "corUsed",
    "iscwsaToolErrorModel"
})
public class TrajectoryStation {

    @XmlElement(name = "ManuallyEntered")
    protected Boolean manuallyEntered;
    @XmlElement(name = "Target")
    protected String target;
    @XmlElement(name = "DTimStn")
    protected String dTimStn;
    @XmlElement(name = "TypeTrajStation", required = true)
    @XmlSchemaType(name = "string")
    protected TrajStationType typeTrajStation;
    @XmlElement(name = "TypeSurveyTool")
    @XmlSchemaType(name = "string")
    protected TypeSurveyTool typeSurveyTool;
    @XmlElement(name = "CalcAlgorithm")
    @XmlSchemaType(name = "string")
    protected TrajStnCalcAlgorithm calcAlgorithm;
    @XmlElement(name = "Md", required = true)
    protected DepthCoord md;
    @XmlElement(name = "Tvd")
    protected WellVerticalDepthCoord tvd;
    @XmlElement(name = "Incl")
    protected PlaneAngleMeasure incl;
    @XmlElement(name = "Azi")
    protected PlaneAngleMeasure azi;
    @XmlElement(name = "Mtf")
    protected PlaneAngleMeasure mtf;
    @XmlElement(name = "Gtf")
    protected PlaneAngleMeasure gtf;
    @XmlElement(name = "DispNs")
    protected LengthMeasure dispNs;
    @XmlElement(name = "DispEw")
    protected LengthMeasure dispEw;
    @XmlElement(name = "VertSect")
    protected LengthMeasure vertSect;
    @XmlElement(name = "Dls")
    protected AnglePerLengthMeasure dls;
    @XmlElement(name = "RateTurn")
    protected AnglePerLengthMeasure rateTurn;
    @XmlElement(name = "RateBuild")
    protected AnglePerLengthMeasure rateBuild;
    @XmlElement(name = "MdDelta")
    protected LengthMeasure mdDelta;
    @XmlElement(name = "TvdDelta")
    protected LengthMeasure tvdDelta;
    @XmlElement(name = "GravTotalUncert")
    protected LinearAccelerationMeasure gravTotalUncert;
    @XmlElement(name = "DipAngleUncert")
    protected PlaneAngleMeasure dipAngleUncert;
    @XmlElement(name = "MagTotalUncert")
    protected MagneticFluxDensityMeasure magTotalUncert;
    @XmlElement(name = "GravAccelCorUsed")
    protected Boolean gravAccelCorUsed;
    @XmlElement(name = "MagXAxialCorUsed")
    protected Boolean magXAxialCorUsed;
    @XmlElement(name = "SagCorUsed")
    protected Boolean sagCorUsed;
    @XmlElement(name = "MagDrlstrCorUsed")
    protected Boolean magDrlstrCorUsed;
    @XmlElement(name = "InfieldRefCorUsed")
    protected Boolean infieldRefCorUsed;
    @XmlElement(name = "InterpolatedInfieldRefCorUsed")
    protected Boolean interpolatedInfieldRefCorUsed;
    @XmlElement(name = "InHoleRefCorUsed")
    protected Boolean inHoleRefCorUsed;
    @XmlElement(name = "AxialMagInterferenceCorUsed")
    protected Boolean axialMagInterferenceCorUsed;
    @XmlElement(name = "CosagCorUsed")
    protected Boolean cosagCorUsed;
    @XmlElement(name = "MSACorUsed")
    protected Boolean msaCorUsed;
    @XmlElement(name = "GravTotalFieldReference")
    protected LinearAccelerationMeasure gravTotalFieldReference;
    @XmlElement(name = "MagTotalFieldReference")
    protected MagneticFluxDensityMeasure magTotalFieldReference;
    @XmlElement(name = "MagDipAngleReference")
    protected PlaneAngleMeasure magDipAngleReference;
    @XmlElement(name = "MagModelUsed")
    protected String magModelUsed;
    @XmlElement(name = "MagModelValid")
    protected String magModelValid;
    @XmlElement(name = "GeoModelUsed")
    protected String geoModelUsed;
    @XmlElement(name = "StatusTrajStation")
    @XmlSchemaType(name = "string")
    protected TrajStationStatus statusTrajStation;
    @XmlElement(name = "ExtensionNameValue")
    protected List<ExtensionNameValue> extensionNameValue;
    @XmlElement(name = "Valid")
    protected StnTrajValid valid;
    @XmlElement(name = "MatrixCov")
    protected StnTrajMatrixCov matrixCov;
    @XmlElement(name = "Location")
    protected List<AbstractWellLocation> location;
    @XmlElement(name = "SourceStation")
    protected RefWellboreTrajectoryStation sourceStation;
    @XmlElement(name = "RawData")
    protected StnTrajRawData rawData;
    @XmlElement(name = "CorUsed")
    protected StnTrajCorUsed corUsed;
    @XmlElement(name = "IscwsaToolErrorModel")
    protected DataObjectReference iscwsaToolErrorModel;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;

    /**
     * Gets the value of the manuallyEntered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManuallyEntered() {
        return manuallyEntered;
    }

    /**
     * Sets the value of the manuallyEntered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManuallyEntered(Boolean value) {
        this.manuallyEntered = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the dTimStn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTimStn() {
        return dTimStn;
    }

    /**
     * Sets the value of the dTimStn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTimStn(String value) {
        this.dTimStn = value;
    }

    /**
     * Gets the value of the typeTrajStation property.
     * 
     * @return
     *     possible object is
     *     {@link TrajStationType }
     *     
     */
    public TrajStationType getTypeTrajStation() {
        return typeTrajStation;
    }

    /**
     * Sets the value of the typeTrajStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajStationType }
     *     
     */
    public void setTypeTrajStation(TrajStationType value) {
        this.typeTrajStation = value;
    }

    /**
     * Gets the value of the typeSurveyTool property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSurveyTool }
     *     
     */
    public TypeSurveyTool getTypeSurveyTool() {
        return typeSurveyTool;
    }

    /**
     * Sets the value of the typeSurveyTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSurveyTool }
     *     
     */
    public void setTypeSurveyTool(TypeSurveyTool value) {
        this.typeSurveyTool = value;
    }

    /**
     * Gets the value of the calcAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link TrajStnCalcAlgorithm }
     *     
     */
    public TrajStnCalcAlgorithm getCalcAlgorithm() {
        return calcAlgorithm;
    }

    /**
     * Sets the value of the calcAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajStnCalcAlgorithm }
     *     
     */
    public void setCalcAlgorithm(TrajStnCalcAlgorithm value) {
        this.calcAlgorithm = value;
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
    public WellVerticalDepthCoord getTvd() {
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
    public void setTvd(WellVerticalDepthCoord value) {
        this.tvd = value;
    }

    /**
     * Gets the value of the incl property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getIncl() {
        return incl;
    }

    /**
     * Sets the value of the incl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setIncl(PlaneAngleMeasure value) {
        this.incl = value;
    }

    /**
     * Gets the value of the azi property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getAzi() {
        return azi;
    }

    /**
     * Sets the value of the azi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setAzi(PlaneAngleMeasure value) {
        this.azi = value;
    }

    /**
     * Gets the value of the mtf property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getMtf() {
        return mtf;
    }

    /**
     * Sets the value of the mtf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setMtf(PlaneAngleMeasure value) {
        this.mtf = value;
    }

    /**
     * Gets the value of the gtf property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getGtf() {
        return gtf;
    }

    /**
     * Sets the value of the gtf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setGtf(PlaneAngleMeasure value) {
        this.gtf = value;
    }

    /**
     * Gets the value of the dispNs property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDispNs() {
        return dispNs;
    }

    /**
     * Sets the value of the dispNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDispNs(LengthMeasure value) {
        this.dispNs = value;
    }

    /**
     * Gets the value of the dispEw property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDispEw() {
        return dispEw;
    }

    /**
     * Sets the value of the dispEw property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDispEw(LengthMeasure value) {
        this.dispEw = value;
    }

    /**
     * Gets the value of the vertSect property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getVertSect() {
        return vertSect;
    }

    /**
     * Sets the value of the vertSect property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setVertSect(LengthMeasure value) {
        this.vertSect = value;
    }

    /**
     * Gets the value of the dls property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public AnglePerLengthMeasure getDls() {
        return dls;
    }

    /**
     * Sets the value of the dls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public void setDls(AnglePerLengthMeasure value) {
        this.dls = value;
    }

    /**
     * Gets the value of the rateTurn property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public AnglePerLengthMeasure getRateTurn() {
        return rateTurn;
    }

    /**
     * Sets the value of the rateTurn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public void setRateTurn(AnglePerLengthMeasure value) {
        this.rateTurn = value;
    }

    /**
     * Gets the value of the rateBuild property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public AnglePerLengthMeasure getRateBuild() {
        return rateBuild;
    }

    /**
     * Sets the value of the rateBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerLengthMeasure }
     *     
     */
    public void setRateBuild(AnglePerLengthMeasure value) {
        this.rateBuild = value;
    }

    /**
     * Gets the value of the mdDelta property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getMdDelta() {
        return mdDelta;
    }

    /**
     * Sets the value of the mdDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setMdDelta(LengthMeasure value) {
        this.mdDelta = value;
    }

    /**
     * Gets the value of the tvdDelta property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getTvdDelta() {
        return tvdDelta;
    }

    /**
     * Sets the value of the tvdDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setTvdDelta(LengthMeasure value) {
        this.tvdDelta = value;
    }

    /**
     * Gets the value of the gravTotalUncert property.
     * 
     * @return
     *     possible object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public LinearAccelerationMeasure getGravTotalUncert() {
        return gravTotalUncert;
    }

    /**
     * Sets the value of the gravTotalUncert property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public void setGravTotalUncert(LinearAccelerationMeasure value) {
        this.gravTotalUncert = value;
    }

    /**
     * Gets the value of the dipAngleUncert property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getDipAngleUncert() {
        return dipAngleUncert;
    }

    /**
     * Sets the value of the dipAngleUncert property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setDipAngleUncert(PlaneAngleMeasure value) {
        this.dipAngleUncert = value;
    }

    /**
     * Gets the value of the magTotalUncert property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public MagneticFluxDensityMeasure getMagTotalUncert() {
        return magTotalUncert;
    }

    /**
     * Sets the value of the magTotalUncert property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public void setMagTotalUncert(MagneticFluxDensityMeasure value) {
        this.magTotalUncert = value;
    }

    /**
     * Gets the value of the gravAccelCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGravAccelCorUsed() {
        return gravAccelCorUsed;
    }

    /**
     * Sets the value of the gravAccelCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGravAccelCorUsed(Boolean value) {
        this.gravAccelCorUsed = value;
    }

    /**
     * Gets the value of the magXAxialCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMagXAxialCorUsed() {
        return magXAxialCorUsed;
    }

    /**
     * Sets the value of the magXAxialCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMagXAxialCorUsed(Boolean value) {
        this.magXAxialCorUsed = value;
    }

    /**
     * Gets the value of the sagCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSagCorUsed() {
        return sagCorUsed;
    }

    /**
     * Sets the value of the sagCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSagCorUsed(Boolean value) {
        this.sagCorUsed = value;
    }

    /**
     * Gets the value of the magDrlstrCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMagDrlstrCorUsed() {
        return magDrlstrCorUsed;
    }

    /**
     * Sets the value of the magDrlstrCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMagDrlstrCorUsed(Boolean value) {
        this.magDrlstrCorUsed = value;
    }

    /**
     * Gets the value of the infieldRefCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInfieldRefCorUsed() {
        return infieldRefCorUsed;
    }

    /**
     * Sets the value of the infieldRefCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInfieldRefCorUsed(Boolean value) {
        this.infieldRefCorUsed = value;
    }

    /**
     * Gets the value of the interpolatedInfieldRefCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterpolatedInfieldRefCorUsed() {
        return interpolatedInfieldRefCorUsed;
    }

    /**
     * Sets the value of the interpolatedInfieldRefCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterpolatedInfieldRefCorUsed(Boolean value) {
        this.interpolatedInfieldRefCorUsed = value;
    }

    /**
     * Gets the value of the inHoleRefCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInHoleRefCorUsed() {
        return inHoleRefCorUsed;
    }

    /**
     * Sets the value of the inHoleRefCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInHoleRefCorUsed(Boolean value) {
        this.inHoleRefCorUsed = value;
    }

    /**
     * Gets the value of the axialMagInterferenceCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAxialMagInterferenceCorUsed() {
        return axialMagInterferenceCorUsed;
    }

    /**
     * Sets the value of the axialMagInterferenceCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAxialMagInterferenceCorUsed(Boolean value) {
        this.axialMagInterferenceCorUsed = value;
    }

    /**
     * Gets the value of the cosagCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCosagCorUsed() {
        return cosagCorUsed;
    }

    /**
     * Sets the value of the cosagCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCosagCorUsed(Boolean value) {
        this.cosagCorUsed = value;
    }

    /**
     * Gets the value of the msaCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMSACorUsed() {
        return msaCorUsed;
    }

    /**
     * Sets the value of the msaCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMSACorUsed(Boolean value) {
        this.msaCorUsed = value;
    }

    /**
     * Gets the value of the gravTotalFieldReference property.
     * 
     * @return
     *     possible object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public LinearAccelerationMeasure getGravTotalFieldReference() {
        return gravTotalFieldReference;
    }

    /**
     * Sets the value of the gravTotalFieldReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearAccelerationMeasure }
     *     
     */
    public void setGravTotalFieldReference(LinearAccelerationMeasure value) {
        this.gravTotalFieldReference = value;
    }

    /**
     * Gets the value of the magTotalFieldReference property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public MagneticFluxDensityMeasure getMagTotalFieldReference() {
        return magTotalFieldReference;
    }

    /**
     * Sets the value of the magTotalFieldReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticFluxDensityMeasure }
     *     
     */
    public void setMagTotalFieldReference(MagneticFluxDensityMeasure value) {
        this.magTotalFieldReference = value;
    }

    /**
     * Gets the value of the magDipAngleReference property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getMagDipAngleReference() {
        return magDipAngleReference;
    }

    /**
     * Sets the value of the magDipAngleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setMagDipAngleReference(PlaneAngleMeasure value) {
        this.magDipAngleReference = value;
    }

    /**
     * Gets the value of the magModelUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagModelUsed() {
        return magModelUsed;
    }

    /**
     * Sets the value of the magModelUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagModelUsed(String value) {
        this.magModelUsed = value;
    }

    /**
     * Gets the value of the magModelValid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagModelValid() {
        return magModelValid;
    }

    /**
     * Sets the value of the magModelValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagModelValid(String value) {
        this.magModelValid = value;
    }

    /**
     * Gets the value of the geoModelUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoModelUsed() {
        return geoModelUsed;
    }

    /**
     * Sets the value of the geoModelUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoModelUsed(String value) {
        this.geoModelUsed = value;
    }

    /**
     * Gets the value of the statusTrajStation property.
     * 
     * @return
     *     possible object is
     *     {@link TrajStationStatus }
     *     
     */
    public TrajStationStatus getStatusTrajStation() {
        return statusTrajStation;
    }

    /**
     * Sets the value of the statusTrajStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajStationStatus }
     *     
     */
    public void setStatusTrajStation(TrajStationStatus value) {
        this.statusTrajStation = value;
    }

    /**
     * Gets the value of the extensionNameValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionNameValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionNameValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionNameValue }
     * 
     * 
     */
    public List<ExtensionNameValue> getExtensionNameValue() {
        if (extensionNameValue == null) {
            extensionNameValue = new ArrayList<ExtensionNameValue>();
        }
        return this.extensionNameValue;
    }

    /**
     * Gets the value of the valid property.
     * 
     * @return
     *     possible object is
     *     {@link StnTrajValid }
     *     
     */
    public StnTrajValid getValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link StnTrajValid }
     *     
     */
    public void setValid(StnTrajValid value) {
        this.valid = value;
    }

    /**
     * Gets the value of the matrixCov property.
     * 
     * @return
     *     possible object is
     *     {@link StnTrajMatrixCov }
     *     
     */
    public StnTrajMatrixCov getMatrixCov() {
        return matrixCov;
    }

    /**
     * Sets the value of the matrixCov property.
     * 
     * @param value
     *     allowed object is
     *     {@link StnTrajMatrixCov }
     *     
     */
    public void setMatrixCov(StnTrajMatrixCov value) {
        this.matrixCov = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractWellLocation }
     * 
     * 
     */
    public List<AbstractWellLocation> getLocation() {
        if (location == null) {
            location = new ArrayList<AbstractWellLocation>();
        }
        return this.location;
    }

    public void setLocation(List<AbstractWellLocation> locList) {
        this.location = locList;
    }

    /**
     * Gets the value of the sourceStation property.
     * 
     * @return
     *     possible object is
     *     {@link RefWellboreTrajectoryStation }
     *     
     */
    public RefWellboreTrajectoryStation getSourceStation() {
        return sourceStation;
    }

    /**
     * Sets the value of the sourceStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefWellboreTrajectoryStation }
     *     
     */
    public void setSourceStation(RefWellboreTrajectoryStation value) {
        this.sourceStation = value;
    }

    /**
     * Gets the value of the rawData property.
     * 
     * @return
     *     possible object is
     *     {@link StnTrajRawData }
     *     
     */
    public StnTrajRawData getRawData() {
        return rawData;
    }

    /**
     * Sets the value of the rawData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StnTrajRawData }
     *     
     */
    public void setRawData(StnTrajRawData value) {
        this.rawData = value;
    }

    /**
     * Gets the value of the corUsed property.
     * 
     * @return
     *     possible object is
     *     {@link StnTrajCorUsed }
     *     
     */
    public StnTrajCorUsed getCorUsed() {
        return corUsed;
    }

    /**
     * Sets the value of the corUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link StnTrajCorUsed }
     *     
     */
    public void setCorUsed(StnTrajCorUsed value) {
        this.corUsed = value;
    }

    /**
     * Gets the value of the iscwsaToolErrorModel property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getIscwsaToolErrorModel() {
        return iscwsaToolErrorModel;
    }

    /**
     * Sets the value of the iscwsaToolErrorModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setIscwsaToolErrorModel(DataObjectReference value) {
        this.iscwsaToolErrorModel = value;
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
