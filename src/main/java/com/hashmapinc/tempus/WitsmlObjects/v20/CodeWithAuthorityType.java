


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * gml:CodeWithAuthorityType requires that the codeSpace attribute is provided in an instance.
 * 
 * <p>Java class for CodeWithAuthorityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="CodeWithAuthorityType">
 *   <simpleContent>
 *     <restriction base="<http://www.opengis.net/gml/3.2>CodeType">
 *       <attribute name="codeSpace" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     </restriction>
 *   </simpleContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeWithAuthorityType", namespace = "http://www.opengis.net/gml/3.2")
public class CodeWithAuthorityType
    extends CodeType
{


}
