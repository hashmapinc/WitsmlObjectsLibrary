


package com.hashmapinc.tempus.WitsmlObjects.v20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a constraint against the data points in the log's channel. Each time the log is realized, only the data points satisfying this constraint are included.
 * 
 * <p>Java class for AbstractLogDataContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="AbstractLogDataContext">
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
@XmlType(name = "AbstractLogDataContext", namespace = "http://www.energistics.org/energyml/data/witsmlv2")
@XmlSeeAlso({
    IndexRangeContext.class,
    ChannelValueContext.class,
    ObjectContext.class
})
public abstract class AbstractLogDataContext {


}
