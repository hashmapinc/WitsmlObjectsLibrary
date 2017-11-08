package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for obj_well complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_well">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.witsml.org/schemas/131}nameString"/>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_well" minOccurs="0"/>
 *         <element name="commonData" type="{http://www.witsml.org/schemas/131}cs_commonData" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
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
@XmlType(name = "obj_well", propOrder = {
    "name",
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
    "pcInterest",
    "numAPI",
    "statusWell",
    "purposeWell",
    "fluidWell",
    "directionWell",
    "dTimSpud",
    "dTimPa",
    "wellheadElevation",
    "wellDatum",
    "groundElevation",
    "waterDepth",
    "wellLocation",
    "referencePoint",
    "wellCRS",
    "commonData",
    "customData"
})
public class ObjWell extends com.hashmapinc.tempus.WitsmlObjects.common.ObjWell {

    protected DimensionlessMeasure pcInterest;
    @XmlSchemaType(name = "string")
    protected WellStatus statusWell;
    @XmlSchemaType(name = "string")
    protected WellPurpose purposeWell;
    @XmlSchemaType(name = "string")
    protected WellFluid fluidWell;
    @XmlSchemaType(name = "string")
    protected WellDirection directionWell;
    protected WellElevationCoord wellheadElevation;
    protected List<CsWellDatum> wellDatum;
    protected WellElevationCoord groundElevation;
    protected WellVerticalDepthCoord waterDepth;
    protected List<CsLocation> wellLocation;
    protected List<CsReferencePoint> referencePoint;
    protected List<CsWellCRS> wellCRS;
    protected CsCommonData commonData;
    protected CsCustomData customData;

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
     * Gets the value of the statusWell property.
     * 
     * @return
     *     possible object is
     *     {@link WellStatus }
     *     
     */
    public WellStatus getStatusWell() {
        return statusWell;
    }

    /**
     * Sets the value of the statusWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellStatus }
     *     
     */
    public void setStatusWell(WellStatus value) {
        this.statusWell = value;
    }

    /**
     * Gets the value of the purposeWell property.
     * 
     * @return
     *     possible object is
     *     {@link WellPurpose }
     *     
     */
    public WellPurpose getPurposeWell() {
        return purposeWell;
    }

    /**
     * Sets the value of the purposeWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellPurpose }
     *     
     */
    public void setPurposeWell(WellPurpose value) {
        this.purposeWell = value;
    }

    /**
     * Gets the value of the fluidWell property.
     * 
     * @return
     *     possible object is
     *     {@link WellFluid }
     *     
     */
    public WellFluid getFluidWell() {
        return fluidWell;
    }

    /**
     * Sets the value of the fluidWell property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellFluid }
     *     
     */
    public void setFluidWell(WellFluid value) {
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
    public WellDirection getDirectionWell() {
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
    public void setDirectionWell(WellDirection value) {
        this.directionWell = value;
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
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellDatum property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getWellDatum().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsWellDatum }
     * 
     * 
     */
    public List<CsWellDatum> getWellDatum() {
        if (wellDatum == null) {
            wellDatum = new ArrayList<CsWellDatum>();
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

    /**
     * Gets the value of the waterDepth property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getWaterDepth() {
        return waterDepth;
    }

    /**
     * Sets the value of the waterDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setWaterDepth(WellVerticalDepthCoord value) {
        this.waterDepth = value;
    }

    /**
     * Gets the value of the wellLocation property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellLocation property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getWellLocation().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsLocation }
     * 
     * 
     */
    public List<CsLocation> getWellLocation() {
        if (wellLocation == null) {
            wellLocation = new ArrayList<CsLocation>();
        }
        return this.wellLocation;
    }

    /**
     * Gets the value of the referencePoint property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencePoint property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getReferencePoint().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsReferencePoint }
     * 
     * 
     */
    public List<CsReferencePoint> getReferencePoint() {
        if (referencePoint == null) {
            referencePoint = new ArrayList<CsReferencePoint>();
        }
        return this.referencePoint;
    }

    /**
     * Gets the value of the wellCRS property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellCRS property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getWellCRS().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsWellCRS }
     * 
     * 
     */
    public List<CsWellCRS> getWellCRS() {
        if (wellCRS == null) {
            wellCRS = new ArrayList<CsWellCRS>();
        }
        return this.wellCRS;
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
