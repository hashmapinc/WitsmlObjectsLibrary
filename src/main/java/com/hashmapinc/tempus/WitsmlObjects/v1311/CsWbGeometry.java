package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WITSML - Wellbore Geometry Component Schema 
 * 
 * <p>Java class for cs_wbGeometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_wbGeometry">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <group ref="{http://www.witsml.org/schemas/131}grp_wbGeometry" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_wbGeometry", propOrder = {
    "dTimReport",
    "mdBottom",
    "gapAir",
    "depthWaterMean",
    "wbGeometrySection"
})
public class CsWbGeometry {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimReport;
    protected MeasuredDepthCoord mdBottom;
    protected LengthMeasure gapAir;
    protected LengthMeasure depthWaterMean;
    protected List<CsWbGeometrySection> wbGeometrySection;

    /**
     * Gets the value of the dTimReport property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTimReport() {
        return dTimReport;
    }

    /**
     * Sets the value of the dTimReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTimReport(XMLGregorianCalendar value) {
        this.dTimReport = value;
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
     * Gets the value of the gapAir property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getGapAir() {
        return gapAir;
    }

    /**
     * Sets the value of the gapAir property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setGapAir(LengthMeasure value) {
        this.gapAir = value;
    }

    /**
     * Gets the value of the depthWaterMean property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDepthWaterMean() {
        return depthWaterMean;
    }

    /**
     * Sets the value of the depthWaterMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDepthWaterMean(LengthMeasure value) {
        this.depthWaterMean = value;
    }

    /**
     * Gets the value of the wbGeometrySection property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wbGeometrySection property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getWbGeometrySection().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsWbGeometrySection }
     * 
     * 
     */
    public List<CsWbGeometrySection> getWbGeometrySection() {
        if (wbGeometrySection == null) {
            wbGeometrySection = new ArrayList<CsWbGeometrySection>();
        }
        return this.wbGeometrySection;
    }

}
