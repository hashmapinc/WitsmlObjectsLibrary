package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML Validation Information for Covariance Matrix
 * 
 * <p>Java class for cs_stnTrajMatrixCov complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_stnTrajMatrixCov">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="varianceNN" type="{http://www.witsml.org/schemas/131}areaMeasure" minOccurs="0"/>
 *         <element name="varianceNE" type="{http://www.witsml.org/schemas/131}areaMeasure" minOccurs="0"/>
 *         <element name="varianceNVert" type="{http://www.witsml.org/schemas/131}areaMeasure" minOccurs="0"/>
 *         <element name="varianceEE" type="{http://www.witsml.org/schemas/131}areaMeasure" minOccurs="0"/>
 *         <element name="varianceEVert" type="{http://www.witsml.org/schemas/131}areaMeasure" minOccurs="0"/>
 *         <element name="varianceVertVert" type="{http://www.witsml.org/schemas/131}areaMeasure" minOccurs="0"/>
 *         <element name="biasN" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="biasE" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="biasVert" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_stnTrajMatrixCov", propOrder = {
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
public class CsStnTrajMatrixCov {

    protected AreaMeasure varianceNN;
    protected AreaMeasure varianceNE;
    protected AreaMeasure varianceNVert;
    protected AreaMeasure varianceEE;
    protected AreaMeasure varianceEVert;
    protected AreaMeasure varianceVertVert;
    protected LengthMeasure biasN;
    protected LengthMeasure biasE;
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




    //=========================================================================
    // conversion methods for 1.3.1.1/1.4.1.1/2.0 interop
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsStnTrajMatrixCov to1411CsStnTrajMatrixCov() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsStnTrajMatrixCov cov = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsStnTrajMatrixCov();

        // assign fields
        if (null != this.getVarianceNN())
            cov.setVarianceNN(this.getVarianceNN().to1411AreaMeasure());

        if (null != this.getVarianceNE())
            cov.setVarianceNE(this.getVarianceNE().to1411AreaMeasure());

        if (null != this.getVarianceNVert())
            cov.setVarianceNVert(this.getVarianceNVert().to1411AreaMeasure());

        if (null != this.getVarianceNVert())
            cov.setVarianceNVert(this.getVarianceNVert().to1411AreaMeasure());

        if (null != this.getVarianceEVert())
            cov.setVarianceEVert(this.getVarianceEVert().to1411AreaMeasure());

        if (null != this.getVarianceVertVert())
            cov.setVarianceVertVert(this.getVarianceVertVert().to1411AreaMeasure());

        if (null != this.getBiasN())
            cov.setBiasN(this.getBiasN().to1411Length());

        if (null != this.getBiasE())
            cov.setBiasE(this.getBiasE().to1411Length());

        if (null != this.getBiasVert())
            cov.setBiasVert(this.getBiasVert().to1411Length());

        return cov;
    }
    //=========================================================================

}
