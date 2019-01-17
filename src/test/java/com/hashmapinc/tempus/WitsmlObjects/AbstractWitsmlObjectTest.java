package com.hashmapinc.tempus.WitsmlObjects;

import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlMarshal;
import com.hashmapinc.tempus.WitsmlObjects.Util.TestUtilities;
import org.junit.Test;

import static org.junit.Assert.*;

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
        // test 1311
        try {
            String xml1311 = TestUtilities.getResourceAsString("trajectory1311.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectorys) WitsmlMarshal
                    .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory.class)).getTrajectory().get(0);

            String uid = obj1311.getUid();

            assertEquals("pe84e", uid);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        // test 1411
        try {
            String xml1411 = TestUtilities.getResourceAsString("trajectory1411.xml");
            AbstractWitsmlObject obj1411 = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectorys) WitsmlMarshal
                    .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory.class)).getTrajectory().get(0);

            String uid = obj1411.getUid();

            assertEquals("pe84e", uid);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
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
        // test 1311
        try {
            String xml1311 = TestUtilities.getResourceAsString("wellbore1311.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWellbores) WitsmlMarshal
                    .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWellbore.class)).getWellbore().get(0);

            String uid = obj1311.getUid();

            assertEquals("B-001", uid);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        // test 1411
        try {
            String xml1411 = TestUtilities.getResourceAsString("wellbore1411.xml");
            AbstractWitsmlObject obj1411 = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbores) WitsmlMarshal
                    .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore.class)).getWellbore().get(0);

            String uid = obj1411.getUid();

            assertEquals("B-01", uid);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
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
        // test 1311
        try {
            String xml1311 = TestUtilities.getResourceAsString("well1311.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells) WitsmlMarshal
                    .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell.class)).getWell().get(0);

            String uid = obj1311.getUid();

            assertEquals("w-12", uid);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        // test 1411
        try {
            String xml1411 = TestUtilities.getResourceAsString("well1411.xml");
            AbstractWitsmlObject obj1411 = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWells) WitsmlMarshal
                    .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell.class)).getWell().get(0);

            String uid = obj1411.getUid();

            assertEquals("w-12", uid);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testWellGetXML() throws Exception {
        //=====================================================================
        // test 1311
        //=====================================================================
        String xml1311 = TestUtilities.getResourceAsString("well1311.xml");
        AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells) WitsmlMarshal
            .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell.class)).getWell().get(0);

        // check same-version serialization
        String serializedXML1311 = obj1311.getXMLString("1.3.1.1");
        assertNotNull(serializedXML1311);
        //assertFalse(serializedXML1311.contains("ns0:wells")); TODO: fix namespacey junk

        // check cross-version serialization
        String translatedXML1411 = obj1311.getXMLString("1.4.1.1");
        assertNotNull(translatedXML1411);
        //assertFalse(translatedXML1411.contains("ns0:wells")); TODO: fix namespacey junk
        //=====================================================================

        //=====================================================================
        // test 1411
        //=====================================================================
        String xml1411 = TestUtilities.getResourceAsString("well1411.xml");
        AbstractWitsmlObject obj1411 = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWells) WitsmlMarshal
            .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell.class)).getWell().get(0);

        // check same-version serialization
        String serializedXML1411 = obj1411.getXMLString("1.4.1.1");
        assertNotNull(serializedXML1411);
        //assertFalse(serializedXML1411.contains("ns0:wells")); TODO: fix namespacey junk

        // check cross-version serialization
        String translatedXML1311 = obj1411.getXMLString("1.3.1.1");
        assertNotNull(translatedXML1311);
        //assertFalse(translatedXML1311.contains("ns0:wells")); TODO: fix namespacey junk
        //=====================================================================
    }
    // =========================================================================

    //=========================================================================
    // Log testing
    //=========================================================================
    @Test
    public void testLogGetVersion() {
        // test 1311
        try {
            String xml1311 = TestUtilities.getResourceAsString("log1311.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs) WitsmlMarshal.deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);
            assertEquals("1.3.1.1", obj1311.getVersion());
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        // test 1411
        try {
            String xml1411 = TestUtilities.getResourceAsString("log1411.xml");
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
        // test 1311
        try {
            String xml1311 = TestUtilities.getResourceAsString("log1311.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs) WitsmlMarshal.deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);

            String json1311 = obj1311.getJSONString("1.3.1.1");
            String json1411 = obj1311.getJSONString("1.4.1.1");

            assertNotNull(json1311);
            assertNotNull(json1411);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        // test 1411
        try {
            String xml1311 = TestUtilities.getResourceAsString("log1411.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs) WitsmlMarshal
                    .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog.class)).getLog().get(0);

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
        // test 1311
        try {
            String xml1311 = TestUtilities.getResourceAsString("log1311.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs) WitsmlMarshal
                    .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);

            String objectType = obj1311.getObjectType();

            assertEquals("log", objectType);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        // test 1411
        try {
            String xml1411 = TestUtilities.getResourceAsString("log1411.xml");
            AbstractWitsmlObject obj1411 = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs) WitsmlMarshal
                    .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog.class)).getLog().get(0);

            String objectType = obj1411.getObjectType();

            assertEquals("log", objectType);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testLogGetUid() {
        // test 1311
        try {
            String xml1311 = TestUtilities.getResourceAsString("log1311.xml");
            AbstractWitsmlObject obj1311 = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs) WitsmlMarshal
                    .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);

            String uid = obj1311.getUid();

            assertEquals("f34a", uid);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        // test 1411
        try {
            String xml1411 = TestUtilities.getResourceAsString("log1411.xml");
            AbstractWitsmlObject obj1411 = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs) WitsmlMarshal
                    .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog.class)).getLog().get(0);

            String uid = obj1411.getUid();

            assertEquals("f34a", uid);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
    // =========================================================================
}
