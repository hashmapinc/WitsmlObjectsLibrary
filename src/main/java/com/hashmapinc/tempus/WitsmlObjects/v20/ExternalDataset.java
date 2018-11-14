


package com.hashmapinc.tempus.WitsmlObjects.v20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalDataset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="ExternalDataset">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExternalFileProxy" type="{http://www.energistics.org/energyml/data/commonv2}ExternalDatasetPart" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalDataset", propOrder = {
    "externalFileProxy"
})
public class ExternalDataset {

    @XmlElement(name = "ExternalFileProxy", required = true)
    protected List<ExternalDatasetPart> externalFileProxy;

    /**
     * Gets the value of the externalFileProxy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalFileProxy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalFileProxy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalDatasetPart }
     * 
     * 
     */
    public List<ExternalDatasetPart> getExternalFileProxy() {
        if (externalFileProxy == null) {
            externalFileProxy = new ArrayList<ExternalDatasetPart>();
        }
        return this.externalFileProxy;
    }

}
