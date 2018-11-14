


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ISO 19162-compliant well-known text for the vertical CRS
 * 
 * <p>Java class for VerticalWktCrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="VerticalWktCrs">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractVerticalCrs">
 *       <sequence>
 *         <element name="WellKnownText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalWktCrs", propOrder = {
    "wellKnownText"
})
public class VerticalWktCrs
    extends AbstractVerticalCrs
{

    @XmlElement(name = "WellKnownText", required = true)
    protected String wellKnownText;

    /**
     * Gets the value of the wellKnownText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWellKnownText() {
        return wellKnownText;
    }

    /**
     * Sets the value of the wellKnownText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWellKnownText(String value) {
        this.wellKnownText = value;
    }

}
