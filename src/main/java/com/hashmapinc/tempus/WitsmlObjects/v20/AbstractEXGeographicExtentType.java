


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Geographic area of the dataset
 * 
 * <p>Java class for AbstractEX_GeographicExtent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractEX_GeographicExtent_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="extentTypeCode" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEX_GeographicExtent_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "extentTypeCode"
})
public abstract class AbstractEXGeographicExtentType
    extends AbstractObjectType
{

    protected BooleanPropertyType extentTypeCode;

    /**
     * Gets the value of the extentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getExtentTypeCode() {
        return extentTypeCode;
    }

    /**
     * Sets the value of the extentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setExtentTypeCode(BooleanPropertyType value) {
        this.extentTypeCode = value;
    }

}
