import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlMarshal;
import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlVersionTransformer;
import com.hashmapinc.tempus.WitsmlObjects.Util.log.AbstractDataTrace;
import com.hashmapinc.tempus.WitsmlObjects.Util.log.ColumnarDataPoint;
import com.hashmapinc.tempus.WitsmlObjects.Util.log.ColumnarDataTrace;
import com.hashmapinc.tempus.WitsmlObjects.Util.log.LogDataHelper;
import com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HelperTest {

    @Test
    public void testExportCSV1411(){
        try {
            String data = TestUtilities.getResourceAsString("log_with_data_1411.xml");
            ObjLogs logs = WitsmlMarshal.deserialize(data, ObjLogs.class);
            String csv = LogDataHelper.getCSV(logs.getLog().get(0), true);
            assertNotNull(csv);
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testExportCSV1311(){
        try {
            String data = TestUtilities.getResourceAsString("log_with_data_1311.xml");
            try {
                WitsmlVersionTransformer transformer = new WitsmlVersionTransformer();
                String convertedData = transformer.convertVersion(data);
                ObjLogs logs = WitsmlMarshal.deserialize(convertedData, ObjLogs.class);
                String csv = LogDataHelper.getCSV(logs.getLog().get(0), true);
                assertNotNull(csv);
            } catch (TransformerException e) {
                e.printStackTrace();
            }
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testProcess1411Log(){
        try {
            String data = TestUtilities.getResourceAsString("log_with_data_1411.xml");
            ObjLogs logs = WitsmlMarshal.deserialize(data, ObjLogs.class);
            List<AbstractDataTrace> traces = LogDataHelper.processData(logs);
            assertEquals((logs.getLog().get(0).getLogCurveInfo().size() - 1), traces.size());
            assertNotNull(traces);
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testProcess1411LogColumnar(){
        try {
            String data = TestUtilities.getResourceAsString("log_with_data_1411.xml");
            ObjLogs logs = WitsmlMarshal.deserialize(data, ObjLogs.class);
            List<ColumnarDataTrace> traces = LogDataHelper.getColumnarDataPoints(logs);
            assertEquals((logs.getLog().get(0).getLogCurveInfo().size() - 1), traces.size());
            assertNotNull(traces);
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }
    }
}
