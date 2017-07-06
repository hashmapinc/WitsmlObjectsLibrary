package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  WITSML - Chromatographic Component Schema 
 * 
 * <p>Java class for cs_chromatograph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_chromatograph">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dTim" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="mdTop" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="mdBottom" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="wtMudIn" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="wtMudOut" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="chromType" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="eTimChromCycle" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="chromIntRpt" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="methAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="methMn" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="methMx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ethAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ethMn" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ethMx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="propAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="propMn" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="propMx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ibutAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ibutMn" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ibutMx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="nbutAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="nbutMn" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="nbutMx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ipentAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ipentMn" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ipentMx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="npentAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="npentMn" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="npentMx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="epentAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="epentMn" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="epentMx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ihexAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ihexMn" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="ihexMx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="nhexAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="nhexMn" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="nhexMx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="co2Av" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="co2Mn" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="co2Mx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="h2sAv" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="h2sMn" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="h2sMx" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *         <element name="acetylene" type="{http://www.witsml.org/schemas/131}volumePerVolumeMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_chromatograph", propOrder = {
    "dTim",
    "mdTop",
    "mdBottom",
    "wtMudIn",
    "wtMudOut",
    "chromType",
    "eTimChromCycle",
    "chromIntRpt",
    "methAv",
    "methMn",
    "methMx",
    "ethAv",
    "ethMn",
    "ethMx",
    "propAv",
    "propMn",
    "propMx",
    "ibutAv",
    "ibutMn",
    "ibutMx",
    "nbutAv",
    "nbutMn",
    "nbutMx",
    "ipentAv",
    "ipentMn",
    "ipentMx",
    "npentAv",
    "npentMn",
    "npentMx",
    "epentAv",
    "epentMn",
    "epentMx",
    "ihexAv",
    "ihexMn",
    "ihexMx",
    "nhexAv",
    "nhexMn",
    "nhexMx",
    "co2Av",
    "co2Mn",
    "co2Mx",
    "h2SAv",
    "h2SMn",
    "h2SMx",
    "acetylene"
})
public class CsChromatograph {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected MeasuredDepthCoord mdTop;
    protected MeasuredDepthCoord mdBottom;
    protected DensityMeasure wtMudIn;
    protected DensityMeasure wtMudOut;
    protected String chromType;
    protected TimeMeasure eTimChromCycle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar chromIntRpt;
    protected VolumePerVolumeMeasure methAv;
    protected VolumePerVolumeMeasure methMn;
    protected VolumePerVolumeMeasure methMx;
    protected VolumePerVolumeMeasure ethAv;
    protected VolumePerVolumeMeasure ethMn;
    protected VolumePerVolumeMeasure ethMx;
    protected VolumePerVolumeMeasure propAv;
    protected VolumePerVolumeMeasure propMn;
    protected VolumePerVolumeMeasure propMx;
    protected VolumePerVolumeMeasure ibutAv;
    protected VolumePerVolumeMeasure ibutMn;
    protected VolumePerVolumeMeasure ibutMx;
    protected VolumePerVolumeMeasure nbutAv;
    protected VolumePerVolumeMeasure nbutMn;
    protected VolumePerVolumeMeasure nbutMx;
    protected VolumePerVolumeMeasure ipentAv;
    protected VolumePerVolumeMeasure ipentMn;
    protected VolumePerVolumeMeasure ipentMx;
    protected VolumePerVolumeMeasure npentAv;
    protected VolumePerVolumeMeasure npentMn;
    protected VolumePerVolumeMeasure npentMx;
    protected VolumePerVolumeMeasure epentAv;
    protected VolumePerVolumeMeasure epentMn;
    protected VolumePerVolumeMeasure epentMx;
    protected VolumePerVolumeMeasure ihexAv;
    protected VolumePerVolumeMeasure ihexMn;
    protected VolumePerVolumeMeasure ihexMx;
    protected VolumePerVolumeMeasure nhexAv;
    protected VolumePerVolumeMeasure nhexMn;
    protected VolumePerVolumeMeasure nhexMx;
    protected VolumePerVolumeMeasure co2Av;
    protected VolumePerVolumeMeasure co2Mn;
    protected VolumePerVolumeMeasure co2Mx;
    @XmlElement(name = "h2sAv")
    protected VolumePerVolumeMeasure h2SAv;
    @XmlElement(name = "h2sMn")
    protected VolumePerVolumeMeasure h2SMn;
    @XmlElement(name = "h2sMx")
    protected VolumePerVolumeMeasure h2SMx;
    protected VolumePerVolumeMeasure acetylene;

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
     * Gets the value of the wtMudIn property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getWtMudIn() {
        return wtMudIn;
    }

