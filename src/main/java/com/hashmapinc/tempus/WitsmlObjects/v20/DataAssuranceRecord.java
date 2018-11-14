


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A little XML document describing whether or not a particular data object conforms with a pre-defined policy which consists of at least one rule.
 * 
 * <p>Java class for DataAssuranceRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="DataAssuranceRecord">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="PolicyId" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="PolicyName" type="{http://www.energistics.org/energyml/data/commonv2}String2000" minOccurs="0"/>
 *         <element name="ReferencedElementName" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="ReferencedElementUid" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Conformance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Date" type="{http://www.energistics.org/energyml/data/commonv2}TimeStamp"/>
 *         <element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FailingRules" type="{http://www.energistics.org/energyml/data/commonv2}FailingRule" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IndexRange" type="{http://www.energistics.org/energyml/data/commonv2}IndexRange" minOccurs="0"/>
 *         <element name="ReferencedData" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataAssuranceRecord", propOrder = {
    "policyId",
    "policyName",
    "referencedElementName",
    "referencedElementUid",
    "origin",
    "conformance",
    "date",
    "comment",
    "failingRules",
    "indexRange",
    "referencedData"
})
public class DataAssuranceRecord
    extends AbstractObject
{

    @XmlElement(name = "PolicyId", required = true)
    protected String policyId;
    @XmlElement(name = "PolicyName")
    protected String policyName;
    @XmlElement(name = "ReferencedElementName")
    protected String referencedElementName;
    @XmlElement(name = "ReferencedElementUid")
    protected String referencedElementUid;
    @XmlElement(name = "Origin", required = true)
    protected String origin;
    @XmlElement(name = "Conformance")
    protected boolean conformance;
    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "FailingRules")
    protected List<FailingRule> failingRules;
    @XmlElement(name = "IndexRange")
    protected IndexRange indexRange;
    @XmlElement(name = "ReferencedData", required = true)
    protected DataObjectReference referencedData;

    /**
     * Gets the value of the policyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * Sets the value of the policyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyId(String value) {
        this.policyId = value;
    }

    /**
     * Gets the value of the policyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Sets the value of the policyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyName(String value) {
        this.policyName = value;
    }

    /**
     * Gets the value of the referencedElementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedElementName() {
        return referencedElementName;
    }

    /**
     * Sets the value of the referencedElementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedElementName(String value) {
        this.referencedElementName = value;
    }

    /**
     * Gets the value of the referencedElementUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedElementUid() {
        return referencedElementUid;
    }

    /**
     * Sets the value of the referencedElementUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedElementUid(String value) {
        this.referencedElementUid = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the conformance property.
     * 
     */
    public boolean isConformance() {
        return conformance;
    }

    /**
     * Sets the value of the conformance property.
     * 
     */
    public void setConformance(boolean value) {
        this.conformance = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
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
     * Gets the value of the failingRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failingRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailingRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailingRule }
     * 
     * 
     */
    public List<FailingRule> getFailingRules() {
        if (failingRules == null) {
            failingRules = new ArrayList<FailingRule>();
        }
        return this.failingRules;
    }

    /**
     * Gets the value of the indexRange property.
     * 
     * @return
     *     possible object is
     *     {@link IndexRange }
     *     
     */
    public IndexRange getIndexRange() {
        return indexRange;
    }

    /**
     * Sets the value of the indexRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexRange }
     *     
     */
    public void setIndexRange(IndexRange value) {
        this.indexRange = value;
    }

    /**
     * Gets the value of the referencedData property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getReferencedData() {
        return referencedData;
    }

    /**
     * Sets the value of the referencedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setReferencedData(DataObjectReference value) {
        this.referencedData = value;
    }

}
