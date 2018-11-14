


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Equipment NameTag Schema.
 * 
 * <p>Java class for NameTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="NameTag">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="NumberingScheme" type="{http://www.energistics.org/energyml/data/witsmlv2}NameTagNumberingScheme"/>
 *         <element name="Technology" type="{http://www.energistics.org/energyml/data/witsmlv2}NameTagTechnology" minOccurs="0"/>
 *         <element name="Location" type="{http://www.energistics.org/energyml/data/witsmlv2}NameTagLocation" minOccurs="0"/>
 *         <element name="InstallationDate" type="{http://www.energistics.org/energyml/data/commonv2}TimeStamp" minOccurs="0"/>
 *         <element name="InstallationCompany" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="MountingCode" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="Comment" type="{http://www.energistics.org/energyml/data/commonv2}String2000" minOccurs="0"/>
 *         <element name="ExtensionNameValue" type="{http://www.energistics.org/energyml/data/commonv2}ExtensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="uid" use="required" type="{http://www.energistics.org/energyml/data/commonv2}String64" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameTag", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "name",
    "numberingScheme",
    "technology",
    "location",
    "installationDate",
    "installationCompany",
    "mountingCode",
    "comment",
    "extensionNameValue"
})
public class NameTag {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "NumberingScheme", required = true)
    @XmlSchemaType(name = "string")
    protected NameTagNumberingScheme numberingScheme;
    @XmlElement(name = "Technology")
    @XmlSchemaType(name = "string")
    protected NameTagTechnology technology;
    @XmlElement(name = "Location")
    @XmlSchemaType(name = "string")
    protected NameTagLocation location;
    @XmlElement(name = "InstallationDate")
    protected String installationDate;
    @XmlElement(name = "InstallationCompany")
    protected String installationCompany;
    @XmlElement(name = "MountingCode")
    protected String mountingCode;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ExtensionNameValue")
    protected List<ExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;

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
     * Gets the value of the numberingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link NameTagNumberingScheme }
     *     
     */
    public NameTagNumberingScheme getNumberingScheme() {
        return numberingScheme;
    }

    /**
     * Sets the value of the numberingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTagNumberingScheme }
     *     
     */
    public void setNumberingScheme(NameTagNumberingScheme value) {
        this.numberingScheme = value;
    }

    /**
     * Gets the value of the technology property.
     * 
     * @return
     *     possible object is
     *     {@link NameTagTechnology }
     *     
     */
    public NameTagTechnology getTechnology() {
        return technology;
    }

    /**
     * Sets the value of the technology property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTagTechnology }
     *     
     */
    public void setTechnology(NameTagTechnology value) {
        this.technology = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link NameTagLocation }
     *     
     */
    public NameTagLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTagLocation }
     *     
     */
    public void setLocation(NameTagLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the installationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationDate() {
        return installationDate;
    }

    /**
     * Sets the value of the installationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationDate(String value) {
        this.installationDate = value;
    }

    /**
     * Gets the value of the installationCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationCompany() {
        return installationCompany;
    }

    /**
     * Sets the value of the installationCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationCompany(String value) {
        this.installationCompany = value;
    }

    /**
     * Gets the value of the mountingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountingCode() {
        return mountingCode;
    }

    /**
     * Sets the value of the mountingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountingCode(String value) {
        this.mountingCode = value;
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

    /**
     * Gets the value of the extensionNameValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionNameValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionNameValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionNameValue }
     * 
     * 
     */
    public List<ExtensionNameValue> getExtensionNameValue() {
        if (extensionNameValue == null) {
            extensionNameValue = new ArrayList<ExtensionNameValue>();
        }
        return this.extensionNameValue;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
