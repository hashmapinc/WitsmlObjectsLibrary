


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the Energistics encapsulation of the ProjectedCrs type from GML. 
 * 
 * <p>Java class for ProjectedGmlCrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ProjectedGmlCrs">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractProjectedCrs">
 *       <sequence>
 *         <element name="GmlProjectedCrsDefinition" type="{http://www.opengis.net/gml/3.2}ProjectedCRSType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectedGmlCrs", propOrder = {
    "gmlProjectedCrsDefinition"
})
public class ProjectedGmlCrs
    extends AbstractProjectedCrs
{

    @XmlElement(name = "GmlProjectedCrsDefinition", required = true)
    protected ProjectedCRSType gmlProjectedCrsDefinition;

    /**
     * Gets the value of the gmlProjectedCrsDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectedCRSType }
     *     
     */
    public ProjectedCRSType getGmlProjectedCrsDefinition() {
        return gmlProjectedCrsDefinition;
    }

    /**
     * Sets the value of the gmlProjectedCrsDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectedCRSType }
     *     
     */
    public void setGmlProjectedCrsDefinition(ProjectedCRSType value) {
        this.gmlProjectedCrsDefinition = value;
    }

}
