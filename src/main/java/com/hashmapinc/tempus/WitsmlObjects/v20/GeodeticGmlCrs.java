


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the Energistics encapsulation of the GeodeticCrs type from GML. 
 * 
 * <p>Java class for GeodeticGmlCrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="GeodeticGmlCrs">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractGeodeticCrs">
 *       <sequence>
 *         <element name="GmlProjectedCrsDefinition" type="{http://www.opengis.net/gml/3.2}GeodeticCRSType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticGmlCrs", propOrder = {
    "gmlProjectedCrsDefinition"
})
public class GeodeticGmlCrs
    extends AbstractGeodeticCrs
{

    @XmlElement(name = "GmlProjectedCrsDefinition", required = true)
    protected GeodeticCRSType gmlProjectedCrsDefinition;

    /**
     * Gets the value of the gmlProjectedCrsDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link GeodeticCRSType }
     *     
     */
    public GeodeticCRSType getGmlProjectedCrsDefinition() {
        return gmlProjectedCrsDefinition;
    }

    /**
     * Sets the value of the gmlProjectedCrsDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeodeticCRSType }
     *     
     */
    public void setGmlProjectedCrsDefinition(GeodeticCRSType value) {
        this.gmlProjectedCrsDefinition = value;
    }

}
