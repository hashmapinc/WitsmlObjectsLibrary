package com.hashmapinc.tempus.WitsmlObjects.Util;

import java.util.ArrayList;
import java.util.List;

public class LogConverter {
    //=========================================================================
    // conversions to 1.3.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog src) {
        return null;
    }

    public static com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v20.Log src) {
        return null;
    }
    //=========================================================================


    //=========================================================================
    // conversions to 1.4.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog convertTo1411(com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog src) {
        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog dest = new com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog();

        // check equality for non complex, non repeating fields
        dest.setNameWell(src.getNameWell());
        dest.setNameWellbore(src.getNameWellbore());
        dest.setName(src.getName());
        dest.setObjectGrowing(src.isObjectGrowing());
        dest.setServiceCompany(src.getServiceCompany());
        dest.setRunNumber(src.getRunNumber());
        dest.setBhaRunNumber(src.getBhaRunNumber());
        dest.setPass(src.getPass());
        dest.setUidWell(src.getUidWell());
        dest.setUidWellbore(src.getUidWellbore());
        dest.setUid(src.getUid());
        dest.setCreationDate(src.getCreationDate());
        dest.setDescription(src.getDescription());
        dest.setNullValue(src.getNullValue());
        dest.setStartDateTimeIndex(src.getStartDateTimeIndex());
        dest.setEndDateTimeIndex(src.getEndDateTimeIndex());

        // check complex fields
        // indexType
        if (null != src.getIndexType())
            dest.setIndexType(com.hashmapinc.tempus.WitsmlObjects.v1411.LogIndexType.fromValue(src.getIndexType().value()));

        // startIndex
        if (null != src.getStartIndex())
            dest.setStartIndex(src.getStartIndex().to1411GenericMeasure());

        // endIndex
        if (null != src.getEndIndex())
            dest.setEndIndex(src.getEndIndex().to1411GenericMeasure());

        // stepIncrement
        if (null != src.getStepIncrement())
            dest.setStepIncrement(src.getStepIncrement().to1411RatioGenericMeasure());

        // direction
        if (null != src.getDirection())
            dest.setDirection(com.hashmapinc.tempus.WitsmlObjects.v1411.LogIndexDirection.fromValue(src.getDirection().value()));

        // indexCurve
        if (null != src.getIndexCurve())
            dest.setIndexCurve(src.getIndexCurve().getValue());

        // logData
        if (null != src.getLogData()) { // TODO: confirm this conversion
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsLogData> destLogData = new ArrayList<>();
            destLogData.add(new com.hashmapinc.tempus.WitsmlObjects.v1411.CsLogData());
            destLogData.get(0).setData(src.getLogData().getData());
            dest.setLogData(destLogData);
        }

        // commonData
        if (null != src.getCommonData())
            dest.setCommonData(src.getCommonData().to1411CommonData());

        // customData
        if (null != src.getCustomData() && null != src.getCustomData().getAny())
            dest.setCustomData(src.getCustomData().to1411CustomData());

        // check repeating fields
        // logParam
        if (null != src.getLogParam()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.IndexedObject> destParams = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v1311.IndexedObject srcParam : src.getLogParam())
                destParams.add(srcParam.to1411IndexedObject());

            dest.setLogParam(destParams);
        }

        // logCurveInfo
        if (null != src.getLogCurveInfo()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsLogCurveInfo> destInfos = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v1311.CsLogCurveInfo srcInfo : src.getLogCurveInfo())
                destInfos.add(srcInfo.to1411CsLogCurveInfo());

            dest.setLogCurveInfo(destInfos);
        }


        return dest;
    }

    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog convertTo1411(com.hashmapinc.tempus.WitsmlObjects.v20.Log src) {
        return null;
    }
    //=========================================================================


    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v20.Log convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog src) {
        return null;
    }

    public static com.hashmapinc.tempus.WitsmlObjects.v20.Log convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog src) {
        return null;
    }
    //=========================================================================
}
