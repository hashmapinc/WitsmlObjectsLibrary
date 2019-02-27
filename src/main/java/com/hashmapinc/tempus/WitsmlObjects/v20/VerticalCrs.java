


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerticalCrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="VerticalCrs">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="Direction" type="{http://www.energistics.org/energyml/data/commonv2}String"/>
 *         <element name="AbstractVerticalCrs" type="{http://www.energistics.org/energyml/data/commonv2}AbstractVerticalCrs"/>
 *       </sequence>
 *       <attribute name="uom" use="required" type="{http://www.energistics.org/energyml/data/commonv2}LengthUomExt" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalCrs", propOrder = {
    "direction",
    "abstractVerticalCrs"
})
public class VerticalCrs
    extends AbstractObject
{

    @XmlElement(name = "Direction", required = true)
    @XmlSchemaType(name = "string")
    protected String direction;
    @XmlElement(name = "AbstractVerticalCrs", required = true)
    protected AbstractVerticalCrs abstractVerticalCrs;
    @XmlAttribute(name = "uom", required = true)
    protected String uom;

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the abstractVerticalCrs property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractVerticalCrs }
     *     
     */
    public AbstractVerticalCrs getAbstractVerticalCrs() {
        return abstractVerticalCrs;
    }

    /**
     * Sets the value of the abstractVerticalCrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractVerticalCrs }
     *     
     */
    public void setAbstractVerticalCrs(AbstractVerticalCrs value) {
        this.abstractVerticalCrs = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

}
