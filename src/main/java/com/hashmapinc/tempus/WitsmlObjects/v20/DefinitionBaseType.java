


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefinitionBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="DefinitionBaseType">
 *   <complexContent>
 *     <restriction base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       <sequence>
 *         <element ref="{http://www.opengis.net/gml/3.2}description" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}descriptionReference" minOccurs="0"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}identifier"/>
 *         <element ref="{http://www.opengis.net/gml/3.2}name" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefinitionBaseType", namespace = "http://www.opengis.net/gml/3.2")
@XmlSeeAlso({
    DefinitionType.class
})
public class DefinitionBaseType
    extends AbstractGMLType
{


}
