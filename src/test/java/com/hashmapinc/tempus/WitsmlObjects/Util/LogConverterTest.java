package com.hashmapinc.tempus.WitsmlObjects.Util;

import org.junit.Test;

public class LogConverterTest {
    //=========================================================================
    // conversions to 1.3.1.1
    //=========================================================================
    @Test
    public void shouldConvert1411to1311() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("log_converter/log1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog src = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog.class)).getLog().get(0);

        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog dest = LogConverter.convertTo1311(src);

        // check equality for non complex, non repeating fields

        // check complex fields

        // check repeating fields

    }

    @Test
    public void shouldConvert20to1311() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("log_converter/log20.xml");
        com.hashmapinc.tempus.WitsmlObjects.v20.Log src = WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v20.Log.class);

        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog dest = LogConverter.convertTo1311(src);

        // check equality for non complex, non repeating fields

        // check complex fields

        // check repeating fields

    }
    //=========================================================================


    //=========================================================================
    // conversions to 1.4.1.1
    //=========================================================================
    @Test
    public void shouldConvert1311to1411()  throws Exception {
        String srcXML = TestUtilities.getResourceAsString("log_converter/log1311.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog src = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);

        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog dest = LogConverter.convertTo1411(src);

        // check equality for non complex, non repeating fields

        // check complex fields

        // check repeating fields

    }

    @Test
    public void shouldConvert20to1411() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("log_converter/log20.xml");
        com.hashmapinc.tempus.WitsmlObjects.v20.Log src = WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v20.Log.class);

        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog dest = LogConverter.convertTo1411(src);

        // check equality for non complex, non repeating fields

        // check complex fields

        // check repeating fields

    }
    //=========================================================================


    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    @Test
    public void shouldConvert1311to20() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("log_converter/log1311.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog src = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);

        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v20.Log dest = LogConverter.convertTo20(src);

        // check equality for non complex, non repeating fields

        // check complex fields

        // check repeating fields

    }

    @Test
    public void shouldConvert1411to20() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("log_converter/log1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog src = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog.class)).getLog().get(0);

        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v20.Log dest = LogConverter.convertTo20(src);

        // check equality for non complex, non repeating fields

        // check complex fields

        // check repeating fields

    }
    //=========================================================================
}
