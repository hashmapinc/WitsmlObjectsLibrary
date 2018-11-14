


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This class contains the EPSG code for a vertical CRS.
 * 
 * <p>Java class for VerticalEpsgCrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="VerticalEpsgCrs">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractVerticalCrs">
 *       <sequence>
 *         <element name="EpsgCode" type="{http://www.energistics.org/energyml/data/commonv2}PositiveLong"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalEpsgCrs", propOrder = {
    "epsgCode"
})
public class VerticalEpsgCrs
    extends AbstractVerticalCrs
{

    @XmlElement(name = "EpsgCode")
    protected long epsgCode;

    /**
     * Gets the value of the epsgCode property.
     * 
     */
    public long getEpsgCode() {
        return epsgCode;
    }

    /**
     * Sets the value of the epsgCode property.
     * 
     */
    public void setEpsgCode(long value) {
        this.epsgCode = value;
    }

}
