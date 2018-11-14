


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An ISO 19115 EIP-derived set of metadata attached to all specializations of AbstractObject to ensure the traceability of each individual independent (top level) element.
 * 
 * <p>Java class for Citation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="Citation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Title" type="{http://www.energistics.org/energyml/data/commonv2}String2000"/>
 *         <element name="Originator" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="Creation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="Format" type="{http://www.energistics.org/energyml/data/commonv2}String2000"/>
 *         <element name="Editor" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="LastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="VersionString" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="Description" type="{http://www.energistics.org/energyml/data/commonv2}String2000" minOccurs="0"/>
 *         <element name="DescriptiveKeywords" type="{http://www.energistics.org/energyml/data/commonv2}String2000" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Citation", propOrder = {
    "title",
    "originator",
    "creation",
    "format",
    "editor",
    "lastUpdate",
    "versionString",
    "description",
    "descriptiveKeywords"
})
public class Citation {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Originator", required = true)
    protected String originator;
    @XmlElement(name = "Creation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creation;
    @XmlElement(name = "Format", required = true)
    protected String format;
    @XmlElement(name = "Editor")
    protected String editor;
    @XmlElement(name = "LastUpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    @XmlElement(name = "VersionString")
    protected String versionString;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DescriptiveKeywords")
    protected String descriptiveKeywords;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Gets the value of the creation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreation() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreation(XMLGregorianCalendar value) {
        this.creation = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the editor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditor() {
        return editor;
    }

    /**
     * Sets the value of the editor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditor(String value) {
        this.editor = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the versionString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionString() {
        return versionString;
    }

    /**
     * Sets the value of the versionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionString(String value) {
        this.versionString = value;
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

    /**
     * Gets the value of the descriptiveKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveKeywords() {
        return descriptiveKeywords;
    }

    /**
     * Sets the value of the descriptiveKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveKeywords(String value) {
        this.descriptiveKeywords = value;
    }

}
