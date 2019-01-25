package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Trajectory Station Component Schema
 * 
 * <p>Java class for cs_trajectoryStation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_trajectoryStation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_trajectoryStation" minOccurs="0"/>
 *         <element name="commonData" type="{http://www.witsml.org/schemas/131}cs_commonData" minOccurs="0"/>
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
@XmlType(name = "cs_trajectoryStation", propOrder = {
    "target",
    "dTimStn",
    "typeTrajStation",
    "typeSurveyTool",
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
    "modelToolError",
    "gravTotalUncert",
    "dipAngleUncert",
    "magTotalUncert",
    "gravAccelCorUsed",
    "magXAxialCorUsed",
    "sagCorUsed",
    "magDrlstrCorUsed",
    "gravTotalFieldReference",
    "magTotalFieldReference",
    "magDipAngleReference",
    "magModelUsed",
    "magModelValid",
    "geoModelUsed",
    "statusTrajStation",
    "rawData",
    "corUsed",
    "valid",
    "matrixCov",
    "location",
    "sourceStation",
    "commonData"
})
public class CsTrajectoryStation {

    protected RefNameString target;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimStn;
    @XmlSchemaType(name = "string")
    protected TrajStationType typeTrajStation;
    @XmlSchemaType(name = "string")
    protected TypeSurveyTool typeSurveyTool;
    protected MeasuredDepthCoord md;
    protected WellVerticalDepthCoord tvd;
    protected PlaneAngleMeasure incl;
    protected PlaneAngleMeasure azi;
    protected PlaneAngleMeasure mtf;
    protected PlaneAngleMeasure gtf;
    protected LengthMeasure dispNs;
    protected LengthMeasure dispEw;
    protected LengthMeasure vertSect;
    protected AnglePerLengthMeasure dls;
    protected AnglePerLengthMeasure rateTurn;
    protected AnglePerLengthMeasure rateBuild;
    protected MeasuredDepthCoord mdDelta;
    protected WellVerticalDepthCoord tvdDelta;
    protected String modelToolError;
    protected AccelerationLinearMeasure gravTotalUncert;
    protected PlaneAngleMeasure dipAngleUncert;
    protected MagneticInductionMeasure magTotalUncert;
    protected Boolean gravAccelCorUsed;
    protected Boolean magXAxialCorUsed;
    protected Boolean sagCorUsed;
    protected Boolean magDrlstrCorUsed;
    protected AccelerationLinearMeasure gravTotalFieldReference;
    protected MagneticInductionMeasure magTotalFieldReference;
    protected PlaneAngleMeasure magDipAngleReference;
    protected String magModelUsed;
    protected String magModelValid;
    protected String geoModelUsed;
    @XmlSchemaType(name = "string")
    protected TrajStationStatus statusTrajStation;
    protected CsStnTrajRawData rawData;
    protected CsStnTrajCorUsed corUsed;
    protected CsStnTrajValid valid;
    protected CsStnTrajMatrixCov matrixCov;
    protected List<CsLocation> location;
    protected CsRefWellboreTrajectoryStation sourceStation;
    protected CsCommonData commonData;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setTarget(RefNameString value) {
        this.target = value;
    }

    /**
     * Gets the value of the dTimStn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimStn() {
        return dTimStn;
    }

    /**
     * Sets the value of the dTimStn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimStn(XMLGregorianCalendar value) {
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
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdDelta() {
        return mdDelta;
    }

    /**
     * Sets the value of the mdDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdDelta(MeasuredDepthCoord value) {
        this.mdDelta = value;
    }

    /**
     * Gets the value of the tvdDelta property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdDelta() {
        return tvdDelta;
    }

    /**
     * Sets the value of the tvdDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdDelta(WellVerticalDepthCoord value) {
        this.tvdDelta = value;
    }

    /**
     * Gets the value of the modelToolError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelToolError() {
        return modelToolError;
    }

    /**
     * Sets the value of the modelToolError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelToolError(String value) {
        this.modelToolError = value;
    }

    /**
     * Gets the value of the gravTotalUncert property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public AccelerationLinearMeasure getGravTotalUncert() {
        return gravTotalUncert;
    }

    /**
     * Sets the value of the gravTotalUncert property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public void setGravTotalUncert(AccelerationLinearMeasure value) {
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
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagTotalUncert() {
        return magTotalUncert;
    }

    /**
     * Sets the value of the magTotalUncert property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagTotalUncert(MagneticInductionMeasure value) {
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
     * Gets the value of the gravTotalFieldReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public AccelerationLinearMeasure getGravTotalFieldReference() {
        return gravTotalFieldReference;
    }

    /**
     * Sets the value of the gravTotalFieldReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationLinearMeasure }
     *     
     */
    public void setGravTotalFieldReference(AccelerationLinearMeasure value) {
        this.gravTotalFieldReference = value;
    }

