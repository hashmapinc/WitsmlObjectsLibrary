


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The parent class for all top-level elements across the Energistics MLs. 
 * 
 * <p>Java class for AbstractObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractObject">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Aliases" type="{http://www.energistics.org/energyml/data/commonv2}ObjectAlias" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Citation" type="{http://www.energistics.org/energyml/data/commonv2}Citation"/>
 *         <element name="CustomData" type="{http://www.energistics.org/energyml/data/commonv2}CustomData" minOccurs="0"/>
 *         <element name="ExtensionNameValue" type="{http://www.energistics.org/energyml/data/commonv2}ExtensionNameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="objectVersion" type="{http://www.energistics.org/energyml/data/commonv2}String64" />
 *       <attribute name="schemaVersion" use="required" type="{http://www.energistics.org/energyml/data/commonv2}String64" />
 *       <attribute name="uuid" use="required" type="{http://www.energistics.org/energyml/data/commonv2}UuidString" />
 *       <attribute name="existenceKind" type="{http://www.energistics.org/energyml/data/commonv2}ExistenceKind" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractObject", propOrder = {
    "aliases",
    "citation",
    "customData",
    "extensionNameValue"
})
@XmlSeeAlso({
    ChannelSet.class,
    Log.class,
    Well.class,
    Channel.class,
    Wellbore.class,
    ToolErrorModel.class,
    Trajectory.class,
    GraphicalInformationSet.class,
    TimeSeries.class,
    EpcExternalPartReference.class,
    PropertyKind.class,
    PropertyKindDictionary.class,
    DataAssuranceRecord.class,
    Activity.class,
    ActivityTemplate.class,
    GeodeticCrs.class,
    VerticalCrs.class,
    ProjectedCrs.class
})
public abstract class AbstractObject {

    @XmlElement(name = "Aliases")
    protected List<ObjectAlias> aliases;
    @XmlElement(name = "Citation", required = true)
    protected Citation citation;
    @XmlElement(name = "CustomData")
    protected CustomData customData;
    @XmlElement(name = "ExtensionNameValue")
    protected List<ExtensionNameValue> extensionNameValue;
    @XmlAttribute(name = "objectVersion")
    protected String objectVersion;
    @XmlAttribute(name = "schemaVersion", required = true)
    protected String schemaVersion;
    @XmlAttribute(name = "uuid", required = true)
    protected String uuid;
    @XmlAttribute(name = "existenceKind")
    protected ExistenceKind existenceKind;

    /**
     * Gets the value of the aliases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aliases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAliases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectAlias }
     * 
     * 
     */
    public List<ObjectAlias> getAliases() {
        if (aliases == null) {
            aliases = new ArrayList<ObjectAlias>();
        }
        return this.aliases;
    }

    /**
     * Gets the value of the citation property.
     * 
     * @return
     *     possible object is
     *     {@link Citation }
     *     
     */
    public Citation getCitation() {
        return citation;
    }

    /**
     * Sets the value of the citation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Citation }
     *     
     */
    public void setCitation(Citation value) {
        this.citation = value;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomData }
     *     
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomData }
     *     
     */
    public void setCustomData(CustomData value) {
        this.customData = value;
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
     * Gets the value of the objectVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectVersion() {
        return objectVersion;
    }

    /**
     * Sets the value of the objectVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectVersion(String value) {
        this.objectVersion = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the existenceKind property.
     * 
     * @return
     *     possible object is
     *     {@link ExistenceKind }
     *     
     */
    public ExistenceKind getExistenceKind() {
        return existenceKind;
    }

    /**
     * Sets the value of the existenceKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistenceKind }
     *     
     */
    public void setExistenceKind(ExistenceKind value) {
        this.existenceKind = value;
    }

}
