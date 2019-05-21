package com.hashmapinc.tempus.WitsmlObjects.Util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell;
import com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore;
import com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWells;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class WitsmlMarshalTest {
    @Test
    public void shouldSerialize1311WellToXML() throws Exception {
        String xml1311 = TestUtilities.getResourceAsString("well1311.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells obj1311 = WitsmlMarshal
            .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells.class);

        String serializedXML1311 = WitsmlMarshal.serialize(obj1311);

         assertNotNull(serializedXML1311); // an xml string should be produced
        assertFalse(serializedXML1311.contains("ns0:wells")); // weird namespacing shouldn't happen
    }

    @Test
    public void shouldSerialize1411WellToXML() throws Exception {
        String xml1411 = TestUtilities.getResourceAsString("well1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWells obj1411 = WitsmlMarshal
            .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWells.class);

        String serializedXML1411 = WitsmlMarshal.serialize(obj1411);

        assertNotNull(serializedXML1411); // an xml string should be produced
        assertFalse(serializedXML1411.contains("ns0:wells")); // weird namespacing shouldn't happen
    }

    @Test
    public void shouldDeserialize1411WellboreToPOJOWithoutIndexEqualZero() throws Exception {
        String xml1411 = TestUtilities.getResourceAsString("wellboreOpenQueryWithExtensionNameValue1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbores obj1411 = WitsmlMarshal
                .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbores.class);

        assertNotNull(obj1411);
        ObjWellbore wellbore = obj1411.getWellbore().get(0);
        assertNull(wellbore.getCommonData().getExtensionNameValue().get(0).getIndex());
    }

    @Test
    public void shouldDeserialize1411WellboreToPOJOWithoutIndexEqual1() throws Exception {
        String xml1411 = TestUtilities.getResourceAsString("wellboreOpenQueryWithExtensionNameValue1411Equal1.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbores obj1411 = WitsmlMarshal
                .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbores.class);

        assertNotNull(obj1411);
        ObjWellbore wellbore = obj1411.getWellbore().get(0);
        assertEquals((long)1,(long)wellbore.getCommonData().getExtensionNameValue().get(0).getIndex());
    }



    //=========================================================================
    // JSON serialization for WELL
    //=========================================================================
    @Test
    public void shouldSerialize1311WellToJSON() throws Exception {
        String xml1311 = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1311_withoutAttributes.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells obj1311 = WitsmlMarshal
            .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells.class);

        String json1311 = WitsmlMarshal.serializeToJSON(obj1311);
        String expectedJson = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1311_withAttributes.json");
        assertEquals(expectedJson.length(), json1311.length()); // simple length check before more advanced comparision

        // do a deep comparison of the json values
        ObjectMapper om = new ObjectMapper();
        Map<String, Object> map1311 = (Map<String, Object>) (om.readValue(json1311, Map.class));
        Map<String, Object> expectedMap = (Map<String, Object>) (om.readValue(expectedJson, Map.class));
        assertEquals(expectedMap, map1311);
    }

    @Test
    public void shouldSerialize1311FullWellToJSON() throws Exception {
        String xml1311 = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1311_withAttributesFull.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells obj1311 = WitsmlMarshal
                .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells.class);

        String json1311 = WitsmlMarshal.serializeToJSON(obj1311);
        String expectedJson = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1311_withAttributesFull.json");

        // do a deep comparison of the json values
        ObjectMapper om = new ObjectMapper();
        Map<String, Object> map1311 = (Map<String, Object>) (om.readValue(json1311, Map.class));
        Map<String, Object> expectedMap = (Map<String, Object>) (om.readValue(expectedJson, Map.class));
        assertEquals(expectedMap, map1311);
    }

    @Test
    public void shouldDeserializeCommonData() throws Exception {
        String json1411 = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1411_dTimLastChange.json");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell obj1411 = WitsmlMarshal.deserializeFromJSON(json1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell.class);

        String expectedDTimLastChange = "2019-01-16T15:07:03.581Z";
        String actualDTimLastChange = obj1411.getCommonData().getDTimLastChange().toString();

        assertEquals(actualDTimLastChange, expectedDTimLastChange);
    }

    @Test
    public void shouldSerialize1411WellToJSON() throws Exception {
        String xml1411 = TestUtilities.getResourceAsString("trajectory1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectorys obj1411 = WitsmlMarshal
            .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectorys.class);

        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory traj = obj1411.getTrajectory().get(0);
        String trajJson = traj.getJSONString("1.4.1.1");
        //String json1411 = WitsmlMarshal.serializeToJSON(obj1411);
        //String expectedJson = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1411_withAttributes.json");
        //assertEquals(expectedJson.length(), json1411.length()); // simple length check before more advanced comparision

        // do a deep comparison of the json values
        assertNotNull(trajJson);
    }

    @Test
    public void shouldSerialize1411FluidReportToJSON() throws Exception {
        String xml1411 = TestUtilities.getResourceAsString("fluid_converter/fluid_report_1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReports obj1411 = WitsmlMarshal
            .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReports.class);

        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport fluidReport = obj1411.getFluidsReport().get(0);
        String fluidReportJson = fluidReport.getJSONString("2.0");
        //String json1411 = WitsmlMarshal.serializeToJSON(obj1411);
        //String expectedJson = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1411_withAttributes.json");
        //assertEquals(expectedJson.length(), json1411.length()); // simple length check before more advanced comparision

        // do a deep comparison of the json values
        assertNotNull(fluidReportJson);
    }

    @Test
    public void shouldSerialize1411TrajectoryToJSON() throws Exception {
        String xml1411 = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1411_withoutAttributes.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWells obj1411 = WitsmlMarshal
                .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWells.class);

        String json1411 = WitsmlMarshal.serializeToJSON(obj1411);
        String expectedJson = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1411_withAttributes.json");
        assertEquals(expectedJson.length(), json1411.length()); // simple length check before more advanced comparision

        // do a deep comparison of the json values
        ObjectMapper om = new ObjectMapper();
        Map<String, Object> map1411 = (Map<String, Object>) (om.readValue(json1411, Map.class));
        Map<String, Object> expectedMap = (Map<String, Object>) (om.readValue(expectedJson, Map.class));
        assertEquals(map1411, expectedMap);
    }

    @Test
    public void shouldSerializeAndConvert1411EmptyWell() throws Exception {
        String xml1311 = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1311_FullEmpty.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells obj1311 = WitsmlMarshal
                .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells.class);

        String json1311 = WitsmlMarshal.serializeToJSON(obj1311);
        assertNotNull(json1311);
        ObjWell singularWell = obj1311.getWell().get(0);
        assertNotNull(singularWell);

        String json1411 = singularWell.getJSONString("1.4.1.1");
        ObjWells wells = new ObjWells();
        wells.addWell(WitsmlMarshal.deserializeFromJSON(json1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell.class));
        String full1411Wells = WitsmlMarshal.serializeToJSON(wells);
        assertNotNull(full1411Wells);

        String expectedJson = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1311_Convertedto1411FullEmpty.json");

        // do a deep comparison of the json values
        ObjectMapper om = new ObjectMapper();
        Map<String, Object> map1411 = (Map<String, Object>) (om.readValue(full1411Wells, Map.class));
        Map<String, Object> expectedMap = (Map<String, Object>) (om.readValue(expectedJson, Map.class));
        assertEquals(expectedMap, map1411);
    }
    //=========================================================================



    //=========================================================================
    // JSON serialization for WELLBORE
    //=========================================================================
    @Test
    public void shouldSerialize1311WellboreToJSON() throws Exception {
        String xml1311 = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/wellbore1311_withoutAttributes.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWellbores obj1311 = WitsmlMarshal
            .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWellbores.class);

        String json1311 = WitsmlMarshal.serializeToJSON(obj1311);
        String expectedJson = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/wellbore1311_withAttributes.json");
        assertEquals(expectedJson.length(), json1311.length()); // simple length check before more advanced comparision

        // do a deep comparison of the json values
        ObjectMapper om = new ObjectMapper();
        Map<String, Object> map1311 = (Map<String, Object>) (om.readValue(json1311, Map.class));
        Map<String, Object> expectedMap = (Map<String, Object>) (om.readValue(expectedJson, Map.class));
        assertEquals(expectedMap, map1311);
    }

    @Test
    public void shouldSerialize1411WellboreToJSON() throws Exception {
        String xml1411 = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/wellbore1411_withoutAttributes.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbores obj1411 = WitsmlMarshal
                .deserialize(xml1411, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbores.class);

        String json1411 = WitsmlMarshal.serializeToJSON(obj1411);
        String expectedJson = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/wellbore1411_withAttributes.json");
        assertEquals(expectedJson.length(), json1411.length()); // simple length check before more advanced comparision

        // do a deep comparison of the json values
        ObjectMapper om = new ObjectMapper();
        Map<String, Object> map1411 = (Map<String, Object>) (om.readValue(json1411, Map.class));
        Map<String, Object> expectedMap = (Map<String, Object>) (om.readValue(expectedJson, Map.class));
        assertEquals(map1411, expectedMap);
    }

    @Test
    public void shouldSerializeFull1311WellboreToJSON() throws Exception {
        String xml1311 = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/wellbore1311_withAttributesAndValues.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWellbores obj1311 = WitsmlMarshal
                .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWellbores.class);

        String json1311 = WitsmlMarshal.serializeToJSON(obj1311);
        String expectedJson = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/wellbore1311_withAttributesAndValues.json");
        assertEquals(expectedJson.length(), json1311.length()); // simple length check before more advanced comparision

        // do a deep comparison of the json values
        ObjectMapper om = new ObjectMapper();
        Map<String, Object> map1311 = (Map<String, Object>) (om.readValue(json1311, Map.class));
        Map<String, Object> expectedMap = (Map<String, Object>) (om.readValue(expectedJson, Map.class));
        assertEquals(expectedMap, map1311);

        String value = WitsmlMarshal.serialize(obj1311);
        TestUtilities.assertXMLEquals(xml1311, value);
    }

    @Test
    public void canSerializeNulldTimKickoffForWellbore() throws Exception {
        String json1411 = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/wellbore1311_problematic.json");
        ObjWellbore wb1411 = WitsmlMarshal.deserializeFromJSON(json1411, ObjWellbore.class);
        assertEquals(wb1411.getName(), "Mike");
    }
    //=========================================================================
}
