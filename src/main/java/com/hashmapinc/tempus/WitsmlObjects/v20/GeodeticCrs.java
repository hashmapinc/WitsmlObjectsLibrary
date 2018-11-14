


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeodeticCrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="GeodeticCrs">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="AbstractGeodeticCrs" type="{http://www.energistics.org/energyml/data/commonv2}AbstractGeodeticCrs"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticCrs", propOrder = {
    "abstractGeodeticCrs"
})
public class GeodeticCrs
    extends AbstractObject
{

    @XmlElement(name = "AbstractGeodeticCrs", required = true)
    protected AbstractGeodeticCrs abstractGeodeticCrs;

    /**
     * Gets the value of the abstractGeodeticCrs property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractGeodeticCrs }
     *     
     */
    public AbstractGeodeticCrs getAbstractGeodeticCrs() {
        return abstractGeodeticCrs;
    }

    /**
     * Sets the value of the abstractGeodeticCrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractGeodeticCrs }
     *     
     */
    public void setAbstractGeodeticCrs(AbstractGeodeticCrs value) {
        this.abstractGeodeticCrs = value;
    }

}
