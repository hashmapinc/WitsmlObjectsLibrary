package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.*;

@XmlTransient
public abstract class IndexedObject {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "index", required = true)
    protected Short index;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "uom")
    protected String uom;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * The intended abstract supertype of all enumerated "types".
     * 			This abstract type allows the maximum length of a type enumeration to be centrally defined.
     * 			This type should not be used directly except to derive another type.
     * 			It should also be used for uncontrolled strings which are candidates to become enumerations at a future date.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the index property.
     *
     */
    public short getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     *
     */
    public void setIndex(short value) {
        this.index = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

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
}
