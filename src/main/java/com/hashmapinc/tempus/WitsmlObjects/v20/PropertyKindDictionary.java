


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This dictionary defines property kind which is intended to handle the requirements of the upstream oil and gas industry. 
 * 
 * <p>Java class for PropertyKindDictionary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="PropertyKindDictionary">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="PropertyKind" type="{http://www.energistics.org/energyml/data/commonv2}PropertyKind" maxOccurs="unbounded" minOccurs="2"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyKindDictionary", propOrder = {
    "propertyKind"
})
public class PropertyKindDictionary
    extends AbstractObject
{

    @XmlElement(name = "PropertyKind", required = true)
    protected List<PropertyKind> propertyKind;

    /**
     * Gets the value of the propertyKind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyKind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyKind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyKind }
     * 
     * 
     */
    public List<PropertyKind> getPropertyKind() {
        if (propertyKind == null) {
            propertyKind = new ArrayList<PropertyKind>();
        }
        return this.propertyKind;
    }

}
