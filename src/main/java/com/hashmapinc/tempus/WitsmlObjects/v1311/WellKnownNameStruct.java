package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The name of something within a mandatory naming system 
 * 			with an optional code.
 * 
 * <p>Java class for wellKnownNameStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="wellKnownNameStruct">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractNameString">
 *       <attribute name="namingSystem" use="required" type="{http://www.witsml.org/schemas/131}nameString" />
 *       <attribute name="code" type="{http://www.witsml.org/schemas/131}kindString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wellKnownNameStruct", propOrder = {
    "value"
})
public class WellKnownNameStruct {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "namingSystem", required = true)
    protected String namingSystem;
    @XmlAttribute(name = "code")
    protected String code;

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

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.WellKnownNameStruct to1411WellKnownNameStruct() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.WellKnownNameStruct struct = new com.hashmapinc.tempus.WitsmlObjects.v1411.WellKnownNameStruct();

        struct.setCode(this.code);
        struct.setNamingSystem(this.namingSystem);
        struct.setValue(this.value);

        return struct;
    }
    //=========================================================================

}
