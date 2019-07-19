package com.hashmapinc.tempus.WitsmlObjects.Util;

import com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReports;
import com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport;
import org.junit.Test;
import static junit.framework.TestCase.assertNotNull;

import javax.xml.bind.JAXBException;

public class FluidReportTest {

    @Test
    public void shouldConvertTo20() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("fluid_converter/fluid_report_1411.xml");
        try {
            com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReports src =
                    WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReports.class);
            FluidsReport report = FluidsReportConverter.convertTo20(src.getFluidsReport().get(0));
            String jsonReport = WitsmlMarshal.serializeToJSON(report);
            assertNotNull(jsonReport);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
