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
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellCRS> destWellCRSList = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v1311.CsWellCRS srcWellCRS: src.getWellCRS())
                destWellCRSList.add(srcWellCRS.to1411CsWellCRS());

            dest.setWellCRS(destWellCRSList);
        }

        return dest;
    }
}
