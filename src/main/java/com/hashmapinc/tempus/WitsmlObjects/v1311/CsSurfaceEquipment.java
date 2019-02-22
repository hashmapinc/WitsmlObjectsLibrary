package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  WITSML - Rig Surface Equipment Component Schema 
 * 
 * <p>Java class for cs_surfaceEquipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_surfaceEquipment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="description" type="{http://www.witsml.org/schemas/131}commentString" minOccurs="0"/>
 *         <element name="presRating" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="typeSurfEquip" type="{http://www.witsml.org/schemas/131}SurfEquipType"/>
 *         <element name="usePumpDischarge" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="useStandpipe" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="useHose" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="useSwivel" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="useKelly" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="useTopStack" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="useInjStack" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="useSurfaceIron" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="idStandpipe" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenStandpipe" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idHose" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenHose" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idSwivel" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenSwivel" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idKelly" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenKelly" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idSurfaceIron" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenSurfaceIron" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="htSurfaceIron" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idDischargeLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenDischargeLine" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="ctWrapType" type="{http://www.witsml.org/schemas/131}str16" minOccurs="0"/>
 *         <element name="odReel" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="odCore" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="widReelWrap" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenReel" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="injStkUp" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="htInjStk" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="umbInside" type="{http://www.witsml.org/schemas/131}logicalBoolean" minOccurs="0"/>
 *         <element name="odUmbilical" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="lenUmbilical" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="idTopStk" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="htTopStk" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *         <element name="htFlange" type="{http://www.witsml.org/schemas/131}lengthMeasure" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_surfaceEquipment", propOrder = {
    "description",
    "presRating",
    "typeSurfEquip",
    "usePumpDischarge",
    "useStandpipe",
    "useHose",
    "useSwivel",
    "useKelly",
    "useTopStack",
    "useInjStack",
    "useSurfaceIron",
    "idStandpipe",
    "lenStandpipe",
    "idHose",
    "lenHose",
    "idSwivel",
    "lenSwivel",
    "idKelly",
    "lenKelly",
    "idSurfaceIron",
    "lenSurfaceIron",
    "htSurfaceIron",
    "idDischargeLine",
    "lenDischargeLine",
    "ctWrapType",
    "odReel",
    "odCore",
    "widReelWrap",
    "lenReel",
    "injStkUp",
    "htInjStk",
    "umbInside",
    "odUmbilical",
    "lenUmbilical",
    "idTopStk",
    "htTopStk",
    "htFlange"
})
public class CsSurfaceEquipment {

    protected String description;
    protected PressureMeasure presRating;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected String typeSurfEquip;
    protected Boolean usePumpDischarge;
    protected Boolean useStandpipe;
    protected Boolean useHose;
    protected Boolean useSwivel;
    protected Boolean useKelly;
    protected Boolean useTopStack;
    protected Boolean useInjStack;
    protected Boolean useSurfaceIron;
    protected LengthMeasure idStandpipe;
    protected LengthMeasure lenStandpipe;
    protected LengthMeasure idHose;
    protected LengthMeasure lenHose;
    protected LengthMeasure idSwivel;
    protected LengthMeasure lenSwivel;
    protected LengthMeasure idKelly;
    protected LengthMeasure lenKelly;
    protected LengthMeasure idSurfaceIron;
    protected LengthMeasure lenSurfaceIron;
    protected LengthMeasure htSurfaceIron;
    protected LengthMeasure idDischargeLine;
    protected LengthMeasure lenDischargeLine;
    protected String ctWrapType;
    protected LengthMeasure odReel;
    protected LengthMeasure odCore;
    protected LengthMeasure widReelWrap;
    protected LengthMeasure lenReel;
    protected Boolean injStkUp;
    protected LengthMeasure htInjStk;
    protected Boolean umbInside;
    protected LengthMeasure odUmbilical;
    protected LengthMeasure lenUmbilical;
    protected LengthMeasure idTopStk;
    protected LengthMeasure htTopStk;
    protected LengthMeasure htFlange;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the presRating property.
     * 
     * @return
     *     possible object is
     *     {@link PressureMeasure }
     *     
     */
    public PressureMeasure getPresRating() {
        return presRating;
    }

