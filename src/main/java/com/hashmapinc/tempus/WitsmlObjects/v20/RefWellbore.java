


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data that represents a foreign key to a wellbore. The wellbore may be defined within the context of another well.
 * 
 * <p>Java class for RefWellbore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="RefWellbore">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WellboreReference" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
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
@XmlType(name = "RefWellbore", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "wellboreReference",
    "wellParent"
})
public class RefWellbore {

    @XmlElement(name = "WellboreReference", required = true)
    protected String wellboreReference;
    @XmlElement(name = "WellParent")
    protected String wellParent;

    /**
     * Gets the value of the wellboreReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWellboreReference() {
        return wellboreReference;
    }

    /**
     * Sets the value of the wellboreReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWellboreReference(String value) {
        this.wellboreReference = value;
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
