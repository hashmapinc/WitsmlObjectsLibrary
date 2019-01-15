package com.hashmapinc.tempus.WitsmlObjects.v1311;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for indexedObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="indexedObject">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractTypeEnum">
 *       <attribute name="index" use="required" type="{http://www.witsml.org/schemas/131}positiveCount" />
 *       <attribute name="name" type="{http://www.witsml.org/schemas/131}kindString" />
 *       <attribute name="uom" type="{http://www.witsml.org/schemas/131}uomString" />
 *       <attribute name="description" type="{http://www.witsml.org/schemas/131}descriptionString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indexedObject", propOrder = {
    "value"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IndexedObject {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "index", required = true)
    @JsonIgnore
    protected String index;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "uom")
    protected String uom;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * The intended abstract supertype of all enumerated "types".
     * 			This abstract type allows the maximum length of a type enumeration to be centrally defined.
     * 			This type should not be used directly except to derive another type.
     * 			It should also be used for uncontrolled strings which are candidates to become enumerations at a future date.
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
     * Gets the value of the index property.
     * 
     */
    public String getIndex(){
        return index.toString();
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(String value) {
        if (!"".equals(value)){
            this.index = value;
        }
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
