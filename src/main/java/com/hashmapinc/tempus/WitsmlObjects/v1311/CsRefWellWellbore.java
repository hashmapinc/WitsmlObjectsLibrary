package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data that represents a foreign key to a wellbore.
 * 			The wellbore may be defined within the context of another well.
 * 
 * <p>Java class for cs_refWellWellbore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_refWellWellbore">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="wellboreReference" type="{http://www.witsml.org/schemas/131}refNameString"/>
 *         <element name="wellParent" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_refWellWellbore", propOrder = {
    "wellboreReference",
    "wellParent"
})
public class CsRefWellWellbore {

    @XmlElement(required = true)
    protected RefNameString wellboreReference;
    protected RefNameString wellParent;

    /**
     * Gets the value of the wellboreReference property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getWellboreReference() {
        return wellboreReference;
    }

    /**
     * Sets the value of the wellboreReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setWellboreReference(RefNameString value) {
        this.wellboreReference = value;
    }

    /**
     * Gets the value of the wellParent property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getWellParent() {
        return wellParent;
    }

    /**
     * Sets the value of the wellParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setWellParent(RefNameString value) {
        this.wellParent = value;
    }




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsRefWellWellbore to1411CsRefWellWellbore() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsRefWellWellbore crww = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsRefWellWellbore();

        // assign fields
        if (null != this.getWellboreReference())
            crww.setWellboreReference(this.getWellboreReference().to1411RefNameString());
        if (null != this.getWellParent())
            crww.setWellParent(this.getWellParent().to1411RefNameString());

        return crww;
    }
    //=========================================================================

}