    /**
     * Gets the value of the magTotalFieldReference property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public MagneticInductionMeasure getMagTotalFieldReference() {
        return magTotalFieldReference;
    }

    /**
     * Sets the value of the magTotalFieldReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticInductionMeasure }
     *     
     */
    public void setMagTotalFieldReference(MagneticInductionMeasure value) {
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
     * Gets the value of the rawData property.
     * 
     * @return
     *     possible object is
     *     {@link CsStnTrajRawData }
     *     
     */
    public CsStnTrajRawData getRawData() {
        return rawData;
    }

    /**
     * Sets the value of the rawData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsStnTrajRawData }
     *     
     */
    public void setRawData(CsStnTrajRawData value) {
        this.rawData = value;
    }

    /**
     * Gets the value of the corUsed property.
     * 
     * @return
     *     possible object is
     *     {@link CsStnTrajCorUsed }
     *     
     */
    public CsStnTrajCorUsed getCorUsed() {
        return corUsed;
    }

    /**
     * Sets the value of the corUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsStnTrajCorUsed }
     *     
     */
    public void setCorUsed(CsStnTrajCorUsed value) {
        this.corUsed = value;
    }

    /**
     * Gets the value of the valid property.
     * 
     * @return
     *     possible object is
     *     {@link CsStnTrajValid }
     *     
     */
    public CsStnTrajValid getValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsStnTrajValid }
     *     
     */
    public void setValid(CsStnTrajValid value) {
        this.valid = value;
    }

    /**
     * Gets the value of the matrixCov property.
     * 
     * @return
     *     possible object is
     *     {@link CsStnTrajMatrixCov }
     *     
     */
    public CsStnTrajMatrixCov getMatrixCov() {
        return matrixCov;
    }

    /**
     * Sets the value of the matrixCov property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsStnTrajMatrixCov }
     *     
     */
    public void setMatrixCov(CsStnTrajMatrixCov value) {
        this.matrixCov = value;
    }

    /**
     * Gets the value of the location property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getLocation().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsLocation }
     * 
     * 
     */
    public List<CsLocation> getLocation() {
        if (location == null) {
            location = new ArrayList<CsLocation>();
        }
        return this.location;
    }

    /**
     * Gets the value of the sourceStation property.
     * 
     * @return
     *     possible object is
     *     {@link CsRefWellboreTrajectoryStation }
     *     
     */
    public CsRefWellboreTrajectoryStation getSourceStation() {
        return sourceStation;
    }

