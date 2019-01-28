package com.hashmapinc.tempus.WitsmlObjects.Util;

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
            dest.setDispNsVertSectOrig(src.getDispNsVertSectOrig().to1311Length());

        // dispEwVertSectOrig
        if (null != src.getDispEwVertSectOrig())
            dest.setDispEwVertSectOrig(src.getDispEwVertSectOrig().to1311Length());

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
    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory convertTo1411(com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory src) throws Exception{
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

    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjTrajectory convertTo1411(com.hashmapinc.tempus.WitsmlObjects.v20.Trajectory src) {
        return null;
    }
    //=========================================================================


    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v20.Trajectory convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1311.ObjTrajectory src) {
        return null;
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
        if (null != dest.getDTimTrajStart())
            assertEquals(src.getDTimTrajStart().toString(), dest.getDTimTrajStart());
        if (null != dest.getDTimTrajEnd())
            assertEquals(src.getDTimTrajEnd().toString(), dest.getDTimTrajEnd());
        if (null != src.getMdMn()) {
            assertEquals(src.getMdMn().getValue(), dest.getMdMn().getValue());
            assertEquals(src.getMdMn().getDatum(), dest.getMdMn().getDatum());
            assertEquals(src.getMdMn().getUom().value(), dest.getMdMn().getUom());
        }
        if (null != src.getMdMx()) {
            assertEquals(src.getMdMx().getValue(), dest.getMdMx().getValue());
            assertEquals(src.getMdMx().getDatum(), dest.getMdMx().getDatum());
            assertEquals(src.getMdMx().getUom().value(), dest.getMdMx().getUom());
        }
        if (null != src.getMagDeclUsed()) {
            assertEquals(src.getMagDeclUsed().getValue(), dest.getMagDeclUsed().getValue());
            assertEquals(src.getMagDeclUsed().getUom(), dest.getMagDeclUsed().getUom());
        }
        if (null != src.getGridConUsed()) {
            assertEquals(src.getGridConUsed().getValue(), dest.getGridConUsed().getValue());
            assertEquals(src.getGridConUsed().getUom(), dest.getGridConUsed().getUom());
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
        if (null != src.getCustomData() && null != src.getCustomData().getAny()){
            for (int i = 0; i < src.getCustomData().getAny().size(); i++)
                assertEquals(src.getCustomData().getAny().get(i), dest.getCustomData().getAny().get(i));
        }

        // check repeating fields
        if (null != src.getTrajectoryStation()) {
            for (int i = 0; i < src.getTrajectoryStation().size(); i++) {
                com.hashmapinc.tempus.WitsmlObjects.v1411.CsTrajectoryStation srcStation = src.getTrajectoryStation().get(i);
                com.hashmapinc.tempus.WitsmlObjects.v20.TrajectoryStation destStation = dest.getTrajectoryStation().get(i);

                // check non-complex, non-repeating fields
                assertEquals(srcStation.isGravAccelCorUsed(), destStation.isGravAccelCorUsed());
                assertEquals(srcStation.isMagXAxialCorUsed(), destStation.isMagXAxialCorUsed());
                assertEquals(srcStation.isSagCorUsed(), destStation.isSagCorUsed());
                assertEquals(srcStation.isMagDrlstrCorUsed(), destStation.isMagDrlstrCorUsed());
                assertEquals(srcStation.getMagModelUsed(), destStation.getMagModelUsed());
                assertEquals(srcStation.getMagModelValid(), destStation.getMagModelValid());
                assertEquals(srcStation.getGeoModelUsed(), destStation.getGeoModelUsed());
                assertEquals(srcStation.getUid(), destStation.getUid());

                // check complex fields
                if (null != srcStation.getDTimStn())
                    assertEquals(srcStation.getDTimStn().toString(), destStation.getDTimStn());
                if (null != srcStation.getTarget())
                    assertEquals(srcStation.getTarget().getValue(), destStation.getTarget());
                if (null != srcStation.getTypeTrajStation())
                    assertEquals(srcStation.getTypeTrajStation().value(), destStation.getTypeTrajStation().value());
                if (null != srcStation.getTypeSurveyTool())
                    assertEquals(srcStation.getTypeSurveyTool(), destStation.getTypeSurveyTool().value());
                if (null != srcStation.getMd()) {
                    assertEquals(srcStation.getMd().getValue(), destStation.getMd().getValue());
                    assertEquals(srcStation.getMd().getUom().value(), destStation.getMd().getUom());
                    assertEquals(srcStation.getMd().getDatum(), destStation.getMd().getDatum());
                }
                if (null != srcStation.getTvd()) {
                    assertEquals(srcStation.getTvd().getValue(), destStation.getTvd().getValue());
                    assertEquals(srcStation.getTvd().getUom().value(), destStation.getTvd().getUom());
                    assertEquals(srcStation.getTvd().getDatum(), destStation.getTvd().getDatum());
                }
                if (null != srcStation.getIncl()) {
                    assertEquals(srcStation.getIncl().getValue(), destStation.getIncl().getValue());
                    assertEquals(srcStation.getIncl().getUom(), destStation.getIncl().getUom());
                }
                if (null != srcStation.getAzi()) {
                    assertEquals(srcStation.getAzi().getValue(), destStation.getAzi().getValue());
                    assertEquals(srcStation.getAzi().getUom(), destStation.getAzi().getUom());
                }
                if (null != srcStation.getMtf()) {
                    assertEquals(srcStation.getMtf().getValue(), destStation.getMtf().getValue());
                    assertEquals(srcStation.getMtf().getUom(), destStation.getMtf().getUom());
                }
                if (null != srcStation.getGtf()) {
                    assertEquals(srcStation.getGtf().getValue(), destStation.getGtf().getValue());
                    assertEquals(srcStation.getGtf().getUom(), destStation.getGtf().getUom());
                }
                if (null != srcStation.getDispNs()) {
                    assertEquals(srcStation.getDispNs().getValue(), destStation.getDispNs().getValue());
                    assertEquals(srcStation.getDispNs().getUom(), destStation.getDispNs().getUom());
                }
                if (null != srcStation.getDispEw()) {
                    assertEquals(srcStation.getDispEw().getValue(), destStation.getDispEw().getValue());
                    assertEquals(srcStation.getDispEw().getUom(), destStation.getDispEw().getUom());
                }
                if (null != srcStation.getVertSect()) {
                    assertEquals(srcStation.getVertSect().getValue(), destStation.getVertSect().getValue());
                    assertEquals(srcStation.getVertSect().getUom(), destStation.getVertSect().getUom());
                }
                if (null != srcStation.getDls()) {
                    assertEquals(srcStation.getDls().getValue(), destStation.getDls().getValue());
                    assertEquals(srcStation.getDls().getUom().value(), destStation.getDls().getUom());
                }
                if (null != srcStation.getRateTurn()) {
                    assertEquals(srcStation.getRateTurn().getValue(), destStation.getRateTurn().getValue());
                    assertEquals(srcStation.getRateTurn().getUom().value(), destStation.getRateTurn().getUom());
                }
                if (null != srcStation.getRateBuild()) {
                    assertEquals(srcStation.getRateBuild().getValue(), destStation.getRateBuild().getValue());
                    assertEquals(srcStation.getRateBuild().getUom().value(), destStation.getRateBuild().getUom());
                }
                if (null != srcStation.getMdDelta()) {
                    assertEquals(srcStation.getMdDelta().getValue(), destStation.getMdDelta().getValue());
                    assertEquals(srcStation.getMdDelta().getUom(), destStation.getMdDelta().getUom());
                }
                if (null != srcStation.getTvdDelta()) {
                    assertEquals(srcStation.getTvdDelta().getValue(), destStation.getTvdDelta().getValue());
                    assertEquals(srcStation.getTvdDelta().getUom(), destStation.getTvdDelta().getUom());
                }
                if (null != srcStation.getGravTotalUncert()) {
                    assertEquals(srcStation.getGravTotalUncert().getValue(), destStation.getGravTotalUncert().getValue());
                    assertEquals(srcStation.getGravTotalUncert().getUom().value(), destStation.getGravTotalUncert().getUom().value());
                }
                if (null != srcStation.getDipAngleUncert()) {
                    assertEquals(srcStation.getDipAngleUncert().getValue(), destStation.getDipAngleUncert().getValue());
                    assertEquals(srcStation.getDipAngleUncert().getUom(), destStation.getDipAngleUncert().getUom());
                }
                if (null != srcStation.getMagTotalUncert()) {
                    assertEquals(srcStation.getMagTotalUncert().getValue(), destStation.getMagTotalUncert().getValue());
                    assertEquals(srcStation.getMagTotalUncert().getUom().value(), destStation.getMagTotalUncert().getUom());
                }
                if (null != srcStation.getGravTotalFieldReference()) {
                    assertEquals(srcStation.getGravTotalFieldReference().getValue(), destStation.getGravTotalFieldReference().getValue());
                    assertEquals(srcStation.getGravTotalFieldReference().getUom().value(), destStation.getGravTotalFieldReference().getUom().value());
                }
                if (null != srcStation.getMagTotalFieldReference()) {
                    assertEquals(srcStation.getMagTotalFieldReference().getValue(), destStation.getMagTotalFieldReference().getValue());
                    assertEquals(srcStation.getMagTotalFieldReference().getUom().value(), destStation.getMagTotalFieldReference().getUom());
                }
                if (null != srcStation.getMagDipAngleReference()) {
                    assertEquals(srcStation.getMagDipAngleReference().getValue(), destStation.getMagDipAngleReference().getValue());
                    assertEquals(srcStation.getMagDipAngleReference().getUom(), destStation.getMagDipAngleReference().getUom());
                }
                if (null != srcStation.getStatusTrajStation())
                    assertEquals(srcStation.getStatusTrajStation().value(), destStation.getStatusTrajStation().value());
                if (null != srcStation.getRawData()) {
                    if (null != srcStation.getRawData().getGravAxialRaw()) {
                        assertEquals(srcStation.getRawData().getGravAxialRaw().getValue(), destStation.getRawData().getGravAxialRaw().getValue());
                        assertEquals(srcStation.getRawData().getGravAxialRaw().getUom().value(), destStation.getRawData().getGravAxialRaw().getUom().value());
                    }
                    if (null != srcStation.getRawData().getGravTran1Raw()) {
                        assertEquals(srcStation.getRawData().getGravTran1Raw().getValue(), destStation.getRawData().getGravTran1Raw().getValue());
                        assertEquals(srcStation.getRawData().getGravTran1Raw().getUom().value(), destStation.getRawData().getGravTran1Raw().getUom().value());
                    }
                    if (null != srcStation.getRawData().getGravTran2Raw()) {
                        assertEquals(srcStation.getRawData().getGravTran2Raw().getValue(), destStation.getRawData().getGravTran2Raw().getValue());
                        assertEquals(srcStation.getRawData().getGravTran2Raw().getUom().value(), destStation.getRawData().getGravTran2Raw().getUom().value());
                    }
                    if (null != srcStation.getRawData().getMagAxialRaw()) {
                        assertEquals(srcStation.getRawData().getMagAxialRaw().getValue(), destStation.getRawData().getMagAxialRaw().getValue());
                        assertEquals(srcStation.getRawData().getMagAxialRaw().getUom().value(), destStation.getRawData().getMagAxialRaw().getUom());
                    }
                    if (null != srcStation.getRawData().getMagTran1Raw()) {
                        assertEquals(srcStation.getRawData().getMagTran1Raw().getValue(), destStation.getRawData().getMagTran1Raw().getValue());
                        assertEquals(srcStation.getRawData().getMagTran1Raw().getUom().value(), destStation.getRawData().getMagTran1Raw().getUom());
                    }
                    if (null != srcStation.getRawData().getMagTran2Raw()) {
                        assertEquals(srcStation.getRawData().getMagTran2Raw().getValue(), destStation.getRawData().getMagTran2Raw().getValue());
                        assertEquals(srcStation.getRawData().getMagTran2Raw().getUom().value(), destStation.getRawData().getMagTran2Raw().getUom());
                    }

                }
                if (null != srcStation.getCorUsed()) {
                    if (null != srcStation.getCorUsed().getGravAxialAccelCor()) {
                        assertEquals(srcStation.getCorUsed().getGravAxialAccelCor().getValue(), destStation.getCorUsed().getGravAxialAccelCor().getValue());
                        assertEquals(srcStation.getCorUsed().getGravAxialAccelCor().getUom().value(), destStation.getCorUsed().getGravAxialAccelCor().getUom().value());
                    }
                    if (null != srcStation.getCorUsed().getGravTran1AccelCor()) {
                        assertEquals(srcStation.getCorUsed().getGravTran1AccelCor().getValue(), destStation.getCorUsed().getGravTran1AccelCor().getValue());
                        assertEquals(srcStation.getCorUsed().getGravTran1AccelCor().getUom().value(), destStation.getCorUsed().getGravTran1AccelCor().getUom().value());
                    }
                    if (null != srcStation.getCorUsed().getGravTran2AccelCor()) {
                        assertEquals(srcStation.getCorUsed().getGravTran2AccelCor().getValue(), destStation.getCorUsed().getGravTran2AccelCor().getValue());
                        assertEquals(srcStation.getCorUsed().getGravTran2AccelCor().getUom().value(), destStation.getCorUsed().getGravTran2AccelCor().getUom().value());
                    }
                    if (null != srcStation.getCorUsed().getMagAxialDrlstrCor()) {
                        assertEquals(srcStation.getCorUsed().getMagAxialDrlstrCor().getValue(), destStation.getCorUsed().getMagAxialDrlstrCor().getValue());
                        assertEquals(srcStation.getCorUsed().getMagAxialDrlstrCor().getUom().value(), destStation.getCorUsed().getMagAxialDrlstrCor().getUom());
                    }
                    if (null != srcStation.getCorUsed().getMagTran1DrlstrCor()) {
                        assertEquals(srcStation.getCorUsed().getMagTran1DrlstrCor().getValue(), destStation.getCorUsed().getMagTran1DrlstrCor().getValue());
                        assertEquals(srcStation.getCorUsed().getMagTran1DrlstrCor().getUom().value(), destStation.getCorUsed().getMagTran1DrlstrCor().getUom());
                    }
                    if (null != srcStation.getCorUsed().getMagTran2DrlstrCor()) {
                        assertEquals(srcStation.getCorUsed().getMagTran2DrlstrCor().getValue(), destStation.getCorUsed().getMagTran2DrlstrCor().getValue());
                        assertEquals(srcStation.getCorUsed().getMagTran2DrlstrCor().getUom().value(), destStation.getCorUsed().getMagTran2DrlstrCor().getUom());
                    }
                    if (null != srcStation.getCorUsed().getSagIncCor()) {
                        assertEquals(srcStation.getCorUsed().getSagIncCor().getValue(), destStation.getCorUsed().getSagIncCor().getValue());
                        assertEquals(srcStation.getCorUsed().getSagIncCor().getUom(), destStation.getCorUsed().getSagIncCor().getUom());
                    }
                    if (null != srcStation.getCorUsed().getSagAziCor()) {
                        assertEquals(srcStation.getCorUsed().getSagAziCor().getValue(), destStation.getCorUsed().getSagAziCor().getValue());
                        assertEquals(srcStation.getCorUsed().getSagAziCor().getUom(), destStation.getCorUsed().getSagAziCor().getUom());
                    }
                    if (null != srcStation.getCorUsed().getStnMagDeclUsed()) {
                        assertEquals(srcStation.getCorUsed().getStnMagDeclUsed().getValue(), destStation.getCorUsed().getStnMagDeclUsed().getValue());
                        assertEquals(srcStation.getCorUsed().getStnMagDeclUsed().getUom(), destStation.getCorUsed().getStnMagDeclUsed().getUom());
                    }
                    if (null != srcStation.getCorUsed().getDirSensorOffset()) {
                        assertEquals(srcStation.getCorUsed().getDirSensorOffset().getValue(), destStation.getCorUsed().getDirSensorOffset().getValue());
                        assertEquals(srcStation.getCorUsed().getDirSensorOffset().getUom(), destStation.getCorUsed().getDirSensorOffset().getUom());
                    }
                }
                if (null != srcStation.getValid()) {
                    if (null != srcStation.getValid().getMagTotalFieldCalc()) {
                        assertEquals(srcStation.getValid().getMagTotalFieldCalc().getValue(), destStation.getValid().getMagTotalFieldCalc().getValue());
                        assertEquals(srcStation.getValid().getMagTotalFieldCalc().getUom().value(), destStation.getValid().getMagTotalFieldCalc().getUom());
                    }
                    if (null != srcStation.getValid().getMagDipAngleCalc()) {
                        assertEquals(srcStation.getValid().getMagDipAngleCalc().getValue(), destStation.getValid().getMagDipAngleCalc().getValue());
                        assertEquals(srcStation.getValid().getMagDipAngleCalc().getUom(), destStation.getValid().getMagDipAngleCalc().getUom());
                    }
                    if (null != srcStation.getValid().getGravTotalFieldCalc()) {
                        assertEquals(srcStation.getValid().getGravTotalFieldCalc().getValue(), destStation.getValid().getGravTotalFieldCalc().getValue());
                        assertEquals(srcStation.getValid().getGravTotalFieldCalc().getUom().value(), destStation.getValid().getGravTotalFieldCalc().getUom().value());
                    }
                }
                if (null != srcStation.getMatrixCov()) {
                    if (null != srcStation.getMatrixCov().getVarianceNN()) {
                        assertEquals(srcStation.getMatrixCov().getVarianceNN().getValue(), destStation.getMatrixCov().getVarianceNN().getValue());
                        assertEquals(srcStation.getMatrixCov().getVarianceNN().getUom().value(), destStation.getMatrixCov().getVarianceNN().getUom().value());
                    }
                    if (null != srcStation.getMatrixCov().getVarianceNE()) {
                        assertEquals(srcStation.getMatrixCov().getVarianceNE().getValue(), destStation.getMatrixCov().getVarianceNE().getValue());
                        assertEquals(srcStation.getMatrixCov().getVarianceNE().getUom().value(), destStation.getMatrixCov().getVarianceNE().getUom().value());
                    }
                    if (null != srcStation.getMatrixCov().getVarianceNVert()) {
                        assertEquals(srcStation.getMatrixCov().getVarianceNVert().getValue(), destStation.getMatrixCov().getVarianceNVert().getValue());
                        assertEquals(srcStation.getMatrixCov().getVarianceNVert().getUom().value(), destStation.getMatrixCov().getVarianceNVert().getUom().value());
                    }
                    if (null != srcStation.getMatrixCov().getVarianceEE()) {
                        assertEquals(srcStation.getMatrixCov().getVarianceEE().getValue(), destStation.getMatrixCov().getVarianceEE().getValue());
                        assertEquals(srcStation.getMatrixCov().getVarianceEE().getUom().value(), destStation.getMatrixCov().getVarianceEE().getUom().value());
                    }
                    if (null != srcStation.getMatrixCov().getVarianceEVert()) {
                        assertEquals(srcStation.getMatrixCov().getVarianceEVert().getValue(), destStation.getMatrixCov().getVarianceEVert().getValue());
                        assertEquals(srcStation.getMatrixCov().getVarianceEVert().getUom().value(), destStation.getMatrixCov().getVarianceEVert().getUom().value());
                    }
                    if (null != srcStation.getMatrixCov().getVarianceVertVert()) {
                        assertEquals(srcStation.getMatrixCov().getVarianceVertVert().getValue(), destStation.getMatrixCov().getVarianceVertVert().getValue());
                        assertEquals(srcStation.getMatrixCov().getVarianceVertVert().getUom().value(), destStation.getMatrixCov().getVarianceVertVert().getUom().value());
                    }
                    if (null != srcStation.getMatrixCov().getBiasN()) {
                        assertEquals(srcStation.getMatrixCov().getBiasN().getValue(), destStation.getMatrixCov().getBiasN().getValue());
                        assertEquals(srcStation.getMatrixCov().getBiasN().getUom(), destStation.getMatrixCov().getBiasN().getUom());
                    }
                    if (null != srcStation.getMatrixCov().getBiasE()) {
                        assertEquals(srcStation.getMatrixCov().getBiasE().getValue(), destStation.getMatrixCov().getBiasE().getValue());
                        assertEquals(srcStation.getMatrixCov().getBiasE().getUom(), destStation.getMatrixCov().getBiasE().getUom());
                    }
                    if (null != srcStation.getMatrixCov().getBiasVert()) {
                        assertEquals(srcStation.getMatrixCov().getBiasVert().getValue(), destStation.getMatrixCov().getBiasVert().getValue());
                        assertEquals(srcStation.getMatrixCov().getBiasVert().getUom(), destStation.getMatrixCov().getBiasVert().getUom());
                    }

                }
                if (null != srcStation.getSourceStation()) {
                    assertEquals(srcStation.getSourceStation().getStationReference(), destStation.getSourceStation().getStationReference());
                    if (null != srcStation.getSourceStation().getTrajectoryParent()) {
                        assertEquals(srcStation.getSourceStation().getTrajectoryParent().getValue(), destStation.getSourceStation().getTrajectoryParent());
                    }
                    if (null != srcStation.getSourceStation().getWellboreParent())
                        assertEquals(srcStation.getSourceStation().getWellboreParent().getValue(), destStation.getSourceStation().getWellboreParent());
                }

                // check repeating fields
                if (null != srcStation.getLocation()) {
                    List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsLocation> srcStationLoc = srcStation.getLocation();
                    List<com.hashmapinc.tempus.WitsmlObjects.v20.AbstractWellLocation> destStationLoc = destStation.getLocation();
                    for (int j = 0; j < srcStationLoc.size(); j++) {
                        assertEquals(srcStationLoc.get(j).isOriginal(), destStationLoc.get(j).isOriginal());
                        assertEquals(srcStationLoc.get(j).getDescription(), destStationLoc.get(j).getDescription());
                        assertEquals(srcStationLoc.get(j).getUid(), destStationLoc.get(j).getUid());
                    }
                }
            }
        }
    }
    //=========================================================================
}
