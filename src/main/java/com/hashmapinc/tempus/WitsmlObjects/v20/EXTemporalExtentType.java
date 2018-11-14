


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Time period covered by the content of the dataset
 * 
 * <p>Java class for EX_TemporalExtent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="EX_TemporalExtent_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="extent" type="{http://www.isotc211.org/2005/gts}TM_Primitive_PropertyType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_TemporalExtent_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "extent"
})
public class EXTemporalExtentType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected TMPrimitivePropertyType extent;

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link TMPrimitivePropertyType }
     *     
     */
    public TMPrimitivePropertyType getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMPrimitivePropertyType }
     *     
     */
    public void setExtent(TMPrimitivePropertyType value) {
        this.extent = value;
    }

}
