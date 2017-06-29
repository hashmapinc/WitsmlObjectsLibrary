import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlMarshal;
import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlVersionTransformer;
import com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWells;
import org.junit.Assert;
import org.junit.Test;
import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.XMLUnit;
import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TransformTest {

    @Test
    public void testForwardTransformWells(){
        String forwardConvert = "";
        try {
            WitsmlVersionTransformer transformer = new WitsmlVersionTransformer();
            forwardConvert = transformer.convertVersion(getResourceAsString("well_no_xsl_1311.xml"));
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
            forwardConvert = transformer.convertVersion(getResourceAsString("well_no_xsl_1411.xml"));
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
            String wellXml = getResourceAsString("well_no_xsl_1411.xml");
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
            String wellXmlIn = getResourceAsString("well_no_xsl_1411.xml");
            ObjWells wellsIn = WitsmlMarshal.deserialize(wellXmlIn, ObjWells.class);
            String wellXmlOut = WitsmlMarshal.serialize(wellsIn);
            assertNotNull(wellXmlOut);
            assertXMLEquals(wellXmlIn, wellXmlOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWellMarshalling1311(){
        try {
            String wellXml = getResourceAsString("well_no_xsl_1311.xml");
            com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells wells =
                    WitsmlMarshal.deserialize(wellXml, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells.class);
            assertNotNull(wells);
            assertEquals(1, wells.getWell().size());
            assertEquals("6507/7-A-42", wells.getWell().get(0).getName());
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }
    }


    private static void assertXMLEquals(String expectedXML, String actualXML) throws Exception {
        XMLUnit.setIgnoreWhitespace(true);
        XMLUnit.setIgnoreDiffBetweenTextAndCDATA(true);
        XMLUnit.setIgnoreAttributeOrder(true);

        DetailedDiff diff = new DetailedDiff(XMLUnit.compareXML(expectedXML, actualXML));

        List<?> allDifferences = diff.getAllDifferences();
        Assert.assertEquals("Differences found: "+ diff.toString(), 0, allDifferences.size());
    }

    private String getResourceAsString(String resourcePath) throws IOException {
        InputStream stream = getClass().getResourceAsStream(resourcePath);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(stream));
        return reader.lines().collect(Collectors.joining(
                System.getProperty("line.separator")));
    }


}