    /**
     * Sets the value of the presRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link PressureMeasure }
     *     
     */
    public void setPresRating(PressureMeasure value) {
        this.presRating = value;
    }

    /**
     * Gets the value of the typeSurfEquip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSurfEquip() {
        return typeSurfEquip;
    }

    /**
     * Sets the value of the typeSurfEquip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSurfEquip(String value) {
        this.typeSurfEquip = value;
    }

    /**
     * Gets the value of the usePumpDischarge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePumpDischarge() {
        return usePumpDischarge;
    }

    /**
     * Sets the value of the usePumpDischarge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePumpDischarge(Boolean value) {
        this.usePumpDischarge = value;
    }

    /**
     * Gets the value of the useStandpipe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseStandpipe() {
        return useStandpipe;
    }

    /**
     * Sets the value of the useStandpipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseStandpipe(Boolean value) {
        this.useStandpipe = value;
    }

    /**
     * Gets the value of the useHose property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseHose() {
        return useHose;
    }

    /**
     * Sets the value of the useHose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseHose(Boolean value) {
        this.useHose = value;
    }

    /**
     * Gets the value of the useSwivel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSwivel() {
        return useSwivel;
    }

    /**
     * Sets the value of the useSwivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSwivel(Boolean value) {
        this.useSwivel = value;
    }

    /**
     * Gets the value of the useKelly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseKelly() {
        return useKelly;
    }

    /**
     * Sets the value of the useKelly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseKelly(Boolean value) {
        this.useKelly = value;
    }

    /**
     * Gets the value of the useTopStack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTopStack() {
        return useTopStack;
    }

    /**
     * Sets the value of the useTopStack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTopStack(Boolean value) {
        this.useTopStack = value;
    }

    /**
     * Gets the value of the useInjStack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseInjStack() {
        return useInjStack;
    }

    /**
     * Sets the value of the useInjStack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseInjStack(Boolean value) {
        this.useInjStack = value;
    }

    /**
     * Gets the value of the useSurfaceIron property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSurfaceIron() {
        return useSurfaceIron;
    }

    /**
     * Sets the value of the useSurfaceIron property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSurfaceIron(Boolean value) {
        this.useSurfaceIron = value;
    }

    /**
     * Gets the value of the idStandpipe property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdStandpipe() {
        return idStandpipe;
    }

    /**
     * Sets the value of the idStandpipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdStandpipe(LengthMeasure value) {
        this.idStandpipe = value;
    }

    /**
     * Gets the value of the lenStandpipe property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenStandpipe() {
        return lenStandpipe;
    }

    /**
     * Sets the value of the lenStandpipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenStandpipe(LengthMeasure value) {
        this.lenStandpipe = value;
    }

    /**
     * Gets the value of the idHose property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdHose() {
        return idHose;
    }

    /**
     * Sets the value of the idHose property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdHose(LengthMeasure value) {
        this.idHose = value;
    }

    /**
     * Gets the value of the lenHose property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenHose() {
        return lenHose;
    }

    /**
     * Sets the value of the lenHose property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenHose(LengthMeasure value) {
        this.lenHose = value;
    }

    /**
     * Gets the value of the idSwivel property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdSwivel() {
        return idSwivel;
    }

    /**
     * Sets the value of the idSwivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdSwivel(LengthMeasure value) {
        this.idSwivel = value;
    }

    /**
     * Gets the value of the lenSwivel property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenSwivel() {
        return lenSwivel;
    }

    /**
     * Sets the value of the lenSwivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenSwivel(LengthMeasure value) {
        this.lenSwivel = value;
    }

    /**
     * Gets the value of the idKelly property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdKelly() {
        return idKelly;
    }

    /**
     * Sets the value of the idKelly property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdKelly(LengthMeasure value) {
        this.idKelly = value;
    }

    /**
     * Gets the value of the lenKelly property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenKelly() {
        return lenKelly;
    }

    /**
     * Sets the value of the lenKelly property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenKelly(LengthMeasure value) {
        this.lenKelly = value;
    }

    /**
     * Gets the value of the idSurfaceIron property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdSurfaceIron() {
        return idSurfaceIron;
    }

    /**
     * Sets the value of the idSurfaceIron property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdSurfaceIron(LengthMeasure value) {
        this.idSurfaceIron = value;
    }

    /**
     * Gets the value of the lenSurfaceIron property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenSurfaceIron() {
        return lenSurfaceIron;
    }

    /**
     * Sets the value of the lenSurfaceIron property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenSurfaceIron(LengthMeasure value) {
        this.lenSurfaceIron = value;
    }

    /**
     * Gets the value of the htSurfaceIron property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getHtSurfaceIron() {
        return htSurfaceIron;
    }

    /**
     * Sets the value of the htSurfaceIron property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setHtSurfaceIron(LengthMeasure value) {
        this.htSurfaceIron = value;
    }

    /**
     * Gets the value of the idDischargeLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdDischargeLine() {
        return idDischargeLine;
    }

    /**
     * Sets the value of the idDischargeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdDischargeLine(LengthMeasure value) {
        this.idDischargeLine = value;
    }

    /**
     * Gets the value of the lenDischargeLine property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenDischargeLine() {
        return lenDischargeLine;
    }

    /**
     * Sets the value of the lenDischargeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenDischargeLine(LengthMeasure value) {
        this.lenDischargeLine = value;
    }

    /**
     * Gets the value of the ctWrapType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtWrapType() {
        return ctWrapType;
    }

    /**
     * Sets the value of the ctWrapType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtWrapType(String value) {
        this.ctWrapType = value;
    }

    /**
     * Gets the value of the odReel property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdReel() {
        return odReel;
    }

    /**
     * Sets the value of the odReel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdReel(LengthMeasure value) {
        this.odReel = value;
    }

    /**
     * Gets the value of the odCore property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdCore() {
        return odCore;
    }

    /**
     * Sets the value of the odCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdCore(LengthMeasure value) {
        this.odCore = value;
    }

    /**
     * Gets the value of the widReelWrap property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getWidReelWrap() {
        return widReelWrap;
    }

    /**
     * Sets the value of the widReelWrap property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setWidReelWrap(LengthMeasure value) {
        this.widReelWrap = value;
    }

    /**
     * Gets the value of the lenReel property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenReel() {
        return lenReel;
    }

    /**
     * Sets the value of the lenReel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenReel(LengthMeasure value) {
        this.lenReel = value;
    }

    /**
     * Gets the value of the injStkUp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInjStkUp() {
        return injStkUp;
    }

    /**
     * Sets the value of the injStkUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInjStkUp(Boolean value) {
        this.injStkUp = value;
    }

    /**
     * Gets the value of the htInjStk property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getHtInjStk() {
        return htInjStk;
    }

    /**
     * Sets the value of the htInjStk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setHtInjStk(LengthMeasure value) {
        this.htInjStk = value;
    }

    /**
     * Gets the value of the umbInside property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUmbInside() {
        return umbInside;
    }

    /**
     * Sets the value of the umbInside property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUmbInside(Boolean value) {
        this.umbInside = value;
    }

    /**
     * Gets the value of the odUmbilical property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getOdUmbilical() {
        return odUmbilical;
    }

    /**
     * Sets the value of the odUmbilical property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setOdUmbilical(LengthMeasure value) {
        this.odUmbilical = value;
    }

    /**
     * Gets the value of the lenUmbilical property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getLenUmbilical() {
        return lenUmbilical;
    }

    /**
     * Sets the value of the lenUmbilical property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setLenUmbilical(LengthMeasure value) {
        this.lenUmbilical = value;
    }

    /**
     * Gets the value of the idTopStk property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getIdTopStk() {
        return idTopStk;
    }

    /**
     * Sets the value of the idTopStk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setIdTopStk(LengthMeasure value) {
        this.idTopStk = value;
    }

    /**
     * Gets the value of the htTopStk property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getHtTopStk() {
        return htTopStk;
    }

    /**
     * Sets the value of the htTopStk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setHtTopStk(LengthMeasure value) {
        this.htTopStk = value;
    }

    /**
     * Gets the value of the htFlange property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasure }
     *     
     */
    public LengthMeasure getHtFlange() {
        return htFlange;
    }

    /**
     * Sets the value of the htFlange property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasure }
     *     
     */
    public void setHtFlange(LengthMeasure value) {
        this.htFlange = value;
    }

}
