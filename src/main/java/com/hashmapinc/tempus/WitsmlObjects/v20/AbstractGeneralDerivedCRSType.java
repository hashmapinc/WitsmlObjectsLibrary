


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractGeneralDerivedCRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractGeneralDerivedCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}conversion"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralDerivedCRSType", namespace = "http://www.opengis.net/gml/3.2", propOrder = {
    "conversion"
})
@XmlSeeAlso({
    ProjectedCRSType.class
})
public abstract class AbstractGeneralDerivedCRSType
    extends AbstractCRSType
{

    @XmlElement(required = true)
    protected GeneralConversionPropertyType conversion;

    /**
     * Gets the value of the conversion property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralConversionPropertyType }
     *     
     */
    public GeneralConversionPropertyType getConversion() {
        return conversion;
    }

    /**
     * Sets the value of the conversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralConversionPropertyType }
     *     
     */
    public void setConversion(GeneralConversionPropertyType value) {
        this.conversion = value;
    }

}
