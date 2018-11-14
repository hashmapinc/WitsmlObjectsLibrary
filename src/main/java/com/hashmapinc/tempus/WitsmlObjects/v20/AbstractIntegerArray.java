


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Generic representation of an array of integer values. Each derived element provides specialized implementation to allow specific optimization of the representation.
 * 
 * <p>Java class for AbstractIntegerArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractIntegerArray">
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
@XmlType(name = "AbstractIntegerArray")
@XmlSeeAlso({
    IntegerRangeArray.class,
    IntegerArrayFromBooleanMaskArray.class,
    IntegerConstantArray.class,
    IntegerExternalArray.class,
    IntegerLatticeArray.class
})
public abstract class AbstractIntegerArray
    extends AbstractNumericArray
{


}
