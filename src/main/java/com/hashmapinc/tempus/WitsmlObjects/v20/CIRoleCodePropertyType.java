


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CI_RoleCode_PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="CI_RoleCode_PropertyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence minOccurs="0">
 *         <element ref="{http://www.isotc211.org/2005/gmd}CI_RoleCode"/>
 *       </sequence>
 *       <attribute ref="{http://www.isotc211.org/2005/gco}nilReason"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_RoleCode_PropertyType", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "ciRoleCode"
})
public class CIRoleCodePropertyType {

    @XmlElement(name = "CI_RoleCode")
    protected CodeListValueType ciRoleCode;
    @XmlAttribute(name = "nilReason", namespace = "http://www.isotc211.org/2005/gco")
    protected List<String> nilReason;

    /**
     * Gets the value of the ciRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListValueType }
     *     
     */
    public CodeListValueType getCIRoleCode() {
        return ciRoleCode;
    }

    /**
     * Sets the value of the ciRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListValueType }
     *     
     */
    public void setCIRoleCode(CodeListValueType value) {
        this.ciRoleCode = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

}
