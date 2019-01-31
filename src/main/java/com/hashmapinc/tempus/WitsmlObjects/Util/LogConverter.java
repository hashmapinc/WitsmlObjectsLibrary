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
            for (int i = 0; i < src.getLogParam().size(); i++) {
                assertEquals(src.getLogParam().get(i).getDescription(), dest.getLogParam().get(i).getDescription());
                assertEquals(src.getLogParam().get(i).getValue(), dest.getLogParam().get(i).getValue());
                assertEquals(src.getLogParam().get(i).getIndex(), dest.getLogParam().get(i).getIndex());
                assertEquals(src.getLogParam().get(i).getName(), dest.getLogParam().get(i).getName());
                assertEquals(src.getLogParam().get(i).getUom(), dest.getLogParam().get(i).getUom());
            }
        }

        // logParam
        if (null != src.getLogCurveInfo()) {
            for (int i = 0; i < src.getLogCurveInfo().size(); i++) {
                com.hashmapinc.tempus.WitsmlObjects.v1311.CsLogCurveInfo srcInfo = src.getLogCurveInfo().get(i);
                com.hashmapinc.tempus.WitsmlObjects.v1411.CsLogCurveInfo destInfo = dest.getLogCurveInfo().get(i);

                // simple fields
                assertEquals(srcInfo.getClassWitsml(), destInfo.getClassWitsml());
                assertEquals(srcInfo.getUnit(), destInfo.getUnit());
                assertEquals(srcInfo.getNullValue(), destInfo.getNullValue());
                assertEquals(srcInfo.isAlternateIndex(), destInfo.isAlternateIndex());
                assertEquals(srcInfo.getMinDateTimeIndex(), destInfo.getMinDateTimeIndex());
                assertEquals(srcInfo.getMaxDateTimeIndex(), destInfo.getMaxDateTimeIndex());
                assertEquals(srcInfo.getCurveDescription(), destInfo.getCurveDescription());
                assertEquals(srcInfo.getDataSource(), destInfo.getDataSource());
                assertEquals(srcInfo.getUid(), destInfo.getUid());

                // complex fields
                // mnemonic
                if (null != srcInfo.getMnemonic())
                    assertEquals(srcInfo.getMnemonic(), destInfo.getMnemonic().getValue());

                // mnemAlias
                if (null != srcInfo.getMnemAlias())
                    assertEquals(srcInfo.getMnemAlias(), destInfo.getMnemAlias().getValue());
                // wellDatum
                if (null != srcInfo.getWellDatum()) {
                    assertEquals(srcInfo.getWellDatum().getValue(), destInfo.getWellDatum().getValue());
                    assertEquals(srcInfo.getWellDatum().getUidRef(), destInfo.getWellDatum().getUidRef());
                }

                // minIndex
                if (null != srcInfo.getMinIndex()) {
                    assertEquals(srcInfo.getMinIndex().getValue(), destInfo.getMinIndex().getValue());
                    assertEquals(srcInfo.getMinIndex().getUom(), destInfo.getMinIndex().getUom());
                }

                // maxIndex
                if (null != srcInfo.getMaxIndex()) {
                    assertEquals(srcInfo.getMaxIndex().getValue(), destInfo.getMaxIndex().getValue());
                    assertEquals(srcInfo.getMaxIndex().getUom(), destInfo.getMaxIndex().getUom());
                }

                // sensorOffset
                if (null != srcInfo.getSensorOffset()) {
                    assertEquals(srcInfo.getSensorOffset().getValue(), destInfo.getSensorOffset().getValue());
                    assertEquals(srcInfo.getSensorOffset().getUom(), destInfo.getSensorOffset().getUom());
                }

                // densData
                if (null != srcInfo.getDensData()) {
                    assertEquals(srcInfo.getDensData().getValue(), destInfo.getDensData().getValue());
                    assertEquals(srcInfo.getDensData().getUom(), destInfo.getDensData().getUom());
                }

                // traceState
                if (null != srcInfo.getTraceState())
                    assertEquals(srcInfo.getTraceState().value(), destInfo.getTraceState().value());

                // traceOrigin
                if (null != srcInfo.getTraceOrigin())
                    assertEquals(srcInfo.getTraceOrigin().value(), destInfo.getTraceOrigin().value());

                // typeLogData
                if (null != srcInfo.getTypeLogData())
                    assertEquals(srcInfo.getTypeLogData().value(), destInfo.getTypeLogData().value());

                // repeating fields
                if (null != srcInfo.getAxisDefinition()) {
                    for (int j = 0; j < srcInfo.getAxisDefinition().size(); j++) {
                        com.hashmapinc.tempus.WitsmlObjects.v1311.CsAxisDefinition srcDef = srcInfo.getAxisDefinition().get(j);
                        com.hashmapinc.tempus.WitsmlObjects.v1411.CsAxisDefinition destDef = destInfo.getAxisDefinition().get(j);

                        // simple fields
                        assertEquals(srcDef.getOrder(), destDef.getOrder());
                        assertEquals(srcDef.getCount(), destDef.getCount());
                        assertEquals(srcDef.getName(), destDef.getName());
                        assertEquals(srcDef.getPropertyType(), destDef.getPropertyType());
                        assertEquals(srcDef.getUom(), destDef.getUom());
                        assertEquals(srcDef.getUid(), destDef.getUid());
                        assertEquals(srcDef.getDoubleValues(), destDef.getDoubleValues());
                        assertEquals(srcDef.getStringValues(), destDef.getStringValues());
                    }
                }
            }
        }
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
