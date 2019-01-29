package com.hashmapinc.tempus.WitsmlObjects.Util;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.ArrayList;
import java.util.List;

public class TrajectoryConverter {
    //=========================================================================
    // conversions to 1.3.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory src)  throws Exception {
        // get converted object
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory dest = new com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory();

        // check non-complex, non-repeating fields
        dest.setNameWell(src.getNameWell());
        dest.setNameWellbore(src.getNameWellbore());
        dest.setName(src.getName());
        dest.setObjectGrowing(src.isObjectGrowing());
        dest.setDTimTrajStart(src.getDTimTrajStart());
        dest.setServiceCompany(src.getServiceCompany());
        dest.setDefinitive(src.isDefinitive());
        dest.setMemory(src.isMemory());
        dest.setFinalTraj(src.isFinalTraj());
        dest.setDTimTrajEnd(src.getDTimTrajEnd());
        dest.setUidWell(src.getUidWell());
        dest.setUidWellbore(src.getUidWellbore());
        dest.setUid(src.getUid());

        // check complex fields
        // mdMn
        if (null != src.getMdMn())
            dest.setMdMn(src.getMdMn().to1311MeasuredDepthCoord());

        // mdMx
        if (null != src.getMdMx())
            dest.setMdMx(src.getMdMx().to1311MeasuredDepthCoord());

        // magDeclUsed
        if (null != src.getMagDeclUsed())
            dest.setMagDeclUsed(src.getMagDeclUsed().to1311PlaneAngleMeasure());

        // gridCorUsed
        if (null != src.getGridCorUsed())
            dest.setGridCorUsed(src.getGridCorUsed().to1311PlaneAngleMeasure());

        // aziVertSec
        if (null != src.getAziVertSect())
            dest.setAziVertSect(src.getAziVertSect().to1311PlaneAngleMeasure());

        // dispNsVertSectOrig
        if (null != src.getDispNsVertSectOrig())
            dest.setDispNsVertSectOrig(src.getDispNsVertSectOrig().to1311LengthMeasure());

        // dispEwVertSectOrig
        if (null != src.getDispEwVertSectOrig())
            dest.setDispEwVertSectOrig(src.getDispEwVertSectOrig().to1311LengthMeasure());

        // aziRef
        if (null != src.getAziRef())
            dest.setAziRef(com.hashmapinc.tempus.WitsmlObjects.v1311.AziRef.fromValue(src.getAziRef().value()));

        // commonData
        if (null != src.getCommonData())
            dest.setCommonData(src.getCommonData().to1311CommonData());

        // custom data
        if (null != src.getCustomData())
            dest.setCustomData(src.getCustomData().to1311CustomData());

        // check repeating fields
        if (null != src.getTrajectoryStation()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsTrajectoryStation> destStations = new ArrayList<>();
            for (int i = 0; i < src.getTrajectoryStation().size(); i++)
                destStations.add(src.getTrajectoryStation().get(i).to1311CsTrajectoryStation());

            dest.setTrajectoryStation(destStations);
        }

