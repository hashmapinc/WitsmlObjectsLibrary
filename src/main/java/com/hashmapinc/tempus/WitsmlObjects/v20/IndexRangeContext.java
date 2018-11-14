


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the data context for a log in terms of a starting and ending index. When this context is used, each realization of the log includes all data points from the log's channel set that follow between the specified start and end index.
 * 
 * <p>Java class for IndexRangeContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="IndexRangeContext">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/witsmlv2}AbstractLogDataContext">
 *       <sequence>
 *         <element name="StartIndex" type="{http://www.energistics.org/energyml/data/witsmlv2}AbstractIndexValue"/>
 *         <element name="EndIndex" type="{http://www.energistics.org/energyml/data/witsmlv2}AbstractIndexValue"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexRangeContext", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "startIndex",
    "endIndex"
})
public class IndexRangeContext
    extends AbstractLogDataContext
{

    @XmlElement(name = "StartIndex", required = true)
    protected AbstractIndexValue startIndex;
    @XmlElement(name = "EndIndex", required = true)
    protected AbstractIndexValue endIndex;

    /**
     * Gets the value of the startIndex property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractIndexValue }
     *     
     */
    public AbstractIndexValue getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractIndexValue }
     *     
     */
    public void setStartIndex(AbstractIndexValue value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the endIndex property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractIndexValue }
     *     
     */
    public AbstractIndexValue getEndIndex() {
        return endIndex;
    }

    /**
     * Sets the value of the endIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractIndexValue }
     *     
     */
    public void setEndIndex(AbstractIndexValue value) {
        this.endIndex = value;
    }

}
