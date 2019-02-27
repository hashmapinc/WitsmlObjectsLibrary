


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Generic representation of an array of double values. Each derived element provides specialized implementation to allow specific optimization of the representation.
 * 
 * <p>Java class for AbstractFloatingPointArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractFloatingPointArray">
 *   <complexContent>
 *     <extension base="{http://www.energistics.org/energyml/data/commonv2}AbstractNumericArray">
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
@XmlType(name = "AbstractFloatingPointArray")
@XmlSeeAlso({
    FloatingPointConstantArray.class,
    FloatingPointExternalArray.class,
    FloatingPointLatticeArray.class
})
public abstract class AbstractFloatingPointArray
    extends AbstractNumericArray
{


}
