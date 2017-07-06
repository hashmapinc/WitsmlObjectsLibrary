package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Hole Opener Component Schema
 * 
 * <p>Java class for cs_holeOpener complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_holeOpener">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="typeHoleOpener" type="{http://www.witsml.org/schemas/131}HoleOpenerType" minOccurs="0"/>
 *         <element name="numCutter" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="manufacturer" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="diaHoleOpener" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="customData" type="{http://www.witsml.org/schemas/131}cs_customData" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_holeOpener", propOrder = {
    "typeHoleOpener",
    "numCutter",
    "manufacturer",
    "diaHoleOpener",
    "customData"
})
public class CsHoleOpener {

    @XmlSchemaType(name = "string")
    protected HoleOpenerType typeHoleOpener;
    protected Short numCutter;
    protected String manufacturer;
    protected LengthMeasure diaHoleOpener;
    protected CsCustomData customData;

    /**
     * Gets the value of the typeHoleOpener property.
     * 
     * @return
     *     possible object is
     *     {@link HoleOpenerType }
     *     
     */
    public HoleOpenerType getTypeHoleOpener() {
        return typeHoleOpener;
    }

    /**
     * Sets the value of the typeHoleOpener property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoleOpenerType }
     *     
     */
    public void setTypeHoleOpener(HoleOpenerType value) {
        this.typeHoleOpener = value;
    }

    /**
     * Gets the value of the numCutter property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumCutter() {
        return numCutter;
    }

    /**
     * Sets the value of the numCutter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumCutter(Short value) {
        this.numCutter = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the diaHoleOpener property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaHoleOpener() {
        return diaHoleOpener;
    }

    /**
     * Sets the value of the diaHoleOpener property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaHoleOpener(LengthMeasure value) {
        this.diaHoleOpener = value;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link CsCustomData }
     *     
     */
    public CsCustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsCustomData }
     *     
     */
    public void setCustomData(CsCustomData value) {
        this.customData = value;
    }

}
