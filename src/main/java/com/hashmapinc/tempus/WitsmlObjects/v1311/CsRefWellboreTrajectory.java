package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A reference to a trajectory in a wellbore.
 * 			The trajectory may be defined within the context of another wellbore.
 * 			This value represents a foreign key from one element to another.
 * 
 * <p>Java class for cs_refWellboreTrajectory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_refWellboreTrajectory">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="trajectoryReference" type="{http://www.witsml.org/schemas/131}refNameString"/>
 *         <element name="wellboreParent" type="{http://www.witsml.org/schemas/131}refNameString" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_refWellboreTrajectory", propOrder = {
    "trajectoryReference",
    "wellboreParent"
})
public class CsRefWellboreTrajectory {

    @XmlElement(required = true)
    protected RefNameString trajectoryReference;
    protected RefNameString wellboreParent;

    /**
     * Gets the value of the trajectoryReference property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getTrajectoryReference() {
        return trajectoryReference;
    }

    /**
     * Sets the value of the trajectoryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setTrajectoryReference(RefNameString value) {
        this.trajectoryReference = value;
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

}
