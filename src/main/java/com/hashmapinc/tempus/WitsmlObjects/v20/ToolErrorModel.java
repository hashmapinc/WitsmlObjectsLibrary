


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to define a surveying tool error model. This object is globally unique.
 * 
 * <p>Java class for ToolErrorModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ToolErrorModel">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="TypeSurveyTool" type="{http://www.energistics.org/energyml/data/witsmlv2}TypeSurveyTool" minOccurs="0"/>
 *         <element name="UseErrorTermSet" type="{http://www.energistics.org/energyml/data/commonv2}String64" minOccurs="0"/>
 *         <element name="Authorization" type="{http://www.energistics.org/energyml/data/witsmlv2}IscwsaAuthorizationData" minOccurs="0"/>
 *         <element name="OperatingCondition" type="{http://www.energistics.org/energyml/data/witsmlv2}IscwsaSurveyToolOperatingCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OperatingInterval" type="{http://www.energistics.org/energyml/data/witsmlv2}IscwsaSurveyToolOperatingInterval" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ModelParameters" type="{http://www.energistics.org/energyml/data/witsmlv2}IscwsaModelParameters" minOccurs="0"/>
 *         <element name="ErrorTermValue" type="{http://www.energistics.org/energyml/data/witsmlv2}IscwsaErrorTermValue" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToolErrorModel", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "typeSurveyTool",
    "useErrorTermSet",
    "authorization",
    "operatingCondition",
    "operatingInterval",
    "modelParameters",
    "errorTermValue"
})
public class ToolErrorModel
    extends AbstractObject
{

    @XmlElement(name = "TypeSurveyTool")
    @XmlSchemaType(name = "string")
    protected String typeSurveyTool;
    @XmlElement(name = "UseErrorTermSet")
    protected String useErrorTermSet;
    @XmlElement(name = "Authorization")
    protected IscwsaAuthorizationData authorization;
    @XmlElement(name = "OperatingCondition")
    protected List<IscwsaSurveyToolOperatingCondition> operatingCondition;
    @XmlElement(name = "OperatingInterval")
    protected List<IscwsaSurveyToolOperatingInterval> operatingInterval;
    @XmlElement(name = "ModelParameters")
    protected IscwsaModelParameters modelParameters;
    @XmlElement(name = "ErrorTermValue", required = true)
    protected List<IscwsaErrorTermValue> errorTermValue;

    /**
     * Gets the value of the typeSurveyTool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSurveyTool() {
        return typeSurveyTool;
    }

    /**
     * Sets the value of the typeSurveyTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSurveyTool(String value) {
        this.typeSurveyTool = value;
    }

    /**
     * Gets the value of the useErrorTermSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseErrorTermSet() {
        return useErrorTermSet;
    }

    /**
     * Sets the value of the useErrorTermSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseErrorTermSet(String value) {
        this.useErrorTermSet = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link IscwsaAuthorizationData }
     *     
     */
    public IscwsaAuthorizationData getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link IscwsaAuthorizationData }
     *     
     */
    public void setAuthorization(IscwsaAuthorizationData value) {
        this.authorization = value;
    }

    /**
     * Gets the value of the operatingCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IscwsaSurveyToolOperatingCondition }
     * 
     * 
     */
    public List<IscwsaSurveyToolOperatingCondition> getOperatingCondition() {
        if (operatingCondition == null) {
            operatingCondition = new ArrayList<IscwsaSurveyToolOperatingCondition>();
        }
        return this.operatingCondition;
    }

    /**
     * Gets the value of the operatingInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IscwsaSurveyToolOperatingInterval }
     * 
     * 
     */
    public List<IscwsaSurveyToolOperatingInterval> getOperatingInterval() {
        if (operatingInterval == null) {
            operatingInterval = new ArrayList<IscwsaSurveyToolOperatingInterval>();
        }
        return this.operatingInterval;
    }

    /**
     * Gets the value of the modelParameters property.
     * 
     * @return
     *     possible object is
     *     {@link IscwsaModelParameters }
     *     
     */
    public IscwsaModelParameters getModelParameters() {
        return modelParameters;
    }

    /**
     * Sets the value of the modelParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link IscwsaModelParameters }
     *     
     */
    public void setModelParameters(IscwsaModelParameters value) {
        this.modelParameters = value;
    }

    /**
     * Gets the value of the errorTermValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorTermValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorTermValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IscwsaErrorTermValue }
     * 
     * 
     */
    public List<IscwsaErrorTermValue> getErrorTermValue() {
        if (errorTermValue == null) {
            errorTermValue = new ArrayList<IscwsaErrorTermValue>();
        }
        return this.errorTermValue;
    }

}
