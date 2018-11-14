


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A reference to a rig within a wellbore. The wellbore may be defined within the context of another well. This value represents a foreign key from one node to another.
 * 
 * <p>Java class for RefWellboreRig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="RefWellboreRig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RigReference" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="WellboreParent" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="WellParent" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefWellboreRig", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "rigReference",
    "wellboreParent",
    "wellParent"
})
public class RefWellboreRig {

    @XmlElement(name = "RigReference", required = true)
    protected String rigReference;
    @XmlElement(name = "WellboreParent")
    protected String wellboreParent;
    @XmlElement(name = "WellParent")
    protected String wellParent;

    /**
     * Gets the value of the rigReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRigReference() {
        return rigReference;
    }

    /**
     * Sets the value of the rigReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRigReference(String value) {
        this.rigReference = value;
    }

    /**
     * Gets the value of the wellboreParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWellboreParent() {
        return wellboreParent;
    }

    /**
     * Sets the value of the wellboreParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWellboreParent(String value) {
        this.wellboreParent = value;
    }

    /**
     * Gets the value of the wellParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWellParent() {
        return wellParent;
    }

    /**
     * Sets the value of the wellParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWellParent(String value) {
        this.wellParent = value;
    }

}
