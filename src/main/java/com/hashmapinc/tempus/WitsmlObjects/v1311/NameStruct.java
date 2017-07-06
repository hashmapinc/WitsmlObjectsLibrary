package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The name of something within a naming system.
 * 
 * <p>Java class for nameStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="nameStruct">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractNameString">
 *       <attribute name="namingSystem" type="{http://www.witsml.org/schemas/131}nameString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nameStruct", propOrder = {
    "value"
})
public class NameStruct {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "namingSystem")
    protected String namingSystem;

    /**
     * The intended abstract supertype of all user assigned human 
     * 			recognizable contextual name types. 
     * 			There should be no assumption that (interoperable) semantic information will be extracted from the name by a third party.
     * 			This type of value is generally not guaranteed to be unique and is not a candidate to be replaced by an enumeration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the namingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamingSystem() {
        return namingSystem;
    }

    /**
     * Sets the value of the namingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamingSystem(String value) {
        this.namingSystem = value;
    }

}
