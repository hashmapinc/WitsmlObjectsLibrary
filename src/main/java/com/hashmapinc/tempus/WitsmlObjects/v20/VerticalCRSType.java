


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerticalCRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="VerticalCRSType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}verticalCS"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}verticalDatum"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalCRSType", namespace = "http://www.opengis.net/gml/3.2", propOrder = {
    "verticalCS",
    "verticalDatum"
})
public class VerticalCRSType
    extends AbstractCRSType
{

    @XmlElement(required = true)
    protected VerticalCSPropertyType verticalCS;
    @XmlElement(required = true)
    protected VerticalDatumPropertyType verticalDatum;

    /**
     * Gets the value of the verticalCS property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalCSPropertyType }
     *     
     */
    public VerticalCSPropertyType getVerticalCS() {
        return verticalCS;
    }

    /**
     * Sets the value of the verticalCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalCSPropertyType }
     *     
     */
    public void setVerticalCS(VerticalCSPropertyType value) {
        this.verticalCS = value;
    }

    /**
     * Gets the value of the verticalDatum property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalDatumPropertyType }
     *     
     */
    public VerticalDatumPropertyType getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * Sets the value of the verticalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalDatumPropertyType }
     *     
     */
    public void setVerticalDatum(VerticalDatumPropertyType value) {
        this.verticalDatum = value;
    }

}
