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
        if (null != src.getMdMn()) {
            assertEquals(src.getMdMn().getValue(), dest.getMdMn().getValue());
            assertEquals(src.getMdMn().getDatum(), dest.getMdMn().getDatum());
            assertEquals(src.getMdMn().getUom().value(), dest.getMdMn().getUom().value());
        }
        if (null != src.getMdMx()) {
            assertEquals(src.getMdMx().getValue(), dest.getMdMx().getValue());
            assertEquals(src.getMdMx().getDatum(), dest.getMdMx().getDatum());
            assertEquals(src.getMdMx().getUom().value(), dest.getMdMx().getUom().value());
        }
        if (null != src.getMagDeclUsed()) {
            assertEquals(src.getMagDeclUsed().getValue(), dest.getMagDeclUsed().getValue());
            assertEquals(src.getMagDeclUsed().getUom(), dest.getMagDeclUsed().getUom());
        }
        if (null != src.getGridCorUsed()) {
            assertEquals(src.getGridCorUsed().getValue(), dest.getGridCorUsed().getValue());
            assertEquals(src.getGridCorUsed().getUom(), dest.getGridCorUsed().getUom());
        }
        if (null != src.getAziVertSect()) {
            assertEquals(src.getAziVertSect().getValue(), dest.getAziVertSect().getValue());
            assertEquals(src.getAziVertSect().getUom(), dest.getAziVertSect().getUom());
        }
        if (null != src.getDispNsVertSectOrig()) {
            assertEquals(src.getDispNsVertSectOrig().getValue(), dest.getDispNsVertSectOrig().getValue());
            assertEquals(src.getDispNsVertSectOrig().getUom(), dest.getDispNsVertSectOrig().getUom());
        }
        if (null != src.getDispEwVertSectOrig()) {
            assertEquals(src.getDispEwVertSectOrig().getValue(), dest.getDispEwVertSectOrig().getValue());
            assertEquals(src.getDispEwVertSectOrig().getUom(), dest.getDispEwVertSectOrig().getUom());
        }
        if (null != src.getAziRef())
            assertEquals(src.getAziRef().value(), dest.getAziRef().value());

        if (null != src.getCommonData()) {
            assertEquals(src.getCommonData().getSourceName(), dest.getCommonData().getSourceName());
            assertEquals(src.getCommonData().getDTimCreation(), dest.getCommonData().getDTimCreation());
            assertEquals(src.getCommonData().getDTimLastChange(), dest.getCommonData().getDTimLastChange());
            assertEquals(src.getCommonData().getItemState().value(), dest.getCommonData().getItemState().value());
            assertEquals(src.getCommonData().getComments(), dest.getCommonData().getComments());
        }
        if (null != src.getCustomData() && null != src.getCustomData().getAny()){
            for (int i = 0; i < src.getCustomData().getAny().size(); i++)
                assertEquals(src.getCustomData().getAny().get(i), dest.getCustomData().getAny().get(i));
        }

        // check repeating fields
        if (null != src.getTrajectoryStation()) {
            for (int i = 0; i < src.getTrajectoryStation().size(); i++) {
                com.hashmapinc.tempus.WitsmlObjects.v1311.CsTrajectoryStation srcStation = src.getTrajectoryStation().get(i);
                com.hashmapinc.tempus.WitsmlObjects.v1411.CsTrajectoryStation destStation = dest.getTrajectoryStation().get(i);

                // check non-complex, non-repeating fields

                // check complex fields

                // check repeating fields

            }
        }

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
