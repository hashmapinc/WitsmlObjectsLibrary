package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for obj_formationMarkers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="obj_formationMarkers">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="documentInfo" type="{http://www.witsml.org/schemas/131}cs_documentInfo" minOccurs="0"/>
 *         <element name="formationMarker" type="{http://www.witsml.org/schemas/131}obj_formationMarker" maxOccurs="unbounded"/>
 *       </sequence>
 *       <attribute name="version" use="required" type="{http://www.witsml.org/schemas/131}schemaVersionString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlRootElement(name="formationMarkers")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obj_formationMarkers", propOrder = {
    "documentInfo",
    "formationMarker"
})
public class ObjFormationMarkers {

    protected CsDocumentInfo documentInfo;
    @XmlElement(required = true)
    protected List<ObjFormationMarker> formationMarker;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the documentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CsDocumentInfo }
     *     
     */
    public CsDocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    /**
     * Sets the value of the documentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsDocumentInfo }
     *     
     */
    public void setDocumentInfo(CsDocumentInfo value) {
        this.documentInfo = value;
    }

    /**
     * Gets the value of the formationMarker property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formationMarker property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getFormationMarker().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link ObjFormationMarker }
     * 
     * 
     */
    public List<ObjFormationMarker> getFormationMarker() {
        if (formationMarker == null) {
            formationMarker = new ArrayList<ObjFormationMarker>();
        }
        return this.formationMarker;
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

}
