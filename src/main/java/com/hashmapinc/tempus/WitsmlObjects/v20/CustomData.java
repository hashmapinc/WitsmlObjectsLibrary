


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * WITSML - Custom or User Defined Element and Attributes Component Schema.
 *                                                 Specify custom element, attributes, and types in the custom data area.
 * 
 * <p>Java class for CustomData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="CustomData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomData", propOrder = {
    "any"
})
public class CustomData {

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    public void setAny(List<Object> anyList) {
        this.any = anyList;
    }



    //=========================================================================
    // conversion helpers
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1311.CsCustomData to1311CustomData() {
        com.hashmapinc.tempus.WitsmlObjects.v1311.CsCustomData custom = new com.hashmapinc.tempus.WitsmlObjects.v1311.CsCustomData();
        custom.setAny(this.any);
        return custom;
    }

    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsCustomData to1411CustomData() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsCustomData custom = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsCustomData();
        custom.setAny(this.any);
        return custom;
    }
    //=========================================================================
}
