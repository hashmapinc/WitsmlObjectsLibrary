package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A block of information about the creation of the XML file. 
 * 			This is different than the creation of the data that is included within the file.
 * 
 * <p>Java class for fileCreationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="fileCreationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FileCreationDate" type="{http://www.witsml.org/schemas/131}timestamp"/>
 *         <element name="SoftwareName" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="FileCreator" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
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
@XmlType(name = "fileCreationType", propOrder = {
    "fileCreationDate",
    "softwareName",
    "fileCreator",
    "comment"
})
public class FileCreationType {

    @XmlElement(name = "FileCreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fileCreationDate;
    @XmlElement(name = "SoftwareName")
    protected String softwareName;
    @XmlElement(name = "FileCreator")
    protected String fileCreator;
    @XmlElement(name = "Comment")
    protected String comment;

    /**
     * Gets the value of the fileCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileCreationDate() {
        return fileCreationDate;
    }

    /**
     * Sets the value of the fileCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileCreationDate(XMLGregorianCalendar value) {
        this.fileCreationDate = value;
    }

    /**
     * Gets the value of the softwareName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareName() {
        return softwareName;
    }

    /**
     * Sets the value of the softwareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareName(String value) {
        this.softwareName = value;
    }

    /**
     * Gets the value of the fileCreator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCreator() {
        return fileCreator;
    }

    /**
     * Sets the value of the fileCreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileCreator(String value) {
        this.fileCreator = value;
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
