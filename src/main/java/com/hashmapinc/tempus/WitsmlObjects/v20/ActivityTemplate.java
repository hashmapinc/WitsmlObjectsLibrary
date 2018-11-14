


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of one type of activity.
 * 
 * <p>Java class for ActivityTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ActivityTemplate">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractObject">
 *       <sequence>
 *         <element name="Parameter" type="{http://www.energistics.org/energyml/data/commonv2}ParameterTemplate" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityTemplate", propOrder = {
    "parameter"
})
public class ActivityTemplate
    extends AbstractObject
{

    @XmlElement(name = "Parameter", required = true)
    protected List<ParameterTemplate> parameter;

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterTemplate }
     * 
     * 
     */
    public List<ParameterTemplate> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<ParameterTemplate>();
        }
        return this.parameter;
    }

}
