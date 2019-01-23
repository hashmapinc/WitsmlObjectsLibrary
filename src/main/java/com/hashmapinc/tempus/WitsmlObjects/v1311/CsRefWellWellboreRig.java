package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A reference to a rig within a wellbore.
 * 			The wellbore may be defined within the context of another well.
 * 			This value represents a foreign key from one node to another.
 * 
 * <p>Java class for cs_refWellWellboreRig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_refWellWellboreRig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="rigReference" type="{http://www.witsml.org/schemas/131}refNameString"/>
 *         <element name="wellboreParent" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
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
@XmlType(name = "cs_refWellWellboreRig", propOrder = {
    "rigReference",
    "wellboreParent",
    "wellParent"
})
public class CsRefWellWellboreRig {

    @XmlElement(required = true)
    protected RefNameString rigReference;
    protected RefNameString wellboreParent;
    protected RefNameString wellParent;

    /**
     * Gets the value of the rigReference property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getRigReference() {
        return rigReference;
    }

    /**
     * Sets the value of the rigReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setRigReference(RefNameString value) {
        this.rigReference = value;
    }

    /**
     * Gets the value of the wellboreParent property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getWellboreParent() {
        return wellboreParent;
    }

    /**
     * Sets the value of the wellboreParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setWellboreParent(RefNameString value) {
        this.wellboreParent = value;
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
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsRefWellWellboreRig to1411CsRefWellWellboreRig() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsRefWellWellboreRig ref = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsRefWellWellboreRig();

        // assign fields
        if (null != this.getRigReference())
            ref.setRigReference(this.getRigReference().to1411RefNameString());
        if (null != this.getWellParent())
            ref.setWellParent(this.getWellParent().to1411RefNameString());
        if (null != this.getWellboreParent())
            ref.setWellboreParent(this.getWellboreParent().to1411RefNameString());

        return ref;
    }
    //=========================================================================

}
