


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
 * Defines the vertical datums associated with elevation, vertical depth 
 * and measured depth coordinates within the context of a well.
 * 
 * <p>Java class for WellDatum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="WellDatum">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="Code" type="{http://www.energistics.org/energyml/data/commonv2}WellboreDatumReference" minOccurs="0"/>
 *         <element name="Kind" type="{http://www.energistics.org/energyml/data/commonv2}String64" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MeasuredDepth" type="{http://www.energistics.org/energyml/data/witsmlv2}DepthCoord" minOccurs="0"/>
 *         <element name="Comment" type="{http://www.energistics.org/energyml/data/commonv2}String2000" minOccurs="0"/>
 *         <element name="ExtensionNameValue" type="{http://www.energistics.org/energyml/data/commonv2}ExtensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Wellbore" type="{http://www.energistics.org/energyml/data/witsmlv2}RefWellbore" minOccurs="0"/>
 *         <element name="Rig" type="{http://www.energistics.org/energyml/data/witsmlv2}RefWellboreRig" minOccurs="0"/>
 *         <element name="Elevation" type="{http://www.energistics.org/energyml/data/witsmlv2}WellElevationCoord" minOccurs="0"/>
 *         <element name="HorizontalLocation" type="{http://www.energistics.org/energyml/data/witsmlv2}AbstractWellLocation" minOccurs="0"/>
 *         <element name="Crs" type="{http://www.energistics.org/energyml/data/commonv2}AbstractVerticalCrs"/>
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
@XmlType(name = "WellDatum", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "name",
    "code",
    "kind",
    "measuredDepth",
    "comment",
    "extensionNameValue",
    "wellbore",
    "rig",
    "elevation",
    "horizontalLocation",
    "crs"
})
public class WellDatum {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Code")
    @XmlSchemaType(name = "string")
    protected WellboreDatumReference code;
    @XmlElement(name = "Kind")
    protected List<String> kind;
    @XmlElement(name = "MeasuredDepth")
    protected DepthCoord measuredDepth;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ExtensionNameValue")
    protected List<ExtensionNameValue> extensionNameValue;
    @XmlElement(name = "Wellbore")
    protected RefWellbore wellbore;
    @XmlElement(name = "Rig")
    protected RefWellboreRig rig;
    @XmlElement(name = "Elevation")
    protected WellElevationCoord elevation;
    @XmlElement(name = "HorizontalLocation")
    protected AbstractWellLocation horizontalLocation;
    @XmlElement(name = "Crs", required = true)
    protected AbstractVerticalCrs crs;
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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link WellboreDatumReference }
     *     
     */
    public WellboreDatumReference getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellboreDatumReference }
     *     
     */
    public void setCode(WellboreDatumReference value) {
        this.code = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKind() {
        if (kind == null) {
            kind = new ArrayList<String>();
        }
        return this.kind;
    }

    /**
     * Gets the value of the measuredDepth property.
     * 
     * @return
     *     possible object is
     *     {@link DepthCoord }
     *     
     */
    public DepthCoord getMeasuredDepth() {
        return measuredDepth;
    }

    /**
     * Sets the value of the measuredDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepthCoord }
     *     
     */
    public void setMeasuredDepth(DepthCoord value) {
        this.measuredDepth = value;
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
     * Gets the value of the wellbore property.
     * 
     * @return
     *     possible object is
     *     {@link RefWellbore }
     *     
     */
    public RefWellbore getWellbore() {
        return wellbore;
    }

    /**
     * Sets the value of the wellbore property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefWellbore }
     *     
     */
    public void setWellbore(RefWellbore value) {
        this.wellbore = value;
    }

    /**
     * Gets the value of the rig property.
     * 
     * @return
     *     possible object is
     *     {@link RefWellboreRig }
     *     
     */
    public RefWellboreRig getRig() {
        return rig;
    }

    /**
     * Sets the value of the rig property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefWellboreRig }
     *     
     */
    public void setRig(RefWellboreRig value) {
        this.rig = value;
    }

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link WellElevationCoord }
     *     
     */
    public WellElevationCoord getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WellElevationCoord }
     *     
     */
    public void setElevation(WellElevationCoord value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the horizontalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractWellLocation }
     *     
     */
    public AbstractWellLocation getHorizontalLocation() {
        return horizontalLocation;
    }

    /**
     * Sets the value of the horizontalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractWellLocation }
     *     
     */
    public void setHorizontalLocation(AbstractWellLocation value) {
        this.horizontalLocation = value;
    }

    /**
     * Gets the value of the crs property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractVerticalCrs }
     *     
     */
    public AbstractVerticalCrs getCrs() {
        return crs;
    }

    /**
     * Sets the value of the crs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractVerticalCrs }
     *     
     */
    public void setCrs(AbstractVerticalCrs value) {
        this.crs = value;
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
