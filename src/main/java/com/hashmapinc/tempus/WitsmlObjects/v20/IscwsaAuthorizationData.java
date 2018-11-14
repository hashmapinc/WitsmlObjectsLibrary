


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Authorization state of some entity. The main goal of the Industry Steering Committee on Wellbore Survey Accuracy (ISCWSA) is to to produce and maintain standards for the industry relating to wellbore survey accuracy.
 * 
 * <p>Java class for IscwsaAuthorizationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="IscwsaAuthorizationData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Author" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="Source" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="Authority" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="Status" type="{http://www.energistics.org/energyml/data/witsmlv2}AuthorizationStatus"/>
 *         <element name="Version" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="Comment" type="{http://www.energistics.org/energyml/data/commonv2}String2000" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscwsaAuthorizationData", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "author",
    "source",
    "authority",
    "status",
    "version",
    "comment"
})
public class IscwsaAuthorizationData {

    @XmlElement(name = "Author")
    protected String author;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Authority", required = true)
    protected String authority;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected AuthorizationStatus status;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Comment")
    protected String comment;

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the authority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Sets the value of the authority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationStatus }
     *     
     */
    public AuthorizationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationStatus }
     *     
     */
    public void setStatus(AuthorizationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
