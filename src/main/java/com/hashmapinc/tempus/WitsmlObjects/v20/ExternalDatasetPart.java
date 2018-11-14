


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalDatasetPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ExternalDatasetPart">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Count" type="{http://www.energistics.org/energyml/data/commonv2}PositiveLong"/>
 *         <element name="PathInExternalFile" type="{http://www.energistics.org/energyml/data/commonv2}String2000"/>
 *         <element name="StartIndex" type="{http://www.energistics.org/energyml/data/commonv2}NonNegativeLong"/>
 *         <element name="EpcExternalPartReference" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalDatasetPart", propOrder = {
    "count",
    "pathInExternalFile",
    "startIndex",
    "epcExternalPartReference"
})
public class ExternalDatasetPart {

    @XmlElement(name = "Count")
    protected long count;
    @XmlElement(name = "PathInExternalFile", required = true)
    protected String pathInExternalFile;
    @XmlElement(name = "StartIndex")
    protected long startIndex;
    @XmlElement(name = "EpcExternalPartReference", required = true)
    protected DataObjectReference epcExternalPartReference;

    /**
     * Gets the value of the count property.
     * 
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(long value) {
        this.count = value;
    }

    /**
     * Gets the value of the pathInExternalFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathInExternalFile() {
        return pathInExternalFile;
    }

    /**
     * Sets the value of the pathInExternalFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathInExternalFile(String value) {
        this.pathInExternalFile = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     */
    public long getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     */
    public void setStartIndex(long value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the epcExternalPartReference property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getEpcExternalPartReference() {
        return epcExternalPartReference;
    }

    /**
     * Sets the value of the epcExternalPartReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setEpcExternalPartReference(DataObjectReference value) {
        this.epcExternalPartReference = value;
    }

}
