package com.hashmapinc.tempus.WitsmlObjects.Util;

import com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs;
import com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog;

import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * This class is responsible for transforming WITSML data between 1.3.1.1 and 1.4.1.1 in either direction (automatically determined).
 * The currently supported versions are (automatically determined):
 * <p><ul>
 * <li>v1.3.1.1
 * <li>v1.4.1.1
 * </ul>
 * <p>All data-objects are implicitly supported including the v1.3.1.1 stimJob data-object.
 * A forward transform of a trajectoryStation object will create a trajectory plural with one trajectory per station.
 * The following v1.3.1.1 object is passed through unchanged: realtime

 * <p>The following new v1.4.1 objects are passed through unchanged:
 * <p><ul>
 * <li>attachment
 * <li>changeLog
 * <li>coordinateReferenceSystem
 * <li>drillReport
 * <li>toolErrorModel
 * <li>toolErrorTermSet
 * <li>objectGroup
 * </ul>
 *
 * <p>The following v1.3.1.1 objects are converted to PRODML v1.2:
 * <ul>
 *  <li>dtsMeasurement
 *  <li>dtsInstalledSystem
 * <ul>
 */
public class WitsmlVersionTransformer {

    private Transformer transformer;

    public WitsmlVersionTransformer() throws TransformerConfigurationException {
        StreamSource xslTransformationFile = new StreamSource(getClass().getResourceAsStream("/WITSMLverConvert.xslt"));
        TransformerFactory tFactory = TransformerFactory.newInstance();
        transformer = tFactory.newTransformer(xslTransformationFile);

    }

    /**
     * Converts the passed in WITSML string to the alternate version (auto determined from the namespace of the XML document.
     * 1.3.1.1 is forward converted to 1.4.1.1 and 1.4.1.1 is auto converted to 1.3.1.1
     *
     * @see WitsmlVersionTransformer
     */
    public String convertVersion(String witsmlInput) throws TransformerException {
        StringReader reader = new StringReader(witsmlInput);
        StreamSource xmlInputFile = new StreamSource(reader);
        StringWriter writer = new StringWriter();
        StreamResult xmlOutputFile = new StreamResult(writer);
        transformer.setParameter("omit-banner", "YES");
        transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
        transformer.transform(xmlInputFile, xmlOutputFile);
        writer.flush();
        return writer.toString();
    }

}