package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlTransient
public abstract class CsLogCurveInfo {

    protected String classWitsml;
    protected String unit;
    protected String nullValue;
    protected Boolean alternateIndex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minDateTimeIndex;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxDateTimeIndex;
    protected String curveDescription;
    protected String dataSource;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the classWitsml property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClassWitsml() {
        return classWitsml;
    }

    /**
     * Sets the value of the classWitsml property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClassWitsml(String value) {
        this.classWitsml = value;
    }

    /**
     * Gets the value of the unit property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the nullValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNullValue() {
        return nullValue;
    }

    /**
     * Sets the value of the nullValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNullValue(String value) {
        this.nullValue = value;
    }

    /**
     * Gets the value of the alternateIndex property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isAlternateIndex() {
        return alternateIndex;
    }

    /**
     * Sets the value of the alternateIndex property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAlternateIndex(Boolean value) {
        this.alternateIndex = value;
    }

    /**
     * Gets the value of the minDateTimeIndex property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getMinDateTimeIndex() {
        return minDateTimeIndex;
    }

    /**
     * Sets the value of the minDateTimeIndex property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setMinDateTimeIndex(XMLGregorianCalendar value) {
        this.minDateTimeIndex = value;
    }

    /**
     * Gets the value of the maxDateTimeIndex property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getMaxDateTimeIndex() {
        return maxDateTimeIndex;
    }

    /**
     * Sets the value of the maxDateTimeIndex property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setMaxDateTimeIndex(XMLGregorianCalendar value) {
        this.maxDateTimeIndex = value;
    }

    /**
     * Gets the value of the curveDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurveDescription() {
        return curveDescription;
    }

    /**
     * Sets the value of the curveDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurveDescription(String value) {
        this.curveDescription = value;
    }

    /**
     * Gets the value of the dataSource property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDataSource(String value) {
        this.dataSource = value;
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
