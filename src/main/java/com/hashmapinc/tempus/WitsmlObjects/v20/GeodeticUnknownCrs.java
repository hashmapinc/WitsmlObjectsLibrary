


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This class is used in a case where the coordinate reference system is either unknown or is intentionally not being transferred.
 * 
 * <p>Java class for GeodeticUnknownCrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="GeodeticUnknownCrs">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractGeodeticCrs">
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
@XmlType(name = "GeodeticUnknownCrs", propOrder = {
    "unknown"
})
public class GeodeticUnknownCrs
    extends AbstractGeodeticCrs
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
