


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Qualifies depth based on pass, direction and depth
 * 
 * <p>Java class for PassIndexedDepth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="PassIndexedDepth">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/witsmlv2}AbstractIndexValue">
 *       <sequence>
 *         <element name="Pass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Direction" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "PassIndexedDepth", namespace = "http://www.energistics.org/energyml/data/witsmlv2", propOrder = {
    "pass",
    "direction",
    "depth"
})
public class PassIndexedDepth
    extends AbstractIndexValue
{

    @XmlElement(name = "Pass")
    protected int pass;
    @XmlElement(name = "Direction")
    protected int direction;
    @XmlElement(name = "Depth")
    protected float depth;

    /**
     * Gets the value of the pass property.
     * 
     */
    public int getPass() {
        return pass;
    }

    /**
     * Sets the value of the pass property.
     * 
     */
    public void setPass(int value) {
        this.pass = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     */
    public int getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     */
    public void setDirection(int value) {
        this.direction = value;
    }

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
