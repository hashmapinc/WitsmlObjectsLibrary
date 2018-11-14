


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Generic representation of pass, depth, or time values. Each derived element provides specialized implementation for specific content types or for optimization of the representation.
 * 
 * <p>Java class for AbstractIndexValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractIndexValue">
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
@XmlType(name = "AbstractIndexValue", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlSeeAlso({
    DepthIndexValue.class,
    TimeIndexValue.class,
    PassIndexedDepth.class
})
public abstract class AbstractIndexValue {


}
