


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This class contains a code for a vertical CRS according to a local authority. This would be used in a case where a company or regulatory regime has chosen not to use EPSG codes. 
 * 
 * <p>Java class for VerticalLocalAuthorityCrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="VerticalLocalAuthorityCrs">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractVerticalCrs">
 *       <sequence>
 *         <element name="LocalAuthorityCrsName" type="{http://www.energistics.org/energyml/data/commonv2}AuthorityQualifiedName"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalLocalAuthorityCrs", propOrder = {
    "localAuthorityCrsName"
})
public class VerticalLocalAuthorityCrs
    extends AbstractVerticalCrs
{

    @XmlElement(name = "LocalAuthorityCrsName", required = true)
    protected AuthorityQualifiedName localAuthorityCrsName;

    /**
     * Gets the value of the localAuthorityCrsName property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityQualifiedName }
     *     
     */
    public AuthorityQualifiedName getLocalAuthorityCrsName() {
        return localAuthorityCrsName;
    }

    /**
     * Sets the value of the localAuthorityCrsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityQualifiedName }
     *     
     */
    public void setLocalAuthorityCrsName(AuthorityQualifiedName value) {
        this.localAuthorityCrsName = value;
    }

}
