package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.hashmapinc.tempus.WitsmlObjects.AbstractWitsmlObject;
import com.hashmapinc.tempus.WitsmlObjects.Util.TrajectoryConverter;
import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlMarshal;
import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlVersionTransformer;

/**
 * <p>Java class for obj_trajectory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_trajectory">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameWell" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="nameWellbore" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_trajectory" minOccurs="0"/>
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
@XmlType(name = "obj_trajectory", propOrder = {
    "nameWell",
    "nameWellbore",
    "name",
    "objectGrowing",
    "parentTrajectory",
    "dTimTrajStart",
    "dTimTrajEnd",
    "mdMn",
    "mdMx",
    "serviceCompany",
    "magDeclUsed",
    "gridCorUsed",
    "aziVertSect",
    "dispNsVertSectOrig",
    "dispEwVertSectOrig",
    "definitive",
    "memory",
    "finalTraj",
    "aziRef",
    "trajectoryStation",
    "commonData",
    "customData"
})
public class ObjTrajectory extends AbstractWitsmlObject {

    @XmlElement(required = true)
    protected String nameWell;
    @XmlElement(required = true)
    protected String nameWellbore;
    @XmlElement(required = true)
    protected String name;
    protected Boolean objectGrowing;
    protected CsRefWellboreTrajectory parentTrajectory;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimTrajStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimTrajEnd;
    protected MeasuredDepthCoord mdMn;
    protected MeasuredDepthCoord mdMx;
    protected String serviceCompany;
    protected PlaneAngleMeasure magDeclUsed;
    protected PlaneAngleMeasure gridCorUsed;
    protected PlaneAngleMeasure aziVertSect;
    protected LengthMeasure dispNsVertSectOrig;
    protected LengthMeasure dispEwVertSectOrig;
    protected Boolean definitive;
    protected Boolean memory;
    protected Boolean finalTraj;
    @XmlSchemaType(name = "string")
    protected String aziRef;
    protected List<CsTrajectoryStation> trajectoryStation;
    protected CsCommonData commonData;
    protected String customData;
    @XmlAttribute(name = "uidWell")
    protected String uidWell;
    @XmlAttribute(name = "uidWellbore")
    protected String uidWellbore;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * get the parent uid as a string
     */
    @Override
    public String getParentUid() {
        return this.uidWellbore;
    }

    /**
     * get the parent uid as a string
     */
    @Override
    public String getGrandParentUid() {
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
     * Gets the value of the nameWellbore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWellbore() {
        return nameWellbore;
    }

    /**
     * Sets the value of the nameWellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWellbore(String value) {
        this.nameWellbore = value;
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
     * Gets the value of the objectGrowing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObjectGrowing() {
        return objectGrowing;
    }

    /**
     * Sets the value of the objectGrowing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObjectGrowing(Boolean value) {
        this.objectGrowing = value;
    }

    /**
     * Gets the value of the parentTrajectory property.
     * 
     * @return
     *     possible object is
     *     {@link CsRefWellboreTrajectory }
     *     
     */
    public CsRefWellboreTrajectory getParentTrajectory() {
        return parentTrajectory;
    }

    /**
     * Sets the value of the parentTrajectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsRefWellboreTrajectory }
     *     
     */
    public void setParentTrajectory(CsRefWellboreTrajectory value) {
        this.parentTrajectory = value;
    }

    /**
     * Gets the value of the dTimTrajStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimTrajStart() {
        return dTimTrajStart;
    }

    /**
     * Sets the value of the dTimTrajStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimTrajStart(XMLGregorianCalendar value) {
        this.dTimTrajStart = value;
    }

    /**
     * Gets the value of the dTimTrajEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimTrajEnd() {
        return dTimTrajEnd;
    }

    /**
     * Sets the value of the dTimTrajEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimTrajEnd(XMLGregorianCalendar value) {
        this.dTimTrajEnd = value;
    }

    /**
     * Gets the value of the mdMn property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdMn() {
        return mdMn;
    }

    /**
     * Sets the value of the mdMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdMn(MeasuredDepthCoord value) {
        this.mdMn = value;
    }

    /**
     * Gets the value of the mdMx property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdMx() {
        return mdMx;
    }

    /**
     * Sets the value of the mdMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdMx(MeasuredDepthCoord value) {
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
     * Gets the value of the gridCorUsed property.
     * 
     * @return
     *     possible object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public PlaneAngleMeasure getGridCorUsed() {
        return gridCorUsed;
    }

    /**
     * Sets the value of the gridCorUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaneAngleMeasure }
     *     
     */
    public void setGridCorUsed(PlaneAngleMeasure value) {
        this.gridCorUsed = value;
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
    public Boolean isDefinitive() {
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
    public void setDefinitive(Boolean value) {
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
    public Boolean isMemory() {
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
    public void setMemory(Boolean value) {
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
    public Boolean isFinalTraj() {
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
    public void setFinalTraj(Boolean value) {
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
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trajectoryStation property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getTrajectoryStation().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsTrajectoryStation }
     * 
     * 
     */
    public List<CsTrajectoryStation> getTrajectoryStation() {
        if (trajectoryStation == null) {
            trajectoryStation = new ArrayList<CsTrajectoryStation>();
        }
        return this.trajectoryStation;
    }

    public void setTrajectoryStation(List<CsTrajectoryStation> stationList) {
        this.trajectoryStation = stationList;
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
     *     possible object is String
     *     
     */
    public String getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is String
     *     
     */
    public void setCustomData(String value) {
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
     * Gets the value of the uidWellbore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidWellbore() {
        return uidWellbore;
    }

    /**
     * Sets the value of the uidWellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidWellbore(String value) {
        this.uidWellbore = value;
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
            if ("1.4.1.1".equals(version)) {
                com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectorys trajectorys = new com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectorys();
                trajectorys.addTrajectory(TrajectoryConverter.convertTo1411(this));
                return WitsmlMarshal.serialize(trajectorys);
            } else if ("1.3.1.1".equals(version)) {
                ObjTrajectorys trajectorys = new ObjTrajectorys();
                trajectorys.addTrajectory(this);
                return WitsmlMarshal.serialize(trajectorys);
            } else if ("2.0".equals(version)) {
                return WitsmlMarshal.serialize(TrajectoryConverter.convertTo20(this));
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
                return WitsmlMarshal.serializeToJSON(TrajectoryConverter.convertTo1411(this));
            } else if ("1.3.1.1".equals(version)) {
                return WitsmlMarshal.serializeToJSON(this);
            } else if ("2.0".equals(version)) {
                return WitsmlMarshal.serializeToJSON(TrajectoryConverter.convertTo20(this));
            } else {
                return null; // unsupported version
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
