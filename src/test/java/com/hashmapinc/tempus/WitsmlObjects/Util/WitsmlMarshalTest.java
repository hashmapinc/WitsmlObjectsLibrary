package com.hashmapinc.tempus.WitsmlObjects.Util;

import org.junit.Test;

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


    //=========================================================================
    // JSON serialization for WELLs
    //=========================================================================
    @Test
    public void shouldSerialize1311WellToJSON() throws Exception {
        String xml1311 = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1311_withoutAttributes.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells obj1311 = WitsmlMarshal
                .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells.class);

        String json1311 = WitsmlMarshal.serializeToJSON(obj1311);
        String expectedJson = TestUtilities.getResourceAsString("witsml_marshal_json_serialization/well1311_withAttributes.json");
        assertEquals(expectedJson, json1311);
    }

    @Test
    public void shouldSerialize1411WellToJSON() throws Exception {
        String xml1311 = TestUtilities
                .getResourceAsString("witsml_marshal_json_serialization/well1311_withoutAttributes.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells obj1311 = WitsmlMarshal
                .deserialize(xml1311, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells.class);

        String json1311 = WitsmlMarshal.serializeToJSON(obj1311);
        String expectedJson = "";
        assertEquals(expectedJson, json1311);
    }
    //=========================================================================
}
