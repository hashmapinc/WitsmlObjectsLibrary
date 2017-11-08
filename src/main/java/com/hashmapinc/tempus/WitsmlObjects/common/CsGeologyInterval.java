package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

@XmlTransient
public abstract class CsGeologyInterval {

    @XmlElement(required = true)
    protected MeasuredDepthCoord mdTop;
    @XmlElement(required = true)
    protected MeasuredDepthCoord mdBottom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTim;
    protected Double dxcAv;
    protected List<String> nameFormation;
    protected String description;
    protected String cuttingFluid;
    protected String cleaningMethod;
    protected String dryingMethod;
    protected String comments;
    @XmlAttribute(name = "uid")
    protected String uid;

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