        return dest;
    }

    public static com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v20.Trajectory src) {
        return null;
    }
    //=========================================================================


    //=========================================================================
    // conversions to 1.4.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory convertTo1411(com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory src) {
        // get converted object
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory dest = new com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory();

        // check non-complex, non-repeating fields
        dest.setNameWell(src.getNameWell());
        dest.setNameWellbore(src.getNameWellbore());
        dest.setName(src.getName());
        dest.setObjectGrowing(src.isObjectGrowing());
        dest.setDTimTrajStart(src.getDTimTrajStart());
        dest.setServiceCompany(src.getServiceCompany());
        dest.setDefinitive(src.isDefinitive());
        dest.setMemory(src.isMemory());
        dest.setFinalTraj(src.isFinalTraj());
        dest.setDTimTrajEnd(src.getDTimTrajEnd());
        dest.setUidWell(src.getUidWell());
        dest.setUidWellbore(src.getUidWellbore());
        dest.setUid(src.getUid());

        // check complex fields
        // mdMn
        if (null != src.getMdMn())
            dest.setMdMn(src.getMdMn().to1411MeasuredDepthCoord());

        // mdMx
        if (null != src.getMdMx())
            dest.setMdMx(src.getMdMx().to1411MeasuredDepthCoord());

        // magDeclUsed
        if (null != src.getMagDeclUsed())
            dest.setMagDeclUsed(src.getMagDeclUsed().to1411PlaneAngleMeasure());

        // gridCorUsed
        if (null != src.getGridCorUsed())
            dest.setGridCorUsed(src.getGridCorUsed().to1411PlaneAngleMeasure());

        // aziVertSec
        if (null != src.getAziVertSect())
            dest.setAziVertSect(src.getAziVertSect().to1411PlaneAngleMeasure());

        // dispNsVertSectOrig
        if (null != src.getDispNsVertSectOrig())
            dest.setDispNsVertSectOrig(src.getDispNsVertSectOrig().to1411Length());

        // dispEwVertSectOrig
        if (null != src.getDispEwVertSectOrig())
            dest.setDispEwVertSectOrig(src.getDispEwVertSectOrig().to1411Length());

        // aziRef
        if (null != src.getAziRef())
            dest.setAziRef(com.hashmapinc.tempus.WitsmlObjects.v1411.AziRef.fromValue(src.getAziRef().value()));

        // commonData
        if (null != src.getCommonData())
            dest.setCommonData(src.getCommonData().to1411CommonData());

        // custom data
        if (null != src.getCustomData())
            dest.setCustomData(src.getCustomData().to1411CustomData());

        // check repeating fields
        if (null != src.getTrajectoryStation()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsTrajectoryStation> destStations = new ArrayList<>();
            for (int i = 0; i < src.getTrajectoryStation().size(); i++)
                destStations.add(src.getTrajectoryStation().get(i).to1411CsTrajectoryStation());

            dest.setTrajectoryStation(destStations);
        }

        return dest;
    }

    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory convertTo1411(com.hashmapinc.tempus.WitsmlObjects.v20.Trajectory src) throws DatatypeConfigurationException {
        // get converted object
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory dest = new com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory();

        // check non-complex, non-repeating fields
        dest.setServiceCompany(src.getServiceCompany());
        dest.setDefinitive(src.isDefinitive());
        dest.setMemory(src.isMemory());
        dest.setFinalTraj(src.isFinalTraj());

        // check complex fields
        // dTimTrajStart
        if (null != dest.getDTimTrajStart())
            dest.setDTimTrajStart(src.getDTimTrajStart());

        // dtimTrajEnd
        if (null != dest.getDTimTrajEnd())
            dest.setDTimTrajEnd(src.getDTimTrajEnd());

        // mdMn
        if (null != src.getMdMn())
            dest.setMdMn(src.getMdMn().to1411MeasuredDepthCoord());

        // mdMx
        if (null != src.getMdMx())
            dest.setMdMx(src.getMdMx().to1411MeasuredDepthCoord());

        // magDeclUsed
        if (null != src.getMagDeclUsed())
            dest.setMagDeclUsed(src.getMagDeclUsed().to1411PlaneAngleMeasure());

        // gridConUsed
        if (null != src.getGridConUsed())
            dest.setGridConUsed(src.getGridConUsed().to1411PlaneAngleMeasure());

        // aziVertSect
        if (null != src.getAziVertSect())
            dest.setAziVertSect(src.getAziVertSect().to1411PlaneAngleMeasure());

        // dispNsVertSectOrig
        if (null != src.getDispNsVertSectOrig())
            dest.setDispNsVertSectOrig(src.getDispNsVertSectOrig().to1411LengthMeasure());

        // dispEwVertSectOrig
        if (null != src.getDispEwVertSectOrig())
            dest.setDispEwVertSectOrig(src.getDispEwVertSectOrig().to1411LengthMeasure());

        // aziRef
        if (null != src.getAziRef())
            dest.setAziRef(com.hashmapinc.tempus.WitsmlObjects.v1411.AziRef.fromValue(src.getAziRef().value()));

        // customData
        if (null != src.getCustomData() && null != src.getCustomData().getAny())
            dest.setCustomData(src.getCustomData().to1411CustomData());

        // check repeating fields
        if (null != src.getTrajectoryStation()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsTrajectoryStation> destStations = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v20.TrajectoryStation srcStation : src.getTrajectoryStation())
                destStations.add(srcStation.to1411CsTrajectoryStation());

            dest.setTrajectoryStation(destStations);
        }

        return dest;
    }
    //=========================================================================


    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v20.Trajectory convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory src) {
        return convertTo20(convertTo1411(src));
    }

    public static com.hashmapinc.tempus.WitsmlObjects.v20.Trajectory convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory src) {
        // get converted object
        com.hashmapinc.tempus.WitsmlObjects.v20.Trajectory dest = new com.hashmapinc.tempus.WitsmlObjects.v20.Trajectory();

        // check non-complex, non-repeating fields
        dest.setServiceCompany(src.getServiceCompany());
        dest.setDefinitive(src.isDefinitive());
        dest.setMemory(src.isMemory());
        dest.setFinalTraj(src.isFinalTraj());

        // check complex fields
        // dTimTrajStart
        if (null != dest.getDTimTrajStart())
            dest.setDTimTrajStart(src.getDTimTrajStart().toString());

        // dtimTrajEnd
        if (null != dest.getDTimTrajEnd())
            dest.setDTimTrajEnd(src.getDTimTrajEnd().toString());

        // mdMn
        if (null != src.getMdMn())
            dest.setMdMn(src.getMdMn().to20DepthCoord());

        // mdMx
        if (null != src.getMdMx())
            dest.setMdMx(src.getMdMx().to20DepthCoord());

        // magDeclUsed
        if (null != src.getMagDeclUsed())
            dest.setMagDeclUsed(src.getMagDeclUsed().to20PlaneAngleMeasure());

        // gridConUsed
        if (null != src.getGridConUsed())
            dest.setGridConUsed(src.getGridConUsed().to20PlaneAngleMeasure());

        // aziVertSect
        if (null != src.getAziVertSect())
            dest.setAziVertSect(src.getAziVertSect().to20PlaneAngleMeasure());

        // dispNsVertSectOrig
        if (null != src.getDispNsVertSectOrig())
            dest.setDispNsVertSectOrig(src.getDispNsVertSectOrig().to20LengthMeasure());

        // dispEwVertSectOrig
        if (null != src.getDispEwVertSectOrig())
            dest.setDispEwVertSectOrig(src.getDispEwVertSectOrig().to20LengthMeasure());

        // aziRef
        if (null != src.getAziRef())
            dest.setAziRef(com.hashmapinc.tempus.WitsmlObjects.v20.AziRef.fromValue(src.getAziRef().value()));

        // customData
        if (null != src.getCustomData() && null != src.getCustomData().getAny())
            dest.setCustomData(src.getCustomData().to20CustomData());

        // check repeating fields
        if (null != src.getTrajectoryStation()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v20.TrajectoryStation> destStations = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v1411.CsTrajectoryStation srcStation : src.getTrajectoryStation())
                destStations.add(srcStation.to20TrajectoryStation());

            dest.setTrajectoryStation(destStations);
        }

        return dest;
    }
    //=========================================================================
}
