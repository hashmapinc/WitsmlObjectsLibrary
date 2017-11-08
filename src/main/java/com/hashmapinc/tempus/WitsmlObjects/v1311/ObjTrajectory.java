package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

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
public class ObjTrajectory
    extends com.hashmapinc.tempus.WitsmlObjects.common.ObjTrajectory {

    protected CsRefWellboreTrajectory parentTrajectory;
    protected MeasuredDepthCoord mdMn;
    protected MeasuredDepthCoord mdMx;
    protected PlaneAngleMeasure magDeclUsed;
    protected PlaneAngleMeasure gridCorUsed;
    protected PlaneAngleMeasure aziVertSect;
    protected LengthMeasure dispNsVertSectOrig;
    protected LengthMeasure dispEwVertSectOrig;
    @XmlSchemaType(name = "string")
    protected AziRef aziRef;
    protected List<CsTrajectoryStation> trajectoryStation;
    protected CsCommonData commonData;
    protected CsCustomData customData;

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
     * Gets the value of the aziRef property.
     * 
     * @return
     *     possible object is
     *     {@link AziRef }
     *     
     */
    public AziRef getAziRef() {
        return aziRef;
    }

    /**
     * Sets the value of the aziRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AziRef }
     *     
     */
    public void setAziRef(AziRef value) {
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
