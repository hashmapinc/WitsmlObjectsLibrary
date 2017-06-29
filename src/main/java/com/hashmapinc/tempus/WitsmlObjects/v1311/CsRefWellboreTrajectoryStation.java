package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A reference to a trajectoryStation in a wellbore.
 * 			The trajectoryStation may be defined within the context of another wellbore.
 * 			This value represents a foreign key from one element to another.
 * 
 * <p>Java class for cs_refWellboreTrajectoryStation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_refWellboreTrajectoryStation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="stationReference" type="{http://www.witsml.org/schemas/131}refString"/>
 *         <element name="trajectoryParent" type="{http://www.witsml.org/schemas/131}refNameString"/>
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
@XmlType(name = "cs_refWellboreTrajectoryStation", propOrder = {
    "stationReference",
    "trajectoryParent",
    "wellboreParent"
})
public class CsRefWellboreTrajectoryStation {

    @XmlElement(required = true)
    protected String stationReference;
    @XmlElement(required = true)
    protected RefNameString trajectoryParent;
    protected RefNameString wellboreParent;

    /**
     * Gets the value of the stationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationReference() {
        return stationReference;
    }

    /**
     * Sets the value of the stationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationReference(String value) {
        this.stationReference = value;
    }

    /**
     * Gets the value of the trajectoryParent property.
     * 
     * @return
     *     possible object is
     *     {@link RefNameString }
     *     
     */
    public RefNameString getTrajectoryParent() {
        return trajectoryParent;
    }

    /**
     * Sets the value of the trajectoryParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNameString }
     *     
     */
    public void setTrajectoryParent(RefNameString value) {
        this.trajectoryParent = value;
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
