import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlMarshal;
import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlVersionTransformer;
import com.hashmapinc.tempus.WitsmlObjects.AbstractWitsmlObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AbstractWitsmlObjectTest {

    @Test
    public void testGetVersion() {
        try {
            
            String xml1311 = TestUtilities.getResourceAsString("log_with_data_1311.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs) WitsmlMarshal.deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);
            assertEquals("1.3.1.1", obj1311.getVersion());
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testGetJSONString() {
        try {
            String xml1311 = TestUtilities.getResourceAsString("log_with_data_1311.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs) WitsmlMarshal.deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);

            String json1311 = obj1311.getJSONString("1.3.1.1");
            String json1411 = obj1311.getJSONString("1.4.1.1");

            assertNotNull(json1311);
            assertNotNull(json1411);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testGetObjectType() {
        try {
            String xml1311 = TestUtilities.getResourceAsString("log_with_data_1311.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs) WitsmlMarshal
                    .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);

            String objectType = obj1311.getObjectType();

            assertEquals("log", objectType);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testGetUid() {
        try {
            String xml1311 = TestUtilities.getResourceAsString("log_with_data_1311.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs) WitsmlMarshal
                    .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);

            String uid = obj1311.getUid();

            assertEquals("f34a", uid);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
