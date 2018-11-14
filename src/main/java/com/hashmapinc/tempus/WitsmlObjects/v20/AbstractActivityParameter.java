


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * General parameter value used in one instance of activity
 * 
 * <p>Java class for AbstractActivityParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractActivityParameter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Title" type="{http://www.energistics.org/energyml/data/commonv2}String2000"/>
 *         <element name="Index" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Selection" type="{http://www.energistics.org/energyml/data/commonv2}String2000" minOccurs="0"/>
 *         <element name="Key" type="{http://www.energistics.org/energyml/data/commonv2}AbstractParameterKey" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractActivityParameter", propOrder = {
    "title",
    "index",
    "selection",
    "key"
})
@XmlSeeAlso({
    TimeIndexParameter.class,
    DataObjectParameter.class,
    StringParameter.class,
    DoubleQuantityParameter.class,
    IntegerQuantityParameter.class
})
public abstract class AbstractActivityParameter {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Index")
    protected Long index;
    @XmlElement(name = "Selection")
    protected String selection;
    @XmlElement(name = "Key")
    protected List<AbstractParameterKey> key;

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
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIndex(Long value) {
        this.index = value;
    }

    /**
     * Gets the value of the selection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelection() {
        return selection;
    }

    /**
     * Sets the value of the selection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelection(String value) {
        this.selection = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractParameterKey }
     * 
     * 
     */
    public List<AbstractParameterKey> getKey() {
        if (key == null) {
            key = new ArrayList<AbstractParameterKey>();
        }
        return this.key;
    }

}
