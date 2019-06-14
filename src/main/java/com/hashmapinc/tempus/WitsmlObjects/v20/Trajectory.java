


package com.hashmapinc.tempus.WitsmlObjects.v20;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * The trajectory object is used to capture information about a directional survey in a wellbore. It contains many trajectory stations to capture the information about individual survey points. This object is uniquely identified within the context of one wellbore object.
 * 
 * <p>Java class for Trajectory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="Trajectory">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="GrowingStatus" type="{http://www.energistics.org/energyml/data/witsmlv2}ChannelStatus"/>
 *         <element name="DTimTrajStart" type="{http://www.energistics.org/energyml/data/commonv2}TimeStamp" minOccurs="0"/>
 *         <element name="DTimTrajEnd" type="{http://www.energistics.org/energyml/data/commonv2}TimeStamp" minOccurs="0"/>
 *         <element name="MdMn" type="{http://www.energistics.org/energyml/data/witsmlv2}DepthCoord" minOccurs="0"/>
 *         <element name="MdMx" type="{http://www.energistics.org/energyml/data/witsmlv2}DepthCoord" minOccurs="0"/>
 *         <element name="ServiceCompany" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="MagDeclUsed" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="GridConUsed" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="AziVertSect" type="{http://www.energistics.org/energyml/data/commonv2}PlaneAngleMeasure" minOccurs="0"/>
 *         <element name="DispNsVertSectOrig" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *         <element name="DispEwVertSectOrig" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *         <element name="Definitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Memory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="FinalTraj" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AziRef" type="{http://www.energistics.org/energyml/data/witsmlv2}AziRef" minOccurs="0"/>
 *         <element name="TrajectoryStation" type="{http://www.energistics.org/energyml/data/witsmlv2}TrajectoryStation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Wellbore" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference"/>
 *         <element name="ParentTrajectory" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="Trajectory")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trajectory", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "growingStatus",
    "dTimTrajStart",
    "dTimTrajEnd",
    "mdMn",
    "mdMx",
    "serviceCompany",
    "magDeclUsed",
    "gridConUsed",
    "aziVertSect",
    "dispNsVertSectOrig",
    "dispEwVertSectOrig",
    "definitive",
    "memory",
    "finalTraj",
    "aziRef",
    "trajectoryStation",
    "wellbore",
    "parentTrajectory"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Trajectory
    extends AbstractObject
{

    @XmlElement(name = "GrowingStatus", required = true)
    @XmlSchemaType(name = "string")
    protected String growingStatus;
    @XmlElement(name = "DTimTrajStart")
    protected String dTimTrajStart;
    @XmlElement(name = "DTimTrajEnd")
    protected String dTimTrajEnd;
    @XmlElement(name = "MdMn")
    protected DepthCoord mdMn;
    @XmlElement(name = "MdMx")
    protected DepthCoord mdMx;
    @XmlElement(name = "ServiceCompany")
    protected String serviceCompany;
    @XmlElement(name = "MagDeclUsed")
    protected PlaneAngleMeasure magDeclUsed;
    @XmlElement(name = "GridConUsed")
    protected PlaneAngleMeasure gridConUsed;
    @XmlElement(name = "AziVertSect")
    protected PlaneAngleMeasure aziVertSect;
    @XmlElement(name = "DispNsVertSectOrig")
    protected LengthMeasure dispNsVertSectOrig;
    @XmlElement(name = "DispEwVertSectOrig")
    protected LengthMeasure dispEwVertSectOrig;
    @XmlElement(name = "Definitive")
    protected String definitive;
    @XmlElement(name = "Memory")
    protected String memory;
    @XmlElement(name = "FinalTraj")
    protected String finalTraj;
    @XmlElement(name = "AziRef")
    @XmlSchemaType(name = "string")
    protected String aziRef;
    @XmlElement(name = "TrajectoryStation")
    protected List<TrajectoryStation> trajectoryStation;
    @XmlElement(name = "Wellbore", required = true)
    protected DataObjectReference wellbore;
    @XmlElement(name = "ParentTrajectory")
    protected DataObjectReference parentTrajectory;
    // Begin the fields for 1411 conversion capability
    @XmlTransient
    protected String name;
    @XmlTransient
    protected String nameWellbore;
    @XmlTransient
    protected String nameWell;
    @XmlTransient
    protected String uid;
    @XmlTransient
    protected String uidWellbore;
    @XmlTransient
    protected String uidWell;


    /**
     * Gets the value of the growingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrowingStatus() {
        return growingStatus;
    }

    /**
     * Sets the value of the growingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrowingStatus(String value) {
        this.growingStatus = value;
    }

    /**
     * Gets the value of the dTimTrajStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTimTrajStart() {
        return dTimTrajStart;
    }

    /**
     * Sets the value of the dTimTrajStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTimTrajStart(String value) {
        this.dTimTrajStart = value;
    }

    /**
     * Gets the value of the dTimTrajEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTimTrajEnd() {
        return dTimTrajEnd;
    }

    /**
     * Sets the value of the dTimTrajEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTimTrajEnd(String value) {
        this.dTimTrajEnd = value;
    }

    /**
     * Gets the value of the mdMn property.
     * 
     * @return
     *     possible object is
     *     {@link DepthCoord }
     *     
     */
    public DepthCoord getMdMn() {
        return mdMn;
    }

    /**
     * Sets the value of the mdMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepthCoord }
     *     
     */
    public void setMdMn(DepthCoord value) {
        this.mdMn = value;
    }

    /**
     * Gets the value of the mdMx property.
     * 
     * @return
     *     possible object is
     *     {@link DepthCoord }
     *     
     */
    public DepthCoord getMdMx() {
        return mdMx;
    }

    /**
     * Sets the value of the mdMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepthCoord }
     *     
     */
    public void setMdMx(DepthCoord value) {
        this.mdMx = value;
    }

    /**
     * Gets the value of the serviceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCompany() {
        return serviceCompany;
    }

    /**
     * Sets the value of the serviceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCompany(String value) {
        this.serviceCompany = value;
    }

    /**
     * Gets the value of the magDeclUsed property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getMagDeclUsed() {
        return magDeclUsed;
    }

    /**
     * Sets the value of the magDeclUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setMagDeclUsed(PlaneAngleMeasure value) {
        this.magDeclUsed = value;
    }

    /**
     * Gets the value of the gridConUsed property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getGridConUsed() {
        return gridConUsed;
    }

    /**
     * Sets the value of the gridConUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setGridConUsed(PlaneAngleMeasure value) {
        this.gridConUsed = value;
    }

    /**
     * Gets the value of the aziVertSect property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getAziVertSect() {
        return aziVertSect;
    }

    /**
     * Sets the value of the aziVertSect property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setAziVertSect(PlaneAngleMeasure value) {
        this.aziVertSect = value;
    }

    /**
     * Gets the value of the dispNsVertSectOrig property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDispNsVertSectOrig() {
        return dispNsVertSectOrig;
    }

    /**
     * Sets the value of the dispNsVertSectOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDispNsVertSectOrig(LengthMeasure value) {
        this.dispNsVertSectOrig = value;
    }

    /**
     * Gets the value of the dispEwVertSectOrig property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDispEwVertSectOrig() {
        return dispEwVertSectOrig;
    }

    /**
     * Sets the value of the dispEwVertSectOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDispEwVertSectOrig(LengthMeasure value) {
        this.dispEwVertSectOrig = value;
    }

    /**
     * Gets the value of the definitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public String isDefinitive() {
        return definitive;
    }

    /**
     * Sets the value of the definitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefinitive(String value) {
        this.definitive = value;
    }

    /**
     * Gets the value of the memory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public String isMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMemory(String value) {
        this.memory = value;
    }

    /**
     * Gets the value of the finalTraj property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public String isFinalTraj() {
        return finalTraj;
    }

    /**
     * Sets the value of the finalTraj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalTraj(String value) {
        this.finalTraj = value;
    }

    /**
     * Gets the value of the aziRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAziRef() {
        return aziRef;
    }

    /**
     * Sets the value of the aziRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAziRef(String value) {
        this.aziRef = value;
    }

    /**
     * Gets the value of the trajectoryStation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trajectoryStation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrajectoryStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrajectoryStation }
     * 
     * 
     */
    public List<TrajectoryStation> getTrajectoryStation() {
        if (trajectoryStation == null) {
            trajectoryStation = new ArrayList<TrajectoryStation>();
        }
        return this.trajectoryStation;
    }

    public void setTrajectoryStation(List<TrajectoryStation> stationList) {
        this.trajectoryStation = stationList;
    }

    /**
     * Gets the value of the wellbore property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getWellbore() {
        return wellbore;
    }

    /**
     * Sets the value of the wellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setWellbore(DataObjectReference value) {
        this.wellbore = value;
    }

    /**
     * Gets the value of the parentTrajectory property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getParentTrajectory() {
        return parentTrajectory;
    }

    /**
     * Sets the value of the parentTrajectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setParentTrajectory(DataObjectReference value) {
        this.parentTrajectory = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameWellbore() {
        return nameWellbore;
    }

    public void setNameWellbore(String nameWellbore) {
        this.nameWellbore = nameWellbore;
    }

    public String getNameWell() {
        return nameWell;
    }

    public void setNameWell(String nameWell) {
        this.nameWell = nameWell;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUidWellbore() {
        return uidWellbore;
    }

    public void setUidWellbore(String uidWellbore) {
        this.uidWellbore = uidWellbore;
    }

    public String getUidWell() {
        return uidWell;
    }

    public void setUidWell(String uidWell) {
        this.uidWell = uidWell;
    }


}
