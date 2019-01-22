package com.hashmapinc.tempus.WitsmlObjects.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * This class converts well singular
 * objects between 1.3.1.1 and 1.4.1.1 objects.
 *
 * NOTE: fields are mapped with best effort conversions. Where
 * direct mapping is not possible, null values are provided.
 * It is up to the user of this library to use field setters on converted objects to
 * create valid WITSML objects.
 */
public class WellConverter {
    public static com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell src) {
        return null;
    }


    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell convertTo1411(com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell src) {
        // create destination well
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell dest = new com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell();

        // assign non complex, non repeating fields
        dest.setName(src.getName());
        dest.setNameLegal(src.getNameLegal());
        dest.setNumLicense(src.getNumLicense());
        dest.setNumGovt(src.getNumGovt());
        dest.setDTimLicense(src.getDTimLicense());
        dest.setField(src.getField());
        dest.setCountry(src.getCountry());
        dest.setState(src.getState());
        dest.setCounty(src.getCounty());
        dest.setRegion(src.getRegion());
        dest.setDistrict(src.getDistrict());
        dest.setBlock(src.getBlock());
        dest.setTimeZone(src.getTimeZone());
        dest.setOperator(src.getOperator());
        dest.setOperatorDiv(src.getOperatorDiv());
        dest.setNumAPI(src.getNumAPI());
        dest.setDTimSpud(src.getDTimSpud());
        dest.setDTimPa(src.getDTimPa());


        // assign complex fields
        if (null != src.getPcInterest()) {
            com.hashmapinc.tempus.WitsmlObjects.v1411.DimensionlessMeasure pcInterest = new com.hashmapinc.tempus.WitsmlObjects.v1411.DimensionlessMeasure();
            pcInterest.setUom(src.getPcInterest().getUom());
            pcInterest.setValue(src.getPcInterest().getValue());
            dest.setPcInterest(pcInterest);
        }

        if (null != src.getStatusWell())
            dest.setStatusWell(com.hashmapinc.tempus.WitsmlObjects.v1411.WellStatus.fromValue(src.getStatusWell().value()));

        if (null != src.getPurposeWell())
            dest.setPurposeWell(com.hashmapinc.tempus.WitsmlObjects.v1411.WellPurpose.fromValue(src.getPurposeWell().value()));

        if (null != src.getFluidWell())
            dest.setFluidWell(com.hashmapinc.tempus.WitsmlObjects.v1411.WellFluid.fromValue(src.getFluidWell().value()));

        if (null != src.getDirectionWell())
            dest.setDirectionWell(com.hashmapinc.tempus.WitsmlObjects.v1411.WellDirection.fromValue(src.getDirectionWell().value()));

        if (null != src.getWellheadElevation())
            dest.setWellheadElevation(src.getWellheadElevation().to1411WellElevationCoord());

        if (null != src.getGroundElevation())
            dest.setGroundElevation(src.getGroundElevation().to1411WellElevationCoord());

        if (null != src.getWaterDepth())
            dest.setWaterDepth(src.getWaterDepth().to1411LengthMeasure());

        if (null != src.getCommonData())
            dest.setCommonData(src.getCommonData().to1411CommonData());


        // assign repeating fields
        // well datum
        if (null != src.getWellDatum()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsWellDatum> srcWellDatumList = src.getWellDatum();
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellDatum> destWellDatumList = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v1311.CsWellDatum srcWellDatum: srcWellDatumList)
                destWellDatumList.add(srcWellDatum.to1411CsWellDatum());

            dest.setWellDatum(destWellDatumList);
        }

        // wellLocation
        if (null != src.getWellLocation()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsLocation> srcWellLocList = src.getWellLocation();
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsLocation> destWellLocList = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v1311.CsLocation srcWellLoc: srcWellLocList)
                destWellLocList.add(srcWellLoc.to1411CsLocation());

            dest.setWellLocation(destWellLocList);
        }

        // referencePoint
        if (null != src.getReferencePoint()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsReferencePoint> srcRefPointList = src.getReferencePoint();
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsReferencePoint> destRefPointList = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v1311.CsReferencePoint srcRefPoint: srcRefPointList)
                destRefPointList.add(srcRefPoint.to1411CsReferencePoint());

            dest.setReferencePoint(destRefPointList);
        }

        // wellCRS
        if (null != src.getWellCRS()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsWellCRS> srcWellCRS = src.getWellCRS();
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellCRS> destWellCRS = dest.getWellCRS();
            for (int i = 0; i < srcWellCRS.size(); i++) {
                assertEquals(srcWellCRS.get(i).getName(), destWellCRS.get(i).getName());
                assertEquals(srcWellCRS.get(i).getDescription(), destWellCRS.get(i).getDescription());
                assertEquals(srcWellCRS.get(i).getUid(), destWellCRS.get(i).getUid());

                // mapProjection
                if (null != srcWellCRS.get(i).getMapProjection()) {
                    // nameCRS
                    if (null != srcWellCRS.get(i).getMapProjection().getNameCRS()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getNameCRS().getValue(), destWellCRS.get(i).getMapProjection().getNameCRS().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getNameCRS().getNamingSystem(), destWellCRS.get(i).getMapProjection().getNameCRS().getNamingSystem());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getNameCRS().getCode(), destWellCRS.get(i).getMapProjection().getNameCRS().getCode());
                    }

                    // projectionCode
                    if (null != srcWellCRS.get(i).getMapProjection().getProjectionCode())
                        assertEquals(srcWellCRS.get(i).getMapProjection().getProjectionCode().value(), destWellCRS.get(i).getMapProjection().getProjectionCode().value());

                    // projectedFrom
                    if (null != srcWellCRS.get(i).getMapProjection().getProjectedFrom()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getProjectedFrom().getValue(), destWellCRS.get(i).getMapProjection().getProjectedFrom().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getProjectedFrom().getUidRef(), destWellCRS.get(i).getMapProjection().getProjectedFrom().getUidRef());
                    }

                    // stdParallel1
                    if (null != srcWellCRS.get(i).getMapProjection().getStdParallel1()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getStdParallel1().getValue(), destWellCRS.get(i).getMapProjection().getStdParallel1().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getStdParallel1().getUom(), destWellCRS.get(i).getMapProjection().getStdParallel1().getUom());
                    }

                    // stdParallel2
                    if (null != srcWellCRS.get(i).getMapProjection().getStdParallel2()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getStdParallel2().getValue(), destWellCRS.get(i).getMapProjection().getStdParallel2().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getStdParallel2().getUom(), destWellCRS.get(i).getMapProjection().getStdParallel2().getUom());
                    }

                    // centralMeridian
                    if (null != srcWellCRS.get(i).getMapProjection().getCentralMeridian()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getCentralMeridian().getValue(), destWellCRS.get(i).getMapProjection().getCentralMeridian().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getCentralMeridian().getUom(), destWellCRS.get(i).getMapProjection().getCentralMeridian().getUom());
                    }

                    // originLatitude
                    if (null != srcWellCRS.get(i).getMapProjection().getOriginLatitude()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getOriginLatitude().getValue(), destWellCRS.get(i).getMapProjection().getOriginLatitude().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getOriginLatitude().getUom(), destWellCRS.get(i).getMapProjection().getOriginLatitude().getUom());
                    }

                    // originLongitude
                    if (null != srcWellCRS.get(i).getMapProjection().getOriginLongitude()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getOriginLongitude().getValue(), destWellCRS.get(i).getMapProjection().getOriginLongitude().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getOriginLongitude().getUom(), destWellCRS.get(i).getMapProjection().getOriginLongitude().getUom());
                    }

                    // latitude1
                    if (null != srcWellCRS.get(i).getMapProjection().getLatitude1()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitude1().getValue(), destWellCRS.get(i).getMapProjection().getLatitude1().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitude1().getUom(), destWellCRS.get(i).getMapProjection().getLatitude1().getUom());
                    }

                    // longitude1
                    if (null != srcWellCRS.get(i).getMapProjection().getLongitude1()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitude1().getValue(), destWellCRS.get(i).getMapProjection().getLongitude1().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitude1().getUom(), destWellCRS.get(i).getMapProjection().getLongitude1().getUom());
                    }

                    // latitude2
                    if (null != srcWellCRS.get(i).getMapProjection().getLatitude2()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitude2().getValue(), destWellCRS.get(i).getMapProjection().getLatitude2().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitude2().getUom(), destWellCRS.get(i).getMapProjection().getLatitude2().getUom());
                    }

                    // longitude2
                    if (null != srcWellCRS.get(i).getMapProjection().getLongitude2()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitude2().getValue(), destWellCRS.get(i).getMapProjection().getLongitude2().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitude2().getUom(), destWellCRS.get(i).getMapProjection().getLongitude2().getUom());
                    }

                    // latitudeForScale
                    if (null != srcWellCRS.get(i).getMapProjection().getLatitudeForScale()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitudeForScale().getValue(), destWellCRS.get(i).getMapProjection().getLatitudeForScale().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitudeForScale().getUom(), destWellCRS.get(i).getMapProjection().getLatitudeForScale().getUom());
                    }

                    // longitudeForScale
                    if (null != srcWellCRS.get(i).getMapProjection().getLongitudeForScale()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitudeForScale().getValue(), destWellCRS.get(i).getMapProjection().getLongitudeForScale().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitudeForScale().getUom(), destWellCRS.get(i).getMapProjection().getLongitudeForScale().getUom());
                    }

                    // trueScaleLatitude
                    if (null != srcWellCRS.get(i).getMapProjection().getTrueScaleLatitude()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getTrueScaleLatitude().getValue(), destWellCRS.get(i).getMapProjection().getTrueScaleLatitude().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getTrueScaleLatitude().getUom(), destWellCRS.get(i).getMapProjection().getTrueScaleLatitude().getUom());
                    }

                    // spheroidRadius
                    if (null != srcWellCRS.get(i).getMapProjection().getSpheroidRadius()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getSpheroidRadius().getValue(), destWellCRS.get(i).getMapProjection().getSpheroidRadius().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getSpheroidRadius().getUom(), destWellCRS.get(i).getMapProjection().getSpheroidRadius().getUom());
                    }

                    assertEquals(srcWellCRS.get(i).getMapProjection().getScaleFactor(), destWellCRS.get(i).getMapProjection().getScaleFactor());

                    // methodVariant
                    if (null != srcWellCRS.get(i).getMapProjection().getMethodVariant())
                        assertEquals(srcWellCRS.get(i).getMapProjection().getMethodVariant().value(), destWellCRS.get(i).getMapProjection().getMethodVariant().value());

                    // perspectiveHeight
                    if (null != srcWellCRS.get(i).getMapProjection().getPerspectiveHeight()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getPerspectiveHeight().getValue(), destWellCRS.get(i).getMapProjection().getPerspectiveHeight().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getPerspectiveHeight().getUom(), destWellCRS.get(i).getMapProjection().getPerspectiveHeight().getUom());
                    }

                    assertEquals(srcWellCRS.get(i).getMapProjection().getZone(), destWellCRS.get(i).getMapProjection().getZone());

                    // nadType
                    if (null != srcWellCRS.get(i).getMapProjection().getNADType())
                        assertEquals(srcWellCRS.get(i).getMapProjection().getNADType().value(), destWellCRS.get(i).getMapProjection().getNADType().value());

                    // falseEasting
                    if (null != srcWellCRS.get(i).getMapProjection().getFalseEasting()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getFalseEasting().getValue(), destWellCRS.get(i).getMapProjection().getFalseEasting().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getFalseEasting().getUom(), destWellCRS.get(i).getMapProjection().getFalseEasting().getUom());
                    }

                    // falseNorthing
                    if (null != srcWellCRS.get(i).getMapProjection().getFalseNorthing()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getFalseNorthing().getValue(), destWellCRS.get(i).getMapProjection().getFalseNorthing().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getFalseNorthing().getUom(), destWellCRS.get(i).getMapProjection().getFalseNorthing().getUom());
                    }

                    // bearing
                    if (null != srcWellCRS.get(i).getMapProjection().getBearing()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getBearing().getValue(), destWellCRS.get(i).getMapProjection().getBearing().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getBearing().getUom(), destWellCRS.get(i).getMapProjection().getBearing().getUom());
                    }

                    // hemisphere
                    if (null != srcWellCRS.get(i).getMapProjection().getHemisphere())
                        assertEquals(srcWellCRS.get(i).getMapProjection().getHemisphere().value(), destWellCRS.get(i).getMapProjection().getHemisphere().value());

                    assertEquals(srcWellCRS.get(i).getMapProjection().getDescription(), destWellCRS.get(i).getMapProjection().getDescription());

                    // parameter
                    if (null != srcWellCRS.get(i).getMapProjection().getParameter()) {
                        List<com.hashmapinc.tempus.WitsmlObjects.v1311.IndexedObject> srcWellCRSParam = srcWellCRS.get(i).getMapProjection().getParameter();
                        List<com.hashmapinc.tempus.WitsmlObjects.v1411.IndexedObject> destWellCRSParam = destWellCRS.get(i).getMapProjection().getParameter();
                        for (int j = 0; j < srcWellCRSParam.size(); j++) {
                            assertEquals(srcWellCRSParam.get(j).getValue(), destWellCRSParam.get(j).getValue());
                            assertEquals(srcWellCRSParam.get(j).getIndex(), destWellCRSParam.get(j).getIndex());
                            assertEquals(srcWellCRSParam.get(j).getName(), destWellCRSParam.get(j).getName());
                            assertEquals(srcWellCRSParam.get(j).getUom(), destWellCRSParam.get(j).getUom());
                            assertEquals(srcWellCRSParam.get(j).getDescription(), destWellCRSParam.get(j).getDescription());
                        }
                    }
                }

                // geographic
                if (null != srcWellCRS.get(i).getGeographic()) {
                    // nameCRS
                    if (null != srcWellCRS.get(i).getGeographic().getNameCRS()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getNameCRS().getValue(), destWellCRS.get(i).getGeographic().getNameCRS().getValue());
                        assertEquals(srcWellCRS.get(i).getGeographic().getNameCRS().getNamingSystem(), destWellCRS.get(i).getGeographic().getNameCRS().getNamingSystem());
                        assertEquals(srcWellCRS.get(i).getGeographic().getNameCRS().getCode(), destWellCRS.get(i).getGeographic().getNameCRS().getCode());
                    }

                    // geodeticDatumCode
                    if (null != srcWellCRS.get(i).getGeographic().getGeodeticDatumCode())
                        assertEquals(srcWellCRS.get(i).getGeographic().getGeodeticDatumCode().value(), destWellCRS.get(i).getGeographic().getGeodeticDatumCode().value());

                    // xTranslation
                    if (null != srcWellCRS.get(i).getGeographic().getXTranslation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getXTranslation().getUom(), destWellCRS.get(i).getGeographic().getXTranslation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getXTranslation().getValue(), destWellCRS.get(i).getGeographic().getXTranslation().getValue());
                    }

                    // yTranslation
                    if (null != srcWellCRS.get(i).getGeographic().getYTranslation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getYTranslation().getUom(), destWellCRS.get(i).getGeographic().getYTranslation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getYTranslation().getValue(), destWellCRS.get(i).getGeographic().getYTranslation().getValue());
                    }

                    // zTranslation
                    if (null != srcWellCRS.get(i).getGeographic().getZTranslation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getZTranslation().getUom(), destWellCRS.get(i).getGeographic().getZTranslation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getZTranslation().getValue(), destWellCRS.get(i).getGeographic().getZTranslation().getValue());
                    }

                    // xRotation
                    if (null != srcWellCRS.get(i).getGeographic().getXRotation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getXRotation().getUom(), destWellCRS.get(i).getGeographic().getXRotation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getXRotation().getValue(), destWellCRS.get(i).getGeographic().getXRotation().getValue());
                    }

                    // yRotation
                    if (null != srcWellCRS.get(i).getGeographic().getYRotation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getYRotation().getUom(), destWellCRS.get(i).getGeographic().getYRotation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getYRotation().getValue(), destWellCRS.get(i).getGeographic().getYRotation().getValue());
                    }

                    // zRotation
                    if (null != srcWellCRS.get(i).getGeographic().getZRotation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getZRotation().getUom(), destWellCRS.get(i).getGeographic().getZRotation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getZRotation().getValue(), destWellCRS.get(i).getGeographic().getZRotation().getValue());
                    }

                    assertEquals(srcWellCRS.get(i).getGeographic().getScaleFactor(), destWellCRS.get(i).getGeographic().getScaleFactor());

                    // ellipsoidCode
                    if (null != srcWellCRS.get(i).getGeographic().getEllipsoidCode())
                        assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidCode().value(), destWellCRS.get(i).getGeographic().getEllipsoidCode().value());

                    // ellipsoidSemiMajorAxis
                    if (null != srcWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getUom(), destWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getValue(), destWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getValue());
                    }

                    assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidInverseFlattening(), destWellCRS.get(i).getGeographic().getEllipsoidInverseFlattening());
                }

                // localCRS
                if (null != srcWellCRS.get(i).getLocalCRS()) {
                    assertEquals(srcWellCRS.get(i).getLocalCRS().isUsesWellAsOrigin(), destWellCRS.get(i).getLocalCRS().isUsesWellAsOrigin());

                    // origin
                    if (null != srcWellCRS.get(i).getLocalCRS().getOrigin()) {
                        assertEquals(srcWellCRS.get(i).getLocalCRS().getOrigin().getUidRef(), destWellCRS.get(i).getLocalCRS().getOrigin().getUidRef());
                        assertEquals(srcWellCRS.get(i).getLocalCRS().getOrigin().getValue(), destWellCRS.get(i).getLocalCRS().getOrigin().getValue());
                    }

                    assertEquals(srcWellCRS.get(i).getLocalCRS().getOriginDescription(), destWellCRS.get(i).getLocalCRS().getOriginDescription());

                    // yAxisAzimuth
                    if (null != srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth()) {
                        assertEquals(srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getUom(), destWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getUom());

                        // northDirection
                        if (null != srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getNorthDirection())
                            assertEquals(srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getNorthDirection().value(), destWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getNorthDirection().value());
                    }

                    assertEquals(srcWellCRS.get(i).getLocalCRS().getYAxisDescription(), destWellCRS.get(i).getLocalCRS().getYAxisDescription());
                    assertEquals(srcWellCRS.get(i).getLocalCRS().isXRotationCounterClockwise(), destWellCRS.get(i).getLocalCRS().isXRotationCounterClockwise());
                }
            }
        }
    }
}
