


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Projected location of the well.
 * 
 * <p>Java class for ProjectedWellLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ProjectedWellLocation">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/witsmlv2}AbstractWellLocation">
 *       <sequence>
 *         <element name="Coordinate1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="Coordinate2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="Crs" type="{http://www.energistics.org/energyml/data/commonv2}AbstractProjectedCrs"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectedWellLocation", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "coordinate1",
    "coordinate2",
    "crs"
})
public class ProjectedWellLocation
    extends AbstractWellLocation
{

    @XmlElement(name = "Coordinate1")
    protected Double coordinate1;
    @XmlElement(name = "Coordinate2")
    protected Double coordinate2;
    @XmlElement(name = "Crs", required = true)
    protected AbstractProjectedCrs crs;

    /**
     * Gets the value of the coordinate1 property.
     * 
     */
    public Double getCoordinate1() {
        return coordinate1;
    }

    /**
     * Sets the value of the coordinate1 property.
     * 
     */
    public void setCoordinate1(Double value) {
        this.coordinate1 = value;
    }

    /**
     * Gets the value of the coordinate2 property.
     * 
     */
    public Double getCoordinate2() {
        return coordinate2;
    }

    /**
     * Sets the value of the coordinate2 property.
     * 
     */
    public void setCoordinate2(Double value) {
        this.coordinate2 = value;
    }

    /**
     * Gets the value of the crs property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractProjectedCrs }
     *     
     */
    public AbstractProjectedCrs getCrs() {
        return crs;
    }

    /**
     * Sets the value of the crs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractProjectedCrs }
     *     
     */
    public void setCrs(AbstractProjectedCrs value) {
        this.crs = value;
    }

}
