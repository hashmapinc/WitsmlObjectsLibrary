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


/**
 * WITSML - Geology Interval Component Schema
 * 
 * <p>Java class for cs_geologyInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_geologyInterval">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="typeLithology" type="{http://www.witsml.org/schemas/131}String"/>
 *         <element name="mdTop" type="{http://www.witsml.org/schemas/131}measuredDepthCoord"/>
 *         <element name="mdBottom" type="{http://www.witsml.org/schemas/131}measuredDepthCoord"/>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="tvdTop" type="{http://www.witsml.org/schemas/131}wellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="tvdBase" type="{http://www.witsml.org/schemas/131}wellVerticalDepthCoord" minOccurs="0"/>
 *         <element name="ropAv" type="{http://www.witsml.org/schemas/131}velocityMeasure" minOccurs="0"/>
 *         <element name="ropMn" type="{http://www.witsml.org/schemas/131}velocityMeasure" minOccurs="0"/>
 *         <element name="ropMx" type="{http://www.witsml.org/schemas/131}velocityMeasure" minOccurs="0"/>
 *         <element name="wobAv" type="{http://www.witsml.org/schemas/131}forceMeasure" minOccurs="0"/>
 *         <element name="tqAv" type="{http://www.witsml.org/schemas/131}momentOfForceMeasure" minOccurs="0"/>
 *         <element name="currentAv" type="{http://www.witsml.org/schemas/131}electricCurrentMeasure" minOccurs="0"/>
 *         <element name="rpmAv" type="{http://www.witsml.org/schemas/131}anglePerTimeMeasure" minOccurs="0"/>
 *         <element name="wtMudAv" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="ecdTdAv" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="dxcAv" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="lithology" type="{http://www.witsml.org/schemas/131}cs_lithology" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="show" type="{http://www.witsml.org/schemas/131}cs_show" minOccurs="0"/>
 *         <element name="chromatograph" type="{http://www.witsml.org/schemas/131}cs_chromatograph" minOccurs="0"/>
 *         <element name="mudGas" type="{http://www.witsml.org/schemas/131}cs_mudGas" minOccurs="0"/>
 *         <element name="densBulk" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="densShale" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="calcite" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="dolomite" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="cec" type="{http://www.witsml.org/schemas/131}equivalentPerMassMeasure" minOccurs="0"/>
 *         <element name="qft" type="{http://www.witsml.org/schemas/131}illuminanceMeasure" minOccurs="0"/>
 *         <element name="calcStab" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="nameFormation" type="{http://www.witsml.org/schemas/131}nameString" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="lithostratigraphic" type="{http://www.witsml.org/schemas/131}nameString" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="chronostratigraphic" type="{http://www.witsml.org/schemas/131}nameString" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sizeMn" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="sizeMx" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenPlug" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="description" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="cuttingFluid" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="cleaningMethod" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="dryingMethod" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="comments" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
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
@XmlType(name = "cs_geologyInterval", propOrder = {
    "typeLithology",
    "mdTop",
    "mdBottom",
    "dTim",
    "tvdTop",
    "tvdBase",
    "ropAv",
    "ropMn",
    "ropMx",
    "wobAv",
    "tqAv",
    "currentAv",
    "rpmAv",
    "wtMudAv",
    "ecdTdAv",
    "dxcAv",
    "lithology",
    "show",
    "chromatograph",
    "mudGas",
    "densBulk",
    "densShale",
    "calcite",
    "dolomite",
    "cec",
    "qft",
    "calcStab",
    "nameFormation",
    "lithostratigraphic",
    "chronostratigraphic",
    "sizeMn",
    "sizeMx",
    "lenPlug",
    "description",
    "cuttingFluid",
    "cleaningMethod",
    "dryingMethod",
    "comments"
})
public class CsGeologyInterval {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String typeLithology;
    @XmlElement(required = true)
    protected MeasuredDepthCoord mdTop;
    @XmlElement(required = true)
    protected MeasuredDepthCoord mdBottom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected WellVerticalDepthCoord tvdTop;
    protected WellVerticalDepthCoord tvdBase;
    protected VelocityMeasure ropAv;
    protected VelocityMeasure ropMn;
    protected VelocityMeasure ropMx;
    protected ForceMeasure wobAv;
    protected MomentOfForceMeasure tqAv;
    protected ElectricCurrentMeasure currentAv;
    protected AnglePerTimeMeasure rpmAv;
    protected DensityMeasure wtMudAv;
    protected DensityMeasure ecdTdAv;
    protected Double dxcAv;
    protected List<CsLithology> lithology;
    protected CsShow show;
    protected CsChromatograph chromatograph;
    protected CsMudGas mudGas;
    protected DensityMeasure densBulk;
    protected DensityMeasure densShale;
    protected VolumePerVolumeMeasure calcite;
    protected VolumePerVolumeMeasure dolomite;
    protected EquivalentPerMassMeasure cec;
    protected IlluminanceMeasure qft;
    protected VolumePerVolumeMeasure calcStab;
    protected List<String> nameFormation;
    protected List<String> lithostratigraphic;
    protected List<String> chronostratigraphic;
    protected LengthMeasure sizeMn;
    protected LengthMeasure sizeMx;
    protected LengthMeasure lenPlug;
    protected String description;
    protected String cuttingFluid;
    protected String cleaningMethod;
    protected String dryingMethod;
    protected String comments;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the typeLithology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeLithology() {
        return typeLithology;
    }

    /**
     * Sets the value of the typeLithology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeLithology(String value) {
        this.typeLithology = value;
    }

    /**
     * Gets the value of the mdTop property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdTop() {
        return mdTop;
    }

    /**
     * Sets the value of the mdTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdTop(MeasuredDepthCoord value) {
        this.mdTop = value;
    }

    /**
     * Gets the value of the mdBottom property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdBottom() {
        return mdBottom;
    }

    /**
     * Sets the value of the mdBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdBottom(MeasuredDepthCoord value) {
        this.mdBottom = value;
    }

    /**
     * Gets the value of the dTim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTim() {
        return dTim;
    }

    /**
     * Sets the value of the dTim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTim(XMLGregorianCalendar value) {
        this.dTim = value;
    }

    /**
     * Gets the value of the tvdTop property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdTop() {
        return tvdTop;
    }

    /**
     * Sets the value of the tvdTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdTop(WellVerticalDepthCoord value) {
        this.tvdTop = value;
    }

    /**
     * Gets the value of the tvdBase property.
     * 
     * @return
     *     possible object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public WellVerticalDepthCoord getTvdBase() {
        return tvdBase;
    }

    /**
     * Sets the value of the tvdBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellVerticalDepthCoord }
     *     
     */
    public void setTvdBase(WellVerticalDepthCoord value) {
        this.tvdBase = value;
    }

    /**
     * Gets the value of the ropAv property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getRopAv() {
        return ropAv;
    }

    /**
     * Sets the value of the ropAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setRopAv(VelocityMeasure value) {
        this.ropAv = value;
    }

    /**
     * Gets the value of the ropMn property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getRopMn() {
        return ropMn;
    }

    /**
     * Sets the value of the ropMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setRopMn(VelocityMeasure value) {
        this.ropMn = value;
    }

    /**
     * Gets the value of the ropMx property.
     * 
     * @return
     *     possible object is
     *     {@link VelocityMeasure }
     *     
     */
    public VelocityMeasure getRopMx() {
        return ropMx;
    }

    /**
     * Sets the value of the ropMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocityMeasure }
     *     
     */
    public void setRopMx(VelocityMeasure value) {
        this.ropMx = value;
    }

    /**
     * Gets the value of the wobAv property.
     * 
     * @return
     *     possible object is
     *     {@link ForceMeasure }
     *     
     */
    public ForceMeasure getWobAv() {
        return wobAv;
    }

    /**
     * Sets the value of the wobAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceMeasure }
     *     
     */
    public void setWobAv(ForceMeasure value) {
        this.wobAv = value;
    }

    /**
     * Gets the value of the tqAv property.
     * 
     * @return
     *     possible object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public MomentOfForceMeasure getTqAv() {
        return tqAv;
    }

    /**
     * Sets the value of the tqAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link MomentOfForceMeasure }
     *     
     */
    public void setTqAv(MomentOfForceMeasure value) {
        this.tqAv = value;
    }

    /**
     * Gets the value of the currentAv property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricCurrentMeasure }
     *     
     */
    public ElectricCurrentMeasure getCurrentAv() {
        return currentAv;
    }

    /**
     * Sets the value of the currentAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricCurrentMeasure }
     *     
     */
    public void setCurrentAv(ElectricCurrentMeasure value) {
        this.currentAv = value;
    }

    /**
     * Gets the value of the rpmAv property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public AnglePerTimeMeasure getRpmAv() {
        return rpmAv;
    }

    /**
     * Sets the value of the rpmAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePerTimeMeasure }
     *     
     */
    public void setRpmAv(AnglePerTimeMeasure value) {
        this.rpmAv = value;
    }

    /**
     * Gets the value of the wtMudAv property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getWtMudAv() {
        return wtMudAv;
    }

    /**
     * Sets the value of the wtMudAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setWtMudAv(DensityMeasure value) {
        this.wtMudAv = value;
    }

    /**
     * Gets the value of the ecdTdAv property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getEcdTdAv() {
        return ecdTdAv;
    }

    /**
     * Sets the value of the ecdTdAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setEcdTdAv(DensityMeasure value) {
        this.ecdTdAv = value;
    }

    /**
     * Gets the value of the dxcAv property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDxcAv() {
        return dxcAv;
    }

    /**
     * Sets the value of the dxcAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDxcAv(Double value) {
        this.dxcAv = value;
    }

    /**
     * Gets the value of the lithology property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lithology property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getLithology().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsLithology }
     * 
     * 
     */
    public List<CsLithology> getLithology() {
        if (lithology == null) {
            lithology = new ArrayList<CsLithology>();
        }
        return this.lithology;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link CsShow }
     *     
     */
    public CsShow getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsShow }
     *     
     */
    public void setShow(CsShow value) {
        this.show = value;
    }

    /**
     * Gets the value of the chromatograph property.
     * 
     * @return
     *     possible object is
     *     {@link CsChromatograph }
     *     
     */
    public CsChromatograph getChromatograph() {
        return chromatograph;
    }

    /**
     * Sets the value of the chromatograph property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsChromatograph }
     *     
     */
    public void setChromatograph(CsChromatograph value) {
        this.chromatograph = value;
    }

    /**
     * Gets the value of the mudGas property.
     * 
     * @return
     *     possible object is
     *     {@link CsMudGas }
     *     
     */
    public CsMudGas getMudGas() {
        return mudGas;
    }

    /**
     * Sets the value of the mudGas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsMudGas }
     *     
     */
    public void setMudGas(CsMudGas value) {
        this.mudGas = value;
    }

    /**
     * Gets the value of the densBulk property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensBulk() {
        return densBulk;
    }

    /**
     * Sets the value of the densBulk property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensBulk(DensityMeasure value) {
        this.densBulk = value;
    }

    /**
     * Gets the value of the densShale property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getDensShale() {
        return densShale;
    }

    /**
     * Sets the value of the densShale property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setDensShale(DensityMeasure value) {
        this.densShale = value;
    }

    /**
     * Gets the value of the calcite property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getCalcite() {
        return calcite;
    }

    /**
     * Sets the value of the calcite property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setCalcite(VolumePerVolumeMeasure value) {
        this.calcite = value;
    }

    /**
     * Gets the value of the dolomite property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getDolomite() {
        return dolomite;
    }

    /**
     * Sets the value of the dolomite property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setDolomite(VolumePerVolumeMeasure value) {
        this.dolomite = value;
    }

    /**
     * Gets the value of the cec property.
     * 
     * @return
     *     possible object is
     *     {@link EquivalentPerMassMeasure }
     *     
     */
    public EquivalentPerMassMeasure getCec() {
        return cec;
    }

    /**
     * Sets the value of the cec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivalentPerMassMeasure }
     *     
     */
    public void setCec(EquivalentPerMassMeasure value) {
        this.cec = value;
    }

    /**
     * Gets the value of the qft property.
     * 
     * @return
     *     possible object is
     *     {@link IlluminanceMeasure }
     *     
     */
    public IlluminanceMeasure getQft() {
        return qft;
    }

    /**
     * Sets the value of the qft property.
     * 
     * @param value
     *     allowed object is
     *     {@link IlluminanceMeasure }
     *     
     */
    public void setQft(IlluminanceMeasure value) {
        this.qft = value;
    }

    /**
     * Gets the value of the calcStab property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getCalcStab() {
        return calcStab;
    }

    /**
     * Sets the value of the calcStab property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setCalcStab(VolumePerVolumeMeasure value) {
        this.calcStab = value;
    }

    /**
     * Gets the value of the nameFormation property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameFormation property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getNameFormation().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNameFormation() {
        if (nameFormation == null) {
            nameFormation = new ArrayList<String>();
        }
        return this.nameFormation;
    }

    /**
     * Gets the value of the lithostratigraphic property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lithostratigraphic property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getLithostratigraphic().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLithostratigraphic() {
        if (lithostratigraphic == null) {
            lithostratigraphic = new ArrayList<String>();
        }
        return this.lithostratigraphic;
    }

    /**
     * Gets the value of the chronostratigraphic property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chronostratigraphic property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getChronostratigraphic().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChronostratigraphic() {
        if (chronostratigraphic == null) {
            chronostratigraphic = new ArrayList<String>();
        }
        return this.chronostratigraphic;
    }

    /**
     * Gets the value of the sizeMn property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getSizeMn() {
        return sizeMn;
    }

    /**
     * Sets the value of the sizeMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setSizeMn(LengthMeasure value) {
        this.sizeMn = value;
    }

    /**
     * Gets the value of the sizeMx property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getSizeMx() {
        return sizeMx;
    }

    /**
     * Sets the value of the sizeMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setSizeMx(LengthMeasure value) {
        this.sizeMx = value;
    }

    /**
     * Gets the value of the lenPlug property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenPlug() {
        return lenPlug;
    }

    /**
     * Sets the value of the lenPlug property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenPlug(LengthMeasure value) {
        this.lenPlug = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the cuttingFluid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuttingFluid() {
        return cuttingFluid;
    }

    /**
     * Sets the value of the cuttingFluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuttingFluid(String value) {
        this.cuttingFluid = value;
    }

    /**
     * Gets the value of the cleaningMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleaningMethod() {
        return cleaningMethod;
    }

    /**
     * Sets the value of the cleaningMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleaningMethod(String value) {
        this.cleaningMethod = value;
    }

    /**
     * Gets the value of the dryingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDryingMethod() {
        return dryingMethod;
    }

    /**
     * Sets the value of the dryingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDryingMethod(String value) {
        this.dryingMethod = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