    /**
     * Sets the value of the wtMudIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setWtMudIn(DensityMeasure value) {
        this.wtMudIn = value;
    }

    /**
     * Gets the value of the wtMudOut property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getWtMudOut() {
        return wtMudOut;
    }

    /**
     * Sets the value of the wtMudOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setWtMudOut(DensityMeasure value) {
        this.wtMudOut = value;
    }

    /**
     * Gets the value of the chromType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChromType() {
        return chromType;
    }

    /**
     * Sets the value of the chromType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChromType(String value) {
        this.chromType = value;
    }

    /**
     * Gets the value of the eTimChromCycle property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimChromCycle() {
        return eTimChromCycle;
    }

    /**
     * Sets the value of the eTimChromCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimChromCycle(TimeMeasure value) {
        this.eTimChromCycle = value;
    }

    /**
     * Gets the value of the chromIntRpt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChromIntRpt() {
        return chromIntRpt;
    }

    /**
     * Sets the value of the chromIntRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChromIntRpt(XMLGregorianCalendar value) {
        this.chromIntRpt = value;
    }

    /**
     * Gets the value of the methAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getMethAv() {
        return methAv;
    }

    /**
     * Sets the value of the methAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setMethAv(VolumePerVolumeMeasure value) {
        this.methAv = value;
    }

    /**
     * Gets the value of the methMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getMethMn() {
        return methMn;
    }

    /**
     * Sets the value of the methMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setMethMn(VolumePerVolumeMeasure value) {
        this.methMn = value;
    }

    /**
     * Gets the value of the methMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getMethMx() {
        return methMx;
    }

    /**
     * Sets the value of the methMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setMethMx(VolumePerVolumeMeasure value) {
        this.methMx = value;
    }

    /**
     * Gets the value of the ethAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getEthAv() {
        return ethAv;
    }

    /**
     * Sets the value of the ethAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setEthAv(VolumePerVolumeMeasure value) {
        this.ethAv = value;
    }

    /**
     * Gets the value of the ethMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getEthMn() {
        return ethMn;
    }

    /**
     * Sets the value of the ethMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setEthMn(VolumePerVolumeMeasure value) {
        this.ethMn = value;
    }

    /**
     * Gets the value of the ethMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getEthMx() {
        return ethMx;
    }

    /**
     * Sets the value of the ethMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setEthMx(VolumePerVolumeMeasure value) {
        this.ethMx = value;
    }

    /**
     * Gets the value of the propAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getPropAv() {
        return propAv;
    }

    /**
     * Sets the value of the propAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setPropAv(VolumePerVolumeMeasure value) {
        this.propAv = value;
    }

    /**
     * Gets the value of the propMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getPropMn() {
        return propMn;
    }

    /**
     * Sets the value of the propMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setPropMn(VolumePerVolumeMeasure value) {
        this.propMn = value;
    }

    /**
     * Gets the value of the propMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getPropMx() {
        return propMx;
    }

    /**
     * Sets the value of the propMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setPropMx(VolumePerVolumeMeasure value) {
        this.propMx = value;
    }

    /**
     * Gets the value of the ibutAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getIbutAv() {
        return ibutAv;
    }

    /**
     * Sets the value of the ibutAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setIbutAv(VolumePerVolumeMeasure value) {
        this.ibutAv = value;
    }

    /**
     * Gets the value of the ibutMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getIbutMn() {
        return ibutMn;
    }

    /**
     * Sets the value of the ibutMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setIbutMn(VolumePerVolumeMeasure value) {
        this.ibutMn = value;
    }

    /**
     * Gets the value of the ibutMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getIbutMx() {
        return ibutMx;
    }

    /**
     * Sets the value of the ibutMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setIbutMx(VolumePerVolumeMeasure value) {
        this.ibutMx = value;
    }

    /**
     * Gets the value of the nbutAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getNbutAv() {
        return nbutAv;
    }

    /**
     * Sets the value of the nbutAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setNbutAv(VolumePerVolumeMeasure value) {
        this.nbutAv = value;
    }

    /**
     * Gets the value of the nbutMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getNbutMn() {
        return nbutMn;
    }

    /**
     * Sets the value of the nbutMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setNbutMn(VolumePerVolumeMeasure value) {
        this.nbutMn = value;
    }

    /**
     * Gets the value of the nbutMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getNbutMx() {
        return nbutMx;
    }

    /**
     * Sets the value of the nbutMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setNbutMx(VolumePerVolumeMeasure value) {
        this.nbutMx = value;
    }

    /**
     * Gets the value of the ipentAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getIpentAv() {
        return ipentAv;
    }

    /**
     * Sets the value of the ipentAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setIpentAv(VolumePerVolumeMeasure value) {
        this.ipentAv = value;
    }

    /**
     * Gets the value of the ipentMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getIpentMn() {
        return ipentMn;
    }

    /**
     * Sets the value of the ipentMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setIpentMn(VolumePerVolumeMeasure value) {
        this.ipentMn = value;
    }

    /**
     * Gets the value of the ipentMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getIpentMx() {
        return ipentMx;
    }

    /**
     * Sets the value of the ipentMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setIpentMx(VolumePerVolumeMeasure value) {
        this.ipentMx = value;
    }

    /**
     * Gets the value of the npentAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getNpentAv() {
        return npentAv;
    }

    /**
     * Sets the value of the npentAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setNpentAv(VolumePerVolumeMeasure value) {
        this.npentAv = value;
    }

    /**
     * Gets the value of the npentMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getNpentMn() {
        return npentMn;
    }

    /**
     * Sets the value of the npentMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setNpentMn(VolumePerVolumeMeasure value) {
        this.npentMn = value;
    }

    /**
     * Gets the value of the npentMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getNpentMx() {
        return npentMx;
    }

    /**
     * Sets the value of the npentMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setNpentMx(VolumePerVolumeMeasure value) {
        this.npentMx = value;
    }

    /**
     * Gets the value of the epentAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getEpentAv() {
        return epentAv;
    }

    /**
     * Sets the value of the epentAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setEpentAv(VolumePerVolumeMeasure value) {
        this.epentAv = value;
    }

    /**
     * Gets the value of the epentMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getEpentMn() {
        return epentMn;
    }

    /**
     * Sets the value of the epentMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setEpentMn(VolumePerVolumeMeasure value) {
        this.epentMn = value;
    }

    /**
     * Gets the value of the epentMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getEpentMx() {
        return epentMx;
    }

    /**
     * Sets the value of the epentMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setEpentMx(VolumePerVolumeMeasure value) {
        this.epentMx = value;
    }

    /**
     * Gets the value of the ihexAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getIhexAv() {
        return ihexAv;
    }

    /**
     * Sets the value of the ihexAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setIhexAv(VolumePerVolumeMeasure value) {
        this.ihexAv = value;
    }

    /**
     * Gets the value of the ihexMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getIhexMn() {
        return ihexMn;
    }

    /**
     * Sets the value of the ihexMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setIhexMn(VolumePerVolumeMeasure value) {
        this.ihexMn = value;
    }

    /**
     * Gets the value of the ihexMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getIhexMx() {
        return ihexMx;
    }

    /**
     * Sets the value of the ihexMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setIhexMx(VolumePerVolumeMeasure value) {
        this.ihexMx = value;
    }

    /**
     * Gets the value of the nhexAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getNhexAv() {
        return nhexAv;
    }

    /**
     * Sets the value of the nhexAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setNhexAv(VolumePerVolumeMeasure value) {
        this.nhexAv = value;
    }

    /**
     * Gets the value of the nhexMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getNhexMn() {
        return nhexMn;
    }

    /**
     * Sets the value of the nhexMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setNhexMn(VolumePerVolumeMeasure value) {
        this.nhexMn = value;
    }

    /**
     * Gets the value of the nhexMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getNhexMx() {
        return nhexMx;
    }

    /**
     * Sets the value of the nhexMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setNhexMx(VolumePerVolumeMeasure value) {
        this.nhexMx = value;
    }

    /**
     * Gets the value of the co2Av property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getCo2Av() {
        return co2Av;
    }

    /**
     * Sets the value of the co2Av property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setCo2Av(VolumePerVolumeMeasure value) {
        this.co2Av = value;
    }

    /**
     * Gets the value of the co2Mn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getCo2Mn() {
        return co2Mn;
    }

    /**
     * Sets the value of the co2Mn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setCo2Mn(VolumePerVolumeMeasure value) {
        this.co2Mn = value;
    }

    /**
     * Gets the value of the co2Mx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getCo2Mx() {
        return co2Mx;
    }

    /**
     * Sets the value of the co2Mx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setCo2Mx(VolumePerVolumeMeasure value) {
        this.co2Mx = value;
    }

    /**
     * Gets the value of the h2SAv property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getH2SAv() {
        return h2SAv;
    }

    /**
     * Sets the value of the h2SAv property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setH2SAv(VolumePerVolumeMeasure value) {
        this.h2SAv = value;
    }

    /**
     * Gets the value of the h2SMn property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getH2SMn() {
        return h2SMn;
    }

    /**
     * Sets the value of the h2SMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setH2SMn(VolumePerVolumeMeasure value) {
        this.h2SMn = value;
    }

    /**
     * Gets the value of the h2SMx property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getH2SMx() {
        return h2SMx;
    }

    /**
     * Sets the value of the h2SMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setH2SMx(VolumePerVolumeMeasure value) {
        this.h2SMx = value;
    }

    /**
     * Gets the value of the acetylene property.
     * 
     * @return
     *     possible object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public VolumePerVolumeMeasure getAcetylene() {
        return acetylene;
    }

    /**
     * Sets the value of the acetylene property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumePerVolumeMeasure }
     *     
     */
    public void setAcetylene(VolumePerVolumeMeasure value) {
        this.acetylene = value;
    }

}
