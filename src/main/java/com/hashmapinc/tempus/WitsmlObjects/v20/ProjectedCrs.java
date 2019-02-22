


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the Energistics encapsulation of the ProjectedCrs type from GML.
 * 
 * <p>Java class for ProjectedCrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ProjectedCrs">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="AxisOrder" type="{http://www.energistics.org/energyml/data/commonv2}AxisOrder2d"/>
 *         <element name="AbstractProjectedCrs" type="{http://www.energistics.org/energyml/data/commonv2}AbstractProjectedCrs"/>
 *       </sequence>
 *       <attribute name="uom" type="{http://www.energistics.org/energyml/data/commonv2}LengthUomExt" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectedCrs", propOrder = {
    "axisOrder",
    "abstractProjectedCrs"
})
public class ProjectedCrs
    extends AbstractObject
{

    @XmlElement(name = "AxisOrder", required = true)
    @XmlSchemaType(name = "string")
    protected String axisOrder;
    @XmlElement(name = "AbstractProjectedCrs", required = true)
    protected AbstractProjectedCrs abstractProjectedCrs;
    @XmlAttribute(name = "uom")
    protected String uom;

    /**
     * Gets the value of the axisOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxisOrder() {
        return axisOrder;
    }

    /**
     * Sets the value of the axisOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxisOrder(String value) {
        this.axisOrder = value;
    }

    /**
     * Gets the value of the abstractProjectedCrs property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractProjectedCrs }
     *     
     */
    public AbstractProjectedCrs getAbstractProjectedCrs() {
        return abstractProjectedCrs;
    }

    /**
     * Sets the value of the abstractProjectedCrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractProjectedCrs }
     *     
     */
    public void setAbstractProjectedCrs(AbstractProjectedCrs value) {
        this.abstractProjectedCrs = value;
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
