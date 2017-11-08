package com.hashmapinc.tempus.WitsmlObjects.v1311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
//import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for indexedObject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre> {@code
 * <complexType name="indexedObject">
 *   <simpleContent>
 *     <extension base="<http://www.witsml.org/schemas/131>abstractTypeEnum">
 *       <attribute name="index" use="required" type="{http://www.witsml.org/schemas/131}positiveCount" />
 *       <attribute name="name" type="{http://www.witsml.org/schemas/131}kindString" />
 *       <attribute name="uom" type="{http://www.witsml.org/schemas/131}uomString" />
 *       <attribute name="description" type="{http://www.witsml.org/schemas/131}descriptionString" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * } </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indexedObject", propOrder = {
        "value"
})
public class IndexedObject extends com.hashmapinc.tempus.WitsmlObjects.common.IndexedObject {

}
