//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.26 at 03:00:38 PM CDT 
//


package com.hashmapinc.tempus.WitsmlObjects.v1411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The intended abstract supertype of all schema roots 
 * 			that may be a member of a substitution group (whether contextual or data).
 * 			The type of root global elements should be extended from this type and the 
 * 			root global element should be declared to be a member of one of the above substitution groups.
 * 
 * <p>Java class for abstractObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="abstractObject">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractObject", namespace = "http://www.energistics.org/schemas/abstract")
@XmlSeeAlso({
    ObjAttachments.class,
    ObjFormationMarkers.class,
    ObjOpsReports.class,
    ObjTargets.class,
    ObjWellbores.class,
    ObjDrillReports.class,
    ObjTubulars.class,
    ObjRigs.class,
    ObjChangeLogs.class,
    ObjTrajectorys.class,
    ObjMudLogs.class,
    ObjWells.class,
    ObjToolErrorModels.class,
    ObjBhaRuns.class,
    ObjLogs.class,
    ObjWbGeometrys.class,
    ObjCementJobs.class,
    ObjSurveyPrograms.class,
    ObjToolErrorTermSets.class,
    ObjConvCores.class,
    ObjSidewallCores.class,
    ObjStimJobs.class,
    ObjFluidsReports.class,
    ObjRisks.class,
    ObjObjectGroups.class,
    ObjMessages.class
})
public abstract class AbstractObject {


}
