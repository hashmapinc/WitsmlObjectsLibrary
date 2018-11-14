


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the Energistics encapsulation of the VerticalCrs type from GML. 
 * 
 * <p>Java class for VerticalGmlCrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="VerticalGmlCrs">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractVerticalCrs">
 *       <sequence>
 *         <element name="GmlVerticalCrsDefinition" type="{http://www.opengis.net/gml/3.2}VerticalCRSType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalGmlCrs", propOrder = {
    "gmlVerticalCrsDefinition"
})
public class VerticalGmlCrs
    extends AbstractVerticalCrs
{

    @XmlElement(name = "GmlVerticalCrsDefinition", required = true)
    protected VerticalCRSType gmlVerticalCrsDefinition;

    /**
     * Gets the value of the gmlVerticalCrsDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalCRSType }
     *     
     */
    public VerticalCRSType getGmlVerticalCrsDefinition() {
        return gmlVerticalCrsDefinition;
    }

    /**
     * Sets the value of the gmlVerticalCrsDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalCRSType }
     *     
     */
    public void setGmlVerticalCrsDefinition(VerticalCRSType value) {
        this.gmlVerticalCrsDefinition = value;
    }

}
