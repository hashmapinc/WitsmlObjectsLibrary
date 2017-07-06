package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Cement Test Component Schema 
 * 
 * <p>Java class for cs_cementTest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_cementTest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="presTest" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="eTimTest" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="cementShoeCollar" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="cetRun" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="cetBondQual" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="cblRun" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="cblBondQual" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="cblPres" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="tempSurvey" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="eTimCementLog" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="formPit" type="{http://www.witsml.org/schemas/131}forcePerVolumeMeasure" minOccurs="0"/>
 *         <element name="toolCompanyPit" type="{http://www.witsml.org/schemas/131}nameString" minOccurs="0"/>
 *         <element name="eTimPitStart" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="mdCementTop" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *         <element name="topCementMethod" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="tocOK" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="jobRating" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="remedialCement" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="numRemedial" type="{http://www.witsml.org/schemas/131}nonNegativeCount" minOccurs="0"/>
 *         <element name="failureMethod" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="linerTop" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="linerLap" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="eTimBeforeTest" type="{http://www.witsml.org/schemas/131}timeMeasure" minOccurs="0"/>
 *         <element name="testNegativeTool" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="testNegativeEmw" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="testPositiveTool" type="{http://www.witsml.org/schemas/131}str32" minOccurs="0"/>
 *         <element name="testPositiveEmw" type="{http://www.witsml.org/schemas/131}densityMeasure" minOccurs="0"/>
 *         <element name="cementFoundOnTool" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="mdDVTool" type="{http://www.witsml.org/schemas/131}measuredDepthCoord" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_cementTest", propOrder = {
    "presTest",
    "eTimTest",
    "cementShoeCollar",
    "cetRun",
    "cetBondQual",
    "cblRun",
    "cblBondQual",
    "cblPres",
    "tempSurvey",
    "eTimCementLog",
    "formPit",
    "toolCompanyPit",
    "eTimPitStart",
    "mdCementTop",
    "topCementMethod",
    "tocOK",
    "jobRating",
    "remedialCement",
    "numRemedial",
    "failureMethod",
    "linerTop",
    "linerLap",
    "eTimBeforeTest",
    "testNegativeTool",
    "testNegativeEmw",
    "testPositiveTool",
    "testPositiveEmw",
    "cementFoundOnTool",
    "mdDVTool"
})
public class CsCementTest {

    protected PressureMeasure presTest;
    protected TimeMeasure eTimTest;
    protected Boolean cementShoeCollar;
    protected Boolean cetRun;
    protected Boolean cetBondQual;
    protected Boolean cblRun;
    protected Boolean cblBondQual;
    protected PressureMeasure cblPres;
    protected Boolean tempSurvey;
    protected TimeMeasure eTimCementLog;
    protected ForcePerVolumeMeasure formPit;
    protected String toolCompanyPit;
    protected TimeMeasure eTimPitStart;
    protected MeasuredDepthCoord mdCementTop;
    protected String topCementMethod;
    protected Boolean tocOK;
    protected String jobRating;
    protected Boolean remedialCement;
    protected Short numRemedial;
    protected String failureMethod;
    protected LengthMeasure linerTop;
    protected LengthMeasure linerLap;
    protected TimeMeasure eTimBeforeTest;
    protected String testNegativeTool;
    protected DensityMeasure testNegativeEmw;
    protected String testPositiveTool;
    protected DensityMeasure testPositiveEmw;
    protected Boolean cementFoundOnTool;
    protected MeasuredDepthCoord mdDVTool;

    /**
     * Gets the value of the presTest property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresTest() {
        return presTest;
    }

    /**
     * Sets the value of the presTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresTest(PressureMeasure value) {
        this.presTest = value;
    }

    /**
     * Gets the value of the eTimTest property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimTest() {
        return eTimTest;
    }

    /**
     * Sets the value of the eTimTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimTest(TimeMeasure value) {
        this.eTimTest = value;
    }

    /**
     * Gets the value of the cementShoeCollar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCementShoeCollar() {
        return cementShoeCollar;
    }

    /**
     * Sets the value of the cementShoeCollar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCementShoeCollar(Boolean value) {
        this.cementShoeCollar = value;
    }

    /**
     * Gets the value of the cetRun property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCetRun() {
        return cetRun;
    }

    /**
     * Sets the value of the cetRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCetRun(Boolean value) {
        this.cetRun = value;
    }

    /**
     * Gets the value of the cetBondQual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCetBondQual() {
        return cetBondQual;
    }

    /**
     * Sets the value of the cetBondQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCetBondQual(Boolean value) {
        this.cetBondQual = value;
    }

    /**
     * Gets the value of the cblRun property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCblRun() {
        return cblRun;
    }

    /**
     * Sets the value of the cblRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCblRun(Boolean value) {
        this.cblRun = value;
    }

    /**
     * Gets the value of the cblBondQual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCblBondQual() {
        return cblBondQual;
    }

    /**
     * Sets the value of the cblBondQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCblBondQual(Boolean value) {
        this.cblBondQual = value;
    }

    /**
     * Gets the value of the cblPres property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getCblPres() {
        return cblPres;
    }

    /**
     * Sets the value of the cblPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setCblPres(PressureMeasure value) {
        this.cblPres = value;
    }

    /**
     * Gets the value of the tempSurvey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempSurvey() {
        return tempSurvey;
    }

    /**
     * Sets the value of the tempSurvey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempSurvey(Boolean value) {
        this.tempSurvey = value;
    }

    /**
     * Gets the value of the eTimCementLog property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimCementLog() {
        return eTimCementLog;
    }

    /**
     * Sets the value of the eTimCementLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimCementLog(TimeMeasure value) {
        this.eTimCementLog = value;
    }

    /**
     * Gets the value of the formPit property.
     * 
     * @return
     *     possible object is
     *     {@link ForcePerVolumeMeasure }
     *     
     */
    public ForcePerVolumeMeasure getFormPit() {
        return formPit;
    }

