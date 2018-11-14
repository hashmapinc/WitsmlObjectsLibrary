


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This class contains the EPSG code for a geodetic CRS. 
 * 
 * <p>Java class for GeodeticEpsgCrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="GeodeticEpsgCrs">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractGeodeticCrs">
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
@XmlType(name = "GeodeticEpsgCrs", propOrder = {
    "epsgCode"
})
public class GeodeticEpsgCrs
    extends AbstractGeodeticCrs
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
