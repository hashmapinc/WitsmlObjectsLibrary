


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Land survey system that describes the well by range, township, section, etc.
 * 
 * <p>Java class for PublicLandSurveySystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="PublicLandSurveySystem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrincipalMeridian" type="{http://www.energistics.org/energyml/data/witsmlv2}PrincipalMeridian" minOccurs="0"/>
 *         <element name="Range" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="RangeDir" type="{http://www.energistics.org/energyml/data/witsmlv2}EastOrWest" minOccurs="0"/>
 *         <element name="Township" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="TownshipDir" type="{http://www.energistics.org/energyml/data/witsmlv2}NorthOrSouth" minOccurs="0"/>
 *         <element name="Section" type="{http://www.energistics.org/energyml/data/witsmlv2}SectionNumber" minOccurs="0"/>
 *         <element name="QuarterSection" type="{http://www.energistics.org/energyml/data/witsmlv2}PublicLandSurveySystemQuarterSection" minOccurs="0"/>
 *         <element name="QuarterTownship" type="{http://www.energistics.org/energyml/data/witsmlv2}PublicLandSurveySystemQuarterTownship" minOccurs="0"/>
 *         <element name="FootageNS" type="{http://www.energistics.org/energyml/data/witsmlv2}DistanceNorthSouth" minOccurs="0"/>
 *         <element name="FootageEW" type="{http://www.energistics.org/energyml/data/witsmlv2}DistanceEastWest" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicLandSurveySystem", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "principalMeridian",
    "range",
    "rangeDir",
    "township",
    "townshipDir",
    "section",
    "quarterSection",
    "quarterTownship",
    "footageNS",
    "footageEW"
})
public class PublicLandSurveySystem {

    @XmlElement(name = "PrincipalMeridian")
    protected String principalMeridian;
    @XmlElement(name = "Range")
    protected Integer range;
    @XmlElement(name = "RangeDir")
    @XmlSchemaType(name = "string")
    protected EastOrWest rangeDir;
    @XmlElement(name = "Township")
    protected Integer township;
    @XmlElement(name = "TownshipDir")
    @XmlSchemaType(name = "string")
    protected NorthOrSouth townshipDir;
    @XmlElement(name = "Section")
    protected String section;
    @XmlElement(name = "QuarterSection")
    protected String quarterSection;
    @XmlElement(name = "QuarterTownship")
    protected String quarterTownship;
    @XmlElement(name = "FootageNS")
    protected DistanceNorthSouth footageNS;
    @XmlElement(name = "FootageEW")
    protected DistanceEastWest footageEW;

    /**
     * Gets the value of the principalMeridian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalMeridian() {
        return principalMeridian;
    }

    /**
     * Sets the value of the principalMeridian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalMeridian(String value) {
        this.principalMeridian = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRange(Integer value) {
        this.range = value;
    }

    /**
     * Gets the value of the rangeDir property.
     * 
     * @return
     *     possible object is
     *     {@link EastOrWest }
     *     
     */
    public EastOrWest getRangeDir() {
        return rangeDir;
    }

    /**
     * Sets the value of the rangeDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link EastOrWest }
     *     
     */
    public void setRangeDir(EastOrWest value) {
        this.rangeDir = value;
    }

    /**
     * Gets the value of the township property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTownship() {
        return township;
    }

    /**
     * Sets the value of the township property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTownship(Integer value) {
        this.township = value;
    }

    /**
     * Gets the value of the townshipDir property.
     * 
     * @return
     *     possible object is
     *     {@link NorthOrSouth }
     *     
     */
    public NorthOrSouth getTownshipDir() {
        return townshipDir;
    }

    /**
     * Sets the value of the townshipDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link NorthOrSouth }
     *     
     */
    public void setTownshipDir(NorthOrSouth value) {
        this.townshipDir = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the quarterSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterSection() {
        return quarterSection;
    }

    /**
     * Sets the value of the quarterSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterSection(String value) {
        this.quarterSection = value;
    }

    /**
     * Gets the value of the quarterTownship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterTownship() {
        return quarterTownship;
    }

    /**
     * Sets the value of the quarterTownship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterTownship(String value) {
        this.quarterTownship = value;
    }

    /**
     * Gets the value of the footageNS property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceNorthSouth }
     *     
     */
    public DistanceNorthSouth getFootageNS() {
        return footageNS;
    }

    /**
     * Sets the value of the footageNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceNorthSouth }
     *     
     */
    public void setFootageNS(DistanceNorthSouth value) {
        this.footageNS = value;
    }

    /**
     * Gets the value of the footageEW property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceEastWest }
     *     
     */
    public DistanceEastWest getFootageEW() {
        return footageEW;
    }

    /**
     * Sets the value of the footageEW property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceEastWest }
     *     
     */
    public void setFootageEW(DistanceEastWest value) {
        this.footageEW = value;
    }

}
