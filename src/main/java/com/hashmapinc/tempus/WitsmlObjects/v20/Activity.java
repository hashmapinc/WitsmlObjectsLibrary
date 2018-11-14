


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Instance of a given activity
 * 
 * <p>Java class for Activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="Activity">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="ActivityDescriptor" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference"/>
 *         <element name="Parent" type="{http://www.energistics.org/energyml/data/commonv2}DataObjectReference" minOccurs="0"/>
 *         <element name="Parameter" type="{http://www.energistics.org/energyml/data/commonv2}AbstractActivityParameter" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activity", propOrder = {
    "activityDescriptor",
    "parent",
    "parameter"
})
public class Activity
    extends AbstractObject
{

    @XmlElement(name = "ActivityDescriptor", required = true)
    protected DataObjectReference activityDescriptor;
    @XmlElement(name = "Parent")
    protected DataObjectReference parent;
    @XmlElement(name = "Parameter", required = true)
    protected List<AbstractActivityParameter> parameter;

    /**
     * Gets the value of the activityDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getActivityDescriptor() {
        return activityDescriptor;
    }

    /**
     * Sets the value of the activityDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setActivityDescriptor(DataObjectReference value) {
        this.activityDescriptor = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectReference }
     *     
     */
    public DataObjectReference getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectReference }
     *     
     */
    public void setParent(DataObjectReference value) {
        this.parent = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractActivityParameter }
     * 
     * 
     */
    public List<AbstractActivityParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<AbstractActivityParameter>();
        }
        return this.parameter;
    }

}
