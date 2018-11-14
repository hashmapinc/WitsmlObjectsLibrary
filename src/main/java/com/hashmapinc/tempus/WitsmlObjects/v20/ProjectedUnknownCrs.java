


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This class is used in a case where the coordinate reference system is either unknown or is intentionally not being transferred. In this case, the uom and AxisOrder need to be provided on the ProjectedCrs class.
 * 
 * <p>Java class for ProjectedUnknownCrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ProjectedUnknownCrs">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractProjectedCrs">
 *       <sequence>
 *         <element name="Unknown" type="{http://www.energistics.org/energyml/data/commonv2}String2000"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectedUnknownCrs", propOrder = {
    "unknown"
})
public class ProjectedUnknownCrs
    extends AbstractProjectedCrs
{

    @XmlElement(name = "Unknown", required = true)
    protected String unknown;

    /**
     * Gets the value of the unknown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknown() {
        return unknown;
    }

    /**
     * Sets the value of the unknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknown(String value) {
        this.unknown = value;
    }

}
