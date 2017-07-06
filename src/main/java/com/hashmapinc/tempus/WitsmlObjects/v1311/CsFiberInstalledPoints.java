package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A wrapper for multiple instances of the point in a well.
 * 
 * <p>Java class for cs_fiberInstalledPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_fiberInstalledPoints">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="installedPoint" type="{http://www.witsml.org/schemas/131}cs_singleInstalledPoint" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_fiberInstalledPoints", propOrder = {
    "installedPoint"
})
public class CsFiberInstalledPoints {

    @XmlElement(required = true)
    protected List<CsSingleInstalledPoint> installedPoint;

    /**
     * Gets the value of the installedPoint property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installedPoint property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getInstalledPoint().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsSingleInstalledPoint }
     * 
     * 
     */
    public List<CsSingleInstalledPoint> getInstalledPoint() {
        if (installedPoint == null) {
            installedPoint = new ArrayList<CsSingleInstalledPoint>();
        }
        return this.installedPoint;
    }

}
