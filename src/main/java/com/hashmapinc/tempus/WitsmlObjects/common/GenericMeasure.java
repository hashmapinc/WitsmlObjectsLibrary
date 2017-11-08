package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class GenericMeasure extends AbstractMeasure {

    @XmlAttribute(name = "uom")
    protected String uom;

    /**
     * Gets the value of the uom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUom(String value) {
        this.uom = value;
    }
}
