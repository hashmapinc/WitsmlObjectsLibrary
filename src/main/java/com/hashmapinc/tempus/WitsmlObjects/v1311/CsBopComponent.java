package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * WITSML - Blow Out Preventer Component Schema.
 * 
 * <p>Java class for cs_bopComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_bopComponent">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="typeBopComp" type="{http://www.witsml.org/schemas/131}BopType" minOccurs="0"/>
 *         <element name="descComp" type="{http://www.witsml.org/schemas/131}shortDescriptionString" minOccurs="0"/>
 *         <element name="idPassThru" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="presWork" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="diaCloseMn" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="diaCloseMx" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="nomenclature" type="{http://www.witsml.org/schemas/131}str2" minOccurs="0"/>
 *         <element name="isVariable" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_bopComponent", propOrder = {
    "typeBopComp",
    "descComp",
    "idPassThru",
    "presWork",
    "diaCloseMn",
    "diaCloseMx",
    "nomenclature",
    "isVariable"
})
public class CsBopComponent {

    @XmlSchemaType(name = "string")
    protected BopType typeBopComp;
    protected String descComp;
    protected LengthMeasure idPassThru;
    protected PressureMeasure presWork;
    protected LengthMeasure diaCloseMn;
    protected LengthMeasure diaCloseMx;
    protected String nomenclature;
    protected Boolean isVariable;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the typeBopComp property.
     * 
     * @return
     *     possible object is
     *     {@link BopType }
     *     
     */
    public BopType getTypeBopComp() {
        return typeBopComp;
    }

    /**
     * Sets the value of the typeBopComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BopType }
     *     
     */
    public void setTypeBopComp(BopType value) {
        this.typeBopComp = value;
    }

    /**
     * Gets the value of the descComp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescComp() {
        return descComp;
    }

    /**
     * Sets the value of the descComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescComp(String value) {
        this.descComp = value;
    }

    /**
     * Gets the value of the idPassThru property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdPassThru() {
        return idPassThru;
    }

    /**
     * Sets the value of the idPassThru property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdPassThru(LengthMeasure value) {
        this.idPassThru = value;
    }

    /**
     * Gets the value of the presWork property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresWork() {
        return presWork;
    }

    /**
     * Sets the value of the presWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresWork(PressureMeasure value) {
        this.presWork = value;
    }

    /**
     * Gets the value of the diaCloseMn property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaCloseMn() {
        return diaCloseMn;
    }

    /**
     * Sets the value of the diaCloseMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaCloseMn(LengthMeasure value) {
        this.diaCloseMn = value;
    }

    /**
     * Gets the value of the diaCloseMx property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getDiaCloseMx() {
        return diaCloseMx;
    }

    /**
     * Sets the value of the diaCloseMx property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setDiaCloseMx(LengthMeasure value) {
        this.diaCloseMx = value;
    }

    /**
     * Gets the value of the nomenclature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomenclature() {
        return nomenclature;
    }

    /**
     * Sets the value of the nomenclature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomenclature(String value) {
        this.nomenclature = value;
    }

    /**
     * Gets the value of the isVariable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVariable() {
        return isVariable;
    }

    /**
     * Sets the value of the isVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVariable(Boolean value) {
        this.isVariable = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