    /**
     * Sets the value of the sourceStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsRefWellboreTrajectoryStation }
     *     
     */
    public void setSourceStation(CsRefWellboreTrajectoryStation value) {
        this.sourceStation = value;
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
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsTrajectoryStation to1411CsTrajectoryStation() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsTrajectoryStation station = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsTrajectoryStation();

        // assign fields
        // check non-complex, non-repeating fields
        station.setDTimStn(this.getDTimStn());
        station.setModelToolError(this.getModelToolError());
        station.setGravAccelCorUsed(this.isGravAccelCorUsed());
        station.setMagXAxialCorUsed(this.isMagXAxialCorUsed());
        station.setSagCorUsed(this.isSagCorUsed());
        station.setMagDrlstrCorUsed(this.isMagDrlstrCorUsed());
        station.setMagModelUsed(this.getMagModelUsed());
        station.setMagModelValid(this.getMagModelValid());
        station.setGeoModelUsed(this.getGeoModelUsed());
        station.setUid(this.getUid());

        // check complex fields
        if (null != this.getTarget())
            station.setTarget(this.getTarget().to1411RefNameString());

        if (null != this.getTypeTrajStation())
            station.setTypeTrajStation(com.hashmapinc.tempus.WitsmlObjects.v1411.TrajStationType.fromValue(this.getTypeTrajStation().value()));

        if (null != this.getTypeSurveyTool())
            station.setTypeSurveyTool(this.getTypeSurveyTool().value());

        if (null != this.getMd())
            station.setMd(this.getMd().to1411MeasuredDepthCoord());

        if (null != this.getTvd())
            station.setTvd(this.getTvd().to1411VerticalDepthCoord());

        if (null != this.getIncl())
            station.setIncl(this.getIncl().to1411PlaneAngleMeasure());

        if (null != this.getAzi())
            station.setAzi(this.getAzi().to1411PlaneAngleMeasure());

        if (null != this.getMtf())
            station.setMtf(this.getMtf().to1411PlaneAngleMeasure());

        if (null != this.getGtf())
            station.setGtf(this.getGtf().to1411PlaneAngleMeasure());

        if (null != this.getDispNs())
            station.setDispNs(this.getDispNs().to1411Length());

        if (null != this.getDispEw())
            station.setDispEw(this.getDispEw().to1411Length());

        if (null != this.getVertSect())
            station.setVertSect(this.getVertSect().to1411Length());

        if (null != this.getDls())
            station.setDls(this.getDls().to1411AnglePerLengthMeasure());

        if (null != this.getRateTurn())
            station.setRateTurn(this.getRateTurn().to1411AnglePerLengthMeasure());

        if (null != this.getRateBuild())
            station.setRateBuild(this.getRateBuild().to1411AnglePerLengthMeasure());

        if (null != this.getMdDelta())
            station.setMdDelta(this.getMdDelta().to1411LengthMeasure());

        if (null != this.getTvdDelta())
            station.setTvdDelta(this.getTvdDelta().to1411LengthMeasure());

        if (null != this.getGravTotalUncert())
            station.setGravTotalUncert(this.getGravTotalUncert().to1411AnglePerLengthMeasure());

        if (null != this.getDipAngleUncert())
            station.setDipAngleUncert(this.getDipAngleUncert().to1411PlaneAngleMeasure());

        if (null != this.getMagTotalUncert())
            station.setMagTotalUncert(this.getMagTotalUncert().to1411MagneticInductionMeasure());

        if (null != this.getGravTotalFieldReference())
            station.setGravTotalFieldReference(this.getGravTotalFieldReference().to1411AnglePerLengthMeasure());

        if (null != this.getMagTotalFieldReference())
            station.setMagTotalFieldReference(this.getMagTotalFieldReference().to1411MagneticInductionMeasure());

        if (null != this.getMagDipAngleReference())
            station.setMagDipAngleReference(this.getMagDipAngleReference().to1411PlaneAngleMeasure());

        if (null != this.getStatusTrajStation())
            station.setStatusTrajStation(com.hashmapinc.tempus.WitsmlObjects.v1411.TrajStationStatus.fromValue(this.getStatusTrajStation().value()));

        if (null != this.getRawData()) {
            station.setRawData(this.getRawData());

        }
        if (null != srcStation.getCorUsed()) {
            if (null != srcStation.getCorUsed().getGravAxialAccelCor()) {
                assertEquals(srcStation.getCorUsed().getGravAxialAccelCor().getValue(), destStation.getCorUsed().getGravAxialAccelCor().getValue());
                assertEquals(srcStation.getCorUsed().getGravAxialAccelCor().getUom().value(), destStation.getCorUsed().getGravAxialAccelCor().getUom().value());
            }
            if (null != srcStation.getCorUsed().getGravTran1AccelCor()) {
                assertEquals(srcStation.getCorUsed().getGravTran1AccelCor().getValue(), destStation.getCorUsed().getGravTran1AccelCor().getValue());
                assertEquals(srcStation.getCorUsed().getGravTran1AccelCor().getUom().value(), destStation.getCorUsed().getGravTran1AccelCor().getUom().value());
            }
            if (null != srcStation.getCorUsed().getGravTran2AccelCor()) {
                assertEquals(srcStation.getCorUsed().getGravTran2AccelCor().getValue(), destStation.getCorUsed().getGravTran2AccelCor().getValue());
                assertEquals(srcStation.getCorUsed().getGravTran2AccelCor().getUom().value(), destStation.getCorUsed().getGravTran2AccelCor().getUom().value());
            }
            if (null != srcStation.getCorUsed().getMagAxialDrlstrCor()) {
                assertEquals(srcStation.getCorUsed().getMagAxialDrlstrCor().getValue(), destStation.getCorUsed().getMagAxialDrlstrCor().getValue());
                assertEquals(srcStation.getCorUsed().getMagAxialDrlstrCor().getUom().value(), destStation.getCorUsed().getMagAxialDrlstrCor().getUom().value());
            }
            if (null != srcStation.getCorUsed().getMagTran1DrlstrCor()) {
                assertEquals(srcStation.getCorUsed().getMagTran1DrlstrCor().getValue(), destStation.getCorUsed().getMagTran1DrlstrCor().getValue());
                assertEquals(srcStation.getCorUsed().getMagTran1DrlstrCor().getUom().value(), destStation.getCorUsed().getMagTran1DrlstrCor().getUom().value());
            }
            if (null != srcStation.getCorUsed().getMagTran2DrlstrCor()) {
                assertEquals(srcStation.getCorUsed().getMagTran2DrlstrCor().getValue(), destStation.getCorUsed().getMagTran2DrlstrCor().getValue());
                assertEquals(srcStation.getCorUsed().getMagTran2DrlstrCor().getUom().value(), destStation.getCorUsed().getMagTran2DrlstrCor().getUom().value());
            }
            if (null != srcStation.getCorUsed().getSagIncCor()) {
                assertEquals(srcStation.getCorUsed().getSagIncCor().getValue(), destStation.getCorUsed().getSagIncCor().getValue());
                assertEquals(srcStation.getCorUsed().getSagIncCor().getUom(), destStation.getCorUsed().getSagIncCor().getUom());
            }
            if (null != srcStation.getCorUsed().getSagAziCor()) {
                assertEquals(srcStation.getCorUsed().getSagAziCor().getValue(), destStation.getCorUsed().getSagAziCor().getValue());
                assertEquals(srcStation.getCorUsed().getSagAziCor().getUom(), destStation.getCorUsed().getSagAziCor().getUom());
            }
            if (null != srcStation.getCorUsed().getStnMagDeclUsed()) {
                assertEquals(srcStation.getCorUsed().getStnMagDeclUsed().getValue(), destStation.getCorUsed().getStnMagDeclUsed().getValue());
                assertEquals(srcStation.getCorUsed().getStnMagDeclUsed().getUom(), destStation.getCorUsed().getStnMagDeclUsed().getUom());
            }
            if (null != srcStation.getCorUsed().getStnGridCorUsed()) {
                assertEquals(srcStation.getCorUsed().getStnGridCorUsed().getValue(), destStation.getCorUsed().getStnGridCorUsed().getValue());
                assertEquals(srcStation.getCorUsed().getStnGridCorUsed().getUom(), destStation.getCorUsed().getStnGridCorUsed().getUom());
            }
            if (null != srcStation.getCorUsed().getDirSensorOffset()) {
                assertEquals(srcStation.getCorUsed().getDirSensorOffset().getValue(), destStation.getCorUsed().getDirSensorOffset().getValue());
                assertEquals(srcStation.getCorUsed().getDirSensorOffset().getUom(), destStation.getCorUsed().getDirSensorOffset().getUom());
            }
        }
        if (null != srcStation.getValid()) {
            if (null != srcStation.getValid().getMagTotalFieldCalc()) {
                assertEquals(srcStation.getValid().getMagTotalFieldCalc().getValue(), destStation.getValid().getMagTotalFieldCalc().getValue());
                assertEquals(srcStation.getValid().getMagTotalFieldCalc().getUom().value(), destStation.getValid().getMagTotalFieldCalc().getUom().value());
            }
            if (null != srcStation.getValid().getMagDipAngleCalc()) {
                assertEquals(srcStation.getValid().getMagDipAngleCalc().getValue(), destStation.getValid().getMagDipAngleCalc().getValue());
                assertEquals(srcStation.getValid().getMagDipAngleCalc().getUom(), destStation.getValid().getMagDipAngleCalc().getUom());
            }
            if (null != srcStation.getValid().getGravTotalFieldCalc()) {
                assertEquals(srcStation.getValid().getGravTotalFieldCalc().getValue(), destStation.getValid().getGravTotalFieldCalc().getValue());
                assertEquals(srcStation.getValid().getGravTotalFieldCalc().getUom().value(), destStation.getValid().getGravTotalFieldCalc().getUom().value());
            }
        }
        if (null != srcStation.getMatrixCov()) {
            if (null != srcStation.getMatrixCov().getVarianceNN()) {
                assertEquals(srcStation.getMatrixCov().getVarianceNN().getValue(), destStation.getMatrixCov().getVarianceNN().getValue());
                assertEquals(srcStation.getMatrixCov().getVarianceNN().getUom().value(), destStation.getMatrixCov().getVarianceNN().getUom().value());
            }
            if (null != srcStation.getMatrixCov().getVarianceNE()) {
                assertEquals(srcStation.getMatrixCov().getVarianceNE().getValue(), destStation.getMatrixCov().getVarianceNE().getValue());
                assertEquals(srcStation.getMatrixCov().getVarianceNE().getUom().value(), destStation.getMatrixCov().getVarianceNE().getUom().value());
            }
            if (null != srcStation.getMatrixCov().getVarianceNVert()) {
                assertEquals(srcStation.getMatrixCov().getVarianceNVert().getValue(), destStation.getMatrixCov().getVarianceNVert().getValue());
                assertEquals(srcStation.getMatrixCov().getVarianceNVert().getUom().value(), destStation.getMatrixCov().getVarianceNVert().getUom().value());
            }
            if (null != srcStation.getMatrixCov().getVarianceEE()) {
                assertEquals(srcStation.getMatrixCov().getVarianceEE().getValue(), destStation.getMatrixCov().getVarianceEE().getValue());
                assertEquals(srcStation.getMatrixCov().getVarianceEE().getUom().value(), destStation.getMatrixCov().getVarianceEE().getUom().value());
            }
            if (null != srcStation.getMatrixCov().getVarianceEVert()) {
                assertEquals(srcStation.getMatrixCov().getVarianceEVert().getValue(), destStation.getMatrixCov().getVarianceEVert().getValue());
                assertEquals(srcStation.getMatrixCov().getVarianceEVert().getUom().value(), destStation.getMatrixCov().getVarianceEVert().getUom().value());
            }
            if (null != srcStation.getMatrixCov().getVarianceVertVert()) {
                assertEquals(srcStation.getMatrixCov().getVarianceVertVert().getValue(), destStation.getMatrixCov().getVarianceVertVert().getValue());
                assertEquals(srcStation.getMatrixCov().getVarianceVertVert().getUom().value(), destStation.getMatrixCov().getVarianceVertVert().getUom().value());
            }
            if (null != srcStation.getMatrixCov().getBiasN()) {
                assertEquals(srcStation.getMatrixCov().getBiasN().getValue(), destStation.getMatrixCov().getBiasN().getValue());
                assertEquals(srcStation.getMatrixCov().getBiasN().getUom(), destStation.getMatrixCov().getBiasN().getUom());
            }
            if (null != srcStation.getMatrixCov().getBiasE()) {
                assertEquals(srcStation.getMatrixCov().getBiasE().getValue(), destStation.getMatrixCov().getBiasE().getValue());
                assertEquals(srcStation.getMatrixCov().getBiasE().getUom(), destStation.getMatrixCov().getBiasE().getUom());
            }
            if (null != srcStation.getMatrixCov().getBiasVert()) {
                assertEquals(srcStation.getMatrixCov().getBiasVert().getValue(), destStation.getMatrixCov().getBiasVert().getValue());
                assertEquals(srcStation.getMatrixCov().getBiasVert().getUom(), destStation.getMatrixCov().getBiasVert().getUom());
            }

        }
        if (null != srcStation.getSourceStation()) {
            assertEquals(srcStation.getSourceStation().getStationReference(), destStation.getSourceStation().getStationReference());
            if (null != srcStation.getSourceStation().getTrajectoryParent()) {
                assertEquals(srcStation.getSourceStation().getTrajectoryParent().getValue(), destStation.getSourceStation().getTrajectoryParent().getValue());
                assertEquals(srcStation.getSourceStation().getTrajectoryParent().getUidRef(), destStation.getSourceStation().getTrajectoryParent().getUidRef());
            }
            if (null != srcStation.getSourceStation().getWellboreParent()) {
                assertEquals(srcStation.getSourceStation().getWellboreParent().getValue(), destStation.getSourceStation().getWellboreParent().getValue());
                assertEquals(srcStation.getSourceStation().getWellboreParent().getUidRef(), destStation.getSourceStation().getWellboreParent().getUidRef());
            }
        }
        if (null != srcStation.getCommonData()) {
            assertEquals(src.getCommonData().getSourceName(), dest.getCommonData().getSourceName());
            assertEquals(src.getCommonData().getDTimCreation(), dest.getCommonData().getDTimCreation());
            assertEquals(src.getCommonData().getDTimLastChange(), dest.getCommonData().getDTimLastChange());
            assertEquals(src.getCommonData().getItemState().value(), dest.getCommonData().getItemState().value());
            assertEquals(src.getCommonData().getComments(), dest.getCommonData().getComments());
        }

        // check repeating fields
        if (null != srcStation.getLocation()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsLocation> srcStationLoc = srcStation.getLocation();
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsLocation> destStationLoc = destStation.getLocation();
            for (int j = 0; j < srcStationLoc.size(); j++) {
                // well crs
                if (null != srcStationLoc.get(j).getWellCRS()) {
                    assertEquals(srcStationLoc.get(j).getWellCRS().getUidRef(), destStationLoc.get(j).getWellCRS().getUidRef());
                    assertEquals(srcStationLoc.get(j).getWellCRS().getValue(), destStationLoc.get(j).getWellCRS().getValue());
                }

                // latitude
                if (null != srcStationLoc.get(j).getLatitude()) {
                    assertEquals(srcStationLoc.get(j).getLatitude().getUom(), destStationLoc.get(j).getLatitude().getUom());
                    assertEquals(srcStationLoc.get(j).getLatitude().getValue(), destStationLoc.get(j).getLatitude().getValue());
                }

                // longitude
                if (null != srcStationLoc.get(j).getLongitude()) {
                    assertEquals(srcStationLoc.get(j).getLongitude().getUom(), destStationLoc.get(j).getLongitude().getUom());
                    assertEquals(srcStationLoc.get(j).getLongitude().getValue(), destStationLoc.get(j).getLongitude().getValue());
                }

                // easting
                if (null != srcStationLoc.get(j).getEasting()) {
                    assertEquals(srcStationLoc.get(j).getEasting().getUom(), destStationLoc.get(j).getEasting().getUom());
                    assertEquals(srcStationLoc.get(j).getEasting().getValue(), destStationLoc.get(j).getEasting().getValue());
                }

                // northing
                if (null != srcStationLoc.get(j).getNorthing()) {
                    assertEquals(srcStationLoc.get(j).getNorthing().getUom(), destStationLoc.get(j).getNorthing().getUom());
                    assertEquals(srcStationLoc.get(j).getNorthing().getValue(), destStationLoc.get(j).getNorthing().getValue());
                }

                // westing
                if (null != srcStationLoc.get(j).getWesting()) {
                    assertEquals(srcStationLoc.get(j).getWesting().getUom(), destStationLoc.get(j).getWesting().getUom());
                    assertEquals(srcStationLoc.get(j).getWesting().getValue(), destStationLoc.get(j).getWesting().getValue());
                }

                // southing
                if (null != srcStationLoc.get(j).getSouthing()) {
                    assertEquals(srcStationLoc.get(j).getSouthing().getUom(), destStationLoc.get(j).getSouthing().getUom());
                    assertEquals(srcStationLoc.get(j).getSouthing().getValue(), destStationLoc.get(j).getSouthing().getValue());
                }

                // projectedX
                if (null != srcStationLoc.get(j).getProjectedX()) {
                    assertEquals(srcStationLoc.get(j).getProjectedX().getUom(), destStationLoc.get(j).getProjectedX().getUom());
                    assertEquals(srcStationLoc.get(j).getProjectedX().getValue(), destStationLoc.get(j).getProjectedX().getValue());
                }

                // projectedY
                if (null != srcStationLoc.get(j).getProjectedY()) {
                    assertEquals(srcStationLoc.get(j).getProjectedY().getUom(), destStationLoc.get(j).getProjectedY().getUom());
                    assertEquals(srcStationLoc.get(j).getProjectedY().getValue(), destStationLoc.get(j).getProjectedY().getValue());
                }

                // localX
                if (null != srcStationLoc.get(j).getLocalX()) {
                    assertEquals(srcStationLoc.get(j).getLocalX().getUom(), destStationLoc.get(j).getLocalX().getUom());
                    assertEquals(srcStationLoc.get(j).getLocalX().getValue(), destStationLoc.get(j).getLocalX().getValue());
                }

                // localY
                if (null != srcStationLoc.get(j).getLocalY()) {
                    assertEquals(srcStationLoc.get(j).getLocalY().getUom(), destStationLoc.get(j).getLocalY().getUom());
                    assertEquals(srcStationLoc.get(j).getLocalY().getValue(), destStationLoc.get(j).getLocalY().getValue());
                }

                assertEquals(srcStationLoc.get(j).isOriginal(), destStationLoc.get(j).isOriginal());
                assertEquals(srcStationLoc.get(j).getDescription(), destStationLoc.get(j).getDescription());
                assertEquals(srcStationLoc.get(j).getUid(), destStationLoc.get(j).getUid());
            }
        }

        return station;
    }
    //=========================================================================

}
