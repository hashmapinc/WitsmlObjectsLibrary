


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Generic representation of an array of Boolean values. Each derived element provides a specialized implementation to allow specific optimization of the representation. 
 * 
 * <p>Java class for AbstractBooleanArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractBooleanArray">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractValueArray">
 *       <sequence>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractBooleanArray")
@XmlSeeAlso({
    BooleanArrayFromIndexArray.class,
    BooleanExternalArray.class,
    BooleanConstantArray.class
})
public abstract class AbstractBooleanArray
    extends AbstractValueArray
{


}
