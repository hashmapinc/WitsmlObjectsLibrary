package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class MeasuredDepthCoord extends AbstractMeasure {

    @XmlAttribute(name = "datum")
    protected String datum;

    /**
     * Gets the value of the datum property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDatum(String value) {
        this.datum = value;
    }
}
