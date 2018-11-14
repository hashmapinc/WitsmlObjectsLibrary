


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Qualifies the index as depth.
 * 
 * <p>Java class for DepthIndexValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="DepthIndexValue">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/witsmlv2}AbstractIndexValue">
 *       <sequence>
 *         <element name="Depth" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepthIndexValue", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "depth"
})
public class DepthIndexValue
    extends AbstractIndexValue
{

    @XmlElement(name = "Depth")
    protected float depth;

    /**
     * Gets the value of the depth property.
     * 
     */
    public float getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     */
    public void setDepth(float value) {
        this.depth = value;
    }

}
