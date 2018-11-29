package com.hashmapinc.tempus.WitsmlObjects.Util;

import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlMarshal;
import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlVersionTransformer;
import com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWells;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TransformTest {

    @Test
    public void testForwardTransformWells(){
        String forwardConvert = "";
        try {
            WitsmlVersionTransformer transformer = new WitsmlVersionTransformer();
            forwardConvert = transformer.convertVersion(TestUtilities.getResourceAsString("well_no_xsl_1311.xml"));
        } catch (TransformerException | IOException e) {
            e.printStackTrace();
        }
        try {
            ObjWells convertedWell = WitsmlMarshal.deserialize(forwardConvert, ObjWells.class);
            assertNotNull(convertedWell);
            assertEquals("1.4.1.1", convertedWell.getVersion());
            assertEquals("6507/7-A-42", convertedWell.getWell().get(0).getName());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testBackwardTransformWell(){
        String forwardConvert = "";
        try {
            WitsmlVersionTransformer transformer = new WitsmlVersionTransformer();
            forwardConvert = transformer.convertVersion(TestUtilities.getResourceAsString("well_no_xsl_1411.xml"));
        } catch (TransformerException | IOException e) {
            e.printStackTrace();
        }
        try {
            com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells convertedWell =
                    WitsmlMarshal.deserialize(forwardConvert, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells.class);
            assertNotNull(convertedWell);
            assertEquals("1.3.1.1", convertedWell.getVersion());
            assertEquals("6507/7-A-42", convertedWell.getWell().get(0).getName());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWellMarshalling1411(){
        try {
            String wellXml = TestUtilities.getResourceAsString("well_no_xsl_1411.xml");
            ObjWells wells = WitsmlMarshal.deserialize(wellXml, ObjWells.class);
            assertNotNull(wells);
            assertEquals(1, wells.getWell().size());
            assertEquals("6507/7-A-42", wells.getWell().get(0).getName());
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWellUnMarshalling1411(){
        try {
            String wellXmlIn = TestUtilities.getResourceAsString("well_no_xsl_1411.xml");
            ObjWells wellsIn = WitsmlMarshal.deserialize(wellXmlIn, ObjWells.class);
            String wellXmlOut = WitsmlMarshal.serialize(wellsIn);
            assertNotNull(wellXmlOut);
            TestUtilities.assertXMLEquals(wellXmlIn, wellXmlOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWellMarshalling1311(){
        try {
            String wellXml = TestUtilities.getResourceAsString("well_no_xsl_1311.xml");
            com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells wells =
                    WitsmlMarshal.deserialize(wellXml, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells.class);
            assertNotNull(wells);
            assertEquals(1, wells.getWell().size());
            assertEquals("6507/7-A-42", wells.getWell().get(0).getName());
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }
    }





}
