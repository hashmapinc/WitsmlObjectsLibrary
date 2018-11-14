


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * In the case that the ReferencedData is indexed and the conformance with the DataAssurance policy applies to a range within that index space, this class represents that range.
 * 
 * The elements are string types because the index could be of numerous data types, including integer, float and date.
 * 
 * <p>Java class for IndexRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="IndexRange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IndexMinimum" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *         <element name="IndexMaximum" type="{http://www.energistics.org/energyml/data/commonv2}String64"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexRange", propOrder = {
    "indexMinimum",
    "indexMaximum"
})
public class IndexRange {

    @XmlElement(name = "IndexMinimum", required = true)
    protected String indexMinimum;
    @XmlElement(name = "IndexMaximum", required = true)
    protected String indexMaximum;

    /**
     * Gets the value of the indexMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexMinimum() {
        return indexMinimum;
    }

    /**
     * Sets the value of the indexMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexMinimum(String value) {
        this.indexMinimum = value;
    }

    /**
     * Gets the value of the indexMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexMaximum() {
        return indexMaximum;
    }

    /**
     * Sets the value of the indexMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexMaximum(String value) {
        this.indexMaximum = value;
    }

}
