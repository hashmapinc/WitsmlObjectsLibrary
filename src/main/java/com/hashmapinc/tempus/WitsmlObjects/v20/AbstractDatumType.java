


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AbstractDatumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractDatumType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}domainOfValidity" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}scope" maxOccurs="unbounded"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}anchorDefinition" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}realizationEpoch" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDatumType", namespace = "http://www.opengis.net/gml/3.2", propOrder = {
    "domainOfValidity",
    "scope",
    "anchorDefinition",
    "realizationEpoch"
})
@XmlSeeAlso({
    VerticalDatumType.class,
    GeodeticDatumType.class
})
public abstract class AbstractDatumType
    extends IdentifiedObjectType
{

    protected DomainOfValidity domainOfValidity;
    @XmlElement(required = true)
    protected List<String> scope;
    protected CodeType anchorDefinition;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar realizationEpoch;

    /**
     * Gets the value of the domainOfValidity property.
     * 
     * @return
     *     possible object is
     *     {@link DomainOfValidity }
     *     
     */
    public DomainOfValidity getDomainOfValidity() {
        return domainOfValidity;
    }

    /**
     * Sets the value of the domainOfValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainOfValidity }
     *     
     */
    public void setDomainOfValidity(DomainOfValidity value) {
        this.domainOfValidity = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScope() {
        if (scope == null) {
            scope = new ArrayList<String>();
        }
        return this.scope;
    }

    /**
     * Gets the value of the anchorDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAnchorDefinition() {
        return anchorDefinition;
    }

    /**
     * Sets the value of the anchorDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAnchorDefinition(CodeType value) {
        this.anchorDefinition = value;
    }

    /**
     * Gets the value of the realizationEpoch property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRealizationEpoch() {
        return realizationEpoch;
    }

    /**
     * Sets the value of the realizationEpoch property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRealizationEpoch(XMLGregorianCalendar value) {
        this.realizationEpoch = value;
    }

}
