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

        // check non-complex, non-repeating fields
        assertEquals(src.getNameWell(), dest.getNameWell());
        assertEquals(src.getNameWellbore(), dest.getNameWellbore());
        assertEquals(src.getName(), dest.getName());
        assertEquals(src.isObjectGrowing(), dest.isObjectGrowing());
        assertEquals(src.getDTimTrajStart(), dest.getDTimTrajStart());
        assertEquals(src.getServiceCompany(), dest.getServiceCompany());
        assertEquals(src.isDefinitive(), dest.isDefinitive());
        assertEquals(src.isMemory(), dest.isMemory());
        assertEquals(src.isFinalTraj(), dest.isFinalTraj());
        assertEquals(src.getDTimTrajEnd(), dest.getDTimTrajEnd());
        assertEquals(src.getUidWell(), dest.getUidWell());
        assertEquals(src.getUidWellbore(), dest.getUidWellbore());
        assertEquals(src.getUid(), dest.getUid());

        // check complex fields
        protected MeasuredDepthCoord mdMn;
        protected MeasuredDepthCoord mdMx;
        protected PlaneAngleMeasure magDeclUsed;
        protected PlaneAngleMeasure gridCorUsed;
        protected PlaneAngleMeasure aziVertSect;
        protected LengthMeasure dispNsVertSectOrig;
        protected LengthMeasure dispEwVertSectOrig;
        protected AziRef aziRef;
        protected CsCommonData commonData;
        protected CsCustomData customData;

        // check repeating fields
        protected List<CsTrajectoryStation> trajectoryStation;

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
