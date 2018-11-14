


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The Abstract base type of standard pressure and temperature
 * 
 * <p>Java class for AbstractTemperaturePressure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractTemperaturePressure">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice minOccurs="0">
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTemperaturePressure")
@XmlSeeAlso({
    TemperaturePressure.class,
    ReferenceTemperaturePressure.class
})
public abstract class AbstractTemperaturePressure {


}
