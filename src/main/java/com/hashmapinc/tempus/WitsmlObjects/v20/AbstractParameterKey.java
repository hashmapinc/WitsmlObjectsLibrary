


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract class describing a key used to identify a parameter value. When multiple values are provided for a given parameter, provides a way to identify the parameter through its association with an object, a time index... 
 * 
 * <p>Java class for AbstractParameterKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractParameterKey">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractParameterKey")
@XmlSeeAlso({
    TimeIndexParameterKey.class,
    ObjectParameterKey.class
})
public abstract class AbstractParameterKey {


}
