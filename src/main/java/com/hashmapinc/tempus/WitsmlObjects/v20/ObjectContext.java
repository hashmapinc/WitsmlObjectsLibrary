


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the range of index values for a log by reference to another object (or sub-object) which contains the index range as part of its data.
 * 
 * <p>Java class for ObjectContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ObjectContext">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/witsmlv2}AbstractLogDataContext">
 *       <sequence>
 *         <element name="ObjectReference" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference"/>
 *         <element name="SubObjectReference" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectContext", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "objectReference",
    "subObjectReference"
})
public class ObjectContext
    extends AbstractLogDataContext
{

    @XmlElement(name = "ObjectReference", required = true)
    protected DataObjectReference objectReference;
    @XmlElement(name = "SubObjectReference", required = true)
    protected String subObjectReference;

    /**
     * Gets the value of the objectReference property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getObjectReference() {
        return objectReference;
    }

    /**
     * Sets the value of the objectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setObjectReference(DataObjectReference value) {
        this.objectReference = value;
    }

    /**
     * Gets the value of the subObjectReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubObjectReference() {
        return subObjectReference;
    }

    /**
     * Sets the value of the subObjectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubObjectReference(String value) {
        this.subObjectReference = value;
    }

}
