


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * gml:RelatedTimeType provides a content model for indicating the relative position of an arbitrary member of the substitution group whose head is gml:AbstractTimePrimitive. It extends the generic gml:TimePrimitivePropertyType with an XML attribute relativePosition, whose value is selected from the set of 13 temporal relationships identified by Allen (1983)
 * 
 * <p>Java class for RelatedTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="RelatedTimeType">
 *   <complexContent>
 *     <extension base="{http://www.opengis.net/gml/3.2}TimePrimitivePropertyType">
 *       <attribute name="relativePosition">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             <enumeration value="Before"/>
 *             <enumeration value="After"/>
 *             <enumeration value="Begins"/>
 *             <enumeration value="Ends"/>
 *             <enumeration value="During"/>
 *             <enumeration value="Equals"/>
 *             <enumeration value="Contains"/>
 *             <enumeration value="Overlaps"/>
 *             <enumeration value="Meets"/>
 *             <enumeration value="OverlappedBy"/>
 *             <enumeration value="MetBy"/>
 *             <enumeration value="BegunBy"/>
 *             <enumeration value="EndedBy"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedTimeType", namespace = "http://www.opengis.net/gml/3.2")
public class RelatedTimeType
    extends TimePrimitivePropertyType
{

    @XmlAttribute(name = "relativePosition")
    protected String relativePosition;

    /**
     * Gets the value of the relativePosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativePosition() {
        return relativePosition;
    }

    /**
     * Sets the value of the relativePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativePosition(String value) {
        this.relativePosition = value;
    }

}
