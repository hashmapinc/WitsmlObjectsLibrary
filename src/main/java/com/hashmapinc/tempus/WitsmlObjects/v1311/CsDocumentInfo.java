package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A  schema to capture a set of data that is 
 * 			relevant for many exchange documents. It includes information about the 
 * 			file that was created, and high-level information about the data that is 
 * 			being exchanged within the file.
 * 
 * <p>Java class for cs_documentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_documentInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocumentName" type="{http://www.witsml.org/schemas/131}nameStruct"/>
 *         <element name="DocumentAlias" type="{http://www.witsml.org/schemas/131}nameStruct" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DocumentDate" type="{http://www.witsml.org/schemas/131}timestamp" minOccurs="0"/>
 *         <element name="documentClass" type="{http://www.witsml.org/schemas/131}nameStruct" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FileCreationInformation" type="{http://www.witsml.org/schemas/131}fileCreationType" minOccurs="0"/>
 *         <element name="SecurityInformation" type="{http://www.witsml.org/schemas/131}securityInfoType" maxOccurs="5" minOccurs="0"/>
 *         <element name="Disclaimer" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="AuditTrail" type="{http://www.witsml.org/schemas/131}auditType" minOccurs="0"/>
 *         <element name="Owner" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="Comment" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_documentInfo", propOrder = {
    "documentName",
    "documentAlias",
    "documentDate",
    "documentClass",
    "fileCreationInformation",
    "securityInformation",
    "disclaimer",
    "auditTrail",
    "owner",
    "comment"
})
public class CsDocumentInfo {

    @XmlElement(name = "DocumentName", required = true)
    protected NameStruct documentName;
    @XmlElement(name = "DocumentAlias")
    protected List<NameStruct> documentAlias;
    @XmlElement(name = "DocumentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDate;
    protected List<NameStruct> documentClass;
    @XmlElement(name = "FileCreationInformation")
    protected FileCreationType fileCreationInformation;
    @XmlElement(name = "SecurityInformation")
    protected List<SecurityInfoType> securityInformation;
    @XmlElement(name = "Disclaimer")
    protected String disclaimer;
    @XmlElement(name = "AuditTrail")
    protected AuditType auditTrail;
    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "Comment")
    protected String comment;

    /**
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link NameStruct }
     *     
     */
    public NameStruct getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameStruct }
     *     
     */
    public void setDocumentName(NameStruct value) {
        this.documentName = value;
    }

    /**
     * Gets the value of the documentAlias property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentAlias property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getDocumentAlias().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link NameStruct }
     * 
     * 
     */
    public List<NameStruct> getDocumentAlias() {
        if (documentAlias == null) {
            documentAlias = new ArrayList<NameStruct>();
        }
        return this.documentAlias;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Gets the value of the documentClass property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentClass property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getDocumentClass().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link NameStruct }
     * 
     * 
     */
    public List<NameStruct> getDocumentClass() {
        if (documentClass == null) {
            documentClass = new ArrayList<NameStruct>();
        }
        return this.documentClass;
    }

    /**
     * Gets the value of the fileCreationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FileCreationType }
     *     
     */
    public FileCreationType getFileCreationInformation() {
        return fileCreationInformation;
    }

    /**
     * Sets the value of the fileCreationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileCreationType }
     *     
     */
    public void setFileCreationInformation(FileCreationType value) {
        this.fileCreationInformation = value;
    }

    /**
     * Gets the value of the securityInformation property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityInformation property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getSecurityInformation().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityInfoType }
     * 
     * 
     */
    public List<SecurityInfoType> getSecurityInformation() {
        if (securityInformation == null) {
            securityInformation = new ArrayList<SecurityInfoType>();
        }
        return this.securityInformation;
    }

    /**
     * Gets the value of the disclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimer() {
        return disclaimer;
    }

    /**
     * Sets the value of the disclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimer(String value) {
        this.disclaimer = value;
    }

    /**
     * Gets the value of the auditTrail property.
     * 
     * @return
     *     possible object is
     *     {@link AuditType }
     *     
     */
    public AuditType getAuditTrail() {
        return auditTrail;
    }

    /**
     * Sets the value of the auditTrail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditType }
     *     
     */
    public void setAuditTrail(AuditType value) {
        this.auditTrail = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
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
