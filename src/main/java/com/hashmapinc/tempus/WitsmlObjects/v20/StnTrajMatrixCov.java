


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Captures validation information for a covariance matrix.
 * 
 * <p>Java class for StnTrajMatrixCov complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="StnTrajMatrixCov">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VarianceNN" type="{http://www.energistics.org/energyml/data/commonv2}AreaMeasure" minOccurs="0"/>
 *         <element name="VarianceNE" type="{http://www.energistics.org/energyml/data/commonv2}AreaMeasure" minOccurs="0"/>
 *         <element name="VarianceNVert" type="{http://www.energistics.org/energyml/data/commonv2}AreaMeasure" minOccurs="0"/>
 *         <element name="VarianceEE" type="{http://www.energistics.org/energyml/data/commonv2}AreaMeasure" minOccurs="0"/>
 *         <element name="VarianceEVert" type="{http://www.energistics.org/energyml/data/commonv2}AreaMeasure" minOccurs="0"/>
 *         <element name="VarianceVertVert" type="{http://www.energistics.org/energyml/data/commonv2}AreaMeasure" minOccurs="0"/>
 *         <element name="BiasN" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *         <element name="BiasE" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *         <element name="BiasVert" type="{http://www.energistics.org/energyml/data/commonv2}LengthMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StnTrajMatrixCov", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "varianceNN",
    "varianceNE",
    "varianceNVert",
    "varianceEE",
    "varianceEVert",
    "varianceVertVert",
    "biasN",
    "biasE",
    "biasVert"
})
public class StnTrajMatrixCov {

    @XmlElement(name = "VarianceNN")
    protected AreaMeasure varianceNN;
    @XmlElement(name = "VarianceNE")
    protected AreaMeasure varianceNE;
    @XmlElement(name = "VarianceNVert")
    protected AreaMeasure varianceNVert;
    @XmlElement(name = "VarianceEE")
    protected AreaMeasure varianceEE;
    @XmlElement(name = "VarianceEVert")
    protected AreaMeasure varianceEVert;
    @XmlElement(name = "VarianceVertVert")
    protected AreaMeasure varianceVertVert;
    @XmlElement(name = "BiasN")
    protected LengthMeasure biasN;
    @XmlElement(name = "BiasE")
    protected LengthMeasure biasE;
    @XmlElement(name = "BiasVert")
    protected LengthMeasure biasVert;

    /**
     * Gets the value of the varianceNN property.
     * 
     * @return
     *     possible object is
     *     {@link AreaMeasure }
     *     
     */
    public AreaMeasure getVarianceNN() {
        return varianceNN;
    }

    /**
     * Sets the value of the varianceNN property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaMeasure }
     *     
     */
    public void setVarianceNN(AreaMeasure value) {
        this.varianceNN = value;
    }

    /**
     * Gets the value of the varianceNE property.
     * 
     * @return
     *     possible object is
     *     {@link AreaMeasure }
     *     
     */
    public AreaMeasure getVarianceNE() {
        return varianceNE;
    }

    /**
     * Sets the value of the varianceNE property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaMeasure }
     *     
     */
    public void setVarianceNE(AreaMeasure value) {
        this.varianceNE = value;
    }

    /**
     * Gets the value of the varianceNVert property.
     * 
     * @return
     *     possible object is
     *     {@link AreaMeasure }
     *     
     */
    public AreaMeasure getVarianceNVert() {
        return varianceNVert;
    }

    /**
     * Sets the value of the varianceNVert property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaMeasure }
     *     
     */
    public void setVarianceNVert(AreaMeasure value) {
        this.varianceNVert = value;
    }

    /**
     * Gets the value of the varianceEE property.
     * 
     * @return
     *     possible object is
     *     {@link AreaMeasure }
     *     
     */
    public AreaMeasure getVarianceEE() {
        return varianceEE;
    }

    /**
     * Sets the value of the varianceEE property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaMeasure }
     *     
     */
    public void setVarianceEE(AreaMeasure value) {
        this.varianceEE = value;
    }

    /**
     * Gets the value of the varianceEVert property.
     * 
     * @return
     *     possible object is
     *     {@link AreaMeasure }
     *     
     */
    public AreaMeasure getVarianceEVert() {
        return varianceEVert;
    }

    /**
     * Sets the value of the varianceEVert property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaMeasure }
     *     
     */
    public void setVarianceEVert(AreaMeasure value) {
        this.varianceEVert = value;
    }

    /**
     * Gets the value of the varianceVertVert property.
     * 
     * @return
     *     possible object is
     *     {@link AreaMeasure }
     *     
     */
    public AreaMeasure getVarianceVertVert() {
        return varianceVertVert;
    }

    /**
     * Sets the value of the varianceVertVert property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaMeasure }
     *     
     */
    public void setVarianceVertVert(AreaMeasure value) {
        this.varianceVertVert = value;
    }

    /**
     * Gets the value of the biasN property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getBiasN() {
        return biasN;
    }

    /**
     * Sets the value of the biasN property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setBiasN(LengthMeasure value) {
        this.biasN = value;
    }

    /**
     * Gets the value of the biasE property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getBiasE() {
        return biasE;
    }

    /**
     * Sets the value of the biasE property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setBiasE(LengthMeasure value) {
        this.biasE = value;
    }

    /**
     * Gets the value of the biasVert property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getBiasVert() {
        return biasVert;
    }

    /**
     * Sets the value of the biasVert property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setBiasVert(LengthMeasure value) {
        this.biasVert = value;
    }

}