    /**
     * Sets the value of the formPit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForcePerVolumeMeasure }
     *     
     */
    public void setFormPit(ForcePerVolumeMeasure value) {
        this.formPit = value;
    }

    /**
     * Gets the value of the toolCompanyPit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolCompanyPit() {
        return toolCompanyPit;
    }

    /**
     * Sets the value of the toolCompanyPit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolCompanyPit(String value) {
        this.toolCompanyPit = value;
    }

    /**
     * Gets the value of the eTimPitStart property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimPitStart() {
        return eTimPitStart;
    }

    /**
     * Sets the value of the eTimPitStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimPitStart(TimeMeasure value) {
        this.eTimPitStart = value;
    }

    /**
     * Gets the value of the mdCementTop property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdCementTop() {
        return mdCementTop;
    }

    /**
     * Sets the value of the mdCementTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdCementTop(MeasuredDepthCoord value) {
        this.mdCementTop = value;
    }

    /**
     * Gets the value of the topCementMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopCementMethod() {
        return topCementMethod;
    }

    /**
     * Sets the value of the topCementMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopCementMethod(String value) {
        this.topCementMethod = value;
    }

    /**
     * Gets the value of the tocOK property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTocOK() {
        return tocOK;
    }

    /**
     * Sets the value of the tocOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTocOK(Boolean value) {
        this.tocOK = value;
    }

    /**
     * Gets the value of the jobRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobRating() {
        return jobRating;
    }

    /**
     * Sets the value of the jobRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobRating(String value) {
        this.jobRating = value;
    }

    /**
     * Gets the value of the remedialCement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemedialCement() {
        return remedialCement;
    }

    /**
     * Sets the value of the remedialCement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemedialCement(Boolean value) {
        this.remedialCement = value;
    }

    /**
     * Gets the value of the numRemedial property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumRemedial() {
        return numRemedial;
    }

    /**
     * Sets the value of the numRemedial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumRemedial(Short value) {
        this.numRemedial = value;
    }

    /**
     * Gets the value of the failureMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureMethod() {
        return failureMethod;
    }

    /**
     * Sets the value of the failureMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureMethod(String value) {
        this.failureMethod = value;
    }

    /**
     * Gets the value of the linerTop property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLinerTop() {
        return linerTop;
    }

    /**
     * Sets the value of the linerTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLinerTop(LengthMeasure value) {
        this.linerTop = value;
    }

    /**
     * Gets the value of the linerLap property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLinerLap() {
        return linerLap;
    }

    /**
     * Sets the value of the linerLap property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLinerLap(LengthMeasure value) {
        this.linerLap = value;
    }

    /**
     * Gets the value of the eTimBeforeTest property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMeasure }
     *     
     */
    public TimeMeasure getETimBeforeTest() {
        return eTimBeforeTest;
    }

    /**
     * Sets the value of the eTimBeforeTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMeasure }
     *     
     */
    public void setETimBeforeTest(TimeMeasure value) {
        this.eTimBeforeTest = value;
    }

    /**
     * Gets the value of the testNegativeTool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestNegativeTool() {
        return testNegativeTool;
    }

    /**
     * Sets the value of the testNegativeTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestNegativeTool(String value) {
        this.testNegativeTool = value;
    }

    /**
     * Gets the value of the testNegativeEmw property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getTestNegativeEmw() {
        return testNegativeEmw;
    }

    /**
     * Sets the value of the testNegativeEmw property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setTestNegativeEmw(DensityMeasure value) {
        this.testNegativeEmw = value;
    }

    /**
     * Gets the value of the testPositiveTool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestPositiveTool() {
        return testPositiveTool;
    }

    /**
     * Sets the value of the testPositiveTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestPositiveTool(String value) {
        this.testPositiveTool = value;
    }

    /**
     * Gets the value of the testPositiveEmw property.
     * 
     * @return
     *     possible object is
     *     {@link DensityMeasure }
     *     
     */
    public DensityMeasure getTestPositiveEmw() {
        return testPositiveEmw;
    }

    /**
     * Sets the value of the testPositiveEmw property.
     * 
     * @param value
     *     allowed object is
     *     {@link DensityMeasure }
     *     
     */
    public void setTestPositiveEmw(DensityMeasure value) {
        this.testPositiveEmw = value;
    }

    /**
     * Gets the value of the cementFoundOnTool property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCementFoundOnTool() {
        return cementFoundOnTool;
    }

    /**
     * Sets the value of the cementFoundOnTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCementFoundOnTool(Boolean value) {
        this.cementFoundOnTool = value;
    }

    /**
     * Gets the value of the mdDVTool property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public MeasuredDepthCoord getMdDVTool() {
        return mdDVTool;
    }

    /**
     * Sets the value of the mdDVTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredDepthCoord }
     *     
     */
    public void setMdDVTool(MeasuredDepthCoord value) {
        this.mdDVTool = value;
    }

}
