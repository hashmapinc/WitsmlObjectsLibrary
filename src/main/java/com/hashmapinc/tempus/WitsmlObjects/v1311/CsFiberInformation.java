package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The optical fiber used for distributed temperature surveys
 * 
 * <p>Java class for cs_fiberInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_fiberInformation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="installationDate" type="{http://www.witsml.org/schemas/131}anyDate" minOccurs="0"/>
 *         <element name="installationCompany" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="deInstallationDate" type="{http://www.witsml.org/schemas/131}anyDate" minOccurs="0"/>
 *         <element name="capillaryTubeDiameter" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="fiber" type="{http://www.witsml.org/schemas/131}cs_fiber" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_fiberInformation", propOrder = {
    "installationDate",
    "installationCompany",
    "deInstallationDate",
    "capillaryTubeDiameter",
    "fiber"
})
public class CsFiberInformation {

    protected String installationDate;
    protected String installationCompany;
    protected String deInstallationDate;
    protected LengthMeasure capillaryTubeDiameter;
    protected List<CsFiber> fiber;

    /**
     * Gets the value of the installationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationDate() {
        return installationDate;
    }

    /**
     * Sets the value of the installationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationDate(String value) {
        this.installationDate = value;
    }

    /**
     * Gets the value of the installationCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationCompany() {
        return installationCompany;
    }

    /**
     * Sets the value of the installationCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationCompany(String value) {
        this.installationCompany = value;
    }

    /**
     * Gets the value of the deInstallationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeInstallationDate() {
        return deInstallationDate;
    }

    /**
     * Sets the value of the deInstallationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeInstallationDate(String value) {
        this.deInstallationDate = value;
    }

    /**
     * Gets the value of the capillaryTubeDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getCapillaryTubeDiameter() {
        return capillaryTubeDiameter;
    }

    /**
     * Sets the value of the capillaryTubeDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setCapillaryTubeDiameter(LengthMeasure value) {
        this.capillaryTubeDiameter = value;
    }

    /**
     * Gets the value of the fiber property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiber property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getFiber().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsFiber }
     * 
     * 
     */
    public List<CsFiber> getFiber() {
        if (fiber == null) {
            fiber = new ArrayList<CsFiber>();
        }
        return this.fiber;
    }

}
