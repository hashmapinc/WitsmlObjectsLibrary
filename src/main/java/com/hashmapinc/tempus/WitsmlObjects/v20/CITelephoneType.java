


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Telephone numbers for contacting the responsible individual or organisation
 * 
 * <p>Java class for CI_Telephone_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="CI_Telephone_Type">
 *   <complexContent>
 *     <extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       <sequence>
 *         <element name="voice" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="facsimile" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Telephone_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "voice",
    "facsimile"
})
public class CITelephoneType
    extends AbstractObjectType
{

    protected List<CharacterStringPropertyType> voice;
    protected List<CharacterStringPropertyType> facsimile;

    /**
     * Gets the value of the voice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getVoice() {
        if (voice == null) {
            voice = new ArrayList<CharacterStringPropertyType>();
        }
        return this.voice;
    }

    /**
     * Gets the value of the facsimile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facsimile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacsimile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getFacsimile() {
        if (facsimile == null) {
            facsimile = new ArrayList<CharacterStringPropertyType>();
        }
        return this.facsimile;
    }

}
