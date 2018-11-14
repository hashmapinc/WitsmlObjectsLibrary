


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A reference to a trajectoryStation in a wellbore. The trajectoryStation may be defined within the context of another wellbore. This value represents a foreign key from one element to another.
 * 
 * <p>Java class for RefWellboreTrajectoryStation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="RefWellboreTrajectoryStation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StationReference" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="TrajectoryParent" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="WellboreParent" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefWellboreTrajectoryStation", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "stationReference",
    "trajectoryParent",
    "wellboreParent"
})
public class RefWellboreTrajectoryStation {

    @XmlElement(name = "StationReference", required = true)
    protected String stationReference;
    @XmlElement(name = "TrajectoryParent", required = true)
    protected String trajectoryParent;
    @XmlElement(name = "WellboreParent")
    protected String wellboreParent;

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
     *     {@link String }
     *     
     */
    public String getTrajectoryParent() {
        return trajectoryParent;
    }

    /**
     * Sets the value of the trajectoryParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrajectoryParent(String value) {
        this.trajectoryParent = value;
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

}
