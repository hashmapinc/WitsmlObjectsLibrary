


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectParameterKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ObjectParameterKey">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractParameterKey">
 *       <sequence>
 *         <element name="DataObject" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectParameterKey", propOrder = {
    "dataObject"
})
public class ObjectParameterKey
    extends AbstractParameterKey
{

    @XmlElement(name = "DataObject", required = true)
    protected DataObjectReference dataObject;

    /**
     * Gets the value of the dataObject property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getDataObject() {
        return dataObject;
    }

    /**
     * Sets the value of the dataObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setDataObject(DataObjectReference value) {
        this.dataObject = value;
    }

}
