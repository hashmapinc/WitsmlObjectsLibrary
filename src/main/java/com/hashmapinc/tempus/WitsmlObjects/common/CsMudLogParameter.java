package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlTransient
public abstract class CsMudLogParameter {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTime;
    protected MeasuredDepthCoord mdTop;
    protected MeasuredDepthCoord mdBottom;
    protected String text;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the dTime property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDTime() {
        return dTime;
    }

    /**
     * Sets the value of the dTime property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDTime(XMLGregorianCalendar value) {
        this.dTime = value;
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
     * Gets the value of the text property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setText(String value) {
        this.text = value;
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
