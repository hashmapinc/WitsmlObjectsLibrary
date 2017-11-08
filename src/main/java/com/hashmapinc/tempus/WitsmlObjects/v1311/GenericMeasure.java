package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A generic measure type.
 * 			This should not be used except in situations where the underlying class of data is 
 * 			captured elsewhere. For example, for a log curve.
 * 
 * <p>Java class for genericMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="genericMeasure">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractMeasure">
 *       <attribute name="uom" type="{http://www.witsml.org/schemas/131}uomString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericMeasure")
public class GenericMeasure
    extends com.hashmapinc.tempus.WitsmlObjects.common.GenericMeasure
{

}
