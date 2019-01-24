package com.hashmapinc.tempus.WitsmlObjects.Util;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrajectoryConverterTest {
    //=========================================================================
    // conversions to 1.3.1.1
    //=========================================================================
    @Test
    public void shouldConvert1411To1311() throws Exception{
        String srcXML = TestUtilities.getResourceAsString("trajectory_converter/trajectory1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory src = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectorys)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory.class)).getTrajectory().get(0);

        // get converted object
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory dest = TrajectoryConverter.convertTo1311(src);

        // check fields
        assertEquals(src.getNameWell(), dest.getNameWell());
    }

    @Test
    public void shouldConvert20To1311() {
    }
    //=========================================================================


    //=========================================================================
    // conversions to 1.4.1.1
    //=========================================================================
    @Test
    public void shouldConvert1311To1411() throws Exception{
        String srcXML = TestUtilities.getResourceAsString("trajectory_converter/trajectory1311.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory src = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectorys)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory.class)).getTrajectory().get(0);

        // get converted object
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory dest = TrajectoryConverter.convertTo1411(src);

        // check fields
        assertEquals(src.getNameWell(), dest.getNameWell());
    }

    @Test
    public void shouldConvert20To1411() {
    }
    //=========================================================================


    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    @Test
    public void shouldConvert1311To20() {
    }

    @Test
    public void shouldConvert1411To20() {
    }
    //=========================================================================
}
