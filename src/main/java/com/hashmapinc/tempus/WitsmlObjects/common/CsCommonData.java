package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlTransient
public abstract class CsCommonData {

    protected String sourceName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimCreation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTimLastChange;
    protected String comments;

    /**
     * Gets the value of the sourceName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the dTimCreation property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDTimCreation() {
        return dTimCreation;
    }

    /**
     * Sets the value of the dTimCreation property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDTimCreation(XMLGregorianCalendar value) {
        this.dTimCreation = value;
    }

    /**
     * Gets the value of the dTimLastChange property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDTimLastChange() {
        return dTimLastChange;
    }

    /**
     * Sets the value of the dTimLastChange property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDTimLastChange(XMLGregorianCalendar value) {
        this.dTimLastChange = value;
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

}
