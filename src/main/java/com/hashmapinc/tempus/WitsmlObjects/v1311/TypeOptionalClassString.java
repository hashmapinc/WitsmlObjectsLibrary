package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A type with a classType attribute. This allows a user to give a 
 * 			classification of something, and to specify the type of classification that it is. 
 * 			There is no control over the class values, or the class types.
 * 
 * <p>Java class for typeOptionalClassString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="typeOptionalClassString">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractNameString">
 *       <attribute name="classType" type="{http://www.witsml.org/schemas/131}kindString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOptionalClassString", propOrder = {
    "value"
})
public class TypeOptionalClassString {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "classType")
    protected String classType;

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
     * Gets the value of the classType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassType() {
        return classType;
    }

    /**
     * Sets the value of the classType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassType(String value) {
        this.classType = value;
    }

}
