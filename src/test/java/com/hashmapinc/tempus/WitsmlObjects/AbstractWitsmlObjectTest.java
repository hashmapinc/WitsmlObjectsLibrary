package com.hashmapinc.tempus.WitsmlObjects;

import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlMarshal;
import com.hashmapinc.tempus.WitsmlObjects.Util.TestUtilities;
import com.hashmapinc.tempus.WitsmlObjects.AbstractWitsmlObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class AbstractWitsmlObjectTest {

    //=========================================================================
    // Trajectory testing
    //=========================================================================
    @Test
    public void testTrajectoryGetVersion() {
    }

    @Test
    public void testTrajectoryGetJSONString() {
    }

    @Test
    public void testTrajectoryGetObjectType() {
    }

    @Test
    public void testTrajectoryGetUid() {
    }
    // =========================================================================

    //=========================================================================
    // Wellbore testing
    //=========================================================================
    @Test
    public void testWellboreGetVersion() {
    }

    @Test
    public void testWellboreGetJSONString() {
    }

    @Test
    public void testWellboreGetObjectType() {
    }

    @Test
    public void testWellboreGetUid() {
    }
    // =========================================================================

    //=========================================================================
    // Well testing
    //=========================================================================
    @Test
    public void testWellGetVersion() {
    }

    @Test
    public void testWellGetJSONString() {
    }

    @Test
    public void testWellGetObjectType() {
    }

    @Test
    public void testWellGetUid() {
    }
    // =========================================================================

    //=========================================================================
    // Log testing
    //=========================================================================
    @Test
    public void testLogGetVersion() {
        try {
            String xml1311 = TestUtilities.getResourceAsString("log_with_data_1311.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs) WitsmlMarshal.deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);
            assertEquals("1.3.1.1", obj1311.getVersion());
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        try {
            String xml1411 = TestUtilities.getResourceAsString("log_with_data_1411.xml");
            AbstractWitsmlObject obj1411 = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs) WitsmlMarshal
                    .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog.class)).getLog().get(0);
            assertEquals("1.4.1.1", obj1411.getVersion());
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testLogGetJSONString() {
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
    public void testLogGetObjectType() {
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
    public void testLogGetUid() {
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
    // =========================================================================
}
