


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GraphicalInformationSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="GraphicalInformationSet">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="GraphicalInformation" type="{http://www.energistics.org/energyml/data/commonv2}AbstractGraphicalInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GraphicalInformationSet", propOrder = {
    "graphicalInformation"
})
public class GraphicalInformationSet
    extends AbstractObject
{

    @XmlElement(name = "GraphicalInformation")
    protected List<AbstractGraphicalInformation> graphicalInformation;

    /**
     * Gets the value of the graphicalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractGraphicalInformation }
     * 
     * 
     */
    public List<AbstractGraphicalInformation> getGraphicalInformation() {
        if (graphicalInformation == null) {
            graphicalInformation = new ArrayList<AbstractGraphicalInformation>();
        }
        return this.graphicalInformation;
    }

}
